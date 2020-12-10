package socialnetwork;

import java.awt.*;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class newSearch extends JFrame {
	private JLabel labelSearch = new JLabel("Search Friends");
	private JTextField textSearch = new JTextField(20);
	private JLabel labelName = new JLabel("Name: Dat Tran");
	private JLabel labelStatus = new JLabel("Status: single");
	private JLabel labelPicture = new JLabel();
	public newSearch() {
		super("Find new friend");

		// create a new panel with GridBagLayout manager
		JPanel newPanel = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;
		newPanel.add(labelSearch, constraints);

		constraints.gridx = 1;
		newPanel.add(textSearch, constraints);

		constraints.gridx = 0;
		constraints.gridy = 9;
		newPanel.add(labelName, constraints);

		constraints.gridx = 0;
		constraints.gridy = 10;
		newPanel.add(labelStatus, constraints);
		
		ImageIcon imagePic = new ImageIcon("joker.jpg");
		labelPicture.setIcon(imagePic);
		//labelPicture.setIcon(new ImageIcon("joker.jpg"));
		//resize("joker.jpg","joker.jpg",250,150);
		
		newPanel.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Do you want to search for a new friend"));

		add(newPanel);

		pack();
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new newSearch().setVisible(true);
			}
		});
	}     
	 
}
