/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author leonguevara
 */
public class Rectangle extends JFrame {
    
    public Rectangle() {
        this.setTitle("Rectangle");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.setLayout(new GridLayout(5,1));
        
        JLabel widthLabel = new JLabel("Width:");
        JLabel heightLabel = new JLabel("Height");
        JTextField widthTextField = new JTextField("0.0", 10);
        JTextField heightTextField = new JTextField("0.0", 10);
        
        JPanel widthPanel = new JPanel();
        widthPanel.setLayout(new FlowLayout());
        JPanel heightPanel = new JPanel();
        heightPanel.setLayout(new FlowLayout());
        
        widthPanel.add(widthLabel);
        widthPanel.add(widthTextField);
        heightPanel.add(heightLabel);
        heightPanel.add(heightTextField);
        
        JButton button = new JButton("Compute");
        
        JLabel perimeterLabel = new JLabel("Perimeter:");
        JLabel areaLabel = new JLabel("Area:");
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aquí se hace todo
                Double width, height, perimeter, area;
                width = Double.parseDouble(widthTextField.getText());
                height = Double.parseDouble(heightTextField.getText());
                
                perimeter = (width + height) * 2;
                area = width * height;
                
                perimeterLabel.setText("Perimeter: " + perimeter);
                areaLabel.setText("Area: " + area);
            }
        });
        
        this.add(widthPanel);
        this.add(heightPanel);
        this.add(button);
        this.add(perimeterLabel);
        this.add(areaLabel);
        
        this.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle frame = new Rectangle();
    }
    
}
