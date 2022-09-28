package p22_09_28;

import java.awt.*;


import javax.swing.*;


public class Kiosk {
	
	// 1. 멤버변수선언
	JFrame f;
	JTextArea ta;
	JButton m1, m2, m3, m4;
	Food food;
	
	// 2. 멤버 변수 객체생성
	Kiosk() {
		f = new JFrame("Kiosk");
		m1 = new JButton("Burger");
		m2 = new JButton("Steak");
		m3 = new JButton("Pasta");
		m4 = new JButton("Beer");
		
		food = new Food(this);
				
		
		ta = new JTextArea(40, 20);
		
				
		
		
	}
	
	// 3. 화면구성하고 출력
	/*
	 * 전체 프래임 BorderLayout 지정
	 * 		-West	: JPanel 붙이기 (GridLayout (6,2))  
	 * 		-Center	: TextArea
	 * 		-South	: JPanel 붙이기 (GridLayout (1,6))
	 */
	public void addLayout () {
		
		//레이아웃 생성
		f.setLayout(new BorderLayout());
		
		f.add(ta, BorderLayout.WEST);	//text area 위치 조정
		ta.setPreferredSize(new Dimension(250, 100));	//text area 사이즈 조정
		


		
		
		
		Panel pne = new Panel();		
		pne.setLayout(new GridLayout(2, 2));
		
		
		
		pne.add(m1);
		pne.add(m2);
		pne.add(m3);
		pne.add(m4);
			
		
		f.add(pne, 	BorderLayout.EAST);		//메뉴 패널 위치 조정
		pne.setPreferredSize(new Dimension(300, 400));		//메뉴 패널 사이즈 조정
		
		
		//첫번째 이미지
		m1.setIcon(new ImageIcon("src\\p22_09_28\\image\\1.png"));
		m1.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m1.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
		//두번째 이미지
		m2.setIcon(new ImageIcon("src\\p22_09_28\\image\\2.png"));
		m2.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m2.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
		//세번째 이미지
		m3.setIcon(new ImageIcon("src\\p22_09_28\\image\\3.png"));
		m3.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m3.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
		//네번재 이미지
		m4.setIcon(new ImageIcon("src\\p22_09_28\\image\\4.png"));
		m4.setHorizontalTextPosition(JButton.CENTER);		// exit에 있는 텍스느 수평, 중간
		m4.setVerticalTextPosition(JButton.BOTTOM);			// 수직, 아래
		
		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("양식", pne);
		
		f.add(tab, BorderLayout.CENTER);

		
				
		
		
		
		f.setBounds(100, 100, 600, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public void eventProc() {
		
		
	
	}		//end of eventProc
	

	
	
	
	public static void main(String[] args) {
		
		
		Kiosk info = new Kiosk();
		info.addLayout();
		info.eventProc();

	}

}
