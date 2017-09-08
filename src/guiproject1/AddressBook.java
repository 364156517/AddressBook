/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiproject1;

import static guiproject1.ContactsUtility.ContactFileName;
import java.awt.FileDialog;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author robolike
 */
public final class AddressBook extends JFrame {
    private String filePath;
    private String fileName;

    /**
     * Creates new form addressBook
     */
    public AddressBook() {

        // Create the window
        initComponents();
        this.setMinimumSize(this.getSize());
        this.setResizable(true);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        jTable1.getTableHeader().setReorderingAllowed(false);

        // Make JTable uneditable
        JTextField tf = new JTextField();
        tf.setEditable(false);
        DefaultCellEditor editor = new DefaultCellEditor(tf);
        jTable1.setDefaultEditor(Object.class, editor);

        /* User clicks close, ask if they're sure */
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                if (askYesNo("All unsaved data will be lost. Are you sure you want to close this address book?"))
                    closeWindow();
            }
        });
        //userTable.getTableHeader().setFont(new java.awt.Font("Verdana", 0, 11));
        //load contacts into ArrayList
        ContactsUtility.readPhoneContacts();
        //bind into JTable
        BindIntoJTable();
    }

    public static void BindIntoJTable(){
        jTable1.removeAll();
        List<Contact> AllContacts = ContactsUtility.getAllContacts();
        if (AllContacts != null) {
            String colNames[] = {"First Name", "Last Name", "Address 1",
                "Address 2", "City", "State", "Zip Code", "Email", "Phone Number", "Notes"};
            DefaultTableModel dtm = new DefaultTableModel(null, colNames);

            for (int i = 0; i < AllContacts.size(); i++) {
                dtm.addRow(new String[4]);
            }
            jTable1.setModel(dtm);

            if (AllContacts.size() > 0) {
                int row = 0;
                for (Contact c : AllContacts) {
                    jTable1.setValueAt(c.getFirstName(), row, 0);
                    jTable1.setValueAt(c.getLastName(), row, 1);
                    jTable1.setValueAt(c.getAddress1(), row, 2);
                    jTable1.setValueAt(c.getAddress2(),row,3);
                    jTable1.setValueAt(c.getCity(),row,4);
                    jTable1.setValueAt(c.getState(),row,5);
                    jTable1.setValueAt(c.getZipCode(),row,6);
                    jTable1.setValueAt(c.getEmail(),row,7);
                    jTable1.setValueAt(c.getPhoneNumber(),row,8);
                    jTable1.setValueAt(c.getNotes(),row,9);
                    row++;
                }
                jTable1.getColumn("First Name").setMaxWidth(150);
                jTable1.getColumn("Last Name").setMaxWidth(150);
                jTable1.getColumn("Address 1").setMaxWidth(150);
                jTable1.getColumn("Address 2").setMaxWidth(150);
                jTable1.getColumn("City").setMaxWidth(150);
                jTable1.getColumn("State").setMaxWidth(150);
                jTable1.getColumn("Zip Code").setMaxWidth(150);
                jTable1.getColumn("Email").setMaxWidth(150);
                jTable1.getColumn("Phone Number").setMaxWidth(150);
                jTable1.getColumn("Notes").setMaxWidth(150);
                jTextStatus.setText("Finished loading contacts, " + Integer.toString(AllContacts.size())
                        + " record(s) found.");
            } else {
                jTextStatus.setText("Finished loading contacts, no record(s) found.");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        nameField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameSortButton = new javax.swing.JRadioButton();
        zipSortButton = new javax.swing.JRadioButton();
        Refresh = new javax.swing.JButton();
        jTextStatus = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton(evt);
            }
        });

        buttonGroup.add(nameSortButton);
        nameSortButton.setText("Sort by Last Name");
        nameSortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSortButton(evt);
            }
        });

        buttonGroup.add(zipSortButton);
        zipSortButton.setText("Sort by Zip Sort");
        zipSortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipSortButton(evt);
            }
        });

        Refresh.setText("Reset");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton(evt);
            }
        });

        jTextStatus.setEditable(false);
        jTextStatus.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "FirstName", "LastName", "Address1", "Address2", "City", "State", "Zip", "Email", "Phone", "Notes"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setCellSelectionEnabled(false);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton(evt);
            }
        });

        jLabel1.setText("Search:");

        File.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("New");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuChoice(evt);
            }
        });
        File.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Open");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuChoice(evt);
            }
        });
        File.add(jMenuItem3);
        File.add(jSeparator2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Save");
        File.add(jMenuItem1);

        saveas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveas.setText("Save As");
        saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsOption(evt);
            }
        });
        File.add(saveas);
        File.add(jSeparator3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Import");
        File.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Export");
        File.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Print");
        File.add(jMenuItem7);
        File.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Close");
        jMenuItem4.setActionCommand("closeMenuOption");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenu(evt);
            }
        });
        File.add(jMenuItem4);

        jMenuBar.add(File);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextStatus)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameSortButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zipSortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSortButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipSortButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(jButton1)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton
        // TODO add your handling code here:
        String searchValue = nameField.getText();
        List<Contact> contacts = ContactsUtility.searchContact(searchValue);
        ContactsUtility.setAllContacts(contacts);
        BindIntoJTable();
    }//GEN-LAST:event_searchButton

    private void deleteButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton
        int i = jTable1.getSelectedRow();
        if (i == -1) {
            errorMessage("You must select a contact to delete.");
            return;
        }
        Contact C = new Contact();
        C.setFirstName((String)jTable1.getValueAt(i, 0));
        C.setLastName((String)jTable1.getValueAt(i, 1));
        C.setAddress1((String)jTable1.getValueAt(i, 2));
        C.setAddress2((String)jTable1.getValueAt(i, 3));
        C.setCity((String)jTable1.getValueAt(i, 4));
        C.setState((String)jTable1.getValueAt(i, 5));
        C.setZipCode((String)jTable1.getValueAt(i, 6));
        C.setEmail((String)jTable1.getValueAt(i, 7));
        C.setPhoneNumber((String)jTable1.getValueAt(i, 8));
        C.setNotes((String)jTable1.getValueAt(i, 9));

        String s = "You are about to delete the contact:  " + C.getUserName();
        s += "\nAre you sure you want to delete this contact?";
        if (askYesNo(s))
            ContactsUtility.deleteContacts(C);
    }//GEN-LAST:event_deleteButton

    private void addButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton
        // TODO add your handling code here:

        //af.setVisible(true);
        //af.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addJFrame Form = new addJFrame();
        Form.setFormMode(true);//true for add mode
        Form.UpdateStatus();
        Form.setVisible(true);
    }//GEN-LAST:event_addButton

    private void nameSortButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSortButton
        // TODO add your handling code here:
        /*DefaultListModel name = new DefaultListModel();
        for(int i = 0; i<= 20; i ++){
            name.addElement("name"+i);
        }
        nameList.setModel(name);*/
    }//GEN-LAST:event_nameSortButton

    private void zipSortButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipSortButton
        // TODO add your handling code here:
        /*DefaultListModel name = new DefaultListModel();
        for(int i = 0; i<= 20; i ++){
            name.addElement("zip"+i);
        }
        nameList.setModel(name);*/
    }//GEN-LAST:event_zipSortButton

    private void refreshButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton
        ContactsUtility.readPhoneContacts();
        BindIntoJTable();
    }//GEN-LAST:event_refreshButton

    /* Allows user to edit existing contact information. */
    private void editButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton

        int i = jTable1.getSelectedRow();
        if (i == -1) {
            errorMessage("You must select a contact to edit.");
            return;
        }

        Contact C = new Contact();
        C.setFirstName((String)jTable1.getValueAt(i, 0));
        C.setLastName((String)jTable1.getValueAt(i, 1));
        C.setAddress1((String)jTable1.getValueAt(i, 2));
        C.setAddress2((String)jTable1.getValueAt(i, 3));
        C.setCity((String)jTable1.getValueAt(i, 4));
        C.setState((String)jTable1.getValueAt(i, 5));
        C.setZipCode((String)jTable1.getValueAt(i, 6));
        C.setEmail((String)jTable1.getValueAt(i, 7));
        C.setPhoneNumber((String)jTable1.getValueAt(i, 8));
        C.setNotes((String)jTable1.getValueAt(i, 9));
        addJFrame dlg = new addJFrame();

        dlg.setFormMode(false);//true for add mode
        dlg.MapTextBox(C);
        dlg.UpdateStatus();
        dlg.setVisible(true);
    }//GEN-LAST:event_editButton

    /**/
    private void saveAsOption(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsOption
        FileDialog fd = new FileDialog(AddressBook.this, "Save As…",
                        FileDialog.SAVE);
                fd.setFile("*.tsv");
                fd.setVisible(true);

                filePath = fd.getDirectory();
                fileName = fd.getFile();

                try {
                    FileWriter fw = new FileWriter(filePath + fileName);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    BufferedReader in1 = new BufferedReader
                    (new FileReader(ContactFileName));
                    String str;
                    while ((str = in1.readLine()) != null) {
                    pw.println(str);
                    }
                    in1.close();
                    pw.flush();
                    pw.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_saveAsOption

    private void closeMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenu
        if (askYesNo("All unsaved data will be lost. Are you sure you want to close this address book?"))
            closeWindow();
    }//GEN-LAST:event_closeMenu

    /* Adds a contact to the address book. */
    private void newMenuChoice(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuChoice
        addButton(evt);
    }//GEN-LAST:event_newMenuChoice
    /* Edits an existing contact. */
    private void openMenuChoice(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuChoice
        editButton(evt);
    }//GEN-LAST:event_openMenuChoice

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddressBook().setVisible(true);
        });
    }

    /* Asks the user a yes/no question */
    private boolean askYesNo(String msg) {

        Runnable runnable =
            (Runnable) java.awt.Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
        if (runnable != null)
            runnable.run();
        return javax.swing.JOptionPane.showConfirmDialog(null,
            msg, "Warning", javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.WARNING_MESSAGE) == javax.swing.JOptionPane.YES_OPTION;
    }

    /* Displays an error message. */
    private void errorMessage(String msg) {

        Runnable runnable =
            (Runnable) java.awt.Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.hand");
        if (runnable != null)
            runnable.run();
        javax.swing.JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /* Closes the window. */
    private void closeWindow() {
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu File;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton addButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTextField jTextStatus;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton nameSortButton;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton zipSortButton;
    // End of variables declaration//GEN-END:variables
    //private boolean findPerson
}