package toDoListApp;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{
	//---------------------------------------------------------------------------
	//contructor
	public TitleBar(){
		setPreferredSize(new Dimension(400,80));
		JLabel titleText= new JLabel("TO DO LIST");
		titleText.setPreferredSize(new Dimension(200,80));
		titleText.setFont(new Font("Times New Roman", Font.BOLD,20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		add(titleText);
	}

}
