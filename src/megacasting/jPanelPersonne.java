/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

/**
 *
 * @author Mousse
 */
public class jPanelPersonne extends javax.swing.JPanel {

    /**
     * Creates new form jPanelPersonne
     */
    public jPanelPersonne() {
        initComponents();
        
        tabbedPanePers.setUI(new BasicTabbedPaneUI() {

            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int horizRunCount, int maxTabHeight) {
                return 0; //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPers_sort = new javax.swing.JPanel();
        comboBoxPers_sort = new javax.swing.JComboBox();
        tabbedPanePers = new javax.swing.JTabbedPane();
        panelEmpl = new javax.swing.JPanel();
        panelEmpl_list = new javax.swing.JPanel();
        scrollPanelEmpl_list = new javax.swing.JScrollPane();
        tableEmpl_list = new javax.swing.JTable();
        panelEmpl_form = new javax.swing.JPanel();
        labelEmpl_nom = new javax.swing.JLabel();
        textFieldEmpl_nom = new javax.swing.JTextField();
        labelEmpl_prenom = new javax.swing.JLabel();
        textFieldEmpl_prenom = new javax.swing.JTextField();
        labelEmpl_poste = new javax.swing.JLabel();
        textFieldEmpl_poste = new javax.swing.JTextField();
        labelEmpl_habilitation = new javax.swing.JLabel();
        textFieldEmpl_habilitation = new javax.swing.JTextField();
        panelEmpl_valid = new javax.swing.JPanel();
        buttonEmpl_insert = new javax.swing.JButton();
        buttonEmpl_update = new javax.swing.JButton();
        buttonEmpl_delete = new javax.swing.JButton();
        panelCand = new javax.swing.JPanel();
        panelCand_list = new javax.swing.JPanel();
        scrollPanelCand_list = new javax.swing.JScrollPane();
        tableCand_list = new javax.swing.JTable();
        panelCand_form = new javax.swing.JPanel();
        labelCand_nom = new javax.swing.JLabel();
        textFieldCand_nom = new javax.swing.JTextField();
        labelCand_prenom = new javax.swing.JLabel();
        textFieldCand_prenom = new javax.swing.JTextField();
        labelCand_dateNaissance = new javax.swing.JLabel();
        labelCand_pays = new javax.swing.JLabel();
        textFieldCand_pays = new javax.swing.JTextField();
        panelCand_valid = new javax.swing.JPanel();
        buttonCand_insert = new javax.swing.JButton();
        buttonCand_update = new javax.swing.JButton();
        buttonCand_delete = new javax.swing.JButton();

        panelPers_sort.setBorder(javax.swing.BorderFactory.createTitledBorder("Tri"));

        comboBoxPers_sort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2" }));
        comboBoxPers_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPers_sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPers_sortLayout = new javax.swing.GroupLayout(panelPers_sort);
        panelPers_sort.setLayout(panelPers_sortLayout);
        panelPers_sortLayout.setHorizontalGroup(
            panelPers_sortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPers_sortLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(comboBoxPers_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPers_sortLayout.setVerticalGroup(
            panelPers_sortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPers_sortLayout.createSequentialGroup()
                .addComponent(comboBoxPers_sort, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEmpl_list.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des employés"));

        tableEmpl_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom", "Prénom", "Poste", "Habilitation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanelEmpl_list.setViewportView(tableEmpl_list);

        javax.swing.GroupLayout panelEmpl_listLayout = new javax.swing.GroupLayout(panelEmpl_list);
        panelEmpl_list.setLayout(panelEmpl_listLayout);
        panelEmpl_listLayout.setHorizontalGroup(
            panelEmpl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpl_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelEmpl_list, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEmpl_listLayout.setVerticalGroup(
            panelEmpl_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpl_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelEmpl_list)
                .addContainerGap())
        );

        panelEmpl_form.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire"));

        labelEmpl_nom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmpl_nom.setText("Nom");

        labelEmpl_prenom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmpl_prenom.setText("Prénom");

        labelEmpl_poste.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmpl_poste.setText("Poste");

        labelEmpl_habilitation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmpl_habilitation.setText("Habilitation");

        javax.swing.GroupLayout panelEmpl_formLayout = new javax.swing.GroupLayout(panelEmpl_form);
        panelEmpl_form.setLayout(panelEmpl_formLayout);
        panelEmpl_formLayout.setHorizontalGroup(
            panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpl_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmpl_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpl_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpl_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpl_habilitation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEmpl_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEmpl_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEmpl_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEmpl_habilitation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEmpl_formLayout.setVerticalGroup(
            panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpl_formLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmpl_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpl_nom))
                .addGap(27, 27, 27)
                .addGroup(panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpl_prenom)
                    .addComponent(textFieldEmpl_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmpl_poste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpl_poste))
                .addGap(31, 31, 31)
                .addGroup(panelEmpl_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmpl_habilitation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpl_habilitation))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        panelEmpl_valid.setBorder(javax.swing.BorderFactory.createTitledBorder("Valider"));

        buttonEmpl_insert.setLabel("Ajouter");

        buttonEmpl_update.setLabel("Modifier");

        buttonEmpl_delete.setLabel("Supprimer");

        javax.swing.GroupLayout panelEmpl_validLayout = new javax.swing.GroupLayout(panelEmpl_valid);
        panelEmpl_valid.setLayout(panelEmpl_validLayout);
        panelEmpl_validLayout.setHorizontalGroup(
            panelEmpl_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpl_validLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonEmpl_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEmpl_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonEmpl_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEmpl_validLayout.setVerticalGroup(
            panelEmpl_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpl_validLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpl_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEmpl_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEmpl_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEmpl_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelEmplLayout = new javax.swing.GroupLayout(panelEmpl);
        panelEmpl.setLayout(panelEmplLayout);
        panelEmplLayout.setHorizontalGroup(
            panelEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
            .addGroup(panelEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEmplLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelEmpl_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelEmpl_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelEmpl_valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        panelEmplLayout.setVerticalGroup(
            panelEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
            .addGroup(panelEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEmplLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelEmpl_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelEmplLayout.createSequentialGroup()
                            .addComponent(panelEmpl_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelEmpl_valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        tabbedPanePers.addTab("Employés", panelEmpl);

        panelCand_list.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des candidats"));

        tableCand_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom", "Prénom", "Date de naissance", "Pays"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanelCand_list.setViewportView(tableCand_list);

        javax.swing.GroupLayout panelCand_listLayout = new javax.swing.GroupLayout(panelCand_list);
        panelCand_list.setLayout(panelCand_listLayout);
        panelCand_listLayout.setHorizontalGroup(
            panelCand_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCand_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelCand_list, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCand_listLayout.setVerticalGroup(
            panelCand_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCand_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelCand_list)
                .addContainerGap())
        );

        panelCand_form.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire"));

        labelCand_nom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCand_nom.setText("Nom");

        labelCand_prenom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCand_prenom.setText("Prénom");

        labelCand_dateNaissance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCand_dateNaissance.setText("Date de naissance");

        labelCand_pays.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCand_pays.setText("Pays");

        javax.swing.GroupLayout panelCand_formLayout = new javax.swing.GroupLayout(panelCand_form);
        panelCand_form.setLayout(panelCand_formLayout);
        panelCand_formLayout.setHorizontalGroup(
            panelCand_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCand_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCand_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCand_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCand_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCand_dateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCand_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCand_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldCand_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCand_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCand_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCand_formLayout.setVerticalGroup(
            panelCand_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCand_formLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelCand_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCand_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCand_nom))
                .addGap(27, 27, 27)
                .addGroup(panelCand_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCand_prenom)
                    .addComponent(textFieldCand_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(labelCand_dateNaissance)
                .addGap(34, 34, 34)
                .addGroup(panelCand_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCand_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCand_pays))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        panelCand_valid.setBorder(javax.swing.BorderFactory.createTitledBorder("Valider"));

        buttonCand_insert.setLabel("Ajouter");

        buttonCand_update.setLabel("Modifier");

        buttonCand_delete.setLabel("Supprimer");

        javax.swing.GroupLayout panelCand_validLayout = new javax.swing.GroupLayout(panelCand_valid);
        panelCand_valid.setLayout(panelCand_validLayout);
        panelCand_validLayout.setHorizontalGroup(
            panelCand_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCand_validLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonCand_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCand_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCand_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCand_validLayout.setVerticalGroup(
            panelCand_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCand_validLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCand_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCand_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCand_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCand_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCandLayout = new javax.swing.GroupLayout(panelCand);
        panelCand.setLayout(panelCandLayout);
        panelCandLayout.setHorizontalGroup(
            panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
            .addGroup(panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCandLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelCand_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelCand_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCand_valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        panelCandLayout.setVerticalGroup(
            panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
            .addGroup(panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCandLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelCandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelCand_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCandLayout.createSequentialGroup()
                            .addComponent(panelCand_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelCand_valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        tabbedPanePers.addTab("Candidats", panelCand);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPers_sort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabbedPanePers))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPers_sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPanePers, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxPers_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPers_sortActionPerformed
        // TODO add your handling code here:
        tabbedPanePers.setSelectedIndex(comboBoxPers_sort.getSelectedIndex());
    }//GEN-LAST:event_comboBoxPers_sortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCand_delete;
    private javax.swing.JButton buttonCand_insert;
    private javax.swing.JButton buttonCand_update;
    private javax.swing.JButton buttonEmpl_delete;
    private javax.swing.JButton buttonEmpl_insert;
    private javax.swing.JButton buttonEmpl_update;
    private javax.swing.JComboBox comboBoxPers_sort;
    private javax.swing.JLabel labelCand_dateNaissance;
    private javax.swing.JLabel labelCand_nom;
    private javax.swing.JLabel labelCand_pays;
    private javax.swing.JLabel labelCand_prenom;
    private javax.swing.JLabel labelEmpl_habilitation;
    private javax.swing.JLabel labelEmpl_nom;
    private javax.swing.JLabel labelEmpl_poste;
    private javax.swing.JLabel labelEmpl_prenom;
    private javax.swing.JPanel panelCand;
    private javax.swing.JPanel panelCand_form;
    private javax.swing.JPanel panelCand_list;
    private javax.swing.JPanel panelCand_valid;
    private javax.swing.JPanel panelEmpl;
    private javax.swing.JPanel panelEmpl_form;
    private javax.swing.JPanel panelEmpl_list;
    private javax.swing.JPanel panelEmpl_valid;
    private javax.swing.JPanel panelPers_sort;
    private javax.swing.JScrollPane scrollPanelCand_list;
    private javax.swing.JScrollPane scrollPanelEmpl_list;
    private javax.swing.JTabbedPane tabbedPanePers;
    private javax.swing.JTable tableCand_list;
    private javax.swing.JTable tableEmpl_list;
    private javax.swing.JTextField textFieldCand_nom;
    private javax.swing.JTextField textFieldCand_pays;
    private javax.swing.JTextField textFieldCand_prenom;
    private javax.swing.JTextField textFieldEmpl_habilitation;
    private javax.swing.JTextField textFieldEmpl_nom;
    private javax.swing.JTextField textFieldEmpl_poste;
    private javax.swing.JTextField textFieldEmpl_prenom;
    // End of variables declaration//GEN-END:variables
}
