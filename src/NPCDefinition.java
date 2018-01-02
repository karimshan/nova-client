import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* NpcDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCDefinition {
	
	public static Class157 aClass157_2880 = new Class157();
	public static IncomingPacket aClass192_2884 = new IncomingPacket(42, -1);
	public static Class61 aClass61_2805 = new Class61(4);
	public static int anInt2807;
	public static int anInt2808;
	public static int anInt2818;
	public static int anInt2819;
	public static int anInt2822;
	public static int anInt2835;
	public static int anInt2840;
	public static int anInt2845;
	public static int anInt2846;
	public static int anInt2850;
	public static int anInt2851;
	public static int anInt2866;
	public static int anInt2869;
	public static int anInt2870;
	public static int anInt2885;

	public static final void method3001(Index class302, Index class302_3_, Index class302_4_, byte b, Index class302_5_) {
		Class262_Sub10.aClass302_7776 = class302_4_;
		anInt2807++;
		Node_Sub38_Sub31.aClass302_10422 = class302;
		if (b >= 17) {
			GLXToolkit.aClass302_9274 = class302_5_;
			Class134_Sub3.widgetsList = new IComponentDefinitions[Node_Sub38_Sub31.aClass302_10422
					.method3526(-20871)][];
			Class169_Sub1.aBooleanArray8788 = new boolean[Node_Sub38_Sub31.aClass302_10422.method3526(-20871)];
		}
	}

	public static final void method3002(byte b) {
		if (b == 97) {
			anInt2819++;
			CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 15, 0L);
			cachenode_sub2.method2291((byte) 121);
		}
	}

	public static void method3003(byte b) {
		aClass157_2880 = null;
		if (b >= -24)
			aClass157_2880 = null;
		aClass192_2884 = null;
		aClass61_2805 = null;
	}

	public static final Class355 method3008(byte b, int i) {
		anInt2822++;
		Class355 class355 = (Class355) Class155.aClass61_1952.method607(i, 0);
		if (class355 != null)
			return class355;
		byte[] bs = Node_Sub38_Sub19.aClass302_10286.method3524(false, i, 0);
		class355 = new Class355();
		if (bs != null)
			class355.method4018((byte) 105, new BufferedStream(bs));
		class355.method4016(2);
		Class155.aClass61_1952.method601(class355, 25566, i);
		return class355;
	}

	public boolean aBoolean2817;
	public boolean aBoolean2824;
	public boolean aBoolean2825;
	public boolean aBoolean2843;
	public boolean aBoolean2854;
	public boolean aBoolean2875;
	public boolean aBoolean2879;
	public boolean aBoolean2883;
	public byte aByte2816;
	public byte aByte2836;
	public byte aByte2839;
	public byte aByte2853;
	public byte aByte2855;
	public byte aByte2857;
	public byte aByte2868;
	public byte aByte2873;
	public byte aByte2877;
	public byte[] aByteArray2820;
	public Class279 aClass279_2861;
	public HashTable csHashTable;
	public HashMap<Integer, Object> clientScripts;
	public int anInt2803;
	public int anInt2804;
	public int anInt2806;
	public int anInt2809;
	public int anInt2810;
	public int anInt2811;
	public int anInt2812;
	public int anInt2814 = -1;
	public int anInt2815;
	public int anInt2826;
	public int anInt2828;
	public int height;
	public int anInt2831;
	public int anInt2833;
	public int anInt2837;
	public int anInt2838;
	public int anInt2844;
	public int anInt2848;
	public int anInt2849;
	public int anInt2852;
	public int anInt2856;
	public int width;
	public int anInt2859;
	public int anInt2860;
	public int anInt2862;
	public int anInt2864;
	public int id;
	public int anInt2872;
	public int anInt2876;
	public int anInt2878;
	public int anInt2881;
	public int anInt2882;
	public int anInt2886;
	public int[] anIntArray2827;
	public int[] anIntArray2832;
	public int[] chatHeads;
	public int[] modelIds;
	public int[][] anIntArrayArray2842;
	public short aShort2863;
	public short aShort2871;
	public short[] originalModelColors;
	public short[] modifiedModelColors;
	public short[] aShortArray2841;
	public short[] aShortArray2874;

	public String[] options;
	public String name;

	public NPCDefinition() {
		anInt2809 = -1;
		anInt2811 = 1;
		anInt2803 = -1;
		aBoolean2817 = true;
		anInt2804 = -1;
		aBoolean2843 = false;
		height = 128;
		anInt2833 = -1;
		aBoolean2825 = false;
		anInt2838 = -1;
		anInt2826 = -1;
		aBoolean2824 = false;
		aByte2855 = (byte) -1;
		aByte2816 = (byte) 0;
		aByte2839 = (byte) 0;
		anInt2812 = -1;
		anInt2844 = 256;
		aBoolean2854 = true;
		name = "null";
		width = 128;
		anInt2810 = -1;
		anInt2806 = -1;
		anInt2852 = 256;
		anInt2860 = -1;
		anInt2859 = -1;
		anInt2831 = 0;
		anInt2837 = -1;
		anInt2862 = 0;
		aShort2863 = (short) 0;
		anInt2864 = 0;
		aByte2868 = (byte) -16;
		anInt2848 = 0;
		anInt2856 = -1;
		aBoolean2875 = true;
		aShort2871 = (short) 0;
		anInt2872 = 0;
		anInt2828 = 255;
		anInt2881 = -1;
		aByte2877 = (byte) -96;
		aBoolean2879 = true;
		anInt2878 = -1;
		aByte2873 = (byte) 4;
		anInt2882 = -1;
		anInt2815 = -1;
		anInt2876 = 32;
		anInt2886 = -1;
		anInt2849 = -1;
	}

	public final void method2997(byte b) {
		if (modelIds == null)
			modelIds = new int[0];
		anInt2835++;
		if ((aByte2855 ^ 0xffffffff) == 0)
			if (Node_Sub38_Sub34.aClass353_10443 != aClass279_2861.aClass353_3553)
				aByte2855 = (byte) 0;
			else
				aByte2855 = (byte) 1;
		if (b != -110)
			aBoolean2883 = false;
	}

	public final boolean method2998(byte b) {
		anInt2866++;
		if (anIntArray2827 == null) {
			if ((anInt2812 ^ 0xffffffff) == 0 && (anInt2809 ^ 0xffffffff) == 0 && anInt2810 == -1)
				return false;
			return true;
		}
		int i = 0;
		if (b != 91)
			aClass61_2805 = null;
		for (/**/; (anIntArray2827.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			if ((anIntArray2827[i] ^ 0xffffffff) != 0) {
				NPCDefinition npcdefinition_0_ = aClass279_2861.getNPCDefinitions(anIntArray2827[i]);
				if (npcdefinition_0_.anInt2812 != -1 || (npcdefinition_0_.anInt2809 ^ 0xffffffff) != 0
						|| (npcdefinition_0_.anInt2810 ^ 0xffffffff) != 0)
					return true;
			}
		return false;
	}

	public final NPCDefinition method2999(int i, Interface17 interface17) {
		anInt2870++;
		if (i != 65535)
			return null;
		int i_1_ = -1;
		if (anInt2881 != -1)
			i_1_ = interface17.method64(anInt2881, (byte) -42);
		else if ((anInt2882 ^ 0xffffffff) != 0)
			i_1_ = interface17.method65(anInt2882, 119);
		if (i_1_ < 0 || (anIntArray2827.length + -1 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)
				|| (anIntArray2827[i_1_] ^ 0xffffffff) == 0) {
			int i_2_ = anIntArray2827[anIntArray2827.length - 1];
			if ((i_2_ ^ 0xffffffff) == 0)
				return null;
			return aClass279_2861.getNPCDefinitions(i_2_);
		}
		return aClass279_2861.getNPCDefinitions(anIntArray2827[i_1_]);
	}
	
	public static NPCDefinition getDefs(int i) {
		return Class366.aClass279_4526.getNPCDefinitions(i);
	}

	public final void method3000(byte b, BufferedStream buffer) {
		anInt2840++;
		if (b < 38)
			anInt2833 = -38;
		for (;;) {
			int i = buffer.readUnsignedByte();
			if (i == 0)
				break;
			decode(i, buffer, (byte) -121);
		}
	}

	public final void decode(int opcode, BufferedStream buffer, byte b) {
		anInt2808++;
		if ((opcode ^ 0xffffffff) == -2) {
			int i_6_ = buffer.readUnsignedByte();
			modelIds = new int[i_6_];
			for (int i_7_ = 0; (i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				modelIds[i_7_] = buffer.readBigSmart();
				if ((modelIds[i_7_] ^ 0xffffffff) == -65536)
					modelIds[i_7_] = -1;
			}
		} else if ((opcode ^ 0xffffffff) == -3)
			name = buffer.readString();
		else if (opcode == 12)
			anInt2811 = buffer.readUnsignedByte();
		else if (opcode < 30 || (opcode ^ 0xffffffff) <= -36) {
			if ((opcode ^ 0xffffffff) != -41) {
				if (opcode == 41) {
					int i_8_ = buffer.readUnsignedByte();
					aShortArray2874 = new short[i_8_];
					aShortArray2841 = new short[i_8_];
					for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
						aShortArray2841[i_9_] = (short) buffer.readUnsignedShort();
						aShortArray2874[i_9_] = (short) buffer.readUnsignedShort();
					}
				} else if (opcode != 42) {
					if ((opcode ^ 0xffffffff) == -61) {
						int i_10_ = buffer.readUnsignedByte();
						chatHeads = new int[i_10_];
						for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++)
							chatHeads[i_11_] = buffer.readBigSmart();
					} else if ((opcode ^ 0xffffffff) == -94)
						aBoolean2879 = false;
					else if ((opcode ^ 0xffffffff) != -96) {
						if ((opcode ^ 0xffffffff) == -98)
							width = buffer.readUnsignedShort();
						else if (opcode != 98) {
							if ((opcode ^ 0xffffffff) != -100) {
								if ((opcode ^ 0xffffffff) != -101) {
									if ((opcode ^ 0xffffffff) != -102) {
										if (opcode == 102)
											anInt2806 = buffer.readUnsignedShort();
										else if (opcode != 103) {
											if (opcode == 106 || opcode == 118) {
												anInt2881 = buffer.readUnsignedShort();
												if (anInt2881 == 65535)
													anInt2881 = -1;
												anInt2882 = buffer.readUnsignedShort();
												if (anInt2882 == 65535)
													anInt2882 = -1;
												int i_12_ = -1;
												if ((opcode ^ 0xffffffff) == -119) {
													i_12_ = buffer.readUnsignedShort();
													if (i_12_ == 65535)
														i_12_ = -1;
												}
												int i_13_ = buffer.readUnsignedByte();
												anIntArray2827 = new int[i_13_ - -2];
												for (int i_14_ = 0; i_13_ >= i_14_; i_14_++) {
													anIntArray2827[i_14_] = buffer.readUnsignedShort();
													if (anIntArray2827[i_14_] == 65535)
														anIntArray2827[i_14_] = -1;
												}
												anIntArray2827[i_13_ - -1] = i_12_;
											} else if ((opcode ^ 0xffffffff) != -108) {
												if (opcode == 109)
													aBoolean2817 = false;
												else if (opcode != 111) {
													if (opcode == 113) {
														aShort2863 = (short) buffer.readUnsignedShort();
														aShort2871 = (short) buffer.readUnsignedShort();
													} else if (opcode == 114) {
														aByte2877 = buffer.readByte();
														aByte2868 = buffer.readByte();
													} else if ((opcode ^ 0xffffffff) != -120) {
														if ((opcode ^ 0xffffffff) != -122) {
															if ((opcode ^ 0xffffffff) != -123) {
																if ((opcode ^ 0xffffffff) != -124) {
																	if (opcode == 125)
																		aByte2873 = buffer.readByte();
																	else if (opcode != 127) {
																		if (opcode == 128)
																			buffer.readUnsignedByte();
																		else if (opcode == 134) {
																			anInt2812 = buffer.readUnsignedShort();
																			if ((anInt2812 ^ 0xffffffff) == -65536)
																				anInt2812 = -1;
																			anInt2833 = buffer.readUnsignedShort();
																			if (anInt2833 == 65535)
																				anInt2833 = -1;
																			anInt2809 = buffer.readUnsignedShort();
																			if (anInt2809 == 65535)
																				anInt2809 = -1;
																			anInt2810 = buffer.readUnsignedShort();
																			if ((anInt2810 ^ 0xffffffff) == -65536)
																				anInt2810 = -1;
																			anInt2864 = buffer.readUnsignedByte();
																		} else if ((opcode ^ 0xffffffff) != -136) {
																			if ((opcode ^ 0xffffffff) != -137) {
																				if ((opcode ^ 0xffffffff) == -138)
																					anInt2860 = buffer.readBigSmart();
																				else if (opcode != 138) {
																					if ((opcode ^ 0xffffffff) == -140)
																						anInt2826 = buffer
																								.readUnsignedShort();
																					else if (opcode == 140)
																						anInt2828 = buffer
																								.readUnsignedByte();
																					else if ((opcode
																							^ 0xffffffff) != -142) {
																						if (opcode == 142) {
																							anInt2849 = buffer.readUnsignedShort();
																						}
																							 else if ((opcode
																								^ 0xffffffff) == -144)
																							aBoolean2825 = true;
																						else if ((opcode
																								^ 0xffffffff) <= -151
																								&& (opcode
																										^ 0xffffffff) > -156) {
																							options[-150
																									+ opcode] = buffer
																											.readString();
																							if (!aClass279_2861.aBoolean3556)
																								options[opcode
																										+ -150] = null;
																						} else if ((opcode
																								^ 0xffffffff) != -156) {
																							if ((opcode
																									^ 0xffffffff) != -159) {
																								if (opcode == 159)
																									aByte2855 = (byte) 0;
																								else if (opcode == 160) {
																									int i_15_ = buffer
																											.readUnsignedByte();
																									anIntArray2832 = new int[i_15_];
																									for (int i_16_ = 0; (i_16_
																											^ 0xffffffff) > (i_15_
																													^ 0xffffffff); i_16_++)
																										anIntArray2832[i_16_] = buffer
																												.readUnsignedShort();
																								} else if (opcode != 162) {
																									if (opcode == 163)
																										anInt2803 = buffer
																												.readUnsignedByte();
																									else if (opcode != 164) {
																										if ((opcode
																												^ 0xffffffff) == -166)
																											anInt2831 = buffer
																													.readUnsignedByte();
																										else if (opcode == 168)
																											anInt2862 = buffer
																													.readUnsignedByte();
																										else if (opcode == 249) {
																											int keysCount = buffer
																													.readUnsignedByte();
																											int size = 0;
																											if (csHashTable == null) {
																												size = Class320_Sub19
																														.method3753(
																																keysCount,
																																-729073628);
																												csHashTable = new HashTable(
																														size);
																											}
																											if(clientScripts == null)
																												clientScripts = new HashMap<Integer, Object>(size);
																											for (int i_19_ = 0; (keysCount
																													^ 0xffffffff) < (i_19_
																															^ 0xffffffff); i_19_++) {
																												boolean isString = buffer
																														.readUnsignedByte() == 1;
																												int key = buffer
																														.read24BitInteger();
																												Node node;
																												Object value;
																												if (!isString) {
																													int readInt = buffer.readInt();
																													node = new Node_Sub32(readInt);
																													value = Integer.valueOf(readInt);
																												} else {
																													String readString = buffer.readString();
																													node = new Node_Sub18(readString);
																													value = readString;
																												}
																												csHashTable.put(key, node, -127);
																												clientScripts.put(key, value);
																												System.out
																														.println(key+", "+value);
																											}
																										}
																									} else {
																										anInt2844 = buffer
																												.readUnsignedShort();
																										anInt2852 = buffer
																												.readUnsignedShort();
																									}
																								} else
																									aBoolean2883 = true;
																							} else
																								aByte2855 = (byte) 1;
																						} else {
																							aByte2836 = buffer
																									.readByte();
																							aByte2853 = buffer
																									.readByte();
																							aByte2857 = buffer
																									.readByte();
																							aByte2839 = buffer
																									.readByte();
																						}
																					} else
																						aBoolean2843 = true;
																				} else
																					anInt2814 = buffer.readBigSmart();
																			} else {
																				anInt2856 = buffer.readUnsignedByte();
																				anInt2886 = buffer.readUnsignedShort();
																			}
																		} else {
																			anInt2815 = buffer.readUnsignedByte();
																			anInt2859 = buffer.readUnsignedShort();
																		}
																	} else
																		anInt2837 = buffer.readUnsignedShort();
																} else
																	anInt2804 = buffer.readUnsignedShort();
															} else
																anInt2878 = buffer.readBigSmart();
														} else {
															anIntArrayArray2842 = new int[modelIds.length][];
															int i_21_ = buffer.readUnsignedByte();
															for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
																int i_23_ = buffer.readUnsignedByte();
																int[] is = anIntArrayArray2842[i_23_] = new int[3];
																is[0] = buffer.readByte();
																is[1] = buffer.readByte();
																is[2] = buffer.readByte();
															}
														}
													} else
														aByte2816 = buffer.readByte();
												} else
													aBoolean2875 = false;
											} else
												aBoolean2854 = false;
										} else
											anInt2876 = buffer.readUnsignedShort();
									} else
										anInt2872 = 5 * buffer.readByte();
								} else
									anInt2848 = buffer.readByte();
							} else
								aBoolean2824 = true;
						} else {
							height = buffer.readUnsignedShort();
						}
					} else
						anInt2838 = buffer.readUnsignedShort();
				} else {
					int i_24_ = buffer.readUnsignedByte();
					aByteArray2820 = new byte[i_24_];
					for (int i_25_ = 0; (i_24_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++)
						aByteArray2820[i_25_] = buffer.readByte();
				}
			} else {
				int i_26_ = buffer.readUnsignedByte();
				modifiedModelColors = new short[i_26_];
				originalModelColors = new short[i_26_];
				for (int i_27_ = 0; (i_26_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
					originalModelColors[i_27_] = (short) buffer.readUnsignedShort();
					modifiedModelColors[i_27_] = (short) buffer.readUnsignedShort();
				}
			}
		} else
			options[-30 + opcode] = buffer.readString();
		if (b >= -66)
			width = 38;
	}

	public final String method3005(byte b, String string, int i) {
		anInt2851++;
		if (b >= -118)
			return null;
		if (csHashTable == null)
			return string;
		Node_Sub18 node_sub18 = (Node_Sub18) csHashTable.getNode(3512, i);
		if (node_sub18 == null)
			return string;
		return node_sub18.aString7149;
	}

	public final int method3009(int i, int i_68_, int i_69_) {
		anInt2850++;
		if (csHashTable == null)
			return i_69_;
		Node_Sub32 node_sub32 = (Node_Sub32) csHashTable.getNode(3512, i_68_);
		if (node_sub32 == null)
			return i_69_;
		return node_sub32.anInt7381;
	}

	public final boolean method3010(byte b, Interface17 interface17) {
		anInt2818++;
		if (anIntArray2827 == null)
			return true;
		if (b < 18)
			anInt2878 = 75;
		int i = -1;
		if (anInt2881 == -1) {
			if ((anInt2882 ^ 0xffffffff) != 0)
				i = interface17.method65(anInt2882, 111);
		} else
			i = interface17.method64(anInt2881, (byte) -42);
		if (i < 0 || i >= -1 + anIntArray2827.length || anIntArray2827[i] == -1) {
			int i_71_ = anIntArray2827[-1 + anIntArray2827.length];
			if (i_71_ == -1)
				return false;
			return true;
		}
		return true;
	}

	public final DrawableModel prepareModel(Interface17 interface17, GraphicsToolkit graphicstoolkit, Class281 class281,
			byte b, Animator animator, int i, int[] is, Class361 class361, Animator animator_37_, int i_38_,
			Animator[] animators) {
		anInt2869++;
		if (anIntArray2827 != null) {
			NPCDefinition npcdefinition_39_ = method2999(65535, interface17);
			if (npcdefinition_39_ == null)
				return null;
			return npcdefinition_39_.prepareModel(interface17, graphicstoolkit, class281, (byte) -93, animator, i, is,
					class361, animator_37_, i_38_, animators);
		}
		int i_40_ = i_38_;
		if ((height ^ 0xffffffff) != -129)
			i_40_ |= 0x2;
		if (width != 128)
			i_40_ |= 0x5;
		boolean bool = false;
		int i_41_ = animators == null ? 0 : animators.length;
		for (int i_42_ = 0; (i_41_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++)
			if (animators[i_42_] != null) {
				i_40_ |= animators[i_42_].method237((byte) -126);
				bool = true;
			}
		if (animator != null) {
			bool = true;
			i_40_ |= animator.method237((byte) -128);
		}
		if (animator_37_ != null) {
			i_40_ |= animator_37_.method237((byte) -128);
			bool = true;
		}
		long l = id | graphicstoolkit.anInt1537 << 16;
		if (class361 != null)
			l |= class361.aLong4488 << 24;
		DrawableModel drawablemodel;
		synchronized (aClass279_2861.aClass61_3565) {
			drawablemodel = (DrawableModel) aClass279_2861.aClass61_3565.method607(l, 0);
		}
		Class259 class259 = null;
		if (anInt2837 != -1)
			class259 = class281.method3383((byte) 125, anInt2837);
		if (drawablemodel == null || i_40_ != (drawablemodel.ua() & i_40_)) {
			if (drawablemodel != null)
				i_40_ |= drawablemodel.ua();
			int i_43_ = i_40_;
			if (originalModelColors != null)
				i_43_ |= 0x4000;
			if (aShortArray2841 != null)
				i_43_ |= 0x8000;
			if ((aByte2839 ^ 0xffffffff) != -1)
				i_43_ |= 0x80000;
			int[] is_44_ = class361 != null && class361.anIntArray4482 != null ? class361.anIntArray4482
					: modelIds;
			boolean bool_45_ = false;
			synchronized (aClass279_2861.aClass302_3564) {
				for (int i_46_ = 0; i_46_ < is_44_.length; i_46_++)
					if ((is_44_[i_46_] ^ 0xffffffff) != 0
							&& !aClass279_2861.aClass302_3564.requestDownload(0, is_44_[i_46_], 0))
						bool_45_ = true;
			}
			if (bool_45_)
				return null;
			Model[] models = new Model[is_44_.length];
			for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > (is_44_.length ^ 0xffffffff); i_47_++)
				if ((is_44_[i_47_] ^ 0xffffffff) != 0) {
					synchronized (aClass279_2861.aClass302_3564) {
						models[i_47_] = Renderer.method3448(is_44_[i_47_], 7, 0, aClass279_2861.aClass302_3564);
					}
					if (models[i_47_] != null) {
						if ((models[i_47_].anInt2614 ^ 0xffffffff) > -14)
							models[i_47_].method2081(2, 0);
						if (anIntArrayArray2842 != null && anIntArrayArray2842[i_47_] != null)
							models[i_47_].method2082(anIntArrayArray2842[i_47_][0], anIntArrayArray2842[i_47_][1], 126,
									anIntArrayArray2842[i_47_][2]);
					}
				}
			if (class259 != null && class259.anIntArrayArray3273 != null)
				for (int i_48_ = 0; i_48_ < class259.anIntArrayArray3273.length; i_48_++)
					if ((models.length ^ 0xffffffff) < (i_48_ ^ 0xffffffff) && models[i_48_] != null) {
						int i_49_ = 0;
						int i_50_ = 0;
						int i_51_ = 0;
						int i_52_ = 0;
						int i_53_ = 0;
						int i_54_ = 0;
						if (class259.anIntArrayArray3273[i_48_] != null) {
							i_52_ = class259.anIntArrayArray3273[i_48_][3] << 3;
							i_53_ = class259.anIntArrayArray3273[i_48_][4] << 3;
							i_50_ = class259.anIntArrayArray3273[i_48_][1];
							i_49_ = class259.anIntArrayArray3273[i_48_][0];
							i_54_ = class259.anIntArrayArray3273[i_48_][5] << 3;
							i_51_ = class259.anIntArrayArray3273[i_48_][2];
						}
						if ((i_52_ ^ 0xffffffff) != -1 || (i_53_ ^ 0xffffffff) != -1 || (i_54_ ^ 0xffffffff) != -1)
							models[i_48_].method2085(i_54_, i_52_, -119, i_53_);
						if ((i_49_ ^ 0xffffffff) != -1 || i_50_ != 0 || i_51_ != 0)
							models[i_48_].method2082(i_49_, i_50_, -79, i_51_);
					}
			Model model;
			if ((models.length ^ 0xffffffff) == -2)
				model = models[0];
			else
				model = new Model(models, models.length);
			drawablemodel = graphicstoolkit.a(model, i_43_, aClass279_2861.anInt3567, anInt2848 + 64, 850 + anInt2872);
			if (originalModelColors != null) {
				short[] ses;
				if (class361 == null || class361.aShortArray4487 == null)
					ses = modifiedModelColors;
				else
					ses = class361.aShortArray4487;
				for (int i_55_ = 0; originalModelColors.length > i_55_; i_55_++)
					if (aByteArray2820 == null || i_55_ >= aByteArray2820.length)
						drawablemodel.ia(originalModelColors[i_55_], ses[i_55_]);
					else
						drawablemodel.ia(originalModelColors[i_55_],
								Class262_Sub19.aShortArray7852[0xff & aByteArray2820[i_55_]]);
			}
			if (aShortArray2841 != null) {
				short[] ses;
				if (class361 == null || class361.aShortArray4485 == null)
					ses = aShortArray2874;
				else
					ses = class361.aShortArray4485;
				for (int i_56_ = 0; (aShortArray2841.length ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++)
					drawablemodel.aa(aShortArray2841[i_56_], ses[i_56_]);
			}
			if (aByte2839 != 0)
				drawablemodel.method626(aByte2836, aByte2853, aByte2857, 0xff & aByte2839);
			drawablemodel.s(i_40_);
			synchronized (aClass279_2861.aClass61_3565) {
				aClass279_2861.aClass61_3565.method601(drawablemodel, 25566, l);
			}
		}
		DrawableModel drawablemodel_57_ = drawablemodel.method633((byte) 4, i_40_, true);
		boolean bool_59_ = false;
		if (is != null)
			for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > -13; i_60_++)
				if (is[i_60_] != -1)
					bool_59_ = true;
		if (!bool && !bool_59_)
			return drawablemodel_57_;
		Class336[] class336s = null;
		if (class259 != null)
			class336s = class259.method3131(3, graphicstoolkit);
		if (bool_59_ && class336s != null)
			for (int i_61_ = 0; i_61_ < 12; i_61_++)
				if (class336s[i_61_] != null)
					drawablemodel_57_.method630(class336s[i_61_], 1 << i_61_, true);
		int i_62_ = 0;
		int i_63_ = 1;
		while ((i_62_ ^ 0xffffffff) > (i_41_ ^ 0xffffffff)) {
			if (animators[i_62_] != null)
				animators[i_62_].method246(i_63_, 0, true, drawablemodel_57_);
			i_62_++;
			i_63_ <<= 1;
		}
		if (bool_59_)
			for (int i_64_ = 0; i_64_ < 12; i_64_++)
				if (is[i_64_] != -1) {
					int i_65_ = is[i_64_] - i;
					i_65_ &= 0x3fff;
					Class336 class336 = graphicstoolkit.y();
					class336.method3860(i_65_);
					drawablemodel_57_.method630(class336, 1 << i_64_, false);
				}
		if (bool_59_ && class336s != null)
			for (int i_66_ = 0; i_66_ < 12; i_66_++)
				if (class336s[i_66_] != null)
					drawablemodel_57_.method630(class336s[i_66_], 1 << i_66_, false);
		if (animator != null && animator_37_ != null)
			Node_Sub36.method2754(animator, drawablemodel_57_, animator_37_, (byte) -14);
		else if (animator == null) {
			if (animator_37_ != null)
				animator_37_.method225(0, drawablemodel_57_, 0);
		} else
			animator.method225(0, drawablemodel_57_, 0);
		if ((width ^ 0xffffffff) != -129 || height != 128)
			drawablemodel_57_.O(width, height, width);
		drawablemodel_57_.s(i_38_);
		return drawablemodel_57_;
	}

	public final DrawableModel prepareModelToInterface(int i, Animator animator, Class361 class361, int i_28_,
			GraphicsToolkit graphicstoolkit, Interface17 interface17) {
		anInt2846++;
		if (anIntArray2827 != null) {
			NPCDefinition npcdefinition_29_ = method2999(i_28_ + -412695537, interface17);
			if (npcdefinition_29_ == null)
				return null;
			return npcdefinition_29_.prepareModelToInterface(i, animator, class361, 412761072, graphicstoolkit,
					interface17);
		}
		if (chatHeads == null && (class361 == null || class361.anIntArray4482 == null))
			return null;
		if (i_28_ != 412761072)
			anInt2838 = 31;
		int i_30_ = i;
		if (animator != null)
			i_30_ |= animator.method237((byte) -126);
		long l = graphicstoolkit.anInt1537 << 16 | id;
		if (class361 != null)
			l |= class361.aLong4488 << 24;
		DrawableModel drawablemodel;
		synchronized (aClass279_2861.aClass61_3566) {
			drawablemodel = (DrawableModel) aClass279_2861.aClass61_3566.method607(l, 0);
		}
		if (drawablemodel == null || (drawablemodel.ua() & i_30_ ^ 0xffffffff) != (i_30_ ^ 0xffffffff)) {
			if (drawablemodel != null)
				i_30_ |= drawablemodel.ua();
			int i_31_ = i_30_;
			if (originalModelColors != null)
				i_31_ |= 0x4000;
			if (aShortArray2841 != null)
				i_31_ |= 0x8000;
			if ((aByte2839 ^ 0xffffffff) != -1)
				i_31_ |= 0x80000;
			int[] is = class361 == null || class361.anIntArray4482 == null ? chatHeads : class361.anIntArray4482;
			boolean bool = false;
			synchronized (aClass279_2861.aClass302_3564) {
				for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_32_++)
					if (!aClass279_2861.aClass302_3564.requestDownload(0, is[i_32_], 0))
						bool = true;
			}
			if (bool)
				return null;
			Model[] models = new Model[is.length];
			synchronized (aClass279_2861.aClass302_3564) {
				for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_33_++)
					models[i_33_] = Renderer.method3448(is[i_33_], 7, 0, aClass279_2861.aClass302_3564);
			}
			for (int i_34_ = 0; i_34_ < is.length; i_34_++)
				if (models[i_34_] != null && models[i_34_].anInt2614 < 13)
					models[i_34_].method2081(2, 0);
			Model model;
			if ((models.length ^ 0xffffffff) != -2)
				model = new Model(models, models.length);
			else
				model = models[0];
			drawablemodel = graphicstoolkit.a(model, i_31_, aClass279_2861.anInt3567, 64, 768);
			if (originalModelColors != null) {
				short[] ses;
				if (class361 == null || class361.aShortArray4487 == null)
					ses = modifiedModelColors;
				else
					ses = class361.aShortArray4487;
				for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (originalModelColors.length ^ 0xffffffff); i_35_++)
					if (aByteArray2820 == null || aByteArray2820.length <= i_35_)
						drawablemodel.ia(originalModelColors[i_35_], ses[i_35_]);
					else
						drawablemodel.ia(originalModelColors[i_35_],
								Class262_Sub19.aShortArray7852[aByteArray2820[i_35_] & 0xff]);
			}
			if (aShortArray2841 != null) {
				short[] ses;
				if (class361 == null || class361.aShortArray4485 == null)
					ses = aShortArray2874;
				else
					ses = class361.aShortArray4485;
				for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (aShortArray2841.length ^ 0xffffffff); i_36_++)
					drawablemodel.aa(aShortArray2841[i_36_], ses[i_36_]);
			}
			if ((aByte2839 ^ 0xffffffff) != -1)
				drawablemodel.method626(aByte2836, aByte2853, aByte2857, 0xff & aByte2839);
			drawablemodel.s(i_30_);
			synchronized (aClass279_2861.aClass61_3566) {
				aClass279_2861.aClass61_3566.method601(drawablemodel, 25566, l);
			}
		}
		if (animator != null) {
			drawablemodel = drawablemodel.method633((byte) 1, i_30_, true);
			animator.method225(0, drawablemodel, 0);
		}
		drawablemodel.s(i);
		return drawablemodel;
	}
	
	/**
	 * Prints the npc's defs
	 * @param def
	 */
	public static void printDefs(NPCDefinition def) {
		int[] ids = { 1 };
		Class<NPCDefinition> c = NPCDefinition.class;
		for(Field f : c.getDeclaredFields()) {
			f.setAccessible(true); // if there's any private or protected modifiers
			System.out.print("["+f.getName()+"]: ");
			for(int id : ids) {
				try {
					Object o = f.get(def);
					if(o instanceof int[]) {
						int[] intArray = (int[]) o;
						System.out.print(Arrays.toString(intArray)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof short[]) {
						short[] shortArray = (short[]) o;
						System.out.print(Arrays.toString(shortArray)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof String[]) {
						String[] array = (String[]) o;
						System.out.print(Arrays.toString(array)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof int[][]) {
						int[][] array = (int[][]) o;
						for(int i = 0; i < array.length; i++)
							System.out.print(Arrays.toString(array[i])+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof byte[]) {
						byte[] array = (byte[]) o;
						System.out.print(Arrays.toString(array)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof HashMap) {
						@SuppressWarnings("unchecked")
						HashMap<Integer, Object> map = (HashMap<Integer, Object>) o;
						ArrayList<Integer> keys = new ArrayList<Integer>();
						ArrayList<Object> values = new ArrayList<Object>();
						for(Object k : map.values())
							values.add(k);
						for(Integer k : map.keySet())
							keys.add(k);
						for(int i = 0; i < values.size(); i++)
							System.out.print("["+keys.get(i)+", "+values.get(i)+""+(id == ids[ids.length - 1] ? "]" : ", "));
					} else {
						System.out.print(f.get(def)+""+(id == ids[ids.length - 1] ? "" : ", "));
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * Compares npc defs of several npcs.
	 * @param def
	 */
	public static void compareDefs(int... ids) {
		Class<NPCDefinition> c = NPCDefinition.class;
		for(Field f : c.getDeclaredFields()) {
			f.setAccessible(true); // if there's any private or protected modifiers
			System.out.print("["+f.getName()+"]: ");
			for(int id : ids) {
				try {
					NPCDefinition def = NPCDefinition.getDefs(id);
					Object o = f.get(def);
					if(o instanceof int[]) {
						int[] intArray = (int[]) o;
						System.out.print(Arrays.toString(intArray)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof short[]) {
						short[] shortArray = (short[]) o;
						System.out.print(Arrays.toString(shortArray)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof String[]) {
						String[] array = (String[]) o;
						System.out.print(Arrays.toString(array)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof int[][]) {
						int[][] array = (int[][]) o;
						for(int i = 0; i < array.length; i++)
							System.out.print(Arrays.toString(array[i])+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof byte[]) {
						byte[] array = (byte[]) o;
						System.out.print(Arrays.toString(array)+""+(id == ids[ids.length - 1] ? "" : ", "));
					} else if(o instanceof HashMap) {
						@SuppressWarnings("unchecked")
						HashMap<Integer, Object> map = (HashMap<Integer, Object>) o;
						ArrayList<Integer> keys = new ArrayList<Integer>();
						ArrayList<Object> values = new ArrayList<Object>();
						for(Object k : map.values())
							values.add(k);
						for(Integer k : map.keySet())
							keys.add(k);
						for(int i = 0; i < values.size(); i++)
							System.out.print("["+keys.get(i)+", "+values.get(i)+""+(id == ids[ids.length - 1] ? "]" : ", "));
					} else {
						System.out.print(f.get(def)+""+(id == ids[ids.length - 1] ? "" : ", "));
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
	
	public int getId() {
		return id;
	}
	
	/**
	 * Returns the tooltip
	 * @return
	 */
	public String getToolTip() {
		if(clientScripts == null)
			return "";
		Object toolTip = clientScripts.get(1);
		if (toolTip != null)
			return ""+toolTip;
		return "";
	}
	
}
