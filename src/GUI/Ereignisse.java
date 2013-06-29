/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.DB;
import DataStructur.DuengUndWasser;
import DataStructur.Duenger;
import DataStructur.PflanzenHoehe;
import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mn
 */
public class Ereignisse extends javax.swing.JDialog {

    private Chilliliste ParentForm;
    DüngerNeu DüngerForm;
    Object selectedSort;
    /**
     * Creates new form Eigenschaften
     */
    public Ereignisse(Chilliliste parent, Object selectedSort) throws Exception {
        this.ParentForm=parent;
        this.selectedSort=selectedSort;
        this.setTitle("Ereignisse für "+ selectedSort);
        setIconImage(getToolkit().getImage("Icon.png"));
        initComponents();
        setDuengerList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane = new javax.swing.JScrollPane();
        TblEreignisse = new javax.swing.JTable();
        TabbedPane = new javax.swing.JTabbedPane();
        PanelMessung = new javax.swing.JPanel();
        LblDateH = new javax.swing.JLabel();
        LblH = new javax.swing.JLabel();
        SpinDatMess = new javax.swing.JSpinner();
        SpinH = new javax.swing.JSpinner();
        LblCm = new javax.swing.JLabel();
        btnAddM = new javax.swing.JButton();
        PanelDünger = new javax.swing.JPanel();
        LblDateD = new javax.swing.JLabel();
        LblD = new javax.swing.JLabel();
        LblDM = new javax.swing.JLabel();
        LblCm1 = new javax.swing.JLabel();
        SpinDatDuen = new javax.swing.JSpinner();
        SpinM = new javax.swing.JSpinner();
        btnAddD = new javax.swing.JButton();
        CBDuenger = new javax.swing.JComboBox();
        LblInf = new javax.swing.JLabel();
        PanelBewässerung = new javax.swing.JPanel();
        LblDMB = new javax.swing.JLabel();
        LblCmB = new javax.swing.JLabel();
        SpinMB = new javax.swing.JSpinner();
        LblDateD1 = new javax.swing.JLabel();
        SpinDatB = new javax.swing.JSpinner();
        btnAddW = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(599, 398));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TblEreignisse.setAutoCreateRowSorter(true);
        TblEreignisse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datum", "Ereignis", "Dünger", "Menge in ml", "Höhe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPane.setViewportView(TblEreignisse);

        LblDateH.setText("Datum:");

        LblH.setText("Höhe:");

        SpinDatMess.setModel(new javax.swing.SpinnerDateModel());
        SpinDatMess.setEditor(new javax.swing.JSpinner.DateEditor(SpinDatMess, "dd.MM.yyyy"));

        SpinH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        LblCm.setText("mm");

