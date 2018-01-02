


/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class103 {
	public static int anInt1336;
	public static int anInt1337;
	public static int anInt1338;
	public static int anInt1339;
	public static int anInt1340;
	public static int anInt1342;
	public static int anInt1343;
	public static int anInt1344;
	public static int anInt1345;

	public static final void method1109(boolean bool, int i) {
		Class327.anInt5360 = i;
		Class150_Sub3.anInt8963 = -1;
		anInt1340++;
		if (bool != false)
			method1109(true, -44);
		Class150_Sub3.anInt8963 = -1;
		Class207.method2039(81);
	}

	private EntityNode anEntityNode1335 = new EntityNode();

	private EntityNode anEntityNode1341;

	public Class103() {
		anEntityNode1335.anEntityNode1124 = anEntityNode1335;
		anEntityNode1335.anEntityNode1126 = anEntityNode1335;
	}

	public final boolean method1105(int i) {
		if (i > -89)
			method1108(57);
		anInt1344++;
		if (anEntityNode1335 != anEntityNode1335.anEntityNode1126)
			return false;
		return true;
	}

	public final EntityNode method1106(int i) {
		anInt1345++;
		if (i <= 26)
			anEntityNode1341 = null;
		EntityNode entitynode = anEntityNode1335.anEntityNode1126;
		if (entitynode == anEntityNode1335)
			return null;
		entitynode.method803(false);
		return entitynode;
	}

	public final int method1107(int i) {
		anInt1337++;
		int i_0_ = 0;
		EntityNode entitynode = anEntityNode1335.anEntityNode1126;
		if (i != -1)
			return -128;
		for (/**/; anEntityNode1335 != entitynode; entitynode = entitynode.anEntityNode1126)
			i_0_++;
		return i_0_;
	}

	public final EntityNode method1108(int i) {
		anInt1338++;
		EntityNode entitynode = anEntityNode1341;
		if (anEntityNode1335 == entitynode) {
			anEntityNode1341 = null;
			return null;
		}
		anEntityNode1341 = entitynode.anEntityNode1126;
		if (i <= 56)
			anEntityNode1341 = null;
		return entitynode;
	}

	public final void method1110(boolean bool, EntityNode entitynode) {
		if (entitynode.anEntityNode1124 != null)
			entitynode.method803(bool);
		anInt1342++;
		entitynode.anEntityNode1124 = anEntityNode1335.anEntityNode1124;
		entitynode.anEntityNode1126 = anEntityNode1335;
		entitynode.anEntityNode1124.anEntityNode1126 = entitynode;
		entitynode.anEntityNode1126.anEntityNode1124 = entitynode;
		if (bool != false)
			anEntityNode1341 = null;
	}

	public final EntityNode method1111(int i) {
		anInt1339++;
		EntityNode entitynode = anEntityNode1335.anEntityNode1124;
		if (entitynode == anEntityNode1335) {
			anEntityNode1341 = null;
			return null;
		}
		anEntityNode1341 = entitynode.anEntityNode1124;
		return entitynode;
	}

	public final void method1112(byte b) {
		if (b > -112)
			anEntityNode1341 = null;
		for (;;) {
			EntityNode entitynode = anEntityNode1335.anEntityNode1126;
			if (entitynode == anEntityNode1335)
				break;
			entitynode.method803(false);
		}
		anInt1336++;
		anEntityNode1341 = null;
	}

	public final EntityNode method1113(byte b) {
		anInt1343++;
		EntityNode entitynode = anEntityNode1335.anEntityNode1126;
		if (entitynode == anEntityNode1335) {
			anEntityNode1341 = null;
			return null;
		}
		anEntityNode1341 = entitynode.anEntityNode1126;
		return entitynode;
	}
}
