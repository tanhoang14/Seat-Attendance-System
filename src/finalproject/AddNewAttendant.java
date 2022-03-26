/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.*;
import java.util.*; 
import java.io.*;
import java.text.DecimalFormat;

public class AddNewAttendant extends javax.swing.JFrame {

ArrayList<Attendant> attendants;
DecimalFormat formatter;
    public AddNewAttendant() 
    {
        initComponents();
        formatter = new DecimalFormat("#,###,0");
        attendants= new ArrayList<Attendant>();
        populateArrayList();
    }

    public void populateArrayList() 
    {
     try 
     {
        FileInputStream file = new FileInputStream("attendants.dat"); 
        ObjectInputStream inputFile = new ObjectInputStream(file); 
        boolean endOfFile= false; 
        while(!endOfFile)
        {
         try
         { 
       
          attendants.add((Attendant)inputFile.readObject());         
        
         }
         catch(EOFException e)
        { 
            endOfFile= true;
        }
        
        
         catch(Exception f) 
         {
           JOptionPane.showMessageDialog(null, f.getMessage()); 
         }
         
        }
        inputFile.close();
     }
     catch (IOException e)
     {
         JOptionPane.showMessageDialog(null, e.getMessage());
     }
    }
    public void saveAttendantsToFile()
    { 
        try 
        { 
        FileOutputStream file= new FileOutputStream("attendants.dat");
        ObjectOutputStream outputFile = new ObjectOutputStream(file);
        for(int i=0;i<attendants.size();i++) 
        {
            outputFile.writeObject(attendants.get(i));
          if(attendants.get(attendants.size()).getSeatLocation()==attendants.get(i).getSeatLocation())
          {
          attendants.remove(attendants.size());
          JOptionPane.showMessageDialog(null, "This seat has been taken: ");
          }
        }
        
        outputFile.close();
        JOptionPane.showMessageDialog(null,"Successfully saved");
        this.dispose();
        }
        
       
       
        
        catch(IOException e) 
        { 
         JOptionPane.showMessageDialog(null, e.getMessage());   
        }
     
       
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aName = new javax.swing.JTextField();
        aAge = new javax.swing.JTextField();
        aSeat = new javax.swing.JTextField();
        aPricepaid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Attendant");

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel1.setText("    Add new attendant by entering details below:");

        jLabel2.setText("Enter attendant's name:");

        jLabel3.setText("Enter attendant's age:");

        jLabel4.setText("Enter attendant's seat location:");

        jLabel5.setText("Price Paid:");

        aName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aNameActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tan\\Desktop\\ICON PICS\\icons8-save-32.png")); // NOI18N
        jButton1.setText("Add Attendant ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aName)
                            .addComponent(aAge)
                            .addComponent(aPricepaid)
                            .addComponent(aSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aPricepaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(aName.getText().isEmpty() || aAge.getText().isEmpty()|| aSeat.getText().isEmpty()|| aPricepaid.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Please enter all fields: ");
        }
        else
        { 
        String name = aName.getText().trim(); 
        String age = aAge.getText().trim();
        
        String Seat= aSeat.getText().trim(); 
        
        String pricetopay=aPricepaid.getText().trim(); 
        
        Attendant attendant = new Attendant(name,Integer.parseInt(age),Integer.parseInt(Seat),Integer.parseInt(pricetopay));
        attendants.add(attendant); 
        
        
        saveAttendantsToFile();
      
    }//GEN-LAST:event_jButton1ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(AddNewAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewAttendant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewAttendant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aAge;
    private javax.swing.JTextField aName;
    private javax.swing.JTextField aPricepaid;
    private javax.swing.JTextField aSeat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
