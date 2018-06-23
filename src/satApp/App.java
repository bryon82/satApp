package satApp;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App {

	private JFrame frmSatelliteTracking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmSatelliteTracking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSatelliteTracking = new JFrame();
		frmSatelliteTracking.setTitle("Satellite Tracking");
		frmSatelliteTracking.setBounds(100, 100, 450, 300);
		frmSatelliteTracking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
