



/* Npc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

public class NPC extends Actor {
	public static Class336 aClass336_11113;
	public static int anInt11098;
	public static int anInt11101;
	public static int anInt11102;
	public static int anInt11103;
	public static int anInt11104;
	public static int anInt11105;
	public static int anInt11106;
	public static int anInt11108;
	public static int anInt11109;
	public static int anInt11110;
	public static int anInt11111;
	public static int anInt11112;
	public static int anInt11114;
	public static int anInt11115;
	public static int anInt11116;
	public static int anInt11117;
	public static int anInt11119;
	public static int anInt11120;
	public static int anInt11121;
	public static int anInt11123;
	public static int anInt11125;
	public String toolTip;

	public static void method872(boolean bool) {
		if (bool != false)
			method880((byte) -95);
		aClass336_11113 = null;
	}

	public static final void method874() {
		for (int i = 0; i < Class63.anInt923; i++) {
			Mobile mobile = Node_Sub52.aMobileArray7648[i];
			Class290.method3418(mobile, true);
			Node_Sub52.aMobileArray7648[i] = null;
		}
		Class63.anInt923 = 0;
	}

	public static final void method880(byte b) {
		anInt11106++;
		synchronized (Class158.aClient1983) {
			if (DrawableModel.aFrame907 != null)
				return;
			java.awt.Container container;
			if (Node_Sub29.aFrame7344 == null) {
				if (Class96.mainGameApplet != null)
					container = Class96.mainGameApplet;
				else
					container = Class82.aGameStub1123;
			} else
				container = Node_Sub29.aFrame7344;
			Class36.anInt542 = container.getSize().width;
			CacheNode_Sub3.anInt9441 = container.getSize().height;
			if (container == Node_Sub29.aFrame7344) {
				Insets insets = Node_Sub29.aFrame7344.getInsets();
				CacheNode_Sub3.anInt9441 -= insets.top + insets.bottom;
				Class36.anInt542 -= insets.right + insets.left;
			}
			if (Class188_Sub2_Sub1.getDisplayMode(b + -8) != 1)
				Class170.method1789(-64);
			else {
				Class131.anInt5447 = 0;
				Class205.screenHeight = Class257.anInt3244;
				Class270_Sub1.anInt8033 = (-Node_Sub38_Sub12.anInt10225 + Class36.anInt542) / 2;
				Class360.screenWidth = Node_Sub38_Sub12.anInt10225;
			}
			if (Node_Sub38_Sub1.aClass329_10086 != Class240.aClass329_2943)
				if (Class360.screenWidth < 1024 && Class205.screenHeight < 768) {
					/* empty */
				}
			Node_Sub38_Sub20.aCanvas10309.setSize(Class360.screenWidth, Class205.screenHeight);
			if (Class93.graphicsToolkit != null)
				if (!Class71.aBoolean967)
					Class93.graphicsToolkit.a(Node_Sub38_Sub20.aCanvas10309, Class360.screenWidth,
							Class205.screenHeight);
				else
					Index.method3535(Node_Sub38_Sub20.aCanvas10309, true);
			if (container != Node_Sub29.aFrame7344)
				Node_Sub38_Sub20.aCanvas10309.setLocation(Class270_Sub1.anInt8033, Class131.anInt5447);
			else {
				Insets insets = Node_Sub29.aFrame7344.getInsets();
				Node_Sub38_Sub20.aCanvas10309.setLocation(insets.left - -Class270_Sub1.anInt8033,
						insets.top + Class131.anInt5447);
			}
			if ((Class320_Sub15.WINDOWS_PANE_ID ^ 0xffffffff) != 0)
				Node_Sub29_Sub3.method2717(1, true);
			Node_Sub36_Sub1.method2758(100);
		}
		if (b != 11)
			aClass336_11113 = null;
	}

	protected Class361 aClass361_11118;
	protected int anInt11100;
	protected int anInt11107 = -1;
	protected int anInt11124;
	protected int anInt11126;

	protected NPCDefinition defs;

	protected int combatLevel;

	protected String name;

	public NPC() {
		anInt11100 = -1;
		anInt11124 = 1;
		anInt11126 = 1;
	}

	NPC(int i) {
		super(i);
		anInt11100 = -1;
		anInt11124 = 1;
		anInt11126 = 1;
	}

	@Override
	public final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt11101++;
		if (defs == null || !method875(2048, true, graphicstoolkit))
			return null;
		Class336 class336 = graphicstoolkit.A();
		int i_9_ = aClass99_10893.method1086(16383);
		class336.method3860(i_9_);
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[plane][anInt5934 >> Class36.anInt549][anInt5940 >> Class36.anInt549];
		if (class261 == null || class261.anAnimable_Sub1_3317 == null)
			anInt10849 -= anInt10849 / 10.0F;
		else {
			int i_10_ = anInt10849 - class261.anAnimable_Sub1_3317.aShort9102;
			anInt10849 -= i_10_ / 10.0F;
		}
		class336.method3863(anInt5934, -anInt10849 + (-20 + anInt5937), anInt5940);
		Class259 class259 = this.method868((byte) -123);
		NPCDefinition npcdefinition = defs.anIntArray2827 != null
				? defs.method2999(65535, Class24.aClass275_442) : defs;
		aBoolean10903 = false;
		EntityNode_Sub6 entitynode_sub6 = null;
		if (Class213.aNode_Sub27_2512.aClass320_Sub7_7308.method3708(false) == 1 && npcdefinition.aBoolean2875
				&& class259.aBoolean3267) {
			Animator animator = !anAnimator10876.method245(-126) || !anAnimator10876.method242((byte) -77) ? null
					: anAnimator10876;
			Animator animator_11_ = anAnimator10860.method245(-128) && (!aBoolean10867 || animator == null)
					? anAnimator10860 : null;
			DrawableModel drawablemodel = CacheNode_Sub14_Sub2.method2356(0xff & defs.aByte2868,
					aDrawableModelArray10909[0], anInt10862, defs.aShort2871 & 0xffff, anInt10832,
					defs.anInt2811, true, graphicstoolkit, 0xff & defs.aByte2877,
					animator_11_ != null ? animator_11_ : animator, anInt10872, i_9_,
					defs.aShort2863 & 0xffff);
			if (drawablemodel != null) {
				entitynode_sub6 = Class345.method3972(method881(75), (byte) -71, aDrawableModelArray10909.length + 1);
				aBoolean10903 = true;
				graphicstoolkit.C(false);
				if (!Node_Sub15_Sub10.aBoolean9850)
					drawablemodel.method611(class336,
							entitynode_sub6.anEntityNode_Sub5Array5995[aDrawableModelArray10909.length], 0);
				else
					drawablemodel.method622(class336,
							entitynode_sub6.anEntityNode_Sub5Array5995[aDrawableModelArray10909.length],
							Class308.anInt3912, 0);
				graphicstoolkit.C(true);
			}
		}
		class336.method3860(i_9_);
		class336.method3863(anInt5934, -anInt10849 + anInt5937 + -5, anInt5940);
		if (entitynode_sub6 == null)
			entitynode_sub6 = Class345.method3972(method881(-20), (byte) -76, aDrawableModelArray10909.length);
		this.method870(graphicstoolkit, (byte) 45, false, aDrawableModelArray10909, class336);
		if (Node_Sub15_Sub10.aBoolean9850) {
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (aDrawableModelArray10909.length ^ 0xffffffff); i_12_++)
				if (aDrawableModelArray10909[i_12_] != null)
					aDrawableModelArray10909[i_12_].method622(class336,
							entitynode_sub6.anEntityNode_Sub5Array5995[i_12_], Class308.anInt3912, 0);
		} else
			for (int i_13_ = 0; i_13_ < aDrawableModelArray10909.length; i_13_++)
				if (aDrawableModelArray10909[i_13_] != null)
					aDrawableModelArray10909[i_13_].method611(class336,
							entitynode_sub6.anEntityNode_Sub5Array5995[i_13_], 0);
		if (anEntityNode_Sub4_10902 != null) {
			Class198 class198 = anEntityNode_Sub4_10902.method954();
			if (!Node_Sub15_Sub10.aBoolean9850)
				graphicstoolkit.a(class198);
			else
				graphicstoolkit.a(class198, Class308.anInt3912);
		}
		for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (aDrawableModelArray10909.length ^ 0xffffffff); i_15_++) {
			if (aDrawableModelArray10909[i_15_] != null)
				aBoolean10903 |= aDrawableModelArray10909[i_15_].F();
			aDrawableModelArray10909[i_15_] = null;
		}
		anInt10815 = LoadingBarStage.anInt1412;
		return entitynode_sub6;
	}

	@Override
	public final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (i >= -93)
			method871(98);
		anInt11102++;
		return null;
	}

	@Override
	public final boolean method810(int i, int i_2_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt11104++;
		if (defs == null || !method875(131072, true, graphicstoolkit))
			return false;
		Class336 class336 = graphicstoolkit.A();
		int i_3_ = aClass99_10893.method1086(16383);
		class336.method3860(i_3_);
		class336.method3863(anInt5934, anInt5937, anInt5940);
		boolean bool_4_ = bool;
		for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (aDrawableModelArray10909.length ^ 0xffffffff); i_5_++)
			if (aDrawableModelArray10909[i_5_] != null) {
				boolean bool_6_ = (defs.anInt2831 ^ 0xffffffff) < -1
						|| ((defs.anInt2803 ^ 0xffffffff) == 0 ? defs.anInt2811 == 1
								: (defs.anInt2803 ^ 0xffffffff) == -2);
				boolean bool_7_;
				if (Node_Sub15_Sub10.aBoolean9850)
					bool_7_ = aDrawableModelArray10909[i_5_].method621(i_2_, i, class336, bool_6_,
							defs.anInt2831, Class308.anInt3912);
				else
					bool_7_ = aDrawableModelArray10909[i_5_].method624(i_2_, i, class336, bool_6_,
							defs.anInt2831);
				if (bool_7_) {
					bool_4_ = true;
					break;
				}
			}
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (aDrawableModelArray10909.length ^ 0xffffffff); i_8_++)
			aDrawableModelArray10909[i_8_] = null;
		return bool_4_;
	}

	@Override
	public final void method811(int i) {
		anInt11123++;
		if (i != 27811)
			method872(true);
		throw new IllegalStateException();
	}

	@Override
	public final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_0_, byte b, int i_1_,
			Animable animable) {
		anInt11112++;
		if (b <= 101)
			method880((byte) 99);
		throw new IllegalStateException();
	}

	@Override
	public final int method818(byte b) {
		anInt11098++;
		if (defs == null)
			return 0;
		return defs.anInt2831;
	}

	@Override
	public final void method820(GraphicsToolkit graphicstoolkit, int i) {
		anInt11116++;
		if (defs != null && (aBoolean10906 || method875(0, true, graphicstoolkit))) {
			Class336 class336 = graphicstoolkit.A();
			class336.method3860(aClass99_10893.method1086(16383));
			class336.method3863(anInt5934, anInt5937 + -20, anInt5940);
			this.method870(graphicstoolkit, (byte) 45, aBoolean10906, aDrawableModelArray10909, class336);
			for (int i_38_ = 0; i_38_ < aDrawableModelArray10909.length; i_38_++)
				aDrawableModelArray10909[i_38_] = null;
			if (i != -5)
				method809(null, -21);
		}
	}

	@Override
	public final boolean method821(int i) {
		anInt11119++;
		if (i != 0)
			method873((byte) -51);
		return false;
	}

	@Override
	public final int method850(byte b) {
		if (b <= 46)
			return -127;
		anInt11125++;
		if (defs.anIntArray2827 != null) {
			NPCDefinition npcdefinition = defs.method2999(65535, Class24.aClass275_442);
			if (npcdefinition != null && (npcdefinition.anInt2804 ^ 0xffffffff) != 0)
				return npcdefinition.anInt2804;
		}
		if (defs.anInt2804 == -1)
			return super.method850((byte) 47);
		return defs.anInt2804;
	}

	@Override
	public final int method855(byte b) {
		anInt11108++;
		if (b >= -48)
			method821(117);
		if (defs.anIntArray2827 != null) {
			NPCDefinition npcdefinition = defs.method2999(65535, Class24.aClass275_442);
			if (npcdefinition != null && (npcdefinition.anInt2814 ^ 0xffffffff) != 0)
				return npcdefinition.anInt2814;
		}
		return defs.anInt2814;
	}

	@Override
	public final boolean method862(byte b) {
		anInt11103++;
		if (b != -93)
			aClass336_11113 = null;
		return CacheNode_Sub4.aClass1_9466.aBoolean105;
	}

	@Override
	public final Class59 method869(int i) {
		anInt11111++;
		if (i != -3109)
			return null;
		if (aClass59_10861 != null && aClass59_10861.aString877 == null)
			return null;
		return aClass59_10861;
	}

	@Override
	public final int method871(int i) {
		anInt11115++;
		if (defs.anIntArray2827 != null) {
			NPCDefinition npcdefinition = defs.method2999(i + 65535, Class24.aClass275_442);
			if (npcdefinition != null && npcdefinition.anInt2837 != -1)
				return npcdefinition.anInt2837;
		}
		if (i != 0)
			anInt11107 = -66;
		return defs.anInt2837;
	}

	public final boolean method873(byte b) {
		anInt11121++;
		if (defs == null)
			return false;
		return true;
	}

	private final boolean method875(int i, boolean bool, GraphicsToolkit toolkit) {
		anInt11114++;
		int i_16_ = i;
		Class259 class259 = this.method868((byte) -127);
		Animator animator = anAnimator10876.method245(-124) && !anAnimator10876.method242((byte) -77) ? anAnimator10876
				: null;
		Animator animator_17_ = !anAnimator10860.method245(-128) || aBoolean10867 && animator != null ? null
				: anAnimator10860;
		int i_18_ = class259.anInt3261;
		int i_19_ = class259.anInt3266;
		if ((i_18_ ^ 0xffffffff) != -1 || i_19_ != 0 || class259.anInt3250 != 0 || class259.anInt3285 != 0)
			i |= 0x7;
		boolean bool_20_ = aByte10888 != 0 && anInt10895 <= Class174.clientCycle
				&& (Class174.clientCycle ^ 0xffffffff) > (anInt10882 ^ 0xffffffff);
		if (bool_20_)
			i |= 0x80000;
		int i_21_ = aClass99_10893.method1086(16383);
		DrawableModel drawablemodel = aDrawableModelArray10909[0] = defs.prepareModel(
				Class24.aClass275_442, toolkit, InputStream_Sub2.aClass281_83, (byte) 61, animator, i_21_,
				anIntArray10881, aClass361_11118, animator_17_, i, anAnimableAnimator_Sub1Array10894);
		if (drawablemodel == null)
			return false;
		anInt10875 = drawablemodel.fa();
		anInt10844 = drawablemodel.ma();
		this.method857(drawablemodel, false);
		if ((i_18_ ^ 0xffffffff) != -1 || (i_19_ ^ 0xffffffff) != -1) {
			this.method865(i_21_, class259.anInt3263, class259.anInt3291, i_18_, i_19_, -119);
			if (anInt10872 != 0)
				aDrawableModelArray10909[0].FA(anInt10872);
			if ((anInt10862 ^ 0xffffffff) != -1)
				aDrawableModelArray10909[0].VA(anInt10862);
			if (anInt10832 != 0)
				aDrawableModelArray10909[0].H(0, anInt10832, 0);
		} else
			this.method865(i_21_, 0, 0, this.getSize((byte) 116) << 9, this.getSize((byte) 79) << 9, -86);
		if (bool_20_)
			drawablemodel.method626(aByte10896, aByte10878, aByte10884, aByte10888 & 0xff);
		if (bool != true)
			return true;
		this.method848(i_16_, i_19_, toolkit, class259, i_21_, i_18_, -69);
		return true;
	}

	public final void method876(int i, int i_22_, byte b) {
		anInt11117++;
		int dx = scenePositionXQueue[0];
		if (b < -95) {
			int dy = scenePositionYQueue[0];
			if ((i_22_ ^ 0xffffffff) == -1)
				dy++;
			if ((i_22_ ^ 0xffffffff) == -2) {
				dy++;
				dx++;
			}
			if ((i_22_ ^ 0xffffffff) == -3)
				dx++;
			if (i_22_ == 3) {
				dy--;
				dx++;
			}
			if (i_22_ == 4)
				dy--;
			if ((i_22_ ^ 0xffffffff) == -6) {
				dy--;
				dx--;
			}
			if ((i_22_ ^ 0xffffffff) == -7)
				dx--;
			if (i_22_ == 7) {
				dx--;
				dy++;
			}
			if (anAnimator10876.method245(-124)
					&& (anAnimator10876.method243((byte) -24).anInt718 ^ 0xffffffff) == -2) {
				anIntArray10817 = null;
				anAnimator10876.method249(true, -1);
			}
			for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (aClass165Array10886.length ^ 0xffffffff); i_25_++)
				if ((aClass165Array10886[i_25_].graphicsId ^ 0xffffffff) != 0) {
					Login class195 = Class16.aClass101_228.method1090(103, aClass165Array10886[i_25_].graphicsId);
					if (class195.aBoolean2402 && class195.anInt2394 != -1
							&& (Class18.aClass37_306.method395(class195.anInt2394, (byte) -102).anInt718
									^ 0xffffffff) == -2) {
						aClass165Array10886[i_25_].anAnimator2026.method249(true, -1);
						aClass165Array10886[i_25_].graphicsId = -1;
					}
				}
			if (anInt10904 < scenePositionXQueue.length - 1)
				anInt10904++;
			for (int i_26_ = anInt10904; i_26_ > 0; i_26_--) {
				scenePositionXQueue[i_26_] = scenePositionXQueue[i_26_ - 1];
				scenePositionYQueue[i_26_] = scenePositionYQueue[i_26_ + -1];
				movementTypeQueue[i_26_] = movementTypeQueue[-1 + i_26_];
			}
			scenePositionXQueue[0] = dx;
			scenePositionYQueue[0] = dy;
			movementTypeQueue[0] = (byte) i;
		}
	}

	public final void method877(int i, boolean bool, int i_27_, int i_28_, int i_29_, int i_30_) {
		if (i != -15694)
			method862((byte) 31);
		plane = aByte5931 = (byte) i_29_;
		anInt11109++;
		if (Class238.method3021(i_27_, i_28_, -23))
			aByte5931++;
		if (anAnimator10876.method245(-127) && (anAnimator10876.method243((byte) -24).anInt718 ^ 0xffffffff) == -2) {
			anIntArray10817 = null;
			anAnimator10876.method249(true, -1);
		}
		for (int i_31_ = 0; i_31_ < aClass165Array10886.length; i_31_++)
			if ((aClass165Array10886[i_31_].graphicsId ^ 0xffffffff) != 0) {
				Login class195 = Class16.aClass101_228.method1090(i ^ 0x3d20, aClass165Array10886[i_31_].graphicsId);
				if (class195.aBoolean2402 && class195.anInt2394 != -1
						&& Class18.aClass37_306.method395(class195.anInt2394, (byte) -83).anInt718 == 1) {
					aClass165Array10886[i_31_].anAnimator2026.method249(true, -1);
					aClass165Array10886[i_31_].graphicsId = -1;
				}
			}
		if (!bool) {
			int i_32_ = i_28_ + -scenePositionXQueue[0];
			int i_33_ = -scenePositionYQueue[0] + i_27_;
			if (i_32_ >= -8 && i_32_ <= 8 && i_33_ >= -8 && (i_33_ ^ 0xffffffff) >= -9) {
				if (scenePositionXQueue.length + -1 > anInt10904)
					anInt10904++;
				for (int i_34_ = anInt10904; i_34_ > 0; i_34_--) {
					scenePositionXQueue[i_34_] = scenePositionXQueue[-1 + i_34_];
					scenePositionYQueue[i_34_] = scenePositionYQueue[i_34_ - 1];
					movementTypeQueue[i_34_] = movementTypeQueue[i_34_ + -1];
				}
				scenePositionXQueue[0] = i_28_;
				movementTypeQueue[0] = (byte) 1;
				scenePositionYQueue[0] = i_27_;
				return;
			}
		}
		anInt10904 = 0;
		anInt10901 = 0;
		scenePositionXQueue[0] = i_28_;
		anInt10900 = 0;
		scenePositionYQueue[0] = i_27_;
		anInt5934 = (i_30_ << 8) + (scenePositionXQueue[0] << 9);
		anInt5940 = (scenePositionYQueue[0] << 9) - -(i_30_ << 8);
		if (anEntityNode_Sub4_10902 != null)
			anEntityNode_Sub4_10902.method965();
	}

	public final void method878(int i, int i_35_, String string, byte b) {
		anInt11105++;
		int i_37_ = Node_Sub15_Sub10.method2578((byte) -128) * CacheNode_Sub4.aClass1_9466.anInt116;
		this.method864(i_37_, string, false, i_35_, i);
	}

	public final void setDefs(NPCDefinition npcdefinition, boolean bool) {
		if (bool != true)
			method810(72, -105, false, null);
		if (npcdefinition != defs && Class213.aBoolean2510 && Node_Sub23_Sub1.method2640(index, -60))
			Class260.method3137(0);
		anInt11110++;
		defs = npcdefinition;
		if (defs != null) {
			name = defs.name;
			combatLevel = defs.anInt2838;
		}
		if (anEntityNode_Sub4_10902 != null)
			anEntityNode_Sub4_10902.method965();
	}

	private final boolean method881(int i) {
		anInt11120++;
		return defs.aBoolean2854;
	}
	
	/*private String hoverMessage;
	
	public String getHoverMessage() {
		return hoverMessage;
	}
	
	public boolean hasHoverMessage() {
		if(hoverMessage != null)
			if(!hoverMessage.equals("null") || !hoverMessage.equals(""))
				return true;
		return false;
	}

	public void setHoverMessage(String readString) {
		hoverMessage = readString;
	}*/
	
}
