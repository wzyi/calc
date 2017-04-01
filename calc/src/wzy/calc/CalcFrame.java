package wzy.calc;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalcFrame extends JFrame{
/**
 * 显示计算结果
 */
	JLabel labelResult;
	
	JButton[] buttons= new JButton[20];
	
	String[] titles={"","","","c","7","8","9","Del","4","5","6","+",
			"1","2","3","-",".","0","=","/"};
	
	public CalcFrame() {
		// TODO Auto-generated constructor stub
		innitUi();
		setVisible(true);
	}

	private void innitUi() {
		// TODO Auto-generated method stub
		setTitle("计算器");
		setSize(320,480);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labelResult = new JLabel("0.0");
		
		labelResult.setBorder(new EmptyBorder(50,10,50,10));
		labelResult.setHorizontalAlignment(SwingConstants.RIGHT);
		labelResult.setFont(new Font("微软雅黑",Font.PLAIN,32));
		
		add(labelResult,BorderLayout.NORTH);
		
		JPanel buttonpanel = new JPanel( );
		buttonpanel.setLayout(new GridLayout(5, 4, 5, 5));
		
		add(buttonpanel,BorderLayout.CENTER);

		
		for(int i=0;i<titles.length;i++){
			if(titles[i].length()==0){
				buttonpanel.add(new JLabel());
			}
			else{
				buttons[i]= new JButton(titles[i]);
				buttonpanel.add(buttons[i]);
			}
		}
	}
}
