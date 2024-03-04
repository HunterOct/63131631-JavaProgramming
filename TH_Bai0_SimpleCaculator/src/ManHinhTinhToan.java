import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_a;
	private JTextField tf_b;
	private JTextField txt_KQ;

	public ManHinhTinhToan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpSTh = new JLabel("Nhập Số Thứ Hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhpSTh.setBounds(28, 126, 198, 30);
		contentPane.add(lblNhpSTh);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập Số Thứ Nhất (a)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(28, 58, 198, 30);
		contentPane.add(lblNewLabel_1_1);
		
		tf_a = new JTextField();
		tf_a.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_a.setBounds(236, 58, 440, 30);
		contentPane.add(tf_a);
		tf_a.setColumns(10);
		
		tf_b = new JTextField();
		tf_b.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_b.setColumns(10);
		tf_b.setBounds(236, 126, 440, 30);
		contentPane.add(tf_b);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hamxulycong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCong.setBounds(60, 208, 109, 48);
		contentPane.add(btnCong);
		
		JButton btnNhn = new JButton("Nhân");
		btnNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hamxulynhan();

			}
		});
		btnNhn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNhn.setBounds(377, 208, 109, 48);
		contentPane.add(btnNhn);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hamxulytru();

			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTru.setBounds(220, 208, 109, 48);
		contentPane.add(btnTru);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hamxulychia();

			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnChia.setBounds(536, 208, 109, 48);
		contentPane.add(btnChia);
		
		JLabel lblNewLabel = new JLabel("Kết Quả Tính Toán:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(28, 299, 184, 48);
		contentPane.add(lblNewLabel);
		
		txt_KQ = new JTextField();
		txt_KQ.setEnabled(false);
		txt_KQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_KQ.setColumns(10);
		txt_KQ.setBounds(205, 299, 79, 39);
		contentPane.add(txt_KQ);
	}
	void Hamxulycong() {
		String str_soA = tf_a.getText();
		String str_soB = tf_b.getText();
		double SoA = Double.parseDouble(str_soA);
		double SoB = Double.parseDouble(str_soB);
		double tong = SoA + SoB;
	    txt_KQ.setText(Double.toString(tong));
	}
	void Hamxulynhan() {
		String str_soA = tf_a.getText();
		String str_soB = tf_b.getText();
		double SoA = Double.parseDouble(str_soA);
		double SoB = Double.parseDouble(str_soB);
		double tong = SoA * SoB;
	    txt_KQ.setText(Double.toString(tong));
	}
	void Hamxulytru() {
		String str_soA = tf_a.getText();
		String str_soB = tf_b.getText();
		double SoA = Double.parseDouble(str_soA);
		double SoB = Double.parseDouble(str_soB);
		double tong = SoA - SoB;
	    txt_KQ.setText(Double.toString(tong));
	}
	void Hamxulychia() {
		String str_soA = tf_a.getText();
		String str_soB = tf_b.getText();
		double SoA = Double.parseDouble(str_soA);
		double SoB = Double.parseDouble(str_soB);
		double tong = SoA / SoB;
	    txt_KQ.setText(Double.toString(tong));
	}
}
