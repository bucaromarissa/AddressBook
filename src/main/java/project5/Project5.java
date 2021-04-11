/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Marissa Bucaro
 */
public class Project5 extends JFrame
{
    private JFrame mainFrame;
    private ListGUI lg;
    
    public Project5()
    {
        JFrame mainFrame = new JFrame();
        ListGUI lg = new ListGUI();
        //mainFrame = lg.getGUI();
        mainFrame.add(lg.getGUI());
        mainFrame.setSize(1100, 600);
        mainFrame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Project5 program = new Project5();     
    }
    
}
