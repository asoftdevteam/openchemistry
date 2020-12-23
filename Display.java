import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Display extends JFrame {
	
	private static final long serialVersionUID = 2714307357715988131L;
	String lnum, name, per, gr, ar, row;
	JTextField num = new JTextField(5);
	JButton btn = new JButton("FIND");
	
	public Display(String s) {
		super(s);
		GridLayout layout = new GridLayout(2, 1, 0, 0);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(layout);
		add(num);
		add(btn);
		ActionListener actionListener = new List();
		btn.addActionListener(actionListener);
	}
	public class List implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int elnum = Integer.parseInt(num.getText());
				Chem c = new Chem();
				lnum = Integer.toString(elnum);
				name = c.elName[elnum - 1];
				per = Integer.toString(c.periodDet(elnum));
				gr = Integer.toString(c.groupDet(elnum));
				ar = Double.toString(c.elAr[elnum - 1]);
				row = Integer.toString(c.rowDet(elnum));
				JOptionPane.showMessageDialog(null, "Number: " + lnum 
						+ "\nShort name: " + name 
						+ "\nAtomic mass: " + ar
						+ "\nPeriod: " + per
						+ "\nGroup: " + gr
						+ "\nRow: " + row);
			}catch(NumberFormatException NumberFormatException) {
				JOptionPane.showMessageDialog(null, "There is an exception, sorry!\n\n" + NumberFormatException
						+ "\n\nTry enter integer number");
			}catch(ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
				JOptionPane.showMessageDialog(null, "There is an exception, sorry!\n" + ArrayIndexOutOfBoundsException
						+ "\n\nTry enter number from 1 to 110");
			}
		}
	}
}
