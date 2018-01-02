


import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 *
 * @author Karimshan Nawaz
 *
 */
public class MACAddress {

	/**
	 * Returns the mac address.
	 * 
	 * @return
	 */
	public static String get() {
		InetAddress ip;
		String MAC = "";
		try {
			ip = InetAddress.getLocalHost();
			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			byte[] mac = network.getHardwareAddress();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++)
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
			MAC = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return MAC;
	}
}