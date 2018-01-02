


/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3 implements Interface10 {
	public static Class212 aClass212_5159;
	public static int anInt5157;
	public static int anInt5158;
	public static int anInt5160;
	public static int anInt5161 = -1;
	public static int anInt5162;
	public static SeekableFile aSeekableFile5156;
	static {
		aClass212_5159 = new Class212("", 15);
	}

	public static void method169(int i) {
		aSeekableFile5156 = null;
		aClass212_5159 = null;
		if (i != -19320)
			method169(74);
	}

	private Class116 aClass116_5163;

	Class3(Class116 class116) {
		aClass116_5163 = class116;
	}

	@Override
	public final boolean method25(int i) {
		anInt5157++;
		if (i != 421)
			anInt5161 = 41;
		return true;
	}

	@Override
	public final void method26(int i) {
		if (i != 99)
			aClass116_5163 = null;
		anInt5158++;
	}

	@Override
	public final void method27(boolean bool, int i) {
		@SuppressWarnings("unused")
		int i_0_ = -77 % ((i - 66) / 42);
		anInt5160++;
		if (bool)
			Class93.graphicsToolkit.aa(0, 0, Class360.screenWidth, Class205.screenHeight, aClass116_5163.anInt5071,
					0);
	}
}
