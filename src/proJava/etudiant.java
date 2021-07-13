
package proJava;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class etudiant extends javax.swing.JFrame {

     // Declaration des objets
    private PreparedStatement pstm = null;
    private ResultSet rs = null;
    private Connection conn = null;
    private Statement stm;
    private final DefaultTableModel model;
    private final int ETAT = 1;
    public ImageIcon Format = null;
    
    
    public etudiant() {
        
            this.model = new DefaultTableModel();
            initComponents();
            AfficherEtudiant();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        LabelTitle = new javax.swing.JLabel();
        PanelAjouter = new javax.swing.JPanel();
        LabelMatricule = new javax.swing.JLabel();
        LabelSexe = new javax.swing.JLabel();
        LabelDateNaiss = new javax.swing.JLabel();
        LabelNom = new javax.swing.JLabel();
        LabelPrenom = new javax.swing.JLabel();
        LabelPhotoPassport = new javax.swing.JLabel();
        LabelResidence = new javax.swing.JLabel();
        LabelAnneeAcad = new javax.swing.JLabel();
        LabelFaculte = new javax.swing.JLabel();
        LabelPere = new javax.swing.JLabel();
        LabelMere = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtMatricule = new javax.swing.JTextField();
        txtPhoto = new javax.swing.JTextField();
        txtLieuResidence = new javax.swing.JTextField();
        txtAnneeAcad = new javax.swing.JTextField();
        txtPere = new javax.swing.JTextField();
        txtMere = new javax.swing.JTextField();
        ButtonAjouter = new javax.swing.JButton();
        comboSexe = new javax.swing.JComboBox();
        ButtonAttacherPhoto = new javax.swing.JButton();
        LabelLieuNaiss = new javax.swing.JLabel();
        txtLieuNaiss = new javax.swing.JTextField();
        comboFaculte = new javax.swing.JComboBox();
        ButtonSupprimer = new javax.swing.JButton();
        ButtonModifier = new javax.swing.JButton();
        txtDateNaiss = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        LabelPhoto = new javax.swing.JLabel();
        ButtonActualiser = new javax.swing.JButton();
        ScrollPaneTable = new javax.swing.JScrollPane();
        TableAffichage = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelRecherche = new javax.swing.JLabel();
        ComboRecherche = new javax.swing.JComboBox();
        txtRecherche = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelTitle.setText("ETUDIANT");

        LabelMatricule.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelMatricule.setText("Matricule:");

        LabelSexe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelSexe.setText("Sexe:");

        LabelDateNaiss.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelDateNaiss.setText("Date de naissance:");

        LabelNom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNom.setText("Nom:");

        LabelPrenom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelPrenom.setText("Prenom:");

        LabelPhotoPassport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelPhotoPassport.setText("Photo passport:");

        LabelResidence.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelResidence.setText("Lieu de residence:");

        LabelAnneeAcad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelAnneeAcad.setText("Année academique:");

        LabelFaculte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelFaculte.setText("Faculté:");

        LabelPere.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelPere.setText("Père:");

        LabelMere.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelMere.setText("Mère:");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtMatricule.setEditable(false);
        txtMatricule.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtMatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculeActionPerformed(evt);
            }
        });

        txtPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhotoActionPerformed(evt);
            }
        });

        txtLieuResidence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLieuResidenceActionPerformed(evt);
            }
        });

        txtAnneeAcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnneeAcadActionPerformed(evt);
            }
        });

        txtPere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPereActionPerformed(evt);
            }
        });

        txtMere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMereActionPerformed(evt);
            }
        });

        ButtonAjouter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proJava/icons/add.png"))); // NOI18N
        ButtonAjouter.setText("Ajouter");
        ButtonAjouter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAjouterActionPerformed(evt);
            }
        });

        comboSexe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboSexe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculin", "Feminin", "Autre" }));
        comboSexe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSexeItemStateChanged(evt);
            }
        });
        comboSexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexeActionPerformed(evt);
            }
        });

        ButtonAttacherPhoto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ButtonAttacherPhoto.setText("Upload");
        ButtonAttacherPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAttacherPhotoActionPerformed(evt);
            }
        });

        LabelLieuNaiss.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelLieuNaiss.setText("Lieu de naissance:");

        txtLieuNaiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLieuNaissActionPerformed(evt);
            }
        });

        comboFaculte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboFaculte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BST", "BBA", "Droit", "Economie", "Medecine", "Environnement" }));
        comboFaculte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFaculteActionPerformed(evt);
            }
        });

        ButtonSupprimer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proJava/icons/delete.png"))); // NOI18N
        ButtonSupprimer.setText("Supprimer");
        ButtonSupprimer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSupprimerActionPerformed(evt);
            }
        });

        ButtonModifier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proJava/icons/edit.png"))); // NOI18N
        ButtonModifier.setText("Modifier");
        ButtonModifier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModifierActionPerformed(evt);
            }
        });

        LabelPhoto.setBackground(new java.awt.Color(51, 51, 255));
        LabelPhoto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane2.setViewportView(LabelPhoto);

        javax.swing.GroupLayout PanelAjouterLayout = new javax.swing.GroupLayout(PanelAjouter);
        PanelAjouter.setLayout(PanelAjouterLayout);
        PanelAjouterLayout.setHorizontalGroup(
            PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAjouterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAjouterLayout.createSequentialGroup()
                        .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPhotoPassport)
                            .addComponent(LabelSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelDateNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAjouterLayout.createSequentialGroup()
                        .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelFaculte, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAjouterLayout.createSequentialGroup()
                                .addComponent(LabelLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAjouterLayout.createSequentialGroup()
                                .addComponent(ButtonAttacherPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelAjouterLayout.createSequentialGroup()
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAjouterLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LabelResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLieuResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAjouterLayout.createSequentialGroup()
                        .addComponent(ButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonModifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonSupprimer))
                    .addGroup(PanelAjouterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAjouterLayout.createSequentialGroup()
                                .addComponent(LabelMere, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMere, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAjouterLayout.createSequentialGroup()
                                .addComponent(LabelAnneeAcad)
                                .addGap(8, 8, 8)
                                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboFaculte, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnneeAcad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelAjouterLayout.createSequentialGroup()
                                .addComponent(LabelPere, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPere, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        PanelAjouterLayout.setVerticalGroup(
            PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAjouterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMatricule)
                    .addComponent(txtMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrenom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAjouterLayout.createSequentialGroup()
                        .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAjouterLayout.createSequentialGroup()
                                .addComponent(LabelDateNaiss)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelSexe)
                                    .addComponent(comboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addGap(13, 13, 13))
                    .addGroup(PanelAjouterLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(LabelPhotoPassport)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAttacherPhoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelResidence)
                    .addComponent(txtLieuResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAnneeAcad)
                    .addComponent(txtAnneeAcad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFaculte)
                    .addComponent(comboFaculte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPere)
                    .addComponent(txtPere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelMere, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(PanelAjouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ButtonActualiser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonActualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proJava/icons/Refresh.png"))); // NOI18N
        ButtonActualiser.setText("Actualiser");
        ButtonActualiser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualiserActionPerformed(evt);
            }
        });

        ScrollPaneTable.setBackground(new java.awt.Color(255, 204, 255));

        TableAffichage.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        TableAffichage.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TableAffichage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricule", "Nom", "Prenom", "Date de Naissance", "Sexe", "Passport", "Leiu de naissance", "Lieu de residence", "Annee academique", "Faculté", "Père", "Mère"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAffichage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAffichageMouseClicked(evt);
            }
        });
        ScrollPaneTable.setViewportView(TableAffichage);
        if (TableAffichage.getColumnModel().getColumnCount() > 0) {
            TableAffichage.getColumnModel().getColumn(0).setHeaderValue("Matricule");
            TableAffichage.getColumnModel().getColumn(1).setHeaderValue("Nom");
            TableAffichage.getColumnModel().getColumn(2).setHeaderValue("Prenom");
            TableAffichage.getColumnModel().getColumn(3).setHeaderValue("Date de Naissance");
            TableAffichage.getColumnModel().getColumn(4).setHeaderValue("Sexe");
            TableAffichage.getColumnModel().getColumn(5).setHeaderValue("Passport");
            TableAffichage.getColumnModel().getColumn(6).setHeaderValue("Leiu de naissance");
            TableAffichage.getColumnModel().getColumn(7).setHeaderValue("Lieu de residence");
            TableAffichage.getColumnModel().getColumn(8).setHeaderValue("Annee academique");
            TableAffichage.getColumnModel().getColumn(9).setHeaderValue("Faculté");
            TableAffichage.getColumnModel().getColumn(10).setHeaderValue("Père");
            TableAffichage.getColumnModel().getColumn(11).setHeaderValue("Mère");
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Liste des Etudiants");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelRecherche.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRecherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proJava/icons/data-find-icon.png"))); // NOI18N
        jLabelRecherche.setText("Recherche par");

        ComboRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matricule", "Nom", "Prenom", "Père", "Mère", "Faculté", "Sexe", "Année academique", "Date de naissance", "Lieu de naissance", "Lieu de residence", " ", " " }));

        txtRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRechercheActionPerformed(evt);
            }
        });
        txtRecherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRechercheFocusGained(evt);
            }
        });
        txtRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRechercheKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRechercheKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabelRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButtonActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(1945, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonActualiser))
                        .addGap(18, 18, 18)
                        .addComponent(ScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(934, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualiserActionPerformed
        try {
                ActualiserAffichage();
                Vider();
                
        } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Problème d'actualisation de l'affichage " + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_ButtonActualiserActionPerformed

    private void ButtonAttacherPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAttacherPhotoActionPerformed
        JFileChooser chooser = new JFileChooser();  //upload
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();  //filename = variable for photo   it can be a other kind of file for our case its foto
        txtPhoto.setText(filename);
        Image getAbsolutePath = null;
        
        ImageIcon FotoLink = new ImageIcon(filename); //filename = Link of Foto(from database or in pc)
        Image Foto = FotoLink.getImage();  //Link become  foto
        
        //modifFoto = modify foto for size i want___size of photo width= 120, height=120
        Image modifFoto = Foto.getScaledInstance(LabelPhoto.getWidth(), LabelPhoto.getHeight()
                 , Image.SCALE_SMOOTH);
        FotoLink = new ImageIcon(modifFoto);  //FotoLink not longer a Link but a Foto
        LabelPhoto.setIcon(FotoLink);  //And we show Foto here
        
    }//GEN-LAST:event_ButtonAttacherPhotoActionPerformed

    private void comboSexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexeActionPerformed

    private void comboSexeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSexeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexeItemStateChanged
    
    
    
            //=========AJOUTER============
    private void ButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAjouterActionPerformed
        // Pour ajouter dans la bd
        try {
            if( //txtMatricule.getText().equals("")   //we don't need to enter id
                txtNom.getText().equals("")
                || txtPrenom.getText().equals("")
                || txtDateNaiss.getDate().equals("")
                || comboSexe.getSelectedIndex() == -1
                || txtPhoto.getText().equals("")
                || txtLieuNaiss.getText().equals("")
                || txtLieuResidence.getText().equals("")
                || txtAnneeAcad.getText().equals("")
                || comboFaculte.getSelectedIndex() == -1
                || txtPere.getText().equals("")
                || txtMere.getText().equals("") ) {

                JOptionPane.showMessageDialog(null, "Entrer les informations completes SVP ! ");
            }else{

                conn = DbConnection.getConnection();
                
                SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
                //appliquer le format obtenue a jchooser
                String dates = sp.format(txtDateNaiss.getDate());

                pstm = conn.prepareStatement(
                    " INSERT INTO etudiant ( nom, prenom,"
                    + " dateNaissance, sexe,"
                    + " photoPassport, lieuNaissance,"
                    + " lieuResidence, anneeAcademique,"
                    + " faculte, pere,"
                    + " mere) VALUES (?,?,?,?,?,?,?,?,?,?,?); "
                );

                pstm.setString(1, txtNom.getText().toUpperCase());
                pstm.setString(2, txtPrenom.getText());
                //SimpleDateFormat datess= new SimpleDateFormat("yyyy-MM-dd");
               //pstm.setString(3, datess.format(txtDateNaiss.getDate()));
                pstm.setString(3, dates);
                pstm.setString(4, comboSexe.getSelectedItem().toString());
                pstm.setString(5, txtPhoto.getText());
                pstm.setString(6, txtLieuNaiss.getText());
                pstm.setString(7, txtLieuResidence.getText());
                pstm.setString(8, txtAnneeAcad.getText());
                pstm.setString(9, comboFaculte.getSelectedItem().toString());
                pstm.setString(10, txtPere.getText());
                pstm.setString(11, txtMere.getText());

                pstm.executeUpdate();
                pstm.close();

                ActualiserAffichage();
                JOptionPane.showConfirmDialog(null, "Enregistrement effectue avec succes !!! " );

                Vider();
            }
        }catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Probleme lors d'insertion du personnel" + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_ButtonAjouterActionPerformed

    private void txtMereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMereActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtMatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculeActionPerformed

    

        // =================AFFICHAGE=================
               
    public void AfficherEtudiant(){
    
        model.addColumn("Matricule");
        model.addColumn("Nom");
        model.addColumn("Prenom");
        model.addColumn("Date de Naissence");
        model.addColumn("Sexe");
        model.addColumn("Photo");
        model.addColumn("Lieu de Naissence");
        model.addColumn("Lieu de Residence");
        model.addColumn("Année Academique");
        model.addColumn("Faculté");
        model.addColumn("Père");
        model.addColumn("Mère");
            
        try{
         
          conn = DbConnection.getConnection();
            stm = conn.createStatement();
            String sql = "SELECT * FROM etudiant ORDER BY matricule DESC";
          
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();  //ResultSet declared up
      
            while(rs.next()){
                model.addRow(new Object[]{
                    
                    rs.getString("matricule"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("dateNaissance"),
                    rs.getString("sexe"),
                    rs.getString("photoPassport"),
                    rs.getString("lieuNaissance"),
                    rs.getString("lieuResidence"),
                    rs.getString("anneeAcademique"),
                    rs.getString("faculte"),
                    rs.getString("pere"),
                    rs.getString("mere")});
             
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        TableAffichage.setModel(model);
    
    }
      
    
    
        // ======Methode pour actualiser l'affichage======
    public void ActualiserAffichage(){
               
        try{
            model.setRowCount(0);
            conn = DbConnection.getConnection();
            stm = conn.createStatement();
            String sql = "SELECT * FROM etudiant ORDER BY matricule DESC";
          
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();  //ResultSet declared up
            
            while(rs.next()){
                model.addRow(new Object[]{
                    
                    rs.getString("matricule"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("dateNaissance"),
                    rs.getString("sexe"),
                    rs.getString("photoPassport"),
                    rs.getString("lieuNaissance"),
                    rs.getString("lieuResidence"),
                    rs.getString("anneeAcademique"),
                    rs.getString("faculte"),
                    rs.getString("pere"),
                    rs.getString("mere")});
            
            }
            
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Probleme d'actualisation d'affichage du tableau ! " + e.getLocalizedMessage());
                }
            TableAffichage.setModel(model);
            
    }
                
                //========SELECTION OF ROW============
    private void TableAffichageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAffichageMouseClicked
      
        try {
            int i = TableAffichage.getSelectedRow();
            recuprer(i);
        } catch (Exception e) {
                   JOptionPane.showConfirmDialog(null, "Problème de deplacement " + e.getLocalizedMessage());
        }
        
    }//GEN-LAST:event_TableAffichageMouseClicked

    
    private void txtLieuResidenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLieuResidenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLieuResidenceActionPerformed

    private void txtLieuNaissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLieuNaissActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLieuNaissActionPerformed

    private void comboFaculteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFaculteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFaculteActionPerformed

    private void txtPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhotoActionPerformed
    

    
            // ===========Pour modifier dans la bd==========
    private void ButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModifierActionPerformed
        
        try{

            if( txtMatricule.getText().equals("")
                || txtNom.getText().equals("")
                || txtPrenom.getText().equals("") 
                || txtDateNaiss.getDate() == null
                || comboSexe.getSelectedIndex() == -1
                || txtPhoto.getText().equals("")
                || txtLieuNaiss.getText().equals("")
                || txtLieuResidence.getText().equals("")
                || txtAnneeAcad.getText().equals("")
                || comboFaculte.getSelectedIndex() == -1
                || txtPere.getText().equals("")
                || txtMere.getText().equals("")) {

                      JOptionPane.showMessageDialog(null, "Cliquer sur une ligne dans le tableau SVP !! ");
            }else{
                
                if(JOptionPane.showConfirmDialog(null,"Voulez-vous vraiment modifier??","Modification", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
                conn = DbConnection.getConnection();
                stm = conn.createStatement(); 
                
                 SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
                //appliquer le format obtenue a jchooser
                String dates = sp.format(txtDateNaiss.getDate());
            
                String Requete = "UPDATE etudiant SET matricule =?,"
                        + " nom =?,"
                        + " prenom= ?,"
                        + " dateNaissance= ? ,"
                        + " sexe =?,"
                        + " photoPassport =?,"
                        + " lieuNaissance=?,"
                        + " lieuResidence=?,"
                        + " anneeAcademique =?,"
                        + " faculte =?,"
                        + " pere= ?,"
                        + " mere=?"
                        + " WHERE matricule ='"+txtMatricule.getText()+"' ";

               pstm=conn.prepareStatement(Requete);
               
               pstm.setString(1, txtMatricule.getText());
               pstm.setString(2, txtNom.getText());
               pstm.setString(3, txtPrenom.getText());
               //SimpleDateFormat datess= new SimpleDateFormat("yyyy-MM-dd");
               //pstm.setString(4, datess.format(txtDateNaiss.getDate()));
               
               pstm.setString(4, dates);
               pstm.setString(5, comboSexe.getSelectedItem().toString());
               pstm.setString(6, txtPhoto.getText());
               pstm.setString(7, txtLieuNaiss.getText());
               pstm.setString(8, txtLieuResidence.getText());
               pstm.setString(9, txtAnneeAcad.getText());
               pstm.setString(10, comboFaculte.getSelectedItem().toString());
               pstm.setString(11, txtPere.getText());
               pstm.setString(12, txtMere.getText());
               pstm.executeUpdate();

               ActualiserAffichage();
               JOptionPane.showConfirmDialog(null, "Modification effectuée avec succés !! ");

               Vider();
              }
             }
            }catch(HeadlessException | SQLException ex){
                          JOptionPane.showConfirmDialog(null, "Erreur de modification !! " + ex.getLocalizedMessage());
            }

            }//GEN-LAST:event_ButtonModifierActionPerformed

    
            // =============METHODER POUR SUPPRIMER ===============
    private void ButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSupprimerActionPerformed
  
        try{
                
            if( txtMatricule.getText().equals("")
                    || txtNom.getText().equals("")
                    || txtPrenom.getText().equals("")
                    || txtDateNaiss.getDate().equals("")
                    || comboSexe.getSelectedIndex() == -1
                    || txtPhoto.getText().equals("")
                    || txtLieuNaiss.getText().equals("")
                    || txtLieuResidence.getText().equals("")
                    || txtAnneeAcad.getText().equals("")
                    || comboFaculte.getSelectedIndex() == -1
                    || txtPere.getText().equals("")
                    || txtPere.getText().equals("") ) {

                    JOptionPane.showMessageDialog(null, "Cliquer sur une ligne dans le tableau SVP !! ");
            }else{

                if(JOptionPane.showConfirmDialog(null,"Voulez-vous vraiment supprimer??","Supression", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){

                    
                    
                    conn = DbConnection.getConnection();
                    stm = conn.createStatement(); 
                //  String Requete="UPDATE etudiant SET etat = '" + ETAT + "' WHERE matricule = '"+txtMatricule.getText()+"'  ";
                    stm.executeUpdate("DELETE FROM etudiant WHERE Matricule="+txtMatricule.getText());
                  
                    ActualiserAffichage();
                    JOptionPane.showConfirmDialog(null, "Suppression effectuée avec succes !! ");

                    Vider(); 
                   }
                }
       }catch(HeadlessException | SQLException ex){
                JOptionPane.showConfirmDialog(null, "Erreur de suppression !! " + ex.getLocalizedMessage());
       }  
        
    }//GEN-LAST:event_ButtonSupprimerActionPerformed

    private void txtAnneeAcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnneeAcadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnneeAcadActionPerformed

    private void txtRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRechercheActionPerformed
        //textRecherche.setText("");
    }//GEN-LAST:event_txtRechercheActionPerformed

 
   
            //=======RECHERCHE==Key==Released======
    private void txtRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRechercheKeyReleased
        try {
            if(txtRecherche.getText().equals("")){
                //JOptionPane.showMessageDialog(null, "Entrer ce que recherchez - vous SVP ! ");
            }else{
						
                DefaultTableModel md = new DefaultTableModel();
                md.setColumnIdentifiers(new String []{
                    "Matricule",
                    "Nom",
                    "Prenom",
                    "Date de naissance",
                    "Sexe",
                    "Photo",
                    "Lieu de naissance",
                    "Lieu de residence",
                    "Année academique",
                    "Faculté",
                    "Père",
                    "Mère"}); 
                
                boolean test = true;

                md.setRowCount(0);
                stm = conn.createStatement();
                rs = stm.executeQuery("SELECT * FROM etudiant WHERE "+comboRech()+" LIKE '%" +txtRecherche.getText()+"%' ");

	while(rs.next()){
            test = false;
            md.addRow(new Object[]{
                rs.getObject("matricule"),
                rs.getObject("nom"),
                rs.getObject("prenom"),
                rs.getObject("dateNaissance"),
                rs.getObject("sexe"),
                rs.getObject("photoPassport"),
                rs.getObject("lieuNaissance"),
                rs.getObject("lieuResidence"),
                rs.getObject("anneeAcademique"),
                rs.getObject("faculte"),
                rs.getObject("pere"),
                rs.getObject("mere")
                
            });
             
                
        if(test){
                JOptionPane.showConfirmDialog(null," Desolez il n' y a aucun resultat sur votre recherche, reformuler votre recherche !!!");// afficher la boite de dialogue car il y a aucun résultat
        }
                TableAffichage.setModel(md); 

        }
            }	
        } catch (HeadlessException | SQLException eaf) {
	JOptionPane.showConfirmDialog(null, "Erreur de recherche " + eaf.getLocalizedMessage());
					
        }
    }//GEN-LAST:event_txtRechercheKeyReleased

    
    
     // ===========Methode pour les combBox===========
    public String comboRech(){
            switch (ComboRecherche.getSelectedIndex()) {
                case 0: return "matricule";
                case 1: return "nom";
                case 2: return "prenom";
                case 3: return "pere";
                case 4: return "mere";
                case 5: return "faculte";
                case 6: return "sexe";
                case 7: return "anneeAcademique";
                case 8: return "dateNaissance";
                case 9: return "lieuNaissance";
                case 10: return "lieuResidence";
                
            
        }
        return "";
    }
    
    public void Vider(){
            txtMatricule.setText("");
            txtNom.setText("");
            txtPrenom.setText("");
            txtDateNaiss.setDate(null);
            //comboSexe.setText("");
            txtPhoto.setText("");
            txtLieuNaiss.setText("");
            txtLieuResidence.setText("");
            txtAnneeAcad.setText("");
            //comboFaculte.setText("");
            txtPere.setText("");
            txtMere.setText("");
            LabelPhoto.setIcon(Format);
            
    }

    private void txtRechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRechercheFocusGained
        txtRecherche.setText("");
    }//GEN-LAST:event_txtRechercheFocusGained

    private void txtRechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRechercheKeyTyped
        ActualiserAffichage();
    }//GEN-LAST:event_txtRechercheKeyTyped

    private void txtPereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPereActionPerformed

        // =======Methode pour recuperer les elements du tableau vers textFild=========
    public void recuprer(int i){
        try {
            
            DefaultTableModel model = (DefaultTableModel)TableAffichage.getModel();
            
            txtMatricule.setText(model.getValueAt(i, 0).toString());
            txtNom.setText(model.getValueAt(i, 1).toString());
            txtPrenom.setText(model.getValueAt(i, 2).toString());
            
            java.util.Date datess= new SimpleDateFormat("yyyy-mm-dd").parse((String)model.getValueAt(i,3).toString());
            txtDateNaiss.setDate(datess);
            
            comboSexe.setSelectedItem(model.getValueAt(i, 4).toString());
            
            txtPhoto.setText(model.getValueAt(i, 5).toString());  //picture link
               /////Display picture from jTable to jLabel
            if(TableAffichage.getValueAt(i, 5) != null){
                
                String img = model.getValueAt(i, 5).toString();  //img=link from jTable
                ImageIcon image1 = new ImageIcon(img);
                Image image2 = image1.getImage().getScaledInstance(LabelPhoto.getWidth(), LabelPhoto.getHeight()
                 , Image.SCALE_SMOOTH);  
                ImageIcon image3 = new ImageIcon(image2);
                LabelPhoto.setIcon(image3);
            }
            else{
                System.out.println("No Image");
            }
            /////
            txtLieuNaiss.setText(model.getValueAt(i, 6).toString());
            txtLieuResidence.setText(model.getValueAt(i, 7).toString());
            txtAnneeAcad.setText(model.getValueAt(i, 8).toString());
            comboFaculte.setSelectedItem(model.getValueAt(i, 9).toString());
            txtPere.setText(model.getValueAt(i, 10).toString());
            txtMere.setText(model.getValueAt(i, 11).toString());
            
        } catch (Exception e) {
 JOptionPane.showMessageDialog(null, "Probleme de recuperation des elements du tableau ! " + e.getLocalizedMessage());
        }
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
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualiser;
    private javax.swing.JButton ButtonAjouter;
    private javax.swing.JButton ButtonAttacherPhoto;
    private javax.swing.JButton ButtonModifier;
    private javax.swing.JButton ButtonSupprimer;
    private javax.swing.JComboBox ComboRecherche;
    private javax.swing.JLabel LabelAnneeAcad;
    private javax.swing.JLabel LabelDateNaiss;
    private javax.swing.JLabel LabelFaculte;
    private javax.swing.JLabel LabelLieuNaiss;
    private javax.swing.JLabel LabelMatricule;
    private javax.swing.JLabel LabelMere;
    private javax.swing.JLabel LabelNom;
    private javax.swing.JLabel LabelPere;
    private javax.swing.JLabel LabelPhoto;
    private javax.swing.JLabel LabelPhotoPassport;
    private javax.swing.JLabel LabelPrenom;
    private javax.swing.JLabel LabelResidence;
    private javax.swing.JLabel LabelSexe;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JPanel PanelAjouter;
    private javax.swing.JScrollPane ScrollPaneTable;
    private javax.swing.JTable TableAffichage;
    private javax.swing.JComboBox comboFaculte;
    private javax.swing.JComboBox comboSexe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelRecherche;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAnneeAcad;
    private com.toedter.calendar.JDateChooser txtDateNaiss;
    private javax.swing.JTextField txtLieuNaiss;
    private javax.swing.JTextField txtLieuResidence;
    private javax.swing.JTextField txtMatricule;
    private javax.swing.JTextField txtMere;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPere;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables
}
