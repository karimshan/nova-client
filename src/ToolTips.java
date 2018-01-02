import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ToolTips {

	public static Class343 aClass343_3695;
	public static int anInt3693;
	public static int anInt3696;
	public static int anInt3698;
	public static int anInt3699;
	public static int anInt3700;
	public static boolean displayTooltips = true;
	public static ConcurrentHashMap<InterfaceTipObject, String> interfaceTooltips = 
		new ConcurrentHashMap<InterfaceTipObject, String>();
	public static IncomingPacket INTERFACE_HOVER_MESSAGES = new IncomingPacket(145, -2);
	public static OutgoingPacket INTERFACE_MOUSE_HOVERING_PACKET = new OutgoingPacket(148, 4);

	public static final IComponentDefinitions method3468(byte b, IComponentDefinitions widget) {
		anInt3699++;
		if ((widget.parentId ^ 0xffffffff) != 0)
			return Class76.method771((byte) 107, widget.parentId);
		if (b >= -92)
			return null;
		int i = widget.ihash >>> 16;
		Class303 class303 = new Class303(Class289.aHashTable3630);
		for (Node_Sub2 node_sub2 = (Node_Sub2) class303
				.method3542(true); node_sub2 != null; node_sub2 = (Node_Sub2) class303.method3539(0))
			if ((node_sub2.interfaceId ^ 0xffffffff) == (i ^ 0xffffffff))
				return Class76.method771((byte) 107, (int) node_sub2.aLong2797);
		return null;
	}

	public static final void method3469(int i, byte b) {
		Class362.anIntArray4497 = new int[i];
		Class84.anIntArray1147 = new int[i];
		MainFile.anIntArray135 = new int[i];
		if (b < -122) {
			anInt3700++;
			Class259.anIntArray3296 = new int[i];
			Class246.anIntArray3107 = new int[i];
		}
	}

	public static final void method3470(GraphicsToolkit graphicstoolkit, int i) {
		anInt3696++;
		if (((Class315.menuOptionCount ^ 0xffffffff) <= -3 || Class87.removeWalkHere) && Class58.aWidget861 == null) {
			String defaultOptionsString;
			String toolTipText = null;
			String titleString = "T";
			boolean isNPC = false;
			if (!Class87.removeWalkHere || (Class315.menuOptionCount ^ 0xffffffff) <= -3) {
				if (!Class116.shiftClicking || !Class175.keyStrokes.isKeyHeld(-46, 81)
						|| Class315.menuOptionCount <= 2) {
					CacheNode_Sub13 hoverTextNode = Node_Sub38_Sub23.aCacheNode_Sub13_10343;
					if (hoverTextNode == null) {
						System.out.println("hovering node in Class295 is null");
						return;
					}
					defaultOptionsString = Mobile.method844(hoverTextNode, (byte) 127);
					titleString = Mobile.method844(hoverTextNode, (byte) 127);
					final int interHash = hoverTextNode.anInt9561;
					final int inter = interHash >> 16;
					final int button = interHash - (inter << 16);
					final int slot = hoverTextNode.anInt9568;
					if (inter != 0) {
						ToolTips.sendOutgoingInterfaceMouseHoverPacket(inter, button, slot);
						for (final InterfaceTipObject tip : ToolTips.interfaceTooltips.keySet()) {
							if (tip != null && tip.getInter() == inter && tip.getComp() == button
								&& tip.getSlot() == slot) {
								toolTipText = ToolTips.interfaceTooltips.get(tip);
								break;
							}
						}
						/*if (interfaceId == 620 && compId == 25) {
							hoverMessageText = "Item ID: Unknown for now, TODO THIS";
						}*/
					}
					int[] is = null;
					if (!Class134.method1574(false, hoverTextNode.anInt9562)) {
						if ((hoverTextNode.anInt9569 ^ 0xffffffff) == 0) {
							if (OutgoingPacket.method3666(hoverTextNode.anInt9562, (byte) 109)) {
								Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.getNode(3512,
										(int) hoverTextNode.aLong9563);
								if (node_sub41 != null) {
									NPC npc = node_sub41.aNpc7518;
									NPCDefinition defs = npc.defs;
									//if(defs.getToolTip() != null && !defs.getToolTip().equals(""))
										toolTipText = npc.toolTip;//defs.getToolTip();
									isNPC = true;
									if (defs.anIntArray2827 != null)
										defs = defs.method2999(65535, Class24.aClass275_442);
									if (defs != null)
										is = defs.anIntArray2832;
								}
							} else if (ClientBackground.method1973(hoverTextNode.anInt9562, 31922)) {
								ObjectDefinition objectdefinition = Class186.aClass112_2256
										.method1145((int) (0x7fffffffL & hoverTextNode.aLong9563 >>> 32), 68);
								if (objectdefinition.objectWithSprite != null)
									objectdefinition = objectdefinition.method3038(13, Class24.aClass275_442);
								if (objectdefinition != null) {
									is = objectdefinition.anIntArray2981;
									if(Player.rights > 1)
										toolTipText = ""+objectdefinition.objectId; // Object tooltip TODO
								}
							}
						} else
							is = EntityNode_Sub3_Sub1.aClass86_9166.method1010(hoverTextNode.anInt9569,
									14434).anIntArray1926;
					} else
						is = EntityNode_Sub3_Sub1.aClass86_9166.method1010((int) hoverTextNode.aLong9563,
								14434).anIntArray1926;
					if (is != null)
						defaultOptionsString += Class43.method458(4923, is);
				} else
					defaultOptionsString = Mobile.method844(Node_Sub38_Sub23.aCacheNode_Sub13_10343, (byte) 126);
			} else
				defaultOptionsString = Class84.aString1148 + GlobalMessage.NPC_HOVER_BLANK_SPACE.getMessage(Class35.language)
						+ Class66.aString5177 + " ->";
			if ((Class315.menuOptionCount ^ 0xffffffff) < -3)
				defaultOptionsString += "<col=ffffff> / " + (Class315.menuOptionCount - 2)
						+ GlobalMessage.MORE_OPTIONS.getMessage(Class35.language);
			String longest;
			final String title = longest = titleString;
			final boolean isPlayer = title.contains("(level:") && !title.contains("->") && !isNPC;
			Player play = null;
			if (isPlayer) {
				try {
					String noTags = stripTags(title, "<", ">");
					noTags = noTags.replace(noTags.split(" ")[0], "");
					noTags = noTags.split("\\(level:")[0];
					noTags = noTags.trim();
					for (int k = 0; k < Client.LOCAL_PLAYERS.length; ++k) {
						final Player p = Client.LOCAL_PLAYERS[k];
						if (p != null && p.realName != null) {
							play = p;
							break;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (play != null && play.playerDefs != null && ToolTips.displayTooltips)
				toolTipText = "This is the player tooltip: "+play.displayName;
			if (!defaultOptionsString.contains("->") && !title.toLowerCase().equals("walk here") && toolTipText != null
					&& !toolTipText.isEmpty() && !toolTipText.equals(" ")) {
				final int titleWidth = Class262_Sub15_Sub1.aClass357_10524.method4033(-6, title);
				String[] lines = toolTipText.split("\n");
				if (lines == null || lines[0] == null) {
					lines = new String[] { toolTipText };
				}
				for (final String line : lines) {
					if (line != null && Class262_Sub15_Sub1.aClass357_10524.method4033(-6,
							line) > Class262_Sub15_Sub1.aClass357_10524.method4033(-6, longest)) {
						longest = line;
					}
				}
				final int stringWidth = Class262_Sub15_Sub1.aClass357_10524.method4033(-6, longest);
				final int width = stringWidth + 20;
				final int height = 30 + 13 * lines.length;
				int x = MouseHandler.mouseX - width / 2;
				int y = MouseHandler.mouseY + 35;
				final int screenWidth = Class360.screenWidth;
				final int screenHeight = Class205.screenHeight;
				if (x + width > screenWidth) {
					final int rightX = x + width;
					x -= rightX - screenWidth;
				} else if (x < 0) {
					x = 0;
				}
				if (y + height > screenHeight) {
					final int bottomY = y + height;
					y -= bottomY - screenHeight;
				} else if (y < 0) {
					y = 0;
				}
				final int headerOffsetX = width / 2 - titleWidth / 2;
				Utils.drawBox(title, x, y, width, height, headerOffsetX);
				Node_Sub23.drawToolTipBoxBorder(y, Class93.graphicsToolkit, x, width, 0, height);
				for (int j = 0; j < lines.length; ++j) {
					final int textY = y + 30 + j * 15;
					int textX = x + 5;
					String toDraw = lines[j];
					try {
						if (toDraw != null && toDraw.contains("<expire=")) {
							final int indexOf = toDraw.indexOf("<expire=") + 8;
							final String test = toDraw.substring(indexOf);
							final String inside = test.substring(0, test.length() - 1);
							final long time = Long.valueOf(inside);
							final long remaining = time - System.currentTimeMillis();
							final int totSeconds = (int) (remaining / 1000L);
							final long day = TimeUnit.SECONDS.toDays(totSeconds);
							final long hours = TimeUnit.SECONDS.toHours(totSeconds) - day * 24L;
							final long minutes = TimeUnit.SECONDS.toMinutes(totSeconds)
									- TimeUnit.SECONDS.toHours(totSeconds) * 60L;
							final long seconds = TimeUnit.SECONDS.toSeconds(totSeconds)
									- TimeUnit.SECONDS.toMinutes(totSeconds) * 60L;
							String toReplace = "";
							if (day > 0L) {
								toReplace = String.valueOf(toReplace) + day + "d";
							}
							if (hours > 0L) {
								toReplace = String.valueOf(toReplace) + (toReplace.isEmpty() ? "" : " ") + hours + "h";
							}
							if (minutes > 0L) {
								toReplace = String.valueOf(toReplace) + (toReplace.isEmpty() ? "" : " ") + minutes
										+ "m";
							}
							if (seconds > 0L) {
								toReplace = String.valueOf(toReplace) + (toReplace.isEmpty() ? "" : " ") + seconds
										+ "s";
							}
							if (remaining < 0L) {
								toReplace = "EXPIRED";
							}
							toDraw = toDraw.replace("<expire=" + time + ">", toReplace);
						}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					final int lineWidth = Class262_Sub15_Sub1.aClass357_10524.method4033(-6, toDraw);
					textX = x + (width / 2 - lineWidth / 2);
					Class262_Sub4.abstractFont.drawText(-3753835, 0, textY, toDraw, textX, Class105.aGLSpriteArray5194,
							null);
				}
			}
			if (Class320_Sub29.aWidget8488 != null) {
				AbstractFont class52 = Class320_Sub29.aWidget8488.method4155(true, graphicstoolkit);
				if (class52 == null)
					class52 = Class262_Sub4.abstractFont;
				class52.method545(GameStub.anIntArray44, Class320_Sub29.aWidget8488.anInt4835,
						Class320_Sub29.aWidget8488.anInt4809, 0, Class290_Sub6.anIntArray8123,
						Class320_Sub29.aWidget8488.anInt4754, Class320_Sub29.aWidget8488.anInt4695,
						ReferenceTable.aRandom283, defaultOptionsString, Class197.anInt2415,
						Class320_Sub29.aWidget8488.anInt4796, Class105.aGLSpriteArray5194, ClientScript.anInt9496,
						StandardDrawableModel.anInt5918, Class320_Sub29.aWidget8488.anInt4825);
				Class310.method3589(GameStub.anIntArray44[2], GameStub.anIntArray44[0], (byte) 115,
						GameStub.anIntArray44[3], GameStub.anIntArray44[1]);
			} else if (Node_Sub6.aWidget7047 != null && Class209.directory == Node_Sub38_Sub34.aClass353_10443) {
				int i_1_ = Class262_Sub4.abstractFont.method525(Class105.aGLSpriteArray5194, ClientScript.anInt9496,
						16777215, Node_Sub14.anInt7119 - -16, 8906, defaultOptionsString, Class290_Sub6.anIntArray8123, 0,
						ReferenceTable.aRandom283, 4 + Class385.anInt4913);
				Class310.method3589(i_1_ + Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6, defaultOptionsString),
						Class385.anInt4913 - -4, (byte) 103, 16, Node_Sub14.anInt7119);
			}
		}
	}

	static final String stripTags(String toStrip, final String tag1, final String tag2) {
		if (!toStrip.contains(tag1) || !toStrip.contains(tag2)) {
			return toStrip;
		}
		final int first = toStrip.indexOf(tag1);
		final int second = toStrip.indexOf(tag2);
		final String theThing = toStrip.substring(first, (second == toStrip.length()) ? second : (second + 1));
		toStrip = toStrip.replaceFirst(theThing, "");
		return stripTags(toStrip, tag1, tag2);
	}

	public static final int method3471(byte b) {
		anInt3693++;
		return Class243.aClass340_3069.method3959(255);
	}

	public static final Node_Sub16 method3472(int key, byte b, boolean bool) {
		if (b != 18)
			return null;
		anInt3698++;
		long l = key | (!bool ? 0 : -2147483648);
		return (Node_Sub16) Class153.aHashTable1947.getNode(b + 3494, l);
	}

	public static void method3473(int i) {
		Player.get = null;
		if (i != -2594)
			method3471((byte) 4);
		aClass343_3695 = null;
	}

	protected String aString3691;

	protected String aString3694;

	protected String aString3697;

	ToolTips(String string, String string_2_, String string_3_) {
		aString3697 = string_2_;
		aString3691 = string_3_;
		aString3694 = string;
	}
	
	public static void sendOutgoingInterfaceMouseHoverPacket(int inter, int button, int slot) {
		Node_Sub13 node_sub13 = PacketDecoder.sendOutgoingOPCode(-386, INTERFACE_MOUSE_HOVERING_PACKET, 
			Class218.aClass123_2566.isaacCipher);
		node_sub13.packet.writeInt(inter);
		node_sub13.packet.writeInt(button);
		node_sub13.packet.writeInt(slot);
		Class218.aClass123_2566.sendPacket(127, node_sub13);
	}
}
