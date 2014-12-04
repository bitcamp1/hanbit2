package net.hb.model;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JframeCalc extends JFrame{

	/**
	 * 
	http://djsdj222.blog.me/220170288062
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel label;
	JButton btnNo[] = new JButton[10];
	JButton plus,minus,multi,div,equal,clear;
	String inputNo;
	int result;
	char op;
	public JframeCalc() throws HeadlessException {
		super("계산기");
		setBounds(200,200,300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("0",JLabel.RIGHT);
		label.setFont(new Font("궁서",Font.BOLD,20));
		add(label,BorderLayout.NORTH);
		JPanel p = new JPanel(new GridLayout(4,4,1,1));
		
		
	}
	
	
	
	
}
