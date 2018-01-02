


/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class269 {
	public static boolean aBoolean3472 = true;
	public static Class308 aClass308_3469;
	public static OutgoingPacket aClass318_3470 = new OutgoingPacket(65, 11);
	public static HashTable aHashTable3465 = new HashTable(16);
	public static int anInt3467;
	public static int anInt3471;
	public static int anInt3473;

	public static void method3293(int i) {
		aClass308_3469 = null;
		aHashTable3465 = null;
		if (i == 65)
			aClass318_3470 = null;
	}

	private CacheNode aCacheNode3466;

	private Class158 aClass158_3468;

	public Class269() {
		/* empty */
	}

	Class269(Class158 class158) {
		aClass158_3468 = class158;
	}

	public final CacheNode method3294(int i) {
		anInt3471++;
		CacheNode cachenode = aCacheNode3466;
		if (cachenode == aClass158_3468.aCacheNode1984) {
			aCacheNode3466 = null;
			return null;
		}
		if (i != 16)
			aClass318_3470 = null;
		aCacheNode3466 = cachenode.aCacheNode7035;
		return cachenode;
	}

	public final CacheNode method3295(int i) {
		anInt3467++;
		if (i != 16)
			return null;
		CacheNode cachenode = aClass158_3468.aCacheNode1984.aCacheNode7035;
		if (aClass158_3468.aCacheNode1984 == cachenode) {
			aCacheNode3466 = null;
			return null;
		}
		aCacheNode3466 = cachenode.aCacheNode7035;
		return cachenode;
	}
}
