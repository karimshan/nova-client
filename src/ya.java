



/* ya - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ya extends za implements Interface3 {
	
	protected long nativeid;

	ya(oa var_oa, int i) {
		aa(var_oa, i);
	}

	private final native void aa(oa var_oa, int i);

	@Override
	protected final void finalize() {
		if (nativeid != 0L)
			Class164.method1739(0, this);
	}

	public final native void ga();

	public final native void r();

	@Override
	public final native void w(boolean bool);
}
