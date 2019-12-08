package GUIsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class IndexTest extends JFrame {
	public static void main(String args[]) {
		IndexTest demo = new IndexTest();//实例化demo
    }
	 public IndexTest() {
	        init();
	        this.setTitle("学生选课系统");
			this.setSize(400, 420);
			this.setVisible(true);
	    }
	public void init() { 
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		panel.setLayout(null);
		JButton btn1=new JButton("学生选课");//创建按钮组件
		btn1.setBounds(100, 40, 200, 40);//调节窗口尺寸
		btn1.addActionListener(new ActionListener(){//监听事件
			public void actionPerformed(ActionEvent arg0) {
			ChoiceSubject choice=new ChoiceSubject();//点击按钮时，对choice进行实例化，进行页面的跳转
			}
		});
		JButton btn2=new JButton("学生退课");//创建按钮组件
		btn2.setBounds(100, 120, 200, 40);//调节窗口尺寸
		btn2.addActionListener(new ActionListener(){//监听事件
			public void actionPerformed(ActionEvent arg0) {
			QuitSubjects quit=new QuitSubjects();//点击按钮时，对quit进行实例化，进行页面的跳转
			}
		});
		JButton btn3=new JButton("打印学生选课列表");//创建按钮组件
		btn3.setBounds(100, 200, 200, 40);//调节窗口尺寸
		btn3.addActionListener(new ActionListener(){//监听事件
			public void actionPerformed(ActionEvent arg0) {
			PrintSubjects print=new PrintSubjects();//点击按钮时，对print进行实例化，进行页面的跳转
			}
		});
		JButton btn4=new JButton("课程新加");//创建按钮组件
		btn4.setBounds(100, 280, 200, 40);//调节窗口尺寸
		btn4.addActionListener(new ActionListener(){//监听事件
			public void actionPerformed(ActionEvent arg0) {
			AddSubjects print=new AddSubjects();//点击按钮时，对print进行实例化，进行页面的跳转
			}
		});
	    panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		this.add(panel);
	}
}