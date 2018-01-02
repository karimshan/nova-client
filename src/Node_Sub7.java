



/* Node_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub7 extends Node {

	public static int anInt7061;
	public static int anInt7062;
	public static int anInt7063;

	public static final void method2421(byte b) {
		anInt7061++;
		for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1723(
				13); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1721(0))
			if (cachenode_sub4.anInt9462 > 1) {
				cachenode_sub4.anInt9462 = 0;
				Class200_Sub2.aClass61_4941.method601(cachenode_sub4, b ^ 0x63bc,
						((CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035).aLong9564);
				cachenode_sub4.aClass158_9457.method1722(true);
			}
		Class315.menuOptionCount = 0;
		Class21.anInt355 = 0;
		if (b != 98)
			anInt7063 = 47;
		Class368.aClass312_4549.method3614(-601);
		Class261.aHashTable3306.method1517(false);
		Class184.aClass158_2189.method1722(true);
		ConnectionDecoder.method114((byte) 118, Class277.aCacheNode_Sub13_3509);
	}

	volatile int anInt7060 = -1;

	volatile String aString7064;

	Node_Sub7(String string) {
		aString7064 = string;
	}
}
