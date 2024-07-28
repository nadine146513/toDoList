package toDoListApp;


	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;

	import javax.swing.BorderFactory;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class Task extends JPanel{
		private JLabel index;
		private JTextField taskName;
		private JButton done;
		private boolean check;
		//------------------------------------------------------------------
		//constructor
		public Task() {
			setPreferredSize(new Dimension(40,20));
			setBackground(Color.red);
			setLayout(new BorderLayout());
			
			index= new JLabel("");
			index.setPreferredSize(new Dimension(20,20));
			index.setHorizontalAlignment(JLabel.CENTER);
			add(index,BorderLayout.WEST);
			
			taskName=new JTextField("New Task");
			taskName.setBorder(BorderFactory.createEmptyBorder());
			taskName.setBackground(Color.red);
			add(taskName,BorderLayout.CENTER);

			done= new JButton("done");
			done.setPreferredSize(new Dimension(40,20));
			done.setBorder(BorderFactory.createEmptyBorder());
			add(done,BorderLayout.EAST);
		}
		//------------------------------------------------------------------
		public void changeIndex(int num) {
			index.setText(num+"");
			revalidate();
		}
		//--------------------------------------------------------------------
		public void changeState() {
			setBackground(Color.green);
			taskName.setBackground(Color.green);
			check=true;
		}
		//-------------------------------------------------------------------
		public JButton getDone() {
			return done;
		}
		//----------------------------------------------------------------------
		public boolean getState()
		{
			return check;
		}
		
	}

