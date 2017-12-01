package afvink2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class opdracht extends JFrame implements ActionListener{

	
	private static final String TRUE = null;
	private JButton button;
	private JPanel panel;
	private JLabel label1;
	private JTextField fieldx;
	private JLabel label2;
	private JTextField fieldy;
	
	
	public static void main(String[] args) {
		
		opdracht frame  = new opdracht();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 1000);
		frame.getContentPane().setBackground(Color.PINK);
		frame.createGUI();
		frame.setVisible(true);
		
		
	}

	private void createGUI() {
		
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		window.setBackground(new Color(100,100,100,255));
		
		
		button = new JButton("GOOI DIE WATERTJEZ");
		window.add(button);
		button.addActionListener(this);
	
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(800,800));
		window.add(panel);
		
		label1 = new JLabel("X-as");
		window.add(label1);
				
		
		fieldx = new JTextField("");
		fieldx.setPreferredSize(new Dimension(60,20));
		window.add(fieldx);
		fieldx.setBackground(Color.pink);;
		
		
		label2 = new JLabel("Y-as");
		window.add(label2);
		
		fieldy = new JTextField("");
		fieldy.setPreferredSize(new Dimension(60,20));
		window.add(fieldy);
		fieldy.setBackground(Color.pink);;

			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		maakLeipWater();


	}

	private void maakLeipWater() {
		
	
		
		Graphics paper = panel.getGraphics();
		
		paper.clearRect(0, 0, getWidth(), getHeight());
		
		int xje = Integer.valueOf(fieldx.getText());
		int yje = Integer.valueOf(fieldy.getText());
		
		
		int lineLength = 50;
		int zuurstofSize = 30;
		int waterstofSize = 20;
		
		int waterstofRadius = (int) waterstofSize/2;
		
		int water1X = xje+lineLength-waterstofRadius;
		int water2X = xje-lineLength-waterstofRadius;
		
		int water1Y = yje+lineLength-waterstofRadius;
		int water2Y = yje+lineLength-waterstofRadius;
		
		
		//field.setBackground(new Color(211,211,211,255));
		
		
		
		
		paper.drawLine(xje, yje, water1X+waterstofRadius, water1Y+waterstofRadius);
		
		paper.drawLine(xje, yje, water2X+waterstofRadius, water2Y+waterstofRadius);
		
		
		
		
		paper.setColor(Color.RED);
		
		paper.fillOval(water1X, water1Y, waterstofSize, waterstofSize);
		paper.fillOval(water2X, water2Y, waterstofSize, waterstofSize);
		
		
		
		paper.setColor(Color.BLUE);
		paper.fillOval((int) (xje-(zuurstofSize/2)),(int) (yje-(zuurstofSize/2)),zuurstofSize,zuurstofSize);
		

		
		
	
		
		
		
	}
	
}
