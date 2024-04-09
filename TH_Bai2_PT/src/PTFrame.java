

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

public class PTFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_a;
	private JTextField tf_b;
	private JTextField tf_c;


	public PTFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hằng Số");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 113, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblA = new JLabel("a: ");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblA.setBounds(10, 54, 24, 34);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("b:");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblB.setBounds(168, 54, 24, 34);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("c:");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblC.setBounds(340, 54, 24, 34);
		contentPane.add(lblC);
		
		tf_a = new JTextField();
		tf_a.setBounds(39, 54, 96, 31);
		contentPane.add(tf_a);
		tf_a.setColumns(10);
		
		tf_b = new JTextField();
		tf_b.setColumns(10);
		tf_b.setBounds(202, 54, 96, 31);
		contentPane.add(tf_b);
		
		tf_c = new JTextField();
		tf_c.setColumns(10);
		tf_c.setBounds(374, 54, 96, 31);
		contentPane.add(tf_c);
		
		JButton btnNewButton = new JButton("Kết Quả");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(tf_a.getText());
				float b = Float.parseFloat(tf_b.getText());
				float c = Float.parseFloat(tf_c.getText());
				String result = giaiPTBac2(a, b, c);
				JOptionPane.showMessageDialog(PTFrame.this, result);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 108, 133, 42);
		contentPane.add(btnNewButton);
	}
	private static String giaiPTBac2(float a, float b, float c) {
        String ketqua = null;
         
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                ketqua = "Phương trình vô nghiệm!";
            } else {
                ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 
                    + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            ketqua = "Phương trình vô nghiệm!";
        }
         
        return ketqua;
    }		
}
