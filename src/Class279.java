


/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class279 {
	public static int anInt3550;
	public static int anInt3551;
	public static int anInt3552;
	public static int anInt3554;
	public static int anInt3557;
	public static int anInt3558;
	public static int anInt3559;
	public static int anInt3561;
	public static int anInt3563;
	public static Node_Sub21 aNode_Sub21_3555 = new Node_Sub21(0, 0);

	public static final void method3371(byte b, int i, int i_1_, int i_2_, int i_3_) {
		anInt3558++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 10, i_1_);
		cachenode_sub2.method2288(0);
		cachenode_sub2.itemAmount = i_2_;
		if (b == -4) {
			cachenode_sub2.itemId = i_3_;
			cachenode_sub2.anInt9429 = i;
		}
	}

	public static void method3372(int i) {
		aNode_Sub21_3555 = null;
		if (i != 5)
			aNode_Sub21_3555 = null;
	}

	protected boolean aBoolean3556;
	private Index aClass302_3549;
	protected Index aClass302_3564;
	protected Class353 aClass353_3553;
	private Class61 aClass61_3560 = new Class61(64);
	protected Class61 aClass61_3565 = new Class61(50);
	protected Class61 aClass61_3566 = new Class61(5);
	private int anInt3562;

	protected int anInt3567;

	private String[] aStringArray3568;

	Class279(Class353 class353, int i, boolean bool, Index class302, Index class302_4_) {
		aClass302_3564 = class302_4_;
		aClass302_3549 = class302;
		aBoolean3556 = bool;
		anInt3562 = i;
		aClass353_3553 = class353;
		if (aClass302_3549 != null) {
			int i_5_ = -1 + aClass302_3549.method3526(-20871);
			aClass302_3549.method3537(-2, i_5_);
		}
		if (Node_Sub38_Sub34.aClass353_10443 != aClass353_3553)
			aStringArray3568 = new String[] { null, null, null, null, null, null };
		else
			aStringArray3568 = new String[] { null, null, null, null, null, GlobalMessage.aClass22_385.getMessage(anInt3562) };
	}

	public final NPCDefinition getNPCDefinitions(int i) {
		anInt3554++;
		NPCDefinition npcdefinition;
		synchronized (aClass61_3560) {
			npcdefinition = (NPCDefinition) aClass61_3560.method607(i, 0);
		}
		if (npcdefinition != null)
			return npcdefinition;
		byte[] bs;
		synchronized (aClass302_3549) {
			bs = aClass302_3549.method3524(false, Node_Sub47.method2952(false, i), Class379.method4164(i, (byte) 104));
		}
		npcdefinition = new NPCDefinition();
		npcdefinition.aClass279_2861 = this;
		npcdefinition.id = i;
		npcdefinition.options = aStringArray3568.clone();
		if (bs != null)
			npcdefinition.method3000((byte) 61, new BufferedStream(bs));
		npcdefinition.method2997((byte) -110);
		synchronized (aClass61_3560) {
			aClass61_3560.method601(npcdefinition, 107 ^ 0x63b5, i);
		}
		return npcdefinition;
	}

	public final void method3369(int i, int i_0_) {
		synchronized (aClass61_3560) {
			aClass61_3560.method598(i, -11819);
		}
		anInt3559++;
		synchronized (aClass61_3565) {
			if (i_0_ != -759)
				method3370((byte) 81);
			aClass61_3565.method598(i, -11819);
		}
		synchronized (aClass61_3566) {
			aClass61_3566.method598(i, -11819);
		}
	}

	public final void method3370(byte b) {
		synchronized (aClass61_3560) {
			aClass61_3560.method608(false);
		}
		anInt3551++;
		synchronized (aClass61_3565) {
			aClass61_3565.method608(false);
		}
		synchronized (aClass61_3566) {
			if (b != -40)
				method3369(0, 92);
			aClass61_3566.method608(false);
		}
	}

	public final void method3373(byte b) {
		synchronized (aClass61_3560) {
			aClass61_3560.method602((byte) -125);
		}
		anInt3563++;
		synchronized (aClass61_3565) {
			aClass61_3565.method602((byte) -117);
		}
		synchronized (aClass61_3566) {
			aClass61_3566.method602((byte) -119);
		}
		if (b != -52)
			method3369(40, -113);
	}

	public final void method3374(byte b, boolean bool) {
		anInt3557++;
		if (bool != aBoolean3556) {
			aBoolean3556 = bool;
			if (b != -50)
				aClass302_3549 = null;
			method3370((byte) -40);
		}
	}

	public final void method3375(byte b) {
		synchronized (aClass61_3565) {
			aClass61_3565.method608(false);
		}
		anInt3561++;
		synchronized (aClass61_3566) {
			aClass61_3566.method608(false);
		}
		if (b < 8)
			method3371((byte) -33, -14, -40, -58, -77);
	}

	public final void method3377(boolean bool, int i) {
		anInt3567 = i;
		anInt3552++;
		synchronized (aClass61_3565) {
			aClass61_3565.method608(bool);
		}
		synchronized (aClass61_3566) {
			aClass61_3566.method608(false);
		}
	}
}
