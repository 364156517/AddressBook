package guiproject1;


import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class addJFrame extends JFrame {
    //private PrintWriter outputFile;
    private boolean formMode;// true for add, false for edit
    private Contact editContact;

    public addJFrame() {

        initComponents();
        this.setResizable(false);
        this.setLocation(450, 150);
        this.setTitle("New Contact");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        /* Asks user if they're sure when x is clicked. */
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent we) {
                if (askYesNo("All unsaved data will be lost. Are you sure you want to exit?"))
                    closeWindow();
            }
        });
    }

    public void UpdateStatus(){

        if (formMode){
            jTextStatus.setText("Addition Mode, add a contact to your address book.");
            saveButton.setText(formMode ? "Save" : "Update");
        } else {
            jTextStatus.setText("Editing Mode, edit existing contact information.");
            saveButton.setText(formMode ? "Save" : "Update");
        }
    }

    //AddressBook addressBook = new AddressBook();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address1Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        zipField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        address2Field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        stateComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        noteField = new javax.swing.JTextField();
        jTextStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name: ");

        fNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name:");

        jLabel3.setText("Address1: ");

        jLabel4.setText("City:");

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("State:");

        jLabel6.setText("Zip:");

        jLabel7.setText("Address 2: ");

        jLabel8.setText("Email:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AL", "AK", "AR", "AZ", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY", "AS", "DC", "FM", "GU", "MH", "MP", "PW", "PR", "VI", "AE", "AA", "AP" }));
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });

        jLabel10.setText("PhoneNumber:");

        jLabel11.setText("Notes:");

        noteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteFieldActionPerformed(evt);
            }
        });

        jTextStatus.setEditable(false);
        jTextStatus.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noteField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zipField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(address2Field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(address1Field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jTextStatus)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(lNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(address1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address2Field))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void MapTextBox(Contact c){
        if(c != null){
            fNameField.setText(c.getFirstName());
            lNameField.setText(c.getLastName());
            address1Field.setText(c.getAddress1());
            address2Field.setText(c.getAddress2());
            cityField.setText(c.getCity());
            stateComboBox.setSelectedItem(c.getState());
            zipField.setText(c.getZipCode());
            emailField.setText(c.getEmail());
            phoneField.setText(c.getPhoneNumber());
            noteField.setText(c.getNotes());
            this.setTitle(c.getUserName());
            editContact = c;
        }
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String fn,ln,a1,a2,ct,st,zp,em,pn,nt;

        // Validate info first
        if (!validateInfo())
            return;

        String firstName = fNameField.getText();
        String lastName = lNameField.getText();
        String address1 = address1Field.getText();
        String address2 = address2Field.getText();
        String city = cityField.getText();
        String state = stateComboBox.getSelectedItem().toString();
        String zip = zipField.getText();
        String email= emailField.getText();
        String phone = phoneField.getText();
        String note = noteField.getText();
        String userName = lastName +", "+firstName;

        String buildContact = "";


        if(!firstName.isEmpty()){
            buildContact += firstName + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!lastName.isEmpty()){
            buildContact += lastName + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!address1.isEmpty()){
            buildContact += address1 + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!address2.isEmpty()){
            buildContact += address2 + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!city.isEmpty()){
            buildContact += city + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!state.isEmpty()){
            buildContact += state + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!zip.isEmpty()){
            buildContact += zip + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!email.isEmpty()){
            buildContact += email + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!phone.isEmpty()){
            buildContact += phone + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!note.isEmpty()){
            buildContact += note + ",";
        }else {
            buildContact += "NULL" + ",";
        }

        buildContact = buildContact.substring(0,buildContact.length() -1);
        if(formMode){
            if(ContactsUtility.appendTextContact(buildContact + "\r\n")){
                JOptionPane.showMessageDialog(null,"Successfully added contact : " + userName);
                ContactsUtility.readPhoneContacts(); // re read contact file to reload arrayList
                AddressBook.BindIntoJTable();
                closeWindow();
            }else{
                JOptionPane.showMessageDialog(null,"Failed to add contact : " + userName);
            }
        }else{
            if(editContact.getFirstName().isEmpty()){
                fn= "NULL";
            }else {
                fn = editContact.getFirstName();
            }

            if(editContact.getLastName().isEmpty()){
                ln= "NULL";
            }else {
                ln = editContact.getLastName();
            }

            if(editContact.getAddress1().isEmpty()){
                a1= "NULL";
            }else {
                a1 = editContact.getAddress1();
            }

            if(editContact.getAddress2().isEmpty()){
                a2= "NULL";
            }else {
                a2 = editContact.getAddress2();
            }

            if(editContact.getCity().isEmpty()){
                ct= "NULL";
            }else {
                ct = editContact.getCity();
            }

            if(editContact.getState().isEmpty()){
                st= "NULL";
            }else {
                st = editContact.getState();
            }

            if(editContact.getZipCode().isEmpty()){
                zp= "NULL";
            }else {
                zp = editContact.getZipCode();
            }

            if(editContact.getEmail().isEmpty()){
                em= "NULL";
            }else {
                em = editContact.getEmail();
            }

            if(editContact.getPhoneNumber().isEmpty()){
                pn= "NULL";
            }else {
                pn = editContact.getPhoneNumber();
            }

            if(editContact.getNotes().isEmpty()){
                nt= "NULL";
            }else {
                nt = editContact.getNotes();
            }

            if(ContactsUtility.updateContact(fn,ln,a1,a2,ct,st,zp,em,pn,nt,
                    buildContact)){
                System.out.println(a2);
                System.out.println(buildContact);
                JOptionPane.showMessageDialog(null,"Successfully updated contact : " + userName);
                ContactsUtility.readPhoneContacts(); // re read contact file to reload arrayList
                AddressBook.BindIntoJTable();
                closeWindow();

            }else{
                JOptionPane.showMessageDialog(null,"Failed to update contact : " + userName);
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    /* Method called when the user clicks the back button. */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (askYesNo("All unsaved data will be lost. Are you sure you want to exit?"))
            closeWindow();
    }//GEN-LAST:event_backButtonActionPerformed

    private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameFieldActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void noteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

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
            java.util.logging.Logger.getLogger(addJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new addJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField address1Field;
    public javax.swing.JTextField address2Field;
    private javax.swing.JButton backButton;
    public javax.swing.JTextField cityField;
    public javax.swing.JTextField emailField;
    public javax.swing.JTextField fNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextStatus;
    public javax.swing.JTextField lNameField;
    public javax.swing.JTextField noteField;
    public javax.swing.JTextField phoneField;
    private javax.swing.JButton saveButton;
    public javax.swing.JComboBox<String> stateComboBox;
    public javax.swing.JTextField zipField;
    // End of variables declaration//GEN-END:variables

    /*private void update() {
        Contact[] c = this.listBook.toArray();
        for (int i = 0; i < c.length; i++)

    }*/
    public boolean isFormMode() {
        return formMode;
    }

    /**
     * @param formMode the formMode to set
     */
    public void setFormMode(boolean formMode) {
        this.formMode = formMode;
    }

    /**
     * @return the editContactDetails
     */
    public Contact getEditContactDetails() {
        return editContact;
    }

    /**
     * @param editContactDetails the editContactDetails to set
     */
    public void setEditContactDetails(Contact editContactDetails) {
        this.editContact = editContactDetails;
    }

    /* Checks contact information for validity. */
    private boolean validateInfo() {

        /* User must enter a first or last name. */
        if (fNameField.getText().isEmpty() && lNameField.getText().isEmpty()) {

            errorMessage("You must enter at least a first or last name.");
            return false;
        }

        /* User must enter at least one piece of information */
        if (address1Field.getText().isEmpty() &&
                address2Field.getText().isEmpty() &&
                cityField.getText().isEmpty() &&
                stateComboBox.getSelectedIndex() == 0 &&
                zipField.getText().isEmpty() &&
                emailField.getText().isEmpty() &&
                phoneField.getText().isEmpty()) {

            errorMessage("You must enter at least one other piece of contact information.");
            return false;
        }

        /* Check contact validity, warn user of mistakes. */
        if (!ContactValidity.nameValid(fNameField.getText()) ||
            !ContactValidity.nameValid(lNameField.getText()) ||
            !ContactValidity.address1Valid(address1Field.getText()) ||
            !ContactValidity.cityValid(cityField.getText()) ||
            stateComboBox.getSelectedIndex() == 0 ||
            !ContactValidity.zipCodeValid(zipField.getText()) ||
            !ContactValidity.emailValid(emailField.getText()) ||
            !ContactValidity.phoneNumberValid(phoneField.getText())) {

            return askYesNo("Some of the information you entered does not fit the U.S. postal standards. Do you still want to save?");
        }
        return true;
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

    /* Disposes the window. */
    private void closeWindow() {
        this.dispose();
    }
}