/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marissa Bucaro
 */
public class ListGUI 
{

    private JScrollPane sp;
    private JPanel buttonList;
    private JPanel inputList;
    private JPanel gui;
    private JTextField inputName;
    private JTextField inputTel;
    private JTextField inputEmail;
    private JTextField inputAddr;
    private JTextField inputDob;
    private String name;
    private String tel;
    private String email;
    private String addr;
    private String dob;
    private JLabel nameLabel;
    private JLabel teLabel;
    private JLabel emaiLabel;
    private JLabel addrLabel;
    private JLabel dobLabel;
    private JTextArea output;
    private JButton addToFront;
    private JButton addToBack;
    private JButton toString;
    private JButton reverseToString;
    private JButton reverse;
    private JButton isEmpty;
    private JButton sizeOf;
    private JButton phoneByName;
    private JButton emailByName;
    private JButton nameByPhone;
    private JButton doByName;
    
    private AddressList al;
    
    public ListGUI()
    {
        output = new JTextArea();
        sp = new JScrollPane(output, sp.VERTICAL_SCROLLBAR_ALWAYS, sp.HORIZONTAL_SCROLLBAR_ALWAYS);
        buttonList = new JPanel(); 
        inputList = new JPanel();
        buttonList.setLayout(new BoxLayout(buttonList, BoxLayout.PAGE_AXIS));
        gui = new JPanel(new BorderLayout());
        
        inputName = new JTextField();
        inputTel = new JTextField();
        inputEmail = new JTextField();
        inputAddr = new JTextField();
        inputDob = new JTextField();
        
        String name = new String();
        String tel = new String();
        String email = new String();
        String addr = new String();
        String dob = new String();
        
        nameLabel = new JLabel("Enter name: ");
        teLabel = new JLabel("Enter phone number: ");
        emaiLabel = new JLabel("Enter email: ");
        addrLabel = new JLabel("Enter address: ");
        dobLabel = new JLabel("Enter date of birth: ");
        
        addToFront = new JButton("Add to Front");
        addToBack = new JButton("Add to Back");
        toString = new JButton("Print");
        reverseToString = new JButton("Print Reverse");
        reverse = new JButton("Reverse");
        isEmpty = new JButton("isEmpty");
        sizeOf = new JButton("sizeOf");
        phoneByName = new JButton("Find Phone by Name");
        emailByName = new JButton("Find Email by Name");
        nameByPhone = new JButton("Find Name by Phone");
        doByName = new JButton("Find D.o.B by Name");
        
        al = new AddressList();
        
    }
    
    public JPanel getGUI()
    {
        setGUI();
        setTextFields();
        setButtons();
        gui.setSize(1100, 800);
        return gui;
    }
    
    /**
     * Adds components to the layouts. 
     */
    private void setGUI()
    {

        this.buttonList.add(addToFront);
        this.buttonList.add(addToBack);
        this.buttonList.add(toString);
        this.buttonList.add(reverseToString);
        this.buttonList.add(reverse);
        this.buttonList.add(isEmpty);
        this.buttonList.add(sizeOf);
        this.buttonList.add(phoneByName);
        this.buttonList.add(emailByName);
        this.buttonList.add(nameByPhone);
        this.buttonList.add(doByName);
        
        this.inputList.add(nameLabel);
        this.inputName.setColumns(7);
        this.inputList.add(inputName);
        this.inputList.add(teLabel);
        this.inputTel.setColumns(7);
        this.inputList.add(inputTel);
        this.inputList.add(emaiLabel);
        this.inputEmail.setColumns(7);
        this.inputList.add(inputEmail);
        this.inputList.add(addrLabel);
        this.inputAddr.setColumns(7);
        this.inputList.add(inputAddr);
        this.inputList.add(dobLabel);
        this.inputDob.setColumns(7);
        this.inputList.add(inputDob);
        
        this.gui.add(inputList, BorderLayout.NORTH);
        this.gui.add(buttonList, BorderLayout.EAST);
        this.gui.add(sp, BorderLayout.CENTER);
        
    }
    
    /**
     * Calls different setters to apply functionality to the buttons.
     */
    private void setButtons()
    {
        setAddToFront();
        setAddToBack();
        setToString();
        setReverseToString();
        setReverse();
        setIsEmpty();
        setSizeOf();
        setPhoneByName();
        setEmailByName();
        setNameByPhone();
        setDoByName();
    }
    
