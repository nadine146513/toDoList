package toDoListApp;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppFrame extends JFrame{
	//attributes
	private TitleBar title;
	private List list;
	private ButtonPanel btnPanel;	
	private JButton addTask;
	private JButton clear;
	//------------------------------------------------------------------------
	//constructor
	public AppFrame() {
		setSize(400,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		title = new TitleBar();
		list = new List();
		btnPanel= new ButtonPanel();
		add(title,BorderLayout.NORTH);
		add(btnPanel,BorderLayout.SOUTH);
		add(list,BorderLayout.CENTER); 
		addTask=btnPanel.getAddTask();
		clear=btnPanel.getClear();
		addListeners();
	}
	//------------------------------------------------------------------------
	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Task task=new Task();
				list.add(task);
				list.unpdateNumbers();
				
				task.getDone().addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						task.changeState();
						revalidate();
					}
					
				});
				revalidate();
				
			}
		});
		clear.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent e)
			{
				list.removeCompletedTasks();
				repaint();
			}
		});
		
	}

}

