



/* Node_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub6 extends Node {
	public static int anInt7042;
	public static int anInt7043;
	public static int anInt7048;
	public static int anInt7051;
	public static int anInt7053;
	public static int anInt7056 = 0;
	public static int anInt7058;
	public static int anInt7059;
	public static Object anObject7050;
	public static IComponentDefinitions aWidget7047 = null;

	public static void method2414(int i) {
		anObject7050 = null;
		aWidget7047 = null;
		if (i != 1)
			method2414(-100);
	}

	public static final void method2416(int i, int i_0_, IComponentDefinitions[] widgets, int i_1_, int i_2_, int i_3_,
			int i_4_, boolean bool, int i_5_, int i_6_, int i_7_) {
		anInt7048++;
		Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
		for (int i_8_ = 0; (widgets.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
			IComponentDefinitions widget = widgets[i_8_];
			if (widget != null
					&& (i == widget.parentId || (i ^ 0xffffffff) == 1412584498 && Class58.aWidget861 == widget)) {
				int i_9_ = widget.anInt4679 - -i_0_;
				int i_10_ = i_7_ + widget.anInt4762;
				int i_11_ = 1 + widget.anInt4809 + i_9_;
				int i_12_ = 1 + i_10_ - -widget.anInt4695;
				int i_13_;
				if (i_4_ != -1)
					i_13_ = i_4_;
				else {
					Node_Sub38_Sub28.aRectangleArray10404[Node_Sub11.anInt7105].setBounds(widget.anInt4679 + i_0_,
							i_7_ + widget.anInt4762, widget.anInt4809, widget.anInt4695);
					i_13_ = Node_Sub11.anInt7105++;
				}
				widget.anInt4703 = i_13_;
				widget.anInt4824 = Class174.clientCycle;
				if (!ConnectionDecoder.method112(widget)) {
					if ((widget.anInt4814 ^ 0xffffffff) != -1)
						ClientBackground.method1978(false, widget);
					int i_14_ = i_0_ + widget.anInt4679;
					int i_15_ = i_7_ + widget.anInt4762;
					int i_16_ = 0;
					int i_17_ = 0;
					if (Class71.aBoolean967) {
						i_16_ = Class67.method733(-124);
						i_17_ = Class226.method2112(256);
					}
					int i_18_ = widget.anInt4757;
					if (Class54.aBoolean817
							&& ((ConnectionDecoder.method113(widget).settingsHash ^ 0xffffffff) != -1 || widget.type == 0)
							&& i_18_ > 127)
						i_18_ = 127;
					if (Class58.aWidget861 == widget) {
						if (i != -1412584499
								&& ((Class188_Sub1.anInt6864 ^ 0xffffffff) == (widget.anInt4860 ^ 0xffffffff)
										|| Class339_Sub4.anInt8679 == widget.anInt4860)) {
							CacheNode_Sub7.anInt9488 = i_7_;
							Class236.aWidgetArray2899 = widgets;
							Class118.anInt5410 = i_0_;
							continue;
						}
						if (Class99.aBoolean1282 && Class180.aBoolean2135) {
							int i_19_ = i_16_ + Class106.aClass93_1356.method1050((byte) -93);
							int i_20_ = i_17_ + Class106.aClass93_1356.method1051(true);
							i_20_ -= Class83.anInt5179;
							i_19_ -= Node_Sub5_Sub2.anInt9412;
							if (Class62.anInt905 > i_19_)
								i_19_ = Class62.anInt905;
							if ((i_20_ ^ 0xffffffff) > (Class339_Sub2.anInt8650 ^ 0xffffffff))
								i_20_ = Class339_Sub2.anInt8650;
							if ((Class62.anInt905 + Class186.aWidget2257.anInt4809
									^ 0xffffffff) > (i_19_ - -widget.anInt4809 ^ 0xffffffff))
								i_19_ = Class62.anInt905 - -Class186.aWidget2257.anInt4809 + -widget.anInt4809;
							i_14_ = i_19_;
							if ((Class339_Sub2.anInt8650 - -Class186.aWidget2257.anInt4695
									^ 0xffffffff) > (i_20_ + widget.anInt4695 ^ 0xffffffff))
								i_20_ = Class339_Sub2.anInt8650 - (-Class186.aWidget2257.anInt4695 - -widget.anInt4695);
							i_15_ = i_20_;
						}
						if ((widget.anInt4860 ^ 0xffffffff) == (Class339_Sub4.anInt8679 ^ 0xffffffff))
							i_18_ = 128;
					}
					int i_21_;
					int i_22_;
					int i_23_;
					int i_24_;
					if ((widget.type ^ 0xffffffff) != -3) {
						int i_25_ = i_14_ + widget.anInt4809;
						int i_26_ = i_15_ - -widget.anInt4695;
						if (widget.type == 9) {
							i_26_++;
							i_25_++;
						}
						i_23_ = i_2_ >= i_15_ ? i_2_ : i_15_;
						i_21_ = i_14_ > i_1_ ? i_14_ : i_1_;
						i_24_ = (i_6_ ^ 0xffffffff) >= (i_25_ ^ 0xffffffff) ? i_6_ : i_25_;
						i_22_ = (i_26_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff) ? i_26_ : i_3_;
					} else {
						i_21_ = i_1_;
						i_22_ = i_3_;
						i_23_ = i_2_;
						i_24_ = i_6_;
					}
					if (i_24_ > i_21_ && (i_23_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
						if ((widget.anInt4814 ^ 0xffffffff) != -1) {
							if ((widget.anInt4814 ^ 0xffffffff) == (Class200_Sub1.anInt5146 ^ 0xffffffff)
									|| widget.anInt4814 == Class107.anInt1366) {
								Class243.method3059(i_15_, (byte) 29, i_14_, widget);
								if (!Class71.aBoolean967) {
									Class157.method1710(-120, i_15_, widget.anInt4814 == Class107.anInt1366,
											widget.anInt4809, widget.anInt4695, i_14_);
									Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
								}
								Login.aBooleanArray2387[i_13_] = true;
								continue;
							}
							if (widget.anInt4814 == Class264.anInt3355 && (aa.anInt101 ^ 0xffffffff) == -1) {
								if (widget.method4145(Class93.graphicsToolkit, 1) != null) {
									CacheNode_Sub16_Sub1.method2387((byte) -114);
									MiniMap.method268(i_15_, Class93.graphicsToolkit, 128, widget, i_14_);
									Class320_Sub21.aBooleanArray8403[i_13_] = true;
									Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
									if (Class71.aBoolean967)
										if (bool)
											Class362.method4053(i_10_, i_12_, i_9_, (byte) 55, i_11_);
										else
											Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
								}
								continue;
							}
							if ((widget.anInt4814 ^ 0xffffffff) == (Class82.anInt1121 ^ 0xffffffff)) {
								Node_Sub15_Sub4.method2567(widget, i_14_, (byte) -96, i_15_,
										Class93.graphicsToolkit);
								continue;
							}
							if ((widget.anInt4814 ^ 0xffffffff) == (Class180.anInt2136 ^ 0xffffffff)) {
								Class210.method2049(Class93.graphicsToolkit, widget.anInt4754 % 64, (byte) 120,
										widget, i_14_, i_15_);
								continue;
							}
							if ((widget.anInt4814 ^ 0xffffffff) == (Class114.anInt1462 ^ 0xffffffff)) {
								if (widget.method4145(Class93.graphicsToolkit, 1) != null) {
									Class349.method3985(widget, i_14_, 1, i_15_);
									Class320_Sub21.aBooleanArray8403[i_13_] = true;
									Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
									if (Class71.aBoolean967)
										if (!bool)
											Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
										else
											Class362.method4053(i_10_, i_12_, i_9_, (byte) -86, i_11_);
								}
								continue;
							}
							if ((widget.anInt4814 ^ 0xffffffff) == (Node_Sub38_Sub4.anInt10118 ^ 0xffffffff)) {
								Animable_Sub1_Sub1.method829(-28557, widget.anInt4695, i_14_, i_15_,
										TemporaryItemDefinition.aD565, Class93.graphicsToolkit, widget.anInt4809);
								Login.aBooleanArray2387[i_13_] = true;
								Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
								continue;
							}
							if (widget.anInt4814 == Class77.anInt1017) {
								Node_Sub40.method2926((byte) -100, widget.anInt4809, Class93.graphicsToolkit,
										widget.anInt4695, i_14_, i_15_);
								Login.aBooleanArray2387[i_13_] = true;
								Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
								continue;
							}
							if (widget.anInt4814 == AnimableAnimator_Sub1.anInt9093) {
								// THESE ARE STATIC, TODO MAKE THEM DYNAMIC
								if(Utils.showStringOverlays)
									Utils.sendStringOverlays();
								if (Utils.showingFPS || Class186.aBoolean2259) {
									int x = i_14_ + widget.anInt4809;
									int y = i_15_ + 15;
									if (Class71.aBoolean967) {
										/*if (!bool)
											Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
										else
											Class362.method4053(i_10_, i_12_, i_9_, (byte) 76, i_11_);*/
									}
									if (Utils.showingFPS) {
										int textColor = -256;
										if (Node_Sub9_Sub4.framesPerSecond < 20)
											textColor = -65536;
										//System.out.println(i_27_+" "+i_29_+" "+i_28_);
										StandardSprite.aClass52_8945.displayInterText(x,
											"FPS: " + Node_Sub9_Sub4.framesPerSecond, textColor, -1, y);
										y += 15;
										// TODO ADD CUSTOM STRINGS UNDER HERE FOR DYNAMIC TEXT LOCATION
										//System.out.println(i_28_);
										// Disables the displaying of memory along with FPS
										/*Runtime runtime = Runtime.getRuntime();
										int i_30_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
										int i_31_ = -256;
										if ((i_30_ ^ 0xffffffff) < -98305) {
											if (Class252.aBoolean3188) {
												Class355.method4021(80);
												for (int i_32_ = 0; i_32_ < 10; i_32_++)
													System.gc();
												i_30_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
												if ((i_30_ ^ 0xffffffff) < -65537)
													Class41.sendGameMessage(29459,
															"WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.",
															4);
											}
											i_31_ = -65536;
										}
										// Disables mem, game, and lobby bytes displaying with FPS
										StandardSprite.aClass52_8945.displayInterText(x, "Mem:" + i_30_ + "k",
												i_31_, -1, y);
										y += 15;*/
										/*StandardSprite.aClass52_8945.displayInterText(i_27_, "Game: In:" + Class218.aClass123_2566.anInt1577
														+ "B/s Out:" + Class218.aClass123_2566.anInt1572 + "B/s",
												-256, -1, i_28_);
										i_28_ += 15;
										StandardSprite.aClass52_8945.displayInterText(i_27_, "Lobby: In:" + Class218.aClass123_2560.anInt1577
														+ "B/s Out:" + Class218.aClass123_2560.anInt1572 + "B/s",
												-256, -1, i_28_);
										i_28_ += 15;*/
										// Disables Offheap text displaying with FPS
										//int i_33_ = Class93.aGraphicsToolkit1241.E() / 1024;
										/*StandardSprite.aClass52_8945.displayInterText(i_27_,
											"Offheap:" + i_33_ + "k", i_33_ > 65536 ? -65536 : -256, -1, i_28_);
										i_28_ += 15;*/
										
										// Disables the showing of cache with with fps
										int i_34_ = 0;
										int i_35_ = 0;
										for (Class34_Sub1 element : GraphicsToolkit.aClass34_Sub1Array1547)
											if (element != null) {
												i_34_ += element.method377(-68);
												i_35_ += element.method381((byte) 29);
											}
										
										int i_39_ = i_35_ * 10000 / i_34_;
										String string = "Cache: "+Class301.method3503(0, true, i_39_, 2, true)+"%";
										CacheNode_Sub18.aClass52_9609.displayInterText(x, string, -256, -1,
											y);
										y += 12;
										
									}
									// Disables particles that display on the FPS Screen
									/*if (Class280.anInt3570 > 0)
										CacheNode_Sub18.aClass52_9609.displayInterText(i_27_,
												"Particles: " + za_Sub2.anInt10514 + " / " + Class280.anInt3570, -256,
												-1, i_28_);
									i_28_ += 12;*/
									// Disables Models and Ls, La, Pl and NPC displaying
									/*if (Class186.aBoolean2259) {
										CacheNode_Sub18.aClass52_9609.displayInterText(i_27_, "Polys: " + Class93.aGraphicsToolkit1241.I()
														+ " Models: " + Class93.aGraphicsToolkit1241.M(),
												-256, -1, i_28_);
										i_28_ += 12;
										CacheNode_Sub18.aClass52_9609.displayInterText( i_27_,
												"Ls: " + Class365_Sub1.anInt8769 + " La: " + Class304.anInt3835
														+ " NPC: " + Class258.anInt5291 + " Pl: "
														+ Node_Sub13.anInt7107,
												-256, -1, i_28_);
										Class64.method712(25053);
										i_28_ += 12;
									}*/
									Login.aBooleanArray2387[i_13_] = true;
								}
								continue;
							}
						}
						if (widget.type == 0) {
							if ((widget.anInt4814 ^ 0xffffffff) == (Class193.anInt2368 ^ 0xffffffff)
									&& Class93.graphicsToolkit.w())
								Class93.graphicsToolkit.a(i_14_, i_15_, widget.anInt4809, widget.anInt4695);
							method2416(widget.ihash, i_14_ + -widget.anInt4817, widgets, i_21_, i_23_, i_22_, i_13_,
									bool, -99, i_24_, i_15_ + -widget.anInt4734);
							if (widget.aWidgetArray4793 != null)
								method2416(widget.ihash, i_14_ + -widget.anInt4817, widget.aWidgetArray4793, i_21_,
										i_23_, i_22_, i_13_, bool, -87, i_24_, -widget.anInt4734 + i_15_);
							Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.getNode(3512, widget.ihash);
							if (node_sub2 != null)
								Class282.method3385(node_sub2.interfaceId, i_21_, i_24_, i_23_, i_15_, i_13_, i_14_,
										true, i_22_);
							if ((widget.anInt4814 ^ 0xffffffff) == (Class193.anInt2368 ^ 0xffffffff)) {
								if (Class93.graphicsToolkit.w())
									Class93.graphicsToolkit.d();
								if (aa.anInt101 == 3) {
									int i_40_ = RSCanvas.anInt69;
									int i_41_ = GLDrawableModel.anInt5703;
									int i_42_ = Class105.anInt5204;
									int i_43_ = Animable_Sub4.anInt9153;
									if ((Class174.clientCycle ^ 0xffffffff) > (Class1.anInt115 ^ 0xffffffff)) {
										float f = (float) (Class174.clientCycle + -Class60.anInt881)
												/ (float) (Class1.anInt115 + -Class60.anInt881);
										i_41_ = (int) (Class308.anInt3913 * (-f + 1.0F)
												+ f * GLDrawableModel.anInt5703);
										i_42_ = (int) (f * Class105.anInt5204 + ReferenceTable.anInt302 * (-f + 1.0F));
										i_40_ = (int) (f * RSCanvas.anInt69 + (1.0F - f) * Class170.anInt2055);
										i_43_ = (int) (f * Animable_Sub4.anInt9153
												+ (1.0F - f) * BufferedStream.anInt7023);
									}
									if (i_40_ > 0)
										Class93.graphicsToolkit.method1239(-i_21_ + i_24_, -i_23_ + i_22_, i_23_,
												(byte) 116, i_21_, i_41_ << 16 | i_40_ << 24 | i_42_ << 8 | i_43_);
								}
							}
							Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
						}
						if (Class190.aBooleanArray2326[i_13_] || Class12.anInt193 > 1)
							if (widget.type == 3) {
								if (i_18_ == 0) {
									if (!widget.aBoolean4769)
										Class93.graphicsToolkit.d(i_14_, i_15_, widget.anInt4809, widget.anInt4695,
												widget.anInt4754, 0);
									else
										Class93.graphicsToolkit.aa(i_14_, i_15_, widget.anInt4809,
												widget.anInt4695, widget.anInt4754, 0);
								} else if (!widget.aBoolean4769)
									Class93.graphicsToolkit.d(i_14_, i_15_, widget.anInt4809, widget.anInt4695,
											-(i_18_ & 0xff) + 255 << 24 | widget.anInt4754 & 0xffffff, 1);
								else
									Class93.graphicsToolkit.aa(i_14_, i_15_, widget.anInt4809, widget.anInt4695,
											-(i_18_ & 0xff) + 255 << 24 | widget.anInt4754 & 0xffffff, 1);
								if (Class71.aBoolean967)
									if (!bool)
										Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
									else
										Class362.method4053(i_10_, i_12_, i_9_, (byte) -33, i_11_);
							} else if ((widget.type ^ 0xffffffff) == -5) {
								AbstractFont class52 = widget.method4155(true, Class93.graphicsToolkit);
								if (class52 == null) {
									if (Class287.aBoolean3606)
										ClientScript.method2321(-1, widget);
								} else {
									int i_44_ = widget.anInt4754;
									String string = widget.aString4790;
									if (widget.anInt4718 != -1) {
										ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166
												.method1010(widget.anInt4718, 14434);
										string = itemdefinition.aString1860;
										
										if (string == null)
											string = "null";
										if ((itemdefinition.anInt1892 == 1 || widget.anInt4831 != 1)
												&& widget.anInt4831 != -1)
											string = "<col=ff9040>" + string + "</col> x"
													+ Class191.changeItemAmountColor(3, widget.anInt4831);
									}
									if (widget.anInt4694 != -1) {
										string = Class77.method773(225, widget.anInt4694);
										if (string == null)
											string = "";
									}
									if (widget == Node_Sub25_Sub3.aWidget9990) {
										string = GlobalMessage.aClass22_394.getMessage(Class35.language);
										i_44_ = widget.anInt4754;
									}
									if (Class204.aBoolean2454)
										Class93.graphicsToolkit.T(i_14_, i_15_, i_14_ + widget.anInt4809,
												widget.anInt4695 + i_15_);
									class52.method539(widget.anInt4825, 2, i_44_ | -(i_18_ & 0xff) + 255 << 24,
											widget.aBoolean4710 ? -(0xff & i_18_) + 255 << 24 : -1,
											Node_Sub52.aGLSpriteArray7655, widget.anInt4767, 0, i_15_, widget.anInt4695,
											0, null, widget.anInt4697, widget.anInt4809, i_14_, widget.anInt4835, null,
											string);
									if (Class204.aBoolean2454)
										Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
									if ((string.trim().length() ^ 0xffffffff) < -1)
										if (Class204.aBoolean2454) {
											if (Class71.aBoolean967)
												if (!bool)
													Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
												else
													Class362.method4053(i_10_, i_12_, i_9_, (byte) -111, i_11_);
										} else {
											Class357 class357 = Class150_Sub2.method1660((byte) -30, widget.anInt4759,
													Class93.graphicsToolkit);
											int i_45_ = class357.method4030(Node_Sub52.aGLSpriteArray7655, 0, string,
													widget.anInt4809);
											int i_46_ = class357.method4034(widget.anInt4809, widget.anInt4697, string,
													Node_Sub52.aGLSpriteArray7655, (byte) -65);
											if (Class71.aBoolean967)
												if (bool)
													Class362.method4053(i_15_, i_15_ + i_46_, i_14_, (byte) -71,
															i_14_ - -i_45_);
												else
													Node_Sub38_Sub27.method2881(i_15_, (byte) 112, i_14_ + i_45_,
															i_46_ + i_15_, i_14_);
										}
								}
							} else if ((widget.type ^ 0xffffffff) == -6) {
								if (widget.anInt4848 < 0) {
									GLSprite glsprite;
									if ((widget.anInt4718 ^ 0xffffffff) == 0) {
										if ((widget.anInt4694 ^ 0xffffffff) != 0)
											glsprite = Class352.method4008((byte) 125, widget.anInt4694,
													Class93.graphicsToolkit);
										else
											glsprite = widget.method4135(true, Class93.graphicsToolkit);
									} else {
										PlayerDefinition playerdefinition = widget.aBoolean4723
												? Player.get.playerDefs : null;
										glsprite = EntityNode_Sub3_Sub1.aClass86_9166.method1007(playerdefinition,
												(byte) 30, Class93.graphicsToolkit, widget.anInt4714,
												widget.anInt4718, widget.anInt4744, widget.anInt4831,
												~0xffffff | widget.anInt4796);
									}
									if (glsprite == null) {
										if (Class287.aBoolean3606)
											ClientScript.method2321(-1, widget);
									} else {
										int i_47_ = glsprite.method1197();
										int i_48_ = glsprite.method1186();
										int i_49_ = 255 + -(0xff & i_18_) << 24
												| (widget.anInt4754 != 0 ? widget.anInt4754 & 0xffffff : 16777215);
										if (widget.aBoolean4861) {
											Class93.graphicsToolkit.T(i_14_, i_15_, i_14_ - -widget.anInt4809,
													i_15_ - -widget.anInt4695);
											if (widget.anInt4728 == 0) {
												if ((widget.anInt4754 ^ 0xffffffff) == -1 && i_18_ == 0)
													glsprite.method1192(i_14_, i_15_, widget.anInt4809,
															widget.anInt4695);
												else
													glsprite.method1183(i_14_, i_15_, widget.anInt4809,
															widget.anInt4695, 0, i_49_, 1);
											} else {
												int i_50_ = (widget.anInt4809 + (i_47_ - 1)) / i_47_;
												int i_51_ = (-1 - (-i_48_ - widget.anInt4695)) / i_48_;
												for (int i_52_ = 0; (i_50_ ^ 0xffffffff) < (i_52_
														^ 0xffffffff); i_52_++)
													for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > (i_51_
															^ 0xffffffff); i_53_++)
														if ((widget.anInt4754 ^ 0xffffffff) != -1)
															glsprite.method1181(i_52_ * i_47_ + i_14_ + i_47_ / 2.0F,
																	i_48_ / 2.0F + (i_53_ * i_48_ + i_15_), 4096,
																	widget.anInt4728, 0, i_49_, 1);
														else
															glsprite.method1180(i_52_ * i_47_ + i_14_ + i_47_ / 2.0F,
																	i_15_ + i_48_ * i_53_ + i_48_ / 2.0F, 4096,
																	widget.anInt4728);
											}
											Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
										} else if ((widget.anInt4754 ^ 0xffffffff) == -1 && i_18_ == 0) {
											if (widget.anInt4728 != 0)
												glsprite.method1180(widget.anInt4809 / 2.0F + i_14_,
														i_15_ + widget.anInt4695 / 2.0F,
														widget.anInt4809 * 4096 / i_47_, widget.anInt4728);
											else if ((i_47_ ^ 0xffffffff) != (widget.anInt4809 ^ 0xffffffff)
													|| widget.anInt4695 != i_48_)
												glsprite.method1200(i_14_, i_15_, widget.anInt4809, widget.anInt4695);
											else
												glsprite.method1196(i_14_, i_15_);
										} else if ((widget.anInt4728 ^ 0xffffffff) == -1) {
											if ((i_47_ ^ 0xffffffff) != (widget.anInt4809 ^ 0xffffffff)
													|| widget.anInt4695 != i_48_)
												glsprite.method1199(i_14_, i_15_, widget.anInt4809, widget.anInt4695, 0,
														i_49_, 1);
											else
												glsprite.method1191(i_14_, i_15_, 0, i_49_, 1);
										} else
											glsprite.method1181(widget.anInt4809 / 2.0F + i_14_,
													widget.anInt4695 / 2.0F + i_15_, widget.anInt4809 * 4096 / i_47_,
													widget.anInt4728, 0, i_49_, 1);
									}
								} else
									widget.method4157(-49253408, CacheNode_Sub6.aClass57_9480, Class171.aClass278_2062)
											.method1219(0, 63, Class93.graphicsToolkit, i_15_, 0, i_14_,
													widget.anInt4809, 0, widget.anInt4826 << 3, widget.anInt4764 << 3,
													widget.anInt4695);
								if (Class71.aBoolean967)
									if (!bool)
										Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
									else
										Class362.method4053(i_10_, i_12_, i_9_, (byte) 120, i_11_);
							} else if ((widget.type ^ 0xffffffff) == -7) {
								Class55.method562((byte) 18);
								Class361 class361 = null;
								DrawableModel drawablemodel = null;
								int i_54_ = 0;
								if (widget.anInt4718 == -1) {
									if ((widget.modelType ^ 0xffffffff) == -6) {
										int i_55_ = widget.anInt4864;
										if (i_55_ >= 0 && i_55_ < 2048) {
											Player player = Client.LOCAL_PLAYERS[i_55_];
											if (player != null && (i_55_ == Class166.myPlayerIndex
													|| (Class51_Sub1.method522(player.realName, (byte) -104)
															^ 0xffffffff) == (widget.anInt4683 ^ 0xffffffff)))
												drawablemodel = player.playerDefs.method3279(
														EntityNode_Sub3_Sub1.aClass86_9166, widget.anAnimator4755, 97,
														true, InputStream_Sub2.aClass281_83, Class18.aClass37_306, 2048,
														null, Class63.aClass363_922, Class42.aClass181_643,
														Class93.graphicsToolkit, Class366.aClass279_4526, null, 0,
														null, Class24.aClass275_442);
										}
									} else if (widget.modelType != 8 && (widget.modelType ^ 0xffffffff) != -10) {
										if (widget.anAnimator4755 == null || !widget.anAnimator4755.method245(-125)) {
											drawablemodel = widget.method4153(Class93.graphicsToolkit, null,
													InputStream_Sub2.aClass281_83, Class42.aClass181_643, (byte) 58,
													Class18.aClass37_306, Player.get.playerDefs,
													Class24.aClass275_442, Class366.aClass279_4526,
													EntityNode_Sub3_Sub1.aClass86_9166, 2048, class361);
											if (drawablemodel == null && Class287.aBoolean3606)
												ClientScript.method2321(-1, widget);
										} else {
											drawablemodel = widget.method4153(Class93.graphicsToolkit,
													widget.anAnimator4755, InputStream_Sub2.aClass281_83,
													Class42.aClass181_643, (byte) 124, Class18.aClass37_306,
													Player.get.playerDefs, Class24.aClass275_442,
													Class366.aClass279_4526, EntityNode_Sub3_Sub1.aClass86_9166, 2048,
													class361);
											if (drawablemodel == null && Class287.aBoolean3606)
												ClientScript.method2321(-1, widget);
										}
									} else {
										Node_Sub16 node_sub16 = ToolTips.method3472(widget.anInt4864, (byte) 18, false);
										if (node_sub16 != null)
											drawablemodel = node_sub16.method2588(widget.anInt4683, 1,
													Class93.graphicsToolkit, 2048, widget.modelType == 9,
													widget.anAnimator4755, !widget.aBoolean4723 ? null
															: Player.get.playerDefs);
									}
								} else {
									ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166
											.method1010(widget.anInt4718, 14434);
									if (itemdefinition != null) {
										itemdefinition = itemdefinition.method1674(widget.anInt4831);
										drawablemodel = itemdefinition.method1689(widget.anAnimator4755, 2048,
												widget.aBoolean4723 ? Player.get.playerDefs : null,
												1, Class93.graphicsToolkit, 100);
										if (drawablemodel != null)
											i_54_ = -drawablemodel.fa() >> 1;
										else
											ClientScript.method2321(-1, widget);
									}
								}
								if (drawablemodel != null) {
									int i_56_;
									if ((widget.anInt4800 ^ 0xffffffff) >= -1)
										i_56_ = 512;
									else
										i_56_ = (widget.anInt4809 << 9) / widget.anInt4800;
									int i_57_;
									if (widget.anInt4849 <= 0)
										i_57_ = 512;
									else
										i_57_ = (widget.anInt4695 << 9) / widget.anInt4849;
									int i_58_ = widget.anInt4809 / 2 + i_14_;
									int i_59_ = widget.anInt4695 / 2 + i_15_;
									if (!widget.aBoolean4865) {
										i_58_ += widget.anInt4709 * i_56_ >> 9;
										i_59_ += widget.anInt4797 * i_57_ >> 9;
									}
									Class290_Sub6.aClass336_8114.method3862();
									Class93.graphicsToolkit.a(Class290_Sub6.aClass336_8114);
									Class93.graphicsToolkit.DA(i_58_, i_59_, i_56_, i_57_);
									Class93.graphicsToolkit.ya();
									if (widget.aBoolean4727)
										Class93.graphicsToolkit.C(false);
									if (!widget.aBoolean4865) {
										int i_60_ = Class335.anIntArray4167[widget.anInt4815 << 3]
												* (widget.anInt4787 << 2) >> 14;
										int i_61_ = Class335.anIntArray4165[widget.anInt4815 << 3]
												* (widget.anInt4787 << 2) >> 14;
										Node_Sub5.aClass336_7032.method3861(-widget.anInt4682 << 3);
										Node_Sub5.aClass336_7032.method3856(widget.anInt4821 << 3);
										Node_Sub5.aClass336_7032.method3863(widget.anInt4681 << 2,
												i_54_ + (widget.anInt4811 << 2) + i_60_,
												(widget.anInt4811 << 2) + i_61_);
										Node_Sub5.aClass336_7032.method3859(widget.anInt4815 << 3);
									} else {
										Node_Sub5.aClass336_7032.method3865(widget.anInt4815);
										Node_Sub5.aClass336_7032.method3856(widget.anInt4821);
										Node_Sub5.aClass336_7032.method3868(widget.anInt4682);
										Node_Sub5.aClass336_7032.method3863(widget.anInt4709, widget.anInt4797,
												widget.anInt4842);
									}
									widget.method4136(Class93.graphicsToolkit, drawablemodel, 123,
											Node_Sub5.aClass336_7032, Class174.clientCycle);
									if (Class204.aBoolean2454)
										Class93.graphicsToolkit.T(i_14_, i_15_, i_14_ - -widget.anInt4809,
												widget.anInt4695 + i_15_);
									if (!widget.aBoolean4865) {
										if (widget.aBoolean4707)
											drawablemodel.method622(Node_Sub5.aClass336_7032, null,
													widget.anInt4787 << 2, 1);
										else {
											drawablemodel.method611(Node_Sub5.aClass336_7032, null, 1);
											if (widget.anEntityNode_Sub4_4726 != null)
												Class93.graphicsToolkit
														.a(widget.anEntityNode_Sub4_4726.method959());
										}
									} else if (!widget.aBoolean4707) {
										drawablemodel.method611(Node_Sub5.aClass336_7032, null, 1);
										if (widget.anEntityNode_Sub4_4726 != null)
											Class93.graphicsToolkit.a(widget.anEntityNode_Sub4_4726.method959());
									} else
										drawablemodel.method622(Node_Sub5.aClass336_7032, null, widget.anInt4787, 1);
									if (Class204.aBoolean2454)
										Class93.graphicsToolkit.KA(i_1_, i_2_, i_6_, i_3_);
									if (widget.aBoolean4727)
										Class93.graphicsToolkit.C(true);
								}
								if (Class71.aBoolean967)
									if (!bool)
										Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
									else
										Class362.method4053(i_10_, i_12_, i_9_, (byte) -50, i_11_);
							} else if ((widget.type ^ 0xffffffff) == -10) {
								int i_62_;
								int i_63_;
								int i_64_;
								int i_65_;
								if (!widget.aBoolean4721) {
									i_63_ = widget.anInt4695 + i_15_;
									i_62_ = i_15_;
									i_65_ = i_14_;
									i_64_ = i_14_ + widget.anInt4809;
								} else {
									i_62_ = widget.anInt4695 + i_15_;
									i_63_ = i_15_;
									i_64_ = i_14_ - -widget.anInt4809;
									i_65_ = i_14_;
								}
								if (widget.anInt4752 != 1)
									Class93.graphicsToolkit.a(i_65_, i_62_, i_64_, i_63_, widget.anInt4754,
											widget.anInt4752, 0);
								else
									Class93.graphicsToolkit.a(i_65_, i_62_, i_64_, i_63_, widget.anInt4754, 0);
								if (Class71.aBoolean967)
									if (!bool)
										Node_Sub38_Sub27.method2881(i_10_, (byte) 112, i_11_, i_12_, i_9_);
									else
										Class362.method4053(i_10_, i_12_, i_9_, (byte) -32, i_11_);
							}
					}
				}
			}
		}
	}

	public static final void method2417(int i, byte b) {
		if (b != -74)
			anObject7050 = null;
		anInt7042++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(b ^ ~0x4a, 21, i);
		cachenode_sub2.method2291((byte) 121);
	}

	public static final boolean method2418(int i, String string) {
		anInt7051++;
		if (string == null)
			return false;
		if (i != -27891)
			return true;
		for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (Class235.anInt5122 ^ 0xffffffff); i_67_++) {
			if (string.equalsIgnoreCase(Class240.aStringArray2949[i_67_]))
				return true;
			if (string.equalsIgnoreCase(DrawableModel.aStringArray911[i_67_]))
				return true;
		}
		return false;
	}

	public static final boolean method2419(int i) {
		anInt7059++;
		boolean bool = true;
		if (Class223.aClass383_2664 == null)
			if (!Node_Sub38_Sub39.aClass302_10500.method3510(Class245.anInt3102, (byte) 63))
				bool = false;
			else
				Class223.aClass383_2664 = Class383.method4191(Node_Sub38_Sub39.aClass302_10500, Class245.anInt3102);
		if (Class336_Sub3.aClass383_8624 == null)
			if (!Node_Sub38_Sub39.aClass302_10500.method3510(Class193.anInt2363, (byte) 63))
				bool = false;
			else
				Class336_Sub3.aClass383_8624 = Class383.method4191(Node_Sub38_Sub39.aClass302_10500,
						Class193.anInt2363);
		if (Class44.aClass383_667 == null)
			if (Node_Sub38_Sub39.aClass302_10500.method3510(Class9.anInt165, (byte) 63))
				Class44.aClass383_667 = Class383.method4191(Node_Sub38_Sub39.aClass302_10500, Class9.anInt165);
			else
				bool = false;
		if (i < 78)
			anInt7056 = 72;
		if (CacheNode_Sub2.aClass357_9438 == null)
			if (AnimableAnimator_Sub1.aClass302_9091.method3510(Class169_Sub4.anInt8831, (byte) 63))
				CacheNode_Sub2.aClass357_9438 = Class129.method1553(-1, Class169_Sub4.anInt8831,
						AnimableAnimator_Sub1.aClass302_9091);
			else
				bool = false;
		if (Class335.aClass383Array4163 == null)
			if (Node_Sub38_Sub39.aClass302_10500.method3510(Class169_Sub4.anInt8831, (byte) 63))
				Class335.aClass383Array4163 = Class383.method4199(Node_Sub38_Sub39.aClass302_10500,
						Class169_Sub4.anInt8831);
			else
				bool = false;
		return bool;
	}
	
	public static void sendStringOverlay(final String text, final int width, final int height, final boolean largeText) {
        if (!largeText) {
            CacheNode_Sub18.aClass52_9609.displayInterText(width, text, -256, -1, height);
            return;
        }
        StandardSprite.aClass52_8945.displayInterText(width, text, -256, -1, height);
    }

	protected byte[] aByteArray7046;
	protected byte[] aByteArray7054;
	protected byte[] aByteArray7057;

	protected Class240[] aClass240Array7045;

	protected int anInt7052;

	private int[] anIntArray7055;

	protected Node_Sub45_Sub1[] aNode_Sub45_Sub1Array7049;

	protected short[] aShortArray7044;

	public Node_Sub6() {
		/* empty */
	}

	Node_Sub6(byte[] bs) {
		aClass240Array7045 = new Class240[128];
		aNode_Sub45_Sub1Array7049 = new Node_Sub45_Sub1[128];
		anIntArray7055 = new int[128];
		aByteArray7057 = new byte[128];
		aByteArray7054 = new byte[128];
		aShortArray7044 = new short[128];
		aByteArray7046 = new byte[128];
		BufferedStream buffer = new BufferedStream(bs);
		int i;
		for (i = 0; buffer.buffer[i + buffer.offset] != 0; i++) {
			/* empty */
		}
		byte[] bs_71_ = new byte[i];
		for (int i_72_ = 0; (i_72_ ^ 0xffffffff) > (i ^ 0xffffffff); i_72_++)
			bs_71_[i_72_] = buffer.readByte();
		i++;
		buffer.offset++;
		int i_73_ = buffer.offset;
		buffer.offset += i;
		int i_74_;
		for (i_74_ = 0; buffer.buffer[buffer.offset + i_74_] != 0; i_74_++) {
			/* empty */
		}
		byte[] bs_75_ = new byte[i_74_];
		for (int i_76_ = 0; (i_74_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff); i_76_++)
			bs_75_[i_76_] = buffer.readByte();
		i_74_++;
		buffer.offset++;
		int i_77_ = buffer.offset;
		buffer.offset += i_74_;
		int i_78_;
		for (i_78_ = 0; (buffer.buffer[i_78_ + buffer.offset] ^ 0xffffffff) != -1; i_78_++) {
			/* empty */
		}
		byte[] bs_79_ = new byte[i_78_];
		for (int i_80_ = 0; i_80_ < i_78_; i_80_++)
			bs_79_[i_80_] = buffer.readByte();
		buffer.offset++;
		byte[] bs_81_ = new byte[++i_78_];
		int i_82_;
		if ((i_78_ ^ 0xffffffff) < -2) {
			bs_81_[1] = (byte) 1;
			i_82_ = 2;
			int i_83_ = 1;
			for (int i_84_ = 2; (i_84_ ^ 0xffffffff) > (i_78_ ^ 0xffffffff); i_84_++) {
				int i_85_ = buffer.readUnsignedByte();
				if ((i_85_ ^ 0xffffffff) == -1)
					i_83_ = i_82_++;
				else {
					if (i_85_ <= i_83_)
						i_85_--;
					i_83_ = i_85_;
				}
				bs_81_[i_84_] = (byte) i_83_;
			}
		} else
			i_82_ = i_78_;
		Class240[] class240s = new Class240[i_82_];
		for (int i_86_ = 0; i_86_ < class240s.length; i_86_++) {
			Class240 class240 = class240s[i_86_] = new Class240();
			int i_87_ = buffer.readUnsignedByte();
			if (i_87_ > 0)
				class240.aByteArray2944 = new byte[i_87_ * 2];
			i_87_ = buffer.readUnsignedByte();
			if ((i_87_ ^ 0xffffffff) < -1) {
				class240.aByteArray2942 = new byte[2 + 2 * i_87_];
				class240.aByteArray2942[1] = (byte) 64;
			}
		}
		int i_88_ = buffer.readUnsignedByte();
		byte[] bs_89_ = (i_88_ ^ 0xffffffff) >= -1 ? null : new byte[2 * i_88_];
		i_88_ = buffer.readUnsignedByte();
		byte[] bs_90_ = (i_88_ ^ 0xffffffff) < -1 ? new byte[i_88_ * 2] : null;
		int i_91_;
		for (i_91_ = 0; (buffer.buffer[i_91_ + buffer.offset] ^ 0xffffffff) != -1; i_91_++) {
			/* empty */
		}
		byte[] bs_92_ = new byte[i_91_];
		for (int i_93_ = 0; i_91_ > i_93_; i_93_++)
			bs_92_[i_93_] = buffer.readByte();
		i_91_++;
		buffer.offset++;
		int i_94_ = 0;
		for (int i_95_ = 0; i_95_ < 128; i_95_++) {
			i_94_ += buffer.readUnsignedByte();
			aShortArray7044[i_95_] = (short) i_94_;
		}
		i_94_ = 0;
		for (int i_96_ = 0; i_96_ < 128; i_96_++) {
			i_94_ += buffer.readUnsignedByte();
			aShortArray7044[i_96_] += i_94_ << 8;
		}
		int i_97_ = 0;
		int i_98_ = 0;
		int i_99_ = 0;
		for (int i_100_ = 0; i_100_ < 128; i_100_++) {
			if ((i_97_ ^ 0xffffffff) == -1) {
				if (bs_92_.length <= i_98_)
					i_97_ = -1;
				else
					i_97_ = bs_92_[i_98_++];
				i_99_ = buffer.method2239(0);
			}
			aShortArray7044[i_100_] += Node_Sub30.method2723(-1 + i_99_, 2) << 14;
			anIntArray7055[i_100_] = i_99_;
			i_97_--;
		}
		i_98_ = 0;
		i_97_ = 0;
		int i_101_ = 0;
		for (int i_102_ = 0; i_102_ < 128; i_102_++)
			if ((anIntArray7055[i_102_] ^ 0xffffffff) != -1) {
				if ((i_97_ ^ 0xffffffff) == -1) {
					i_101_ = -1 + buffer.buffer[i_73_++];
					if (bs_71_.length > i_98_)
						i_97_ = bs_71_[i_98_++];
					else
						i_97_ = -1;
				}
				aByteArray7054[i_102_] = (byte) i_101_;
				i_97_--;
			}
		i_98_ = 0;
		i_97_ = 0;
		int i_103_ = 0;
		for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > -129; i_104_++)
			if (anIntArray7055[i_104_] != 0) {
				if ((i_97_ ^ 0xffffffff) == -1) {
					if ((bs_75_.length ^ 0xffffffff) >= (i_98_ ^ 0xffffffff))
						i_97_ = -1;
					else
						i_97_ = bs_75_[i_98_++];
					i_103_ = buffer.buffer[i_77_++] + 16 << 2;
				}
				i_97_--;
				aByteArray7046[i_104_] = (byte) i_103_;
			}
		i_97_ = 0;
		i_98_ = 0;
		Class240 class240 = null;
		for (int i_105_ = 0; i_105_ < 128; i_105_++)
			if (anIntArray7055[i_105_] != 0) {
				if (i_97_ == 0) {
					class240 = class240s[bs_81_[i_98_]];
					if (bs_79_.length > i_98_)
						i_97_ = bs_79_[i_98_++];
					else
						i_97_ = -1;
				}
				aClass240Array7045[i_105_] = class240;
				i_97_--;
			}
		i_98_ = 0;
		i_97_ = 0;
		int i_106_ = 0;
		for (int i_107_ = 0; i_107_ < 128; i_107_++) {
			if (i_97_ == 0) {
				if ((i_98_ ^ 0xffffffff) <= (bs_92_.length ^ 0xffffffff))
					i_97_ = -1;
				else
					i_97_ = bs_92_[i_98_++];
				if ((anIntArray7055[i_107_] ^ 0xffffffff) < -1)
					i_106_ = buffer.readUnsignedByte() - -1;
			}
			aByteArray7057[i_107_] = (byte) i_106_;
			i_97_--;
		}
		anInt7052 = buffer.readUnsignedByte() - -1;
		for (int i_108_ = 0; i_108_ < i_82_; i_108_++) {
			Class240 class240_109_ = class240s[i_108_];
			if (class240_109_.aByteArray2944 != null)
				for (int i_110_ = 1; (class240_109_.aByteArray2944.length ^ 0xffffffff) < (i_110_
						^ 0xffffffff); i_110_ += 2)
					class240_109_.aByteArray2944[i_110_] = buffer.readByte();
			if (class240_109_.aByteArray2942 != null)
				for (int i_111_ = 3; class240_109_.aByteArray2942.length - 2 > i_111_; i_111_ += 2)
					class240_109_.aByteArray2942[i_111_] = buffer.readByte();
		}
		if (bs_89_ != null)
			for (int i_112_ = 1; (bs_89_.length ^ 0xffffffff) < (i_112_ ^ 0xffffffff); i_112_ += 2)
				bs_89_[i_112_] = buffer.readByte();
		if (bs_90_ != null)
			for (int i_113_ = 1; bs_90_.length > i_113_; i_113_ += 2)
				bs_90_[i_113_] = buffer.readByte();
		for (int i_114_ = 0; i_82_ > i_114_; i_114_++) {
			Class240 class240_115_ = class240s[i_114_];
			if (class240_115_.aByteArray2942 != null) {
				i_94_ = 0;
				for (int i_116_ = 2; (i_116_ ^ 0xffffffff) > (class240_115_.aByteArray2942.length
						^ 0xffffffff); i_116_ += 2) {
					i_94_ = buffer.readUnsignedByte() + i_94_ + 1;
					class240_115_.aByteArray2942[i_116_] = (byte) i_94_;
				}
			}
		}
		for (int i_117_ = 0; i_82_ > i_117_; i_117_++) {
			Class240 class240_118_ = class240s[i_117_];
			if (class240_118_.aByteArray2944 != null) {
				i_94_ = 0;
				for (int i_119_ = 2; (class240_118_.aByteArray2944.length ^ 0xffffffff) < (i_119_
						^ 0xffffffff); i_119_ += 2) {
					i_94_ = buffer.readUnsignedByte() + (1 + i_94_);
					class240_118_.aByteArray2944[i_119_] = (byte) i_94_;
				}
			}
		}
		if (bs_89_ != null) {
			i_94_ = buffer.readUnsignedByte();
			bs_89_[0] = (byte) i_94_;
			for (int i_120_ = 2; bs_89_.length > i_120_; i_120_ += 2) {
				i_94_ = buffer.readUnsignedByte() + (i_94_ + 1);
				bs_89_[i_120_] = (byte) i_94_;
			}
			int i_121_ = bs_89_[0];
			int i_122_ = bs_89_[1];
			for (int i_123_ = 0; i_123_ < i_121_; i_123_++)
				aByteArray7057[i_123_] = (byte) (aByteArray7057[i_123_] * i_122_ + 32 >> 6);
			for (int i_124_ = 2; i_124_ < bs_89_.length; i_124_ += 2) {
				int i_125_ = bs_89_[i_124_];
				int i_126_ = bs_89_[i_124_ + 1];
				int i_127_ = (-i_121_ + i_125_) / 2 + i_122_ * (-i_121_ + i_125_);
				for (int i_128_ = i_121_; (i_128_ ^ 0xffffffff) > (i_125_ ^ 0xffffffff); i_128_++) {
					int i_129_ = Class128.method1550(-13892, i_125_ - i_121_, i_127_);
					i_127_ += -i_122_ + i_126_;
					aByteArray7057[i_128_] = (byte) (aByteArray7057[i_128_] * i_129_ + 32 >> 6);
				}
				i_122_ = i_126_;
				i_121_ = i_125_;
			}
			for (int i_130_ = i_121_; (i_130_ ^ 0xffffffff) > -129; i_130_++)
				aByteArray7057[i_130_] = (byte) (32 + aByteArray7057[i_130_] * i_122_ >> 6);
		}
		if (bs_90_ != null) {
			i_94_ = buffer.readUnsignedByte();
			bs_90_[0] = (byte) i_94_;
			for (int i_131_ = 2; (i_131_ ^ 0xffffffff) > (bs_90_.length ^ 0xffffffff); i_131_ += 2) {
				i_94_ = buffer.readUnsignedByte() + (1 + i_94_);
				bs_90_[i_131_] = (byte) i_94_;
			}
			int i_132_ = bs_90_[0];
			int i_133_ = bs_90_[1] << 1;
			for (int i_134_ = 0; i_132_ > i_134_; i_134_++) {
				int i_135_ = i_133_ + (0xff & aByteArray7046[i_134_]);
				if (i_135_ < 0)
					i_135_ = 0;
				if (i_135_ > 128)
					i_135_ = 128;
				aByteArray7046[i_134_] = (byte) i_135_;
			}
			for (int i_136_ = 2; bs_90_.length > i_136_; i_136_ += 2) {
				int i_137_ = bs_90_[i_136_];
				int i_138_ = bs_90_[1 + i_136_] << 1;
				int i_139_ = (-i_132_ + i_137_) / 2 + (i_137_ + -i_132_) * i_133_;
				for (int i_140_ = i_132_; i_137_ > i_140_; i_140_++) {
					int i_141_ = Class128.method1550(-13892, i_137_ - i_132_, i_139_);
					int i_142_ = (0xff & aByteArray7046[i_140_]) + i_141_;
					if (i_142_ < 0)
						i_142_ = 0;
					if ((i_142_ ^ 0xffffffff) < -129)
						i_142_ = 128;
					aByteArray7046[i_140_] = (byte) i_142_;
					i_139_ += i_138_ - i_133_;
				}
				i_132_ = i_137_;
				i_133_ = i_138_;
			}
			for (int i_143_ = i_132_; i_143_ < 128; i_143_++) {
				int i_144_ = i_133_ + (aByteArray7046[i_143_] & 0xff);
				if (i_144_ < 0)
					i_144_ = 0;
				if ((i_144_ ^ 0xffffffff) < -129)
					i_144_ = 128;
				aByteArray7046[i_143_] = (byte) i_144_;
			}
		}
		for (int i_145_ = 0; i_145_ < i_82_; i_145_++)
			class240s[i_145_].anInt2933 = buffer.readUnsignedByte();
		for (int i_146_ = 0; i_82_ > i_146_; i_146_++) {
			Class240 class240_147_ = class240s[i_146_];
			if (class240_147_.aByteArray2944 != null)
				class240_147_.anInt2940 = buffer.readUnsignedByte();
			if (class240_147_.aByteArray2942 != null)
				class240_147_.anInt2941 = buffer.readUnsignedByte();
			if (class240_147_.anInt2933 > 0)
				class240_147_.anInt2934 = buffer.readUnsignedByte();
		}
		for (int i_148_ = 0; i_148_ < i_82_; i_148_++)
			class240s[i_148_].anInt2938 = buffer.readUnsignedByte();
		for (int i_149_ = 0; (i_82_ ^ 0xffffffff) < (i_149_ ^ 0xffffffff); i_149_++) {
			Class240 class240_150_ = class240s[i_149_];
			if (class240_150_.anInt2938 > 0)
				class240_150_.anInt2937 = buffer.readUnsignedByte();
		}
		for (int i_151_ = 0; (i_151_ ^ 0xffffffff) > (i_82_ ^ 0xffffffff); i_151_++) {
			Class240 class240_152_ = class240s[i_151_];
			if ((class240_152_.anInt2937 ^ 0xffffffff) < -1)
				class240_152_.anInt2947 = buffer.readUnsignedByte();
		}
	}

	public final void method2415(int i) {
		anIntArray7055 = null;
		if (i < -108)
			anInt7053++;
	}

	public final boolean method2420(byte b, Class96 class96, int[] is, byte[] bs) {
		anInt7058++;
		boolean bool = true;
		int i = 0;
		Node_Sub45_Sub1 node_sub45_sub1 = null;
		int i_68_ = 0;
		for (/**/; (i_68_ ^ 0xffffffff) > -129; i_68_++)
			if (bs == null || bs[i_68_] != 0) {
				int i_70_ = anIntArray7055[i_68_];
				if ((i_70_ ^ 0xffffffff) != -1) {
					if ((i_70_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
						i = i_70_;
						i_70_--;
						if ((0x1 & i_70_) != 0)
							node_sub45_sub1 = class96.method1074(is, (byte) -31, i_70_ >> 2);
						else
							node_sub45_sub1 = class96.method1073(false, is, i_70_ >> 2);
						if (node_sub45_sub1 == null)
							bool = false;
					}
					if (node_sub45_sub1 != null) {
						aNode_Sub45_Sub1Array7049[i_68_] = node_sub45_sub1;
						anIntArray7055[i_68_] = 0;
					}
				}
			}
		return bool;
	}
}
