
package planifticateur.gui;
import com.sun.glass.ui.Screen;
import planifticateur.domain.HoraireController;
import planifticateur.domain.ImageExporter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Vector;
import javafx.scene.control.RadioButton;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.Icon;
import javax.swing.JFrame;

public class MainWindow extends javax.swing.JFrame {
    public HoraireController horaireController;
    public Statistiques statFenetre;
    private SessionChooser sessionChooser;
    public Note fenetreNote;
    public AjoutActivite fenetreAjouterActivite;
    private Modifications fenetreModification;
    public Dimension initialDimension;
    public Point validActivitePoint;
    public Point initialActivitePoint;
    public Point delta;
    String filePath;
    private boolean horaireEstCharge;
    Vector<String> messagesDerreurs;
    private int activiteList;
    private ImageExporter exporter;
    private int scrolly = 15;
    private int indexEtiquette = 0;
    private String[] nomEtiquette = {"code","nom","type","prof"};
    
    public MainWindow() {
        int width = (int) ((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width));
        int height = (int)((java.awt.Toolkit.getDefaultToolkit().getScreenSize().height));
        initialDimension = new Dimension(width, height);
        setPreferredSize(initialDimension);
        horaireEstCharge=false;
        horaireController = new HoraireController();
        statFenetre = new Statistiques();
        sessionChooser = new SessionChooser();
        exporter= new ImageExporter ();
        fenetreNote = new Note();
        messagesDerreurs = new Vector<String>() ;
        initComponents();
        drawingPanelContainer.getVerticalScrollBar().setUnitIncrement(8);     
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        drawingPanelContainer = new javax.swing.JScrollPane();
        drawingPanel = new planifticateur.gui.DrawingPanel(this);
        buttonPanel = new javax.swing.JPanel();
        planificationAutomatiqueButton = new javax.swing.JButton();
        statistiquesButton = new javax.swing.JButton();
        Icon noteIcon = new ImageIcon("icon_note.png");
        noteButton = new javax.swing.JButton(noteIcon);
        validationAutoCheckBox = new javax.swing.JCheckBox();
        ouvrirFichierButton = new javax.swing.JButton();
        nouveauFichierButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        saveAsButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        aideButton = new javax.swing.JButton();
        titreFichierLabel = new javax.swing.JLabel();
        ajouterActiviteButton = new javax.swing.JButton();
        filtreActiviteButton = new javax.swing.JButton();
        logPanel = new javax.swing.JPanel();
        logMsgTextArea = new javax.swing.JTextArea();
        infoActiviteTextArea = new javax.swing.JTextArea();
        topMenuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuFileOpen = new javax.swing.JMenuItem();
        menuFileNew = new javax.swing.JMenuItem();
        menuFileSave = new javax.swing.JMenuItem();
        menuFileSaveAs = new javax.swing.JMenuItem();
        menuFileQuit = new javax.swing.JMenuItem();
        menuExport = new javax.swing.JMenu();
        menuExportCopy = new javax.swing.JMenuItem();
        menuExportPic = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuHelpWindow = new javax.swing.JMenuItem();
        menuHelpAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PlanIFTicateur");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName("mainWindow"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        mainPanel.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        drawingPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        drawingPanelContainer.setAutoscrolls(true);
        drawingPanelContainer.setPreferredSize(new Dimension(this.mainPanel.getWidth(), this.mainPanel.getHeight()*4/6));

        drawingPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawingPanel.setPreferredSize(new Dimension(this.drawingPanelContainer.getWidth(), drawingPanel.getInitialDimension().height));
        drawingPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingPanelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                drawingPanelMouseMoved(evt);
            }
        });
        drawingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawingPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawingPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawingPanelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1991, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );

        drawingPanelContainer.setViewportView(drawingPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 20.0;
        mainPanel.add(drawingPanelContainer, gridBagConstraints);

        buttonPanel.setPreferredSize(new java.awt.Dimension(426, 60));
        buttonPanel.setLayout(new java.awt.GridBagLayout());

        planificationAutomatiqueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_planificationauto.png"))); // NOI18N
        planificationAutomatiqueButton.setToolTipText("Planification automatique");
        planificationAutomatiqueButton.setMaximumSize(new java.awt.Dimension(50, 50));
        planificationAutomatiqueButton.setMinimumSize(new java.awt.Dimension(50, 50));
        planificationAutomatiqueButton.setPreferredSize(new java.awt.Dimension(50, 50));
        planificationAutomatiqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planificationAutomatiqueButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(planificationAutomatiqueButton, gridBagConstraints);

        statistiquesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_stats.png"))); // NOI18N
        statistiquesButton.setToolTipText("Statistiques");
        statistiquesButton.setMaximumSize(new java.awt.Dimension(50, 50));
        statistiquesButton.setMinimumSize(new java.awt.Dimension(50, 50));
        statistiquesButton.setPreferredSize(new java.awt.Dimension(50, 50));
        statistiquesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistiquesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(statistiquesButton, gridBagConstraints);

        noteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_note.png"))); // NOI18N
        noteButton.setToolTipText("Notes");
        noteButton.setAlignmentY(0.0F);
        noteButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        noteButton.setMaximumSize(new java.awt.Dimension(50, 50));
        noteButton.setMinimumSize(new java.awt.Dimension(50, 50));
        noteButton.setPreferredSize(new java.awt.Dimension(50, 50));
        noteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(noteButton, gridBagConstraints);

        validationAutoCheckBox.setText("Validation automatique");
        validationAutoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationAutoCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        buttonPanel.add(validationAutoCheckBox, gridBagConstraints);

        ouvrirFichierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_openfile.png"))); // NOI18N
        ouvrirFichierButton.setToolTipText("Ouvrir horaire");
        ouvrirFichierButton.setMaximumSize(new java.awt.Dimension(50, 50));
        ouvrirFichierButton.setMinimumSize(new java.awt.Dimension(50, 50));
        ouvrirFichierButton.setPreferredSize(new java.awt.Dimension(50, 50));
        ouvrirFichierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouvrirFichierButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(ouvrirFichierButton, gridBagConstraints);

        nouveauFichierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_newfile.png"))); // NOI18N
        nouveauFichierButton.setToolTipText("Nouvel horaire");
        nouveauFichierButton.setMaximumSize(new java.awt.Dimension(50, 50));
        nouveauFichierButton.setMinimumSize(new java.awt.Dimension(50, 50));
        nouveauFichierButton.setPreferredSize(new java.awt.Dimension(50, 50));
        nouveauFichierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauFichierButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        buttonPanel.add(nouveauFichierButton, gridBagConstraints);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_save.png"))); // NOI18N
        saveButton.setToolTipText("Enregistrer horaire");
        saveButton.setMaximumSize(new java.awt.Dimension(50, 50));
        saveButton.setMinimumSize(new java.awt.Dimension(50, 50));
        saveButton.setPreferredSize(new java.awt.Dimension(50, 50));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(saveButton, gridBagConstraints);

        saveAsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_saveas.png"))); // NOI18N
        saveAsButton.setToolTipText("Enregistrer sous...");
        saveAsButton.setMaximumSize(new java.awt.Dimension(50, 50));
        saveAsButton.setMinimumSize(new java.awt.Dimension(50, 50));
        saveAsButton.setPreferredSize(new java.awt.Dimension(50, 50));
        saveAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(saveAsButton, gridBagConstraints);

        exportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_export.png"))); // NOI18N
        exportButton.setToolTipText("Exporter horaire en image");
        exportButton.setMaximumSize(new java.awt.Dimension(50, 50));
        exportButton.setMinimumSize(new java.awt.Dimension(50, 50));
        exportButton.setPreferredSize(new java.awt.Dimension(50, 50));
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        buttonPanel.add(exportButton, gridBagConstraints);

        aideButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_help.png"))); // NOI18N
        aideButton.setToolTipText("Aide");
        aideButton.setMaximumSize(new java.awt.Dimension(50, 50));
        aideButton.setMinimumSize(new java.awt.Dimension(50, 50));
        aideButton.setPreferredSize(new java.awt.Dimension(50, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        buttonPanel.add(aideButton, gridBagConstraints);

        titreFichierLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titreFichierLabel.setPreferredSize(new java.awt.Dimension(400, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        buttonPanel.add(titreFichierLabel, gridBagConstraints);
        titreFichierLabel.getAccessibleContext().setAccessibleName("nomFichier");

        ajouterActiviteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planifticateur/gui/icon/icon_addActivite.png"))); // NOI18N
        ajouterActiviteButton.setToolTipText("Ajouter activité");
        ajouterActiviteButton.setMaximumSize(new java.awt.Dimension(50, 50));
        ajouterActiviteButton.setMinimumSize(new java.awt.Dimension(50, 50));
        ajouterActiviteButton.setPreferredSize(new java.awt.Dimension(50, 50));
        ajouterActiviteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActiviteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        buttonPanel.add(ajouterActiviteButton, gridBagConstraints);

        filtreActiviteButton.setText(this.nomEtiquette[0]);
        filtreActiviteButton.setToolTipText("Filtre étiquettes activité");
        filtreActiviteButton.setMaximumSize(new java.awt.Dimension(70, 50));
        filtreActiviteButton.setMinimumSize(new java.awt.Dimension(70, 50));
        filtreActiviteButton.setPreferredSize(new java.awt.Dimension(70, 50));
        filtreActiviteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreActiviteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 50);
        buttonPanel.add(filtreActiviteButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        mainPanel.add(buttonPanel, gridBagConstraints);

        logMsgTextArea.setEditable(false);
        logMsgTextArea.setColumns(20);
        logMsgTextArea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logMsgTextArea.setRows(5);
        logMsgTextArea.setText("Bienvenue sur PlanIFTicateur, le gestionnaire d'horaire de session!");
        logMsgTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        logMsgTextArea.setMinimumSize(new java.awt.Dimension(20, 19));
        logMsgTextArea.setPreferredSize(new Dimension(this.initialDimension.width*3/4, this.initialDimension.height/4));

        infoActiviteTextArea.setEditable(false);
        infoActiviteTextArea.setColumns(1);
        infoActiviteTextArea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        infoActiviteTextArea.setRows(8);
        infoActiviteTextArea.setText("Informations activité survolé :");
        infoActiviteTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        infoActiviteTextArea.setMinimumSize(new java.awt.Dimension(22, 19));
        infoActiviteTextArea.setPreferredSize(new Dimension(this.initialDimension.width/4, this.initialDimension.height/4));

        javax.swing.GroupLayout logPanelLayout = new javax.swing.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPanelLayout.createSequentialGroup()
                .addComponent(logMsgTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoActiviteTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoActiviteTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logMsgTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        mainPanel.add(logPanel, gridBagConstraints);

        menuFile.setText("Fichier");

        menuFileOpen.setText("Ouvrir horaire");
        menuFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuFileOpen);

        menuFileNew.setText("Nouvel horaire");
        menuFileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileNewActionPerformed(evt);
            }
        });
        menuFile.add(menuFileNew);

        menuFileSave.setText("Enregistrer");
        menuFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileSaveActionPerformed(evt);
            }
        });
        menuFile.add(menuFileSave);

        menuFileSaveAs.setText("Enregistrer sous ...");
        menuFileSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(menuFileSaveAs);

        menuFileQuit.setText("Quitter");
        menuFileQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileQuitActionPerformed(evt);
            }
        });
        menuFile.add(menuFileQuit);

        topMenuBar.add(menuFile);

        menuExport.setText("Exporter");

        menuExportCopy.setText("Copier (Presse-papier)");
        menuExport.add(menuExportCopy);

        menuExportPic.setText("... sous forme d'image");
        menuExportPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExportPicActionPerformed(evt);
            }
        });
        menuExport.add(menuExportPic);

        topMenuBar.add(menuExport);

        menuHelp.setText("Aide");

        menuHelpWindow.setText("fenêtre Aide");
        menuHelp.add(menuHelpWindow);

        menuHelpAbout.setText("À propos ...");
        menuHelp.add(menuHelpAbout);

        topMenuBar.add(menuHelp);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 2001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1307, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void updateLogMessage(java.awt.event.MouseEvent evt)
    {
        if(horaireEstCharge)
        {
            if(messagesDerreurs.size()>0)
            {
                String txt = new String();
                for(String mess : messagesDerreurs)
                {
                    txt+= mess;
                }
               logMsgTextArea.setText(this.drawingPanel.getMainHoraire().afficherJourHeure(evt.getPoint())
                                       + "\n"+txt
                                      ); 
            }
            //affichage uniquement du jour et heure dans barre d'état
            else  logMsgTextArea.setText(this.drawingPanel.getMainHoraire().afficherJourHeure(evt.getPoint())); 
            
        } 
    }
    
    private void validationAutoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validationAutoCheckBoxActionPerformed
        horaireController.switchValidationAuto();
        drawingPanel.repaint();
    }//GEN-LAST:event_validationAutoCheckBoxActionPerformed

    private void menuFileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileNewActionPerformed
        //horaireController.nouvelHoraire("1", "A");
    }//GEN-LAST:event_menuFileNewActionPerformed

    private void drawingPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseMoved
        updateLogMessage(evt);
        if(horaireEstCharge){
           // this.logMsgTextArea.append(horaireController.mouseOverToolTipText(evt.getPoint().x, evt.getPoint().y));
            infoActiviteTextArea.setText(horaireController.mouseOverToolTipText(evt.getPoint().x, evt.getPoint().y));
            drawingPanel.repaint();
        }
    }//GEN-LAST:event_drawingPanelMouseMoved

    private void drawingPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseDragged
        //if (!horaireController.activiteResteSurPlace(evt.getPoint().x, evt.getPoint().y) && evt.getClickCount() == 2){
        Point p = new Point(0, 0);
        //Auto-scroll
        Rectangle invisibleRect = new Rectangle(evt.getPoint());
        drawingPanel.scrollRectToVisible(invisibleRect);
        //Gestion du move d'une activité
        if (!horaireController.verificationDrop(evt.getPoint().x - delta.x,evt.getPoint().y - delta.y).equals(new Point(0,0))){
            p = new Point(horaireController.verificationDrop(evt.getPoint().x - delta.x, evt.getPoint().y - delta.y));
            horaireController.moveActivite(p.x, p.y);
            this.validActivitePoint = new Point(p);
        }
        else{
            if (evt.getPoint().x - delta.x >= this.initialDimension.width*3/4){
                horaireController.moveActivite(evt.getPoint().x - delta.x, evt.getPoint().y - delta.y);
            }
        }
        //}
        updateLogMessage(evt);
        drawingPanel.repaint();
    }//GEN-LAST:event_drawingPanelMouseDragged

    private void drawingPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseReleased
        //Si la position est dans la grille horaire
        Point p = new Point(0, 0);
        Point point = new Point();
        if (horaireController.existeSelection()){
            point = new Point(evt.getPoint().x - delta.x, evt.getPoint().y - delta.y);
        }
        
        if (point != this.initialActivitePoint){
            if (horaireController.existeSelection()){
                if (!horaireController.verificationDrop(evt.getPoint().x - delta.x,evt.getPoint().y - delta.y).equals(new Point(0,0))){
                    p = new Point(horaireController.verificationDrop(evt.getPoint().x - delta.x, evt.getPoint().y - delta.y));
                    horaireController.moveActivite(p.x, p.y);
                    horaireController.setRangee(p.x, p.y);
                    horaireController.switchSelection();
                    horaireController.jourHeureToActivite();
                    horaireController.switchFromMoveToListDp();
                    horaireController.switchAPlacerToDejaPlacee();
                    horaireController.switchDejaPlaceeToAPlacer();
                    horaireController.classerListeAPlacer();
                    horaireController.initPointActivite(this.initialDimension);         
                }
                //Si la position n'est pas dans la grille ou à un endroit non valide
                else{
                    //Si la position est dans la liste
                    if (evt.getPoint().x - delta.x >= this.initialDimension.width*3/4){
                        p = new Point(horaireController.verificationDrop(evt.getPoint().x - delta.x, evt.getPoint().y - delta.y));
                        horaireController.moveActivite(p.x, p.y);
                        horaireController.setRangee(p.x, p.y);
                        horaireController.switchSelection();
                        horaireController.jourHeureToActivite();
                        horaireController.switchFromMoveToListAp();
                        horaireController.switchAPlacerToDejaPlacee();
                        horaireController.switchDejaPlaceeToAPlacer();
                        horaireController.classerListeAPlacer();
                        horaireController.initPointActivite(this.initialDimension);
                    }
                    //Si la position n'est pas valide
                    else{
                        horaireController.classerListeAPlacer();
                        if (this.activiteList == 0){
                            horaireController.switchFromMoveToListAp();
                        }
                        else{
                            horaireController.switchFromMoveToListDp();
                        }
                        horaireController.moveActivite(this.validActivitePoint.x, this.validActivitePoint.y);
                        horaireController.setRangee(this.validActivitePoint.x, this.validActivitePoint.y);
                        horaireController.switchSelection();
                        horaireController.classerListeAPlacer();
                        horaireController.initPointActivite(this.initialDimension);
                    }
                }
            statFenetre.setStats();
            
            //ajustement de la couleur de la bordure.
            }
            if(horaireEstCharge)
                {
                messagesDerreurs.removeAllElements();
                    if(horaireController.getValiditeDeLHoraire(messagesDerreurs)==true){
                        drawingPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));
                    }
                    else{
                        drawingPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));
                    }

                updateLogMessage(evt);
                }        
        }
        drawingPanel.repaint();
    }//GEN-LAST:event_drawingPanelMouseReleased

    private void drawingPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMousePressed
        horaireController.verificationSelection(evt.getPoint().x,evt.getPoint().y); 
        if (horaireController.existeSelection()){
            this.initialActivitePoint = horaireController.getActiviteSelected().getPoint();
            delta = horaireController.deltaMaker(evt.getPoint().x, evt.getPoint().y);
        }
        this.activiteList = horaireController.verificationListOfActivite(horaireController.getActiviteSelected());
        horaireController.switchFromListToMove(horaireController.getActiviteSelected());
        drawingPanel.repaint();
    }//GEN-LAST:event_drawingPanelMousePressed

    private void menuExportPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExportPicActionPerformed
    
        if(horaireEstCharge)

             exporter.exporterImage(drawingPanel, ImageExporter.IMAGE_FORMAT.JPEG,
                                    drawingPanel.getInitialDimension().width,drawingPanel.getInitialDimension().height , 
                                    System.getProperty("user.dir") +"_export.jpg"
                                    );
    }//GEN-LAST:event_menuExportPicActionPerformed

    private void noteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteButtonActionPerformed
        if (horaireEstCharge){
            fenetreNote.setLocation(this.initialDimension.width/4, this.initialDimension.height/4);
            fenetreNote.setVisible(true);
        }
    }//GEN-LAST:event_noteButtonActionPerformed

    private void statistiquesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistiquesButtonActionPerformed
        if (horaireEstCharge){
            statFenetre.setLocation(this.initialDimension.width/4, this.initialDimension.height/4);
            statFenetre.setVisible(true);
        }
    }//GEN-LAST:event_statistiquesButtonActionPerformed

    private void planificationAutomatiqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planificationAutomatiqueButtonActionPerformed
        horaireController.planificationAuto();
    }//GEN-LAST:event_planificationAutomatiqueButtonActionPerformed

    private void menuFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileOpenActionPerformed
        //Fonction permettant Ã  l'utilisateur de saisir un fichier via menu "choose from"
        //et faire un appel au contrÃ´leur afin de procÃ©der Ã  la reconstitution de l'horaire.
        JFileChooser selecteurFichier = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("COU files","cou");
        selecteurFichier.setFileFilter(filter);
        selecteurFichier.showOpenDialog(MainWindow.this);
        selecteurFichier.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Choix session
        JOptionPane fenetreJOption = new JOptionPane();
        fenetreJOption.setLocation(this.initialDimension.width/2, this.initialDimension.height/2);
        while (sessionChooser.getSession() == null){
            fenetreJOption.showMessageDialog(this, sessionChooser, "Choix de session", JOptionPane.QUESTION_MESSAGE);
        }
        //On efface ce qu'il y a en place
        //horaireController.resetHoraire();
        // On shoot le fileSelection Ã  la fonction appropriÃ© du controller
        //Larman impose un type primitif vers le controler
         filePath = selecteurFichier.getSelectedFile().getPath();
        if (!(filePath.substring(filePath.length() - 3).toLowerCase().equals("cou"))){
            logMsgTextArea.append(": " + filePath + "\n n'est pas un fichier valide.\n");
            drawingPanel.setVisible(false);
        }
        else{
            horaireController.chargerHoraire(filePath, sessionChooser.getSession());
            validationAutoCheckBox.setSelected (false);
            horaireController.setModeValidationAutoOff();
            titreFichierLabel.setText(" Nom fichier d'importation:  " + horaireController.getHoraireNom() + " (" + horaireController.getSession() + ")");
            drawingPanel.setVisible(true);
            horaireEstCharge=true;
            horaireController.initPointActivite(this.initialDimension);
            horaireController.initPointActiviteDejaPlacee(this.initialDimension);
            statFenetre.initialize(horaireController);

            horaireController.switchSelection();
            horaireController.jourHeureToActivite();
            horaireController.switchAPlacerToDejaPlacee();
            horaireController.switchDejaPlaceeToAPlacer();
            horaireController.initPointActivite(this.initialDimension);
            statFenetre.setStats();
            
            messagesDerreurs.removeAllElements();
            if(horaireController.getValiditeDeLHoraire(messagesDerreurs)==true){
                drawingPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));
            }
            else{
                drawingPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));
            }
                
            drawingPanel.repaint();
        }
    }//GEN-LAST:event_menuFileOpenActionPerformed

    private void menuFileQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFileQuitActionPerformed

    private void drawingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseClicked
        if (horaireEstCharge){
            if (evt.getClickCount() == 2){
                horaireController.verificationSelection(evt.getPoint().x, evt.getPoint().y);
                if (horaireController.existeSelection()){
                    fenetreModification = new Modifications(this.horaireController);
                    fenetreModification.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_drawingPanelMouseClicked

    private void menuFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileSaveActionPerformed
       if(horaireEstCharge)
           horaireController.enregistrerHoraire(filePath);
    }//GEN-LAST:event_menuFileSaveActionPerformed

    private void menuFileSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileSaveAsActionPerformed

        if(horaireEstCharge)
        {
            JFileChooser selecteurFichier = new JFileChooser();
            
            selecteurFichier.setApproveButtonText("Enregistrer");
            selecteurFichier.setApproveButtonMnemonic('a');
            selecteurFichier.setApproveButtonToolTipText("Enregistrer le fichier");
            selecteurFichier.setDialogTitle("Enregistrer");
    
            FileNameExtensionFilter filter = new FileNameExtensionFilter("COU files","cou");
            selecteurFichier.setFileFilter(filter);
            selecteurFichier.showOpenDialog(MainWindow.this);

            
            selecteurFichier.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            if(selecteurFichier.getSelectedFile().getPath().contains(".cou") ) horaireController.enregistrerHoraire(selecteurFichier.getSelectedFile().getPath() );
            else horaireController.enregistrerHoraire(selecteurFichier.getSelectedFile().getPath() + ".cou");
        }  
    }//GEN-LAST:event_menuFileSaveAsActionPerformed

    private void ouvrirFichierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouvrirFichierButtonActionPerformed
        //Identique à ouvrirFichier dans onglet fichier
        JFileChooser selecteurFichier = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("COU files","cou");
        selecteurFichier.setFileFilter(filter);
        selecteurFichier.showOpenDialog(MainWindow.this);
        selecteurFichier.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Choix session
        JOptionPane fenetreJOption = new JOptionPane();
        fenetreJOption.setLocation(this.initialDimension.width/2, this.initialDimension.height/2);
        while (sessionChooser.getSession() == null){
            fenetreJOption.showMessageDialog(this, sessionChooser, "Choix de session", JOptionPane.QUESTION_MESSAGE);
        }
        //On efface ce qu'il y a en place
        //horaireController.resetHoraire();
        // On shoot le fileSelection Ã  la fonction appropriÃ© du controller
        //Larman impose un type primitif vers le controler
        filePath = selecteurFichier.getSelectedFile().getPath();
        if (!(filePath.substring(filePath.length() - 3).toLowerCase().equals("cou"))){
            logMsgTextArea.append(": " + filePath + "\n n'est pas un fichier valide.\n");
            drawingPanel.setVisible(false);
        }
        else{
            horaireController.chargerHoraire(filePath, sessionChooser.getSession());
            validationAutoCheckBox.setSelected (false);
            horaireController.setModeValidationAutoOff();
            titreFichierLabel.setText(" Nom fichier d'importation:  " + horaireController.getHoraireNom() + " (" + horaireController.getSession() + ")");
            drawingPanel.setVisible(true);
            horaireEstCharge=true;
            horaireController.initPointActivite(this.initialDimension);
            horaireController.initPointActiviteDejaPlacee(this.initialDimension);
            statFenetre.initialize(horaireController);

            horaireController.switchSelection();
            horaireController.jourHeureToActivite();
            horaireController.switchAPlacerToDejaPlacee();
            horaireController.switchDejaPlaceeToAPlacer();
            horaireController.initPointActivite(this.initialDimension);
            statFenetre.setStats();
            
            messagesDerreurs.removeAllElements();
            if(horaireController.getValiditeDeLHoraire(messagesDerreurs)==true){
                drawingPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 5));
            }
            else{
                drawingPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 5));
            }
                
            drawingPanel.repaint();
        }
    }//GEN-LAST:event_ouvrirFichierButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        if(horaireEstCharge)

             exporter.exporterImage(drawingPanel, ImageExporter.IMAGE_FORMAT.JPEG,
                                    drawingPanel.getInitialDimension().width,drawingPanel.getInitialDimension().height , 
                                    System.getProperty("user.dir") +"_export.jpg"
                                    );
    }//GEN-LAST:event_exportButtonActionPerformed

    private void saveAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsButtonActionPerformed
        if(horaireEstCharge)
        {
            JFileChooser selecteurFichier = new JFileChooser();
            
            selecteurFichier.setApproveButtonText("Enregistrer");
            selecteurFichier.setApproveButtonMnemonic('a');
            selecteurFichier.setApproveButtonToolTipText("Enregistrer le fichier");
            selecteurFichier.setDialogTitle("Enregistrer");
    
            FileNameExtensionFilter filter = new FileNameExtensionFilter("COU files","cou");
            selecteurFichier.setFileFilter(filter);
            selecteurFichier.showOpenDialog(MainWindow.this);

            
            selecteurFichier.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            if(selecteurFichier.getSelectedFile().getPath().contains(".cou") ) horaireController.enregistrerHoraire(selecteurFichier.getSelectedFile().getPath() );
            else horaireController.enregistrerHoraire(selecteurFichier.getSelectedFile().getPath() + ".cou");
        }
    }//GEN-LAST:event_saveAsButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(horaireEstCharge){
           horaireController.enregistrerHoraire(filePath);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        Rectangle aspectRatio = evt.getComponent().getBounds();
        int aEnlever = (aspectRatio.width*9/16)%45;
        evt.getComponent().setBounds(aspectRatio.x, aspectRatio.y, aspectRatio.width, aspectRatio.width*9/16 - aEnlever);
        this.initialDimension = new Dimension(evt.getComponent().getSize());
        drawingPanel.setInitialDimension(this.initialDimension);
        horaireController.createMouseAdapter(this.initialDimension);
        if (horaireEstCharge){
            drawingPanel.getMainHoraire().setInitialDimension(this.initialDimension);
            horaireController.initPointActivite(this.initialDimension);
            horaireController.initPointActiviteDejaPlacee(this.initialDimension);
            drawingPanel.repaint();
        }
        System.out.println(evt.getComponent().getSize());
    }//GEN-LAST:event_formComponentResized

    private void ajouterActiviteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActiviteButtonActionPerformed
        if (horaireEstCharge){
            fenetreAjouterActivite = new AjoutActivite(horaireController);
            fenetreAjouterActivite.setLocation(this.initialDimension.width/4, this.initialDimension.height/4);
            fenetreAjouterActivite.setVisible(true);
        }
    }//GEN-LAST:event_ajouterActiviteButtonActionPerformed

    private void filtreActiviteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreActiviteButtonActionPerformed
        indexEtiquette += 1;
        if (indexEtiquette > 3){
            indexEtiquette = 0;
        }
        horaireController.setEtiquette(indexEtiquette);
        filtreActiviteButton.setText(nomEtiquette[indexEtiquette]);
        drawingPanel.repaint();
    }//GEN-LAST:event_filtreActiviteButtonActionPerformed

    private void nouveauFichierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauFichierButtonActionPerformed
        //horaireController.nouvelHoraire("1", "A");
    }//GEN-LAST:event_nouveauFichierButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aideButton;
    private javax.swing.JButton ajouterActiviteButton;
    private javax.swing.JPanel buttonPanel;
    private planifticateur.gui.DrawingPanel drawingPanel;
    private javax.swing.JScrollPane drawingPanelContainer;
    private javax.swing.JButton exportButton;
    private javax.swing.JButton filtreActiviteButton;
    private javax.swing.JTextArea infoActiviteTextArea;
    private javax.swing.JTextArea logMsgTextArea;
    private javax.swing.JPanel logPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu menuExport;
    private javax.swing.JMenuItem menuExportCopy;
    private javax.swing.JMenuItem menuExportPic;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuFileNew;
    private javax.swing.JMenuItem menuFileOpen;
    private javax.swing.JMenuItem menuFileQuit;
    private javax.swing.JMenuItem menuFileSave;
    private javax.swing.JMenuItem menuFileSaveAs;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuHelpAbout;
    private javax.swing.JMenuItem menuHelpWindow;
    private javax.swing.JButton noteButton;
    private javax.swing.JButton nouveauFichierButton;
    private javax.swing.JButton ouvrirFichierButton;
    private javax.swing.JButton planificationAutomatiqueButton;
    private javax.swing.JButton saveAsButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton statistiquesButton;
    private javax.swing.JLabel titreFichierLabel;
    private javax.swing.JMenuBar topMenuBar;
    private javax.swing.JCheckBox validationAutoCheckBox;
    // End of variables declaration//GEN-END:variables
}
