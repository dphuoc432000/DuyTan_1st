package JFrameSwing;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameSwing extends JFrame {
	private JFrame jframe;
	private JLabel label1;

	public JFrameSwing(){
		setSize(400, 200);
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label1 = new JLabel("Phước");
		add(label1);
		label1.setText("Hà Đức Phước");
		JButton button = new JButton("Tên");
		button.setSize(30,20);
		add(button, "North",1);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label1.setText("Phước");
			}
		});
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameSwing j  =new JFrameSwing();
		j.setVisible(true);
	}

}
