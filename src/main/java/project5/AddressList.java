/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

/**
 *
 * @author Marissa Bucaro
 */
public class AddressList 
{
     
    private class ListNode
    {
        private String name;
        private String tel; //telephone number
        private String email;
        private String addr;
        private String dob; //date of birth
        private ListNode next; //pointer to the next node     
        private ListNode(String name, String tel, String email, String addr, String dob)
        {
            this.name = name;
            this.tel = tel;
            this.email = email;
            this.addr = addr;
            this.dob = dob;        
        }
        
        public String getName(){return name;}
        public String getTel(){return tel;}
        public String getEmail(){return email;}
        public String getAddr(){return addr;}
        public String getDob(){return dob;}
        
        public void setName(String name){this.name = name;}
        public void setTel(String tel){this.tel = tel;}
        public void setEmail(String email){this.email = email;}
        public void setAddr(String addr){this.addr = addr;}
        public void SetDob(String dob){this.dob = dob;}
        
        public ListNode getNext(){return next;}
        public void setNext(ListNode link){next = link;}
    } //end of class ListNode

    ListNode head;
    ListNode currentNode;
    
    
    public Boolean isEmpty()
    {
        if (this.head == null)
            return true;
        else
            return false;
    }
    

    public void addToFront(String name, String tel, String email, String address, String dob)
    {
        ListNode newNode = new ListNode(name, tel, email, address, dob);
        if(head == null)
            head = newNode;
        else
        {
            newNode.next = head;
            head = newNode;   
        }
        currentNode = head;
    }
    
    public void addToBack(String name, String tel, String email, String address, String dob)
    {
        ListNode newNode = new ListNode(name, tel, email, address, dob);
        ListNode tempCurrent = head;
        if (head == null)
            addToFront(name, tel, email, address, dob);
        else
        {
            currentNode = addToBackHelp(tempCurrent);
            currentNode.setNext(newNode);
            currentNode = head;
        }
    }
    
    /**
     * Recursive method that iterates through the LinkedList
     * @param current Passed in pointing to the head node.
     * @return the last node of the LinkedList.
     */
    private ListNode addToBackHelp(ListNode current)
    {
        if(current.next == null)
        {
            return current;
        }
        else
        {
            return addToBackHelp(current.next);
        }
    }  

    public String toString()
    {
        return toStringHelp(this.currentNode);          
    }
    
    /**
     * Recursive method adds data to a String as it iterates through the list.
     * @param current Passed in pointing to the head node.
     * @return A String representing the data entries of the LinkedList.
     */
    private String toStringHelp(ListNode current)
    {
        if(head == null)
            return "List is empty.";
        else if(current == null)
        {
            return "";
        }
        else
        {
            return printSelected(current) + toStringHelp(current.next);
        }   
    }
    
    public String reverseToString()
    {
        return reverseToStringHelp(this.head);
    }
    
    /**
     * Recursive method iterates through the list first, then adds data to String.
     * Prints in reverse by effectively saying, "Do the next guy before me!"
     * @param current Passed in pointing to the head node.
     * @return String representing the LinkedList's data.
     */
    private String reverseToStringHelp(ListNode current)
    {
        if(head == null)
        {
            return "List is empty.";
        }
        else if (sizeOf() == 1)
        {
            return printSelected(current);
        }
        else if(current == null)
        {
            return "";
        }
        else
        {
            return reverseToStringHelp(current.next) + printSelected(current);
        }
    }
    
    /**
     * Returns a String representation of the ListNode's data.
     * @param sel the current ListNode
     * @return String containing a data entry from the list.
     */
    private String printSelected(ListNode sel)
    {
        return sel.name + " " + sel.tel + " " + sel.email + " " + sel.addr + " " + sel.dob + "\n";
    }
    
    public AddressList reverse()
    {
        ListNode tempNode;
        if(head == null)
            return null;
        else if(sizeOf() == 1)
            return this;
        else
        {
            tempNode = reverseHelp(head);
        }
        head = tempNode;
        currentNode = head;
        return this;
    }

    /**
     * Recursively iterates through the LinkedList to find the new head, then moves the pointers
     * of the sub-list to the new end.
     * @param current Passed in pointing to the head.
     * @return ListNode that is the new head of the reversed LinkedList.
     */
    private ListNode reverseHelp(ListNode current)
    {
        ListNode newHead;
        if(current.next == null)
        {
            return current;
        }
        else
        {
            newHead = reverseHelp(current.next);
            
            current.next.next = current;
            current.next = null;
            return newHead;           
        }        
    }
    
    public int sizeOf()
    {
        return sizeOfHelp(this.head, 1); 
    }
    
    /**
     * Recursively counts the number of nodes in the list.
     * @param current ListNode representing the starting point for the count.
     * @param count Integer representing the current count.
     * @return Integer representing the total number of ListNodes in the list.
     */
    private int sizeOfHelp(ListNode current, int count)
    {
        if(this.head == null)
            return 0;
        else if(current.next == null)
            return count;
        else
        {
            return count + sizeOfHelp(current.next, count);
        }
    }
    
    public String phoneNumberByName(String name)
    {
        if (currentNode == null)
            return "No matching data";
        else if (currentNode.name.equals(name))
        {
            String result = currentNode.tel;
            currentNode = head;
            return result;
        }
        else
        {
            currentNode = currentNode.next;
            return phoneNumberByName(name);
        }     
    }
    
    public String emailByName(String name)
    {
        if (currentNode == null)
        {
            currentNode = head;
            return "No matching data";
        }
        else if (currentNode.name.equals(name))
        {
            String result = currentNode.email;
            currentNode = head;
            return result;
        }
        else
        {
            currentNode = currentNode.next;
            return emailByName(name);
        }
    }
    
    public String nameByPhone(String tel)
    {
        if (currentNode == null)
        {
            currentNode = head;
            return "No matching data";
        }
        else if (currentNode.tel.equals(tel))
        {
            String result = currentNode.name;
            currentNode = head;
            return result;
        }
        else
        {
            currentNode = currentNode.next;
            return nameByPhone(tel);
        }
    }

    public String doByName(String name)
    {
        if (currentNode == null)
        {
            currentNode = head;
            return "No matching data";
        }
        else if (currentNode.name.equals(name))
        {
            String result = currentNode.dob;
            currentNode = head;
            return result;
        }
        else
        {
            currentNode = currentNode.next;
            return doByName(name);
        }
    }
     
}
