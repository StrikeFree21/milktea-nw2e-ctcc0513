/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bon Robrick De Leon,Gian Destreza,Lenard Errol Izon
 */

     
     import java.util.ArrayList;
     import java.util.List;
     import javax.swing.JOptionPane;
     import javax.swing.table.DefaultTableModel;
     import java.text.DecimalFormat;
     import java.util.Stack;
     public class MilkTea_Ordering_System extends javax.swing.JDialog {

    /**
     * Creates new form MilkTea_Ordering_System
     */
     private double totalPrice;
    
   
    private List<String> cupsize = new ArrayList<>();
    private List<String> flavors = new ArrayList<>();
    private Stack<String> cartItems = new Stack<>();
    private static final double baseprice = 30.00;
    private static final double bobba_price = 15.00;
    private static final double jelly_price = 15.00;
    private static final double small_price = 15.00;
    private static final double meduim_price = 30.00;
    private static final double large_price = 45.00;
    
   
    public MilkTea_Ordering_System(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        flavors.add("Oolong");
        flavors.add("Chai");
        flavors.add("Matcha");
        flavors.add("Honeydew");
        
        cupsize.add("Small");
        cupsize.add("Medium");
        cupsize.add("Large");
    
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rb_oolong = new javax.swing.JRadioButton();
        rb_chai = new javax.swing.JRadioButton();
        rb_matcha = new javax.swing.JRadioButton();
        rb_honeydew = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rbsmall = new javax.swing.JRadioButton();
        rbmeduim = new javax.swing.JRadioButton();
        rblarge = new javax.swing.JRadioButton();
        bt_add = new javax.swing.JButton();
        bt_remove = new javax.swing.JButton();
        bt_purchase = new javax.swing.JButton();
        bobaCheckBox = new java.awt.Checkbox();
        jellyCheckBox = new java.awt.Checkbox();
        rb_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTableModel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel1.setText("TEA TYPE ");

        buttonGroup2.add(rb_oolong);
        rb_oolong.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rb_oolong.setText("Oolong");

        buttonGroup2.add(rb_chai);
        rb_chai.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rb_chai.setText("Chai");

        buttonGroup2.add(rb_matcha);
        rb_matcha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rb_matcha.setText("Matcha");
        rb_matcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_matchaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_honeydew);
        rb_honeydew.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rb_honeydew.setText("Honeydew");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel2.setText("Cup size ");

        buttonGroup1.add(rbsmall);
        rbsmall.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbsmall.setText("SMALL");
        rbsmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsmallActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbmeduim);
        rbmeduim.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbmeduim.setText("MEDUIM");

        buttonGroup1.add(rblarge);
        rblarge.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rblarge.setText("LARGE");

        bt_add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_add.setText("ADD");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_remove.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_remove.setText("Remove");
        bt_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removeActionPerformed(evt);
            }
        });

        bt_purchase.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_purchase.setText("PlaceOrder");
        bt_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_purchaseActionPerformed(evt);
            }
        });

        bobaCheckBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bobaCheckBox.setLabel("Bobba");

        jellyCheckBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jellyCheckBox.setLabel("pearls");

        rb_exit.setText("Exit");
        rb_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_exit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_honeydew)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rb_oolong)
                                            .addComponent(rb_chai)
                                            .addComponent(rb_matcha)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbsmall)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(rblarge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(rbmeduim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(bt_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bt_purchase))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jellyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bobaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_chai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(rb_oolong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rblarge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(rb_matcha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_honeydew)))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbsmall)
                            .addComponent(bobaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbmeduim)
                            .addComponent(jellyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_add)
                    .addComponent(bt_remove)
                    .addComponent(bt_purchase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(rb_exit)
                .addContainerGap())
        );

        cartTableModel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cartTableModel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cartTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order List", "Price"
            }
        ));
        jScrollPane1.setViewportView(cartTableModel);
        if (cartTableModel.getColumnModel().getColumnCount() > 0) {
            cartTableModel.getColumnModel().getColumn(1).setMinWidth(100);
            cartTableModel.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 48)); // NOI18N
        jLabel3.setText("LUCKYSTAR MILKTEA ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbsmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsmallActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbsmallActionPerformed

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        // TODO add your handling code here:
        addToCart();      
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeActionPerformed
        // TODO add your handling code here:
        removeFromCart();
    }//GEN-LAST:event_bt_removeActionPerformed

    private void bt_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_purchaseActionPerformed
        // TODO add your handling code here:        
        placeOrder();
    }//GEN-LAST:event_bt_purchaseActionPerformed

    private void rb_matchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_matchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_matchaActionPerformed

    private void rb_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rb_exitActionPerformed
             
    private void addToCart() {
         String selectedFlavor = "";
         String selectedSize = "";
         boolean addBoba = bobaCheckBox.getState();
         boolean addJelly = jellyCheckBox.getState();

    
         if (rb_oolong.isSelected()) {
         selectedFlavor = flavors.get(0);
       } else if (rb_chai.isSelected()) {
         selectedFlavor = flavors.get(1);
       } else if (rb_matcha.isSelected()) {
         selectedFlavor = flavors.get(2);
       } else if (rb_honeydew.isSelected()) {
         selectedFlavor = flavors.get(3);
       }

        if (rbsmall.isSelected()) {
         selectedSize = cupsize.get(0);
       } else if (rbmeduim.isSelected()) {
        selectedSize = cupsize.get(1);
       } else if (rblarge.isSelected()) {
        selectedSize = cupsize.get(2);
       }

          if (selectedFlavor.isEmpty() || selectedSize.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a flavor and size.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
       }
         double itemPrice = 0.0;

         if (selectedSize.equals(cupsize.get(0))) {
        itemPrice += small_price;
         } else if (selectedSize.equals(cupsize.get(1))) {
        itemPrice += meduim_price;
         } else if (selectedSize.equals(cupsize.get(2))) {
        itemPrice += large_price;
         }

        itemPrice += baseprice;
         if (addBoba) {
        itemPrice += bobba_price;
         }
         if (addJelly) {
        itemPrice += jelly_price;
        }
         
          String cartItem = selectedFlavor + " - Size: " + selectedSize + " - Boba: " + (addBoba ? "Yes" : "No") +
            ", Jelly: " + (addJelly ? "Yes" : "No");
          String formattedPrice = new DecimalFormat("#.##").format(itemPrice);
          totalPrice += itemPrice;
          cartItems.push(cartItem);
          ((DefaultTableModel) cartTableModel.getModel()).addRow(new Object[]{cartItem, "₱" + formattedPrice});
         }



      private void removeFromCart() {
    if (!cartItems.isEmpty()) {
        String removedItem = cartItems.pop();
        double removedPrice = extractPriceFromCartItem(removedItem);

        totalPrice -= removedPrice;
        DefaultTableModel defaultCartTableModel = (DefaultTableModel) cartTableModel.getModel();
        int rowCount = defaultCartTableModel.getRowCount();
        if (rowCount > 0) {
            defaultCartTableModel.removeRow(rowCount - 1);
            }
        }
    }


    private double extractPriceFromCartItem(String priceString) {
    int priceIndex = priceString.lastIndexOf("₱");
    if (priceIndex != -1) {
        return Double.parseDouble(priceString.substring(priceIndex + 1));
    } else {
        return 0.0;
    }
}


    private void placeOrder() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Milk Tea Order Receipt\n\n");

        for (String cartItem : cartItems) {
            receipt.append(cartItem).append("\n");
        }
        receipt.append("\nTotal Price: ₱").append(new DecimalFormat("#.##").format(totalPrice));
        JOptionPane.showMessageDialog(this, receipt.toString(), "Order Receipt", JOptionPane.INFORMATION_MESSAGE);
        cartItems.clear();
        DefaultTableModel model = (DefaultTableModel) cartTableModel.getModel();
        model.setRowCount(0);
        totalPrice = 0.0;
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
            java.util.logging.Logger.getLogger(MilkTea_Ordering_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MilkTea_Ordering_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MilkTea_Ordering_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MilkTea_Ordering_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MilkTea_Ordering_System dialog = new MilkTea_Ordering_System(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox bobaCheckBox;
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_purchase;
    private javax.swing.JButton bt_remove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTable cartTableModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private java.awt.Checkbox jellyCheckBox;
    private javax.swing.JRadioButton rb_chai;
    private javax.swing.JButton rb_exit;
    private javax.swing.JRadioButton rb_honeydew;
    private javax.swing.JRadioButton rb_matcha;
    private javax.swing.JRadioButton rb_oolong;
    private javax.swing.JRadioButton rblarge;
    private javax.swing.JRadioButton rbmeduim;
    private javax.swing.JRadioButton rbsmall;
    // End of variables declaration//GEN-END:variables
 }