    /**
     * Sets functionality to the TextFields to process and accept user input.
     */
    private void setTextFields()
    {
        inputName.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(inputName.getText().equals(""))
                    output.append("Name field is empty\n");
                else
                {
                    output.append("Name entered. Complete all fields and then click the appropriate button\n");
                    name = inputName.getText();
                }
            }
        });
        
        inputTel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(inputTel.getText().equals(""))
                    output.append("Phone field is empty\n");
                else
                {
                    output.append("Phone entered. Complete all fields and then click the appropriate button\n");
                    tel = inputTel.getText();
                }
            }
        });
        
        inputEmail.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(inputEmail.getText().equals(""))
                    output.append("Email field is empty\n");
                else
                {
                    output.append("Email entered. Complete all fields and then click the appropriate button\n");
                    email = inputEmail.getText();
                }
            }
        });
        inputAddr.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(inputAddr.getText().equals(""))
                    output.append("Address field is empty\n");
                else
                {
                    output.append("Address entered. Complete all fields and then click the appropriate button\n");
                    addr = inputAddr.getText();
                }
            }
        });
        inputDob.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(inputDob.getText().equals(""))
                    output.append("Birthdate field is empty\n");
                else
                {
                    output.append("Birthdate entered. Complete all fields and then click the appropriate button\n");
                    dob = inputDob.getText();
                }
            }
        });
    }
    
    /**
     * Sets addToFront operation to a button.
     */
    private void setAddToFront()
    {
        addToFront.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(name != null && tel != null && email != null && addr != null
                        && dob != null)
                {
                    al.addToFront(name, tel, email, addr, dob);
                    output.setText("Entry added to front. Resetting input...");
                    resetInput();
                }
                else
                    output.setText("Missing information. Please complete all forms.");
            }
        });
    }
    
    /**
     * Sets addToBack operation to a button.
     */
    private void setAddToBack()
    {
        addToBack.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(name != null && tel != null && email != null && addr != null
                        && dob != null)
                {
                    al.addToBack(name, tel, email, addr, dob);
                    output.setText("Entry added to back. Resetting input...");
                    resetInput();
                }
                else
                    output.setText("Missing information. Please complete all forms.");
            }
        });
    }
    
    /**
     * Sets toString operation to a button.
     */
    private void setToString()
    {
        toString.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                output.setText(al.toString());
            }
        });
    }
    
    /**
     * Sets reverseToString operation to a button.
     */
    private void setReverseToString()
    {
        reverseToString.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                output.setText(al.reverseToString());
            }
        });
    }
    
    /**
     * Sets Reverse operation to a button.
     */
    private void setReverse()
    {
        reverse.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(al.toString().equals("List is empty."))
                {
                    output.setText("The list is empty.");
                }
                else
                {
                    al = al.reverse();
                    output.setText("Reversal complete. Click \"Print\" to see it");
                }
            }
        });       
    }
    
    /**
     * Sets isEmpty operation to a button.
     */
    private void setIsEmpty()
    {
        isEmpty.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(al.isEmpty() == true)
                    output.setText("The list is empty.");
                else
                {
                    output.setText("List isn't empty.");
                }
            }
        });   
    }
    
    /**
     * Sets SizeOf operation to a button.
     */
    private void setSizeOf()
    {
        sizeOf.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(al.sizeOf() == 0)
                    output.setText("The list is empty.");
                else
                {
                    String result = Integer.toString(al.sizeOf());
                    output.setText("List has " + result + " entries.");
                }
            }
        });   
    }
    
    /**
     * Sets phoneByName operation to a button.
     */
    private void setPhoneByName()
    {
        phoneByName.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(al.sizeOf() == 0)
                    output.setText("The list is empty.");
                else if(name.equals(""))
                    output.setText("Please enter the name to search by.");
                else
                {
                    output.setText(al.phoneNumberByName(name));
                    output.append("\nResetting input...");
                    resetInput();
                }
            }
        }); 
    }
    
    /**
     * Sets emailByName operation to a button.
     */
    private void setEmailByName()
    {
        emailByName.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(al.sizeOf() == 0)
                    output.setText("The list is empty.");
                else if(name.equals(""))
                    output.setText("Please enter the name to search by.");
                else
                {
                    output.setText(al.emailByName(name));
                    output.append("\nResetting input...");
                    resetInput();
                }
            }
        });
    }
    
    /**
     * Sets nameByPhone operation to a button.
     */
    private void setNameByPhone()
    {
        nameByPhone.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(al.sizeOf() == 0)
                    output.setText("The list is empty.");
                else if(tel.equals(""))
                    output.setText("Please enter the phone number to search by.");
                else
                {
                    output.setText(al.nameByPhone(tel));
                    output.append("\nResetting input...");
                    resetInput();
                }
            }
        });
    }
    
    /**
     * Sets doByName operation to a button.
     */
    private void setDoByName()
    {
        doByName.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(al.sizeOf() == 0)
                    output.setText("The list is empty.");
                else if(name.equals(""))
                    output.setText("Please enter the name to search by.");
                else
                {
                    output.setText(al.doByName(name));
                    output.append("\nResetting input...");
                    resetInput();
                }
            }
        });
    }
      
    /**
     * Resets user input data for a new entry.
     */
    private void resetInput()
    {
        inputName.setText(null);
        name = null;
        inputTel.setText(null);
        tel = null;
        inputEmail.setText(null);
        email = null;
        inputAddr.setText(null);
        addr = null;
        inputDob.setText(null);
        dob = null;
    }
}
