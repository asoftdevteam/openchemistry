import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Display extends JFrame {
	
	private static final long serialVersionUID = 2714307357715988131L;
	String lnum, name, per, gr, ar, row;
	JTextField num = new JTextField(5);
	JButton btn = new JButton("FIND");
	JMenuBar menuBar = new JMenuBar();
	
	private JMenu createFileMenu() {

        JMenu file = new JMenu("File");
        JMenuItem lic = new JMenuItem("License");
        JMenuItem about = new JMenuItem("About");
        JMenuItem exit = new JMenuItem("Exit");
        
        file.add(lic);
        file.add(about);
        file.addSeparator();
        file.add(exit);
        
        lic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	JOptionPane.showMessageDialog(null, "Copyright (c) 2020, ASD Team"

            			+ "\nРазрешается повторное распространение и использование как в виде исходного кода, так и в двоичной форме, с изменениями или без, при соблюдении следующих условий:"

    					+ "\n\n1) При повторном распространении исходного кода должно оставаться указанное выше уведомление об авторском праве, этот список "
    					+ "\nусловий и последующий отказ от гарантий."
    					+ "\n2) При повторном распространении двоичного кода должна сохраняться указанная выше информация об авторском праве, этот список условий "
    					+ "\nи последующий отказ от гарантий в документации и/или в других материалах, поставляемых при распространении."
    					+ "\n3) Ни название ASD Team, ни имена её сотрудников не могут быть использованы в качестве поддержки или продвижения продуктов, основанных "
    					+ "\nна этом ПО без предварительного письменного разрешения."

						+ "\n\nЭТА ПРОГРАММА ПРЕДОСТАВЛЕНА ВЛАДЕЛЬЦАМИ АВТОРСКИХ ПРАВ И/ИЛИ ДРУГИМИ СТОРОНАМИ «КАК ОНА ЕСТЬ» БЕЗ КАКОГО-ЛИБО ВИДА ГАРАНТИЙ, "
						+ "\nВЫРАЖЕННЫХ ЯВНО ИЛИ ПОДРАЗУМЕВАЕМЫХ, ВКЛЮЧАЯ, НО НЕ ОГРАНИЧИВАЯСЬ ИМИ, ПОДРАЗУМЕВАЕМЫЕ ГАРАНТИИ КОММЕРЧЕСКОЙ ЦЕННОСТИ И ПРИГОДНОСТИ "
						+ "\nДЛЯ КОНКРЕТНОЙ ЦЕЛИ. НИ В КОЕМ СЛУЧАЕ НИ ОДИН ВЛАДЕЛЕЦ АВТОРСКИХ ПРАВ И НИ ОДНО ДРУГОЕ ЛИЦО, КОТОРОЕ МОЖЕТ ИЗМЕНЯТЬ И/ИЛИ ПОВТОРНО "
						+ "\nРАСПРОСТРАНЯТЬ ПРОГРАММУ, КАК БЫЛО СКАЗАНО ВЫШЕ, НЕ НЕСЁТ ОТВЕТСТВЕННОСТИ, ВКЛЮЧАЯ ЛЮБЫЕ ОБЩИЕ, СЛУЧАЙНЫЕ, СПЕЦИАЛЬНЫЕ ИЛИ ПОСЛЕДОВАВШИЕ "
						+ "\nУБЫТКИ, ВСЛЕДСТВИЕ ИСПОЛЬЗОВАНИЯ ИЛИ НЕВОЗМОЖНОСТИ ИСПОЛЬЗОВАНИЯ ПРОГРАММЫ (ВКЛЮЧАЯ, НО НЕ ОГРАНИЧИВАЯСЬ ПОТЕРЕЙ ДАННЫХ, ИЛИ ДАННЫМИ, "
						+ "\nСТАВШИМИ НЕПРАВИЛЬНЫМИ, ИЛИ ПОТЕРЯМИ, ПРИНЕСЕННЫМИ ИЗ-ЗА ВАС ИЛИ ТРЕТЬИХ ЛИЦ, ИЛИ ОТКАЗОМ ПРОГРАММЫ РАБОТАТЬ СОВМЕСТНО С ДРУГИМИ ПРОГРАММАМИ), "
						+ "\nДАЖЕ ЕСЛИ ТАКОЙ ВЛАДЕЛЕЦ ИЛИ ДРУГОЕ ЛИЦО БЫЛИ ИЗВЕЩЕНЫ О ВОЗМОЖНОСТИ ТАКИХ УБЫТКОВ."
            			);
            }
        });
        
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	JOptionPane.showMessageDialog(null, "Developer: slavagg(aka reicode)\nTeam-distributor: ASD Team");
            }
        });

        exit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    System.exit(0);
                }
            });
        return file;
    }
	
	public Display(String s) {
		super(s);
		GridLayout layout = new GridLayout(2, 1, 0, 0);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(layout);
		add(num);
		add(btn);
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
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
						+ "\n\nTry enter integer numberзможе");
			}catch(ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
				JOptionPane.showMessageDialog(null, "There is an exception, sorry!\n" + ArrayIndexOutOfBoundsException
						+ "\n\nTry enter number from 1 to 110");
			}
		}
	}
}
