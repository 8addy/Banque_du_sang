/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque_du_sang_Home;

import banque_du_sang_Views.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import rojeru_san.RSButton;

/**
 *
 * @author mmtsh
 */
public class HomeList extends javax.swing.JFrame {

    int mousePX;
    int mousePY;
    
    public HomeList() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        button_panel = new javax.swing.JPanel();
        btnDonneur = new rojeru_san.RSButton();
        btnDonataire = new rojeru_san.RSButton();
        btnDetailsDonation = new rojeru_san.RSButton();
        btnStockSang = new rojeru_san.RSButton();
        btnEmployees = new rojeru_san.RSButton();
        btnAdministrateur = new rojeru_san.RSButton();
        showSection = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ClosePanel = new javax.swing.JPanel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1124, 638));
        setSize(new java.awt.Dimension(1122, 618));

        Container.setMinimumSize(new java.awt.Dimension(1128, 640));
        Container.setPreferredSize(new java.awt.Dimension(1128, 640));
        Container.setVerifyInputWhenFocusTarget(false);
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_panel.setBackground(new java.awt.Color(255, 51, 51));

        btnDonneur.setBackground(new java.awt.Color(219, 54, 46));
        btnDonneur.setText("Donneur");
        btnDonneur.setColorHover(new java.awt.Color(181, 46, 52));
        btnDonneur.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        btnDonneur.setMinimumSize(new java.awt.Dimension(152, 45));
        btnDonneur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonneurActionPerformed(evt);
            }
        });

        btnDonataire.setBackground(new java.awt.Color(219, 54, 46));
        btnDonataire.setText("Donataire");
        btnDonataire.setColorHover(new java.awt.Color(181, 46, 52));
        btnDonataire.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        btnDonataire.setMinimumSize(new java.awt.Dimension(152, 45));
        btnDonataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonataireActionPerformed(evt);
            }
        });

        btnDetailsDonation.setBackground(new java.awt.Color(219, 54, 46));
        btnDetailsDonation.setText("DetailsDonation");
        btnDetailsDonation.setColorHover(new java.awt.Color(181, 46, 52));
        btnDetailsDonation.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        btnDetailsDonation.setMinimumSize(new java.awt.Dimension(152, 45));
        btnDetailsDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsDonationActionPerformed(evt);
            }
        });

        btnStockSang.setBackground(new java.awt.Color(219, 54, 46));
        btnStockSang.setText("StockSang");
        btnStockSang.setColorHover(new java.awt.Color(181, 46, 52));
        btnStockSang.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        btnStockSang.setMinimumSize(new java.awt.Dimension(152, 45));
        btnStockSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockSangActionPerformed(evt);
            }
        });

        btnEmployees.setBackground(new java.awt.Color(219, 54, 46));
        btnEmployees.setText("Employees");
        btnEmployees.setColorHover(new java.awt.Color(181, 46, 52));
        btnEmployees.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N

        btnAdministrateur.setBackground(new java.awt.Color(255, 62, 6));
        btnAdministrateur.setText("Manager");
        btnAdministrateur.setColorHover(new java.awt.Color(206, 51, 0));
        btnAdministrateur.setColorText(new java.awt.Color(255, 255, 204));
        btnAdministrateur.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        javax.swing.GroupLayout button_panelLayout = new javax.swing.GroupLayout(button_panel);
        button_panel.setLayout(button_panelLayout);
        button_panelLayout.setHorizontalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDonneur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDonataire, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button_panelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(btnAdministrateur, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addComponent(btnEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStockSang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDetailsDonation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        button_panelLayout.setVerticalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnDonneur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonataire, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStockSang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDetailsDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnAdministrateur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Container.add(button_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 600));

        showSection.setBackground(new java.awt.Color(181, 46, 52));
        showSection.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bgPanel.png"))); // NOI18N
        showSection.add(jLabel2, java.awt.BorderLayout.CENTER);

        Container.add(showSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 884, 600));

        ClosePanel.setBackground(new java.awt.Color(0, 0, 0));
        ClosePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ClosePanel.setPreferredSize(new java.awt.Dimension(33, 33));
        ClosePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ClosePanelMouseDragged(evt);
            }
        });
        ClosePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClosePanelMousePressed(evt);
            }
        });
        ClosePanel.setLayout(null);

        btnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Minimze.png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });
        ClosePanel.add(btnMinimize);
        btnMinimize.setBounds(1050, 2, 30, 34);

        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Closee.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        ClosePanel.add(btnClose);
        btnClose.setBounds(1090, 2, 30, 34);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        ClosePanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 35);

        Container.add(ClosePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /* Button Focus */
    public void btnFocus(RSButton button){
        btnDonneur.setBackground(new Color(219,54,46));
        btnDonataire.setBackground(new Color(219,54,46));
        btnDetailsDonation.setBackground(new Color(219,54,46));
        btnStockSang.setBackground(new Color(219,54,46));
        btnEmployees.setBackground(new Color(219,54,46));
        button.setBackground(new Color(181,46,52));
    }
    
    
    private void btnDonneurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonneurActionPerformed
        JPanel donneurView = new DonneurView();
        btnFocus(btnDonneur);
        showSection.removeAll();
        showSection.repaint();
        showSection.revalidate();
        showSection.add(donneurView, BorderLayout.CENTER);
        showSection.repaint();
        showSection.revalidate();

    }//GEN-LAST:event_btnDonneurActionPerformed

    private void btnDonataireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonataireActionPerformed
        JPanel donataireView = new DonataireView();
        btnFocus(btnDonataire);
        showSection.removeAll();
        showSection.repaint();
        showSection.revalidate();
        showSection.add(donataireView, BorderLayout.CENTER);
        showSection.repaint();
        showSection.revalidate();
    }//GEN-LAST:event_btnDonataireActionPerformed

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(HomeList.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MinimzeHover.png")));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Minimze.png")));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CloseHover.png")));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Closee.png")));
    }//GEN-LAST:event_btnCloseMouseExited

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mousePX, y-mousePY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void ClosePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosePanelMouseDragged

    }//GEN-LAST:event_ClosePanelMouseDragged

    private void ClosePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosePanelMousePressed

    }//GEN-LAST:event_ClosePanelMousePressed

    private void btnStockSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockSangActionPerformed
        JPanel stockView = new StockSangView();
        btnFocus(btnStockSang);
        showSection.removeAll();
        showSection.repaint();
        showSection.revalidate();
        showSection.add(stockView, BorderLayout.CENTER);
        showSection.repaint();
        showSection.revalidate();
    }//GEN-LAST:event_btnStockSangActionPerformed

    private void btnDetailsDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsDonationActionPerformed
        JPanel detailsView = new DetailsDonationView();
        btnFocus(btnDetailsDonation);
        showSection.removeAll();
        showSection.repaint();
        showSection.revalidate();
        showSection.add(detailsView, BorderLayout.CENTER);
        showSection.repaint();
        showSection.revalidate();
    }//GEN-LAST:event_btnDetailsDonationActionPerformed

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
            java.util.logging.Logger.getLogger(HomeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClosePanel;
    private javax.swing.JPanel Container;
    private rojeru_san.RSButton btnAdministrateur;
    private javax.swing.JLabel btnClose;
    private rojeru_san.RSButton btnDetailsDonation;
    private rojeru_san.RSButton btnDonataire;
    private rojeru_san.RSButton btnDonneur;
    private rojeru_san.RSButton btnEmployees;
    private javax.swing.JLabel btnMinimize;
    private rojeru_san.RSButton btnStockSang;
    private javax.swing.JPanel button_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel showSection;
    // End of variables declaration//GEN-END:variables
}
