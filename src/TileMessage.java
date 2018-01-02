


/* EntityNode_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TileMessage extends EntityNode {
	public static IncomingPacket aClass192_5952 = new IncomingPacket(74, 11);
	public static IncomingPacket SEND_CONFIG_2 = new IncomingPacket(39, 6);
	public static IncomingPacket aClass192_5956 = new IncomingPacket(132, -2);
	public static IncomingPacket aClass192_5958 = new IncomingPacket(15, 0);
	public static int anInt5949;

	public static void method935(int i) {
		aClass192_5952 = null;
		if (i == -7576) {
			aClass192_5958 = null;
			SEND_CONFIG_2 = null;
			aClass192_5956 = null;
		}
	}

	public static final long method936(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte b) {
		anInt5949++;
		Class141.aCalendar1754.clear();
		Class141.aCalendar1754.set(i_1_, i, i_3_, i_4_, i_2_, i_0_);
		if (b <= 71)
			return -52L;
		return Class141.aCalendar1754.getTime().getTime();
	}

	protected int anInt5951;
	protected int completeCycle;
	protected int height;
	protected String message;
	protected int plane;

	protected int x;

	protected int y;
}
