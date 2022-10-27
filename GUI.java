import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {

	private static JTextArea mondayTextAreata;
	private static JTextField mondayInput;
	private static JButton mondayButton;
	private static JTextArea tusdayTextArea;
	private static JTextField tuesdayInput;
	private static JButton tuesdayButton;
	private static JTextArea wednesdayTextArea;
	private static JTextField wednesdayInput;
	private static JButton wednesdayButton;
	private static JTextArea thursdayTextArea;
	private static JTextField thursdayInput;
	private static JButton thurdsdayButton;
	private static JTextArea fridayTextArea;
	private static JTextField fridayInput;
	private static JButton fridayButton;
	private static JTextArea saturdayTextArea;
	private static JTextField saturdayInput;
	private static JButton saturdayButton;
	private static JTextArea sundayTextArea;
	private static JTextField sundayInput;
	private static JButton sundayButton;

	public void createGUI() {

		WeekDates weekDates = new WeekDates();
		String[] dates = weekDates.getDates();
		System.out.println(Arrays.toString(dates));

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 800);
		frame.setTitle("420 everyday & import javax.swing.*");

		frame.setLayout(new GridLayout(1, 7, 5, 5));

		LocalDate today = LocalDate.now();
		String currentDate = today.format(DateTimeFormatter.ofPattern("dd/MM"));


		// Monday 
		//panel*************************************************************************
		JPanel mondayPanel = new JPanel();
		mondayPanel.setLayout(new GridLayout(5, 1));
		mondayPanel.setBackground(Color.white);
		JLabel mondayDayLabel = new JLabel("Monday");
		JLabel mondayDateLabel = new JLabel(dates[0]);
		if (currentDate.equals(dates[0])) {
			mondayDayLabel.setForeground(Color.blue);
			mondayDayLabel.setFont(new Font("arial", Font.BOLD, 18));
		}
		mondayTextAreata = new JTextArea("");
		mondayInput = new JTextField(10);
		mondayButton = new JButton("Add");
		mondayPanel.add(mondayDayLabel);
		mondayPanel.add(mondayDateLabel);
		mondayPanel.add(mondayTextAreata);
		mondayPanel.add(mondayInput);
		mondayPanel.add(mondayButton);

		frame.add(mondayPanel);

		// Tuesday
		// panel****************************************************************************
		JPanel tuesdayPanel = new JPanel();
		tuesdayPanel.setLayout(new GridLayout(5, 1));
		tuesdayPanel.setBackground(Color.white);
		JLabel tusdayDayLabel = new JLabel("Tuesday");
		JLabel tusdayDateLabel = new JLabel(dates[1]);
		if (currentDate.equals(dates[1])) {
			tusdayDayLabel.setForeground(Color.blue);
			tusdayDayLabel.setFont(new Font("arial", Font.BOLD, 18));
		}
		tusdayTextArea = new JTextArea("");
		tuesdayInput = new JTextField(10);
		tuesdayButton = new JButton("Add");
		tuesdayPanel.add(tusdayDayLabel);
		tuesdayPanel.add(tusdayDateLabel);
		tuesdayPanel.add(tusdayTextArea);
		tuesdayPanel.add(tuesdayInput);
		tuesdayPanel.add(tuesdayButton);

		frame.add(tuesdayPanel);

		// Wednesday
		// panel****************************************************************************

		JPanel wednesdayPanel = new JPanel();
		wednesdayPanel.setLayout(new GridLayout(5, 1));
		wednesdayPanel.setBackground(Color.white);
		JLabel wednesdayDayPanel = new JLabel("Wednesday");
		JLabel wednesdayDatePanel = new JLabel(dates[2]);
		if (currentDate.equals(dates[2])) {
			wednesdayDayPanel.setForeground(Color.blue);
			wednesdayDayPanel.setFont(new Font("arial", Font.BOLD, 18));
		}
		wednesdayTextArea = new JTextArea("");
		wednesdayInput = new JTextField(10);
		wednesdayButton = new JButton("Add");
		wednesdayPanel.add(wednesdayDayPanel);
		wednesdayPanel.add(wednesdayDatePanel);
		wednesdayPanel.add(wednesdayTextArea);
		wednesdayPanel.add(wednesdayInput);
		wednesdayPanel.add(wednesdayButton);

		frame.add(wednesdayPanel);

		// Thursday panel
		// **************************************************************************

		JPanel thursdayPanel = new JPanel();
		thursdayPanel.setLayout(new GridLayout(5, 1));
		thursdayPanel.setBackground(Color.white);
		JLabel thursdayDayPanel = new JLabel("Thursday");
		JLabel thursdayDatePanel = new JLabel(dates[3]);
		if (currentDate.equals(dates[3])) {
			thursdayDayPanel.setForeground(Color.blue);
			thursdayDayPanel.setFont(new Font("arial", Font.BOLD, 18));
		}
		thursdayTextArea = new JTextArea("");
		thursdayInput = new JTextField(10);
		thurdsdayButton = new JButton("Add");
		thursdayPanel.add(thursdayDayPanel);
		thursdayPanel.add(thursdayDatePanel);
		thursdayPanel.add(thursdayTextArea);
		thursdayPanel.add(thursdayInput);
		thursdayPanel.add(thurdsdayButton);

		frame.add(thursdayPanel);

		// Friday panel
		// ****************************************************************************

		JPanel fridayPanel = new JPanel();
		fridayPanel.setLayout(new GridLayout(5, 1));
		fridayPanel.setBackground(Color.white);
		JLabel fridayDayPanel = new JLabel("Friday");
		JLabel fridayDatePanel = new JLabel(dates[4]);
		if (currentDate.equals(dates[4])) {
			fridayDayPanel.setForeground(Color.blue);
			fridayDayPanel.setFont(new Font("arial", Font.BOLD, 18));
		}
		fridayTextArea = new JTextArea("");
		fridayInput = new JTextField(10);
		fridayButton = new JButton("Add");
		fridayPanel.add(fridayDayPanel);
		fridayPanel.add(fridayDatePanel);
		fridayPanel.add(fridayTextArea);
		fridayPanel.add(fridayInput);
		fridayPanel.add(fridayButton);

		frame.add(fridayPanel);

		// Saturday panel
		// ****************************************************************************

		JPanel saturdayPanel = new JPanel();
		saturdayPanel.setLayout(new GridLayout(5, 1));
		saturdayPanel.setBackground(Color.white);
		JLabel saturdayDayPanel = new JLabel("Saturday");
		JLabel saturdayDatePanel = new JLabel(dates[5]);
		if (currentDate.equals(dates[5])) {
			saturdayDayPanel.setForeground(Color.blue);
			saturdayDayPanel.setFont(new Font("arial", Font.BOLD, 18));
		}
		saturdayTextArea = new JTextArea("");
		saturdayInput = new JTextField(10);
		saturdayButton = new JButton("Add");
		saturdayPanel.add(saturdayDayPanel);
		saturdayPanel.add(saturdayDatePanel);
		saturdayPanel.add(saturdayTextArea);
		saturdayPanel.add(saturdayInput);
		saturdayPanel.add(saturdayButton);

		frame.add(saturdayPanel);

		// Sunday panel
		// ****************************************************************************

		JPanel sundayPanel = new JPanel();
		sundayPanel.setLayout(new GridLayout(5, 1));
		sundayPanel.setBackground(Color.white);
		JLabel sundayDayPanel = new JLabel("Sunday");
		JLabel sundayDatePanel = new JLabel(dates[6]);
		if (currentDate.equals(dates[6])) {
			sundayDayPanel.setForeground(Color.blue);
			sundayDayPanel.setFont(new Font("arial", Font.BOLD, 18));
		}
		sundayTextArea = new JTextArea("");
		sundayInput = new JTextField(10);
		sundayButton = new JButton("Add");
		sundayPanel.add(sundayDayPanel);
		sundayPanel.add(sundayDatePanel);
		sundayPanel.add(sundayTextArea);
		sundayPanel.add(sundayInput);
		sundayPanel.add(sundayButton);

		frame.add(sundayPanel);
		setUpButtonListeners();

		frame.setVisible(true);

	}

	public static void setUpButtonListeners() {
		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Object o = ae.getSource();

				if (o == mondayButton) {
					// System.out.println("Button 1!");
					String s = mondayInput.getText();
					// label.setText(s);
					System.out.println(s);
					mondayTextAreata.append(s + "\n");
					mondayInput.setText("");

				} else if (o == tuesdayButton) {

					String s = tuesdayInput.getText();
					System.out.println(s);
					tusdayTextArea.append(s + "\n");
					tuesdayInput.setText("");
				}

				else if (o == wednesdayButton) {

					String s = wednesdayInput.getText();
					System.out.println(s);
					wednesdayTextArea.append(s + "\n");
					wednesdayInput.setText("");
				}

				else if (o == thurdsdayButton) {

					String s = thursdayInput.getText();
					System.out.println(s);
					thursdayTextArea.append(s + "\n");
					thursdayInput.setText("");
				}

				else if (o == fridayButton) {

					String s = fridayInput.getText();
					System.out.println(s);
					fridayTextArea.append(s + "\n");
					fridayInput.setText("");
				} else if (o == saturdayButton) {

					String s = saturdayInput.getText();
					System.out.println(s);
					saturdayTextArea.append(s + "\n");
					saturdayInput.setText("");
				} else if (o == sundayButton) {

					String s = sundayInput.getText();
					System.out.println(s);
					sundayTextArea.append(s + "\n");
					sundayInput.setText("");
				}

			}
		};

		mondayButton.addActionListener(buttonListener);
		tuesdayButton.addActionListener(buttonListener);
		wednesdayButton.addActionListener(buttonListener);
		thurdsdayButton.addActionListener(buttonListener);
		fridayButton.addActionListener(buttonListener);
		saturdayButton.addActionListener(buttonListener);
		sundayButton.addActionListener(buttonListener);

	}

}

//}
