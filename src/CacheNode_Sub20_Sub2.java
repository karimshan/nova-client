



/* CacheNode_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class CacheNode_Sub20_Sub2 extends CacheNode_Sub20 {
	private SoftReference<Object> aSoftReference11094;

	CacheNode_Sub20_Sub2(Object object, int i) {
		super(i);
		aSoftReference11094 = new SoftReference<Object>(object);
	}

	@Override
	public final Object method2409(byte b) {
		if (b >= -39)
			aSoftReference11094 = null;
		return aSoftReference11094.get();
	}

	@Override
	public final boolean method2411(int i) {
		if (i >= -77)
			method2411(-47);
		return true;
	}
}
