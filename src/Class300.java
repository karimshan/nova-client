


/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class300 {
	public static IncomingPacket aClass192_3750 = new IncomingPacket(99, -1);
	public static int anInt3759;
	public static int anInt3760;
	public static int anInt3762;
	public static int anInt3765;
	public static int anInt3767;
	public static int anInt3770;
	public static int anInt3772;
	public static int anInt3773;

	public static void method3494(byte b) {
		aClass192_3750 = null;
		if (b <= 102)
			aClass192_3750 = null;
	}

	public static long method3496(long l, long l_0_) {
		return l & l_0_;
	}

	public static final void method3497(byte b, GraphicsToolkit graphicstoolkit) {
		anInt3772++;
		Node_Sub5_Sub2.aClass49Array9413 = new Class49[KeyStrokes.anIntArray3665.length];
		if (b == 107)
			for (int i = 0; (i ^ 0xffffffff) > (KeyStrokes.anIntArray3665.length ^ 0xffffffff); i++) {
				int i_1_ = KeyStrokes.anIntArray3665[i];
				Class357 class357 = Class129.method1553(-1, i_1_, Class188_Sub1.aClass302_6849);
				AbstractFont class52 = graphicstoolkit.a(class357, Class383.method4199(Class294.aClass302_3690, i_1_), true);
				Node_Sub5_Sub2.aClass49Array9413[i] = new Class49(class52, class357);
			}
	}

	public static final Class234 method3498(int i) {
		anInt3759++;
		try {
			return new Class234_Sub3();
		} catch (Throwable throwable) {
			try {
				return (Class234) Class.forName("Class234_Sub2").newInstance();
			} catch (Throwable throwable_2_) {
				if (i != 4)
					return null;
				return new Class234_Sub1();
			}
		}
	}

	public static final int method3499(int i, byte b) {
		if (b != -6)
			aClass192_3750 = null;
		anInt3770++;
		return i & 0xff;
	}

	public static final BufferedStream method3500(int i) {
		anInt3760++;
		BufferedStream buffer = new BufferedStream(518);
		Class121.isaacKeys = new int[4];
		Class121.isaacKeys[2] = (int) (Math.random() * 9.9999999E7);
		Class121.isaacKeys[0] = (int) (Math.random() * 9.9999999E7);
		Class121.isaacKeys[i] = (int) (Math.random() * 9.9999999E7);
		Class121.isaacKeys[1] = (int) (Math.random() * 9.9999999E7);
		buffer.writeByte(10);
		buffer.writeInt(Class121.isaacKeys[0]);
		buffer.writeInt(Class121.isaacKeys[1]);
		buffer.writeInt(Class121.isaacKeys[2]);
		buffer.writeInt(Class121.isaacKeys[3]);
		return buffer;
	}

	public static final void method3501(int i) {
		anInt3762++;
		Class252.aClass61_3190.method602((byte) -120);
		Class166.aClass61_5097.method602((byte) -122);
		Class243.aClass61_3065.method602((byte) -121);
		if (i != 99999999)
			method3498(78);
		NPCDefinition.aClass61_2805.method602((byte) -123);
	}

	protected byte aByte3768;
	protected Class300 aClass300_3763;
	protected int anInt3751;
	protected int anInt3752;
	protected int anInt3753;
	protected int anInt3754;
	private int anInt3755;
	protected int anInt3756;

	protected int anInt3757;

	protected int anInt3758;

	protected int anInt3761;

	protected int anInt3764;

	protected int anInt3766;

	protected int anInt3769;

	protected int anInt3771;

	Class300(int i, int i_5_, int i_6_, int i_7_, byte b) {
		aByte3768 = b;
		anInt3764 = i_5_;
		anInt3757 = i_6_;
		anInt3754 = i_7_;
		anInt3755 = i;
	}

	public final Class355 method3495(int i) {
		if (i != 99999999)
			method3502(false, -4, 3, 47);
		anInt3773++;
		return NPCDefinition.method3008((byte) -111, anInt3755);
	}

	public final Class300 method3502(boolean bool, int i, int i_3_, int i_4_) {
		if (bool != false)
			method3501(17);
		anInt3765++;
		return new Class300(anInt3755, i, i_3_, i_4_, aByte3768);
	}
}
