package runTimeSelection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class DelayLoadConfig implements Runnable {

	private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		while (isRunning == true) {
			DateFormat normalDateFormat = new SimpleDateFormat("yyyy/MM/dd");
			DateFormat normalTimeFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			Main.label.setText(normalTimeFormat.format(date));
			Main.label_1.setText(normalDateFormat.format(date));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}