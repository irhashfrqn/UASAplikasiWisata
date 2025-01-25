/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitindonesia;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static visitindonesia.HashUtils.hashPassword;


/**
 *
 * @author irhas
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public AdminForm() {
        initComponents();
        adminMainPanel.add(dataWisataPanel, "Data Wisata");
        adminMainPanel.add(tambahWisataPanel, "Tambah Wisata");
        adminMainPanel.add(dataUserPanel, "Data User");
        
        resetButtonStyles();
        dataWisataBtn.setBackground(Color.BLUE);
        dataWisataBtn.setForeground(Color.WHITE);
        
        
        addFieldListeners();
        saveWisataBtn.setEnabled(false);
        
        loadProvinsi();
        
        addTableClickListener();
        

    }
    private String selectedFotoPath = null;

    private void resetButtonStyles() {
        // Reset semua tombol ke gaya default
        dataWisataBtn.setBackground(Color.LIGHT_GRAY);
        dataWisataBtn.setForeground(Color.BLACK);
        tambahWisataBtn.setBackground(Color.LIGHT_GRAY);
        tambahWisataBtn.setForeground(Color.BLACK);
        dataUserBtn.setBackground(Color.LIGHT_GRAY);
        dataUserBtn.setForeground(Color.BLACK);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        tambahWisataBtn = new javax.swing.JButton();
        dataWisataBtn = new javax.swing.JButton();
        dataUserBtn = new javax.swing.JButton();
        adminMainPanel = new javax.swing.JPanel();
        dataWisataPanel = new javax.swing.JPanel();
        editDataWisataPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        editNamaWisata = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        editDescWisata = new javax.swing.JTextArea();
        editProvWisata = new javax.swing.JComboBox<>();
        editKabkotaWisata = new javax.swing.JTextField();
        fotoLabelEdit = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        editAlamatWisata = new javax.swing.JTextArea();
        pilihFotoBaruBtn = new javax.swing.JButton();
        saveeditWisataBtn = new javax.swing.JButton();
        pilihProvinsiEditWisata = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPaneWisataPanel = new javax.swing.JScrollPane();
        listWisataPanel = new javax.swing.JPanel();
        tambahWisataPanel = new javax.swing.JPanel();
        saveWisataBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fotoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pilihFotoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addAlamatWisata = new javax.swing.JTextArea();
        addKabkotaWisata = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addDescWisata = new javax.swing.JTextArea();
        addNamaWisata = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addProvWisata = new javax.swing.JComboBox<>();
        clearNamaWisata = new javax.swing.JButton();
        clearAlamat = new javax.swing.JButton();
        clearDeskripsiWisata = new javax.swing.JButton();
        clearKabKota = new javax.swing.JButton();
        dataUserPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listUserTable = new javax.swing.JTable();
        changeToAdminBtn = new javax.swing.JButton();
        changeToUserBtn = new javax.swing.JButton();
        blokirThisUser = new javax.swing.JButton();
        changeThisUserPasswordBtn = new javax.swing.JButton();
        selectedIDField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        selectedUsernameField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setName("loginForm"); // NOI18N
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setText("Administrator");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Visit Indonesia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 10, -1, -1));

        logoutBtn.setBackground(new java.awt.Color(255,255,255));
        logoutBtn.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 90, 30));

        tambahWisataBtn.setBackground(new java.awt.Color(255,255,255));
        tambahWisataBtn.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tambahWisataBtn.setText("+ Wisata");
        tambahWisataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahWisataBtnActionPerformed(evt);
            }
        });
        jPanel1.add(tambahWisataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, 30));

        dataWisataBtn.setBackground(new java.awt.Color(255,255,255));
        dataWisataBtn.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        dataWisataBtn.setText("Data Wisata");
        dataWisataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataWisataBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dataWisataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 30));

        dataUserBtn.setBackground(new java.awt.Color(255,255,255));
        dataUserBtn.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        dataUserBtn.setText("Data User");
        dataUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataUserBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dataUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 120, 30));

        adminMainPanel.setBackground(new java.awt.Color(255,255,255, 175));
        adminMainPanel.setPreferredSize(new java.awt.Dimension(250, 350));
        adminMainPanel.setLayout(new java.awt.CardLayout());

        dataWisataPanel.setBackground(new java.awt.Color(255, 255, 255));
        dataWisataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editDataWisataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Nama Wisata :");
        editDataWisataPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        editNamaWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editNamaWisata.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editNamaWisataFocusGained(evt);
            }
        });
        editDataWisataPanel.add(editNamaWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 230, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Deskripsi :");
        editDataWisataPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Provinsi : ");
        editDataWisataPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Kab./Kota :");
        editDataWisataPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Alamat :");
        editDataWisataPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        editDescWisata.setColumns(20);
        editDescWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editDescWisata.setRows(5);
        jScrollPane4.setViewportView(editDescWisata);

        editDataWisataPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 230, 70));

        editProvWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editProvWisata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi", "Bengkulu", "Sumatera Selatan", "Bangka Belitung", "Lampung", "DKI Jakarta", "Jawa Barat", "Banten", "Jawa Tengah", "D.I Yogyakarta", "Jawa Timur", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat", "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Kalimantan Utara", "Sulawesi Utara", "Sulawesi Tengah", "Sulawesi Selatan", "Sulawesi Barat", "Gorontalo", "Maluku", "Maluku Utara", "Papua Barat", "Papua", "Papua Tengah", "Papua Selatan", "Papua Barat Daya", "Papua Pegunungan", "Papua Utara" }));
        editDataWisataPanel.add(editProvWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 230, 30));

        editKabkotaWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editKabkotaWisata.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editKabkotaWisataFocusGained(evt);
            }
        });
        editDataWisataPanel.add(editKabkotaWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 230, 30));

        fotoLabelEdit.setText("Foto yang dipilih ditampilkan disini.");
        fotoLabelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoLabelEditMouseClicked(evt);
            }
        });
        editDataWisataPanel.add(fotoLabelEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 100));

        editAlamatWisata.setColumns(20);
        editAlamatWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editAlamatWisata.setRows(5);
        jScrollPane3.setViewportView(editAlamatWisata);

        editDataWisataPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 230, 70));

        pilihFotoBaruBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pilihFotoBaruBtn.setText("Pilih Foto...");
        pilihFotoBaruBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihFotoBaruBtnActionPerformed(evt);
            }
        });
        editDataWisataPanel.add(pilihFotoBaruBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 30));

        saveeditWisataBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveeditWisataBtn.setText("Simpan Data");
        saveeditWisataBtn.setEnabled(false);
        saveeditWisataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveeditWisataBtnActionPerformed(evt);
            }
        });
        editDataWisataPanel.add(saveeditWisataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 110, 30));

        dataWisataPanel.add(editDataWisataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 340, 450));

        pilihProvinsiEditWisata.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        pilihProvinsiEditWisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihProvinsiEditWisataActionPerformed(evt);
            }
        });
        dataWisataPanel.add(pilihProvinsiEditWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel9.setText("Pilih Provinsi");
        dataWisataPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        listWisataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPaneWisataPanel.setViewportView(listWisataPanel);

        dataWisataPanel.add(jScrollPaneWisataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 520, 390));

        adminMainPanel.add(dataWisataPanel, "card2");

        tambahWisataPanel.setBackground(new java.awt.Color(255, 255, 255));
        tambahWisataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveWisataBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saveWisataBtn.setText("Simpan Data");
        saveWisataBtn.setEnabled(false);
        saveWisataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveWisataBtnActionPerformed(evt);
            }
        });
        tambahWisataPanel.add(saveWisataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 150, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tambah Data Wisata Baru");
        tambahWisataPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fotoLabel.setText("Foto yang dipilih ditampilkan disini.");
        fotoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoLabelMouseClicked(evt);
            }
        });
        tambahWisataPanel.add(fotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 170));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        tambahWisataPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 370));

        pilihFotoBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pilihFotoBtn.setText("Pilih Foto...");
        pilihFotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihFotoBtnActionPerformed(evt);
            }
        });
        tambahWisataPanel.add(pilihFotoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 32));

        addAlamatWisata.setColumns(20);
        addAlamatWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addAlamatWisata.setRows(5);
        jScrollPane1.setViewportView(addAlamatWisata);

        tambahWisataPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 250, 70));

        addKabkotaWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addKabkotaWisata.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addKabkotaWisataFocusGained(evt);
            }
        });
        tambahWisataPanel.add(addKabkotaWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 250, 40));

        addDescWisata.setColumns(20);
        addDescWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addDescWisata.setRows(5);
        jScrollPane2.setViewportView(addDescWisata);

        tambahWisataPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 250, 80));

        addNamaWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addNamaWisata.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addNamaWisataFocusGained(evt);
            }
        });
        tambahWisataPanel.add(addNamaWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 250, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Alamat :");
        tambahWisataPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nama Wisata :");
        tambahWisataPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Deskripsi :");
        tambahWisataPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Provinsi : ");
        tambahWisataPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Kabupaten / Kota :");
        tambahWisataPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        addProvWisata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addProvWisata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi", "Bengkulu", "Sumatera Selatan", "Bangka Belitung", "Lampung", "DKI Jakarta", "Jawa Barat", "Banten", "Jawa Tengah", "D.I Yogyakarta", "Jawa Timur", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat", "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Kalimantan Utara", "Sulawesi Utara", "Sulawesi Tengah", "Sulawesi Selatan", "Sulawesi Barat", "Gorontalo", "Maluku", "Maluku Utara", "Papua Barat", "Papua", "Papua Tengah", "Papua Selatan", "Papua Barat Daya", "Papua Pegunungan", "Papua Utara" }));
        tambahWisataPanel.add(addProvWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 250, 40));

        clearNamaWisata.setText("⌫");
        clearNamaWisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearNamaWisataActionPerformed(evt);
            }
        });
        tambahWisataPanel.add(clearNamaWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 50, 40));

        clearAlamat.setText("⌫");
        clearAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAlamatActionPerformed(evt);
            }
        });
        tambahWisataPanel.add(clearAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 50, 40));

        clearDeskripsiWisata.setText("⌫");
        clearDeskripsiWisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDeskripsiWisataActionPerformed(evt);
            }
        });
        tambahWisataPanel.add(clearDeskripsiWisata, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 50, 40));

        clearKabKota.setText("⌫");
        clearKabKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearKabKotaActionPerformed(evt);
            }
        });
        tambahWisataPanel.add(clearKabKota, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 50, 40));

        adminMainPanel.add(tambahWisataPanel, "card3");

        dataUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jScrollPane5FocusLost(evt);
            }
        });

        listUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Nama Lengkap", "Role"
            }
        ));
        listUserTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                listUserTableFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(listUserTable);

        changeToAdminBtn.setText("Jadikan Admin");
        changeToAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeToAdminBtnActionPerformed(evt);
            }
        });

        changeToUserBtn.setText("Jadikan User");
        changeToUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeToUserBtnActionPerformed(evt);
            }
        });

        blokirThisUser.setText("Blokir");
        blokirThisUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blokirThisUserActionPerformed(evt);
            }
        });

        changeThisUserPasswordBtn.setText("Ubah Password");
        changeThisUserPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeThisUserPasswordBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("ID:");

        jLabel16.setText("Username:");

        jLabel17.setText("Action:");

        jLabel18.setText("Ganti Password:");

        showPasswordCheckBox.setText("Show");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });

        jLabel19.setText("Masukkan Ulang Password Baru:");

        javax.swing.GroupLayout dataUserPanelLayout = new javax.swing.GroupLayout(dataUserPanel);
        dataUserPanel.setLayout(dataUserPanelLayout);
        dataUserPanelLayout.setHorizontalGroup(
            dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataUserPanelLayout.createSequentialGroup()
                        .addGroup(dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeToUserBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataUserPanelLayout.createSequentialGroup()
                                .addComponent(showPasswordCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(changeThisUserPasswordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(dataUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2))
                            .addComponent(selectedIDField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectedUsernameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blokirThisUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dataUserPanelLayout.createSequentialGroup()
                                .addGroup(dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(changeToAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newPasswordField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20))
                    .addGroup(dataUserPanelLayout.createSequentialGroup()
                        .addGroup(dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        dataUserPanelLayout.setVerticalGroup(
            dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(dataUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(selectedIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)
                        .addComponent(selectedUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(4, 4, 4)
                        .addComponent(changeToAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeToUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blokirThisUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dataUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeThisUserPasswordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showPasswordCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        adminMainPanel.add(dataUserPanel, "card4");

        jPanel1.add(adminMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 880, 440));

        bgimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/padar-resize.jpg"))); // NOI18N
        jPanel1.add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dataUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataUserBtnActionPerformed
        CardLayout card = (CardLayout) adminMainPanel.getLayout();
        card.show(adminMainPanel, "Data User");
        resetButtonStyles();
        dataUserBtn.setBackground(Color.BLUE);
        dataUserBtn.setForeground(Color.WHITE);
        clearIDUsernameForm();
        clearNewPass();
        loadUsersToTable();// Refresh tabel
    }//GEN-LAST:event_dataUserBtnActionPerformed

    

    public class NonEditableTableModel extends DefaultTableModel {
        public NonEditableTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Semua sel tidak bisa diedit
        }
    }

    
    private void loadUsersToTable() {
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, username, nama_lengkap, lvl_user FROM users")) {

        // Membuat data dan kolom untuk tabel
        Object[] columnNames = {"ID", "Username", "Nama Lengkap", "Role"};
        Object[][] data = new Object[100][4]; // Tentukan ukuran awal yang sesuai
        int rowIndex = 0;

        while (rs.next()) {
            data[rowIndex][0] = rs.getString("ID");
            data[rowIndex][1] = rs.getString("Username");
            data[rowIndex][2] = rs.getString("Nama_Lengkap");
            String role = null;
            String role_lvl = rs.getString("lvl_user");
            if(null!=role_lvl)switch (role_lvl) {
                case "1":
                    role = "User";
                    break;
                case "2":
                    role = "Admin";
                    break;
                case "3":
                    role = "Blokir";
                    break;
                default:
                    break;
            }
            data[rowIndex][3] = role;
            rowIndex++;
        }

        // Buat tabel dengan model non-editable
        NonEditableTableModel tableModel = new NonEditableTableModel(data, columnNames);
        listUserTable.setModel(tableModel);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
    private void addTableClickListener() {
        listUserTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = listUserTable.getSelectedRow(); // Mendapatkan indeks baris yang dipilih
                if (selectedRow != -1) {
                    // Ambil data dari tabel berdasarkan baris yang dipilih
                    String selectedID = listUserTable.getValueAt(selectedRow, 0).toString(); // Kolom ke-0: ID
                    String selectedUsername = listUserTable.getValueAt(selectedRow, 1).toString(); // Kolom ke-1: Username

                    // Masukkan data ke JTextField
                    selectedIDField.setText(selectedID);
                    selectedUsernameField.setText(selectedUsername);
                }
            }
        });
    }
    
    private void clearIDUsernameForm(){
        selectedIDField.setText("");
        selectedUsernameField.setText("");
    }
    
    private void clearNewPass(){
        newPasswordField.setText("");
        confirmPasswordField.setText("");
    }


    
    private void dataWisataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataWisataBtnActionPerformed
        CardLayout card = (CardLayout) adminMainPanel.getLayout();
        card.show(adminMainPanel, "Data Wisata");
        resetButtonStyles();
        dataWisataBtn.setBackground(Color.BLUE);
        dataWisataBtn.setForeground(Color.WHITE);
        loadProvinsi();
//        loadOptionEditProvWisata();
    }//GEN-LAST:event_dataWisataBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        logout();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void logout() {
        // Hapus data sesi
        Session.setUsername(null);
        Session.setUserID(null);

        // Tutup form saat ini
        this.dispose();

        // Buka form login
        new Login().setVisible(true);
    }
    
    private void tambahWisataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahWisataBtnActionPerformed
        CardLayout card = (CardLayout) adminMainPanel.getLayout();
        card.show(adminMainPanel, "Tambah Wisata");
        resetButtonStyles();
        tambahWisataBtn.setBackground(Color.BLUE);
        tambahWisataBtn.setForeground(Color.WHITE);
        clearFormAddWisata();
    }//GEN-LAST:event_tambahWisataBtnActionPerformed

    private void pilihFotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihFotoBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Hanya file
        fileChooser.setAcceptAllFileFilterUsed(false); // Nonaktifkan semua jenis file
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Gambar (JPG, PNG)", "jpg", "jpeg", "png"));

        int returnValue = fileChooser.showOpenDialog(this); // Tampilkan file chooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            selectedFotoPath = selectedFile.getAbsolutePath(); // Simpan path file gambar

            // Tampilkan preview foto
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(selectedFotoPath)
                    .getImage()
                    .getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), Image.SCALE_SMOOTH));
            fotoLabel.setIcon(imageIcon); // Tampilkan gambar di fotoLabel
        }

    }//GEN-LAST:event_pilihFotoBtnActionPerformed

    private void addNamaWisataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addNamaWisataFocusGained
        
    }//GEN-LAST:event_addNamaWisataFocusGained

    private void addKabkotaWisataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addKabkotaWisataFocusGained
        
    }//GEN-LAST:event_addKabkotaWisataFocusGained

    private void clearNamaWisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearNamaWisataActionPerformed
        addNamaWisata.setText("");
    }//GEN-LAST:event_clearNamaWisataActionPerformed

    private void clearKabKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearKabKotaActionPerformed
        addKabkotaWisata.setText("");
    }//GEN-LAST:event_clearKabKotaActionPerformed

    private void clearDeskripsiWisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearDeskripsiWisataActionPerformed
        addDescWisata.setText("");
    }//GEN-LAST:event_clearDeskripsiWisataActionPerformed

    private void clearAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAlamatActionPerformed
        addAlamatWisata.setText("");
    }//GEN-LAST:event_clearAlamatActionPerformed

    private void saveWisataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveWisataBtnActionPerformed
        String namaWisata = addNamaWisata.getText().trim();
        String descWisata = addDescWisata.getText().trim();
        String provWisata = addProvWisata.getSelectedItem().toString(); // Jika menggunakan ComboBox
        String kabkotaWisata = addKabkotaWisata.getText().trim();
        String alamatWisata = addAlamatWisata.getText().trim();

        if (namaWisata.isEmpty() || descWisata.isEmpty() || provWisata.isEmpty() || 
            kabkotaWisata.isEmpty() || alamatWisata.isEmpty() || selectedFotoPath == null) {
            JOptionPane.showMessageDialog(this, "Harap isi semua field dan pilih foto!", "Validasi Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Salin file gambar ke folder src/images
            String targetDirectory = "src/images/";
            String fileName = new File(selectedFotoPath).getName(); // Nama file asli
            String targetPath = targetDirectory + fileName;

            // Salin file ke targetPath
            Files.copy(Paths.get(selectedFotoPath), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);

            // Simpan data ke database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
            String sql = "INSERT INTO wisata (nama_wisata, deskripsi, provinsi, kabkota, alamat, gambar) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, namaWisata);
            pstmt.setString(2, descWisata);
            pstmt.setString(3, provWisata);
            pstmt.setString(4, kabkotaWisata);
            pstmt.setString(5, alamatWisata);
            pstmt.setString(6, fileName); // Simpan nama file gambar di database

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data wisata berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Reset form
            resetForm();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data wisata: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menyimpan file gambar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveWisataBtnActionPerformed

    private void saveeditWisataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveeditWisataBtnActionPerformed
        saveEditWisata();
    }//GEN-LAST:event_saveeditWisataBtnActionPerformed

    private void editKabkotaWisataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editKabkotaWisataFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_editKabkotaWisataFocusGained

    private void editNamaWisataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editNamaWisataFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_editNamaWisataFocusGained

    private String selectedNewFotoPath = null;
    
    private void pilihFotoBaruBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihFotoBaruBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Hanya file
        fileChooser.setAcceptAllFileFilterUsed(false); // Nonaktifkan semua jenis file
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Gambar (JPG, PNG)", "jpg", "jpeg", "png"));

        int returnValue = fileChooser.showOpenDialog(this); // Tampilkan file chooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            selectedNewFotoPath = selectedFile.getAbsolutePath(); // Simpan path file gambar baru

            // Tampilkan preview gambar baru di fotoLabelEdit
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(selectedNewFotoPath)
                    .getImage()
                    .getScaledInstance(fotoLabelEdit.getWidth(), fotoLabelEdit.getHeight(), Image.SCALE_SMOOTH));
            fotoLabelEdit.setIcon(imageIcon);
        }
    }//GEN-LAST:event_pilihFotoBaruBtnActionPerformed

    private void pilihProvinsiEditWisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihProvinsiEditWisataActionPerformed
        String selectedProvinsi = (String) pilihProvinsiEditWisata.getSelectedItem();
        if (selectedProvinsi != null && !selectedProvinsi.isEmpty()) {
            loadWisataByProvinsi(selectedProvinsi);
        }
    }//GEN-LAST:event_pilihProvinsiEditWisataActionPerformed

    private void fotoLabelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoLabelEditMouseClicked
        showImageInPopup(selectedNewFotoPath);
    }//GEN-LAST:event_fotoLabelEditMouseClicked

    private void fotoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoLabelMouseClicked
        
        if(selectedFotoPath==null||selectedFotoPath==""){
            
        }else{
            showImageInPopup(selectedFotoPath);
        }
        
    }//GEN-LAST:event_fotoLabelMouseClicked

    private void listUserTableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listUserTableFocusLost
        
    }//GEN-LAST:event_listUserTableFocusLost

    private void changeToAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeToAdminBtnActionPerformed
        String selectedUsername = selectedUsernameField.getText().trim();
        String selectedID = selectedIDField.getText().trim();

        System.out.println("Selected Username: " + selectedUsername);
        System.out.println("Selected ID: " + selectedID);

        if (selectedUsername.isEmpty() || selectedID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih pengguna terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "")) {

            // Cek apakah lvl_user sudah 2
            String checkSql = "SELECT lvl_user FROM users WHERE ID = ? AND Username = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                checkStmt.setString(1, selectedID);
                checkStmt.setString(2, selectedUsername);

                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    int lvlUser = rs.getInt("lvl_user");
                    if (lvlUser == 2) {
                        JOptionPane.showMessageDialog(this, "Akun tersebut sudah admin!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Data pengguna tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Jika lvl_user belum 2, lakukan update
            String updateSql = "UPDATE users SET lvl_user = ? WHERE ID = ? AND Username = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                updateStmt.setInt(1, 2); // lvl_user = 2 (Admin)
                updateStmt.setString(2, selectedID);
                updateStmt.setString(3, selectedUsername);

                int updatedRows = updateStmt.executeUpdate();

                if (updatedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Level pengguna berhasil diubah menjadi Admin!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    clearIDUsernameForm();
                    clearNewPass();
                    loadUsersToTable();// Refresh tabel
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal mengubah level pengguna. Pastikan data yang dipilih benar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changeToAdminBtnActionPerformed

    private void jScrollPane5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jScrollPane5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane5FocusLost

    private void changeToUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeToUserBtnActionPerformed
        String selectedUsername = selectedUsernameField.getText().trim();
    String selectedID = selectedIDField.getText().trim();
    
    System.out.println("Selected Username: " + selectedUsername);
    System.out.println("Selected ID: " + selectedID);

    if (selectedUsername.isEmpty() || selectedID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Pilih pengguna terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "")) {

        // Cek apakah lvl_user sudah 1
        String checkSql = "SELECT lvl_user FROM users WHERE ID = ? AND Username = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            checkStmt.setString(1, selectedID);
            checkStmt.setString(2, selectedUsername);

            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                int lvlUser = rs.getInt("lvl_user");
                if (lvlUser == 1) {
                    JOptionPane.showMessageDialog(this, "Akun tersebut sudah User!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Data pengguna tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Jika lvl_user belum 2, lakukan update
        String updateSql = "UPDATE users SET lvl_user = ? WHERE ID = ? AND Username = ?";
        try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
            updateStmt.setInt(1, 1); // lvl_user = 2 (Admin)
            updateStmt.setString(2, selectedID);
            updateStmt.setString(3, selectedUsername);

            int updatedRows = updateStmt.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(this, "Level pengguna berhasil diubah menjadi User!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clearIDUsernameForm();
                clearNewPass();
                loadUsersToTable();// Refresh tabel
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengubah level pengguna. Pastikan data yang dipilih benar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_changeToUserBtnActionPerformed

    private void blokirThisUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blokirThisUserActionPerformed
        String selectedUsername = selectedUsernameField.getText().trim();
        String selectedID = selectedIDField.getText().trim();

        System.out.println("Selected Username: " + selectedUsername);
        System.out.println("Selected ID: " + selectedID);

        if (selectedUsername.isEmpty() || selectedID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih pengguna terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "")) {

            // Cek apakah lvl_user sudah 3
            String checkSql = "SELECT lvl_user FROM users WHERE ID = ? AND Username = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                checkStmt.setString(1, selectedID);
                checkStmt.setString(2, selectedUsername);

                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    int lvlUser = rs.getInt("lvl_user");
                    if (lvlUser == 3) {
                        JOptionPane.showMessageDialog(this, "Akun tersebut masih dalam status Blokir!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Data pengguna tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Jika lvl_user belum 2, lakukan update
            String updateSql = "UPDATE users SET lvl_user = ? WHERE ID = ? AND Username = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                updateStmt.setInt(1, 3); // lvl_user = 2 (Admin)
                updateStmt.setString(2, selectedID);
                updateStmt.setString(3, selectedUsername);

                int updatedRows = updateStmt.executeUpdate();

                if (updatedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Akun Berhasil Diblokir", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    clearIDUsernameForm();
                    clearNewPass();
                    loadUsersToTable();// Refresh tabel
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal memblokir akun", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_blokirThisUserActionPerformed

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b)); // Konversi byte ke format heksadesimal
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error while hashing password", e);
        }
    }
    
    private void changeThisUserPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeThisUserPasswordBtnActionPerformed
        String selectedUsername = selectedUsernameField.getText().trim();
        String selectedID = selectedIDField.getText().trim();
//        char[] newPassword = newPasswordField.getPassword();
//        char[] confirmPassword = confirmPasswordField.getPassword();
        String newPassword = new String(newPasswordField.getPassword());        
        String confirmPassword = new String(confirmPasswordField.getPassword());


        if (selectedUsername.isEmpty() || selectedID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih pengguna terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap masukkan password baru dan konfirmasinya!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validasi kecocokan password
        if (!String.valueOf(newPassword).equals(String.valueOf(confirmPassword))) {
            JOptionPane.showMessageDialog(this, "Password baru tidak cocok dengan konfirmasi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
             PreparedStatement stmt = conn.prepareStatement("UPDATE users SET password = ? WHERE ID = ? AND Username = ?")) {

            // Hash password menggunakan HashUtils
            String hashedPassword = hashPassword(newPassword); 
//            String hashedPassword = HashUtils.hashPassword(newPassword);
//            System.out.print(hashedPassword);
            
            stmt.setString(1, hashedPassword);
            stmt.setString(2, selectedID);
            stmt.setString(3, selectedUsername);

            int updatedRows = stmt.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(this, "Password berhasil diubah!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clearIDUsernameForm();
                clearNewPass();
                loadUsersToTable();
                
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mengubah password. Pastikan data pengguna benar.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changeThisUserPasswordBtnActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        if (showPasswordCheckBox.isSelected()) {
            newPasswordField.setEchoChar((char) 0); // Tampilkan password
            confirmPasswordField.setEchoChar((char) 0);
        } else {
            newPasswordField.setEchoChar('•'); // Sembunyikan password
            confirmPasswordField.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    
    private void loadProvinsi() {
        // Hapus semua item yang ada di JComboBox
        pilihProvinsiEditWisata.removeAllItems();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT DISTINCT provinsi FROM wisata")) {

            while (rs.next()) {
                pilihProvinsiEditWisata.addItem(rs.getString("provinsi"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    private String selectedProvinsi = null; // Menyimpan provinsi yang terakhir dipilih

    
    private void loadWisataByProvinsi(String provinsi) {
        
        selectedProvinsi = provinsi; // Simpan provinsi yang terakhir dipilih   
        listWisataPanel.removeAll(); // Hapus semua komponen di panel
        listWisataPanel.revalidate();
        listWisataPanel.repaint();
        listWisataPanel.setLayout(new BoxLayout(listWisataPanel, BoxLayout.Y_AXIS)); // Mengatur tata letak vertikal

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
             PreparedStatement stmt = conn.prepareStatement("SELECT id_wisata, nama_wisata, deskripsi, alamat, provinsi, kabkota, gambar FROM wisata WHERE provinsi = ?")) {

            stmt.setString(1, provinsi);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Ambil data dari database
                String idWisata = rs.getString("id_wisata");
                String namaWisata = rs.getString("nama_wisata");
                String deskripsi = rs.getString("deskripsi");
                String provinsiWisata = rs.getString("provinsi");
                String alamat = rs.getString("alamat");
                String kabkotaWisata = rs.getString("kabkota");
                String gambarPath = "src/images/" + rs.getString("gambar");

                // Panel utama untuk setiap wisata
                JPanel wisataPanel = new JPanel();
                wisataPanel.setLayout(new BorderLayout());
                wisataPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding luar
                wisataPanel.setBackground(Color.WHITE); // Warna latar belakang

                // Panel data (gambar, nama, deskripsi, lokasi)
                JPanel dataPanel = new JPanel();
                dataPanel.setLayout(new BorderLayout());
                dataPanel.setBackground(Color.WHITE);

                // Gambar wisata
                JLabel gambarLabel = new JLabel();
                try {
                    ImageIcon icon = new ImageIcon(gambarPath);
                    Image img = icon.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
                    gambarLabel.setIcon(new ImageIcon(img));
                    gambarLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1)); // Border gambar
                    // Tambahkan listener untuk klik gambar
                    gambarLabel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            showImageInPopup(gambarPath); // Panggil fungsi untuk menampilkan gambar penuh
                        }
                    });
                } catch (Exception e) {
                    gambarLabel.setText("Gambar tidak tersedia");
                    gambarLabel.setHorizontalAlignment(JLabel.CENTER);
                    gambarLabel.setPreferredSize(new Dimension(200, 150));
                }

                // Informasi wisata
                JPanel textPanel = new JPanel();
                textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
                textPanel.setBackground(Color.WHITE);

                JLabel namaLabel = new JLabel("<html><b>" + namaWisata + "</b></html>");
                JLabel deskripsiLabel = new JLabel("<html>" + deskripsi + "</html>");
                JLabel alamatLabel = new JLabel("<html> Alamat: " + alamat + "<html>");
                JLabel lokasiLabel = new JLabel("Provinsi: " + provinsiWisata + ", Kab/Kota: " + kabkotaWisata);

                namaLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 0));
                deskripsiLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 0));
                alamatLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 0));
                lokasiLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 0));

                textPanel.add(namaLabel);
                textPanel.add(deskripsiLabel);
                textPanel.add(alamatLabel);
                textPanel.add(lokasiLabel);


                // Tambahkan gambar dan teks ke dataPanel
                dataPanel.add(gambarLabel, BorderLayout.WEST);
                dataPanel.add(textPanel, BorderLayout.CENTER);

                // Panel tombol
                JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                buttonPanel.setBackground(Color.WHITE);

                JButton editButton = new JButton("Edit");
                JButton hapusButton = new JButton("Hapus");

                buttonPanel.add(editButton);
                buttonPanel.add(hapusButton);

                // Tambahkan event listener untuk tombol
                editButton.addActionListener(e -> editWisata(idWisata));
                hapusButton.addActionListener(e -> deleteWisata(idWisata));

                // Tambahkan dataPanel dan buttonPanel ke wisataPanel
                wisataPanel.add(dataPanel, BorderLayout.CENTER);
                wisataPanel.add(buttonPanel, BorderLayout.SOUTH);

                // Tambahkan wisataPanel ke listWisataPanel
                listWisataPanel.add(wisataPanel);

                // Menambahkan jarak antar item
                listWisataPanel.add(Box.createVerticalStrut(10));
            }

            listWisataPanel.revalidate();
            listWisataPanel.repaint();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void showImageInPopup(String imagePath) {
        // Buat JDialog untuk popup
        JDialog imageDialog = new JDialog(this, "Gambar Wisata", true);
        imageDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Ambil ukuran layar untuk menyesuaikan ukuran dialog
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        imageDialog.setSize(screenSize);
        imageDialog.setLocationRelativeTo(null); // Posisikan dialog di tengah

        // Panel untuk menampilkan gambar
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.BLACK);

        // Tambahkan gambar ke dalam label
        JLabel imageLabel = new JLabel();
        try {
            ImageIcon icon = new ImageIcon(imagePath);
            Image img = icon.getImage().getScaledInstance(
                    screenSize.width - 50,
                    screenSize.height - 100,
                    Image.SCALE_SMOOTH
            );
            imageLabel.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            imageLabel.setText("Gambar tidak tersedia");
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            imageLabel.setForeground(Color.WHITE);
        }

        // Tombol tutup di bagian bawah
        JButton closeButton = new JButton("Tutup");
        closeButton.addActionListener(e -> imageDialog.dispose());

        // Tambahkan komponen ke dialog
        imagePanel.add(imageLabel, BorderLayout.CENTER);
        imagePanel.add(closeButton, BorderLayout.SOUTH);

        imageDialog.add(imagePanel);
        imageDialog.setVisible(true);
    }


    private void clearFormAddWisata() {
        // Reset semua field input teks
        addNamaWisata.setText("");
        addDescWisata.setText("");
        addKabkotaWisata.setText("");
        addAlamatWisata.setText("");

        // Reset pilihan di JComboBox untuk provinsi
        if (addProvWisata.getItemCount() > 0) {
            addProvWisata.setSelectedIndex(0); // Pilih item pertama
        }

        // Reset path foto yang dipilih
        selectedFotoPath = null;

        // Hapus tampilan foto pada label
        fotoLabel.setIcon(null);
        fotoLabel.setText("Tidak ada foto"); // Tampilkan teks default jika foto tidak ada
    }

    
    private void loadOptionEditProvWisata() {
        editProvWisata.removeAllItems(); // Hapus semua item di JComboBox

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT DISTINCT provinsi FROM wisata")) {

            while (rs.next()) {
                editProvWisata.addItem(rs.getString("provinsi"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat pilihan provinsi.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private String editingWisataId = null;

    private void editWisata(String idWisata) {
        
        clearFormEdit();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM wisata WHERE id_wisata = ?")) {

            stmt.setString(1, idWisata);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Ambil data dari database
                String namaWisata = rs.getString("nama_wisata");
                String deskripsi = rs.getString("deskripsi");
                String provinsi = rs.getString("provinsi");
                String kabkota = rs.getString("kabkota");
                String alamat = rs.getString("alamat");
                String gambar = rs.getString("gambar");

                // Set nilai form edit
                editNamaWisata.setText(namaWisata);
                editDescWisata.setText(deskripsi);
                editProvWisata.setSelectedItem(provinsi);
                editKabkotaWisata.setText(kabkota);
                editAlamatWisata.setText(alamat);

                // Set gambar ke fotoLabelEdit dan simpan path-nya ke selectedNewFotoPath
                selectedNewFotoPath = "src/images/" + gambar;
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(selectedNewFotoPath)
                        .getImage()
                        .getScaledInstance(fotoLabelEdit.getWidth(), fotoLabelEdit.getHeight(), Image.SCALE_SMOOTH));
                fotoLabelEdit.setIcon(imageIcon);

                // Simpan ID wisata ke variabel global
                editingWisataId = idWisata;
                saveeditWisataBtn.setEnabled(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mengambil data wisata.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void saveEditWisata() {
        // Ambil data dari form edit
        String namaWisata = editNamaWisata.getText();
        String deskripsi = editDescWisata.getText();
        String provinsi = (String) editProvWisata.getSelectedItem();
        String kabkota = editKabkotaWisata.getText();
        String alamat = editAlamatWisata.getText();

        // Pastikan gambar disalin jika ada perubahan
        String gambarBaru = null;
        if (selectedNewFotoPath != null) {
            File sourceFile = new File(selectedNewFotoPath);
            gambarBaru = sourceFile.getName(); // Nama file gambar baru

            // Salin file gambar ke folder tujuan
            File targetFile = new File("src/images/" + gambarBaru);
            try {
                Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Gagal menyimpan gambar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Update data wisata ke database
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
             PreparedStatement stmt = conn.prepareStatement(
                 "UPDATE wisata SET nama_wisata = ?, deskripsi = ?, provinsi = ?, kabkota = ?, alamat = ?, gambar = ? WHERE id_wisata = ?")) {

            stmt.setString(1, namaWisata);
            stmt.setString(2, deskripsi);
            stmt.setString(3, provinsi);
            stmt.setString(4, kabkota);
            stmt.setString(5, alamat);

            // Simpan nama file gambar ke database
            if (gambarBaru != null) {
                stmt.setString(6, gambarBaru);
            } else {
                stmt.setString(6, null); // Jika tidak ada gambar baru, kosongkan kolom gambar
            }

            stmt.setString(7, editingWisataId); // Gunakan ID wisata yang sedang diedit

            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Data wisata berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clearFormEdit();
                loadWisataByProvinsi(selectedProvinsi);
                loadProvinsi();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal memperbarui data wisata.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menyimpan perubahan.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearFormEdit() {
        // Kosongkan semua field teks
        editNamaWisata.setText("");
        editDescWisata.setText("");
        editProvWisata.setSelectedIndex(0); // Set JComboBox ke pilihan pertama (default)
        editKabkotaWisata.setText("");
        editAlamatWisata.setText("");

        // Hapus gambar dari fotoLabelEdit
        fotoLabelEdit.setIcon(null);

        // Reset path gambar
        selectedNewFotoPath = null;
    }


    
    private void deleteWisata(String idWisata) {
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data wisata ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM wisata WHERE id_wisata = ?")) {

                stmt.setString(1, idWisata);
                int rowsDeleted = stmt.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Data wisata berhasil dihapus.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    // Refresh daftar wisata dengan provinsi yang terakhir dipilih
                    if (selectedProvinsi != null) {
                        loadWisataByProvinsi(selectedProvinsi);
                        loadProvinsi();
                        clearFormEdit();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Data wisata gagal dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data wisata.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



        
        
    /**
     * @param args the command line arguments
     */
    
    // Fungsi untuk memeriksa apakah semua field sudah diisi
    private void validateFields() {
        if (!addNamaWisata.getText().trim().isEmpty() &&
            !addDescWisata.getText().trim().isEmpty() &&
            !addKabkotaWisata.getText().trim().isEmpty() &&
            !addAlamatWisata.getText().trim().isEmpty()) {
            saveWisataBtn.setEnabled(true);
        } else {
            saveWisataBtn.setEnabled(false);
        }
    }

    // Tambahkan listener ke semua field
    private void addFieldListeners() {
        // Listener untuk addNamaWisata
        addNamaWisata.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
        });

        // Listener untuk addDescWisata
        addDescWisata.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
        });

        // Listener untuk addKabkotaWisata
        addKabkotaWisata.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
        });

        // Listener untuk addAlamatWisata
        addAlamatWisata.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
            public void changedUpdate(javax.swing.event.DocumentEvent e) { validateFields(); }
        });
    }
    
    
    private void resetForm() {
        addNamaWisata.setText("");
        addDescWisata.setText("");
        addKabkotaWisata.setText("");
        addAlamatWisata.setText("");
        addProvWisata.setSelectedIndex(0); // Reset ComboBox
        selectedFotoPath = null;
        fotoLabel.setIcon(null); // Hapus preview foto
    }



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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addAlamatWisata;
    private javax.swing.JTextArea addDescWisata;
    private javax.swing.JTextField addKabkotaWisata;
    private javax.swing.JTextField addNamaWisata;
    private javax.swing.JComboBox<String> addProvWisata;
    private javax.swing.JPanel adminMainPanel;
    private javax.swing.JLabel bgimage;
    private javax.swing.JButton blokirThisUser;
    private javax.swing.JButton changeThisUserPasswordBtn;
    private javax.swing.JButton changeToAdminBtn;
    private javax.swing.JButton changeToUserBtn;
    private javax.swing.JButton clearAlamat;
    private javax.swing.JButton clearDeskripsiWisata;
    private javax.swing.JButton clearKabKota;
    private javax.swing.JButton clearNamaWisata;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JButton dataUserBtn;
    private javax.swing.JPanel dataUserPanel;
    private javax.swing.JButton dataWisataBtn;
    private javax.swing.JPanel dataWisataPanel;
    private javax.swing.JTextArea editAlamatWisata;
    private javax.swing.JPanel editDataWisataPanel;
    private javax.swing.JTextArea editDescWisata;
    private javax.swing.JTextField editKabkotaWisata;
    private javax.swing.JTextField editNamaWisata;
    private javax.swing.JComboBox<String> editProvWisata;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JLabel fotoLabelEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneWisataPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable listUserTable;
    private javax.swing.JPanel listWisataPanel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JButton pilihFotoBaruBtn;
    private javax.swing.JButton pilihFotoBtn;
    private javax.swing.JComboBox<String> pilihProvinsiEditWisata;
    private javax.swing.JButton saveWisataBtn;
    private javax.swing.JButton saveeditWisataBtn;
    private javax.swing.JTextField selectedIDField;
    private javax.swing.JTextField selectedUsernameField;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JButton tambahWisataBtn;
    private javax.swing.JPanel tambahWisataPanel;
    // End of variables declaration//GEN-END:variables
}
