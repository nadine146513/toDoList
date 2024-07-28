package toDoListApp;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel{
	//attributes
	private JButton addTask;
	private JButton clear;
	Border emptyBorder= BorderFactory.createEmptyBorder();
	//-----------------------------------------------------------------------------
	//constructor
	public ButtonPanel() {
	setPreferredSize(new Dimension(400,60));
	addTask=new JButton("Add Task");
	addTask.setBorder(emptyBorder);
	addTask.setFont(new Font("Times New Roman",Font.PLAIN,20));
	add(addTask);
	add(Box.createHorizontalStrut(20));
	clear=new JButton("Clear Completed Task");
	clear.setBorder(emptyBorder);
	clear.setFont(new Font("Times New Roman",Font.PLAIN,20));
	add(clear);
	}
	//--------------------------------------------------------------------------
	public JButton getAddTask() {
		return addTask;
	}
	//---------------------------------------------------------------------------
	public JButton getClear() {
		return clear;
	}
	

}

