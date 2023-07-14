import java.awt.*;
import java.awt.event.*;
class TicTacToe extends Frame implements ActionListener
{
	static Label lbl1,lbl2;
	static Button b1,b2,b3,b4,b5,b6,b7,b8,b9,ng;
	int count=0;
	public static void main(String arr[])
	{
		TicTacToe ttt=new TicTacToe();
		lbl1=new Label("Welcome To Tic Tac Toe Game");
		lbl2=new Label("              ");
		Button ng=new Button("New Game");
		Button closebutton=new Button("close");
		b1=new Button();
		b2=new Button();
		b3=new Button();
		b4=new Button();
		b5=new Button();
		b6=new Button();
		b7=new Button();
		b8=new Button();
		b9=new Button();
		ttt.setLayout(new BorderLayout());
		Panel p=new Panel(new GridLayout(3,3,1,1));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		Panel p1=new Panel(new FlowLayout());
		p1.add(lbl1);
		Panel p2=new Panel(new FlowLayout());
		p2.add(lbl2);
		ttt.add(p1,BorderLayout.NORTH);
		ttt.add(p2,BorderLayout.SOUTH);
		ttt.add(p,BorderLayout.CENTER);
		ttt.add(ng,BorderLayout.WEST);
		ttt.add(closebutton,BorderLayout.EAST);
		ttt.setTitle("Tic Tac Toe");
		ttt.setSize(400,350);
		ttt.setVisible(true);   
		ng.addActionListener(ttt);
		closebutton.addActionListener(ttt);  
		b1.addActionListener(ttt);
		b2.addActionListener(ttt);
		b3.addActionListener(ttt);   
		b4.addActionListener(ttt);
		b5.addActionListener(ttt);
		b6.addActionListener(ttt);
		b7.addActionListener(ttt);
		b8.addActionListener(ttt);
		b9.addActionListener(ttt);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(e.getSource()==b1)
		{   
			if(b1.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b1.setLabel("0");
				else
					b1.setLabel("X");
			}
		}
		else if(e.getSource()==b2)
		{
			if(b2.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b2.setLabel("0");
				else
					b2.setLabel("X");
			}
		}
		else if(e.getSource()==b3)
		{
			if(b3.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b3.setLabel("0");
				else
					b3.setLabel("X");
			}
		}
		else if(e.getSource()==b4)
		{
			if(b4.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b4.setLabel("0");
				else
					b4.setLabel("X");
			}
		}
		else if(e.getSource()==b5)
		{
			if(b5.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b5.setLabel("0");
				else
					b5.setLabel("X");
			}
		}
		else if(e.getSource()==b6)
		{
			if(b6.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b6.setLabel("0");
				else
					b6.setLabel("X");
			}
		}
		else if(e.getSource()==b7)
		{
			if(b7.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b7.setLabel("0");
				else
					b7.setLabel("X");
			}
		}
		else if(e.getSource()==b8)
		{
			if(b8.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b8.setLabel("0");
				else
					b8.setLabel("X");
			}
		}
		else if(e.getSource()==b9)
		{
			if(b9.getLabel()=="")
			{
				count++;
				if(count%2==0)
					b9.setLabel("0");
				else
					b9.setLabel("X");
			}
		}
		else if(s.equals("New Game"))
		{
			count=0;
			b1.setLabel("");
			b2.setLabel("");
			b3.setLabel("");
			b4.setLabel("");
			b5.setLabel("");
			b6.setLabel("");
			b7.setLabel("");
			b8.setLabel("");
			b9.setLabel("");
			lbl2.setText("");
		}
		if((b1.getLabel()=="X"&&b2.getLabel()=="X"&&b3.getLabel()=="X")||(b1.getLabel()=="X"&&b4.getLabel()=="X"&&b7.getLabel()=="X")||(b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X")||(b7.getLabel()=="X"&&b8.getLabel()=="X"&&b9.getLabel()=="X")||(b7.getLabel()=="X"&&b5.getLabel()=="X"&&b3.getLabel()=="X")||(b3.getLabel()=="X"&&b6.getLabel()=="X"&&b9.getLabel()=="X")||(b4.getLabel()=="X"&&b5.getLabel()=="X"&&b6.getLabel()=="X")||(b2.getLabel()=="X"&&b5.getLabel()=="X"&&b8.getLabel()=="X"))
			lbl2.setText("X-WINS");
		else if((b1.getLabel()=="0"&&b2.getLabel()=="0"&&b3.getLabel()=="0")||(b1.getLabel()=="0"&&b4.getLabel()=="0"&&b7.getLabel()=="0")||(b1.getLabel()=="0"&&b5.getLabel()=="0"&&b9.getLabel()=="0")||(b7.getLabel()=="0"&&b8.getLabel()=="0"&&b9.getLabel()=="0")||(b7.getLabel()=="0"&&b5.getLabel()=="0"&&b3.getLabel()=="0")||(b3.getLabel()=="0"&&b6.getLabel()=="0"&&b9.getLabel()=="0")||(b4.getLabel()=="0"&&b5.getLabel()=="0"&&b6.getLabel()=="0")||(b2.getLabel()=="0"&&b5.getLabel()=="0"&&b8.getLabel()=="0"))
			lbl2.setText("0-WINS");
		else
			if(b1.getLabel()!=""&&b2.getLabel()!=""&&b3.getLabel()!=""&&b4.getLabel()!=""&&b5.getLabel()!=""&&b6.getLabel()!=""&&b7.getLabel()!=""&&b8.getLabel()!=""&&b9.getLabel()!="")
			    lbl2.setText("DRAW");
		if(s.equals("close"))
			System.exit(0);
	}
}