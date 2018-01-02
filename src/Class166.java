


/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class166 implements Interface7 {
	public static IncomingPacket aClass192_5098 = new IncomingPacket(112, 6);
	public static Class61 aClass61_5097 = new Class61(50);
	public static int anInt5094;
	public static int anInt5095;
	public static int anInt5096;
	public static int anInt5100;
	public static int myPlayerIndex = -1;

	public static void method1745(int i) {
		if (i != -1)
			aClass192_5098 = null;
		aClass192_5098 = null;
		aClass61_5097 = null;
	}

	public static final void method1746(int i, int i_0_) {
		anInt5094++;
		Class61.aNode_Sub9_Sub1_885 = null;
		MouseHandler.aClass302_6049 = null;
		Class107.anInt1362 = i;
		Class266.aBoolean3385 = false;
		Class17.anInt282 = 0;
		AbstractFont.anInt800 = 1;
		CacheNode_Sub6.anInt9485 = i_0_;
		Class101.anInt1306 = -1;
	}

	public static final void method1747(byte b, IComponentDefinitions widget) {
		anInt5095++;
		if (Class87.removeWalkHere) {
			if (widget.anObjectArray4751 != null) {
				IComponentDefinitions widget_1_ = Node_Sub3.method2169(b + -48, Class46.anInt681,
						Node_Sub15_Sub9.anInt9839);
				if (widget_1_ != null) {
					Node_Sub37 node_sub37 = new Node_Sub37();
					node_sub37.parameters = widget.anObjectArray4751;
					node_sub37.aWidget7437 = widget;
					node_sub37.aWidget7432 = widget_1_;
					ClientScriptsExecutor.method3556(node_sub37);
				}
			}
			Node_Sub28.anInt7321++;
			Node_Sub13 node_sub13 = PacketDecoder.sendOutgoingOPCode(-386, Class270.aClass318_3474,
					Class218.aClass123_2566.isaacCipher);
			node_sub13.packet.writeIntV1(widget.ihash);
			node_sub13.packet.writeShort128(Class92.anInt1230);
			node_sub13.packet.writeShortLE128(Class46.anInt681);
			node_sub13.packet.writeIntV2(Node_Sub15_Sub9.anInt9839);
			node_sub13.packet.writeShort128(widget.anInt4718);
			node_sub13.packet.writeShortLE(widget.anInt4687);
			if (b != -53)
				method1745(-43);
			Class218.aClass123_2566.sendPacket(126, node_sub13);
		}
	}

	protected int anInt5093;

	Class166(int i) {
		anInt5093 = i;
	}

	@Override
	public final Class170 method20(int i) {
		anInt5096++;
		if (i <= 81)
			myPlayerIndex = 24;
		return Class356.aClass170_4425;
	}
}
