



import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author K-Shan
 *
 */
public class ZoomSettingsFrame extends JFrame {

	private static final long serialVersionUID = 6571276672345840063L;

	private JLabel lblZoomSettings;
	private JCheckBox zoomWithWheel;
	JCheckBox trueZoom;
	JCheckBox zoomPg;
	private JPanel contentPane;
	NovaFrame parent;

	public ZoomSettingsFrame(NovaFrame parent) {
		super("Zoom Settings");
		this.parent = parent;
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 233, 197);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		zoomWithWheel = new JCheckBox("Zoom using mouse wheel");
		zoomWithWheel.setBounds(6, 40, 211, 23);
		zoomWithWheel.setSelected(Utils.zoomWithMouseWheel);
		contentPane.add(zoomWithWheel);

		JButton btnDefaultZoom = new JButton("Default Zoom");
		btnDefaultZoom.addActionListener(e -> {
			Utils.zoomRatio = Utils.DEFAULT_TRUE_ZOOM_RATIO;
			//Utils.manualZoomRatio = Utils.DEFAULT_MANUAL_ZOOM_RATIO;
			updateZoomLabel();
		});
		btnDefaultZoom.setBounds(41, 122, 113, 23);
		contentPane.add(btnDefaultZoom);

		trueZoom = new JCheckBox("Enable zoom");//("True motion zoom (Resizable only)");
		trueZoom.addActionListener(e -> {
			trueZoomToggle();
		});
		trueZoom.setSelected(Utils.zoomEnabled);
		trueZoom.setBounds(6, 67, 182, 22);
		contentPane.add(trueZoom);

		zoomPg = new JCheckBox("Zoom using pg up and pg dn");
		zoomPg.setSelected(Utils.zoomWithPageKeys);
		zoomPg.setBounds(6, 92, 189, 23);
		contentPane.add(zoomPg);
		zoomPg.addActionListener(e -> {
			zoomPgToggle();
		});

		lblZoomSettings = new JLabel("[Zoom: " + getZoomPercentage() + "]");
		lblZoomSettings.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblZoomSettings.setBounds(41, 10, 142, 22);
		contentPane.add(lblZoomSettings);
		zoomWithWheel.addActionListener(e -> {
			mouseWheelZoomToggle();
		});
	}
	
	public String getZoomPercentage() {
		double p = 100;
		if (Utils.zoomEnabled /*&& Utils.manualZoomRatio == Utils.DEFAULT_MANUAL_ZOOM_RATIO*/) {
			if (Utils.zoomRatio == Utils.DEFAULT_TRUE_ZOOM_RATIO)
				p = 100;
			else
				p = ((Utils.MAX_TRUE_ZOOM_OUT_RATIO - Utils.zoomRatio) / 10) * 10;
		} /*else if (Utils.manualZoomRatio == Utils.DEFAULT_MANUAL_ZOOM_RATIO)
			p = 100;
		else if (Utils.manualZoomRatio > Utils.DEFAULT_MANUAL_ZOOM_RATIO)
			p = 100 - 100 / 14.0 * (14 - ((Utils.MAX_MANUAL_ZOOM_OUT_RATIO - Utils.manualZoomRatio) / 50));
		else if (Utils.manualZoomRatio < Utils.DEFAULT_MANUAL_ZOOM_RATIO)
			p = 100 + (100 / 14.0 * (14 + ((Utils.MAX_MANUAL_ZOOM_IN_RATIO - Utils.manualZoomRatio) / 50)));*/
		return new DecimalFormat("0.00").format(p) + "%";
	}

	public void updateZoomLabel() {
		this.lblZoomSettings.setText("[Zoom: " + getZoomPercentage()+"]");
		lblZoomSettings.setFont(new Font("Tahoma", Font.BOLD, 15));
	}

	private void mouseWheelZoomToggle() {
		zoomWithWheel.setSelected(!Utils.zoomWithMouseWheel);
		Utils.zoomWithMouseWheel = zoomWithWheel.isSelected();
		Utils.zoomRatio = Utils.DEFAULT_TRUE_ZOOM_RATIO;
		//Utils.manualZoomRatio = Utils.DEFAULT_MANUAL_ZOOM_RATIO;
		updateZoomLabel();
	}

	private void trueZoomToggle() {
		trueZoom.setSelected(!Utils.zoomEnabled);
		Utils.zoomEnabled = trueZoom.isSelected();
		Utils.zoomRatio = Utils.DEFAULT_TRUE_ZOOM_RATIO;
		//Utils.manualZoomRatio = Utils.DEFAULT_MANUAL_ZOOM_RATIO;
		updateZoomLabel();
	}

	private void zoomPgToggle() {
		Utils.zoomWithPageKeys = !Utils.zoomWithPageKeys;
		zoomPg.setSelected(Utils.zoomWithPageKeys);
		Utils.zoomRatio = Utils.DEFAULT_TRUE_ZOOM_RATIO;
		//Utils.manualZoomRatio = Utils.DEFAULT_MANUAL_ZOOM_RATIO;
		updateZoomLabel();
	}
}
