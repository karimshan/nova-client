



/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;

import jagex3.jagmisc.jagmisc;

public class Class193 implements Runnable {
	public static Class212 aClass212_2365 = new Class212("", 19);
	public static int anInt2359;
	public static int anInt2360;
	public static int anInt2363;
	public static int anInt2366;
	public static int anInt2367;
	public static int anInt2368 = 1407;
	public static int anInt2369;
	public static int[] anIntArray2362 = new int[5];

	public static final boolean method1955(int i, String string) {
		anInt2366++;
		if (string == null)
			return false;
		for (int i_0_ = i; (Node_Sub38_Sub14.anInt10242 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++)
			if (string.equalsIgnoreCase(Class262_Sub12.aStringArray7793[i_0_]))
				return true;
		if (string.equalsIgnoreCase(Player.get.realName))
			return true;
		return false;
	}

	public static void method1956(byte b) {
		aClass212_2365 = null;
		anIntArray2362 = null;
		@SuppressWarnings("unused")
		int i = 80 / ((b - 59) / 51);
	}

	private Class312 aClass312_2361 = new Class312();

	private Thread aThread2364 = new Thread(this);

	public Class193() {
		aThread2364.setDaemon(true);
		aThread2364.start();
	}

	public final void method1957(int i) {
		anInt2359++;
		if (aThread2364 != null) {
			method1958(0, new Node());
			try {
				if (i != 5247)
					return;
				aThread2364.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread2364 = null;
		}
	}

	private final void method1958(int i, Node node) {
		synchronized (aClass312_2361) {
			aClass312_2361.method3625((byte) -54, node);
			if (i != 0)
				method1957(97);
			aClass312_2361.notify();
		}
		anInt2369++;
	}

	public final Node_Sub7 method1959(byte b, String string) {
		anInt2367++;
		if (b != -60)
			anInt2368 = -33;
		if (aThread2364 == null)
			throw new IllegalStateException("");
		if (string == null)
			throw new IllegalArgumentException("");
		Node_Sub7 node_sub7 = new Node_Sub7(string);
		method1958(0, node_sub7);
		return node_sub7;
	}

	@Override
	public final void run() {
		anInt2360++;
		for (;;) {
			Node_Sub7 node_sub7;
			synchronized (aClass312_2361) {
				Node node;
				for (node = aClass312_2361.method3619(-96); node == null; node = aClass312_2361.method3619(-71))
					try {
						aClass312_2361.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				if (!(node instanceof Node_Sub7))
					break;
				node_sub7 = (Node_Sub7) node;
			}
			int i;
			try {
				byte[] bs = InetAddress.getByName(node_sub7.aString7064).getAddress();
				i = jagmisc.ping(bs[0], bs[1], bs[2], bs[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			node_sub7.anInt7060 = i;
		}
	}
}
