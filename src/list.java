import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class list extends JFrame {
	private JList list;
	private String[] colornames = {"CYAN", "DARK GRAY", "MAGENTA", "PINK"};
	private Color[] color = {Color.CYAN, Color.DARK_GRAY, Color.MAGENTA, Color.PINK};
	
	public list() {
	super("JList Demo");
	setLayout(new FlowLayout());
	
	list = new JList(colornames);
	list.setVisibleRowCount(2);
	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	add(new JScrollPane(list));
	
	list.addListSelectionListener(
			new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent event) {
					getContentPane().setBackground(color[list.getSelectedIndex()]);
				}
			}
			);	
	}
}
