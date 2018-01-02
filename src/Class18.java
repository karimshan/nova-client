


/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class18 {
	public static IncomingPacket aClass192_304 = new IncomingPacket(52, 6);
	public static Class37 aClass37_306;
	public static HashTable aHashTable308 = new HashTable(32);
	public static int anInt305;
	public static int anInt307;
	public static int anInt309;
	public static short aShort310 = 1;

	public static void method265(byte b) {
		aHashTable308 = null;
		if (b <= 10)
			anInt309 = 27;
		aClass37_306 = null;
		aClass192_304 = null;
	}

	public static final void method266(boolean bool, boolean bool_0_) {
		if (bool) {
			if (Class320_Sub15.WINDOWS_PANE_ID != -1)
				Node_Sub15_Sub6.method2571(Class320_Sub15.WINDOWS_PANE_ID, false);
			for (Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1516(
					false); node_sub2 != null; node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1520(106)) {
				if (!node_sub2.method2161(-122)) {
					node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1516(false);
					if (node_sub2 == null)
						break;
				}
				Class243.method3060((byte) 61, false, true, node_sub2);
			}
			Class320_Sub15.WINDOWS_PANE_ID = -1;
			Class289.aHashTable3630 = new HashTable(8);
			EntityNode_Sub3_Sub2.method946(!bool_0_);
			Class320_Sub15.WINDOWS_PANE_ID = CacheNode_Sub4.aClass1_9466.anInt112;
			Node_Sub29_Sub3.method2717(1, false);
			Class320_Sub21.method3764(-103);
			ClientScriptsExecutor.parseIComponentScript(Class320_Sub15.WINDOWS_PANE_ID);
		}
		anInt307++;
		Class248.aBoolean3146 = bool_0_;
	}
}
