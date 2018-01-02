


/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class108 implements Interface12 {
	public static int anInt5282;
	public static int anInt5283 = 0;
	public static int anInt5284;
	private Index aClass302_5285;

	Class108(Index class302) {
		aClass302_5285 = class302;
	}

	@Override
	public final Class172 method34(byte b) {
		anInt5284++;
		@SuppressWarnings("unused")
		int i = 8 % ((b - 15) / 48);
		return Class172.aClass172_2077;
	}

	@Override
	public final int method35(int i) {
		anInt5282++;
		if (aClass302_5285.method3520((byte) 15))
			return 100;
		if (i >= -4)
			method35(-87);
		return aClass302_5285.method3511(19492);
	}
}
