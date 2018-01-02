



/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class Class41 {
	public static int anInt623;
	public static int anInt626;
	public static int anInt627;
	public static int anInt628;
	public static IComponentDefinitions aWidget622;

	public static void method433(int i) {
		aWidget622 = null;
		if (i != 0)
			method437(5, -42, false, (byte) -127);
	}

	public static final void sendGameMessage(int i, String string, int i_0_) {
		if (i == 29459) {
			Class28.method331(string, "", -85, 0, "", "", i_0_);
			anInt623++;
		}
	}

	public static final int method437(int i, int i_1_, boolean bool, byte b) {
		anInt627++;
		Node_Sub16 node_sub16 = ToolTips.method3472(i_1_, (byte) 18, bool);
		if (node_sub16 == null)
			return 0;
		if (i == -1)
			return 0;
		int i_2_ = 0;
		if (b <= 34)
			return 82;
		for (int i_3_ = 0; node_sub16.anIntArray7138.length > i_3_; i_3_++)
			if (i == node_sub16.anIntArray7137[i_3_])
				i_2_ += node_sub16.anIntArray7138[i_3_];
		return i_2_;
	}

	protected int anInt624;

	protected String aString625;

	public Class41() {
		/* empty */
	}

	public final Socket method434(boolean bool) throws IOException {
		anInt628++;
		if (bool != false)
			anInt626 = -36;
		return new Socket(aString625, anInt624);
	}

	abstract Socket method435(int i) throws IOException;
}
