



import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;

abstract class Class51 implements Interface15 {
	public static boolean aBoolean5331;
	public static ClanChat aClanChat5345;
	public static Index aClass302_5339;
	public static float aFloat5343;
	public static int anInt5325;
	public static int anInt5327;
	public static int anInt5328;
	public static int anInt5330;
	public static int anInt5333;
	public static int anInt5334;
	public static int anInt5336;
	public static int anInt5338;
	public static int anInt5342;
	public static int anInt5346;
	public static IncomingPacket INCOMMING_PACKET_69 = new IncomingPacket(69, -2);

	public static void method514(int i) {
		if (i != 2)
			aClass302_5339 = null;
		INCOMMING_PACKET_69 = null;
		aClass302_5339 = null;
		aClanChat5345 = null;
	}

	private boolean aBoolean5337;
	protected GLXToolkit aGLXToolkit5332;
	private NativeHeapBuffer aNativeHeapBuffer5344;
	private int anInt5324 = -1;
	private int anInt5326;
	private int anInt5329;
	private int anInt5340 = 0;

	private int anInt5341;

	Class51(GLXToolkit glxtoolkit, int i, boolean bool) {
		aBoolean5337 = bool;
		anInt5326 = i;
		aGLXToolkit5332 = glxtoolkit;
	}

	@Override
	protected final void finalize() throws Throwable {
		method38(false);
		anInt5325++;
		super.finalize();
	}

	void method38(boolean bool) {
		anInt5342++;
		if (bool == false)
			if ((anInt5324 ^ 0xffffffff) < -1) {
				aGLXToolkit5332.method1402((byte) -98, anInt5324, anInt5329);
				anInt5324 = -1;
			}
	}

	public final long method515(byte b) {
		anInt5328++;
		if (b != 50)
			return -22L;
		if ((anInt5324 ^ 0xffffffff) == -1)
			return aNativeHeapBuffer5344.getAddress();
		return 0L;
	}

	public final boolean method516(int i, Source source, boolean bool) {
		anInt5338++;
		if ((i ^ 0xffffffff) < (anInt5341 ^ 0xffffffff)) {
			method520(76);
			if ((anInt5324 ^ 0xffffffff) < -1) {
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
				OpenGL.glBufferDataARBa(anInt5326, i, source.getAddress(), aBoolean5337 ? 35040 : 35044);
				aGLXToolkit5332.anInt6260 += i + -anInt5329;
			} else
				throw new RuntimeException("ARGH!");
			anInt5341 = i;
		} else {
			if (anInt5324 <= 0)
				throw new RuntimeException("ARGH!");
			OpenGL.glBindBufferARB(anInt5326, anInt5324);
			OpenGL.glBufferSubDataARBa(anInt5326, 0, anInt5329, source.getAddress());
			aGLXToolkit5332.anInt6260 += -anInt5329 + i;
		}
		anInt5329 = i;
		if (bool != true)
			return true;
		return true;
	}

	public final boolean method517(int i, MapBuffer mapbuffer) {
		if (i != 0)
			method57((byte) 55);
		anInt5334++;
		boolean bool = true;
		if ((anInt5340 ^ 0xffffffff) != -1) {
			if ((anInt5324 ^ 0xffffffff) < -1) {
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
				if (anInt5340 == 1)
					OpenGL.glBufferSubDataARBa(anInt5326, 0, anInt5341,
							aGLXToolkit5332.aNativeHeapBuffer6171.getAddress());
				else
					bool = mapbuffer.b();
			}
			anInt5340 = 0;
		}
		return bool;
	}

	public final void method518(int i) {
		if (i < 18)
			anInt5341 = 98;
		anInt5346++;
		if (aGLXToolkit5332.aBoolean9316)
			OpenGL.glBindBufferARB(anInt5326, anInt5324);
	}

	public final Buffer method519(boolean bool, MapBuffer mapbuffer, int i) {
		anInt5333++;
		if (i != -5934)
			method518(74);
		if (anInt5340 == 0) {
			method520(i ^ ~0x1755);
			if (anInt5324 <= 0) {
				anInt5340 = 2;
				return aNativeHeapBuffer5344;
			}
			OpenGL.glBindBufferARB(anInt5326, anInt5324);
			if (bool) {
				OpenGL.glBufferDataARBub(anInt5326, anInt5341, null, 0, !aBoolean5337 ? 35044 : 35040);
				if (aGLXToolkit5332.aNativeHeapBuffer6171.b >= anInt5329) {
					anInt5340 = 1;
					return aGLXToolkit5332.aNativeHeapBuffer6171;
				}
			}
			if (!mapbuffer.a() && mapbuffer.a(anInt5326, anInt5329, 35001)) {
				anInt5340 = 2;
				return mapbuffer;
			}
		}
		return null;
	}

	private final void method520(int i) {
		anInt5336++;
		if ((anInt5324 ^ 0xffffffff) > -1) {
			if (aGLXToolkit5332.aBoolean9316) {
				OpenGL.glGenBuffersARB(1, Class307.anIntArray3896, 0);
				anInt5324 = Class307.anIntArray3896[0];
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
			} else
				anInt5324 = 0;
			if (i <= 1)
				anInt5324 = 39;
		}
	}

	void method56(int i, int i_0_) {
		if (i != -1696)
			aGLXToolkit5332 = null;
		anInt5327++;
		if ((i_0_ ^ 0xffffffff) < (anInt5341 ^ 0xffffffff)) {
			method520(55);
			if (anInt5324 > 0) {
				OpenGL.glBindBufferARB(anInt5326, anInt5324);
				OpenGL.glBufferDataARBub(anInt5326, i_0_, null, 0, aBoolean5337 ? 35040 : 35044);
				aGLXToolkit5332.anInt6260 += i_0_ + -anInt5341;
			} else
				aNativeHeapBuffer5344 = aGLXToolkit5332.method1330(false, -96, i_0_);
			anInt5341 = i_0_;
		}
		anInt5329 = i_0_;
	}

	@Override
	public int method57(byte b) {
		if (b >= -56)
			return -121;
		anInt5330++;
		return anInt5329;
	}
}
