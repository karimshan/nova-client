


/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class340 implements Runnable {
	public static int anInt4207;
	public static int anInt4208;
	public static int anInt4209;
	public static int anInt4210;
	public static int anInt4211;
	public static int anInt4212;
	public static int anInt4213;
	public static int anInt4215;
	public static int anInt4217 = -1;
	public static int anInt4218;
	public static int anInt4219;
	public static int anInt4220;
	public static int anInt4221;
	public static int anInt4224;
	public static int anInt4226;
	private boolean aBoolean4206;
	private volatile boolean aBoolean4214;
	private LoadingBarStage aClass110_4223;
	private long aLong4222;
	private long aLong4225;
	private int anInt4229;
	private int anInt4230;
	private Interface16 anInterface16_4216 = new Class350();
	private Interface16 anInterface16_4228 = null;
	private String aString4227;

	public final LoadingBarStage method3949(boolean bool) {
		if (bool != false)
			method3954(-61, null, null, 84, 34L);
		anInt4208++;
		return aClass110_4223;
	}

	public final long method3950(byte b) {
		if (b < 37)
			anInterface16_4228 = null;
		anInt4211++;
		return aLong4225;
	}

	public final synchronized void method3951(byte b) {
		aBoolean4206 = true;
		anInt4212++;
		if (b != 66)
			method3951((byte) -109);
	}

	public final void method3952(int i) {
		if (i == 100) {
			anInt4224++;
			aBoolean4214 = true;
		}
	}

	public final synchronized void method3953(byte b, Interface16 interface16) {
		anInt4207++;
		anInterface16_4228 = anInterface16_4216;
		anInterface16_4216 = interface16;
		if (b <= -42)
			aLong4222 = Class313.method3650(false);
	}

	public final synchronized void method3954(int i, String string, LoadingBarStage class110, int i_0_, long l) {
		anInt4230 = i;
		aClass110_4223 = class110;
		aLong4225 = l;
		aString4227 = string;
		int i_1_ = -111 / ((i_0_ - -2) / 49);
		anInt4210++;
	}

	public final int method3955(int i) {
		anInt4221++;
		if (aClass110_4223 == null)
			return 0;
		if (i != 7398)
			anInt4229 = -104;
		int i_2_ = aClass110_4223.method1130(-3);
		if (aClass110_4223.aBoolean1393 && (aClass110_4223.anInt1382 ^ 0xffffffff) < (anInt4230 ^ 0xffffffff))
			return 1 + anInt4230;
		if ((i_2_ ^ 0xffffffff) > -1
				|| (i_2_ ^ 0xffffffff) <= (Node_Sub25_Sub4.aClass110Array10006.length + -1 ^ 0xffffffff))
			return 100;
		if ((anInt4230 ^ 0xffffffff) == (aClass110_4223.anInt1383 ^ 0xffffffff))
			return aClass110_4223.anInt1382;
		return aClass110_4223.anInt1383;
	}

	public final synchronized boolean method3956(int i) {
		anInt4226++;
		int i_3_ = -96 % ((-17 - i) / 60);
		return anInterface16_4216.method61(false, aLong4222);
	}

	public final String method3957(byte b) {
		if (b < 23)
			method3949(false);
		anInt4219++;
		return aString4227;
	}

	public final int method3958(byte b) {
		anInt4213++;
		if (b != 84)
			method3959(79);
		return anInt4230;
	}

	public final int method3959(int i) {
		if (i != 255)
			method3952(0);
		anInt4218++;
		return anInt4229;
	}

	@Override
	public final void run() {
		while (!aBoolean4214) {
			long l = Class313.method3650(false);
			synchronized (this) {
				try {
					anInt4229++;
					if (!(anInterface16_4216 instanceof Class350)) {
						long l_4_ = Class313.method3650(false);
						if (Class93.graphicsToolkit != null && anInterface16_4228 != null
								&& anInterface16_4228.method60(66) != 0
								&& (aLong4222 ^ 0xffffffffffffffffL) <= (-(long) anInterface16_4228.method60(36) + l_4_
										^ 0xffffffffffffffffL)) {
							int i = (int) ((-aLong4222 + l_4_) * 255L / anInterface16_4228.method60(124));
							int i_5_ = -i + 255;
							Node_Sub36_Sub1.method2758(-90);
							i_5_ = i_5_ << 24 | 0xffffff;
							i = 0xffffff | i << 24;
							Class93.graphicsToolkit.GA(0);
							GLSprite glsprite = Class93.graphicsToolkit.a(Class360.screenWidth,
									Class205.screenHeight, true);
							Class93.graphicsToolkit.method1245(glsprite, -1);
							anInterface16_4228.method63(true, (byte) -95);
							Class93.graphicsToolkit.v();
							glsprite.method1191(0, 0, 0, i_5_, 1);
							Class93.graphicsToolkit.method1245(glsprite, -1);
							Class93.graphicsToolkit.GA(0);
							anInterface16_4216.method63(true, (byte) -63);
							Class93.graphicsToolkit.v();
							glsprite.method1191(0, 0, 0, i, 1);
						} else {
							if (anInterface16_4228 != null) {
								aBoolean4206 = true;
								anInterface16_4228.method59(6312);
								anInterface16_4228 = null;
							}
							if (aBoolean4206) {
								Node_Sub36_Sub1.method2758(-35);
								if (Class93.graphicsToolkit != null)
									Class93.graphicsToolkit.GA(0);
							}
							anInterface16_4216.method63(
									aBoolean4206
											|| Class93.graphicsToolkit != null && Class93.graphicsToolkit.B(),
									(byte) -123);
						}
						try {
							if (Class93.graphicsToolkit != null && !(anInterface16_4216 instanceof Class350))
								Class93.graphicsToolkit.method1241(19088);
						} catch (Exception_Sub1 exception_sub1) {
							ClanChat.method507(exception_sub1,
									exception_sub1.getMessage() + " (Recovered) " + Class158.aClient1983.sendDebugInformation(10),
									-108);
							GlobalMessage.method300(0, true, true);
						}
					} else
						anInterface16_4216.method63(aBoolean4206, (byte) -113);
					java.awt.Container container;
					if (Node_Sub29.aFrame7344 == null) {
						if (Class96.mainGameApplet != null)
							container = Class96.mainGameApplet;
						else
							container = Class82.aGameStub1123;
					} else
						container = Node_Sub29.aFrame7344;
					container.getSize();
					container.getSize();
					if (container == Node_Sub29.aFrame7344)
						Node_Sub29.aFrame7344.getInsets();
					aBoolean4206 = false;
					if (Class93.graphicsToolkit != null && !(anInterface16_4216 instanceof Class350)
							&& aClass110_4223.method1130(-3) < LoadingBarStage.aClass110_1409.method1130(-3))
						NPC.method880((byte) 11);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_6_ = Class313.method3650(false);
			int i = (int) (20L + (l + -l_6_));
			if ((i ^ 0xffffffff) < -1)
				Class262_Sub22.method3208(i, false);
		}
		anInt4215++;
	}
}
