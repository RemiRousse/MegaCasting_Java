/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting;

/**
 *
 * @author Mousse
 */
public class jPanelOffre extends javax.swing.JPanel {

    /**
     * Creates new form jPanelOffre
     */
    public jPanelOffre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOffre_list = new javax.swing.JPanel();
        scrollPanelOffre_list = new javax.swing.JScrollPane();
        tableOffre_list = new javax.swing.JTable();
        panelOffre_form = new javax.swing.JPanel();
        labelOffre_reference = new javax.swing.JLabel();
        textFieldOffre_reference = new javax.swing.JTextField();
        labelOffre_libelle = new javax.swing.JLabel();
        textFieldOffre_libelle = new javax.swing.JTextField();
        labelOffre_datePublication = new javax.swing.JLabel();
        labelOffre_domaine = new javax.swing.JLabel();
        comboBoxOffre_domaine = new javax.swing.JComboBox();
        labelOffre_metier = new javax.swing.JLabel();
        comboBoxOffre_metier = new javax.swing.JComboBox();
        labelOffre_contrat = new javax.swing.JLabel();
        comboBoxOffre_contrat = new javax.swing.JComboBox();
        panelOffre_valid = new javax.swing.JPanel();
        buttonOffre_insert = new javax.swing.JButton();
        buttonOffre_update = new javax.swing.JButton();
        buttonOffre_delete = new javax.swing.JButton();

        panelOffre_list.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des offres"));

        tableOffre_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Référence", "Libellé", "Date de publication", "Domaine", "Métier", "Contrat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPanelOffre_list.setViewportView(tableOffre_list);

        javax.swing.GroupLayout panelOffre_listLayout = new javax.swing.GroupLayout(panelOffre_list);
        panelOffre_list.setLayout(panelOffre_listLayout);
        panelOffre_listLayout.setHorizontalGroup(
            panelOffre_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffre_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelOffre_list, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOffre_listLayout.setVerticalGroup(
            panelOffre_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffre_listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanelOffre_list)
                .addContainerGap())
        );

        panelOffre_form.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulaire"));

        labelOffre_reference.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOffre_reference.setText("Référence");

        labelOffre_libelle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOffre_libelle.setText("Libellé");

        labelOffre_datePublication.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOffre_datePublication.setText("Date de publication");

        labelOffre_domaine.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOffre_domaine.setText("Domaine");

        comboBoxOffre_domaine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelOffre_metier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOffre_metier.setText("Métier");

        comboBoxOffre_metier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelOffre_contrat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelOffre_contrat.setText("Contrat");

        comboBoxOffre_contrat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelOffre_formLayout = new javax.swing.GroupLayout(panelOffre_form);
        panelOffre_form.setLayout(panelOffre_formLayout);
        panelOffre_formLayout.setHorizontalGroup(
            panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffre_formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelOffre_formLayout.createSequentialGroup()
                        .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOffre_reference, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOffre_libelle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOffre_datePublication, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOffre_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldOffre_reference, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(textFieldOffre_libelle, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(comboBoxOffre_domaine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelOffre_formLayout.createSequentialGroup()
                        .addComponent(labelOffre_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxOffre_metier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelOffre_formLayout.createSequentialGroup()
                        .addComponent(labelOffre_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxOffre_contrat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOffre_formLayout.setVerticalGroup(
            panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffre_formLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldOffre_reference, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOffre_reference))
                .addGap(27, 27, 27)
                .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOffre_libelle)
                    .addComponent(textFieldOffre_libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(labelOffre_datePublication)
                .addGap(34, 34, 34)
                .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOffre_domaine)
                    .addComponent(comboBoxOffre_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOffre_metier)
                    .addComponent(comboBoxOffre_metier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelOffre_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOffre_contrat)
                    .addComponent(comboBoxOffre_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        panelOffre_valid.setBorder(javax.swing.BorderFactory.createTitledBorder("Valider"));

        buttonOffre_insert.setLabel("Ajouter");
        buttonOffre_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOffre_insertActionPerformed(evt);
            }
        });

        buttonOffre_update.setLabel("Modifier");

        buttonOffre_delete.setLabel("Supprimer");

        javax.swing.GroupLayout panelOffre_validLayout = new javax.swing.GroupLayout(panelOffre_valid);
        panelOffre_valid.setLayout(panelOffre_validLayout);
        panelOffre_validLayout.setHorizontalGroup(
            panelOffre_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffre_validLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonOffre_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonOffre_update, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonOffre_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelOffre_validLayout.setVerticalGroup(
            panelOffre_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOffre_validLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOffre_validLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonOffre_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonOffre_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonOffre_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelOffre_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOffre_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOffre_valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelOffre_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOffre_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelOffre_valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOffre_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOffre_insertActionPerformed
        // TODO add your handling code here:
        
        
        jFrameOffreDetails detailsOffre = new jFrameOffreDetails();
        detailsOffre.setVisible(true);
        
        
    }//GEN-LAST:event_buttonOffre_insertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOffre_delete;
    private javax.swing.JButton buttonOffre_insert;
    private javax.swing.JButton buttonOffre_update;
    private javax.swing.JComboBox<String> comboBoxOffre_contrat;
    private javax.swing.JComboBox<String> comboBoxOffre_domaine;
    private javax.swing.JComboBox<String> comboBoxOffre_metier;
    private javax.swing.JLabel labelOffre_contrat;
    private javax.swing.JLabel labelOffre_datePublication;
    private javax.swing.JLabel labelOffre_domaine;
    private javax.swing.JLabel labelOffre_libelle;
    private javax.swing.JLabel labelOffre_metier;
    private javax.swing.JLabel labelOffre_reference;
    private javax.swing.JPanel panelOffre_form;
    private javax.swing.JPanel panelOffre_list;
    private javax.swing.JPanel panelOffre_valid;
    private javax.swing.JScrollPane scrollPanelOffre_list;
    private javax.swing.JTable tableOffre_list;
    private javax.swing.JTextField textFieldOffre_libelle;
    private javax.swing.JTextField textFieldOffre_reference;
    // End of variables declaration//GEN-END:variables
}
