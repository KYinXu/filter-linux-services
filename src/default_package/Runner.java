package default_package;

import javax.swing.JOptionPane;

public class Runner {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "List of services");
		System.out.println(s);
	}
}
