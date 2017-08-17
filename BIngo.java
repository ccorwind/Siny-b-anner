import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Bingo {
	DrawPanel pan = new DrawPanel();
	
	
	public Bingo(){
		JFrame fram = new JFrame();
		fram.pack();
		fram.setVisible(true);
		fram.setResizable(true);
		fram.setSize(200, 200);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan.setSize(200, 200);
		JPanel label = new JPanel(new GridLayout(1,5));
		JPanel lay = new JPanel(new GridLayout(3,1,0,120));
		JLabel[] lab = new JLabel[5];
		JButton but = new JButton("Roll for BINGO");
		lab[0] = new JLabel("B");
		lab[1] = new JLabel("I");
		lab[2] = new JLabel("N");
		lab[3] = new JLabel("G");
		lab[4] = new JLabel("O");
		label.add(lab[0]);
		label.add(lab[1]);
		label.add(lab[2]);
		label.add(lab[3]);
		label.add(lab[4]);
		lay.add(label);
		lay.add(but);
		fram.add(lay);
		fram.add(pan);
	}
	
	private class DrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			for (int x = 0; x < 235; x += 45) {
				g.drawLine(x, 0, x, 225);
				g.drawLine(0, x, 225, x);

			}
		}
	}

	public static void main(String[] args) {
	new Bingo();

	}

	
	
	public class ball{
		String alp = "ABCDEFGHIJCLMNOPQRSTUVWXYZ";
		char[] list = alp.toCharArray();
		char letter;
		int number = 0;
		
	}
}
