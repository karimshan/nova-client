



import jaclib.memory.heap.NativeHeap;

public class za_Sub2 extends za {
	
	public static OutgoingPacket aClass318_10512 = new OutgoingPacket(84, 6);
	public static int anInt10509;
	public static int anInt10511;
	public static int anInt10513 = 100;
	public static int anInt10514 = 0;

	public static final boolean method2994(int i, byte b, int i_0_) {
		anInt10509++;
		if (!(Class234.method2150(i_0_, 256, i) | (0x40000 & i) != 0) && !Node_Sub41.method2932(-100, i, i_0_))
			return false;
		return true;
	}

	public static void method2996(int i) {
		aClass318_10512 = null;
	}

	protected NativeHeap aNativeHeap10510;

	za_Sub2(int i) {
		aNativeHeap10510 = new NativeHeap(i);
	}

	public final void method2995(byte b) {
		anInt10511++;
		if (b > -43)
			anInt10513 = 35;
		aNativeHeap10510.b();
	}
}
