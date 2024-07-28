package toDoListApp;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class List extends JPanel{
	//----------------------------------------------------------------------------
	//construtor
	public List() {
	GridLayout layout =new GridLayout(10,1);
	layout.setVgap(5);
	setLayout(layout);
	}
	//----------------------------------------------------------------------------
	public void unpdateNumbers() {
		Component[] ListItems= getComponents();
		for(int i=0;i<ListItems.length;i++) {
			if(ListItems[i] instanceof Task) {
				((Task)ListItems[i]).changeIndex(i+1);
			}
		}
	
	}
	//-------------------------------------------------------------------------------
	public void removeCompletedTasks()
	{
		
		for(Component c : getComponents())
		{
			if(c instanceof Task)
			{
				if(((Task)c).getState())
				{
					remove(c);
					unpdateNumbers();
				}
			}
		}	
	}
}

