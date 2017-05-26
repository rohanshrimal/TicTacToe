import java.awt.*;
import java.util.*;
import java.awt.event.*;


class Tic extends Frame implements ActionListener
{
	TextField b1;
Button t1,t2,t3,t4,t5,t6,t7,t8,t9;
Label l1;
Panel p1;


	private static int[][] array = new int[][] {
			
	
	};
	
	class InnerWindow extends WindowAdapter 
		{
			public void windowClosing(WindowEvent we)
			{
				
			dispose();
			
			}
		}
		int count=1;
		
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==t1)
			{
			if(count%2!=0)
			{t1.setLabel("X");
				
			}
			else
			{t1.setLabel("0");
			
			}
			count++;
			}
			else if(e.getSource()==t2)
			{
			if(count%2!=0)
			{t2.setLabel("X");
		
		}
			
			else
			{t2.setLabel("0");
		
			}
			count++;
			}
			else if(e.getSource()==t3)
			{
			if(count%2!=0)
			{t3.setLabel("X");
		
		}
			
			else
			{t3.setLabel("0");
			
			}
			count++;
			}else if(e.getSource()==t4)
			{
			if(count%2!=0)
			{t4.setLabel("X");
		
		}
			
			else
			{t4.setLabel("0");
			
			}
			count++;
			}else if(e.getSource()==t5)
			{
			if(count%2!=0)
			{t5.setLabel("X");
		
		}
			
			else
			{t5.setLabel("0");
			
			
			}count++;
			}
			else if(e.getSource()==t6)
			{
			if(count%2!=0)
			{t6.setLabel("X");
		
		}
			
			else
			{t6.setLabel("0");
			
			}
			count++;
			}else if(e.getSource()==t7)
			{
			if(count%2!=0)
			{t7.setLabel("X");
		
		}
			
			else
			{t7.setLabel("0");
			
			}
			count++;
			}
			else if(e.getSource()==t8)
			{
			if(count%2!=0)
			{t8.setLabel("X");
			
			
			}
			
			else
			{	t8.setLabel("0");
			
			}
			count++;
			}
			else if(e.getSource()==t9)
			{
			if(count%2!=0)
			{t9.setLabel("X");
		
		}
			
			else
			{t9.setLabel("0");
			
			}count++;
			}
			
			if(count>3)
			{
				getWinner();
				
			}
		
		}
	
	Boolean checkWinner(String a,String b,String c)
	{
	if(a.equals(b)&&a.equals(c))
		{if(a.equals("X"))
			b1.setText(a+"   wins");
		else if(a.equals("0"))
		b1.setText(a+"   wins");
		
		return true;
		}
	else 
	{
	return false;
	}
	}
	void getWinner()
	{
		String B1,B2,B3,B4,B5,B6,B7,B8,B9;
		B1=t1.getLabel();
		B2=t2.getLabel();
		B3=t3.getLabel();
		B4=t4.getLabel();
		B5=t5.getLabel();
		B6=t6.getLabel();
		B7=t7.getLabel();
		B8=t8.getLabel();
		B9=t9.getLabel();
		
		if(checkWinner(B1,B2,B3))
		{
			
		}
	else if(checkWinner(B4,B5,B6)) 
	{
}
	else if(checkWinner(B7,B8,B9))
	{
		
	}
	else if(checkWinner(B1,B4,B7))
	{
	
	}
	else if(checkWinner(B2,B5,B8))
	{
		
	}
	else if(checkWinner(B3,B6,B9))
	{
		
	}
	else if(checkWinner(B1,B5,B9))
	{
		
	}
	else if(checkWinner(B3,B5,B7))
	{
		
	}
	
		
	}
	
	
Tic()
{
	initcomponents();
}

void initcomponents()
{	l1=new Label("TIC TAC TOE");
	l1.setSize(100,30);
	l1.setLocation(200,50);
	t1=new Button();
	t1.setSize(60,60);
	t1.setLocation(100,100);
	b1=new TextField();
	b1.setSize(100,60);
	b1.setLocation(180,390);
	
	t2=new Button();
	t2.setSize(60,60);
	t2.setLocation(190,100);
	t3=new Button();
	t3.setSize(60,60);
	t3.setLocation(280,100);
	t4=new Button();
	t4.setSize(60,60);
	t4.setLocation(100,190);
	t5=new Button();
	t5.setSize(60,60);
	t5.setLocation(190,190);
	t6=new Button();
	t6.setSize(60,60);
	t6.setLocation(280,190);
	t7=new Button();
	t7.setSize(60,60);
	t7.setLocation(100,280);
	t8=new Button();
	t8.setSize(60,60);
	t8.setLocation(190,280);
	t9=new Button();
	t9.setSize(60,60);
	t9.setLocation(280,280);
	setLayout(null);
	setSize(500,500);
	setTitle("TIC TAC TOE");
	setLocation(130,80);
	add(l1);
	add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(t8);add(t9);
	add(b1);

	
	
	
	
	
			t1.addActionListener(this);
			t2.addActionListener(this);
			t3.addActionListener(this);
			t4.addActionListener(this);
			t5.addActionListener(this);
			t6.addActionListener(this);
			t7.addActionListener(this);
			t8.addActionListener(this);
			t9.addActionListener(this);
			this.addWindowListener(new InnerWindow());
			
			
	
}
public static void main(String args[])
{
	
	new Tic().setVisible(true);
}
}