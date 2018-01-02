


/* CacheNode_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub15 extends CacheNode {
	public static OutgoingPacket aClass318_9590 = new OutgoingPacket(43, 3);
	public static long aLong9588 = (long) (Math.random() * 9.999999999E9);
	public static int anInt9585;
	public static int anInt9587;
	public static int anInt9589;
	public static int anInt9592;
	public static int anInt9593;
	public static int anInt9594;
	public static int[] anIntArray9586 = { 32, 39, 44, 47 };

	public static final boolean method2379(int i, int i_7_) {
		anInt9593++;
		if (Class169_Sub1.aBooleanArray8788[i_7_])
			return true;
		if (!Node_Sub38_Sub31.aClass302_10422.method3536(-1, i_7_))
			return false;
		int i_8_ = Node_Sub38_Sub31.aClass302_10422.method3537(i + -7017, i_7_);
		if (i_8_ == 0) {
			Class169_Sub1.aBooleanArray8788[i_7_] = true;
			return true;
		}
		if (i != 7015)
			return true;
		if (Class134_Sub3.widgetsList[i_7_] == null)
			Class134_Sub3.widgetsList[i_7_] = new IComponentDefinitions[i_8_];
		for (int i_9_ = 0; i_8_ > i_9_; i_9_++)
			if (Class134_Sub3.widgetsList[i_7_][i_9_] == null) {
				byte[] bs = Node_Sub38_Sub31.aClass302_10422.method3524(false, i_9_, i_7_);
				if (bs != null) {
					IComponentDefinitions widget = Class134_Sub3.widgetsList[i_7_][i_9_] = new IComponentDefinitions();
					widget.ihash = i_9_ + (i_7_ << 16);
					if (bs[0] != -1) {
						//System.out.println("bs[0] is not -1 in CacheNode_Sub15");
						//throw new IllegalStateException("if1");
					}
					if (i_7_ != 744 || i_9_ != 23) {
						try { // INTERFACE DECODING DONE HERE
							widget.decode(new BufferedStream(bs));
							if(widget.getInterfaceId() > 1200)
								System.out.println("Decoding a new widget here: "+widget.getInterfaceId()+" - "+widget.getButtonId());
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		Class169_Sub1.aBooleanArray8788[i_7_] = true;
		return true;
	}

	public static void method2380(boolean bool) {
		aClass318_9590 = null;
		anIntArray9586 = null;
		if (bool != false)
			method2379(95, 36);
	}

	private byte[][] aByteArrayArray9596;

	protected Class222[] aClass222Array9595;

	private int anInt9591;

	CacheNode_Sub15(int i) {
		anInt9591 = i;
	}

	public final boolean method2378(int i) {
		anInt9587++;
		if (aClass222Array9595 != null)
			return true;
		if (aByteArrayArray9596 == null)
			synchronized (Node_Sub15_Sub11.aClass302_9859) {
				if (!Node_Sub15_Sub11.aClass302_9859.method3536(-1, anInt9591))
					return false;
				int[] is = Node_Sub15_Sub11.aClass302_9859.method3532(anInt9591, i ^ ~0x1a2);
				aByteArrayArray9596 = new byte[is.length][];
				for (int i_0_ = 0; is.length > i_0_; i_0_++)
					aByteArrayArray9596[i_0_] = Node_Sub15_Sub11.aClass302_9859.method3524(false, is[i_0_], anInt9591);
			}
		boolean bool = true;
		for (byte[] bs : aByteArrayArray9596) {
			BufferedStream buffer = new BufferedStream(bs);
			buffer.offset = 1;
			int i_2_ = buffer.readUnsignedShort();
			synchronized (Class145.aClass302_1799) {
				bool &= Class145.aClass302_1799.method3510(i_2_, (byte) 63);
			}
		}
		if (!bool)
			return false;
		Class312 class312 = new Class312();
		int[] is;
		synchronized (Node_Sub15_Sub11.aClass302_9859) {
			int i_3_ = Node_Sub15_Sub11.aClass302_9859.method3537(-2, anInt9591);
			aClass222Array9595 = new Class222[i_3_];
			if (i != -419)
				method2381((byte) 47, -27);
			is = Node_Sub15_Sub11.aClass302_9859.method3532(anInt9591, 0);
		}
		for (int i_4_ = 0; is.length > i_4_; i_4_++) {
			byte[] bs = aByteArrayArray9596[i_4_];
			BufferedStream buffer = new BufferedStream(bs);
			buffer.offset = 1;
			int i_5_ = buffer.readUnsignedShort();
			Node_Sub40 node_sub40 = null;
			for (Node_Sub40 node_sub40_6_ = (Node_Sub40) class312.method3613(
					i + 65699); node_sub40_6_ != null; node_sub40_6_ = (Node_Sub40) class312.method3620(16776960))
				if (node_sub40_6_.anInt7506 == i_5_) {
					node_sub40 = node_sub40_6_;
					break;
				}
			if (node_sub40 == null) {
				synchronized (Class145.aClass302_1799) {
					node_sub40 = new Node_Sub40(i_5_, Class145.aClass302_1799.method3518((byte) -126, i_5_));
				}
				class312.method3625((byte) -54, node_sub40);
			}
			aClass222Array9595[is[i_4_]] = new Class222(bs, node_sub40);
		}
		aByteArrayArray9596 = null;
		return true;
	}

	public final boolean method2381(byte b, int i) {
		anInt9594++;
		if (b <= 61)
			method2379(-47, 72);
		return aClass222Array9595[i].aBoolean2640;
	}

	public final boolean method2382(int i, int i_10_) {
		anInt9585++;
		if (i != 32)
			return true;
		return aClass222Array9595[i_10_].aBoolean2646;
	}

	public final boolean method2383(int i, int i_11_) {
		if (i_11_ <= 75)
			return true;
		anInt9592++;
		return aClass222Array9595[i].aBoolean2637;
	}
}
