package arrays;

import javax.swing.JOptionPane;

public class teste {
	public static void main(String[] args) {
		int i,n,f;
		
		n = 5;
		f = 1;
		i = 1;
		
		while(i<=n) {
			f = f * i;
			i = i + 1;
			
			JOptionPane.showMessageDialog(null, "" + f);
		}
		
		
	}
}
