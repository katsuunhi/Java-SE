package ch16;

//Example:  Use of JCheckBox, FlowLayout, Borderlayout, other componenets and event handling

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class BookInfoPanel2 extends JPanel implements ActionListener{
	private JLabel entryLabel;
	private JTextField entryField, titleField;
	private JCheckBox authorBox, pressBox;
	private JButton okButton, exitButton;
	public BookInfoPanel2() {						//构造器
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		entryLabel = new JLabel("Enter the book code:");
		inputPanel.add(entryLabel);
		entryField = new JTextField("Java or C/C++", 12);
		inputPanel.add(entryField);
		entryField.addActionListener(this);
		titleField = new JTextField(43);
		titleField.setEditable(false);
		titleField.setVisible(false);
		inputPanel.add(titleField);
		authorBox = new JCheckBox("Author", true);
		authorBox.setVisible(false);
		inputPanel.add(authorBox);
		authorBox.addActionListener(this);
		pressBox = new JCheckBox("Press");
		pressBox.setVisible(false);
		inputPanel.add(pressBox);

		pressBox.addActionListener(this);
		JPanel buttonPanel = new JPanel();				//创建按钮控制板
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));	//组件利用流程布局向右对齐
		okButton = new JButton("Ok");
		exitButton = new JButton("Exit");
		buttonPanel.add(okButton);						//将按钮注册到控制板
		buttonPanel.add(exitButton);
		setLayout(new BorderLayout());					//创建框架的围界布局
		add(inputPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);			//将按钮控制板按围界布局注册到框架
		okButton.addActionListener(this);
		exitButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {	//完善事件处理接口方法
		Object source = e.getSource();				//得到事件发生源
		String info = null;
		if (source == okButton) {
		    if (entryField.getText().equals("Java")) {
			   titleField.setText("Programming Art in Java");
			   info = titleField.getText();
			   setVisibles();
		    }
		    else if (entryField.getText().equals("C/C++")) {
			   titleField.setText("Complete Programming in C/C++");
			   info = titleField.getText();
	     	   setVisibles();
			}
		}
		if (source == okButton && authorBox.isSelected()) {
			  info += getAuthorInfo();
			  titleField.setText(info);
		 }
		if(source == okButton && pressBox.isSelected()) {
			  info += getPressInfo();
			  titleField.setText(info);
		 }
		if (source == exitButton) {
			JOptionPane.showMessageDialog(null, "Good bye!\nPress 确定 to close window...");
			System.exit(2);					//处理这个事件
		}

	}
	public void setVisibles() {
		entryLabel.setVisible(false);
		entryField.setEditable(false);
		titleField.setVisible(true);
		authorBox.setVisible(true);
		pressBox.setVisible(true);
		setSize(560, 200);
	}
	public String getAuthorInfo() {
		return ", Gao Yong Qiang, Ph.D.";
	}
	public String getPressInfo() {
		return ", Tsinghua University Press.";
	}
}