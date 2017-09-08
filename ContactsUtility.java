/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject1;

/**
 *
 * @author robolike
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author developersnote
 */
public class ContactsUtility {
 
    private static List<Contact> AllContacts;
    private static String MessageStatus;
    public static final String ContactFileName = "Contacts.txt";
 
    /**
     * @return the MessageStatus
     */
    public static String getMessageStatus() {
        return MessageStatus;
    }
 
    /**
     * @param aMessageStatus the MessageStatus to set
     */
    public static void setMessageStatus(String aMessageStatus) {
        MessageStatus = aMessageStatus;
    }
    

    static boolean updateContact(String firstName, 
            String lastName, String address1, String address2, 
            String city, String state, String zipCode, String email, 
            String phoneNumber, String notes, String NewStringLine) {
        BufferedReader br = null;
        String ReWrite = "";
        boolean success = false;
        try {
            if (new File(ContactFileName).exists()) {
                br = new BufferedReader(new FileReader(ContactFileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    if (!"".equals(line)) {
                        String[] _temp;
                        _temp = line.split(",");
                        if (_temp[0].equalsIgnoreCase(firstName)
                                && _temp[1].equalsIgnoreCase(lastName)
                                && _temp[2].equalsIgnoreCase(address1)
                                && _temp[3].equalsIgnoreCase(address2)
                                && _temp[4].equalsIgnoreCase(city)
                                && _temp[5].equalsIgnoreCase(state)
                                && _temp[6].equalsIgnoreCase(zipCode)
                                && _temp[7].equalsIgnoreCase(email)
                                && _temp[8].equalsIgnoreCase(phoneNumber)
                                && _temp[9].equalsIgnoreCase(notes)) {
                            ReWrite += NewStringLine + "\r\n";                        
                        }else {
                            ReWrite += line + "\r\n";
                        } 
                    }
                }
                br.close();
 
                if (writeFile(ReWrite)) {
                    success = true;
                } else {
                    success = false;
                }
                //update ArrayList with new Contact List
                readPhoneContacts(); 
            } else {
                new File(ContactFileName).createNewFile();
                readPhoneContacts();
                success = false;
            }
        } catch (FileNotFoundException ex) {
            MessageStatus = ex.getMessage();
            success = false;
        } catch (IOException ex) {
            MessageStatus = ex.getMessage();
            success = false;
        }
        return success;
    }


 
    public ContactsUtility() {
        AllContacts = new ArrayList<Contact>();
    }
 

 
    public static List<Contact> searchContact(String searchValue) {
        List<Contact> cnt = new ArrayList<>();
        BufferedReader br = null;
 
        try {
            if (new File(ContactFileName).exists()) {
                br = new BufferedReader(new FileReader(ContactFileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    if (!"".equals(line)) {
                        String[] _temp = line.split(",");
                        if (_temp[0].equalsIgnoreCase(searchValue) || _temp[1].equalsIgnoreCase(searchValue)){
                            Contact c = new Contact();                        
                            c.setFirstName(_temp[0]);
                            c.setLastName(_temp[1]);
                            c.setAddress1(_temp[2]);
                            c.setAddress2(_temp[3]);
                            c.setCity(_temp[4]);
                            c.setState(_temp[5]);
                            c.setZipCode(_temp[6]);
                            c.setEmail(_temp[7]);
                            c.setPhoneNumber(_temp[8]);
                            c.setNotes(_temp[9]);
                            cnt.add(c);
                        }
                    }
                }
            } else {
                new File(ContactFileName).createNewFile();
                cnt = searchContact(searchValue);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
 
        return cnt;
    }
 
    protected static boolean writeFile(String TextToWrite) {
        FileWriter writer = null;
        boolean successfulWrite = false;
        try {
            writer = new FileWriter(ContactFileName);
            writer.write(TextToWrite);
            writer.close();
            successfulWrite = true;
        } catch (IOException ex) {
            successfulWrite = false;
            MessageStatus = ex.getMessage();
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                MessageStatus = ex.getMessage();
            }
        }
        return successfulWrite;
    }
 
    public static void deleteContacts(Contact C) {
        String fn,ln,a1,a2,ct,st,zp,em,pn,nt;
        if(C.getFirstName().isEmpty()){
                fn= "NULL";
            }else {
                fn = C.getFirstName();
            }
            
            if(C.getLastName().isEmpty()){
                ln= "NULL";
            }else {
                ln = C.getLastName();
            }
            
            if(C.getAddress1().isEmpty()){
                a1= "NULL";
            }else {
                a1 = C.getAddress1();
            }
            
            if(C.getAddress2().isEmpty()){
                a2= "NULL";
            }else {
                a2 = C.getAddress2();
            }
            
            if(C.getCity().isEmpty()){
                ct= "NULL";
            }else {
                ct = C.getCity();
            }
            
            if(C.getState().isEmpty()){
                st= "NULL";
            }else {
                st = C.getState();
            }
            
            if(C.getZipCode().isEmpty()){
                zp= "NULL";
            }else {
                zp = C.getZipCode();
            }
            
            if(C.getEmail().isEmpty()){
                em= "NULL";
            }else {
                em = C.getEmail();
            }
            
            if(C.getPhoneNumber().isEmpty()){
                pn= "NULL";
            }else {
                pn = C.getPhoneNumber();
            }
            
            if(C.getNotes().isEmpty()){
                nt= "NULL";
            }else {
                nt = C.getNotes();
            }
            
        BufferedReader br = null;
        String ReWrite = "";
        try {
            if (new File(ContactFileName).exists()) {
                br = new BufferedReader(new FileReader(ContactFileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    String[] _temp = line.split(",");
                    if (_temp[0].equalsIgnoreCase(fn)
                                && _temp[1].equalsIgnoreCase(ln)
                                && _temp[2].equalsIgnoreCase(a1)
                                && _temp[3].equalsIgnoreCase(a2)
                                && _temp[4].equalsIgnoreCase(ct)
                                && _temp[5].equalsIgnoreCase(st)
                                && _temp[6].equalsIgnoreCase(zp)
                                && _temp[7].equalsIgnoreCase(em)
                                && _temp[8].equalsIgnoreCase(pn)
                                && _temp[9].equalsIgnoreCase(nt)
                            ) {
                        //ignore line to delete this contact
                    } else {
                        ReWrite += line + "\r\n";
                    }
                }
                br.close();
 
                if (writeFile(ReWrite)) {
                    JOptionPane.showMessageDialog(null, "Successfully delete contact " + C.getUserName());
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete contact " + C.getUserName());
                }
 
                ContactsUtility.readPhoneContacts();
                AddressBook.BindIntoJTable();
 
            } else {
                new File(ContactFileName).createNewFile();
                readPhoneContacts();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
 
    public static void readPhoneContacts() {
        //read Contacts file and store into arraylist of Object(contact)
        BufferedReader br = null;
        try {
            if (new File(ContactFileName).exists()) {
 
                if (AllContacts == null) {
                    AllContacts = new ArrayList<>();
                } else {
                    AllContacts.clear();
                }
                br = new BufferedReader(new FileReader(ContactFileName));
                StringBuilder sb = new StringBuilder();
                String line = "";
                Contact ContactClass = null;
                while ((line = br.readLine()) != null) {
                    if (!line.equalsIgnoreCase("")) {
                        ContactClass = new Contact();
                        String[] _temp = line.split(",");
                        String _tempValue = _temp[0];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setFirstName(_tempValue);
 
                        _tempValue = _temp[1];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setLastName(_tempValue);
                        
                        _tempValue = _temp[2];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setAddress1(_tempValue);
                        
                        _tempValue = _temp[3];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setAddress2(_tempValue);
                        
                        _tempValue = _temp[4];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setCity(_tempValue);
                        
                        _tempValue = _temp[5];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setState(_tempValue);
                        
                        _tempValue = _temp[6];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }                     
                        ContactClass.setZipCode(_tempValue);
                        
                        _tempValue = _temp[7];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setEmail(_tempValue);
                        
                        _tempValue = _temp[8];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setPhoneNumber(_tempValue);
                                      
                        _tempValue = _temp[9];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setNotes(_tempValue);
                                           
                        AllContacts.add(ContactClass);
                    }
                }
            } else {
                new File(ContactFileName).createNewFile();
                readPhoneContacts();
            }
 
        } catch (NullPointerException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(ContactsUtility.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
 
    }
 
    public static boolean appendTextContact(String appendValue) {
        boolean success = false;
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ContactFileName, true)));
            out.println(appendValue);
            out.close();
            success = true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return success;
    }
 
    /**
     * @return the AllContacts
     */
    public static List<Contact> getAllContacts() {
        return AllContacts;
    }
 
    /**
     * @param aAllContacts the AllContacts to set
     */
    public static void setAllContacts(List<Contact> aAllContacts) {
        AllContacts = aAllContacts;
    }
 
}

