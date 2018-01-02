


/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class39 {
	public static OutgoingPacket aClass318_584 = new OutgoingPacket(11, 9);
	public static float aFloat580;
	public static int anInt571;
	public static int anInt572;
	public static int anInt573;
	public static int anInt574;
	public static int anInt575;
	public static int anInt576;
	public static int anInt577;
	public static int anInt578;
	public static int anInt581;
	public static int anInt582;
	public static int anInt585;
	public static int anInt588;
	public static int anInt590;
	public static int anInt591;
	public static int anInt593;
	public static int anInt594;

	public static final void method407(float f, int i, int i_1_, float f_2_, int i_3_, float[] fs, int i_4_, int i_5_,
			int i_6_, int i_7_, int i_8_, float f_9_, float[] fs_10_, int i_11_) {
		i_4_ -= i_3_;
		anInt577++;
		i_1_ -= i_7_;
		i_6_ -= i_8_;
		float f_12_ = fs_10_[2] * i_6_ + (i_1_ * fs_10_[0] + fs_10_[1] * i_4_);
		float f_13_ = i_6_ * fs_10_[5] + (fs_10_[3] * i_1_ + fs_10_[4] * i_4_);
		if (i_5_ < 63)
			method408(-127, 7, -96, false, -54, null, false);
		float f_14_ = fs_10_[8] * i_6_ + (i_4_ * fs_10_[7] + fs_10_[6] * i_1_);
		float f_15_;
		float f_16_;
		if (i != 0) {
			if (i != 1) {
				if ((i ^ 0xffffffff) != -3) {
					if (i != 3) {
						if ((i ^ 0xffffffff) != -5) {
							f_15_ = f_2_ + -f_13_ + 0.5F;
							f_16_ = 0.5F + (-f_14_ + f_9_);
						} else {
							f_16_ = f_9_ + f_14_ + 0.5F;
							f_15_ = f_2_ + -f_13_ + 0.5F;
						}
					} else {
						f_16_ = 0.5F + (f_12_ + f);
						f_15_ = 0.5F + (-f_13_ + f_2_);
					}
				} else {
					f_16_ = f + -f_12_ + 0.5F;
					f_15_ = 0.5F + (-f_13_ + f_2_);
				}
			} else {
				f_16_ = 0.5F + (f + f_12_);
				f_15_ = 0.5F + (f_9_ + f_14_);
			}
		} else {
			f_15_ = 0.5F + (-f_14_ + f_9_);
			f_16_ = 0.5F + (f_12_ + f);
		}
		if ((i_11_ ^ 0xffffffff) != -2) {
			if (i_11_ != 2) {
				if ((i_11_ ^ 0xffffffff) == -4) {
					float f_17_ = f_16_;
					f_16_ = f_15_;
					f_15_ = -f_17_;
				}
			} else {
				f_15_ = -f_15_;
				f_16_ = -f_16_;
			}
		} else {
			float f_18_ = f_16_;
			f_16_ = -f_15_;
			f_15_ = f_18_;
		}
		fs[1] = f_15_;
		fs[0] = f_16_;
	}

	public static final void method408(int i, int i_19_, int i_20_, boolean bool, int i_21_, Index class302,
			boolean bool_22_) {
		MouseHandler.aClass302_6049 = class302;
		Class266.aBoolean3385 = bool;
		Class107.anInt1362 = i;
		Class61.aNode_Sub9_Sub1_885 = null;
		Class17.anInt282 = i_21_;
		if (bool_22_ != false)
			aClass318_584 = null;
		anInt588++;
		AbstractFont.anInt800 = 1;
		Class101.anInt1306 = i_20_;
		CacheNode_Sub6.anInt9485 = i_19_;
	}

	public static final short[] method413(short[] ses, byte b) {
		anInt573++;
		if (b != -32)
			aFloat580 = -0.43263438F;
		if (ses == null)
			return null;
		short[] ses_30_ = new short[ses.length];
		Class311.method3606(ses, 0, ses_30_, 0, ses.length);
		return ses_30_;
	}

	public static final void method414(int i, String string) {
		anInt575++;
		if (i != 30482)
			aClass318_584 = null;
		if (Class87.removeWalkHere && (0x18 & Class200_Sub2.anInt4943) != 0) {
			boolean bool = false;
			int i_31_ = Class178.LOCAL_PLAYERS_INDEXES_COUNT;
			int[] is = Class66_Sub1.LOCAL_PLAYERS_INDEXES;
			for (int i_32_ = 0; (i_31_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
				Player player = Client.LOCAL_PLAYERS[is[i_32_]];
				if (player.realName != null && player.realName.equalsIgnoreCase(string)
						&& (Player.get == player && (0x10 & Class200_Sub2.anInt4943 ^ 0xffffffff) != -1
								|| (Class200_Sub2.anInt4943 & 0x8) != 0)) {
					Class270.anInt3475++;
					Node_Sub13 node_sub13 = PacketDecoder.sendOutgoingOPCode(-386, Class355.aClass318_4396,
							Class218.aClass123_2566.isaacCipher);
					node_sub13.packet.writeShortLE(is[i_32_]);
					node_sub13.packet.writeIntLE(Node_Sub15_Sub9.anInt9839);
					node_sub13.packet.writeShort(Class92.anInt1230);
					node_sub13.packet.write128Byte(0);
					node_sub13.packet.writeShortLE128(Class46.anInt681);
					Class218.aClass123_2566.sendPacket(127, node_sub13);
					Class78.method778(0, player.scenePositionYQueue[0], player.getSize((byte) 65), true,
							player.scenePositionXQueue[0], 0, -2, i + -30377, player.getSize((byte) 81));
					bool = true;
					break;
				}
			}
			if (!bool)
				Class41.sendGameMessage(29459, GlobalMessage.aClass22_384.getMessage(Class35.language) + string, 4);
			if (Class87.removeWalkHere)
				Node_Sub38_Sub23.method2863(-19316);
		}
	}

	public static final void method415(int i, String string, String string_33_, int i_34_) {
		anInt582++;
		if ((string_33_.length() ^ 0xffffffff) >= -321 && Node_Sub38_Sub23.method2866(false)) {
			Class198.method2005((byte) -37);
			Node_Sub38_Sub23.anInt10347 = i;
			Node_Sub5.password = string;
			Class243.username = string_33_;
			Class48.method478(6, (byte) 116);
			int i_35_ = -41 % ((-73 - i_34_) / 39);
		}
	}

	public static void method418(byte b) {
		aClass318_584 = null;
		if (b != -119)
			method418((byte) 90);
	}

	protected char aChar587;

	protected char aChar592;

	private HashTable aHashTable579;

	private int anInt583;

	private int anInt586;

	private Object anObject589;

	private String aString570 = "null";

	public final boolean method404(String string, byte b) {
		anInt581++;
		if (anObject589 == null)
			return false;
		if (aHashTable579 == null)
			method409(122);
		for (DeveloperConsole node_sub42 = (DeveloperConsole) aHashTable579.getNode(b ^ 0xde3,
				Class113.method1153(b ^ 0x5a,
						string)); node_sub42 != null; node_sub42 = (DeveloperConsole) aHashTable579
								.method1524((byte) 84))
			if (node_sub42.aString7522.equals(string))
				return true;
		if (b != 91)
			return false;
		return false;
	}

	public final void method405(byte b, BufferedStream buffer) {
		if (b > 33) {
			anInt590++;
			for (;;) {
				int i = buffer.readUnsignedByte();
				if ((i ^ 0xffffffff) == -1)
					break;
				method417(i, 24, buffer);
			}
		}
	}

	public final Node_Sub34 method406(int i, int i_0_) {
		if (i != -4)
			aFloat580 = 1.0632854F;
		anInt574++;
		if (anObject589 == null)
			return null;
		if (aHashTable579 == null)
			method419(false);
		return (Node_Sub34) aHashTable579.getNode(i ^ ~0xdbb, i_0_);
	}

	private final void method409(int i) {
		try {
			if (i < 118)
				method415(99, null, null, 54);
			anInt571++;
			if (!(anObject589 instanceof HashTable)) {
				String[] strings = (String[]) anObject589;
				int i_23_ = Class320_Sub19.method3753(strings.length, -729073628);
				aHashTable579 = new HashTable(i_23_);
				HashTable hashtable = new HashTable(i_23_);
				for (int i_24_ = 0; (strings.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
					if (strings[i_24_] != null) {
						String string = strings[i_24_];
						long l = Class113.method1153(1, string);
						DeveloperConsole node_sub42;
						for (node_sub42 = (DeveloperConsole) hashtable.getNode(3512,
								l); node_sub42 != null; node_sub42 = (DeveloperConsole) hashtable.method1524((byte) 84))
							if (node_sub42.aString7522.equals(string))
								break;
						if (node_sub42 == null) {
							node_sub42 = new DeveloperConsole(string, 0);
							hashtable.put(l, node_sub42, -126);
						}
						node_sub42.anInt7521++;
					}
				for (int i_25_ = 0; (strings.length ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++)
					if (strings[i_25_] != null) {
						String string = strings[i_25_];
						long l = Class113.method1153(1, string);
						Node_Sub20 node_sub20;
						for (node_sub20 = (Node_Sub20) aHashTable579.getNode(3512,
								l); node_sub20 != null; node_sub20 = (Node_Sub20) aHashTable579.method1524((byte) 84))
							if (node_sub20.aString7174.equals(string))
								break;
						DeveloperConsole node_sub42;
						for (node_sub42 = (DeveloperConsole) hashtable.getNode(3512,
								l); node_sub42 != null; node_sub42 = (DeveloperConsole) hashtable.method1524((byte) 84))
							if (node_sub42.aString7522.equals(string))
								break;
						int i_26_ = node_sub42.anInt7521--;
						if (node_sub20 == null) {
							node_sub20 = new Node_Sub20(string, i_26_);
							aHashTable579.put(l, node_sub20, -124);
						}
						node_sub20.anIntArray7177[node_sub20.anIntArray7177.length + -i_26_] = i_25_;
					}
			} else {
				HashTable hashtable = (HashTable) anObject589;
				aHashTable579 = new HashTable(hashtable.method1522(false));
				HashTable hashtable_27_ = new HashTable(hashtable.method1522(false));
				for (Node_Sub18 node_sub18 = (Node_Sub18) hashtable
						.method1516(false); node_sub18 != null; node_sub18 = (Node_Sub18) hashtable.method1520(100)) {
					long l = Class113.method1153(1, node_sub18.aString7149);
					DeveloperConsole node_sub42;
					for (node_sub42 = (DeveloperConsole) hashtable_27_.getNode(3512,
							l); node_sub42 != null; node_sub42 = (DeveloperConsole) hashtable_27_.method1524((byte) 84))
						if (node_sub42.aString7522.equals(node_sub18.aString7149))
							break;
					if (node_sub42 == null) {
						node_sub42 = new DeveloperConsole(node_sub18.aString7149, 0);
						hashtable_27_.put(l, node_sub42, -126);
					}
					node_sub42.anInt7521++;
				}
				for (Node_Sub18 node_sub18 = (Node_Sub18) hashtable
						.method1516(false); node_sub18 != null; node_sub18 = (Node_Sub18) hashtable.method1520(74)) {
					long l = Class113.method1153(1, node_sub18.aString7149);
					Node_Sub20 node_sub20;
					for (node_sub20 = (Node_Sub20) aHashTable579.getNode(3512,
							l); node_sub20 != null; node_sub20 = (Node_Sub20) aHashTable579.method1524((byte) 84))
						if (node_sub20.aString7174.equals(node_sub18.aString7149))
							break;
					DeveloperConsole node_sub42;
					for (node_sub42 = (DeveloperConsole) hashtable_27_.getNode(3512,
							l); node_sub42 != null; node_sub42 = (DeveloperConsole) hashtable_27_.method1524((byte) 84))
						if (node_sub42.aString7522.equals(node_sub18.aString7149))
							break;
					int i_28_ = node_sub42.anInt7521--;
					if (node_sub20 == null) {
						node_sub20 = new Node_Sub20(node_sub18.aString7149, i_28_);
						aHashTable579.put(l, node_sub20, -125);
					}
					node_sub20.anIntArray7177[node_sub20.anIntArray7177.length - i_28_] = (int) node_sub18.aLong2797;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Commands.method1537(runtimeexception, "bt.J(" + i + ')');
		}
	}

	public final int method410(int i, byte b) {
		if (b >= -73)
			aFloat580 = 0.0019765322F;
		anInt578++;
		if (anObject589 == null)
			return anInt583;
		if (anObject589 instanceof HashTable) {
			Node_Sub32 node_sub32 = (Node_Sub32) ((HashTable) anObject589).getNode(3512, i);
			if (node_sub32 != null)
				return node_sub32.anInt7381;
			return anInt583;
		}
		Integer[] integers = (Integer[]) anObject589;
		if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) <= (integers.length ^ 0xffffffff))
			return anInt583;
		Integer integer = integers[i];
		if (integer != null)
			return integer.intValue();
		return anInt583;
	}

	public final int method411(int i) {
		anInt572++;
		if (i != 0)
			method408(96, -82, 126, true, 78, null, false);
		return anInt586;
	}

	public final String method412(int i, int i_29_) {
		anInt594++;
		if (i != -3470)
			anInt586 = 22;
		if (anObject589 == null)
			return aString570;
		if (anObject589 instanceof HashTable) {
			Node_Sub18 node_sub18 = (Node_Sub18) ((HashTable) anObject589).getNode(3512, i_29_);
			if (node_sub18 != null)
				return node_sub18.aString7149;
			return aString570;
		}
		String[] strings = (String[]) anObject589;
		if (i_29_ < 0 || (strings.length ^ 0xffffffff) >= (i_29_ ^ 0xffffffff))
			return aString570;
		String string = strings[i_29_];
		if (string != null)
			return string;
		return aString570;
	}

	public final boolean method416(int i, int i_36_) {
		anInt593++;
		if (anObject589 == null)
			return false;
		if (aHashTable579 == null)
			method419(false);
		if (i >= -86)
			aClass318_584 = null;
		if (aHashTable579.getNode(3512, i_36_) == null)
			return false;
		return true;
	}

	private final void method417(int i, int i_37_, BufferedStream buffer) {
		anInt576++;
		if ((i ^ 0xffffffff) == -2)
			aChar592 = Class20_Sub1.method294(buffer.readByte(), (byte) 123);
		else if ((i ^ 0xffffffff) != -3) {
			if (i == 3)
				aString570 = buffer.readString();
			else if (i != 4) {
				if ((i ^ 0xffffffff) == -6 || i == 6) {
					anInt586 = buffer.readUnsignedShort();
					HashTable hashtable = new HashTable(Class320_Sub19.method3753(anInt586, -729073628));
					for (int i_38_ = 0; i_38_ < anInt586; i_38_++) {
						int i_39_ = buffer.readInt();
						Node node;
						if (i != 5)
							node = new Node_Sub32(buffer.readInt());
						else
							node = new Node_Sub18(buffer.readString());
						hashtable.put(i_39_, node, i_37_ + -147);
					}
					anObject589 = hashtable;
				} else if (i == 7) {
					int i_40_ = buffer.readUnsignedShort();
					anInt586 = buffer.readUnsignedShort();
					String[] strings = new String[i_40_];
					for (int i_41_ = 0; i_41_ < anInt586; i_41_++) {
						int i_42_ = buffer.readUnsignedShort();
						strings[i_42_] = buffer.readString();
					}
					anObject589 = strings;
				} else if ((i ^ 0xffffffff) == -9) {
					int i_43_ = buffer.readUnsignedShort();
					anInt586 = buffer.readUnsignedShort();
					Integer[] integers = new Integer[i_43_];
					for (int i_44_ = 0; i_44_ < anInt586; i_44_++) {
						int i_45_ = buffer.readUnsignedShort();
						integers[i_45_] = new Integer(buffer.readInt());
					}
					anObject589 = integers;
				}
			} else
				anInt583 = buffer.readInt();
		} else
			aChar587 = Class20_Sub1.method294(buffer.readByte(), (byte) 127);
		if (i_37_ != 24)
			method417(55, -60, null);
	}

	private final void method419(boolean bool) {
		try {
			if (bool == false) {
				anInt591++;
				if (anObject589 instanceof HashTable) {
					HashTable hashtable = (HashTable) anObject589;
					aHashTable579 = new HashTable(hashtable.method1522(false));
					HashTable hashtable_46_ = new HashTable(hashtable.method1522(false));
					for (Node_Sub32 node_sub32 = (Node_Sub32) hashtable.method1516(
							false); node_sub32 != null; node_sub32 = (Node_Sub32) hashtable.method1520(107)) {
						Node_Sub32 node_sub32_47_ = (Node_Sub32) hashtable_46_.getNode(3512, node_sub32.anInt7381);
						if (node_sub32_47_ == null) {
							node_sub32_47_ = new Node_Sub32(0);
							hashtable_46_.put(node_sub32.anInt7381, node_sub32_47_, -126);
						}
						node_sub32_47_.anInt7381++;
					}
					for (Node_Sub32 node_sub32 = (Node_Sub32) hashtable.method1516(
							false); node_sub32 != null; node_sub32 = (Node_Sub32) hashtable.method1520(108)) {
						Node_Sub34 node_sub34 = (Node_Sub34) aHashTable579.getNode(3512, node_sub32.anInt7381);
						int i = ((Node_Sub32) hashtable_46_.getNode(3512, node_sub32.anInt7381)).anInt7381--;
						if (node_sub34 == null) {
							node_sub34 = new Node_Sub34(i);
							aHashTable579.put(node_sub32.anInt7381, node_sub34, -124);
						}
						node_sub34.anIntArray7411[node_sub34.anIntArray7411.length - i] = (int) node_sub32.aLong2797;
					}
				} else {
					Integer[] integers = (Integer[]) anObject589;
					int i = Class320_Sub19.method3753(integers.length, -729073628);
					aHashTable579 = new HashTable(i);
					HashTable hashtable = new HashTable(i);
					for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > (integers.length ^ 0xffffffff); i_48_++)
						if (integers[i_48_] != null) {
							int i_49_ = integers[i_48_].intValue();
							Node_Sub32 node_sub32 = (Node_Sub32) hashtable.getNode(3512, i_49_);
							if (node_sub32 == null) {
								node_sub32 = new Node_Sub32(0);
								hashtable.put(i_49_, node_sub32, -128);
							}
							node_sub32.anInt7381++;
						}
					for (int i_50_ = 0; integers.length > i_50_; i_50_++)
						if (integers[i_50_] != null) {
							int i_51_ = integers[i_50_].intValue();
							Node_Sub34 node_sub34 = (Node_Sub34) aHashTable579.getNode(3512, i_51_);
							int i_52_ = ((Node_Sub32) hashtable.getNode(3512, i_51_)).anInt7381--;
							if (node_sub34 == null) {
								node_sub34 = new Node_Sub34(i_52_);
								aHashTable579.put(i_51_, node_sub34, -128);
							}
							node_sub34.anIntArray7411[node_sub34.anIntArray7411.length + -i_52_] = i_50_;
						}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Commands.method1537(runtimeexception, "bt.P(" + bool + ')');
		}
	}

	public final Node_Sub20 method420(String string, byte b) {
		anInt585++;
		if (anObject589 == null)
			return null;
		if (aHashTable579 == null)
			method409(122);
		Node_Sub20 node_sub20;
		for (node_sub20 = (Node_Sub20) aHashTable579.getNode(3512,
				Class113.method1153(1, string)); node_sub20 != null; node_sub20 = (Node_Sub20) aHashTable579
						.method1524((byte) 84))
			if (node_sub20.aString7174.equals(string))
				break;
		int i = 35 / ((55 - b) / 54);
		return node_sub20;
	}
}
