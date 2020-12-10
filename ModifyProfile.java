package mainPackage;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

/**
   The ModifyProfile class displays a JFrame that
   lets the user modify their profile.
*/

public class ModifyProfile extends JFrame
{
   private JPanel panel;          // To reference a panel
   private JLabel label1;         // To reference a label
   private JLabel label2;         // To reference a label
   private JLabel label3;         // To reference a label
   private JLabel label4;         // To reference a label
   private JTextField textField1; // To reference a text field
   private JTextField textField2; // To reference a text field
   private JTextField textField3; // To reference a text field
   private JTextField textField4; // To reference a text field
   private JButton button1;       // To reference a button
   private JButton button2;       // To reference a button
   private JButton button3;       // To reference a button
   private JButton button4;       // To reference a button
   private JButton button5;       // To reference a button
   private JButton button6;       // To reference a button
   private final int WINDOW_WIDTH = 300;  // Window width
   private final int WINDOW_HEIGHT = 300; // Window height

   /**
      Constructor
   */
   public ModifyProfile()
   {
      // Set the window title.
      setTitle("Modify Page My Friend Finder");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Build the panel and add it to the frame.
      buildPanel();
      
      // Set the layout
      setLayout(new GridLayout());
      
      // Set border to the panel
      panel.setBorder(BorderFactory.createTitledBorder(
              BorderFactory.createEtchedBorder(), "Modify Profile"));


      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
      The buildPanel method adds a label, text field, and
      and a button to a panel.
   */
   private void buildPanel()
   {
      // Creates labels to display instructions.
      label1 = new JLabel("Enter New Name:");
      label2 = new JLabel("Confirm New Name:");
      label3 = new JLabel("Enter New Status");
      label4 = new JLabel("Modify Character");
      
      // Creates text fields 15 characters wide.
      textField1 = new JTextField(15);
      textField2 = new JTextField(15);
      textField3 = new JTextField(15);
      JComboBox b = new JComboBox();
      b.addItem("Loki");
      b.addItem("Bellatrix");
      b.addItem("Cersei Lannister");
      b.addItem("Joker");
      b.addItem("Regina");
      
      // Creates buttons.
      button1 = new JButton("Change Name");
      button2 = new JButton("Confirm");
      button3 = new JButton("Change Status");
      button4 = new JButton("Change");
      button5 = new JButton("Apply New Changes");
      button6 = new JButton("Go to Profile Page");
      
      // Create a JPanel object and let the panel
      // field reference it.
      panel = new JPanel();
      
      // Add the label, text field, and button
      // components to the panel.
      panel.add(label1);
      panel.add(textField1);
      panel.add(button1);
      
      panel.add(label2);
      panel.add(textField2);
      panel.add(button2);
      
      panel.add(label3);
      panel.add(textField3);
      panel.add(button3);
      
      panel.add(label4);
      panel.add(b);
      panel.add(button4);
      
      panel.add(button5);
      panel.add(button6);
   }
   
   /**
      main method
   */ 
   public static void main(String[] args)
   {
      new ModifyProfile();
   }
}