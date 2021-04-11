/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author valuedcustomer
 */
public class ButtonFunctionality 
{
    private JButton addToFront;
    private JButton addToBack;
    private JButton toString;
    private JButton reverseToString;
    private JButton reverse;
    private JButton sizeOf;
    private JButton phoneByName;
    private JButton emailByName;
    private JButton nameByPhone;
    private JButton doByName;
    
    private String name;
    private String tel;
    private String email;
    private String addr;
    private String dob;
    
    private AddressList al;
    
    public ButtonFunctionality()
    {
        name = new String();
        al = new AddressList();
        setAddToFront();
    }
    
    public JButton getAddToFront()
    { 
        return addToFront;
    }
    
    private void setAddToFront()
    {
        
    }
    
    public void setName(String _name)
    {
        name = _name;
    }
}
