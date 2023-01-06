package currencyConverter;
// Java program to convert from

// rupee to the dollar and vice-versa
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {

	// Function to convert from rupee
	// to the dollar and vice-versa
	// using Java Swing
	public static void converter() {

		// Creating a new frame using JFrame
		JFrame f = new JFrame("CONVERTER");

		// Creating two labels
		JLabel l1, l2;

		// Creating two text fields.
		// One for rupee and one for
		// the foreign currency
		JTextField t1, t2;

		// Creating 11 buttons
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;

		// Naming the labels and setting
		// the bounds for the labels
		l1 = new JLabel("Rupees:");
		l1.setBounds(20, 15, 110, 30);
		l2 = new JLabel("Foreign Currency:");
		l2.setBounds(240, 15, 110, 30);

		// Initializing the text fields with
		// 0 by default and setting the
		// bounds for the text fields
		t1 = new JTextField("0.0");
		t1.setBounds(20, 40, 150, 30);
		t2 = new JTextField("0.0");
		t2.setBounds(240, 40, 150, 30);

		// Creating 5 buttons to convert from INR to foreign currency,
		// 5 buttons for foreign currency to INR
		// and one button for close
		b1 = new JButton("INR to Dollar");
		b1.setBounds(20, 80, 150, 15);
		b2 = new JButton("Dollar to INR");
		b2.setBounds(240, 80, 150, 15);
		b3 = new JButton("close");
		b3.setBounds(165, 200, 80, 30);
		b4 = new JButton("Euro to INR");
		b4.setBounds(240, 100, 150, 15);
		b5 = new JButton("INR to Euro");
		b5.setBounds(20, 100, 150, 15);
		b6 = new JButton("INR to Yen");
		b6.setBounds(20, 120, 150, 15);
		b7 = new JButton("Yen to INR");
		b7.setBounds(240, 120, 150, 15);
		b9 = new JButton("INR to Pound");
		b9.setBounds(20, 140, 150, 15);
		b8 = new JButton("Pound to INR");
		b8.setBounds(240, 140, 150, 15);
		b10 = new JButton("INR to Yaun");
		b10.setBounds(20, 160, 150, 15);
		b11 = new JButton("Yaun to INR");
		b11.setBounds(240, 160, 150, 15);

		// Adding action listener
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d = Double.parseDouble(t1.getText());

				// Converting rupees to dollars
				double d1 = (d / 81.68);

				// Getting the string value of the
				// calculated value
				String str1 = String.valueOf(d1);

				// Placing it in the text box
				t2.setText(str1);
			}
		});

		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d = Double.parseDouble(t1.getText());

				// Converting rupees to yaun
				double d1 = (d / 11.42);

				// Getting the string value of the
				// calculated value
				String str1 = String.valueOf(d1);

				// Placing it in the text box
				t2.setText(str1);
			}
		});

		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d = Double.parseDouble(t1.getText());

				// Converting rupees to euro
				double d1 = (d / 85.11);

				// Getting the string value of the
				// calculated value
				String str1 = String.valueOf(d1);

				// Placing it in the text box
				t2.setText(str1);
			}
		});

		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d = Double.parseDouble(t1.getText());

				// Converting rupees to Yen
				double d1 = (d / 0.59);

				// Getting the string value of the
				// calculated value
				String str1 = String.valueOf(d1);

				// Placing it in the text box
				t2.setText(str1);
			}
		});

		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d = Double.parseDouble(t1.getText());

				// Converting rupees to Pound
				double d1 = (d / 98.98);

				// Getting the string value of the
				// calculated value
				String str1 = String.valueOf(d1);

				// Placing it in the text box
				t2.setText(str1);
			}
		});

		// Adding action listener
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d2 = Double.parseDouble(t2.getText());

				// converting Dollars to rupees
				double d3 = (d2 * 81.68);

				// Getting the string value of the
				// calculated value
				String str2 = String.valueOf(d3);

				// Placing it in the text box
				t1.setText(str2);
			}
		});

		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d2 = Double.parseDouble(t2.getText());

				// converting Yaun to rupees
				double d3 = (d2 * 11.42);

				// Getting the string value of the
				// calculated value
				String str2 = String.valueOf(d3);

				// Placing it in the text box
				t1.setText(str2);
			}
		});

		// Action listener to close the form
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Converting to double
				double d4 = Double.parseDouble(t2.getText());

				// converting Euro to rupees
				double d5 = (d4 * 85.11);
				String str3 = String.valueOf(d5);
				t1.setText(str3);
			}
		});

		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Converting to double
				double d4 = Double.parseDouble(t2.getText());

				// converting Yen to rupees
				double d5 = (d4 * 0.59);
				String str3 = String.valueOf(d5);
				t1.setText(str3);
			}
		});

		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Converting to double
				double d2 = Double.parseDouble(t2.getText());

				// converting Pound to rupees
				double d3 = (d2 * 98.98);

				// Getting the string value of the
				// calculated value
				String str2 = String.valueOf(d3);

				// Placing it in the text box
				t1.setText(str2);
			}
		});

		// Default method for closing the frame
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// Adding the created objects
		// to the form
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b9);
		f.add(b8);
		f.add(b11);
		f.add(b10);

		f.setLayout(null);
		f.setSize(450, 300);
		f.setVisible(true);
	}

	// Driver code
	public static void main(String args[]) {
		converter();
	}
}
