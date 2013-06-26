/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import javax.swing.JOptionPane;

public class Chilliliste extends javax.swing.JDialog {

    private Einloggen parentForm;
    Zusatzinformation ZusatzFrame;
    Ereignisse EreignisFrame;
    Neu NeuFrame;
     /**
     * Creates new form Chilliliste
     */
    public Chilliliste(Einloggen parent) {
        this.parentForm=parent;
        setIconImage(getToolkit().getImage("Icon.png"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TblChilli = new javax.swing.JTable();
        PanListe = new javax.swing.JPanel();
        TxtSuche = new javax.swing.JTextField();
        BtnSuche = new javax.swing.JButton();
        BtnInfo = new javax.swing.JButton();
        BtnNew = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();
        BtnErignisse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Chilliliste");
        setMinimumSize(null);
        setName("Chilliliste"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TblChilli.setAutoCreateRowSorter(true);
        TblChilli.setModel(new javax.swing.table.DefaultTableModel(
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
                "Chilliname", "Gattung", "Schärfe", "Aussaat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblChilli);

        PanListe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TxtSuche.setText("Suche...");

        BtnSuche.setText("Suche");

        BtnInfo.setText("Zusatzinformation");
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });

        BtnNew.setText("Neuer Eintrag anlegen");
        BtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewActionPerformed(evt);
            }
        });

        BtnLogout.setText("Ausloggen");
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanListeLayout = new javax.swing.GroupLayout(PanListe);
        PanListe.setLayout(PanListeLayout);
        PanListeLayout.setHorizontalGroup(
            PanListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanListeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtSuche, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnSuche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanListeLayout.setVerticalGroup(
            PanListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanListeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanListeLayout.createSequentialGroup()
                        .addGroup(PanListeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnInfo)
                            .addComponent(TxtSuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnNew))
                    .addComponent(BtnSuche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        BtnErignisse.setText("Ereignisse");
        BtnErignisse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnErignisseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanListe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnErignisse, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnErignisse)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean AskClosing()
    {
    int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Alle nicht gespeicherten Änderungen gehen verloren", "Warnung",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
    if(showConfirmDialog==0) {return true;}
    else {return false;}
    }
    
    
    private void CleanClose()
    {
    this.dispose();
    this.parentForm.ChilliFrame=null; // because dispose
    this.parentForm.Callback();
    }
    
    public boolean showConfirmDialog(String framename)
    {
    int showConfirmDialogZusatz = JOptionPane.showConfirmDialog(this, "Das Fenster \""+framename+"\" ist noch geöffnet\nAlle nicht gespeicherten Änderungen gehen verloren", "Warnung",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
    if(showConfirmDialogZusatz==0){return true;} 
    else {return false;}
        
    }
    
    public void SetEditable(boolean state)
    {
    this.BtnErignisse.setEnabled(state);
    this.BtnInfo.setEnabled(state);
    this.BtnLogout.setEnabled(state);
    this.BtnNew.setEnabled(state);
    this.BtnSuche.setEnabled(state);
    this.TblChilli.setEnabled(state);
    this.TxtSuche.setEnabled(state);
    }
    
    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
    this.CleanClose();
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
    this.ZusatzFrame = new Zusatzinformation(this);
    this.SetEditable(false);
    this.ZusatzFrame.setVisible(true);
    }//GEN-LAST:event_BtnInfoActionPerformed

    private void BtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewActionPerformed
    this.NeuFrame = new Neu(this);
    this.SetEditable(false);
    this.NeuFrame.setVisible(true);
    
    }//GEN-LAST:event_BtnNewActionPerformed

    private void BtnErignisseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnErignisseActionPerformed
    this.EreignisFrame = new Ereignisse(this);
    this.SetEditable(false);
    this.EreignisFrame.setVisible(true);
    }//GEN-LAST:event_BtnErignisseActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if(this.ZusatzFrame!=null) // if Zusatzrame is open
        {
        if(this.showConfirmDialog("Zusatzinformation"))
           {this.ZusatzFrame.CleanClose();} 
        else {return;}
        }
        
    if(this.NeuFrame!=null) // if NeuFrame is open  
        {
        if(this.showConfirmDialog("Neu"))
           {this.NeuFrame.CleanClose();}
        else {return;}
        }
    
    if(this.EreignisFrame!=null) // if ErignisFrame is open
        {
         if(this.EreignisFrame.DüngerForm!=null)
            {
            if(this.showConfirmDialog("Neuer Dünger"))
                {
                this.EreignisFrame.DüngerForm.CleanClose();    
                this.EreignisFrame.CleanClose();
                }
            else {return;}
            }          
        else
            {
            if(this.showConfirmDialog("Ereignisse"))
                {this.EreignisFrame.CleanClose();}
            else {return;}            
            }
        } 
    
    // Close this Window
    this.CleanClose();
    }//GEN-LAST:event_formWindowClosing

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnErignisse;
    private javax.swing.JButton BtnInfo;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnNew;
    private javax.swing.JButton BtnSuche;
    private javax.swing.JPanel PanListe;
    private javax.swing.JTable TblChilli;
    private javax.swing.JTextField TxtSuche;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}