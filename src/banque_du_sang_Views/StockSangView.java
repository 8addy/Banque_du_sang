/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque_du_sang_Views;

import banque_du_sang_DataBase.UtilJDBC;
import banque_du_sang_Models.StockSang;
import java.util.ArrayList;
import java.awt.Font;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import rojeru_san.NewJFrame;

/**
 *
 * @author mmtsh
 */
public class StockSangView extends javax.swing.JPanel {

    
    int mousePX;
    int mousePY;
    int row;
    int ID;
    int pocheNum;
    String order;
    String action;
    Connection conn;
    ArrayList<StockSang> stock = new ArrayList<StockSang>();
    DefaultTableModel df = new DefaultTableModel();
    
    
    
    public StockSangView() {
        initComponents();
        df = (DefaultTableModel) tableStockSang.getModel();
        conn = UtilJDBC.seConnecte();
        Afficher();
        
       
        
        /* Make Modify,Delete and imprime invisible until select some row */
        btnSupprimerEnStock.setVisible(false);
        btnModifierStock.setVisible(false);
        btnDonner.setVisible(false);
        
        btnFirst.setVisible(false);
        btnPrevious.setVisible(false);
        btnNext.setVisible(false);
        btnLast.setVisible(false);
        
        panelSearch.setVisible(false);
        AfficherTous.setVisible(false);
        jcmbDonneurID.setVisible(false);
        
        
        /* Design Table Header */
        tableStockSang.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableStockSang.getTableHeader().setOpaque(false);
        tableStockSang.setRowHeight(25);
        ((DefaultTableCellRenderer)tableStockSang.getTableHeader().getDefaultRenderer()).setHorizontalAlignment((int) CENTER_ALIGNMENT);
    }
    
    
    
    
    /* Methode to Show Data in table and also add them to List */
    public void Afficher(){
        try {
            Statement st = conn.createStatement();
            String req = "select * from StockSang inner join Donneur on(StockSang.DonneurID = Donneur.DonneurID) ";
            if(order == "Nouveau"){
                req+= " order by PocheNum desc";
            }else if(order == "Ancien"){
                req+= " order by PocheNum asc";
            }
            ResultSet rs  = st.executeQuery(req);
            df.setRowCount(0);
            while(rs.next()){
                stock.add(new StockSang(rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7)));
                df.addRow(new Object[]{rs.getInt("PocheNum"), rs.getString("DonneurNom"), rs.getString("DonneurTypeSang"), rs.getInt("QuantityDisponible"), rs.getString("GlobulesRouges"), rs.getString("GlobulesBlanc"), rs.getString("Plaquettes"), rs.getString("Plasma")});
            }
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    /* Remplir les input pour la modification */
    public void remplirInputs(){
        StockSang s = stock.get(row);
        txtDonneurIDStock1.setText(s.getDonneurID()+"");
        txtQuantityDispoStock.setText(s.getQuantityDisponible()+"");
        txtGlobRouges.setText(s.getGlobulesRouges());
        txtGlobblanc.setText(s.getGlobulesBlanc());
        txtPlaquttes.setText(s.getPlaquette());
        txtPlasma.setText(s.getPlasma());
        
    }
    
    
    /* Check si le donneur exist ou non, et si le donneur est acceptable dans interface d'ajoute*/
    public void checkDonneur(){
        int id=0;
        if(txtDonneurIDStock1.getText().length()>0){
            id=Integer.parseInt(txtDonneurIDStock1.getText());
        }
        if(id>0){
            try {
                PreparedStatement ps = conn.prepareStatement("select * from Donneur where DonneurID=?");
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    if(rs.getString("Eligibility").equals("Acceptable")){
                        jcmbDonneurID.setSelectedItem(rs.getInt(1)+"");
                    }else{
                        JOptionPane.showMessageDialog(null, "Desole! Ce donneur n'est pas acceptable");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Y a pas de donneur avec cette ID");
                }
            } catch (SQLException ex) {
                Logger.getLogger(StockSangView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selectionne un donneur");
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajouterAuStock = new javax.swing.JFrame();
        containerPanel = new javax.swing.JPanel();
        ClosePanel2 = new javax.swing.JPanel();
        btnMinimize2 = new javax.swing.JLabel();
        btnClose2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jLabel3 = new javax.swing.JLabel();
        txtPlasma = new rojeru_san.RSMTextFull();
        txtPlaquttes = new rojeru_san.RSMTextFull();
        txtGlobRouges = new rojeru_san.RSMTextFull();
        btnBack = new rojeru_san.RSButtonRiple();
        btnSubmit = new rojeru_san.RSButtonRiple();
        btnFirst = new rojeru_san.RSButton();
        btnPrevious = new rojeru_san.RSButton();
        btnNext = new rojeru_san.RSButton();
        btnLast = new rojeru_san.RSButton();
        txtGlobblanc = new rojeru_san.RSMTextFull();
        txtDonneurIDStock1 = new rojeru_san.RSMTextFull();
        txtQuantityDispoStock = new rojeru_san.RSMTextFull();
        jcmbDonneurID = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Donner_A_Frame = new javax.swing.JFrame();
        containerPanel1 = new javax.swing.JPanel();
        ClosePanel3 = new javax.swing.JPanel();
        btnMinimize3 = new javax.swing.JLabel();
        btnClose3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bodyPanel1 = new javax.swing.JPanel();
        btnBack1 = new rojeru_san.RSButtonRiple();
        btnSubmit1 = new rojeru_san.RSButtonRiple();
        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jLabel7 = new javax.swing.JLabel();
        jcmbDonataireID = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtDetail_Hopital = new rojeru_san.RSMTextFull();
        jLabel9 = new javax.swing.JLabel();
        txtDateDonner = new rojeru_san.RSMTextFull();
        labelDateFormat = new javax.swing.JLabel();
        txtQuantiteDonner = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStockSang = new javax.swing.JTable();
        btnAjouterAuStock = new rojeru_san.RSButton();
        btnSupprimerEnStock = new rojeru_san.RSButton();
        btnModifierStock = new rojeru_san.RSButton();
        panelSearch = new javax.swing.JPanel();
        btnSearchInput = new javax.swing.JLabel();
        txtSearchNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearchInput1 = new javax.swing.JLabel();
        AfficherTous = new javax.swing.JLabel();
        ShowSearch = new javax.swing.JLabel();
        jcmbSortPar = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnDonner = new rojeru_san.RSButton();

        ajouterAuStock.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ajouterAuStock.setTitle("Ajouter Donneur");
        ajouterAuStock.setLocation(new java.awt.Point(500, 130));
        ajouterAuStock.setMinimumSize(new java.awt.Dimension(469, 674));
        ajouterAuStock.setUndecorated(true);
        ajouterAuStock.setSize(new java.awt.Dimension(469, 674));

        containerPanel.setMinimumSize(new java.awt.Dimension(469, 646));
        containerPanel.setPreferredSize(new java.awt.Dimension(795, 646));
        containerPanel.setLayout(null);

        ClosePanel2.setBackground(new java.awt.Color(0, 0, 0));
        ClosePanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ClosePanel2.setPreferredSize(new java.awt.Dimension(33, 33));
        ClosePanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ClosePanel2MouseDragged(evt);
            }
        });
        ClosePanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClosePanel2MousePressed(evt);
            }
        });
        ClosePanel2.setLayout(null);

        btnMinimize2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Minimze.png"))); // NOI18N
        btnMinimize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimize2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimize2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimize2MouseExited(evt);
            }
        });
        ClosePanel2.add(btnMinimize2);
        btnMinimize2.setBounds(390, 0, 30, 33);

        btnClose2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Closee.png"))); // NOI18N
        btnClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClose2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClose2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClose2MouseExited(evt);
            }
        });
        ClosePanel2.add(btnClose2);
        btnClose2.setBounds(430, 0, 30, 33);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        ClosePanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 35);

        containerPanel.add(ClosePanel2);
        ClosePanel2.setBounds(0, 0, 480, 35);

        bodyPanel.setBackground(new java.awt.Color(181, 46, 52));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelShadow1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ajouter Au Stock");
        rSPanelShadow1.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        bodyPanel.add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 330, 48));

        txtPlasma.setBackground(new java.awt.Color(181, 46, 52));
        txtPlasma.setForeground(new java.awt.Color(255, 255, 255));
        txtPlasma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlasma.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtPlasma.setBotonColor(new java.awt.Color(102, 0, 0));
        txtPlasma.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtPlasma.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtPlasma.setPlaceholder("Plasma");
        txtPlasma.setSoloNumeros(true);
        bodyPanel.add(txtPlasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 170, 40));

        txtPlaquttes.setBackground(new java.awt.Color(181, 46, 52));
        txtPlaquttes.setForeground(new java.awt.Color(255, 255, 255));
        txtPlaquttes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaquttes.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtPlaquttes.setBotonColor(new java.awt.Color(102, 0, 0));
        txtPlaquttes.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtPlaquttes.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtPlaquttes.setPlaceholder("Plaquettes");
        txtPlaquttes.setSoloNumeros(true);
        bodyPanel.add(txtPlaquttes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 170, 40));

        txtGlobRouges.setBackground(new java.awt.Color(181, 46, 52));
        txtGlobRouges.setForeground(new java.awt.Color(255, 255, 255));
        txtGlobRouges.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGlobRouges.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtGlobRouges.setBotonColor(new java.awt.Color(102, 0, 0));
        txtGlobRouges.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtGlobRouges.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtGlobRouges.setPlaceholder("Glubules Rouges");
        txtGlobRouges.setSoloNumeros(true);
        bodyPanel.add(txtGlobRouges, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 40));

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Back");
        btnBack.setColorHover(new java.awt.Color(204, 0, 102));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        bodyPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 190, -1));

        btnSubmit.setBackground(new java.awt.Color(51, 51, 51));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        bodyPanel.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 190, -1));

        btnFirst.setBackground(new java.awt.Color(51, 51, 51));
        btnFirst.setText("|<");
        btnFirst.setColorHover(new java.awt.Color(204, 51, 0));
        btnFirst.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        bodyPanel.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 70, -1));

        btnPrevious.setBackground(new java.awt.Color(51, 51, 51));
        btnPrevious.setText("<");
        btnPrevious.setColorHover(new java.awt.Color(204, 51, 0));
        btnPrevious.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        bodyPanel.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 70, -1));

        btnNext.setBackground(new java.awt.Color(51, 51, 51));
        btnNext.setText(">");
        btnNext.setColorHover(new java.awt.Color(204, 51, 0));
        btnNext.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        bodyPanel.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 70, -1));

        btnLast.setBackground(new java.awt.Color(51, 51, 51));
        btnLast.setText(">|");
        btnLast.setColorHover(new java.awt.Color(204, 51, 0));
        btnLast.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        bodyPanel.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 70, -1));

        txtGlobblanc.setBackground(new java.awt.Color(181, 46, 52));
        txtGlobblanc.setForeground(new java.awt.Color(255, 255, 255));
        txtGlobblanc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGlobblanc.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtGlobblanc.setBotonColor(new java.awt.Color(102, 0, 0));
        txtGlobblanc.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtGlobblanc.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtGlobblanc.setPlaceholder("Globules Blanc");
        bodyPanel.add(txtGlobblanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 40));

        txtDonneurIDStock1.setBackground(new java.awt.Color(181, 46, 52));
        txtDonneurIDStock1.setForeground(new java.awt.Color(255, 255, 255));
        txtDonneurIDStock1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDonneurIDStock1.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtDonneurIDStock1.setBotonColor(new java.awt.Color(102, 0, 0));
        txtDonneurIDStock1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtDonneurIDStock1.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtDonneurIDStock1.setPlaceholder("Donneur ID");
        txtDonneurIDStock1.setSoloNumeros(true);
        txtDonneurIDStock1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDonneurIDStock1FocusLost(evt);
            }
        });
        txtDonneurIDStock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonneurIDStock1ActionPerformed(evt);
            }
        });
        bodyPanel.add(txtDonneurIDStock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 40));

        txtQuantityDispoStock.setBackground(new java.awt.Color(181, 46, 52));
        txtQuantityDispoStock.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantityDispoStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantityDispoStock.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtQuantityDispoStock.setBotonColor(new java.awt.Color(102, 0, 0));
        txtQuantityDispoStock.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtQuantityDispoStock.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtQuantityDispoStock.setPlaceholder("Quantity Disponible");
        txtQuantityDispoStock.setSoloNumeros(true);
        bodyPanel.add(txtQuantityDispoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, 40));

        jcmbDonneurID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDonneurIDActionPerformed(evt);
            }
        });
        bodyPanel.add(jcmbDonneurID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 125, 100, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Donneur ID");
        bodyPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 120, 100, 40));

        containerPanel.add(bodyPanel);
        bodyPanel.setBounds(0, 33, 472, 640);

        javax.swing.GroupLayout ajouterAuStockLayout = new javax.swing.GroupLayout(ajouterAuStock.getContentPane());
        ajouterAuStock.getContentPane().setLayout(ajouterAuStockLayout);
        ajouterAuStockLayout.setHorizontalGroup(
            ajouterAuStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        ajouterAuStockLayout.setVerticalGroup(
            ajouterAuStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        Donner_A_Frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Donner_A_Frame.setTitle("Ajouter Donneur");
        Donner_A_Frame.setLocation(new java.awt.Point(500, 130));
        Donner_A_Frame.setMinimumSize(new java.awt.Dimension(469, 528));
        Donner_A_Frame.setUndecorated(true);
        Donner_A_Frame.setPreferredSize(new java.awt.Dimension(469, 528));
        Donner_A_Frame.setSize(new java.awt.Dimension(469, 528));

        containerPanel1.setMinimumSize(new java.awt.Dimension(469, 646));
        containerPanel1.setPreferredSize(new java.awt.Dimension(795, 646));
        containerPanel1.setLayout(null);

        ClosePanel3.setBackground(new java.awt.Color(0, 0, 0));
        ClosePanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ClosePanel3.setPreferredSize(new java.awt.Dimension(33, 33));
        ClosePanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ClosePanel3MouseDragged(evt);
            }
        });
        ClosePanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClosePanel3MousePressed(evt);
            }
        });
        ClosePanel3.setLayout(null);

        btnMinimize3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Minimze.png"))); // NOI18N
        btnMinimize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimize3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimize3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimize3MouseExited(evt);
            }
        });
        ClosePanel3.add(btnMinimize3);
        btnMinimize3.setBounds(390, 0, 30, 33);

        btnClose3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Closee.png"))); // NOI18N
        btnClose3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClose3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClose3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClose3MouseExited(evt);
            }
        });
        ClosePanel3.add(btnClose3);
        btnClose3.setBounds(430, 0, 30, 33);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        ClosePanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 480, 35);

        containerPanel1.add(ClosePanel3);
        ClosePanel3.setBounds(0, 0, 480, 35);

        bodyPanel1.setBackground(new java.awt.Color(181, 46, 52));
        bodyPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack1.setBackground(new java.awt.Color(51, 51, 51));
        btnBack1.setText("Back");
        btnBack1.setColorHover(new java.awt.Color(204, 0, 102));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        bodyPanel1.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 190, -1));

        btnSubmit1.setBackground(new java.awt.Color(51, 51, 51));
        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        bodyPanel1.add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 190, -1));

        rSPanelShadow2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Donner à:");
        rSPanelShadow2.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        bodyPanel1.add(rSPanelShadow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 330, 48));

        bodyPanel1.add(jcmbDonataireID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Donataire ID");
        bodyPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, 30));

        txtDetail_Hopital.setBackground(new java.awt.Color(181, 46, 52));
        txtDetail_Hopital.setForeground(new java.awt.Color(255, 255, 255));
        txtDetail_Hopital.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDetail_Hopital.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtDetail_Hopital.setBotonColor(new java.awt.Color(102, 0, 0));
        txtDetail_Hopital.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtDetail_Hopital.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtDetail_Hopital.setPlaceholder("Hopital");
        txtDetail_Hopital.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDetail_HopitalFocusLost(evt);
            }
        });
        txtDetail_Hopital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetail_HopitalActionPerformed(evt);
            }
        });
        bodyPanel1.add(txtDetail_Hopital, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 240, 40));

        jLabel9.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date Donner");
        bodyPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 110, 30));

        txtDateDonner.setBackground(new java.awt.Color(181, 46, 52));
        txtDateDonner.setForeground(new java.awt.Color(255, 255, 255));
        txtDateDonner.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateDonner.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtDateDonner.setBotonColor(new java.awt.Color(102, 0, 0));
        txtDateDonner.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtDateDonner.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtDateDonner.setPlaceholder("YYYY-MM-DD");
        txtDateDonner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateDonnerKeyPressed(evt);
            }
        });
        bodyPanel1.add(txtDateDonner, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 130, 40));

        labelDateFormat.setForeground(new java.awt.Color(153, 153, 153));
        labelDateFormat.setText("YYYY-MM-DD");
        bodyPanel1.add(labelDateFormat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 80, 30));

        txtQuantiteDonner.setBackground(new java.awt.Color(181, 46, 52));
        txtQuantiteDonner.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantiteDonner.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantiteDonner.setBordeColorFocus(new java.awt.Color(255, 0, 0));
        txtQuantiteDonner.setBotonColor(new java.awt.Color(102, 0, 0));
        txtQuantiteDonner.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        txtQuantiteDonner.setMargin(new java.awt.Insets(2, 6, 2, 6));
        txtQuantiteDonner.setPlaceholder("Qunatite Donner");
        txtQuantiteDonner.setSoloNumeros(true);
        txtQuantiteDonner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantiteDonnerKeyPressed(evt);
            }
        });
        bodyPanel1.add(txtQuantiteDonner, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 190, 40));

        containerPanel1.add(bodyPanel1);
        bodyPanel1.setBounds(0, 33, 472, 500);

        javax.swing.GroupLayout Donner_A_FrameLayout = new javax.swing.GroupLayout(Donner_A_Frame.getContentPane());
        Donner_A_Frame.getContentPane().setLayout(Donner_A_FrameLayout);
        Donner_A_FrameLayout.setHorizontalGroup(
            Donner_A_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        Donner_A_FrameLayout.setVerticalGroup(
            Donner_A_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setMinimumSize(new java.awt.Dimension(884, 592));
        setPreferredSize(new java.awt.Dimension(884, 592));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableStockSang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PocheNum", "Nom de Donneur", "Type Sang", "Quantity Disponible", "Globules Rouges", "Globules Blanc", "Plaquettes", "Plasma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableStockSang.setFocusable(false);
        tableStockSang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableStockSang.setRowHeight(25);
        tableStockSang.setSelectionBackground(new java.awt.Color(208, 45, 51));
        tableStockSang.getTableHeader().setReorderingAllowed(false);
        tableStockSang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStockSangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStockSang);
        if (tableStockSang.getColumnModel().getColumnCount() > 0) {
            tableStockSang.getColumnModel().getColumn(0).setResizable(false);
            tableStockSang.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableStockSang.getColumnModel().getColumn(2).setPreferredWidth(15);
            tableStockSang.getColumnModel().getColumn(4).setResizable(false);
            tableStockSang.getColumnModel().getColumn(6).setPreferredWidth(38);
            tableStockSang.getColumnModel().getColumn(7).setPreferredWidth(35);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 865, 450));

        btnAjouterAuStock.setBackground(new java.awt.Color(255, 51, 51));
        btnAjouterAuStock.setText("Ajouter au Stock");
        btnAjouterAuStock.setColorHover(new java.awt.Color(181, 46, 52));
        btnAjouterAuStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterAuStockActionPerformed(evt);
            }
        });
        add(btnAjouterAuStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 16, -1, -1));

        btnSupprimerEnStock.setBackground(new java.awt.Color(255, 51, 51));
        btnSupprimerEnStock.setText("Supprimer");
        btnSupprimerEnStock.setColorHover(new java.awt.Color(181, 46, 52));
        btnSupprimerEnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerEnStockActionPerformed(evt);
            }
        });
        add(btnSupprimerEnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        btnModifierStock.setBackground(new java.awt.Color(255, 51, 51));
        btnModifierStock.setText("Modifier Poche");
        btnModifierStock.setColorHover(new java.awt.Color(181, 46, 52));
        btnModifierStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierStockActionPerformed(evt);
            }
        });
        add(btnModifierStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        panelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearchInput.setForeground(new java.awt.Color(0, 0, 0));
        btnSearchInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/searchIconInput.png"))); // NOI18N
        btnSearchInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchInputMouseClicked(evt);
            }
        });
        panelSearch.add(btnSearchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 21, -1, -1));

        txtSearchNom.setForeground(new java.awt.Color(0, 0, 0));
        panelSearch.add(txtSearchNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 15, 210, 38));

        jLabel1.setText("Recherche Donneur");
        panelSearch.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 16, 120, 40));

        btnSearchInput1.setForeground(new java.awt.Color(0, 0, 0));
        btnSearchInput1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/searchIconInput.png"))); // NOI18N
        btnSearchInput1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchInput1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchInput1MouseClicked(evt);
            }
        });
        panelSearch.add(btnSearchInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 21, 30, -1));

        AfficherTous.setForeground(new java.awt.Color(255, 51, 51));
        AfficherTous.setText("Afficher Tous");
        AfficherTous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AfficherTous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AfficherTousMouseClicked(evt);
            }
        });
        panelSearch.add(AfficherTous, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 90, 30));

        add(panelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 0, 340, 80));

        ShowSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/searchIconInput.png"))); // NOI18N
        ShowSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowSearchMouseClicked(evt);
            }
        });
        add(ShowSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 14, 30, 40));

        jcmbSortPar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Nouveau", "Ancien" }));
        jcmbSortPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbSortParActionPerformed(evt);
            }
        });
        add(jcmbSortPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 25, 100, 30));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sort par:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        btnDonner.setBackground(new java.awt.Color(255, 102, 0));
        btnDonner.setText("Donner");
        btnDonner.setColorHover(new java.awt.Color(181, 46, 52));
        btnDonner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonnerActionPerformed(evt);
            }
        });
        add(btnDonner, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tableStockSangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStockSangMouseClicked
        btnSupprimerEnStock.setVisible(true);
        btnModifierStock.setVisible(true);
        btnDonner.setVisible(true);
    }//GEN-LAST:event_tableStockSangMouseClicked

    private void btnAjouterAuStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterAuStockActionPerformed
        action = "ajouter";
        btnFirst.setVisible(false);
        btnPrevious.setVisible(false);
        btnNext.setVisible(false);
        btnLast.setVisible(false);
        txtGlobRouges.setText("");
        txtGlobblanc.setText("");
        txtDonneurIDStock1.setText("");
        txtQuantityDispoStock.setText("");
        txtGlobRouges.setText("");
        txtGlobblanc.setText("");
        txtPlaquttes.setText("");
        txtPlasma.setText("");
        jLabel3.setText("Ajouter au stock");
        jcmbDonneurID.setVisible(true);
        
        /* Ajouter les ID des donneur au combobox de frame Ajouter */
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Donneur Where Eligibility = 'Acceptable'");
            jcmbDonneurID.removeAllItems();
            while(rs.next()){
                jcmbDonneurID.addItem(rs.getInt(1)+"");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockSangView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        ajouterAuStock.setVisible(true);
    }//GEN-LAST:event_btnAjouterAuStockActionPerformed

    private void btnMinimize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize2MouseClicked
        ajouterAuStock.setState(ajouterAuStock.ICONIFIED);
    }//GEN-LAST:event_btnMinimize2MouseClicked

    private void btnMinimize2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize2MouseEntered
        btnMinimize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MinimzeHover.png")));
    }//GEN-LAST:event_btnMinimize2MouseEntered

    private void btnMinimize2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize2MouseExited
        btnMinimize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Minimze.png")));
    }//GEN-LAST:event_btnMinimize2MouseExited

    private void btnClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MouseClicked
        ajouterAuStock.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_btnClose2MouseClicked

    private void btnClose2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MouseEntered
        btnClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CloseHover.png")));
    }//GEN-LAST:event_btnClose2MouseEntered

    private void btnClose2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose2MouseExited
        btnClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Closee.png")));
    }//GEN-LAST:event_btnClose2MouseExited

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        ajouterAuStock.setLocation(x - mousePX, y-mousePY);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void ClosePanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosePanel2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_ClosePanel2MouseDragged

    private void ClosePanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosePanel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClosePanel2MousePressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ajouterAuStock.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
                int DonneurId = Integer.parseInt(txtDonneurIDStock1.getText());
                int quantityDispo = Integer.parseInt(txtQuantityDispoStock.getText());
                String globRouges = txtGlobRouges.getText();
                String globBlanc = txtGlobblanc.getText();
                String plaquettes = txtPlaquttes.getText();
                String plasma = txtPlasma.getText();
        PreparedStatement ps = null;
        try {
            if(action.equals("ajouter")){
                ps = conn.prepareStatement("insert into StockSang values(seq_pocheNum.nextval,?,?,?,?,?,?)");
                ps.setInt(1, DonneurId);
                ps.setInt(2, quantityDispo);
                ps.setString(3, globRouges);
                ps.setString(4, globBlanc);
                ps.setString(5, plaquettes);
                ps.setString(6, plasma);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Infos a ete ajoute au Stock avec succes");
            }else if(action.equals("modifier")){
                ps = conn.prepareStatement("update StockSang set DonneurID=?, QuantityDisponible=?, GlobulesRouges=?, GlobulesBlanc=?, Plaquettes=?,Plasma=? where PocheNum = ?");
                StockSang s = stock.get(row);
                ID = s.getPocheNum();
                ps.setInt(1, DonneurId);
                ps.setInt(2, quantityDispo);
                ps.setString(3, globRouges);
                ps.setString(4, globBlanc);
                ps.setString(5, plaquettes);
                ps.setString(6, plasma);
                ps.setInt(7, ID);
                ps.executeUpdate();
                s.setDonneurID(DonneurId);
                s.setQuantityDisponible(quantityDispo);
                s.setGlobulesRouges(globRouges);
                s.setGlobulesBlanc(globBlanc);
                s.setPlaquette(plaquettes);
                s.setPlasma(plasma);
                JOptionPane.showMessageDialog(null, "Info a ete modifie au stock avec succes");
            }
            
            Afficher();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnModifierStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierStockActionPerformed
        if(tableStockSang.getSelectedRow() != -1){
            row = tableStockSang.getSelectedRow();
            ID = (int) tableStockSang.getValueAt(row, 0);
        }
        remplirInputs();
        action = "modifier";
        btnFirst.setVisible(true);
        btnPrevious.setVisible(true);
        btnNext.setVisible(true);
        btnLast.setVisible(true);
        jLabel3.setText("Modifier en stock");
        jcmbDonneurID.setVisible(false);
        ajouterAuStock.setVisible(true);
    }//GEN-LAST:event_btnModifierStockActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        row=0;
        remplirInputs();
        
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(row<stock.size()-1){
            row++;
            remplirInputs();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        row = stock.size()-1;
        remplirInputs();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if(row>0){
            row--;
            remplirInputs();
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnSupprimerEnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerEnStockActionPerformed
        int agree = JOptionPane.showConfirmDialog(null, "Voulez Vous supprimer cette Information dans le stock?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(agree==JOptionPane.YES_OPTION){
            StockSang s = stock.get(row);
            ID = s.getDonneurID();
            try {
                PreparedStatement ps  = conn.prepareStatement("delete from StockSang where DonneurID=?");
                ps.setInt(1, ID);
                ps.executeQuery();
                stock.remove(s);
                Afficher();
                JOptionPane.showMessageDialog(null, "Les informations de stock a ete supprimer avec succes");
            } catch (SQLException ex) {
                Logger.getLogger(StockSangView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSupprimerEnStockActionPerformed

    private void btnSearchInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchInputMouseClicked
        String nom = txtSearchNom.getText();
            df.setRowCount(0);
        try {
            PreparedStatement ps = conn.prepareStatement("select * from StockSang inner join Donneur on(StockSang.DonneurID = Donneur.DonneurID) where lower(DonneurNom) like lower(?)");
            ps.setString(1,"%"+nom+"%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                df.addRow(new Object[]{rs.getInt("PocheNum"), rs.getString("DonneurNom"), rs.getString("DonneurTypeSang"), rs.getInt("QuantityDisponible"), rs.getString("GlobulesRouges"), rs.getString("GlobulesBlanc"), rs.getString("Plaquettes"), rs.getString("Plasma")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockSangView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchInputMouseClicked

    private void btnSearchInput1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchInput1MouseClicked
        ShowSearch.setVisible(false);
        panelSearch.setVisible(true);
    }//GEN-LAST:event_btnSearchInput1MouseClicked

    private void ShowSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowSearchMouseClicked
        ShowSearch.setVisible(false);
        panelSearch.setVisible(true);
    }//GEN-LAST:event_ShowSearchMouseClicked

    private void AfficherTousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AfficherTousMouseClicked
        Afficher();
    }//GEN-LAST:event_AfficherTousMouseClicked

    private void jcmbSortParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbSortParActionPerformed
        order = (String) jcmbSortPar.getSelectedItem();
        Afficher();
    }//GEN-LAST:event_jcmbSortParActionPerformed

    private void jcmbDonneurIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDonneurIDActionPerformed
        if(jcmbDonneurID.getSelectedItem()!=null){
        int id = Integer.parseInt((String) jcmbDonneurID.getSelectedItem());
        txtDonneurIDStock1.setText(id+"");}
    }//GEN-LAST:event_jcmbDonneurIDActionPerformed

    private void txtDonneurIDStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonneurIDStock1ActionPerformed
        checkDonneur();
    }//GEN-LAST:event_txtDonneurIDStock1ActionPerformed

    private void txtDonneurIDStock1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDonneurIDStock1FocusLost
        checkDonneur();
    }//GEN-LAST:event_txtDonneurIDStock1FocusLost

    private void btnDonnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonnerActionPerformed
        
                jcmbDonataireID.removeAllItems();
                int i=0;
        if(tableStockSang.getSelectedRow() != -1){
            row = tableStockSang.getSelectedRow();
            pocheNum = (int) tableStockSang.getValueAt(row, 0);
            String typeSangDonneur = (String) tableStockSang.getValueAt(row, 2);
            try {
                PreparedStatement ps = conn.prepareStatement("select * from Donataire where DonataireTypeSang=?");
                ps.setString(1, typeSangDonneur);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    jcmbDonataireID.addItem(rs.getInt(1)+"");
                    jLabel7.setText("Donner Poche "+pocheNum+" à:");
                    Donner_A_Frame.setVisible(true);
                    i++;
                }
                if(i==0){
                    JOptionPane.showMessageDialog(null, "y a pas des donataire avec le meme type du sang");
                }
            } catch (SQLException ex) {
                Logger.getLogger(StockSangView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDonnerActionPerformed

    private void btnMinimize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize3MouseClicked
        Donner_A_Frame.setState(Donner_A_Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimize3MouseClicked

    private void btnMinimize3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize3MouseEntered
        btnMinimize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MinimzeHover.png")));
    }//GEN-LAST:event_btnMinimize3MouseEntered

    private void btnMinimize3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimize3MouseExited
        btnMinimize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Minimze.png")));
    }//GEN-LAST:event_btnMinimize3MouseExited

    private void btnClose3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose3MouseClicked
        Donner_A_Frame.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_btnClose3MouseClicked

    private void btnClose3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose3MouseEntered
        btnClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CloseHover.png")));
    }//GEN-LAST:event_btnClose3MouseEntered

    private void btnClose3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClose3MouseExited
        btnClose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Closee.png")));
    }//GEN-LAST:event_btnClose3MouseExited

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        Donner_A_Frame.setLocation(x - mousePX, y-mousePY);
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        mousePX = evt.getX();
        mousePY = evt.getY();
    }//GEN-LAST:event_jLabel6MousePressed

    private void ClosePanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosePanel3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_ClosePanel3MouseDragged

    private void ClosePanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosePanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClosePanel3MousePressed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        Donner_A_Frame.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        int DonataireID = Integer.parseInt((String) jcmbDonataireID.getSelectedItem());
        String hopital = txtDetail_Hopital.getText();
        int quantityDonner = Integer.parseInt(txtQuantiteDonner.getText());
        java.sql.Date date = java.sql.Date.valueOf(txtDateDonner.getText());
        int quantity;
        try {
            PreparedStatement ps = conn.prepareStatement("select quantityDisponible from stockSang where PocheNum=?");
            ps.setInt(1, pocheNum);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                quantity = rs.getInt(1) - quantityDonner;
                if(quantity>0){
                    PreparedStatement ps2 = conn.prepareStatement("update StockSang set quantityDisponible=? where PocheNum=?");
                    ps2.setInt(1, quantity);
                    ps2.setInt(2, pocheNum);
                    ps2.executeUpdate();
                    ps2.close();
                    PreparedStatement ps3 = conn.prepareStatement("insert into DetailsDonation values(seq_DonationNum.nextval,?,?,?,?,?)");
                    ps3.setInt(1, pocheNum);
                    ps3.setInt(2, DonataireID);
                    ps3.setString(3, hopital);
                    ps3.setDate(4, date);
                    ps3.setInt(5, quantityDonner);
                    ps3.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Donation a fait avec succes");
                    ps3.close();
                }else if(quantity==0){
                    PreparedStatement ps2 = conn.prepareStatement("delete from stockSang where PocheNum=?");
                    ps2.setInt(1, pocheNum);
                    ps2.executeUpdate();
                    ps2.close();
                    PreparedStatement ps3 = conn.prepareStatement("insert into DetailsDonation values(seq_DonationNum.nextval,?,?,?,?,?)");
                    ps3.setInt(1, pocheNum);
                    ps3.setInt(2, DonataireID);
                    ps3.setString(3, hopital);
                    ps3.setDate(4, date);
                    ps3.setInt(5, quantityDonner);
                    ps3.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Donation a fait avec succes");
                    ps3.close();
                }else{
                    JOptionPane.showMessageDialog(null, "Impossible, quantite disponible est: "+rs.getInt(1));
                }
                Afficher();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockSangView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void txtDetail_HopitalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDetail_HopitalFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetail_HopitalFocusLost

    private void txtDetail_HopitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetail_HopitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetail_HopitalActionPerformed

    private void txtDateDonnerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateDonnerKeyPressed
        labelDateFormat.setVisible(true);
    }//GEN-LAST:event_txtDateDonnerKeyPressed

    private void txtQuantiteDonnerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantiteDonnerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantiteDonnerKeyPressed


   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AfficherTous;
    private javax.swing.JPanel ClosePanel2;
    private javax.swing.JPanel ClosePanel3;
    private javax.swing.JFrame Donner_A_Frame;
    private javax.swing.JLabel ShowSearch;
    private javax.swing.JFrame ajouterAuStock;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel bodyPanel1;
    private rojeru_san.RSButton btnAjouterAuStock;
    private rojeru_san.RSButtonRiple btnBack;
    private rojeru_san.RSButtonRiple btnBack1;
    private javax.swing.JLabel btnClose2;
    private javax.swing.JLabel btnClose3;
    private rojeru_san.RSButton btnDonner;
    private rojeru_san.RSButton btnFirst;
    private rojeru_san.RSButton btnLast;
    private javax.swing.JLabel btnMinimize2;
    private javax.swing.JLabel btnMinimize3;
    private rojeru_san.RSButton btnModifierStock;
    private rojeru_san.RSButton btnNext;
    private rojeru_san.RSButton btnPrevious;
    private javax.swing.JLabel btnSearchInput;
    private javax.swing.JLabel btnSearchInput1;
    private rojeru_san.RSButtonRiple btnSubmit;
    private rojeru_san.RSButtonRiple btnSubmit1;
    private rojeru_san.RSButton btnSupprimerEnStock;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel containerPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcmbDonataireID;
    private javax.swing.JComboBox jcmbDonneurID;
    private javax.swing.JComboBox jcmbSortPar;
    private javax.swing.JLabel labelDateFormat;
    private javax.swing.JPanel panelSearch;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private javax.swing.JTable tableStockSang;
    private rojeru_san.RSMTextFull txtDateDonner;
    private rojeru_san.RSMTextFull txtDetail_Hopital;
    private rojeru_san.RSMTextFull txtDonneurIDStock1;
    private rojeru_san.RSMTextFull txtGlobRouges;
    private rojeru_san.RSMTextFull txtGlobblanc;
    private rojeru_san.RSMTextFull txtPlaquttes;
    private rojeru_san.RSMTextFull txtPlasma;
    private rojeru_san.RSMTextFull txtQuantiteDonner;
    private rojeru_san.RSMTextFull txtQuantityDispoStock;
    private javax.swing.JTextField txtSearchNom;
    // End of variables declaration//GEN-END:variables
}
