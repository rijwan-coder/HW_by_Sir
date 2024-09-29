package hw;

import java.awt.*;
import java.awt.event.*;

public class CharcountAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Character Counter");
        
       
        Label stringLabel = new Label("Enter String:");
        TextField stringField = new TextField(20);
        
        Label charLabel = new Label("Enter Character:");
        TextField charField = new TextField(1);
        
        Button countButton = new Button("Count");
        Label resultLabel = new Label("Occurrences: ");
        
       
        frame.setLayout(new FlowLayout());
        frame.add(stringLabel);
        frame.add(stringField);
        frame.add(charLabel);
        frame.add(charField);
        frame.add(countButton);
        frame.add(resultLabel);
        
     
        countButton.addActionListener(e -> {
            String inputString = stringField.getText();
            String inputChar = charField.getText();
            
            if (inputChar.length() != 1) {
                resultLabel.setText("Enter a single character!");
            } else {
                char ch = inputChar.charAt(0);
                long count = inputString.chars().filter(c -> c == ch).count();
                resultLabel.setText("Occurrences: " + count);
            }
        });
        
     
        frame.setSize(300, 200);
        frame.setVisible(true);
        
   
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
