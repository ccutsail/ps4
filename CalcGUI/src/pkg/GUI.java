package pkg;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GUI{

	private JFrame frame;
	private JTextField present_value;
	private JTextField interest_rate;
	private JTextField period;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPresentValueOf = new JLabel("Present Value of Investment:");
		lblPresentValueOf.setBounds(33, 40, 200, 14);
		frame.getContentPane().add(lblPresentValueOf);
		
		present_value = new JTextField();
		present_value.setBounds(213, 37, 86, 20);
		frame.getContentPane().add(present_value);
		present_value.setColumns(10);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate:");
		lblAnnualInterestRate.setBounds(33, 90, 133, 14);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		interest_rate = new JTextField();
		interest_rate.setBounds(213, 87, 86, 20);
		frame.getContentPane().add(interest_rate);
		interest_rate.setColumns(10);
		
		JLabel lblNumberOfYears = new JLabel("Number of Years:");
		lblNumberOfYears.setBounds(33, 140, 119, 14);
		frame.getContentPane().add(lblNumberOfYears);
		
		period = new JTextField();
		period.setBounds(213, 137, 86, 20);
		frame.getContentPane().add(period);
		period.setColumns(10);
		
		
		HandleClick computeClicked = new HandleClick();
		JButton btnCompute = new JButton("Compute");
		btnCompute.addMouseListener(computeClicked);
		btnCompute.setBounds(139, 165, 89, 23);
		frame.getContentPane().add(btnCompute);

		
		JLabel lblFutureValueOf = new JLabel("Future Value of Investment:");
		lblFutureValueOf.setBounds(33, 213, 200, 14);
		frame.getContentPane().add(lblFutureValueOf);
		
		
	}

private class HandleClick implements MouseListener {

	
	public void mouseClicked(MouseEvent e) {
		String pd = period.getText();
		String pv = present_value.getText();
		String intRate = interest_rate.getText();
		double future_value = FV_Calculator.futureValue(intRate, pv, pd);
		String fv = String.format("%.2f", future_value);
		JLabel genFV = new JLabel("0");
		genFV.setBounds(223, 213, 120, 14);
		frame.getContentPane().add(genFV);
		fv = "$" + fv;
		genFV.setText(fv);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
}