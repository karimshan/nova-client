


/* Node_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub14 extends Node {
	public static int anInt7117;
	public static int anInt7119 = -1;
	public static int anInt7122;
	public static int anInt7123;
	public static int anInt7124;

	public static final String method2550(CacheNode_Sub4 cachenode_sub4, byte b) {
		if (b != 62)
			anInt7119 = 96;
		anInt7124++;
		return cachenode_sub4.aString9458 + " <col=ffffff>>";
	}

	public static final int method2551(CacheNode_Sub4 cachenode_sub4, int i) {
		if (i != -1)
			anInt7119 = -77;
		anInt7117++;
		String string = method2550(cachenode_sub4, (byte) 62);
		return Class262_Sub15_Sub1.aClass357_10524.method4031(107, Class105.aGLSpriteArray5194, string);
	}

	public static final EntityNode_Sub1 method2552(int i) {
		anInt7123++;
		if (i > -7)
			return null;
		EntityNode_Sub1 entitynode_sub1 = (EntityNode_Sub1) Class336_Sub2.aClass103_8562.method1106(65);
		if (entitynode_sub1 != null) {
			MiniMapDots.anInt121--;
			return entitynode_sub1;
		}
		return new EntityNode_Sub1();
	}

	public static final void method2553(String string, int i, String string_0_, int i_1_) {
		Class320_Sub23.aClass123_8432 = Class218.aClass123_2566;
		anInt7122++;
		Class159.loginType = i_1_;
		Node_Sub38_Sub23.anInt10347 = i;
		Class129.method1556(false, string_0_, true, false, string);
	}

	protected boolean aBoolean7127 = false;
	protected int anInt7118;
	protected int anInt7120;

	protected int anInt7121;

	protected int anInt7125;

	protected int anInt7126;

	protected int anInt7128 = -1;

	Node_Sub14(int i) {
		anInt7128 = i;
	}
}
