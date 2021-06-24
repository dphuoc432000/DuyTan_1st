package thietKeDoHoa;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Bai9 extends JFrame implements ActionListener {
	JLabel tieude=new JLabel();
	JTextField khung=new JTextField();
	JButton btchao=new JButton();
	JButton btxoa=new JButton();
	JButton btthoat=new JButton();
	JButton btBlue=new JButton();
	JButton btRed=new JButton();
	JButton btGreen=new JButton();
	public Bai9() {
		khung.setOpaque(true);
		khung.setBounds(new Rectangle(120,150,250,30));
		this.getContentPane().add(khung);
		
		btchao.setBackground(Color.BLUE);
		btchao.setOpaque(true);
		btchao.setBounds(new Rectangle(100,200,80,30));
		btchao.setText("Chào");
		this.getContentPane().add(btchao);
		
		btxoa.setBackground(Color.GREEN);
		btxoa.setOpaque(true);
		btxoa.setBounds(new Rectangle(200,200,80,30));
		btxoa.setText("Xóa");
		this.getContentPane().add(btxoa);
	}
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bai9 b  =new Bai9();
		b.setSize(600,400);
		b.setLocation(300,100);
		b.setVisible(true);
	}
	
}
