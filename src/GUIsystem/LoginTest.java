package GUIsystem;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LoginTest extends JFrame{
	public static void main(String args[]) {
		LoginTest demo = new LoginTest();
    }
	 public LoginTest() {
	        init();
	        this.setTitle("学生选课系统");
			this.setBounds(400, 150, 320, 300);;
			this.setVisible(true);}
	 
	public void init() {
		FileOperations file=new FileOperations();
		JFrame frame=new JFrame();
		frame.setTitle("choice");
		JPanel panel2=new JPanel();
		panel2.setLayout(null);

		JLabel lb2=new JLabel("学号：");
		lb2.setBounds(10, 50, 100, 30);
		JTextField tf2=new JTextField(20);
		tf2.setBounds(80, 50, 200, 30);
		JLabel lb3=new JLabel("密码：");
		lb3.setBounds(10, 90, 200, 30);
		JTextField ps=new JTextField(10);
		ps.setBounds(80, 90, 200, 30);
		JButton btn1=new JButton("登录");
		btn1.setBounds(40, 130, 60, 30);
		btn1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
		if(tf2.getText().trim().length()==0||ps.getText().length()==0){
			JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
			return;
		}
		if(file.readFile("ABC").contains(tf2.getText()+","+ps.getText())){
			file.writeFile("ID",tf2.getText());
			JOptionPane.showMessageDialog(null, "登录成功");
			IndexTest choice=new IndexTest();
			setVisible(false);
		}
		

		if(file.readFile("ABC").contains(ps.getText())==false&&file.readFile("Admin").contains(tf2.getText())) {
			JOptionPane.showMessageDialog(null, "密码错误");
		}
		if(file.readFile("ABC").contains(tf2.getText())==false) {
			JOptionPane.showMessageDialog(null, "用户名不存在，请先注册再进行登录！");
		}
	}
});
		JButton btn2=new JButton("注册");
		btn2.setBounds(120, 130, 60, 30);
		btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
		if(tf2.getText().trim().length()==0||ps.getText().length()==0){
			JOptionPane.showMessageDialog(null, "用户名密码不允许为空");
			return;
		}

		else{
			file.writeFile("ABC",tf2.getText()+","+new String(ps.getText())+"。");
			JOptionPane.showMessageDialog(null, "注册成功！");}}}
		);
		JButton btn3 = new JButton();
		btn3.setText("重置");
		btn3.setBounds(200, 130, 60, 30);
		btn3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
			tf2.setText("");
			ps.setText("");
		}
	});
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(btn3);

		panel2.add(lb2);
		panel2.add(lb3);

		panel2.add(tf2);
		panel2.add(ps);
		this.add(panel2);
	}}

