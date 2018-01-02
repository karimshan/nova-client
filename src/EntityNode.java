


/* EntityNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class EntityNode {
	public static boolean aBoolean1128 = true;
	public static int anInt1125;
	public static int anInt1127;

	public static final void method802(int i) {
		anInt1125++;
		if (Class240.aSignLink2946.aBoolean4005 && (Class262_Sub23.aClass197_7884.id ^ 0xffffffff) != 0)
			Class188_Sub1_Sub2.method1899(Class262_Sub23.aClass197_7884.id, (byte) 27,
					Class262_Sub23.aClass197_7884.ipadress);
		if (i != 2126)
			method802(-121);
	}

	protected EntityNode anEntityNode1124;

	protected EntityNode anEntityNode1126;

	public EntityNode() {
		/* empty */
	}

	public final void method803(boolean bool) {
		anInt1127++;
		if (anEntityNode1124 != null && bool == false) {
			anEntityNode1124.anEntityNode1126 = anEntityNode1126;
			anEntityNode1126.anEntityNode1124 = anEntityNode1124;
			anEntityNode1126 = null;
			anEntityNode1124 = null;
		}
	}
}
