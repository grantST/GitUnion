import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class MyAnimation extends JFrame implements KeyListener{

	public Drawing draw;

	public MyAnimation(){
		this.draw = new Drawing();

	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			draw.moveUp();
		}

		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			draw.moveDown();
		}

		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			draw.moveLeft();
		}

		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			draw.moveRight();
		}
	}
	public void keyTyped(KeyEvent e){
	
	}

	public void keyReleased(KeyEvent e){
	}

	public static void  main (String args[]){
		MyAnimation myFrame = new MyAnimation();
		myFrame.setSize(600,600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.add(myFrame.draw);
		myFrame.addKeyListener(myFrame);
	}
}