package exercise;

import java.awt.*;
import javax.swing.*;

class Panel3 extends JPanel{
	Font f = new Font("Serif",Font.PLAIN,18);
	int xs[] = {10,70,10,70};
	int ys[] = {80,120,120,80};
	int xs2[] = {650,750,650,750};
	int ys2[] = {10,50,50,10};
	int xs3[] = {650,750,650,750};
	int ys3[] = {80,120,120,80};
	
	public Panel3(){
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(10, 0, 60, 50);
		g.setFont(f);
		g.drawString("drawLine", 0, 70);
		g.drawPolyline(xs, ys, 4);
		g.drawString("drawPolyLine", 0, 150);
		g.drawRect(100, 0, 60, 50);
		g.drawString("drawRect", 100, 70);
		g.fillRect(100, 80, 60, 50);
		g.drawString("fillRect", 100, 150);
		g.draw3DRect(200, 0, 60, 50, true);
		g.drawString("draw3DRect", 200, 70);
		g.fill3DRect(200, 80, 60, 50, true);
		g.drawString("fill3DRect", 200, 150);
		g.drawRoundRect(300, 0, 60, 50,10,10);
		g.drawString("drawRoundRect", 300, 70);
		g.fillRoundRect(300, 80, 60, 50,10,10);
		g.drawString("fillRoundRect", 300, 150);
		g.drawOval(450, 0, 60, 50);
		g.drawString("drawOval", 450, 70);
		g.fillOval(450, 80, 60, 50);
		g.drawString("fillOval", 450, 150);
		g.drawArc(550, 0, 60, 50,45,270);
		g.drawString("drawArc", 550, 70);
		g.fillArc(550, 80, 60, 50,45,270);
		g.drawString("fillArc", 550, 150);
		g.drawPolygon(xs2, ys2,4);
		g.drawString("drawPolygon", 650, 70);
		g.fillPolygon(xs3, ys3, 4);
		g.drawString("fillPolygon", 650, 150);
	}
}

public class Drawings {
	public static void main(String args[]){
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new Panel3());
		f.setSize(800, 400);
		f.setVisible(true);
	}
}
