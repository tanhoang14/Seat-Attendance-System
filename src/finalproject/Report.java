/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*; 
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 *
 * @author Tan
 */

public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    ArrayList<Attendant> attendants; 
    public Report() {
        initComponents();
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Show Record ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Show Attendant's Report");

        btn2.setText("Sort name from A-Z");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("Lowest to Highest Price");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sort By Location ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      double sum=0;
      double avg=0;
      //show ATTENDANT
      for(Attendant Attendant:attendants)
      { JOptionPane.showMessageDialog(null,"Name: " +Attendant.getName()+".\n"+"Age: "+ Attendant.getAge()+".\n"+"Seat Location: "+Attendant.getSeatLocation()+".\n"+"PricePaid:"+Attendant.getPricePaid()+"$");
      //sum
      sum+= Attendant.getPricePaid();
      }
      JOptionPane.showMessageDialog(null, "Total Revenue: "+ sum+"$");
      //average 
     for (int i=1;i<attendants.size();i++)
     {
         avg=sum/i;
     }
     JOptionPane.showMessageDialog(null, "Average Price Paid"+ avg+"$");
     //Richest Person 
     ArrayList<Integer> richest= new ArrayList();
     for(Attendant Attendant:attendants)
     {
         richest.add(Attendant.getPricePaid());
     }
     int max= Collections.max(richest);
     for(Attendant Attendant:attendants)
     {
         if(Attendant.getPricePaid()==max)
         {
         JOptionPane.showMessageDialog(null, "The Richest person is:"+Attendant.getName()+".\n"+"Amount of money spent:"+Attendant.getPricePaid()+"$");
         }
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
 {
                ArrayList<String> na = new ArrayList();
                for (Attendant att: attendants)
                {
                    na.add(att.getName());
                }
                LinkedHashSet<String> lhs = new LinkedHashSet<String>();
                lhs.addAll(na);
                na.clear();
                na.addAll(lhs);
                Collections.sort(na, String.CASE_INSENSITIVE_ORDER);

                for (int i = 0; i < na.size(); i++)
                {
                    for (int c = 0; c < attendants.size(); c++)
                    {
                        if (na.get(i).equals(attendants.get(c).getName()))
                        {
                            JOptionPane.showMessageDialog(null, "Participant #" + (c+1) + "         Name: " + attendants.get(c).getName().toUpperCase() 
                                     + "     |      Seat Location: " + attendants.get(c).getSeatLocation() + "     |     Age: " + attendants.get(c).getAge() +  "     |     Price Paid: " + attendants.get(c).getPricePaid());
                        }
                    }
                }
            }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        ArrayList<Integer> doub = new ArrayList();
                for (Attendant att: attendants)
                {
                    doub.add(att.getPricePaid());
                }
                LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
                lhs.addAll(doub);
                doub.clear();
                doub.addAll(lhs);
                Collections.sort(doub, Collections.reverseOrder());
                for (int i = 0; i < doub.size(); i++)
                {
                    for (int c = 0; c < attendants.size(); c++)
                    {
                        if (doub.get(i) == attendants.get(c).getPricePaid())
                        {
                            JOptionPane.showMessageDialog(null, "Participant #" + (c+1) + "         Price Paid: " + attendants.get(c).getPricePaid() 
                                     + "     |     Name: " + attendants.get(c).getName().toUpperCase() + "  |  Age: " + attendants.get(c).getAge() +  "  |   Seat Location: " + attendants.get(c).getSeatLocation());
                        }
                    }
                }
            
            

                
           
    }//GEN-LAST:event_btn3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 //By Locaction
            
            {
                ArrayList<Integer> loc = new ArrayList();
                for (Attendant att: attendants)
                {
                    loc.add(att.getSeatLocation());
                }
                Collections.sort(loc);
                for (int i = 0; i < attendants.size(); i++)
                {
                    for (int c = 0; c < attendants.size(); c++)
                    {
                        if (loc.get(i) == attendants.get(c).getSeatLocation())
                        {
                            JOptionPane.showMessageDialog(null, "Participant #" + (c+1) + "     Seat Location: " + attendants.get(c).getSeatLocation() 
                                     + "     |   Name: " + attendants.get(c).getName().toUpperCase() + "  |     Age: " + attendants.get(c).getAge() +  "   |  Price Paid: " + attendants.get(c).getPricePaid());
                        }
                    }
                }
            }
                        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
