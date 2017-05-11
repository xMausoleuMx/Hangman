import javax.swing.JDialog;

public class Manager {

	public static void main(String[] args) {
		try {
			gameWindow dialog = new gameWindow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
