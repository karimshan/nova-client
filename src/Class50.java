


/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class50 {
	public static Class151 aClass151_781 = new Class151(13, 0, 1, 0);
	public static IncomingPacket aClass192_778 = new IncomingPacket(97, -1);
	public static Class211[] aClass211Array782;
	public static OutgoingPacket aClass318_780 = new OutgoingPacket(35, 7);
	public static int anInt772;
	public static int anInt774 = 0;
	public static int anInt775;
	public static int anInt776;
	public static int anInt779;
	public static int basePlane;

	public static void method510(int i) {
		if (i != 0)
			method511(-117, 43, 59, -14, -17);
		aClass318_780 = null;
		aClass211Array782 = null;
		aClass151_781 = null;
		aClass192_778 = null;
	}

	public static final void method511(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if ((i ^ 0xffffffff) <= (i_0_ ^ 0xffffffff))
			for (int i_4_ = i_0_; i > i_4_; i_4_++)
				Class169_Sub4.anIntArrayArray8826[i_4_][i_2_] = i_1_;
		else
			for (int i_5_ = i; (i_5_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_5_++)
				Class169_Sub4.anIntArrayArray8826[i_5_][i_2_] = i_1_;
		anInt779++;
		if (i_3_ != 1)
			method513(null, (byte) 94);
	}

	public static final void drawToolTipBox(int width, int height, String string, GraphicsToolkit graphicstoolkit, 
			int y, int x, int headerOffsetY, int headerOffsetX) {
		if (Class247.aGLSprite3141 == null || aa.aGLSprite102 == null)
			if (!Node_Sub38_Sub39.aClass302_10500.method3510(Class40.anInt620, (byte) 63)
					|| !Node_Sub38_Sub39.aClass302_10500.method3510(Class150.anInt5085, (byte) 63))
				graphicstoolkit.aa(x, y, width, headerOffsetY,
						AnimableAnimator.anInt5501 | -Node_Sub36_Sub3.anInt10056 + 255 << 24, 1);
			else {
				Class247.aGLSprite3141 = graphicstoolkit
						.a(Class383.method4194(Node_Sub38_Sub39.aClass302_10500, Class40.anInt620, 0), true);
				Class383 class383 = Class383.method4194(Node_Sub38_Sub39.aClass302_10500, Class150.anInt5085, 0);
				aa.aGLSprite102 = graphicstoolkit.a(class383, true);
				class383.method4200();
				Class339_Sub7.aGLSprite8718 = graphicstoolkit.a(class383, true);
			}
		anInt775++;
		if (Class247.aGLSprite3141 != null && aa.aGLSprite102 != null) {
			int i_10_ = (-(aa.aGLSprite102.method1193() * 2) + width) / Class247.aGLSprite3141.method1193();
			for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++)
				Class247.aGLSprite3141.method1196(
						x - -aa.aGLSprite102.method1193() - -(i_11_ * Class247.aGLSprite3141.method1193()), y);
			aa.aGLSprite102.method1196(x, y);
			Class339_Sub7.aGLSprite8718.method1196(-Class339_Sub7.aGLSprite8718.method1193() + width + x, y);
		}
		Class262_Sub4.abstractFont.method538(x + headerOffsetX, 14 + y, string, -1, -39 ^ ~0x27,
					~0xffffff | Class320_Sub26.anInt8451);
			graphicstoolkit.aa(x, y - -headerOffsetY, width, -headerOffsetY + height,
					-Node_Sub36_Sub3.anInt10056 + 255 << 24 | AnimableAnimator.anInt5501, 1);
	}

	public static final void method513(String string, byte b) {
		anInt772++;
		if (b > -14)
			aClass211Array782 = null;
		Node_Sub10.aString7081 = string;
		Class315.anInt4034 = Node_Sub10.aString7081.length();
	}

	private GLToolkit aGLToolkit777;

	protected int anInt773;

	Class50(GLToolkit gltoolkit, int i, int i_12_) {
		aGLToolkit777 = gltoolkit;
		anInt773 = i_12_;
	}

	@Override
	protected final void finalize() throws Throwable {
		aGLToolkit777.method1450((byte) -33, anInt773);
		anInt776++;
		super.finalize();
	}
}
