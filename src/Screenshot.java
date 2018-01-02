import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

/**
 * 
 * @author Karimshan Nawaz
 *
 */
public class Screenshot {

	/**
	 * Takes a screenshot with support for any screen resolution.
	 */
	public static void takeScreenshot() {
		try {
			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			int width = gd.getDisplayMode().getWidth();
			int height = gd.getDisplayMode().getHeight();
			Container screen = Loader.novaFrame.getContentPane();
			BufferedImage buffImg = new Robot().createScreenCapture(new Rectangle(
				((int) (screen.getLocationOnScreen().x * (width / 1280))), 
				((int) (screen.getLocationOnScreen().y * (height / 720))),
				((int) (screen.getWidth() * (width / 1280))), 
				((int) (screen.getHeight() * (height / 720))))
			);
			File pathFile = new File(Utils.SCREENSHOTS_PATH + "/"+(new SimpleDateFormat("MMMM dd, yyyy").format(new Date())));
			if(!pathFile.exists())
				pathFile.mkdirs();
			String date = new SimpleDateFormat("h.mm.ss a zzz").format(new Date());
			File image = new File(pathFile.getAbsolutePath()+"/Nova Screenshot - "+date+".png");
			if(!image.exists())
				image.createNewFile();
			ImageIO.write(buffImg, "png", image);
			Utils.showFrameMessage("Screenshots", "Screenshot saved in: "+image.getAbsolutePath());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}