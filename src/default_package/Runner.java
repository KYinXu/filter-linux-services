package default_package;

import javax.swing.JOptionPane;

public class Runner {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "List of services");
		String regEx = "[\\[].[+-].[\\]]";
		String[] list = s.split(regEx);
		
		CompareServices c = new CompareServices();
		String[] Extra = c.compareExtra(list);
		String[] Missing = c.compareMissing(list);
		System.out.println("____________________________");
		System.out.println("Missing services: ");
		for(int i = 0; i < Missing.length; i++) {
			System.out.println(Missing[i]);
		}
		System.out.println("____________________________");
		System.out.println("Extra services: ");
		for(int i = 0; i < Extra.length; i++) {
			System.out.println(Extra[i]);
			
		}
		
	}
}
