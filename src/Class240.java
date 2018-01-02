



/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class240 {
	public static IncomingPacket aClass192_2945;
	public static Class329 aClass329_2943 = new Class329("LIVE", "", "", 0);
	public static int anInt2935;
	public static int anInt2936;
	public static int anInt2939;
	public static int anInt2950;
	public static int[][][] anIntArrayArrayArray2948;
	public static SignLink aSignLink2946;
	public static String[] aStringArray2949 = new String[100];
	static {
		aClass192_2945 = new IncomingPacket(87, -2);
	}

	public static final Class151 method3028(byte b, int i) {
		anInt2950++;
		Class151[] class151s = DeveloperConsole.method2934(-46);
		for (Class151 class151 : class151s)
			if (class151.anInt1844 == i)
				return class151;
		if (b < 4)
			return null;
		return null;
	}

	public static void method3029(int i) {
		aClass192_2945 = null;
		aSignLink2946 = null;
		aStringArray2949 = null;
		aClass329_2943 = null;
		if (i <= -112)
			anIntArrayArrayArray2948 = null;
	}

	public static final String method3030(int i, Throwable throwable) throws IOException {
		anInt2936++;
		if (i != 0)
			method3029(-11);
		String string;
		if (!(throwable instanceof RuntimeException_Sub1))
			string = "";
		else {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = runtimeexception_sub1.aString4919 + " | ";
			throwable = runtimeexception_sub1.aThrowable4921;
		}
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_1_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_1_));
		String string_2_ = bufferedreader.readLine();
		for (;;) {
			String string_3_ = bufferedreader.readLine();
			if (string_3_ == null)
				break;
			int i_4_ = string_3_.indexOf('(');
			int i_5_ = string_3_.indexOf(')', 1 + i_4_);
			String string_6_;
			if (i_4_ != -1)
				string_6_ = string_3_.substring(0, i_4_);
			else
				string_6_ = string_3_;
			string_6_ = string_6_.trim();
			string_6_ = string_6_.substring(string_6_.lastIndexOf(' ') - -1);
			string_6_ = string_6_.substring(string_6_.lastIndexOf('\t') + 1);
			string += string_6_;
			if ((i_4_ ^ 0xffffffff) != 0 && i_5_ != -1) {
				int i_7_ = string_3_.indexOf(".java:", i_4_);
				if ((i_7_ ^ 0xffffffff) <= -1)
					string += string_3_.substring(5 + i_7_, i_5_);
			}
			string += ' ';
		}
		string += "| " + string_2_;
		return string;
	}

	public static final void method3031(int i, int i_8_, int i_9_, boolean bool, int i_10_, int i_11_, int i_12_, int i_13_) {
		anInt2935++;
		int i_14_ = i_12_ + i_13_;
		if (bool == false) {
			int i_15_ = -i_12_ + i;
			for (int i_16_ = i_13_; (i_14_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
				Class369.method4086(i_8_, i_9_, i_11_, Class169_Sub4.anIntArrayArray8826[i_16_], 0);
			int i_17_ = i_11_ + i_12_;
			int i_18_ = i_8_ + -i_12_;
			for (int i_19_ = i; i_15_ < i_19_; i_19_--)
				Class369.method4086(i_8_, i_9_, i_11_, Class169_Sub4.anIntArrayArray8826[i_19_], 0);
			for (int i_20_ = i_14_; i_15_ >= i_20_; i_20_++) {
				int[] is = Class169_Sub4.anIntArrayArray8826[i_20_];
				Class369.method4086(i_17_, i_9_, i_11_, is, 0);
				Class369.method4086(i_18_, i_10_, i_17_, is, 0);
				Class369.method4086(i_8_, i_9_, i_18_, is, 0);
			}
		}
	}

	protected byte[] aByteArray2942;
	protected byte[] aByteArray2944;
	protected int anInt2933;
	protected int anInt2934;

	protected int anInt2937;

	protected int anInt2938;

	protected int anInt2940;

	protected int anInt2941;

	protected int anInt2947;
}