        btnAddM.setText("Messung hinzufügen");
        btnAddM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMessungLayout = new javax.swing.GroupLayout(PanelMessung);
        PanelMessung.setLayout(PanelMessungLayout);
        PanelMessungLayout.setHorizontalGroup(
            PanelMessungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMessungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMessungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddM, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelMessungLayout.createSequentialGroup()
                        .addGroup(PanelMessungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDateH)
                            .addComponent(LblH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMessungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMessungLayout.createSequentialGroup()
                                .addComponent(SpinH, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblCm))
                            .addComponent(SpinDatMess))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        PanelMessungLayout.setVerticalGroup(
            PanelMessungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMessungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMessungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDateH)
                    .addComponent(SpinDatMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelMessungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblH)
                    .addComponent(SpinH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCm))
                .addGap(12, 12, 12)
                .addComponent(btnAddM)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Höhen Messung", PanelMessung);

        LblDateD.setText("Datum:");

        LblD.setText("Dünger:");

        LblDM.setText("Menge:");

        LblCm1.setText("ml");

        SpinDatDuen.setModel(new javax.swing.SpinnerDateModel());
        SpinDatDuen.setEditor(new javax.swing.JSpinner.DateEditor(SpinDatDuen, "dd.MM.yyyy"));

        SpinM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        btnAddD.setText("Düngvorgang hinzufügen");
        btnAddD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDActionPerformed(evt);
            }
        });

        CBDuenger.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<neu>" }));
        CBDuenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDuengerActionPerformed(evt);
            }
        });

        LblInf.setIcon(new javax.swing.ImageIcon("/home/mn/Desktop/Chilizucht/Iconinfo.png")); // NOI18N
        LblInf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblInfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelDüngerLayout = new javax.swing.GroupLayout(PanelDünger);
        PanelDünger.setLayout(PanelDüngerLayout);
        PanelDüngerLayout.setHorizontalGroup(
            PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDüngerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddD, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDüngerLayout.createSequentialGroup()
                        .addGroup(PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDateD)
                            .addComponent(LblD)
                            .addComponent(LblDM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDüngerLayout.createSequentialGroup()
                                .addComponent(SpinM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblCm1))
                            .addGroup(PanelDüngerLayout.createSequentialGroup()
                                .addComponent(CBDuenger, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblInf))
                            .addComponent(SpinDatDuen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        PanelDüngerLayout.setVerticalGroup(
            PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDüngerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDateD)
                    .addComponent(SpinDatDuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDüngerLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBDuenger, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblD)))
                    .addGroup(PanelDüngerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblInf)))
                .addGap(15, 15, 15)
                .addGroup(PanelDüngerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDM)
                    .addComponent(LblCm1))
                .addGap(12, 12, 12)
                .addComponent(btnAddD)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Düngvorgang", PanelDünger);

        LblDMB.setText("Menge:");

        LblCmB.setText("ml");

        SpinMB.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        LblDateD1.setText("Datum:");

        SpinDatB.setModel(new javax.swing.SpinnerDateModel());
        SpinDatDuen.setEditor(new javax.swing.JSpinner.DateEditor(SpinDatDuen, "dd.MM.yyyy"));

        btnAddW.setText("Bewässerung hinzufügen");
        btnAddW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBewässerungLayout = new javax.swing.GroupLayout(PanelBewässerung);
        PanelBewässerung.setLayout(PanelBewässerungLayout);
        PanelBewässerungLayout.setHorizontalGroup(
            PanelBewässerungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBewässerungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBewässerungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddW, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBewässerungLayout.createSequentialGroup()
                        .addGroup(PanelBewässerungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDMB)
                            .addComponent(LblDateD1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBewässerungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpinMB)
                            .addComponent(SpinDatB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblCmB)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        PanelBewässerungLayout.setVerticalGroup(
            PanelBewässerungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBewässerungLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelBewässerungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDateD1)
                    .addComponent(SpinDatB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelBewässerungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDMB)
                    .addComponent(LblCmB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddW)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Bewässerung", PanelBewässerung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean AskClosingforChild() // long way to keep: PRIVATE Chilliliste ParentForm; 
    {
    return this.ParentForm.AskClosing();
    }
    
    public void setDuengerList() throws Exception{
    DB con= new DB();
    ArrayList names = con.getDuengerList();
    DefaultComboBoxModel model = (DefaultComboBoxModel) this.CBDuenger.getModel();
    
    for(Object e : names.toArray()){
        if(!model.equals(e))
            {model.insertElementAt(e, 0);}
        }
    model.setSelectedItem(model.getElementAt(0));
    }
    
   
    
    
    public void SetEditable(boolean state)
    {
    this.CBDuenger.setEnabled(state);
    this.SpinDatDuen.setEnabled(state);
    this.SpinDatMess.setEnabled(state);
    this.SpinH.setEnabled(state);
    this.SpinM.setEnabled(state);
    this.TabbedPane.setEnabled(state);
    this.TblEreignisse.setEnabled(state);
    this.btnAddD.setEnabled(state);
    this.btnAddM.setEnabled(state);
    }
    
    public void CleanClose()
        {
        this.dispose();
        this.ParentForm.EreignisFrame=null; // because dispose
        this.ParentForm.SetEditable(true);   
        }
       
    
    private SimpleDateFormat myformatter = new SimpleDateFormat("dd.MM.yyyy");
    
    private void btnAddMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMActionPerformed
    PflanzenHoehe h = new PflanzenHoehe(String.valueOf(selectedSort), (Date)this.SpinDatMess.getValue(),(int)this.SpinH.getValue());
        try {h.saveInDB();} 
        catch (Exception ex) {Logger.getLogger(Ereignisse.class.getName()).log(Level.SEVERE, null, ex);}
        
    DefaultTableModel deft=(DefaultTableModel)this.TblEreignisse.getModel(); 
    deft.addRow(new Object[] {myformatter.format((Date)this.SpinDatMess.getValue()),"Höhen Messung","/","/", (int)this.SpinH.getValue()   }); 
    }//GEN-LAST:event_btnAddMActionPerformed

    private void btnAddDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDActionPerformed
    if(this.CBDuenger.getSelectedItem()!="<neu>")
        { 
        DuengUndWasser dw = new DuengUndWasser((Date)this.SpinDatDuen.getValue(),String.valueOf(this.CBDuenger.getSelectedItem()),(int)(this.SpinM.getValue()));
        try {dw.saveInDB();} 
        catch (Exception ex) {Logger.getLogger(Ereignisse.class.getName()).log(Level.SEVERE, null, ex);}    
                   
        DefaultTableModel deft=(DefaultTableModel)this.TblEreignisse.getModel();
        deft.addRow(new Object[] {myformatter.format((Date)this.SpinDatDuen.getValue()),"Düngevorgang",this.CBDuenger.getSelectedItem(), SpinM.getValue(), "/" });
        }
    else
        {
        JOptionPane.showMessageDialog(this, "<neu> ist kein gültigen Dünger", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnAddDActionPerformed

    private void LblInfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblInfMouseClicked
       if(this.CBDuenger.getSelectedIndex()!=this.CBDuenger.getItemCount()-1 && this.DüngerForm==null)
        {
        this.DüngerForm = new DüngerNeu(this);
        this.DüngerForm.SetInfoView(true);
        
        DB getDuenger = new DB();
    
        try {
            Duenger d = getDuenger.getDuengerInfo(String.valueOf(CBDuenger.getSelectedItem()));
            this.DüngerForm.SetDuengerData(d);
        } 
        catch (Exception ex) {Logger.getLogger(Ereignisse.class.getName()).log(Level.SEVERE, null, ex);}
        
        this.DüngerForm.setVisible(true);
        }
    }//GEN-LAST:event_LblInfMouseClicked

    private void CBDuengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDuengerActionPerformed
   if(this.CBDuenger.getSelectedIndex()==this.CBDuenger.getItemCount()-1 && this.DüngerForm==null)
        {
        this.DüngerForm = new DüngerNeu(this);
        this.SetEditable(false);
        this.DüngerForm.setVisible(true);
        } 
    }//GEN-LAST:event_CBDuengerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    if(this.DüngerForm!=null)
        {
        if(this.ParentForm.showConfirmDialog("Neuer Dünger"))
            {
            this.CleanClose();
            this.DüngerForm.CleanClose();
            }
        }
    else
        {if(this.ParentForm.AskClosing()){this.CleanClose();}} 
    }//GEN-LAST:event_formWindowClosing

    private void btnAddWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWActionPerformed
        DuengUndWasser dw = new DuengUndWasser((Date)this.SpinDatDuen.getValue(),"Bewässerung",(int)(this.SpinMB.getValue()));
        try {dw.saveInDB();} 
        catch (Exception ex) {Logger.getLogger(Ereignisse.class.getName()).log(Level.SEVERE, null, ex);}
        
        DefaultTableModel deft=(DefaultTableModel)this.TblEreignisse.getModel();
        deft.addRow(new Object[] {myformatter.format((Date)this.SpinDatB.getValue()),"Bewässerung","/", SpinMB.getValue(), "/" });  
    }//GEN-LAST:event_btnAddWActionPerformed

    public  void setDünger(String name)
    {
    this.CBDuenger.insertItemAt(name, this.CBDuenger.getItemCount()-1);
    this.CBDuenger.setSelectedItem(name);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBDuenger;
    private javax.swing.JLabel LblCm;
    private javax.swing.JLabel LblCm1;
    private javax.swing.JLabel LblCmB;
    private javax.swing.JLabel LblD;
    private javax.swing.JLabel LblDM;
    private javax.swing.JLabel LblDMB;
    private javax.swing.JLabel LblDateD;
    private javax.swing.JLabel LblDateD1;
    private javax.swing.JLabel LblDateH;
    private javax.swing.JLabel LblH;
    private javax.swing.JLabel LblInf;
    private javax.swing.JPanel PanelBewässerung;
    private javax.swing.JPanel PanelDünger;
    private javax.swing.JPanel PanelMessung;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JSpinner SpinDatB;
    private javax.swing.JSpinner SpinDatDuen;
    private javax.swing.JSpinner SpinDatMess;
    private javax.swing.JSpinner SpinH;
    private javax.swing.JSpinner SpinM;
    private javax.swing.JSpinner SpinMB;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JTable TblEreignisse;
    private javax.swing.JButton btnAddD;
    private javax.swing.JButton btnAddM;
    private javax.swing.JButton btnAddW;
    // End of variables declaration//GEN-END:variables

 
}
