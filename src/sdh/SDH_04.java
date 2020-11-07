package sdh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SDH_04 extends SDH_01 {
	static Container contentPane;
	static JLabel theLabel;
	//static JPanel resultPanel; 
	
	
	public static class Ican extends   JFrame{
		
	  public void canDo(){
		this.setTitle("기말고사프로그램");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		this.setSize(900, 500);
		addMenu();
		SDH_01 firstResult= new SDH_01();
		theLabel=new JLabel();
		theLabel.setSize(100, 50);;
		
		theLabel.setVisible(true);
		theLabel.setText("기말고사 결과");
	  this.setLayout(new FlowLayout());
	  this.setLayout(new GridLayout(2,1));
	  this.add(theLabel);
	 // resultPanel.setVisible(true);
	 // resultPanel.add(theLabel);
	  }
	  public void addMenu() {
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			JMenu photoMenu = new JMenu("기말고사");
			menuBar.add(photoMenu);

			JMenuItem equalAction = new JMenuItem("1번문제");
			equalAction.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					theLabel.setText("50년 후 찾을 수 있는 금액 : "+result+"원");
				}
			});
			
			JMenuItem negativeAction = new JMenuItem("2번문제");
			JMenuItem mirror1Action = new JMenuItem("3번문제");
			JMenuItem exitAction = new JMenuItem("종료");
		
			photoMenu.add(equalAction);
			photoMenu.add(negativeAction);
			photoMenu.add(mirror1Action);
			photoMenu.add(exitAction);
			exitAction.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
	  }
	}
	public static void main(String[] args) {
		Ican start= new Ican();
		start.canDo();
		
		
	}

}


