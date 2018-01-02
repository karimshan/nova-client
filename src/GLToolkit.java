



/* GLToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

public class GLToolkit extends GraphicsToolkit {
	public static Class298[] aClass298Array6403;
	public static int anInt6390;
	public static int anInt6391;
	public static int anInt6392;
	public static int anInt6393;
	public static int anInt6394;
	public static int anInt6395;
	public static int anInt6396;
	public static int anInt6397;
	public static int anInt6398;
	public static int anInt6399;
	public static int anInt6400;
	public static int anInt6401;
	public static int anInt6402;
	public static int anInt6404;
	public static int anInt6405;
	public static int anInt6406;
	public static int anInt6407;
	public static int anInt6408;
	public static int anInt6409;
	public static int anInt6410;
	public static int anInt6411;
	public static int anInt6412;
	public static int anInt6413;
	public static int anInt6414;
	public static int anInt6415;
	public static int anInt6416;
	public static int anInt6417;
	public static int anInt6418;
	public static int anInt6419;
	public static int anInt6420;
	public static int anInt6421;
	public static int anInt6422;
	public static int anInt6424;
	public static int anInt6425;
	public static int anInt6426;
	public static int anInt6427;
	public static int anInt6428;
	public static int anInt6429;
	public static int anInt6430;
	public static int anInt6431;
	public static int anInt6432;
	public static int anInt6433;
	public static int anInt6434;
	public static int anInt6435;
	public static int anInt6436;
	public static int anInt6437;
	public static int anInt6438;
	public static int anInt6439;
	public static int anInt6440;
	public static int anInt6441;
	public static int anInt6442;
	public static int anInt6443;
	public static int anInt6444;
	public static int anInt6445;
	public static int anInt6446;
	public static int anInt6447;
	public static int anInt6448;
	public static int anInt6449;
	public static int anInt6450;
	public static int anInt6451;
	public static int anInt6452;
	public static int anInt6453;
	public static int anInt6454;
	public static int anInt6455;
	public static int anInt6456;
	public static int anInt6457;
	public static int anInt6458;
	public static int anInt6459;
	public static int anInt6460;
	public static int anInt6461;
	public static int anInt6462;
	public static int anInt6463;
	public static int anInt6464;
	public static int anInt6465;
	public static int anInt6466;
	public static int anInt6467;
	public static int anInt6468;
	public static int anInt6470;
	public static int anInt6471;
	public static int anInt6472;
	public static int anInt6473;
	public static int anInt6478;
	public static int anInt6479;
	public static int anInt6480;
	public static int anInt6481;
	public static int anInt6482;
	public static int anInt6483;
	public static int anInt6484;
	public static int anInt6485;
	public static int anInt6486;
	public static int anInt6487;
	public static int anInt6488;
	public static int anInt6489;
	public static int anInt6490;
	public static int anInt6491;
	public static int anInt6492;
	public static int anInt6493;
	public static int anInt6494;
	public static int anInt6495;
	public static int anInt6496;
	public static int anInt6497;
	public static int anInt6498;
	public static int anInt6499;
	public static int anInt6500;
	public static int anInt6501;
	public static int anInt6502;
	public static int anInt6503;
	public static int anInt6504;
	public static int anInt6506;
	public static int anInt6507;
	public static int anInt6508;
	public static int anInt6509 = 0;
	public static int anInt6510;
	public static int anInt6511;
	public static int anInt6512;
	public static int anInt6514;
	public static int anInt6515;
	public static int anInt6516;
	public static int anInt6517;
	public static int anInt6518;
	public static int anInt6519;
	public static int anInt6520;
	public static int anInt6521;
	public static int anInt6522;
	public static int anInt6523;
	public static int anInt6524;
	public static int anInt6525;
	public static int anInt6526;
	public static int anInt6527;
	public static int anInt6528;
	public static int anInt6529;
	public static int anInt6530;
	public static int anInt6531;
	public static int anInt6532;
	public static int anInt6533;
	public static int anInt6534;
	public static int anInt6535;
	public static int anInt6536;
	public static int anInt6537;
	public static int anInt6538;
	public static int anInt6539;
	public static int anInt6540;
	public static int anInt6541;
	public static int anInt6542;
	public static int anInt6543;
	public static int anInt6544;
	public static int anInt6545;
	public static int anInt6547;
	public static int anInt6548;
	public static int anInt6549;
	public static int anInt6550;
	public static int anInt6551;
	public static int anInt6552;
	public static int anInt6553;
	public static int anInt6554;
	public static int anInt6555;
	public static int anInt6556;
	public static int anInt6557;
	public static int anInt6559;
	public static int anInt6560;
	public static int anInt6561;
	public static int anInt6562;
	public static int anInt6563;
	public static int anInt6564;
	public static int anInt6565;
	public static int anInt6566;
	public static int anInt6568;
	public static int anInt6569;
	public static int anInt6570;
	public static int anInt6571;
	public static int anInt6572;
	public static int anInt6573;
	public static int anInt6574;
	public static int anInt6575;
	public static int anInt6576;
	public static int anInt6577;
	public static int anInt6578;
	public static int anInt6579;
	public static int anInt6580;
	public static int anInt6581;
	public static int anInt6582;
	public static int anInt6583;
	public static int anInt6584;
	public static int anInt6585;
	public static int anInt6586;
	public static int anInt6587;
	public static int anInt6588;
	public static int anInt6589;
	public static int anInt6590;
	public static int anInt6592;
	public static int anInt6595;
	public static int anInt6596;
	public static int anInt6597;
	public static int anInt6598;
	public static Node_Sub7 aNode_Sub7_6558 = null;

	public static void method1416(byte b) {
		aClass298Array6403 = null;
		if (b >= 0)
			aNode_Sub7_6558 = null;
	}

	public static final String method1437(int i, int i_88_, long l) {
		Node_Sub43.method2941(i + -17572, l);
		if (i != 17578)
			aNode_Sub7_6558 = null;
		anInt6437++;
		int i_89_ = Class141.aCalendar1756.get(5);
		int i_90_ = Class141.aCalendar1756.get(2);
		int i_91_ = Class141.aCalendar1756.get(1);
		if ((i_88_ ^ 0xffffffff) == -4)
			return Class326.method3818(l, (byte) 73, i_88_);
		return Integer.toString(i_89_ / 10) + i_89_ % 10 + "-" + Class13.aStringArrayArray209[i_88_][i_90_] + "-"
				+ i_91_;
	}

	public static final void method1484(int i, Node_Sub4 node_sub4) {
		anInt6391++;
		Class307.aNode_Sub9_Sub1_3902.method2457(i + 197958411, node_sub4, false);
		if (Class230.aClass42_5208 != null)
			Class230.aClass42_5208.method441(11757, Class307.aNode_Sub9_Sub1_3902);
		Player.aNode_Sub4_11155 = null;
		AbstractFont.anInt800 = 0;
		if (i != 26365)
			method1416((byte) -34);
		Class61.aNode_Sub9_Sub1_885 = null;
		Class10.aClass96_176 = null;
		MouseHandler.aClass302_6049 = null;
	}

	private boolean aBoolean6610 = false;
	private boolean aBoolean6633;
	private boolean aBoolean6634;
	private boolean aBoolean6635;
	private boolean aBoolean6638;
	private boolean aBoolean6646;
	protected boolean aBoolean6649;
	private boolean aBoolean6651;
	protected boolean aBoolean6652;
	protected boolean aBoolean6654;
	private boolean aBoolean6657;
	private boolean aBoolean6658;
	private boolean aBoolean6660;
	protected boolean aBoolean6662;
	protected boolean aBoolean6665;
	protected boolean aBoolean6668;
	protected boolean aBoolean6676;
	protected boolean aBoolean6677;
	private boolean aBoolean6685;
	protected boolean aBoolean6703;
	private boolean aBoolean6708;
	protected boolean aBoolean6713;
	private boolean aBoolean6716;
	private boolean aBoolean6718;
	protected boolean aBoolean6719;
	private boolean aBoolean6721;
	private boolean aBoolean6723;
	protected boolean aBoolean6725;
	private boolean aBoolean6729;
	protected boolean aBoolean6735;
	protected boolean aBoolean6736;
	protected boolean aBoolean6738;
	protected byte[] aByteArray6746;
	private java.awt.Canvas aCanvas6505;
	private java.awt.Canvas aCanvas6546;
	private Class136 aClass136_6591;
	protected Class167 aClass167_6607;
	protected Class169_Sub2 aClass169_Sub2_6683;
	private Class169_Sub2_Sub1 aClass169_Sub2_Sub1_6722;
	private Class169[] aClass169Array6741;
	private Class247 aClass247_6600;
	private Client aClass270_Sub2_6724;
	private Class29 aClass29_6601 = new Class29();
	private Class312 aClass312_6608;
	private Class312 aClass312_6622;
	private Class312 aClass312_6626;
	private Class312 aClass312_6627;
	private Class312 aClass312_6628;
	private Class312 aClass312_6629;
	private Class312 aClass312_6630;
	private Class312 aClass312_6631;
	private Class336_Sub3 aClass336_Sub3_6603 = new Class336_Sub3();
	protected Class336_Sub3 aClass336_Sub3_6604 = new Class336_Sub3();
	protected Class336_Sub3 aClass336_Sub3_6639;
	protected Class336_Sub3 aClass336_Sub3_6641;
	protected Class336_Sub3 aClass336_Sub3_6642;
	private Class382 aClass382_6614;
	protected Class382 aClass382_6701;
	protected Class69 aClass69_6681;
	protected Class69 aClass69_6698;
	private Class73 aClass73_6602;
	protected float aFloat6645;
	protected float aFloat6648;
	private float aFloat6656;
	protected float aFloat6659;
	protected float aFloat6663;
	private float aFloat6669;
	private float aFloat6670;
	private float aFloat6671;
	protected float aFloat6672;
	protected float aFloat6674;
	private float aFloat6675;
	private float aFloat6679;
	protected float aFloat6687;
	protected float aFloat6695;
	protected float aFloat6707;
	protected float aFloat6710;
	protected float aFloat6711;
	private float aFloat6720;
	private float aFloat6726;
	protected float aFloat6734;
	protected float aFloat6737;
	private float[] aFloatArray6650;
	protected float[] aFloatArray6664;
	private float[] aFloatArray6666;
	private float[] aFloatArray6684;
	private float[] aFloatArray6744;
	protected PacketDecoder aFloatBuffer6661;
	protected GLDrawableModel[] aGLDrawableModelArray6688;
	protected GLDrawableModel[] aGLDrawableModelArray6743;
	private GLSprite_Sub1 aGLSprite_Sub1_6619;
	private Hashtable<Canvas, Long> aHashtable6475 = new Hashtable<Canvas, Long>();
	private long aLong6476;
	private long aLong6477;
	private long aLong6640;
	protected NativeHeap aNativeHeap6609;
	private int anInt6469;
	protected int anInt6474;
	private int anInt6513;
	protected int anInt6567;
	protected int anInt6593 = 128;
	protected int anInt6599;
	protected int anInt6605;
	protected int anInt6606;
	protected int anInt6611;
	private int anInt6612;
	private int anInt6613;
	private int anInt6618;
	protected int anInt6623;
	protected int anInt6624;
	private int anInt6625;
	private int anInt6632;
	private int anInt6636;
	private int anInt6637;
	private int anInt6643;
	private int anInt6644;
	protected int anInt6667;
	protected int anInt6678;
	protected int anInt6680;
	private int anInt6682;
	private int anInt6686;
	protected int anInt6689;
	private int anInt6690;
	protected int anInt6691;
	protected int anInt6692;
	protected int anInt6693;
	private int anInt6694;
	private int anInt6696;
	protected int anInt6697;
	private int anInt6699;
	private int anInt6700;
	protected int anInt6702;
	private int anInt6704;
	private int anInt6705;
	private int anInt6706;
	private int anInt6712;
	protected int anInt6714;
	private int anInt6715;
	protected int anInt6717;
	private int anInt6727;
	protected int anInt6730;
	protected int anInt6731;
	protected int anInt6732;
	private int anInt6733;
	protected int anInt6739;
	protected int anInt6740;
	private int anInt6742;
	private int anInt6745;
	private int anInt6750;
	private int anInt6751;
	protected int[] anIntArray6747;
	protected int[] anIntArray6748;
	protected int[] anIntArray6749;
	private Interface1 anInterface1_6709;
	private Interface11 anInterface11_6617;
	private Interface11 anInterface11_6620;
	private Interface11[] anInterface11Array6615;
	private Interface11[] anInterface11Array6616;
	private Interface11[] anInterface11Array6621;
	private Interface9 anInterface9_6647;
	private Interface9 anInterface9_6728;
	private Node_Sub23_Sub1 aNode_Sub23_Sub1_6594;
	private Node_Sub29[] aNode_Sub29Array6655;

	private OpenGL anOpenGL6423;

	private String aString6653;

	private String aString6673;

	GLToolkit(java.awt.Canvas canvas, d var_d, int i) {
		super(var_d);
		anInt6606 = 8;
		anInt6611 = 3;
		aClass312_6608 = new Class312();
		anInterface11Array6615 = new Interface11[4];
		anInt6613 = -1;
		anInt6612 = -1;
		anInterface11Array6616 = new Interface11[4];
		anInt6618 = -1;
		anInterface11Array6621 = new Interface11[4];
		new Class158();
		new HashTable(16);
		aClass312_6622 = new Class312();
		aClass312_6626 = new Class312();
		aClass312_6627 = new Class312();
		aClass312_6628 = new Class312();
		aClass312_6629 = new Class312();
		aClass312_6630 = new Class312();
		aClass312_6631 = new Class312();
		aClass336_Sub3_6639 = new Class336_Sub3();
		aClass336_Sub3_6641 = new Class336_Sub3();
		aClass336_Sub3_6642 = new Class336_Sub3();
		aNode_Sub29Array6655 = new Node_Sub29[Node_Sub15_Sub11.anInt9856];
		aFloat6645 = -1.0F;
		aFloatArray6666 = new float[4];
		anInt6678 = -1;
		aFloat6670 = -1.0F;
		aFloat6671 = -1.0F;
		anInt6690 = 0;
		anInt6644 = 0;
		anInt6667 = 512;
		anInt6699 = 0;
		anInt6697 = -1;
		anInt6700 = 8448;
		anInt6691 = -1;
		anInt6693 = 50;
		aGLDrawableModelArray6688 = new GLDrawableModel[7];
		aFloat6707 = 1.0F;
		aFloat6672 = 1.0F;
		aFloat6648 = -1.0F;
		aBoolean6708 = false;
		anInt6715 = 8448;
		anInt6694 = -1;
		anInt6696 = 0;
		aFloat6720 = 1.0F;
		aFloat6695 = 3584.0F;
		anInt6731 = -1;
		anInt6705 = 3584;
		aFloatArray6684 = new float[16];
		aFloat6734 = 1.0F;
		aFloat6675 = 1.0F;
		anInt6714 = 0;
		aFloatArray6650 = new float[4];
		anInt6733 = 0;
		anInt6739 = 0;
		aFloat6710 = 3584.0F;
		aFloat6726 = 0.0F;
		aBoolean6651 = true;
		aFloatArray6664 = new float[4];
		aGLDrawableModelArray6743 = new GLDrawableModel[7];
		anInt6730 = 512;
		anInt6692 = 0;
		anInt6745 = 0;
		anInt6702 = 0;
		aFloatArray6744 = new float[4];
		aFloatBuffer6661 = new PacketDecoder(8192);
		aByteArray6746 = new byte[16384];
		anIntArray6748 = new int[1];
		anIntArray6749 = new int[1];
		anIntArray6747 = new int[1];
		anInt6599 = i;
		aCanvas6546 = aCanvas6505 = canvas;
		if (!Node_Sub38_Sub2.method2793(1, "jaclib")) {
			System.out.println("Error: Game crash jaclib");
			throw new RuntimeException("");
		}
		if (!Node_Sub38_Sub2.method2793(1, "jaggl")) {
			System.out.println("Error: Game crash jaggl");
			throw new RuntimeException("");
		}
		try {
			anOpenGL6423 = new OpenGL();
			aLong6476 = aLong6477 = anOpenGL6423.init(canvas, 8, 8, 8, 24, 0, anInt6599);
			if ((aLong6477 ^ 0xffffffffffffffffL) == -1L)
				throw new RuntimeException("");
			method1425(-65);
			int i_231_ = method1440(46);
			if (i_231_ != 0)
				throw new RuntimeException("");
			anInt6740 = aBoolean6736 ? 33639 : 5121;
			if ((aString6673.indexOf("radeon") ^ 0xffffffff) != 0) {
				int i_232_ = 0;
				boolean bool = false;
				boolean bool_233_ = false;
				String[] strings = Class106.method1120((byte) 51, aString6673.replace('/', ' '), ' ');
				for (int i_234_ = 0; (i_234_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_234_++) {
					String string = strings[i_234_];
					try {
						if ((string.length() ^ 0xffffffff) < -1) {
							if (string.charAt(0) == 'x' && string.length() >= 3
									&& Class290_Sub7.method3441(2, string.substring(1, 3))) {
								string = string.substring(1);
								bool_233_ = true;
							}
							if (string.equals("hd"))
								bool = true;
							else {
								if (string.startsWith("hd")) {
									string = string.substring(2);
									bool = true;
								}
								if (string.length() >= 4 && Class290_Sub7.method3441(2, string.substring(0, 4))) {
									i_232_ = Class350.method3998(string.substring(0, 4), -1);
									break;
								}
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
				if (!bool || (i_232_ ^ 0xffffffff) > -4001)
					aBoolean6665 = false;
				if (!bool_233_ && !bool) {
					if (i_232_ >= 7000 && i_232_ <= 9250)
						aBoolean6677 = false;
					if (i_232_ >= 7000 && i_232_ <= 7999)
						aBoolean6658 = false;
				}
				aBoolean6649 &= anOpenGL6423.a("GL_ARB_half_float_pixel");
				aBoolean6729 = aBoolean6658;
				aBoolean6713 = true;
			}
			if (aString6653.indexOf("intel") != -1)
				aBoolean6719 = false;
			aBoolean6685 = !aString6653.equals("s3 graphics");
			if (aBoolean6658)
				try {
					int[] is = new int[1];
					OpenGL.glGenBuffersARB(1, is, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			LoadingBarStage.method1132(0, true, false);
			aBoolean6610 = true;
			aClass136_6591 = new Class136(this, aD1543);
			method1435(-111);
			aClass167_6607 = new Class167(this);
			aClass247_6600 = new Class247(this);
			if (aClass247_6600.method3079(-2)) {
				aNode_Sub23_Sub1_6594 = new Node_Sub23_Sub1(this);
				if (!aNode_Sub23_Sub1_6594.method2641(103)) {
					aNode_Sub23_Sub1_6594.method2626((byte) -127);
					aNode_Sub23_Sub1_6594 = null;
				}
			}
			aClass73_6602 = new Class73(this);
			method1427(5634);
			method1456(101);
			h();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			u();
			throw new RuntimeException("");
		}
	}

	@Override
	public final boolean a() {
		anInt6432++;
		return true;
	}

	@Override
	public final void a(boolean bool) {
		anInt6554++;
	}

	@Override
	public final void a(Class198 class198) {
		aClass29_6601.method339(this, class198, -1, true);
		anInt6466++;
	}

	@Override
	public final void a(Class198 class198, int i) {
		aClass29_6601.method339(this, class198, i, true);
		anInt6495++;
	}

	@Override
	public final void a(Class270 class270) {
		aClass270_Sub2_6724 = (Client) class270;
		anInt6569++;
	}

	@Override
	public final Class270 a(Class270 class270, Class270 class270_184_, float f, Class270 class270_185_) {
		anInt6512++;
		if (class270 != null && class270_184_ != null && aBoolean6654 && aBoolean6719) {
			Class270_Sub2_Sub1 class270_sub2_sub1 = null;
			Client class270_sub2 = (Client) class270;
			Client class270_sub2_186_ = (Client) class270_184_;
			Class169_Sub1 class169_sub1 = class270_sub2.method3304(true);
			Class169_Sub1 class169_sub1_187_ = class270_sub2_186_.method3304(true);
			if (class169_sub1 != null && class169_sub1_187_ != null) {
				int i = class169_sub1_187_.anInt8793 >= class169_sub1.anInt8793 ? class169_sub1_187_.anInt8793
						: class169_sub1.anInt8793;
				if (class270_185_ != class270 && class270_184_ != class270_185_
						&& class270_185_ instanceof Class270_Sub2_Sub1) {
					Class270_Sub2_Sub1 class270_sub2_sub1_188_ = (Class270_Sub2_Sub1) class270_185_;
					if ((class270_sub2_sub1_188_.method3307(1) ^ 0xffffffff) == (i ^ 0xffffffff))
						class270_sub2_sub1 = class270_sub2_sub1_188_;
				}
				if (class270_sub2_sub1 == null)
					class270_sub2_sub1 = new Class270_Sub2_Sub1(this, i);
				if (class270_sub2_sub1.method3308(class169_sub1_187_, class169_sub1, (byte) 63, f))
					return class270_sub2_sub1;
			}
		}
		if (f < 0.5F)
			return class270;
		return class270_184_;
	}

	@Override
	public final void a(Class336 class336) {
		anInt6598++;
		aClass336_Sub3_6639.method3857(class336);
		aClass336_Sub3_6641.method3857(aClass336_Sub3_6639);
		aClass336_Sub3_6641.method3894(0);
		aClass336_Sub3_6642.method3895((byte) 112, aClass336_Sub3_6641);
		if (anInt6686 != 1)
			method1462(0);
	}

	@Override
	public final AbstractFont a(Class357 class357, Class383[] class383s, boolean bool) {
		anInt6416++;
		return new Class52_Sub2(this, class357, class383s, bool);
	}

	@Override
	public final GLSprite a(Class383 class383, boolean bool) {
		anInt6532++;
		int[] is = new int[class383.anInt4900 * class383.anInt4897];
		int i = 0;
		int i_65_ = 0;
		if (class383.aByteArray4905 != null)
			for (int i_66_ = 0; class383.anInt4900 > i_66_; i_66_++)
				for (int i_67_ = 0; (class383.anInt4897 ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++) {
					is[i_65_++] = Node_Sub16.method2590(
							class383.anIntArray4904[Node_Sub30.method2723(class383.aByteArray4903[i], 255)],
							class383.aByteArray4905[i] << 24);
					i++;
				}
		else
			for (int i_68_ = 0; i_68_ < class383.anInt4900; i_68_++)
				for (int i_69_ = 0; class383.anInt4897 > i_69_; i_69_++) {
					int i_70_ = class383.anIntArray4904[0xff & class383.aByteArray4903[i++]];
					is[i_65_++] = i_70_ == 0 ? 0 : Node_Sub16.method2590(-16777216, i_70_);
				}
		GLSprite glsprite = this.method1235(class383.anInt4897, class383.anInt4897, class383.anInt4900, is, 0, 7468);
		glsprite.method1178(class383.anInt4902, class383.anInt4898, class383.anInt4901, class383.anInt4899);
		return glsprite;
	}

	@Override
	public final void a(float f, float f_79_, float f_80_) {
		Class144_Sub1.aFloat6808 = f;
		anInt6500++;
		EntityNode_Sub3_Sub2.aFloat9168 = f_80_;
		Class333.aFloat4152 = f_79_;
	}

	@Override
	public final za a(int i) {
		anInt6450++;
		za_Sub1 var_za_Sub1 = new za_Sub1(i);
		aClass312_6608.method3625((byte) -54, var_za_Sub1);
		return var_za_Sub1;
	}

	@Override
	public final Interface4 a(int i, int i_307_) {
		anInt6404++;
		return null;
	}

	@Override
	public final GLSprite a(int i, int i_29_, boolean bool) {
		anInt6405++;
		return new GLSprite_Sub1(this, i, i_29_, bool);
	}

	@Override
	public final void a(int i, int i_325_, int i_326_, int i_327_) {
		aClass247_6600.method3081(0, i_326_, i, i_327_, i_325_);
		anInt6533++;
	}

	@Override
	public final GLSprite a(int i, int i_30_, int i_31_, int i_32_, boolean bool) {
		anInt6540++;
		return new GLSprite_Sub1(this, i, i_30_, i_31_, i_32_);
	}

	@Override
	public final Node_Sub29 a(int i, int i_238_, int i_239_, int i_240_, int i_241_, float f) {
		anInt6520++;
		return new Node_Sub29_Sub1(i, i_238_, i_239_, i_240_, i_241_, f);
	}

	@Override
	public final void a(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		method1469((byte) 88);
		anInt6392++;
		method1460(i_18_, 3);
		float f = (float) i_15_ - (float) i;
		float f_19_ = (float) -i_14_ + (float) i_16_;
		if (f != 0.0F || f_19_ != 0.0F) {
			float f_20_ = (float) (1.0 / Math.sqrt(f_19_ * f_19_ + f * f));
			f *= f_20_;
			f_19_ *= f_20_;
		} else
			f = 1.0F;
		OpenGL.glColor4ub((byte) (i_17_ >> 16), (byte) (i_17_ >> 8), (byte) i_17_, (byte) (i_17_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(0.35F + i, 0.35F + i_14_);
		OpenGL.glVertex2f(f + i_15_ + 0.35F, i_16_ + f_19_ + 0.35F);
		OpenGL.glEnd();
	}

	@Override
	public final void a(int i, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, aa var_aa, int i_111_, int i_112_) {
		anInt6485++;
		aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
		Class169_Sub2_Sub1 class169_sub2_sub1 = var_aa_Sub3.aClass169_Sub2_Sub1_5494;
		method1461(34962);
		method1444(-2, var_aa_Sub3.aClass169_Sub2_Sub1_5494);
		method1460(i_110_, 3);
		method1474(127, 8448, 7681);
		method1464(34167, 768, 0, (byte) -51);
		float f = class169_sub2_sub1.aFloat10567 / class169_sub2_sub1.anInt10566;
		float f_113_ = class169_sub2_sub1.aFloat10568 / class169_sub2_sub1.anInt10564;
		float f_114_ = (float) -i + (float) i_107_;
		float f_115_ = (float) i_108_ - (float) i_106_;
		float f_116_ = (float) (1.0 / Math.sqrt(f_115_ * f_115_ + f_114_ * f_114_));
		OpenGL.glColor4ub((byte) (i_109_ >> 16), (byte) (i_109_ >> 8), (byte) i_109_, (byte) (i_109_ >> 24));
		f_114_ *= f_116_;
		f_115_ *= f_116_;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((-i_111_ + i) * f, f_113_ * (i_106_ - i_112_));
		OpenGL.glVertex2f(0.35F + i, 0.35F + i_106_);
		OpenGL.glTexCoord2f(f * (-i_111_ + i_107_), f_113_ * (i_108_ + -i_112_));
		OpenGL.glVertex2f(f_114_ + i_107_ + 0.35F, 0.35F + (f_115_ + i_108_));
		OpenGL.glEnd();
		method1464(5890, 768, 0, (byte) -51);
	}

	@Override
	public final void a(int i, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_, aa var_aa, int i_267_, int i_268_,
			int i_269_, int i_270_, int i_271_) {
		anInt6488++;
		if (i_263_ != i || (i_262_ ^ 0xffffffff) != (i_264_ ^ 0xffffffff)) {
			aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
			Class169_Sub2_Sub1 class169_sub2_sub1 = var_aa_Sub3.aClass169_Sub2_Sub1_5494;
			method1461(34962);
			method1444(-2, var_aa_Sub3.aClass169_Sub2_Sub1_5494);
			method1460(i_266_, 3);
			method1474(-4, 8448, 7681);
			method1464(34167, 768, 0, (byte) -51);
			float f = class169_sub2_sub1.aFloat10567 / class169_sub2_sub1.anInt10566;
			float f_272_ = class169_sub2_sub1.aFloat10568 / class169_sub2_sub1.anInt10564;
			float f_273_ = (float) -i + (float) i_263_;
			float f_274_ = (float) -i_262_ + (float) i_264_;
			float f_275_ = (float) (1.0 / Math.sqrt(f_273_ * f_273_ + f_274_ * f_274_));
			i_271_ %= i_269_ + i_270_;
			OpenGL.glColor4ub((byte) (i_265_ >> 16), (byte) (i_265_ >> 8), (byte) i_265_, (byte) (i_265_ >> 24));
			f_273_ *= f_275_;
			f_274_ *= f_275_;
			float f_276_ = i_269_ * f_273_;
			float f_277_ = f_274_ * i_269_;
			float f_278_ = 0.0F;
			float f_279_ = 0.0F;
			float f_280_ = f_276_;
			float f_281_ = f_277_;
			if ((i_271_ ^ 0xffffffff) < (i_269_ ^ 0xffffffff)) {
				f_279_ = (-i_271_ + (i_269_ + i_270_)) * f_274_;
				f_278_ = f_273_ * (i_270_ + i_269_ - i_271_);
			} else {
				f_281_ = f_274_ * (-i_271_ + i_269_);
				f_280_ = (-i_271_ + i_269_) * f_273_;
			}
			float f_282_ = i + 0.35F + f_278_;
			float f_283_ = f_279_ + (i_262_ + 0.35F);
			float f_284_ = f_273_ * i_270_;
			float f_285_ = i_270_ * f_274_;
			for (;;) {
				if ((i ^ 0xffffffff) <= (i_263_ ^ 0xffffffff)) {
					if (i_263_ + 0.35F > f_282_)
						break;
					if (f_280_ + f_282_ < i_263_)
						f_280_ = -f_282_ + i_263_;
				} else {
					if (f_282_ > i_263_ + 0.35F)
						break;
					if (i_263_ < f_282_ + f_280_)
						f_280_ = -f_282_ + i_263_;
				}
				if ((i_262_ ^ 0xffffffff) <= (i_264_ ^ 0xffffffff)) {
					if (i_264_ + 0.35F > f_283_)
						break;
					if (i_264_ > f_281_ + f_283_)
						f_281_ = -f_283_ + i_264_;
				} else {
					if (i_264_ + 0.35F < f_283_)
						break;
					if (i_264_ < f_281_ + f_283_)
						f_281_ = -f_283_ + i_264_;
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_282_ - i_267_), f_272_ * (-i_268_ + f_283_));
				OpenGL.glVertex2f(f_282_, f_283_);
				OpenGL.glTexCoord2f((-i_267_ + (f_282_ + f_280_)) * f, f_272_ * (f_281_ + f_283_ - i_268_));
				OpenGL.glVertex2f(f_280_ + f_282_, f_283_ + f_281_);
				f_282_ += f_280_ + f_284_;
				OpenGL.glEnd();
				f_283_ += f_285_ + f_281_;
				f_280_ = f_276_;
				f_281_ = f_277_;
			}
			method1464(5890, 768, 0, (byte) -51);
		}
	}

	@Override
	public final void a(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_) {
		anInt6427++;
		OpenGL.glLineWidth(i_142_);
		a(i, i_138_, i_139_, i_140_, i_141_, i_143_);
		OpenGL.glLineWidth(1.0F);
	}

	@Override
	public final void a(int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_,
			int i_202_) {
		anInt6452++;
		if ((i_196_ ^ 0xffffffff) != (i ^ 0xffffffff) || (i_197_ ^ 0xffffffff) != (i_195_ ^ 0xffffffff)) {
			method1469((byte) 88);
			method1460(i_199_, 3);
			float f = (float) -i + (float) i_196_;
			float f_203_ = (float) -i_195_ + (float) i_197_;
			float f_204_ = (float) (1.0 / Math.sqrt(f * f + f_203_ * f_203_));
			i_202_ %= i_200_ + i_201_;
			OpenGL.glColor4ub((byte) (i_198_ >> 16), (byte) (i_198_ >> 8), (byte) i_198_, (byte) (i_198_ >> 24));
			f *= f_204_;
			f_203_ *= f_204_;
			float f_205_ = f * i_200_;
			float f_206_ = i_200_ * f_203_;
			float f_207_ = 0.0F;
			float f_208_ = 0.0F;
			float f_209_ = f_205_;
			float f_210_ = f_206_;
			if (i_202_ <= i_200_) {
				f_210_ = (-i_202_ + i_200_) * f_203_;
				f_209_ = (-i_202_ + i_200_) * f;
			} else {
				f_208_ = (i_200_ - (-i_201_ + i_202_)) * f_203_;
				f_207_ = f * (-i_202_ + i_201_ + i_200_);
			}
			float f_211_ = i + 0.35F + f_207_;
			float f_212_ = f_208_ + (i_195_ + 0.35F);
			float f_213_ = i_201_ * f;
			float f_214_ = f_203_ * i_201_;
			for (;;) {
				if ((i ^ 0xffffffff) <= (i_196_ ^ 0xffffffff)) {
					if (f_211_ < i_196_ + 0.35F)
						break;
					if (i_196_ > f_209_ + f_211_)
						f_209_ = i_196_ - f_211_;
				} else {
					if (f_211_ > i_196_ + 0.35F)
						break;
					if (i_196_ < f_209_ + f_211_)
						f_209_ = -f_211_ + i_196_;
				}
				if ((i_197_ ^ 0xffffffff) >= (i_195_ ^ 0xffffffff)) {
					if (0.35F + i_197_ > f_212_)
						break;
					if (f_210_ + f_212_ < i_197_)
						f_210_ = -f_212_ + i_197_;
				} else {
					if (f_212_ > i_197_ + 0.35F)
						break;
					if (i_197_ < f_210_ + f_212_)
						f_210_ = i_197_ - f_212_;
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_211_, f_212_);
				OpenGL.glVertex2f(f_209_ + f_211_, f_210_ + f_212_);
				OpenGL.glEnd();
				f_211_ += f_213_ + f_209_;
				f_212_ += f_214_ + f_210_;
				f_209_ = f_205_;
				f_210_ = f_206_;
			}
		}
	}

	@Override
	public final void a(int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_,
			int i_225_, int i_226_, int i_227_, int i_228_) {
		anInt6514++;
		method1469((byte) 88);
		method1460(i_228_, 3);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_225_ >> 16), (byte) (i_225_ >> 8), (byte) i_225_, (byte) (i_225_ >> 24));
		OpenGL.glVertex3f(i + 0.35F, i_217_ + 0.35F, i_218_);
		OpenGL.glColor4ub((byte) (i_226_ >> 16), (byte) (i_226_ >> 8), (byte) i_226_, (byte) (i_226_ >> 24));
		OpenGL.glVertex3f(i_219_ + 0.35F, i_220_ + 0.35F, i_221_);
		OpenGL.glColor4ub((byte) (i_227_ >> 16), (byte) (i_227_ >> 8), (byte) i_227_, (byte) (i_227_ >> 24));
		OpenGL.glVertex3f(0.35F + i_222_, 0.35F + i_223_, i_224_);
		OpenGL.glEnd();
	}

	@Override
	public final aa a(int i, int i_323_, int[] is, int[] is_324_) {
		anInt6425++;
		return Class375.method4116(17787, is_324_, this, is, i_323_, i);
	}

	@Override
	public final Plane a(int i, int i_189_, int[][] is, int[][] is_190_, int i_191_, int i_192_, int i_193_) {
		anInt6471++;
		return new GLPlane(this, i_192_, i_193_, i, i_189_, is, is_190_, i_191_);
	}

	@Override
	public final void a(int i, Node_Sub29[] node_sub29s) {
		anInt6578++;
		for (int i_251_ = 0; (i ^ 0xffffffff) < (i_251_ ^ 0xffffffff); i_251_++)
			aNode_Sub29Array6655[i_251_] = node_sub29s[i_251_];
		anInt6742 = i;
		if ((anInt6686 ^ 0xffffffff) != -2)
			method1423((byte) 85);
	}

	@Override
	public final void a(int[] is) {
		anInt6596++;
		is[0] = anInt6474;
		is[1] = anInt6567;
	}

	@Override
	public final GLSprite a(int[] is, int i, int i_181_, int i_182_, int i_183_, boolean bool) {
		anInt6555++;
		return new GLSprite_Sub1(this, i_182_, i_183_, is, i, i_181_);
	}

	@Override
	public final Interface6 a(Interface4 interface4, Interface20 interface20) {
		anInt6430++;
		return null;
	}

	@Override
	public final void a(Interface6 interface6) {
		anInt6570++;
	}

	@Override
	public final void a(java.awt.Canvas canvas) {
		anInt6518++;
		aLong6476 = 0L;
		aCanvas6546 = null;
		if (canvas == null || canvas == aCanvas6505) {
			aLong6476 = aLong6477;
			aCanvas6546 = aCanvas6505;
		} else if (aHashtable6475.containsKey(canvas)) {
			Long var_long = aHashtable6475.get(canvas);
			aLong6476 = var_long.longValue();
			aCanvas6546 = canvas;
		}
		if (aCanvas6546 == null || (aLong6476 ^ 0xffffffffffffffffL) == -1L)
			throw new RuntimeException();
		anOpenGL6423.setSurface(aLong6476);
		method1456(-102);
	}

	@Override
	public final void a(java.awt.Canvas canvas, int i, int i_153_) {
		anInt6496++;
		long l = 0L;
		if (canvas == null || aCanvas6505 == canvas)
			l = aLong6477;
		else if (aHashtable6475.containsKey(canvas)) {
			Long var_long = aHashtable6475.get(canvas);
			l = var_long.longValue();
		}
		if (l == 0L)
			throw new RuntimeException();
		anOpenGL6423.surfaceResized(l);
		if (canvas == aCanvas6546)
			method1456(103);
	}

	@Override
	public final DrawableModel a(Model model, int i, int i_72_, int i_73_, int i_74_) {
		anInt6581++;
		return new GLDrawableModel(this, model, i, i_73_, i_74_, i_72_);
	}

	@Override
	public final void a(Rectangle[] rectangles, int i, int i_249_, int i_250_) throws Exception_Sub1 {
		anInt6417++;
		e(i_249_, i_250_);
	}

	@Override
	public final void a(za var_za) {
		aNativeHeap6609 = ((za_Sub1) var_za).aNativeHeap10506;
		anInt6557++;
		if (anInterface9_6728 == null) {
			PacketDecoder floatbuffer = new PacketDecoder(80);
			if (aBoolean6736) {
				floatbuffer.method2251(8, -1.0F);
				floatbuffer.method2251(8, -1.0F);
				floatbuffer.method2251(8, 0.0F);
				floatbuffer.method2251(8, 0.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, -1.0F);
				floatbuffer.method2251(8, 0.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, 0.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, 0.0F);
				floatbuffer.method2251(8, -1.0F);
				floatbuffer.method2251(8, 1.0F);
				floatbuffer.method2251(8, 0.0F);
				floatbuffer.method2251(8, 0.0F);
				floatbuffer.method2251(8, 0.0F);
			} else {
				floatbuffer.method2252(-229385392, -1.0F);
				floatbuffer.method2252(-229385392, -1.0F);
				floatbuffer.method2252(-229385392, 0.0F);
				floatbuffer.method2252(-229385392, 0.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, -1.0F);
				floatbuffer.method2252(-229385392, 0.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, 0.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, 0.0F);
				floatbuffer.method2252(-229385392, -1.0F);
				floatbuffer.method2252(-229385392, 1.0F);
				floatbuffer.method2252(-229385392, 0.0F);
				floatbuffer.method2252(-229385392, 0.0F);
				floatbuffer.method2252(-229385392, 0.0F);
			}
			anInterface9_6728 = method1467(false, floatbuffer.offset, floatbuffer.buffer, 20, -36);
			aClass69_6681 = new Class69(anInterface9_6728, 5126, 3, 0);
			aClass69_6698 = new Class69(anInterface9_6728, 5126, 2, 12);
			aClass29_6601.method340(26802, this);
		}
	}

	@Override
	public final Class336 A() {
		anInt6579++;
		return aClass336_Sub3_6603;
	}

	@Override
	public final void A(int i, aa var_aa, int i_53_, int i_54_) {
		anInt6535++;
		aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
		Class169_Sub2_Sub1 class169_sub2_sub1 = var_aa_Sub3.aClass169_Sub2_Sub1_5494;
		method1461(34962);
		method1444(-2, var_aa_Sub3.aClass169_Sub2_Sub1_5494);
		method1460(1, 3);
		method1474(127, 8448, 7681);
		method1464(34167, 768, 0, (byte) -51);
		float f = class169_sub2_sub1.aFloat10567 / class169_sub2_sub1.anInt10566;
		float f_55_ = class169_sub2_sub1.aFloat10568 / class169_sub2_sub1.anInt10564;
		OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((-i_53_ + anInt6644) * f, (anInt6745 + -i_54_) * f_55_);
		OpenGL.glVertex2i(anInt6644, anInt6745);
		OpenGL.glTexCoord2f(f * (anInt6644 + -i_53_), (-i_54_ + anInt6696) * f_55_);
		OpenGL.glVertex2i(anInt6644, anInt6696);
		OpenGL.glTexCoord2f(f * (anInt6733 - i_53_), (-i_54_ + anInt6696) * f_55_);
		OpenGL.glVertex2i(anInt6733, anInt6696);
		OpenGL.glTexCoord2f(f * (anInt6733 + -i_53_), f_55_ * (anInt6745 - i_54_));
		OpenGL.glVertex2i(anInt6733, anInt6745);
		OpenGL.glEnd();
		method1464(5890, 768, 0, (byte) -51);
	}

	@Override
	public final void aa(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		anInt6538++;
		float f = i + 0.35F;
		float f_49_ = i_44_ + 0.35F;
		float f_50_ = f + i_45_;
		method1469((byte) 88);
		float f_51_ = i_46_ + f_49_;
		method1460(i_48_, 3);
		OpenGL.glColor4ub((byte) (i_47_ >> 16), (byte) (i_47_ >> 8), (byte) i_47_, (byte) (i_47_ >> 24));
		if (aBoolean6723)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_49_);
		OpenGL.glVertex2f(f, f_51_);
		OpenGL.glVertex2f(f_50_, f_51_);
		OpenGL.glVertex2f(f_50_, f_49_);
		OpenGL.glEnd();
		if (aBoolean6723)
			OpenGL.glEnable(32925);
	}

	@Override
	public final boolean b() {
		anInt6438++;
		return true;
	}

	@Override
	public final void b(boolean bool) {
		anInt6409++;
	}

	@Override
	public final void b(int i) {
		anInt6498++;
	}

	@Override
	public final int b(int i, int i_28_) {
		anInt6397++;
		return i_28_ ^ i_28_ & i;
	}

	@Override
	public final void b(int i, int i_25_, int i_26_, int i_27_, double d) {
		anInt6433++;
	}

	@Override
	public final void b(java.awt.Canvas canvas) {
		anInt6436++;
		if (canvas == aCanvas6505)
			throw new RuntimeException();
		if (aHashtable6475.containsKey(canvas)) {
			Long var_long = aHashtable6475.get(canvas);
			anOpenGL6423.releaseSurface(canvas, var_long.longValue());
			aHashtable6475.remove(canvas);
		}
	}

	@Override
	public final void b(java.awt.Canvas canvas, int i, int i_13_) {
		anInt6565++;
		if (aCanvas6505 == canvas)
			throw new RuntimeException();
		if (!aHashtable6475.containsKey(canvas)) {
			if (!canvas.isShowing())
				throw new RuntimeException();
			try {
				Class<?> var_class = Class.forName("java.awt.Canvas");
				Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
				method.invoke(canvas, new Object[] { Boolean.TRUE });
			} catch (Exception exception) {
				/* empty */
			}
			long l = anOpenGL6423.prepareSurface(canvas);
			if ((l ^ 0xffffffffffffffffL) == 0L)
				throw new RuntimeException();
			aHashtable6475.put(canvas, new Long(l));
		}
	}

	@Override
	public final boolean B() {
		anInt6517++;
		return true;
	}

	@Override
	public final Renderer c() {
		anInt6454++;
		int i = -1;
		if ((aString6653.indexOf("nvidia") ^ 0xffffffff) != 0)
			i = 4318;
		else if (aString6653.indexOf("intel") == -1) {
			if ((aString6653.indexOf("ati") ^ 0xffffffff) != 0)
				i = 4098;
		} else
			i = 32902;
		return new Renderer(i, "OpenGL", anInt6712, aString6673, 0L);
	}

	@Override
	public final void c(int i) {
		method1488((byte) 67);
		anInt6431++;
	}

	@Override
	public final int c(int i, int i_52_) {
		anInt6434++;
		return i | i_52_;
	}

	@Override
	public final Class270 c(int i, int i_294_, int i_295_, int i_296_, int i_297_, int i_298_) {
		anInt6501++;
		if (!aBoolean6654)
			return null;
		return new Class270_Sub2_Sub2(this, i, i_294_, i_295_, i_296_, i_297_, i_298_);
	}

	@Override
	public final void C(boolean bool) {
		anInt6426++;
		aBoolean6651 = bool;
		method1475(0);
	}

	@Override
	public final void d() {
		aClass247_6600.method3076((byte) 98);
		anInt6547++;
	}

	@Override
	public final Interface20 d(int i, int i_78_) {
		anInt6542++;
		return null;
	}

	@Override
	public final void d(int i, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_) {
		anInt6595++;
		float f = 0.35F + i;
		float f_133_ = i_128_ + 0.35F;
		float f_134_ = -1.0F + (i_129_ + f);
		float f_135_ = -1.0F + (i_130_ + f_133_);
		method1469((byte) 88);
		method1460(i_132_, 3);
		OpenGL.glColor4ub((byte) (i_131_ >> 16), (byte) (i_131_ >> 8), (byte) i_131_, (byte) (i_131_ >> 24));
		if (aBoolean6723)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f, f_133_);
		OpenGL.glVertex2f(f, f_135_);
		OpenGL.glVertex2f(f_134_, f_135_);
		OpenGL.glVertex2f(f_134_, f_133_);
		OpenGL.glEnd();
		if (aBoolean6723)
			OpenGL.glEnable(32925);
	}

	@Override
	public final void da(int i, int i_120_, int i_121_, int[] is) {
		anInt6461++;
		float f = aClass336_Sub3_6639.aFloat8615 + (aClass336_Sub3_6639.aFloat8605 * i
				+ aClass336_Sub3_6639.aFloat8593 * i_120_ + i_121_ * aClass336_Sub3_6639.aFloat8604);
		if (anInt6693 > f || f > anInt6705)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_122_ = (int) (anInt6667 * (aClass336_Sub3_6639.aFloat8594 + (i_121_ * aClass336_Sub3_6639.aFloat8617
					+ (i * aClass336_Sub3_6639.aFloat8596 + i_120_ * aClass336_Sub3_6639.aFloat8608))) / f);
			int i_123_ = (int) (anInt6730
					* (i * aClass336_Sub3_6639.aFloat8625 + i_120_ * aClass336_Sub3_6639.aFloat8607
							+ aClass336_Sub3_6639.aFloat8591 * i_121_ + aClass336_Sub3_6639.aFloat8609)
					/ f);
			if (aFloat6711 <= i_122_ && i_122_ <= aFloat6674 && i_123_ >= aFloat6687 && aFloat6663 >= i_123_) {
				is[0] = (int) (i_122_ - aFloat6711);
				is[1] = (int) (-aFloat6687 + i_123_);
				is[2] = (int) f;
			} else
				is[0] = is[1] = is[2] = -1;
		}
	}

	@Override
	public final void DA(int i, int i_103_, int i_104_, int i_105_) {
		anInt6667 = i_104_;
		anInt6491++;
		anInt6714 = i;
		anInt6730 = i_105_;
		anInt6702 = i_103_;
		method1433(111);
		method1480(3657);
		if ((anInt6686 ^ 0xffffffff) == -4)
			method1419(false);
		else if (anInt6686 == 2)
			method1448(512);
	}

	@Override
	public final int e() {
		anInt6418++;
		return 4;
	}

	@Override
	public final synchronized void e(int i) {
		anInt6470++;
		i &= 0x7fffffff;
		int i_252_ = 0;
		while (!aClass312_6626.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_6626.method3619(-68);
			Class85.anIntArray1154[i_252_++] = (int) node_sub32.aLong2797;
			anInt6623 -= node_sub32.anInt7381;
			if ((i_252_ ^ 0xffffffff) == -1001) {
				OpenGL.glDeleteBuffersARB(i_252_, Class85.anIntArray1154, 0);
				i_252_ = 0;
			}
		}
		if (i_252_ > 0) {
			OpenGL.glDeleteBuffersARB(i_252_, Class85.anIntArray1154, 0);
			i_252_ = 0;
		}
		while (!aClass312_6627.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_6627.method3619(-102);
			Class85.anIntArray1154[i_252_++] = (int) node_sub32.aLong2797;
			anInt6624 -= node_sub32.anInt7381;
			if ((i_252_ ^ 0xffffffff) == -1001) {
				OpenGL.glDeleteTextures(i_252_, Class85.anIntArray1154, 0);
				i_252_ = 0;
			}
		}
		if ((i_252_ ^ 0xffffffff) < -1) {
			OpenGL.glDeleteTextures(i_252_, Class85.anIntArray1154, 0);
			i_252_ = 0;
		}
		while (!aClass312_6628.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_6628.method3619(-128);
			Class85.anIntArray1154[i_252_++] = node_sub32.anInt7381;
			if (i_252_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_252_, Class85.anIntArray1154, 0);
				i_252_ = 0;
			}
		}
		if ((i_252_ ^ 0xffffffff) < -1) {
			OpenGL.glDeleteFramebuffersEXT(i_252_, Class85.anIntArray1154, 0);
			i_252_ = 0;
		}
		while (!aClass312_6629.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_6629.method3619(-77);
			Class85.anIntArray1154[i_252_++] = (int) node_sub32.aLong2797;
			anInt6625 -= node_sub32.anInt7381;
			if ((i_252_ ^ 0xffffffff) == -1001) {
				OpenGL.glDeleteRenderbuffersEXT(i_252_, Class85.anIntArray1154, 0);
				i_252_ = 0;
			}
		}
		if (i_252_ > 0)
			OpenGL.glDeleteRenderbuffersEXT(i_252_, Class85.anIntArray1154, 0);
		while (!aClass312_6622.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_6622.method3619(-75);
			OpenGL.glDeleteLists((int) node_sub32.aLong2797, node_sub32.anInt7381);
		}
		while (!aClass312_6630.method3616(0)) {
			Node node = aClass312_6630.method3619(-113);
			OpenGL.glDeleteProgramARB((int) node.aLong2797);
		}
		while (!aClass312_6631.method3616(0)) {
			Node node = aClass312_6631.method3619(-123);
			OpenGL.glDeleteObjectARB(node.aLong2797);
		}
		while (!aClass312_6622.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_6622.method3619(-83);
			OpenGL.glDeleteLists((int) node_sub32.aLong2797, node_sub32.anInt7381);
		}
		aClass136_6591.method1592(true);
		if (E() > 100663296
				&& (60000L + aLong6640 ^ 0xffffffffffffffffL) > (Class313.method3650(false) ^ 0xffffffffffffffffL)) {
			System.gc();
			aLong6640 = Class313.method3650(false);
		}
		anInt6605 = i;
	}

	@Override
	public final void e(int i, int i_329_) throws Exception_Sub1 {
		anInt6484++;
		try {
			anOpenGL6423.swapBuffers();
		} catch (Exception exception) {
			/* empty */
		}
	}

	@Override
	public final int E() {
		anInt6523++;
		return anInt6623 - (-anInt6624 + -anInt6625);
	}

	@Override
	public final void EA(int i, int i_117_, int i_118_, int i_119_) {
		anInt6480++;
		if (!aBoolean6676)
			throw new RuntimeException("");
		anInt6689 = i;
		anInt6731 = i_117_;
		anInt6697 = i_118_;
		anInt6739 = i_119_;
		if (aBoolean6708) {
			aClass73_6602.aClass339_Sub6_986.method3940(86);
			aClass73_6602.aClass339_Sub6_986.method3941(-92);
		}
	}

	@Override
	public final void f() {
		if (aNode_Sub23_Sub1_6594 != null && aNode_Sub23_Sub1_6594.method2634(16383)) {
			aClass247_6600.method3082(30543, aNode_Sub23_Sub1_6594);
			aClass136_6591.method1591(-28841);
		}
		anInt6589++;
	}

	@Override
	public final void f(int i) {
		anInt6580++;
		if ((i ^ 0xffffffff) > -129 || (i ^ 0xffffffff) < -1025)
			throw new IllegalArgumentException();
		anInt6593 = i;
		aClass136_6591.method1591(-28841);
	}

	@Override
	public final void f(int i, int i_194_) {
		if (i != anInt6693 || (anInt6705 ^ 0xffffffff) != (i_194_ ^ 0xffffffff)) {
			anInt6693 = i;
			anInt6705 = i_194_;
			method1433(111);
			method1412(19);
			if (anInt6686 != 3) {
				if (anInt6686 == 2)
					method1448(512);
			} else
				method1419(false);
		}
		anInt6400++;
	}

	@Override
	public final void F(int i, int i_328_) {
		anInt6553++;
	}

	@Override
	public final void GA(int i) {
		method1460(0, 3);
		anInt6411++;
		OpenGL.glClearColor((i & 0xff0000) / 1.671168E7F, (i & 0xff00) / 65280.0F, (i & 0xff) / 255.0F,
				(i >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@Override
	public final void h() {
		anInt6424++;
		if (aBoolean6685 && (anInt6474 ^ 0xffffffff) < -1 && anInt6567 > 0) {
			int i = anInt6644;
			int i_56_ = anInt6733;
			int i_57_ = anInt6745;
			int i_58_ = anInt6696;
			la();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			method1424(8);
			method1478(false, (byte) -53);
			method1451(false, -31277);
			method1449(-49, false);
			method1415(771, false);
			method1444(-2, null);
			method1489(-2, -2);
			method1434((byte) -104, 1);
			method1460(0, 3);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, anInt6474, anInt6567, 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			KA(i, i_57_, i_56_, i_58_);
		}
	}

	@Override
	public final void H(int i, int i_97_, int i_98_, int[] is) {
		anInt6587++;
		float f = aClass336_Sub3_6639.aFloat8615 + (i_98_ * aClass336_Sub3_6639.aFloat8604
				+ (aClass336_Sub3_6639.aFloat8593 * i_97_ + i * aClass336_Sub3_6639.aFloat8605));
		if (f == 0.0F)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_99_ = (int) ((aClass336_Sub3_6639.aFloat8594 + (i_98_ * aClass336_Sub3_6639.aFloat8617
					+ (aClass336_Sub3_6639.aFloat8608 * i_97_ + aClass336_Sub3_6639.aFloat8596 * i))) * anInt6667 / f);
			is[0] = (int) (i_99_ - aFloat6711);
			int i_100_ = (int) (anInt6730 * (aClass336_Sub3_6639.aFloat8625 * i + i_97_ * aClass336_Sub3_6639.aFloat8607
					+ i_98_ * aClass336_Sub3_6639.aFloat8591 + aClass336_Sub3_6639.aFloat8609) / f);
			is[2] = (int) f;
			is[1] = (int) (-aFloat6687 + i_100_);
		}
	}

	@Override
	public final void HA(int i, int i_242_, int i_243_, int i_244_, int[] is) {
		anInt6575++;
		float f = i * aClass336_Sub3_6639.aFloat8605 + aClass336_Sub3_6639.aFloat8593 * i_242_
				+ aClass336_Sub3_6639.aFloat8604 * i_243_ + aClass336_Sub3_6639.aFloat8615;
		if (anInt6693 > f || anInt6705 < f)
			is[0] = is[1] = is[2] = -1;
		else {
			int i_245_ = (int) (anInt6667
					* (aClass336_Sub3_6639.aFloat8594 + (i_243_ * aClass336_Sub3_6639.aFloat8617
							+ (aClass336_Sub3_6639.aFloat8608 * i_242_ + aClass336_Sub3_6639.aFloat8596 * i)))
					/ i_244_);
			int i_246_ = (int) ((aClass336_Sub3_6639.aFloat8609 + (aClass336_Sub3_6639.aFloat8591 * i_243_
					+ (aClass336_Sub3_6639.aFloat8607 * i_242_ + i * aClass336_Sub3_6639.aFloat8625))) * anInt6730
					/ i_244_);
			if (!(i_245_ >= aFloat6711) || !(aFloat6674 >= i_245_) || !(aFloat6687 <= i_246_)
					|| !(aFloat6663 >= i_246_))
				is[0] = is[1] = is[2] = -1;
			else {
				is[1] = (int) (-aFloat6687 + i_246_);
				is[0] = (int) (-aFloat6711 + i_245_);
				is[2] = (int) f;
			}
		}
	}

	@Override
	public final int i() {
		anInt6493++;
		return anInt6693;
	}

	@Override
	public final int I() {
		anInt6519++;
		int i = anInt6751;
		anInt6751 = 0;
		return i;
	}

	@Override
	public final void j() {
		OpenGL.glFinish();
		anInt6422++;
	}

	@Override
	public final void j(int i) {
		anInt6401++;
		if ((i ^ 0xffffffff) != -2)
			throw new IllegalArgumentException("");
	}

	@Override
	public final int JA(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		anInt6585++;
		int i_38_ = 0;
		float f = aClass336_Sub3_6639.aFloat8615 + (i_33_ * aClass336_Sub3_6639.aFloat8593
				+ i * aClass336_Sub3_6639.aFloat8605 + aClass336_Sub3_6639.aFloat8604 * i_34_);
		if (f < 1.0F)
			f = 1.0F;
		float f_39_ = i_35_ * aClass336_Sub3_6639.aFloat8605 + i_36_ * aClass336_Sub3_6639.aFloat8593
				+ i_37_ * aClass336_Sub3_6639.aFloat8604 + aClass336_Sub3_6639.aFloat8615;
		if (f_39_ < 1.0F)
			f_39_ = 1.0F;
		if (anInt6693 > f && f_39_ < anInt6693)
			i_38_ |= 0x10;
		else if (f > anInt6705 && f_39_ > anInt6705)
			i_38_ |= 0x20;
		int i_40_ = (int) (anInt6667 * (aClass336_Sub3_6639.aFloat8594 + (aClass336_Sub3_6639.aFloat8617 * i_34_
				+ (i * aClass336_Sub3_6639.aFloat8596 + i_33_ * aClass336_Sub3_6639.aFloat8608))) / f);
		int i_41_ = (int) (anInt6667 * (aClass336_Sub3_6639.aFloat8594 + (aClass336_Sub3_6639.aFloat8596 * i_35_
				+ aClass336_Sub3_6639.aFloat8608 * i_36_ + aClass336_Sub3_6639.aFloat8617 * i_37_)) / f_39_);
		if (!(aFloat6711 > i_40_) || !(aFloat6711 > i_41_)) {
			if (aFloat6674 < i_40_ && aFloat6674 < i_41_)
				i_38_ |= 0x2;
		} else
			i_38_ |= 0x1;
		int i_42_ = (int) ((aClass336_Sub3_6639.aFloat8591 * i_34_
				+ (i * aClass336_Sub3_6639.aFloat8625 + i_33_ * aClass336_Sub3_6639.aFloat8607)
				+ aClass336_Sub3_6639.aFloat8609) * anInt6730 / f);
		int i_43_ = (int) ((i_35_ * aClass336_Sub3_6639.aFloat8625 + aClass336_Sub3_6639.aFloat8607 * i_36_
				+ i_37_ * aClass336_Sub3_6639.aFloat8591 + aClass336_Sub3_6639.aFloat8609) * anInt6730 / f_39_);
		if (!(i_42_ < aFloat6687) || !(i_43_ < aFloat6687)) {
			if (i_42_ > aFloat6663 && aFloat6663 < i_43_)
				i_38_ |= 0x8;
		} else
			i_38_ |= 0x4;
		return i_38_;
	}

	@Override
	public final boolean k() {
		anInt6398++;
		return true;
	}

	@Override
	public final void k(int i) {
		method1425(-126);
		anInt6494++;
	}

	@Override
	public final void K(int[] is) {
		is[1] = anInt6745;
		is[3] = anInt6696;
		is[0] = anInt6644;
		is[2] = anInt6733;
		anInt6457++;
	}

	@Override
	public final void KA(int i, int i_10_, int i_11_, int i_12_) {
		if (i < 0)
			i = 0;
		if (anInt6474 < i_11_)
			i_11_ = anInt6474;
		anInt6511++;
		if (i_12_ > anInt6567)
			i_12_ = anInt6567;
		if (i_10_ < 0)
			i_10_ = 0;
		anInt6644 = i;
		anInt6733 = i_11_;
		anInt6696 = i_12_;
		anInt6745 = i_10_;
		OpenGL.glEnable(3089);
		method1480(3657);
		method1443((byte) 47);
	}

	@Override
	public final boolean l() {
		anInt6421++;
		return false;
	}

	@Override
	public final void L(int i, int i_229_, int i_230_) {
		anInt6566++;
		if ((i ^ 0xffffffff) != (anInt6678 ^ 0xffffffff) || anInt6691 != i_229_ || i_230_ != anInt6692) {
			anInt6691 = i_229_;
			anInt6692 = i_230_;
			anInt6678 = i;
			method1412(-121);
			method1487(6479);
		}
	}

	@Override
	public final void la() {
		anInt6733 = anInt6474;
		anInt6644 = 0;
		anInt6745 = 0;
		anInt6696 = anInt6567;
		anInt6531++;
		OpenGL.glDisable(3089);
		method1480(3657);
	}

	@Override
	public final boolean m() {
		anInt6459++;
		if (aNode_Sub23_Sub1_6594 != null) {
			if (!aNode_Sub23_Sub1_6594.method2634(16383)) {
				if (!aClass247_6600.method3077(aNode_Sub23_Sub1_6594, (byte) -119))
					return false;
				aClass136_6591.method1591(-28841);
			}
			return true;
		}
		return false;
	}

	@Override
	public final int M() {
		anInt6541++;
		int i = anInt6750;
		anInt6750 = 0;
		return i;
	}

	public final Class169_Sub1 method1406(byte b) {
		if (b > -37)
			return null;
		anInt6534++;
		if (aClass270_Sub2_6724 != null)
			return aClass270_Sub2_6724.method3304(true);
		return null;
	}

	public final void method1407(byte b, float f) {
		if (aFloat6720 != f) {
			aFloat6720 = f;
			if ((anInt6686 ^ 0xffffffff) == -4)
				method1419(false);
		}
		anInt6393++;
	}

	public final void method1408(int i, Interface9 interface9) {
		anInt6571++;
		if (anInterface9_6647 != interface9) {
			if (aBoolean6658)
				OpenGL.glBindBufferARB(34962, interface9.method24(29121));
			anInterface9_6647 = interface9;
		}
		if (i != 3089)
			aBoolean6638 = true;
	}

	private final void method1409(int i) {
		anInt6464++;
		Class254.aFloatArray3213[1] = aFloat6645 * aFloat6707;
		Class254.aFloatArray3213[2] = aFloat6672 * aFloat6645;
		Class254.aFloatArray3213[3] = 1.0F;
		Class254.aFloatArray3213[0] = aFloat6645 * aFloat6734;
		if (i != -1)
			method1478(true, (byte) -48);
		OpenGL.glLightfv(16384, 4609, Class254.aFloatArray3213, 0);
		Class254.aFloatArray3213[0] = -aFloat6648 * aFloat6734;
		Class254.aFloatArray3213[2] = aFloat6672 * -aFloat6648;
		Class254.aFloatArray3213[1] = aFloat6707 * -aFloat6648;
		Class254.aFloatArray3213[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Class254.aFloatArray3213, 0);
	}

	public final void method1410(int i, Interface11 interface11) {
		if (i != 15)
			method1415(-125, false);
		anInt6525++;
		if (!aBoolean6662) {
			if (anInt6613 >= 3)
				throw new RuntimeException();
			if (anInt6613 >= 0)
				anInterface11Array6621[anInt6613].method29(-97);
			anInterface11_6617 = anInterface11_6620 = anInterface11Array6621[++anInt6613] = interface11;
			anInterface11_6617.method30(-98);
		} else {
			method1447(interface11, 32760);
			method1479(29630, interface11);
		}
	}

	public final synchronized void method1411(int i, int i_3_) {
		if (i_3_ != 20010)
			H(77, -90, 73, null);
		anInt6582++;
		Node_Sub32 node_sub32 = new Node_Sub32(i);
		aClass312_6628.method3625((byte) -54, node_sub32);
	}

	private final void method1412(int i) {
		aFloat6669 = -aFloat6726 + (anInt6705 + -anInt6692);
		anInt6552++;
		aFloat6659 = aFloat6669 - aFloat6675 * anInt6691;
		if (aFloat6659 < anInt6693)
			aFloat6659 = anInt6693;
		OpenGL.glFogf(2915, aFloat6659);
		OpenGL.glFogf(2916, aFloat6669);
		Class254.aFloatArray3213[0] = Node_Sub30.method2723(16711680, anInt6678) / 1.671168E7F;
		Class254.aFloatArray3213[2] = Node_Sub30.method2723(255, anInt6678) / 255.0F;
		Class254.aFloatArray3213[1] = Node_Sub30.method2723(65280, anInt6678) / 65280.0F;
		OpenGL.glFogfv(2918, Class254.aFloatArray3213, 0);
	}

	private final void method1413(float f, float f_5_, int i, float f_6_) {
		anInt6486++;
		OpenGL.glMatrixMode(5890);
		if (aBoolean6657)
			OpenGL.glLoadIdentity();
		OpenGL.glTranslatef(f_6_, f_5_, f);
		OpenGL.glMatrixMode(5888);
		aBoolean6657 = true;
	}

	public final synchronized void method1414(int i, int i_8_, int i_9_) {
		anInt6396++;
		Node_Sub32 node_sub32 = new Node_Sub32(i);
		node_sub32.aLong2797 = i_8_;
		aClass312_6626.method3625((byte) -54, node_sub32);
		if (i_9_ != 25911)
			a(107, -115, -66, 49, 80, 18, -124);
	}

	public final void method1415(int i, boolean bool) {
		if (bool == !aBoolean6633) {
			aBoolean6633 = bool;
			method1475(i ^ 0x303);
			anInt6636 &= ~0x1f;
		}
		if (i != 771)
			aClass336_Sub3_6604 = null;
		anInt6460++;
	}

	public final void method1417(int i) {
		if (i != 21447)
			method1435(61);
		anInt6467++;
		if ((anInt6636 ^ 0xffffffff) != -5) {
			method1446((byte) 126);
			method1478(false, (byte) -53);
			method1451(false, -31277);
			method1449(-31, false);
			method1415(771, false);
			method1489(-2, -2);
			method1460(1, i ^ 0x53c4);
			anInt6636 = 4;
		}
	}

	public final void method1418(boolean bool, boolean bool_21_, int i) {
		anInt6406++;
		method1458(i, bool, bool_21_, false);
	}

	private final void method1419(boolean bool) {
		if (bool != false)
			P(36, 53, -18, -58, 114);
		anInt6548++;
		float f = -anInt6714 * aFloat6720 / anInt6667;
		float f_22_ = -anInt6702 * aFloat6720 / anInt6730;
		float f_23_ = (-anInt6714 + anInt6474) * aFloat6720 / anInt6667;
		float f_24_ = (anInt6567 - anInt6702) * aFloat6720 / anInt6730;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (f_23_ != f && f_24_ != f_22_)
			OpenGL.glOrtho(f, f_23_, -f_24_, -f_22_, anInt6693, anInt6705);
		OpenGL.glMatrixMode(5888);
	}

	public final int method1420(int i, boolean bool) {
		anInt6584++;
		if ((i ^ 0xffffffff) != -2) {
			if (i != 0) {
				if (i != 2) {
					if ((i ^ 0xffffffff) != -4) {
						if (i == 4)
							return 34023;
					} else
						return 260;
				} else
					return 34165;
			} else
				return 8448;
		} else
			return 7681;
		if (bool != false)
			aClass73_6602 = null;
		throw new IllegalArgumentException();
	}

	public final void method1421(int i) {
		anInt6472++;
		if (i != 1)
			na(-26, 32, -116, -12);
		if (anInt6636 != 16) {
			method1486((byte) -116);
			method1478(true, (byte) -53);
			method1449(i ^ ~0x18, true);
			method1415(771, true);
			method1460(1, 3);
			anInt6636 = 16;
		}
	}

	public final void method1422(float f, float f_59_, float f_60_, float f_61_, int i) {
		Class254.aFloatArray3213[3] = f_60_;
		anInt6572++;
		Class254.aFloatArray3213[1] = f_61_;
		if (i != 13934)
			method1424(65);
		Class254.aFloatArray3213[0] = f_59_;
		Class254.aFloatArray3213[2] = f;
		OpenGL.glTexEnvfv(8960, 8705, Class254.aFloatArray3213, 0);
	}

	private final void method1423(byte b) {
		anInt6503++;
		int i;
		for (i = 0; (i ^ 0xffffffff) > (anInt6742 ^ 0xffffffff); i++) {
			Node_Sub29 node_sub29 = aNode_Sub29Array6655[i];
			int i_62_ = i + 16386;
			Class204.aFloatArray2456[0] = node_sub29.method2705(32311);
			Class204.aFloatArray2456[1] = node_sub29.method2704(30);
			Class204.aFloatArray2456[2] = node_sub29.method2708(27433);
			Class204.aFloatArray2456[3] = 1.0F;
			OpenGL.glLightfv(i_62_, 4611, Class204.aFloatArray2456, 0);
			int i_63_ = node_sub29.method2710((byte) 78);
			float f = node_sub29.method2707(b ^ 0x54) / 255.0F;
			Class204.aFloatArray2456[0] = (Node_Sub30.method2723(16717910, i_63_) >> 16) * f;
			Class204.aFloatArray2456[2] = Node_Sub30.method2723(i_63_, 255) * f;
			Class204.aFloatArray2456[1] = f * Node_Sub30.method2723(255, i_63_ >> 8);
			OpenGL.glLightfv(i_62_, 4609, Class204.aFloatArray2456, 0);
			OpenGL.glLightf(i_62_, 4617, 1.0F / (node_sub29.method2711(122) * node_sub29.method2711(118)));
			OpenGL.glEnable(i_62_);
		}
		for (/**/; (anInt6704 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			OpenGL.glDisable(i + 16386);
		if (b == 85)
			anInt6704 = anInt6742;
	}

	public final void method1424(int i) {
		if (i != 8)
			da(-97, -61, -35, null);
		anInt6556++;
		if ((anInt6686 ^ 0xffffffff) != -1) {
			anInt6636 &= ~0x1f;
			anInt6686 = 0;
		}
	}

	private final void method1425(int i) {
		if (i >= -14)
			m();
		anInt6468++;
		int i_64_ = 0;
		while (!anOpenGL6423.b()) {
			if ((i_64_++ ^ 0xffffffff) < -6)
				throw new RuntimeException("");
			Class262_Sub22.method3208(1000L, false);
		}
	}

	public final synchronized void method1426(int i, byte b, int i_71_) {
		anInt6560++;
		if (b != -32)
			a(null, -95, 23);
		Node_Sub32 node_sub32 = new Node_Sub32(i_71_);
		node_sub32.aLong2797 = i;
		aClass312_6629.method3625((byte) -54, node_sub32);
	}

	private final void method1427(int i) {
		method1489(-2, -2);
		anInt6455++;
		for (int i_75_ = anInt6680 - 1; i_75_ >= 0; i_75_--) {
			method1457(33984, i_75_);
			method1444(i + -5636, null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		method1474(-68, 8448, 8448);
		method1464(34168, 770, 2, (byte) -51);
		method1442(2);
		anInt6637 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		anInt6632 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		aBoolean6635 = true;
		OpenGL.glColorMask(true, true, true, true);
		aBoolean6638 = true;
		method1478(true, (byte) -53);
		method1451(true, i ^ ~0x6c2e);
		method1449(-46, true);
		method1415(771, true);
		method1424(8);
		anOpenGL6423.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, i);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i_76_ = 0; (i_76_ ^ 0xffffffff) > -9; i_76_++) {
			int i_77_ = 16384 + i_76_;
			OpenGL.glLightfv(i_77_, 4608, fs, 0);
			OpenGL.glLightf(i_77_, 4615, 0.0F);
			OpenGL.glLightf(i_77_, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anInt6694 = anInt6678 = -1;
		la();
	}

	public final void method1428(int i, byte b) {
		Class254.aFloatArray3213[1] = Node_Sub30.method2723(i, 65280) / 65280.0F;
		if (b < 17)
			aBoolean6729 = true;
		Class254.aFloatArray3213[0] = Node_Sub30.method2723(i, 16711680) / 1.671168E7F;
		Class254.aFloatArray3213[3] = (i >>> 24) / 255.0F;
		anInt6408++;
		Class254.aFloatArray3213[2] = Node_Sub30.method2723(i, 255) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Class254.aFloatArray3213, 0);
	}

	private final void method1429(int i) {
		if (i != 2917)
			anInterface9_6647 = null;
		anInt6564++;
		OpenGL.glViewport(anInt6690, anInt6699, anInt6474, anInt6567);
	}

	public final void method1430(byte b) {
		OpenGL.glLightfv(16384, 4611, aFloatArray6664, 0);
		if (b <= 31)
			method1434((byte) -4, 32);
		anInt6479++;
		OpenGL.glLightfv(16385, 4611, aFloatArray6744, 0);
	}

	public final void method1431(int i, Interface11 interface11) {
		if (i != -10785)
			aBoolean6677 = false;
		anInt6524++;
		if ((anInt6618 ^ 0xffffffff) > -1 || anInterface11Array6615[anInt6618] != interface11)
			throw new RuntimeException();
		anInterface11Array6615[anInt6618--] = null;
		interface11.method32(i + 19157);
		if ((anInt6618 ^ 0xffffffff) <= -1) {
			anInterface11_6617 = anInterface11Array6615[anInt6618];
			anInterface11_6617.method31((byte) 116);
		} else
			anInterface11_6617 = null;
	}

	private final void method1432(boolean bool) {
		aFloatArray6684[10] = aFloat6656;
		aFloatArray6684[14] = aFloat6679;
		anInt6399++;
		aFloat6710 = (aFloatArray6684[14] - anInt6705) / aFloatArray6684[10];
		aFloat6695 = anInt6705;
		if (bool != false)
			d(-8, -10);
	}

	private final void method1433(int i) {
		anInt6573++;
		float[] fs = aFloatArray6684;
		float f = (float) (anInt6693 * -anInt6714) / (float) anInt6667;
		float f_81_ = (float) (anInt6693 * (-anInt6714 + anInt6474)) / (float) anInt6667;
		if (i <= 107)
			method1484(-58, null);
		float f_82_ = (float) (anInt6702 * anInt6693) / (float) anInt6730;
		float f_83_ = (float) (anInt6693 * (anInt6702 - anInt6567)) / (float) anInt6730;
		if (f_81_ != f && f_83_ != f_82_) {
			float f_84_ = anInt6693 * 2.0F;
			fs[4] = 0.0F;
			fs[13] = 0.0F;
			fs[10] = aFloat6656 = (float) -(anInt6693 + anInt6705) / (float) (anInt6705 - anInt6693);
			fs[6] = 0.0F;
			fs[11] = -1.0F;
			fs[1] = 0.0F;
			fs[0] = f_84_ / (-f + f_81_);
			fs[12] = 0.0F;
			fs[8] = (f_81_ + f) / (f_81_ - f);
			fs[15] = 0.0F;
			fs[9] = (f_82_ + f_83_) / (-f_83_ + f_82_);
			fs[2] = 0.0F;
			fs[7] = 0.0F;
			fs[3] = 0.0F;
			fs[14] = aFloat6679 = -(f_84_ * anInt6705) / (anInt6705 + -anInt6693);
			fs[5] = f_84_ / (f_82_ - f_83_);
		} else {
			fs[7] = 0.0F;
			fs[0] = 1.0F;
			fs[5] = 1.0F;
			fs[15] = 1.0F;
			fs[1] = 0.0F;
			fs[4] = 0.0F;
			fs[10] = 1.0F;
			fs[9] = 0.0F;
			fs[12] = 0.0F;
			fs[8] = 0.0F;
			fs[14] = 0.0F;
			fs[3] = 0.0F;
			fs[2] = 0.0F;
			fs[11] = 0.0F;
			fs[6] = 0.0F;
			fs[13] = 0.0F;
		}
		method1432(false);
	}

	public final void method1434(byte b, int i) {
		anInt6435++;
		if (i != 1) {
			if (i == 0)
				method1474(127, 8448, 8448);
			else if (i == 2)
				method1474(127, 7681, 34165);
			else if (i == 3)
				method1474(126, 8448, 260);
			else if (i == 4)
				method1474(126, 34023, 34023);
		} else
			method1474(126, 7681, 7681);
	}

	private final void method1435(int i) {
		anInt6544++;
		aClass169Array6741 = new Class169[anInt6680];
		aClass169_Sub2_6683 = new Class169_Sub2(this, 3553, 6408, 1, 1);
		new Class169_Sub2(this, 3553, 6408, 1, 1);
		new Class169_Sub2(this, 3553, 6408, 1, 1);
		for (int i_87_ = 0; (i_87_ ^ 0xffffffff) > -8; i_87_++) {
			aGLDrawableModelArray6743[i_87_] = new GLDrawableModel(this);
			aGLDrawableModelArray6688[i_87_] = new GLDrawableModel(this);
		}
		if (aBoolean6719) {
			aClass382_6701 = new Class382(this);
			new Class382(this);
		}
	}

	public final void method1436(Interface11 interface11, byte b) {
		anInt6439++;
		if (aBoolean6662) {
			method1431(-10785, interface11);
			method1481(interface11, false);
		} else {
			if (anInt6613 < 0 || interface11 != anInterface11Array6621[anInt6613])
				throw new RuntimeException();
			anInterface11Array6621[anInt6613--] = null;
			interface11.method29(-96);
			if ((anInt6613 ^ 0xffffffff) > -1)
				anInterface11_6617 = anInterface11_6620 = null;
			else {
				anInterface11_6617 = anInterface11_6620 = anInterface11Array6621[anInt6613];
				anInterface11_6617.method30(-39);
			}
		}
		if (b <= 8)
			l();
	}

	public final void method1438(byte b, float f, float f_92_) {
		aFloat6726 = f_92_;
		anInt6429++;
		aFloat6675 = f;
		if (b > 36)
			method1412(50);
	}

	public final void method1439(int i) {
		anInt6428++;
		OpenGL.glPopMatrix();
		if (i <= 84)
			a(-17, -27, 41, -14, 126, 1.0410299F);
	}

	private final int method1440(int i) {
		anInt6539++;
		aString6653 = OpenGL.glGetString(7936).toLowerCase();
		int i_93_ = 0;
		aString6673 = OpenGL.glGetString(7937).toLowerCase();
		if ((aString6653.indexOf("microsoft") ^ 0xffffffff) != 0)
			i_93_ |= 0x1;
		if ((aString6653.indexOf("brian paul") ^ 0xffffffff) != 0 || (aString6653.indexOf("mesa") ^ 0xffffffff) != 0)
			i_93_ |= 0x1;
		String string = OpenGL.glGetString(7938);
		String[] strings = Class106.method1120((byte) -90, string.replace('.', ' '), ' ');
		if (strings.length >= 2)
			try {
				int i_94_ = Class350.method3998(strings[0], -1);
				int i_95_ = Class350.method3998(strings[1], -1);
				anInt6712 = i_94_ * 10 + i_95_;
			} catch (NumberFormatException numberformatexception) {
				i_93_ |= 0x4;
			}
		else
			i_93_ |= 0x4;
		if (anInt6712 < 12)
			i_93_ |= 0x2;
		if (!anOpenGL6423.a("GL_ARB_multitexture"))
			i_93_ |= 0x8;
		if (!anOpenGL6423.a("GL_ARB_texture_env_combine"))
			i_93_ |= 0x20;
		int[] is = new int[1];
		OpenGL.glGetIntegerv(34018, is, 0);
		anInt6680 = is[0];
		OpenGL.glGetIntegerv(34929, is, 0);
		anInt6643 = is[0];
		OpenGL.glGetIntegerv(34930, is, 0);
		anInt6682 = is[0];
		if (anInt6680 < 2 || anInt6643 < 2 || anInt6682 < 2)
			i_93_ |= 0x10;
		aBoolean6736 = Stream.b();
		aBoolean6718 = anOpenGL6423.arePbuffersAvailable();
		aBoolean6658 = anOpenGL6423.a("GL_ARB_vertex_buffer_object");
		aBoolean6723 = anOpenGL6423.a("GL_ARB_multisample");
		aBoolean6703 = anOpenGL6423.a("GL_ARB_vertex_program");
		anOpenGL6423.a("GL_ARB_fragment_program");
		aBoolean6725 = anOpenGL6423.a("GL_ARB_vertex_shader");
		aBoolean6738 = anOpenGL6423.a("GL_ARB_fragment_shader");
		aBoolean6677 = anOpenGL6423.a("GL_EXT_texture3D");
		aBoolean6649 = anOpenGL6423.a("GL_ARB_texture_rectangle");
		aBoolean6654 = anOpenGL6423.a("GL_ARB_texture_cube_map");
		aBoolean6665 = anOpenGL6423.a("GL_ARB_texture_float");
		aBoolean6652 = false;
		aBoolean6719 = anOpenGL6423.a("GL_EXT_framebuffer_object");
		aBoolean6662 = anOpenGL6423.a("GL_EXT_framebuffer_blit");
		aBoolean6735 = anOpenGL6423.a("GL_EXT_framebuffer_multisample");
		aBoolean6721 = aBoolean6735 & aBoolean6662;
		aBoolean6668 = Class223.aString2660.startsWith("mac");
		OpenGL.glGetFloatv(2834, Class254.aFloatArray3213, 0);
		aFloat6671 = Class254.aFloatArray3213[0];
		aFloat6670 = Class254.aFloatArray3213[1];
		if (i_93_ != 0)
			return i_93_;
		return 0;
	}

	public final void method1441(int i, int i_101_, int i_102_, byte b) {
		if (b != -42)
			a((Interface6) null);
		OpenGL.glDrawArrays(i, i_101_, i_102_);
		anInt6537++;
	}

	private final void method1442(int i) {
		if (i != 2)
			M();
		if (aBoolean6657) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			aBoolean6657 = false;
		}
		anInt6588++;
	}

	private final void method1443(byte b) {
		anInt6545++;
		if (anInt6733 < anInt6644 || anInt6696 < anInt6745)
			OpenGL.glScissor(0, 0, 0, 0);
		else
			OpenGL.glScissor(anInt6644 + anInt6690, anInt6699 - (-anInt6567 - -anInt6696), -anInt6644 + anInt6733,
					anInt6696 - anInt6745);
		if (b != 47)
			n();
	}

	public final void method1444(int i, Class169 class169) {
		anInt6529++;
		Class169 class169_124_ = aClass169Array6741[anInt6727];
		if (class169 != class169_124_) {
			if (class169 != null) {
				if (class169_124_ == null)
					OpenGL.glEnable(class169.anInt4951);
				else if (class169.anInt4951 != class169_124_.anInt4951) {
					OpenGL.glDisable(class169_124_.anInt4951);
					OpenGL.glEnable(class169.anInt4951);
				}
				OpenGL.glBindTexture(class169.anInt4951, class169.method1759((byte) 93));
			} else
				OpenGL.glDisable(class169_124_.anInt4951);
			aClass169Array6741[anInt6727] = class169;
		}
		anInt6636 &= i;
	}

	public final void method1445(int i, Interface1 interface1) {
		if (anInterface1_6709 != interface1) {
			if (aBoolean6658)
				OpenGL.glBindBufferARB(34963, interface1.method2(i + 45955));
			anInterface1_6709 = interface1;
		}
		if (i != -30197)
			o();
		anInt6482++;
	}

	private final void method1446(byte b) {
		anInt6413++;
		if (b < 107)
			anInt6593 = 37;
		if (anInt6686 != 1) {
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			if (anInt6474 > 0 && (anInt6567 ^ 0xffffffff) < -1)
				OpenGL.glOrtho(0.0, anInt6474, anInt6567, 0.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			anInt6686 = 1;
			anInt6636 &= ~0x18;
		}
	}

	public final void method1447(Interface11 interface11, int i) {
		anInt6562++;
		if ((anInt6618 ^ 0xffffffff) <= -4)
			throw new RuntimeException();
		if ((anInt6618 ^ 0xffffffff) <= -1)
			anInterface11Array6615[anInt6618].method32(8372);
		anInterface11_6617 = anInterface11Array6615[++anInt6618] = interface11;
		anInterface11_6617.method31((byte) -125);
		if (i != 32760)
			a(-3, -32);
	}

	private final void method1448(int i) {
		OpenGL.glMatrixMode(5889);
		if (i != 512)
			anInt6611 = 81;
		anInt6502++;
		OpenGL.glLoadMatrixf(aFloatArray6684, 0);
		OpenGL.glMatrixMode(5888);
	}

	public final void method1449(int i, boolean bool) {
		if (i >= -2)
			d(-114, -110);
		if (bool != aBoolean6634) {
			if (bool)
				OpenGL.glEnable(2929);
			else
				OpenGL.glDisable(2929);
			anInt6636 &= ~0x1f;
			aBoolean6634 = bool;
		}
		anInt6463++;
	}

	public final synchronized void method1450(byte b, int i) {
		anInt6516++;
		if (b == -33) {
			Node node = new Node();
			node.aLong2797 = i;
			aClass312_6630.method3625((byte) -54, node);
		}
	}

	public final void method1451(boolean bool, int i) {
		if (i == -31277) {
			anInt6443++;
			if (!aBoolean6660 == bool) {
				aBoolean6660 = bool;
				method1452(-113);
				anInt6636 &= ~0x7;
			}
		}
	}

	private final void method1452(int i) {
		anInt6568++;
		if (i >= -112)
			method1420(-110, true);
		if (!aBoolean6660 || aBoolean6716)
			OpenGL.glDisable(2896);
		else
			OpenGL.glEnable(2896);
	}

	public final Interface1 method1453(int i, boolean bool, int i_136_, int i_137_, byte[] bs) {
		if (i != 26099)
			method1485(49L, -38);
		anInt6559++;
		if (aBoolean6658 && (!bool || aBoolean6729))
			return new Class117_Sub1(this, i_137_, bs, i_136_, bool);
		return new Class200_Sub2(this, i_137_, bs, i_136_);
	}

	public final void method1454(byte b) {
		OpenGL.glPushMatrix();
		anInt6414++;
	}

	public final void method1455(Class336_Sub3 class336_sub3, byte b) {
		OpenGL.glLoadMatrixf(class336_sub3.method3899(-92), 0);
		anInt6592++;
		if (b != 70)
			aNode_Sub23_Sub1_6594 = null;
	}

	private final void method1456(int i) {
		anInt6402++;
		if (aCanvas6546 == null)
			anInt6469 = anInt6513 = 0;
		else {
			Dimension dimension = aCanvas6546.getSize();
			anInt6469 = dimension.width;
			anInt6513 = dimension.height;
		}
		if (anInterface11_6620 == null) {
			anInt6474 = anInt6469;
			anInt6567 = anInt6513;
			method1429(2917);
		}
		method1424(8);
		la();
	}

	public final void method1457(int i, int i_145_) {
		anInt6390++;
		if (i == 33984)
			if (anInt6727 != i_145_) {
				OpenGL.glActiveTexture(33984 + i_145_);
				anInt6727 = i_145_;
			}
	}

	public final void method1458(int i, boolean bool, boolean bool_146_, boolean bool_147_) {
		if (bool_147_ != false)
			method1464(116, 88, 47, (byte) -14);
		if (anInt6706 != i || !aBoolean6676 != !aBoolean6708) {
			Class169_Sub2 class169_sub2 = null;
			int i_148_ = 0;
			byte b = 0;
			int i_149_ = 0;
			byte b_150_ = aBoolean6676 ? (byte) 3 : (byte) 0;
			if ((i ^ 0xffffffff) > -1)
				method1442(2);
			else {
				class169_sub2 = aClass136_6591.method1593((byte) -32, i);
				PlayerMasks class91 = aD1543.method10(i, -8217);
				if ((class91.aByte1211 ^ 0xffffffff) != -1 || (class91.aByte1203 ^ 0xffffffff) != -1) {
					int i_151_ = !class91.aBoolean1204 ? 128 : 64;
					int i_152_ = i_151_ * 50;
					method1413(0.0F, (float) (class91.aByte1203 * (anInt6605 % i_152_)) / (float) i_152_, 127,
							(float) (anInt6605 % i_152_ * class91.aByte1211) / (float) i_152_);
				} else
					method1442(2);
				if (!aBoolean6676) {
					b_150_ = class91.aByte1214;
					i_149_ = class91.anInt1206;
					b = class91.aByte1213;
				}
				i_148_ = class91.anInt1202;
			}
			aClass73_6602.method751(-107, i_149_, bool_146_, bool, b, b_150_);
			if (!aClass73_6602.method750((byte) 110, i_148_, class169_sub2)) {
				method1444(-2, class169_sub2);
				method1434((byte) 97, i_148_);
			}
			anInt6706 = i;
			aBoolean6708 = aBoolean6676;
		}
		anInt6487++;
		anInt6636 &= ~0x7;
	}

	public final Interface9 method1459(int i, int i_171_, Buffer buffer, boolean bool, int i_172_) {
		anInt6451++;
		if (aBoolean6658 && (!bool || aBoolean6729))
			return new Class117_Sub2(this, i_171_, buffer, i_172_, bool);
		if (i != -1)
			aBoolean6735 = false;
		return new Class200_Sub1(this, i_171_, buffer);
	}

	public final void method1460(int i, int i_178_) {
		if (i_178_ != 3)
			method1448(109);
		anInt6561++;
		if (anInt6637 != i) {
			boolean bool;
			boolean bool_179_;
			int i_180_;
			if (i == 1) {
				i_180_ = 1;
				bool_179_ = true;
				bool = true;
			} else if (i != 2) {
				if ((i ^ 0xffffffff) != -129) {
					bool = true;
					bool_179_ = false;
					i_180_ = 0;
				} else {
					i_180_ = 3;
					bool_179_ = true;
					bool = true;
				}
			} else {
				i_180_ = 2;
				bool_179_ = false;
				bool = true;
			}
			if (!aBoolean6638 == bool) {
				OpenGL.glColorMask(bool, bool, bool, true);
				aBoolean6638 = bool;
			}
			if (aBoolean6635 == !bool_179_) {
				if (bool_179_)
					OpenGL.glEnable(3008);
				else
					OpenGL.glDisable(3008);
				aBoolean6635 = bool_179_;
			}
			if ((anInt6632 ^ 0xffffffff) != (i_180_ ^ 0xffffffff)) {
				if ((i_180_ ^ 0xffffffff) != -2) {
					if (i_180_ != 2) {
						if ((i_180_ ^ 0xffffffff) != -4)
							OpenGL.glDisable(3042);
						else {
							OpenGL.glEnable(3042);
							OpenGL.glBlendFunc(774, 1);
						}
					} else {
						OpenGL.glEnable(3042);
						OpenGL.glBlendFunc(1, 1);
					}
				} else {
					OpenGL.glEnable(3042);
					OpenGL.glBlendFunc(770, 771);
				}
				anInt6632 = i_180_;
			}
			anInt6637 = i;
			anInt6636 &= ~0x1c;
		}
	}

	public final void method1461(int i) {
		if (anInt6636 != 2) {
			method1446((byte) 112);
			method1478(false, (byte) -53);
			method1451(false, -31277);
			method1449(i + -35056, false);
			method1415(771, false);
			method1489(-2, -2);
			anInt6636 = 2;
		}
		anInt6497++;
		if (i != 34962)
			anInt6714 = -124;
	}

	private final void method1462(int i) {
		anInt6530++;
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(aClass336_Sub3_6641.method3899(-96), i);
		if (aBoolean6708)
			aClass73_6602.aClass339_Sub6_986.method3940(88);
		method1430((byte) 43);
		method1423((byte) 85);
	}

	public final void method1463(Class336_Sub3 class336_sub3, int i) {
		OpenGL.glPushMatrix();
		anInt6504++;
		if (i == 1)
			OpenGL.glMultMatrixf(class336_sub3.method3899(-52), 0);
	}

	public final void method1464(int i, int i_215_, int i_216_, byte b) {
		OpenGL.glTexEnvi(8960, i_216_ + 34176, i);
		if (b != -51)
			anInt6513 = -80;
		anInt6453++;
		OpenGL.glTexEnvi(8960, 34192 - -i_216_, i_215_);
	}

	public final void method1465(int i, int i_235_, int i_236_) {
		if (i_236_ != 16053)
			aClass69_6698 = null;
		anInt6690 = i_235_;
		anInt6699 = i;
		anInt6473++;
		method1429(2917);
		method1443((byte) 47);
	}

	public final int method1466(int i, int i_237_) {
		anInt6440++;
		if ((i_237_ ^ 0xffffffff) == -5122 || (i_237_ ^ 0xffffffff) == -5121)
			return 1;
		if (i < 126)
			return 51;
		if (i_237_ == 5123 || i_237_ == 5122)
			return 2;
		if (i_237_ == 5125 || i_237_ == 5124 || i_237_ == 5126)
			return 4;
		throw new IllegalArgumentException("");
	}

	public final Interface9 method1467(boolean bool, int i, byte[] bs, int i_247_, int i_248_) {
		anInt6448++;
		if (i_248_ >= -14)
			anInt6606 = 114;
		if (aBoolean6658 && (!bool || aBoolean6729))
			return new Class117_Sub2(this, i_247_, bs, i, bool);
		return new Class200_Sub1(this, i_247_, bs, i);
	}

	private final void method1468(int i) {
		Class254.aFloatArray3213[0] = aFloat6734 * aFloat6737;
		if (i < 7)
			anInt6599 = 69;
		Class254.aFloatArray3213[2] = aFloat6737 * aFloat6672;
		Class254.aFloatArray3213[1] = aFloat6707 * aFloat6737;
		anInt6492++;
		Class254.aFloatArray3213[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Class254.aFloatArray3213, 0);
	}

	private final void method1469(byte b) {
		if (b == 88) {
			if ((anInt6636 ^ 0xffffffff) != -2) {
				method1446((byte) 119);
				method1478(false, (byte) -53);
				method1451(false, -31277);
				method1449(-12, false);
				method1415(771, false);
				method1444(-2, null);
				method1489(-2, -2);
				method1434((byte) -93, 1);
				anInt6636 = 1;
			}
			anInt6456++;
		}
	}

	public final void method1470(int i) {
		if ((anInt6636 ^ 0xffffffff) != -9) {
			method1476(0);
			method1478(true, (byte) -53);
			method1449(-107, true);
			method1415(771, true);
			method1460(1, 3);
			anInt6636 = 8;
		}
		anInt6395++;
		if (i != 1)
			DA(4, -27, 45, -40);
	}

	public final int method1471(int i, int i_253_) {
		anInt6481++;
		if (i_253_ <= 84)
			return -128;
		if ((i ^ 0xffffffff) == -6407 || i == 6409)
			return 1;
		if ((i ^ 0xffffffff) != -6411 && (i ^ 0xffffffff) != -34847 && (i ^ 0xffffffff) != -34845) {
			if ((i ^ 0xffffffff) != -6408) {
				if (i == 6408 || i == 34847)
					return 4;
				if (i == 34843)
					return 6;
				if ((i ^ 0xffffffff) != -34843) {
					if ((i ^ 0xffffffff) != -6403) {
						if (i == 6401)
							return 1;
					} else
						return 3;
				} else
					return 8;
			} else
				return 3;
		} else
			return 2;
		throw new IllegalArgumentException("");
	}

	public final void method1472(int i, int i_254_, int i_255_, int i_256_) {
		OpenGL.glTexEnvi(8960, 34184 + i_254_, i_256_);
		anInt6445++;
		OpenGL.glTexEnvi(8960, 34200 + i_254_, i_255_);
		if (i > -27)
			aFloat6656 = -0.9195587F;
	}

	public final synchronized void method1473(int i, int i_257_, int i_258_) {
		anInt6527++;
		Node_Sub32 node_sub32 = new Node_Sub32(i_257_);
		node_sub32.aLong2797 = i;
		aClass312_6627.method3625((byte) -54, node_sub32);
		if (i_258_ != -22302)
			aClass298Array6403 = null;
	}

	public final void method1474(int i, int i_259_, int i_260_) {
		if ((anInt6727 ^ 0xffffffff) == -1) {
			boolean bool = false;
			if ((i_260_ ^ 0xffffffff) != (anInt6715 ^ 0xffffffff)) {
				OpenGL.glTexEnvi(8960, 34161, i_260_);
				anInt6715 = i_260_;
				bool = true;
			}
			if ((anInt6700 ^ 0xffffffff) != (i_259_ ^ 0xffffffff)) {
				OpenGL.glTexEnvi(8960, 34162, i_259_);
				bool = true;
				anInt6700 = i_259_;
			}
			if (bool)
				anInt6636 &= ~0x1d;
		} else {
			OpenGL.glTexEnvi(8960, 34161, i_260_);
			OpenGL.glTexEnvi(8960, 34162, i_259_);
		}
		anInt6550++;
	}

	private final void method1475(int i) {
		OpenGL.glDepthMask(aBoolean6633 && aBoolean6651);
		if (i != 0)
			HA(-39, -21, 41, 104, null);
		anInt6441++;
	}

	private final void method1476(int i) {
		if (anInt6686 != 2) {
			anInt6686 = 2;
			method1448(512);
			method1462(i);
			anInt6636 &= ~0x7;
		}
		anInt6577++;
		if (i != 0)
			k();
	}

	public final void method1477(byte b, int i, int i_299_, Interface1 interface1, int i_300_) {
		if (b <= 65)
			method1474(-126, 117, -59);
		anInt6394++;
		int i_301_ = interface1.method3((byte) -126);
		i *= method1466(127, i_301_);
		method1445(-30197, interface1);
		OpenGL.glDrawElements(i_299_, i_300_, i_301_, interface1.method1(32711) + i);
	}

	public final void method1478(boolean bool, byte b) {
		if (b != -53)
			method1422(-0.34129715F, -0.76085263F, 0.49800873F, 1.2883052F, 58);
		anInt6526++;
		if (bool == !aBoolean6646) {
			aBoolean6646 = bool;
			method1487(6479);
			anInt6636 &= ~0x1f;
		}
	}

	public final void method1479(int i, Interface11 interface11) {
		anInt6543++;
		if (i == 29630) {
			if (anInt6612 >= 3)
				throw new RuntimeException();
			if ((anInt6612 ^ 0xffffffff) <= -1)
				anInterface11Array6616[anInt6612].method28((byte) -106);
			anInterface11_6620 = anInterface11Array6616[++anInt6612] = interface11;
			anInterface11_6620.method33(i + -29226);
		}
	}

	private final void method1480(int i) {
		anInt6499++;
		aFloat6711 = -anInt6714 + anInt6644;
		aFloat6663 = -anInt6702 + anInt6696;
		aFloat6674 = -anInt6714 + anInt6733;
		aFloat6687 = -anInt6702 + anInt6745;
		if (i != 3657)
			aFloat6737 = -0.2419358F;
	}

	public final void method1481(Interface11 interface11, boolean bool) {
		anInt6478++;
		if ((anInt6612 ^ 0xffffffff) > -1 || anInterface11Array6616[anInt6612] != interface11)
			throw new RuntimeException();
		anInterface11Array6616[anInt6612--] = null;
		interface11.method28((byte) -106);
		if ((anInt6612 ^ 0xffffffff) <= -1) {
			anInterface11_6620 = anInterface11Array6616[anInt6612];
			anInterface11_6620.method33(404);
		} else
			anInterface11_6620 = null;
		if (bool != false)
			method1467(true, -84, null, -107, -44);
	}

	public final void method1482(byte b, Class69 class69, Class69 class69_320_, Class69 class69_321_, Class69 class69_322_) {
		if (class69_321_ != null) {
			method1408(3089, class69_321_.anInterface9_939);
			OpenGL.glVertexPointer(class69_321_.aByte942, class69_321_.aShort938, anInterface9_6647.method21(23144),
					anInterface9_6647.method23(28552) - -(long) class69_321_.aByte937);
			OpenGL.glEnableClientState(32884);
		} else
			OpenGL.glDisableClientState(32884);
		anInt6415++;
		if (class69_320_ == null)
			OpenGL.glDisableClientState(32885);
		else {
			method1408(3089, class69_320_.anInterface9_939);
			OpenGL.glNormalPointer(class69_320_.aShort938, anInterface9_6647.method21(23144),
					anInterface9_6647.method23(28552) - -(long) class69_320_.aByte937);
			OpenGL.glEnableClientState(32885);
		}
		if (class69 != null) {
			method1408(3089, class69.anInterface9_939);
			OpenGL.glColorPointer(class69.aByte942, class69.aShort938, anInterface9_6647.method21(23144),
					anInterface9_6647.method23(28552) - -(long) class69.aByte937);
			OpenGL.glEnableClientState(32886);
		} else
			OpenGL.glDisableClientState(32886);
		if (class69_322_ == null)
			OpenGL.glDisableClientState(32888);
		else {
			method1408(3089, class69_322_.anInterface9_939);
			OpenGL.glTexCoordPointer(class69_322_.aByte942, class69_322_.aShort938, anInterface9_6647.method21(23144),
					anInterface9_6647.method23(28552) - -(long) class69_322_.aByte937);
			OpenGL.glEnableClientState(32888);
		}
	}

	public final void method1483(boolean bool, int i) {
		anInt6551++;
		if (bool == !aBoolean6716) {
			aBoolean6716 = bool;
			method1452(-114);
		}
		if (i != 1028)
			method1430((byte) -21);
	}

	public final synchronized void method1485(long l, int i) {
		anInt6515++;
		Node node = new Node();
		node.aLong2797 = l;
		aClass312_6631.method3625((byte) -54, node);
		if (i != 1015629296)
			method1428(-126, (byte) 94);
	}

	private final void method1486(byte b) {
		anInt6446++;
		if (anInt6686 != 3) {
			anInt6686 = 3;
			method1419(false);
			method1462(0);
			anInt6636 &= ~0x7;
		}
	}

	private final void method1487(int i) {
		if (i != 6479)
			u();
		anInt6447++;
		if (aBoolean6646 && (anInt6691 ^ 0xffffffff) <= -1)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	private final void method1488(byte b) {
		if (b < 66)
			a(-18, 97, 36, 93, -99, -68, (aa) null, 50, -73);
		anOpenGL6423.a();
		anInt6597++;
	}

	public final void method1489(int i, int i_330_) {
		method1418(true, true, i);
		anInt6583++;
		if (i_330_ != -2)
			anInt6714 = -45;
	}

	@Override
	public final Class336 n() {
		anInt6521++;
		return aClass336_Sub3_6639;
	}

	@Override
	public final int[] na(int i, int i_331_, int i_332_, int i_333_) {
		anInt6549++;
		int[] is = new int[i_332_ * i_333_];
		for (int i_334_ = 0; i_334_ < i_333_; i_334_++)
			OpenGL.glReadPixelsi(i, anInt6567 - (i_331_ - -i_334_), i_332_, 1, 32993, anInt6740, is, i_334_ * i_332_);
		return is;
	}

	@Override
	public final boolean o() {
		anInt6407++;
		if (aNode_Sub23_Sub1_6594 == null || (anInt6599 ^ 0xffffffff) < -2 && !aBoolean6721)
			return false;
		return true;
	}

	@Override
	public final boolean p() {
		anInt6508++;
		return true;
	}

	@Override
	public final void P(int i, int i_302_, int i_303_, int i_304_, int i_305_) {
		method1469((byte) 88);
		anInt6462++;
		method1460(i_305_, 3);
		float f = i + 0.35F;
		OpenGL.glColor4ub((byte) (i_304_ >> 16), (byte) (i_304_ >> 8), (byte) i_304_, (byte) (i_304_ >> 24));
		float f_306_ = i_302_ + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_306_);
		OpenGL.glVertex2f(f, f_306_ + i_303_);
		OpenGL.glEnd();
	}

	@Override
	public final void pa() {
		aBoolean6676 = false;
		anInt6449++;
	}

	@Override
	public final void q() {
		anInt6490++;
	}

	@Override
	public final void Q(int i, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_, byte[] bs, int i_313_, int i_314_) {
		anInt6444++;
		float f;
		float f_315_;
		if (aClass169_Sub2_Sub1_6722 == null || i_309_ > aClass169_Sub2_Sub1_6722.anInt8795
				|| (i_310_ ^ 0xffffffff) < (aClass169_Sub2_Sub1_6722.anInt8803 ^ 0xffffffff)) {
			aClass169_Sub2_Sub1_6722 = Class320_Sub21.method3761(i_310_, 6406, 8222, bs, 6406, this, i_309_, false);
			aClass169_Sub2_Sub1_6722.method1776(false, 26, false);
			f_315_ = aClass169_Sub2_Sub1_6722.aFloat10568;
			f = aClass169_Sub2_Sub1_6722.aFloat10567;
		} else {
			aClass169_Sub2_Sub1_6722.method1775(0, (byte) 92, 6406, i_310_, i_309_, bs, false, 0, 0, 0);
			f = i_309_ * aClass169_Sub2_Sub1_6722.aFloat10567 / aClass169_Sub2_Sub1_6722.anInt8795;
			f_315_ = i_310_ * aClass169_Sub2_Sub1_6722.aFloat10568 / aClass169_Sub2_Sub1_6722.anInt8803;
		}
		method1461(34962);
		method1444(-2, aClass169_Sub2_Sub1_6722);
		method1460(i_314_, 3);
		OpenGL.glColor4ub((byte) (i_311_ >> 16), (byte) (i_311_ >> 8), (byte) i_311_, (byte) (i_311_ >> 24));
		method1428(i_312_, (byte) 69);
		method1474(22, 34165, 34165);
		method1464(34166, 768, 0, (byte) -51);
		method1464(5890, 770, 2, (byte) -51);
		method1472(-49, 0, 770, 34166);
		method1472(-112, 2, 770, 5890);
		float f_316_ = i;
		float f_317_ = i_308_;
		float f_318_ = f_316_ + i_309_;
		OpenGL.glBegin(7);
		float f_319_ = i_310_ + f_317_;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_316_, f_317_);
		OpenGL.glTexCoord2f(0.0F, f);
		OpenGL.glVertex2f(f_316_, f_319_);
		OpenGL.glTexCoord2f(f_315_, f);
		OpenGL.glVertex2f(f_318_, f_319_);
		OpenGL.glTexCoord2f(f_315_, 0.0F);
		OpenGL.glVertex2f(f_318_, f_317_);
		OpenGL.glEnd();
		method1464(5890, 768, 0, (byte) -51);
		method1464(34166, 770, 2, (byte) -51);
		method1472(-123, 0, 770, 5890);
		method1472(-123, 2, 770, 34166);
	}

	@Override
	public final boolean r() {
		anInt6586++;
		return true;
	}

	@Override
	public final int r(int i, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
		anInt6410++;
		float f = i_160_ * aClass336_Sub3_6639.aFloat8604
				+ (aClass336_Sub3_6639.aFloat8605 * i + i_159_ * aClass336_Sub3_6639.aFloat8593)
				+ aClass336_Sub3_6639.aFloat8615;
		float f_165_ = i_161_ * aClass336_Sub3_6639.aFloat8605 + aClass336_Sub3_6639.aFloat8593 * i_162_
				+ aClass336_Sub3_6639.aFloat8604 * i_163_ + aClass336_Sub3_6639.aFloat8615;
		int i_166_ = 0;
		if (anInt6693 > f && f_165_ < anInt6693)
			i_166_ |= 0x10;
		else if (f > anInt6705 && f_165_ > anInt6705)
			i_166_ |= 0x20;
		int i_167_ = (int) (anInt6667 * (aClass336_Sub3_6639.aFloat8594 + (i_160_ * aClass336_Sub3_6639.aFloat8617
				+ (aClass336_Sub3_6639.aFloat8596 * i + aClass336_Sub3_6639.aFloat8608 * i_159_))) / i_164_);
		int i_168_ = (int) (anInt6667 * (aClass336_Sub3_6639.aFloat8594 + (i_162_ * aClass336_Sub3_6639.aFloat8608
				+ i_161_ * aClass336_Sub3_6639.aFloat8596 + i_163_ * aClass336_Sub3_6639.aFloat8617)) / i_164_);
		if (!(aFloat6711 > i_167_) || !(aFloat6711 > i_168_)) {
			if (i_167_ > aFloat6674 && i_168_ > aFloat6674)
				i_166_ |= 0x2;
		} else
			i_166_ |= 0x1;
		int i_169_ = (int) (anInt6730 * (aClass336_Sub3_6639.aFloat8609 + (aClass336_Sub3_6639.aFloat8625 * i
				+ i_159_ * aClass336_Sub3_6639.aFloat8607 + i_160_ * aClass336_Sub3_6639.aFloat8591)) / i_164_);
		int i_170_ = (int) (anInt6730
				* (i_161_ * aClass336_Sub3_6639.aFloat8625 + i_162_ * aClass336_Sub3_6639.aFloat8607
						+ i_163_ * aClass336_Sub3_6639.aFloat8591 + aClass336_Sub3_6639.aFloat8609)
				/ i_164_);
		if (i_169_ < aFloat6687 && aFloat6687 > i_170_)
			i_166_ |= 0x4;
		else if (i_169_ > aFloat6663 && aFloat6663 < i_170_)
			i_166_ |= 0x8;
		return i_166_;
	}

	@Override
	public final void ra(int i, int i_0_, int i_1_, int i_2_) {
		aBoolean6676 = true;
		anInt6731 = i_0_;
		anInt6689 = i;
		anInt6697 = i_1_;
		anInt6739 = i_2_;
		anInt6563++;
	}

	@Override
	public final boolean s() {
		anInt6536++;
		return false;
	}

	@Override
	public final boolean t() {
		anInt6420++;
		if (!aBoolean6723 || w() && !aBoolean6721)
			return false;
		return true;
	}

	@Override
	public final void T(int i, int i_125_, int i_126_, int i_127_) {
		anInt6458++;
		if (anInt6733 > i_126_)
			anInt6733 = i_126_;
		if (i > anInt6644)
			anInt6644 = i;
		if ((anInt6696 ^ 0xffffffff) < (i_127_ ^ 0xffffffff))
			anInt6696 = i_127_;
		if ((i_125_ ^ 0xffffffff) < (anInt6745 ^ 0xffffffff))
			anInt6745 = i_125_;
		OpenGL.glEnable(3089);
		method1480(3657);
		method1443((byte) 47);
	}

	@Override
	public final void u() {
		anInt6419++;
		for (Node node = aClass312_6608.method3613(65280); node != null; node = aClass312_6608.method3620(16776960))
			((za_Sub1) node).method2993(false);
		if (aClass247_6600 != null)
			aClass247_6600.method3080(false);
		if (anOpenGL6423 != null) {
			method1488((byte) 120);
			Enumeration<Canvas> enumeration = aHashtable6475.keys();
			while (enumeration.hasMoreElements()) {
				java.awt.Canvas canvas = enumeration.nextElement();
				Long var_long = aHashtable6475.get(canvas);
				anOpenGL6423.releaseSurface(canvas, var_long.longValue());
			}
			anOpenGL6423.release();
			anOpenGL6423 = null;
		}
		if (aBoolean6610) {
			Class160.method1727(false, (byte) 83, true);
			aBoolean6610 = false;
		}
	}

	@Override
	public final void U(int i, int i_154_, int i_155_, int i_156_, int i_157_) {
		anInt6510++;
		method1469((byte) 88);
		method1460(i_157_, 3);
		float f = 0.35F + i;
		float f_158_ = i_154_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_156_ >> 16), (byte) (i_156_ >> 8), (byte) i_156_, (byte) (i_156_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_158_);
		OpenGL.glVertex2f(i_155_ + f, f_158_);
		OpenGL.glEnd();
	}

	@Override
	public final void v() {
		anInt6507++;
		if (!aBoolean6719) {
			if (aBoolean6718) {
				aGLSprite_Sub1_6619.method1195(0, 0, anInt6474, anInt6567, 0, 0);
				anOpenGL6423.setSurface(aLong6476);
			} else
				throw new RuntimeException("");
		} else {
			if (anInterface11_6620 != aClass382_6614)
				throw new RuntimeException();
			aClass382_6614.method4175(0, -25845);
			aClass382_6614.method4175(8, -25845);
			method1436(aClass382_6614, (byte) 20);
		}
		aGLSprite_Sub1_6619 = null;
		anInt6474 = anInt6469;
		anInt6567 = anInt6513;
		method1424(8);
		method1429(2917);
		la();
	}

	@Override
	public final boolean w() {
		anInt6574++;
		if (aNode_Sub23_Sub1_6594 == null || !aNode_Sub23_Sub1_6594.method2634(16383))
			return false;
		return true;
	}

	@Override
	public final boolean x() {
		anInt6442++;
		return true;
	}

	@Override
	public final void X(int i) {
		anInt6528++;
		anInt6611 = 0;
		while ((i ^ 0xffffffff) < -2) {
			i >>= 1;
			anInt6611++;
		}
		anInt6606 = 1 << anInt6611;
	}

	@Override
	public final void xa(float f) {
		anInt6412++;
		if (aFloat6737 != f) {
			aFloat6737 = f;
			method1468(118);
		}
	}

	@Override
	public final int XA() {
		anInt6522++;
		return anInt6705;
	}

	@Override
	public final Class336 y() {
		anInt6576++;
		return new Class336_Sub3();
	}

	@Override
	public final int[] Y() {
		anInt6489++;
		return new int[] { anInt6714, anInt6702, anInt6667, anInt6730 };
	}

	@Override
	public final void ya() {
		method1415(771, true);
		anInt6465++;
		OpenGL.glClear(256);
	}

	@Override
	public final boolean z() {
		anInt6590++;
		return aClass73_6602.method748(3, (byte) 123);
	}

	@Override
	public final void za(int i, int i_286_, int i_287_, int i_288_, int i_289_) {
		anInt6506++;
		if ((i_287_ ^ 0xffffffff) > -1)
			i_287_ = -i_287_;
		if ((i + i_287_ ^ 0xffffffff) <= (anInt6644 ^ 0xffffffff) && -i_287_ + i <= anInt6733
				&& (anInt6745 ^ 0xffffffff) >= (i_286_ - -i_287_ ^ 0xffffffff) && anInt6696 >= -i_287_ + i_286_) {
			method1469((byte) 88);
			method1460(i_289_, 3);
			OpenGL.glColor4ub((byte) (i_288_ >> 16), (byte) (i_288_ >> 8), (byte) i_288_, (byte) (i_288_ >> 24));
			float f = i + 0.35F;
			float f_290_ = 0.35F + i_286_;
			int i_291_ = i_287_ << 1;
			if (aFloat6671 > i_291_) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f + 1.0F, f_290_ + 1.0F);
				OpenGL.glVertex2f(f + 1.0F, -1.0F + f_290_);
				OpenGL.glVertex2f(-1.0F + f, f_290_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_290_ + 1.0F);
				OpenGL.glEnd();
			} else if (!(aFloat6670 >= i_291_)) {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f, f_290_);
				int i_292_ = 262144 / (i_287_ * 6);
				if ((i_292_ ^ 0xffffffff) >= -65)
					i_292_ = 64;
				else if (i_292_ > 512)
					i_292_ = 512;
				i_292_ = Class215.method2072(i_292_, true);
				OpenGL.glVertex2f(i_287_ + f, f_290_);
				for (int i_293_ = 16384 - i_292_; (i_293_ ^ 0xffffffff) < -1; i_293_ -= i_292_)
					OpenGL.glVertex2f(GameStub.aFloatArray39[i_293_] * i_287_ + f,
							GameStub.aFloatArray42[i_293_] * i_287_ + f_290_);
				OpenGL.glVertex2f(f + i_287_, f_290_);
				OpenGL.glEnd();
			} else {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize(i_291_);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f, f_290_);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			}
		}
	}

	@Override
	public final void ZA(int i, float f, float f_173_, float f_174_, float f_175_, float f_176_) {
		anInt6483++;
		boolean bool = (i ^ 0xffffffff) != (anInt6694 ^ 0xffffffff);
		if (bool || aFloat6645 != f || f_173_ != aFloat6648) {
			aFloat6645 = f;
			anInt6694 = i;
			aFloat6648 = f_173_;
			if (bool) {
				aFloat6672 = (anInt6694 & 0xff) / 255.0F;
				aFloat6707 = (anInt6694 & 0xff00) / 65280.0F;
				aFloat6734 = (0xff0000 & anInt6694) / 1.671168E7F;
				method1468(8);
			}
			method1409(-1);
		}
		if (aFloatArray6666[0] != f_174_ || aFloatArray6666[1] != f_175_ || aFloatArray6666[2] != f_176_) {
			aFloatArray6666[1] = f_175_;
			aFloatArray6666[2] = f_176_;
			aFloatArray6666[0] = f_174_;
			aFloatArray6650[0] = -f_174_;
			aFloatArray6650[2] = -f_176_;
			aFloatArray6650[1] = -f_175_;
			float f_177_ = (float) (1.0 / Math.sqrt(f_174_ * f_174_ + f_175_ * f_175_ + f_176_ * f_176_));
			aFloatArray6664[0] = f_174_ * f_177_;
			aFloatArray6664[1] = f_177_ * f_175_;
			aFloatArray6664[2] = f_176_ * f_177_;
			aFloatArray6744[0] = -aFloatArray6664[0];
			aFloatArray6744[1] = -aFloatArray6664[1];
			aFloatArray6744[2] = -aFloatArray6664[2];
			method1430((byte) 90);
			anInt6717 = (int) (f_176_ * 256.0F / f_175_);
			anInt6732 = (int) (f_174_ * 256.0F / f_175_);
		}
	}
}
