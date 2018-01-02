


/* xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class xa implements Interface20, Interface3 {
	protected long nativeid = 0L;

	xa(int i, int i_1_) {
		r(i, i_1_);
	}

	@Override
	protected final void finalize() {
		if (nativeid != 0L)
			Class164.method1739(0, this);
	}

	private final native void r(int i, int i_0_);

	private final native void va(long l, boolean bool);

	@Override
	public final void w(boolean bool) {
		va(nativeid, bool);
	}
}
