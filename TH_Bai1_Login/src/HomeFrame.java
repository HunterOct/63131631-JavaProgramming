import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public HomeFrame() {
		setTitle("HỆ THỐNG QUẢN LÝ BÁN HÀNG ABC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
