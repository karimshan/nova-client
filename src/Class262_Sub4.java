



/* Class262_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub4 extends Class262 {
	public static OutgoingPacket aClass318_7726;
	public static Class379 aClass379_7731;
	public static AbstractFont abstractFont;
	public static long aLong7727 = -1L;
	public static int anInt7722 = 0;
	public static int anInt7724;
	public static int anInt7725;
	public static int anInt7728;
	public static int anInt7730;
	static {
		aClass318_7726 = new OutgoingPacket(2, 9);
		anInt7730 = -1;
	}

	public static final void method3159(int i, int i_0_) {
		anInt7728++;
		if (Class29.aNode_Sub43_477 != null && ((i_0_ ^ 0xffffffff) <= -1
				&& (i_0_ ^ 0xffffffff) > (Class29.aNode_Sub43_477.anInt7531 ^ 0xffffffff))) {
			Class24 class24 = Class29.aNode_Sub43_477.aClass24Array7533[i_0_];
			if (class24.aByte438 == -1) {
				if (i != 7)
					aClass379_7731 = null;
				IncomingPacketHolder class123 = Class262_Sub23.method3213((byte) -68);
				Node_Sub13 node_sub13 = PacketDecoder.sendOutgoingOPCode(i + -393, Node_Sub39.aClass318_7486,
						class123.isaacCipher);
				node_sub13.packet.writeByte(Commands.method1536(-20826, class24.aString437) + 2);
				node_sub13.packet.writeShort(i_0_);
				node_sub13.packet.writeString(class24.aString437);
				class123.sendPacket(126, node_sub13);
			}
		}
	}

	public static final void method3160(int i, int i_1_, byte b, int i_2_, int i_3_, int i_4_) {
		if (b != -21)
			aClass379_7731 = null;
		anInt7725++;
		if ((i ^ 0xffffffff) == (i_3_ ^ 0xffffffff))
			Class75.method763(i_2_, i_1_, i_4_, -1, i_3_);
		else if (i_4_ + -i_3_ < anInt7722 || i_3_ + i_4_ > za_Sub2.anInt10513 || Class384.anInt4906 > i_2_ - i
				|| (Node_Sub25_Sub1.anInt9936 ^ 0xffffffff) > (i_2_ - -i ^ 0xffffffff))
			Class328.method3825(i_2_, i_3_, i, 68, i_4_, i_1_);
		else
			Class117.method1168(i_2_, i, b + 20, i_3_, i_1_, i_4_);
	}

	public static void method3161(int i) {
		aClass318_7726 = null;
		abstractFont = null;
		aClass379_7731 = null;
		@SuppressWarnings("unused")
		int i_5_ = 98 / ((i - 31) / 62);
	}

	private int anInt7723;

	private int anInt7729;

	Class262_Sub4(BufferedStream buffer) {
		super(buffer);
		anInt7729 = buffer.readUnsignedShort();
		anInt7723 = buffer.readInt();
	}

	@Override
	public final void method3148(int i) {
		Class170.anInt2055 = RSCanvas.anInt69;
		ReferenceTable.anInt302 = Class105.anInt5204;
		anInt7724++;
		Class308.anInt3913 = GLDrawableModel.anInt5703;
		Class1.anInt115 = anInt7729 + Class174.clientCycle;
		if (i > -102)
			method3160(7, 14, (byte) -4, 17, -40, -19);
		BufferedStream.anInt7023 = Animable_Sub4.anInt9153;
		Class60.anInt881 = Class174.clientCycle;
		Animable_Sub4.anInt9153 = 0xff & anInt7723;
		GLDrawableModel.anInt5703 = (0xff3e3b & anInt7723) >>> 16;
		RSCanvas.anInt69 = anInt7723 >>> 24;
		Class105.anInt5204 = (0xff56 & anInt7723) >>> 8;
	}
}
