import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_username;
	private JTextField tf_pass;


	public LoginFrame() {
		setTitle("Đăng Nhập Hệ Thống Quản Lý Bán Hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên Đăng Nhập :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 21, 153, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu :");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMtKhu.setBounds(10, 83, 105, 36);
		contentPane.add(lblMtKhu);
		
		tf_username = new JTextField();
		tf_username.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_username.setBounds(171, 23, 252, 46);
		contentPane.add(tf_username);
		tf_username.setColumns(10);
		
		tf_pass = new JTextField();
		tf_pass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_pass.setColumns(10);
		tf_pass.setBounds(171, 79, 252, 46);
		contentPane.add(tf_pass);
		
		JButton btn_login = new JButton("Đăng Nhập");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XulyDangNhap();
			}
		});
		btn_login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_login.setBounds(171, 167, 178, 55);
		contentPane.add(btn_login);
	}
	void XulyDangNhap() {
		// Lấy về tên dn và mật khẩu
		String StrTen = tf_username.getText();
		String StrMK = tf_pass.getText();
		if(StrTen.equals("63CNTT") && StrMK.equals("123"))
		{
			HomeFrame home = new HomeFrame();
			home.setVisible(true);
			this.setVisible(false);
		}
		else {
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Đăng Nhập Thất Bại");
		}
			
	}

}
