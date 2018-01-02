


/* Node_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub21 extends Node {

	public static Class243 aClass243_7185 = new Class243();
	public static Class96 aClass96_7183 = null;
	public static int anInt7182;
	public static int anInt7186;
	public static int baseY;

	public static void method2617(int i) {
		aClass243_7185 = null;
		@SuppressWarnings("unused")
		int i_0_ = 75 % ((i - -6) / 55);
		aClass96_7183 = null;
	}

	public static final void method2618(boolean bool, int i) {
		anInt7182++;
		if (Node_Sub10.aString7081.length() != 0) {
			DeveloperConsole.printConsoleMessage((byte) 43, "--> " + Node_Sub10.aString7081);
			Commands.method1538(120, false, bool, Node_Sub10.aString7081);
			Class332.anInt4145 = i;
			if (!bool) {
				Class315.anInt4034 = 0;
				Node_Sub10.aString7081 = "";
			}
		}
	}

	protected int anInt7181;

	protected int anInt7187;

	Node_Sub21(int i, int i_1_) {
		anInt7187 = i;
		anInt7181 = i_1_;
	}
}
