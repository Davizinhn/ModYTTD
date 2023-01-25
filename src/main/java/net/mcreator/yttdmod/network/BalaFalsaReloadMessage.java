
package net.mcreator.yttdmod.network;

import net.mcreator.yttdmod.YttdModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BalaFalsaReloadMessage {

	int type, pressedms;

	public BalaFalsaReloadMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public BalaFalsaReloadMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(BalaFalsaReloadMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(BalaFalsaReloadMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			BalaFalsaReloadOnKeyPressedProcedure.execute();
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		YttdModMod.addNetworkMessage(BalaFalsaReloadMessage.class, BalaFalsaReloadMessage::buffer, BalaFalsaReloadMessage::new,
				BalaFalsaReloadMessage::handler);
	}

}
