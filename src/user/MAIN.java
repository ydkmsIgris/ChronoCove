/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MAIN extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MAIN.class.getName());
    
    public MAIN() {
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);  
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
public void addtable(int id ,String Name, int Quantity, Double Price){
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
   
    DecimalFormat df = new DecimalFormat("0.00");
    double totPrice;
        totPrice = Price * Double.valueOf(Quantity);
    String TotalPrice = df.format(totPrice);
    
    for (int row = 0; row < jTable1.getRowCount(); row++){
        if (Name == jTable1.getValueAt(row, 1)) {
            dt.removeRow(jTable1.convertRowIndexToModel(row));
            
        }
        
    }
    
    Vector v = new Vector();
    
    v.add(id);
    v.add(Name);
    v.add(Quantity);
    v.add(TotalPrice);
    
    dt.addRow(v);
    
    cal();
}

public void cal(){
    // cal total table values
    int numOfRow = jTable1.getRowCount();
    double tot = 0.0;
        
        for (int i = 0; i < numOfRow; i++){
            double value;
        value = Double.parseDouble(jTable1.getValueAt(i, 3).toString());
            tot += value;
            
        }
        DecimalFormat df = new DecimalFormat("0.00");
        total.setText(df.format(tot));
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        balances = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pay = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        q9 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        q11 = new javax.swing.JLabel();
        q12 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        q13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        q14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        q15 = new javax.swing.JLabel();
        q16 = new javax.swing.JLabel();
        q17 = new javax.swing.JLabel();
        q18 = new javax.swing.JLabel();
        q19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        q20 = new javax.swing.JLabel();
        q21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        q23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        q24 = new javax.swing.JLabel();
        q25 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        q26 = new javax.swing.JLabel();
        q27 = new javax.swing.JLabel();
        q28 = new javax.swing.JLabel();
        q29 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        q30 = new javax.swing.JLabel();
        c14 = new javax.swing.JLabel();
        q31 = new javax.swing.JLabel();
        c15 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        q32 = new javax.swing.JLabel();
        q33 = new javax.swing.JLabel();
        c16 = new javax.swing.JLabel();
        q34 = new javax.swing.JLabel();
        q35 = new javax.swing.JLabel();
        c17 = new javax.swing.JLabel();
        q36 = new javax.swing.JLabel();
        q37 = new javax.swing.JLabel();
        c18 = new javax.swing.JLabel();
        q38 = new javax.swing.JLabel();
        q39 = new javax.swing.JLabel();
        c19 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        q40 = new javax.swing.JLabel();
        q41 = new javax.swing.JLabel();
        c20 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        q42 = new javax.swing.JLabel();
        q43 = new javax.swing.JLabel();
        c21 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        q44 = new javax.swing.JLabel();
        q45 = new javax.swing.JLabel();
        q46 = new javax.swing.JLabel();
        q47 = new javax.swing.JLabel();
        c22 = new javax.swing.JLabel();
        q48 = new javax.swing.JLabel();
        c23 = new javax.swing.JLabel();
        q49 = new javax.swing.JLabel();
        c24 = new javax.swing.JLabel();
        jButton42 = new javax.swing.JButton();
        q50 = new javax.swing.JLabel();
        q51 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        c25 = new javax.swing.JLabel();
        q52 = new javax.swing.JLabel();
        q53 = new javax.swing.JLabel();
        c26 = new javax.swing.JLabel();
        q54 = new javax.swing.JLabel();
        q55 = new javax.swing.JLabel();
        c27 = new javax.swing.JLabel();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        q56 = new javax.swing.JLabel();
        q57 = new javax.swing.JLabel();
        q58 = new javax.swing.JLabel();
        q59 = new javax.swing.JLabel();
        c28 = new javax.swing.JLabel();
        q60 = new javax.swing.JLabel();
        c29 = new javax.swing.JLabel();
        q61 = new javax.swing.JLabel();
        c30 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        q62 = new javax.swing.JLabel();
        q63 = new javax.swing.JLabel();
        c31 = new javax.swing.JLabel();
        q64 = new javax.swing.JLabel();
        q65 = new javax.swing.JLabel();
        c32 = new javax.swing.JLabel();
        q66 = new javax.swing.JLabel();
        q67 = new javax.swing.JLabel();
        c33 = new javax.swing.JLabel();
        jButton51 = new javax.swing.JButton();
        q68 = new javax.swing.JLabel();
        q69 = new javax.swing.JLabel();
        c34 = new javax.swing.JLabel();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        q70 = new javax.swing.JLabel();
        q71 = new javax.swing.JLabel();
        q72 = new javax.swing.JLabel();
        q73 = new javax.swing.JLabel();
        c35 = new javax.swing.JLabel();
        q74 = new javax.swing.JLabel();
        c36 = new javax.swing.JLabel();
        q75 = new javax.swing.JLabel();
        c37 = new javax.swing.JLabel();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        q76 = new javax.swing.JLabel();
        q77 = new javax.swing.JLabel();
        c38 = new javax.swing.JLabel();
        q78 = new javax.swing.JLabel();
        q79 = new javax.swing.JLabel();
        q80 = new javax.swing.JLabel();
        c39 = new javax.swing.JLabel();
        q81 = new javax.swing.JLabel();
        c40 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(151, 172, 159));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(bill);

        jPanel1.setBackground(new java.awt.Color(151, 172, 159));

        jLabel15.setFont(new java.awt.Font("Swis721 BT", 1, 24)); // NOI18N
        jLabel15.setText("CASH :");

        jLabel16.setFont(new java.awt.Font("Swis721 BT", 1, 24)); // NOI18N
        jLabel16.setText("TOTAL :");

        jLabel17.setFont(new java.awt.Font("Swis721 BT", 1, 24)); // NOI18N
        jLabel17.setText("BALANCE: ");

        total.setFont(new java.awt.Font("Swis721 BT", 3, 24)); // NOI18N
        total.setText("00");

        balances.setFont(new java.awt.Font("Swis721 BT", 3, 24)); // NOI18N
        balances.setText("00");

        pay.setFont(new java.awt.Font("Swis721 BT", 3, 24)); // NOI18N
        jScrollPane3.setViewportView(pay);

        jButton1.setFont(new java.awt.Font("Swis721 BT", 1, 24)); // NOI18N
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Swis721 BT", 1, 24)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balances, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))))
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(balances, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(23, 23, 56));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CHRONO COVE");

        jLabel4.setFont(new java.awt.Font("Forte", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"Timeless Elegance, Crafted in Precision.\"");

        jPanel2.setBackground(new java.awt.Color(23, 23, 56));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 1.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("Arctic Precision - Lunaria Dial");

        q2.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("SmartWatch PRO");

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S1.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 3.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q3.setForeground(new java.awt.Color(255, 255, 255));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("Chestnut Hour");

        q4.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q4.setForeground(new java.awt.Color(255, 255, 255));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("Golden Epoch ");

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 4.png"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 7.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 6.png"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 9.png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 10.png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        q5.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q5.setForeground(new java.awt.Color(255, 255, 255));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("ChronoMaster X");

        q6.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q6.setForeground(new java.awt.Color(255, 255, 255));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("ECO Quartz");

        q7.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q7.setForeground(new java.awt.Color(255, 255, 255));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("Rosé Brillante");

        q8.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q8.setForeground(new java.awt.Color(255, 255, 255));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("Tiger Chrono Deep");

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 11.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S2.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 12.png"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/PIC 5.png"))); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        q9.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q9.setForeground(new java.awt.Color(255, 255, 255));
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("Lumière Verde Royale");

        q10.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q10.setForeground(new java.awt.Color(255, 255, 255));
        q10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q10.setText("SMARTFit Plus");

        q11.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q11.setForeground(new java.awt.Color(255, 255, 255));
        q11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q11.setText("Ash & Ember Dive Watch");

        q12.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q12.setForeground(new java.awt.Color(255, 255, 255));
        q12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q12.setText("Luxora Diver – White Gold ");

        c1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setText("0");

        c5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 255));
        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setText("0");

        c9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c9.setForeground(new java.awt.Color(255, 255, 255));
        c9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c9.setText("0");

        c2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setText("0");

        c6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c6.setText("0");

        c3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setText("0");

        c7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c7.setForeground(new java.awt.Color(255, 255, 255));
        c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c7.setText("0");

        c11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c11.setForeground(new java.awt.Color(255, 255, 255));
        c11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c11.setText("0");

        c4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setText("0");

        c8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c8.setForeground(new java.awt.Color(255, 255, 255));
        c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c8.setText("0");

        c12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c12.setForeground(new java.awt.Color(255, 255, 255));
        c12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c12.setText("0");

        q13.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q13.setForeground(new java.awt.Color(255, 255, 255));
        q13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q13.setText("Price: 1350.00  Quantity:");

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("CLASSIC ANALOG");

        q14.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q14.setForeground(new java.awt.Color(255, 255, 255));
        q14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q14.setText("Price: 350.00  Quantity:");

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("SMART");

        q15.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q15.setForeground(new java.awt.Color(255, 255, 255));
        q15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q15.setText("Price: 879.00  Quantity:");

        q16.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q16.setForeground(new java.awt.Color(255, 255, 255));
        q16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q16.setText("Price: 2950.00  Quantity:");

        q17.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q17.setForeground(new java.awt.Color(255, 255, 255));
        q17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q17.setText("Price: 799.00  Quantity:");

        q18.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q18.setForeground(new java.awt.Color(255, 255, 255));
        q18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q18.setText("Price: 2300.00  Quantity:");

        q19.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q19.setForeground(new java.awt.Color(255, 255, 255));
        q19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q19.setText("Price: 300.00  Quantity:");

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("CHRONOGRAPH ");

        q20.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q20.setForeground(new java.awt.Color(255, 255, 255));
        q20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q20.setText("Price: 1799.00  Quantity:");

        q21.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q21.setForeground(new java.awt.Color(255, 255, 255));
        q21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q21.setText("Price: 1750.00  Quantity:");

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("DIVE");

        q23.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q23.setForeground(new java.awt.Color(255, 255, 255));
        q23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q23.setText("Price: 450.00  Quantity:");

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("QUARTZ");

        q24.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q24.setForeground(new java.awt.Color(255, 255, 255));
        q24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q24.setText("Price: 1599.00  Quantity:");

        q25.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q25.setForeground(new java.awt.Color(255, 255, 255));
        q25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q25.setText("Price: 1999.00  Quantity:");

        c10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c10.setForeground(new java.awt.Color(255, 255, 255));
        c10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c10.setText("0");

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/A 1.png"))); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/A 2.png"))); // NOI18N
        jButton31.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton31.setMinimumSize(new java.awt.Dimension(200, 200));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/A3.png"))); // NOI18N
        jButton32.setMaximumSize(new java.awt.Dimension(200, 200));
        jButton32.setMinimumSize(new java.awt.Dimension(200, 200));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        q26.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q26.setForeground(new java.awt.Color(255, 255, 255));
        q26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q26.setText("Berkley Resolve ");

        q27.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q27.setForeground(new java.awt.Color(255, 255, 255));
        q27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q27.setText("Langford Analog");

        q28.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q28.setForeground(new java.awt.Color(255, 255, 255));
        q28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q28.setText("Legacy Dial");

        q29.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q29.setForeground(new java.awt.Color(255, 255, 255));
        q29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q29.setText("Price: 600.00  Quantity:");

        c13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c13.setForeground(new java.awt.Color(255, 255, 255));
        c13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c13.setText("0");

        q30.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q30.setForeground(new java.awt.Color(255, 255, 255));
        q30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q30.setText("Price: 849.00  Quantity:");

        c14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c14.setForeground(new java.awt.Color(255, 255, 255));
        c14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c14.setText("0");

        q31.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q31.setForeground(new java.awt.Color(255, 255, 255));
        q31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q31.setText("Price: 999.00  Quantity:");

        c15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c15.setForeground(new java.awt.Color(255, 255, 255));
        c15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c15.setText("0");

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/A4.png"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/A6.png"))); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/A7.png"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/a5.png"))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        q32.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q32.setForeground(new java.awt.Color(255, 255, 255));
        q32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q32.setText("The Saville");

        q33.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q33.setForeground(new java.awt.Color(255, 255, 255));
        q33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q33.setText("Price: 1399.00  Quantity:");

        c16.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c16.setForeground(new java.awt.Color(255, 255, 255));
        c16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c16.setText("0");

        q34.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q34.setForeground(new java.awt.Color(255, 255, 255));
        q34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q34.setText("Belgravia Classic");

        q35.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q35.setForeground(new java.awt.Color(255, 255, 255));
        q35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q35.setText("Price: 650.00  Quantity:");

        c17.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c17.setForeground(new java.awt.Color(255, 255, 255));
        c17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c17.setText("0");

        q36.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q36.setForeground(new java.awt.Color(255, 255, 255));
        q36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q36.setText("Sterling Vale");

        q37.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q37.setForeground(new java.awt.Color(255, 255, 255));
        q37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q37.setText("Price: 650.00  Quantity:");

        c18.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c18.setForeground(new java.awt.Color(255, 255, 255));
        c18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c18.setText("0");

        q38.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q38.setForeground(new java.awt.Color(255, 255, 255));
        q38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q38.setText("Burlington Dial");

        q39.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q39.setForeground(new java.awt.Color(255, 255, 255));
        q39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q39.setText("Price: 899.00  Quantity:");

        c19.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c19.setForeground(new java.awt.Color(255, 255, 255));
        c19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c19.setText("0");

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/C1.png"))); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        q40.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q40.setForeground(new java.awt.Color(255, 255, 255));
        q40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q40.setText("Heartbeat Rose");

        q41.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q41.setForeground(new java.awt.Color(255, 255, 255));
        q41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q41.setText("Price: 2349.00  Quantity:");

        c20.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c20.setForeground(new java.awt.Color(255, 255, 255));
        c20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c20.setText("0");

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/C2.png"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        q42.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q42.setForeground(new java.awt.Color(255, 255, 255));
        q42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q42.setText("Echo Chrome");

        q43.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q43.setForeground(new java.awt.Color(255, 255, 255));
        q43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q43.setText("Price: 2199.00  Quantity:");

        c21.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c21.setForeground(new java.awt.Color(255, 255, 255));
        c21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c21.setText("0");

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S3.png"))); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S5.png"))); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S7.png"))); // NOI18N
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        q44.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q44.setForeground(new java.awt.Color(255, 255, 255));
        q44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q44.setText("Aurelia Smart");

        q45.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q45.setForeground(new java.awt.Color(255, 255, 255));
        q45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q45.setText("SyncoraFit Plus");

        q46.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q46.setForeground(new java.awt.Color(255, 255, 255));
        q46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q46.setText("Chronix S2");

        q47.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q47.setForeground(new java.awt.Color(255, 255, 255));
        q47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q47.setText("Price: 399.00  Quantity:");

        c22.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c22.setForeground(new java.awt.Color(255, 255, 255));
        c22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c22.setText("0");

        q48.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q48.setForeground(new java.awt.Color(255, 255, 255));
        q48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q48.setText("Price: 399.00  Quantity:");

        c23.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c23.setForeground(new java.awt.Color(255, 255, 255));
        c23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c23.setText("0");

        q49.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q49.setForeground(new java.awt.Color(255, 255, 255));
        q49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q49.setText("Price: 549.00  Quantity:");

        c24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c24.setForeground(new java.awt.Color(255, 255, 255));
        c24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c24.setText("0");

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S4.png"))); // NOI18N
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        q50.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q50.setForeground(new java.awt.Color(255, 255, 255));
        q50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q50.setText("Chronix S1");

        q51.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q51.setForeground(new java.awt.Color(255, 255, 255));
        q51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q51.setText("Price: 449.00  Quantity:");

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S6.png"))); // NOI18N
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/S8.png"))); // NOI18N
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        c25.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c25.setForeground(new java.awt.Color(255, 255, 255));
        c25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c25.setText("0");

        q52.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q52.setForeground(new java.awt.Color(255, 255, 255));
        q52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q52.setText("Price: 199.00  Quantity:");

        q53.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q53.setForeground(new java.awt.Color(255, 255, 255));
        q53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q53.setText("Syncora PRO");

        c26.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c26.setForeground(new java.awt.Color(255, 255, 255));
        c26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c26.setText("0");

        q54.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q54.setForeground(new java.awt.Color(255, 255, 255));
        q54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q54.setText("Saint Lore");

        q55.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q55.setForeground(new java.awt.Color(255, 255, 255));
        q55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q55.setText("Price: 999.00  Quantity:");

        c27.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c27.setForeground(new java.awt.Color(255, 255, 255));
        c27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c27.setText("0");

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/D1.png"))); // NOI18N
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/D2.png"))); // NOI18N
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/D3.png"))); // NOI18N
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        q56.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q56.setForeground(new java.awt.Color(255, 255, 255));
        q56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q56.setText("MachDive Reactor");

        q57.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q57.setForeground(new java.awt.Color(255, 255, 255));
        q57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q57.setText("Price: 2199.00  Quantity:");

        q58.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q58.setForeground(new java.awt.Color(255, 255, 255));
        q58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q58.setText("Green Hollow Dive");

        q59.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q59.setForeground(new java.awt.Color(255, 255, 255));
        q59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q59.setText("The Mariner Elite – Navy Signature");

        c28.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c28.setForeground(new java.awt.Color(255, 255, 255));
        c28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c28.setText("0");

        q60.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q60.setForeground(new java.awt.Color(255, 255, 255));
        q60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q60.setText("Price: 2399.00  Quantity:");

        c29.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c29.setForeground(new java.awt.Color(255, 255, 255));
        c29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c29.setText("0");

        q61.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q61.setForeground(new java.awt.Color(255, 255, 255));
        q61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q61.setText("Price: 1999.00  Quantity:");

        c30.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c30.setForeground(new java.awt.Color(255, 255, 255));
        c30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c30.setText("0");

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/D4.png"))); // NOI18N
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/D5.png"))); // NOI18N
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/D6.png"))); // NOI18N
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        q62.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q62.setForeground(new java.awt.Color(255, 255, 255));
        q62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q62.setText("Obsidian Dive – Carbon Reinforced");

        q63.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q63.setForeground(new java.awt.Color(255, 255, 255));
        q63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q63.setText("Price: 2659.00  Quantity:");

        c31.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c31.setForeground(new java.awt.Color(255, 255, 255));
        c31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c31.setText("0");

        q64.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q64.setForeground(new java.awt.Color(255, 255, 255));
        q64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q64.setText("TideBorne ");

        q65.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q65.setForeground(new java.awt.Color(255, 255, 255));
        q65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q65.setText("Price: 4999.00  Quantity:");

        c32.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c32.setForeground(new java.awt.Color(255, 255, 255));
        c32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c32.setText("0");

        q66.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q66.setForeground(new java.awt.Color(255, 255, 255));
        q66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q66.setText("SeaBound Diver");

        q67.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q67.setForeground(new java.awt.Color(255, 255, 255));
        q67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q67.setText("Price: 5999.00  Quantity:");

        c33.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c33.setForeground(new java.awt.Color(255, 255, 255));
        c33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c33.setText("0");

        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/R5.png"))); // NOI18N
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        q68.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q68.setForeground(new java.awt.Color(255, 255, 255));
        q68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q68.setText("Price: 750.00  Quantity:");

        q69.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q69.setForeground(new java.awt.Color(255, 255, 255));
        q69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q69.setText("Helios Quartz");

        c34.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c34.setForeground(new java.awt.Color(255, 255, 255));
        c34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c34.setText("0");

        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/R1.png"))); // NOI18N
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/R2.png"))); // NOI18N
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/R3.png"))); // NOI18N
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        q70.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q70.setForeground(new java.awt.Color(255, 255, 255));
        q70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q70.setText("Celestia Quartz ");

        q71.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q71.setForeground(new java.awt.Color(255, 255, 255));
        q71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q71.setText("The Sovereign Dial ");

        q72.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q72.setForeground(new java.awt.Color(255, 255, 255));
        q72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q72.setText("The Earthmark");

        q73.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q73.setForeground(new java.awt.Color(255, 255, 255));
        q73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q73.setText("Price: 1899.00  Quantity:");

        c35.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c35.setForeground(new java.awt.Color(255, 255, 255));
        c35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c35.setText("0");

        q74.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q74.setForeground(new java.awt.Color(255, 255, 255));
        q74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q74.setText("Price: 1699.00  Quantity:");

        c36.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c36.setForeground(new java.awt.Color(255, 255, 255));
        c36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c36.setText("0");

        q75.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q75.setForeground(new java.awt.Color(255, 255, 255));
        q75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q75.setText("Price: 1349.00  Quantity:");

        c37.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c37.setForeground(new java.awt.Color(255, 255, 255));
        c37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c37.setText("0");

        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/R4.png"))); // NOI18N
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/R6.png"))); // NOI18N
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED WATCH PHOTOS/R7.png"))); // NOI18N
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        q76.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q76.setForeground(new java.awt.Color(255, 255, 255));
        q76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q76.setText("Volcán Dial");

        q77.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q77.setForeground(new java.awt.Color(255, 255, 255));
        q77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q77.setText("Price: 2100.00  Quantity:");

        c38.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c38.setForeground(new java.awt.Color(255, 255, 255));
        c38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c38.setText("0");

        q78.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q78.setForeground(new java.awt.Color(255, 255, 255));
        q78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q78.setText("Lumina Sanctus Quartz");

        q79.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q79.setForeground(new java.awt.Color(255, 255, 255));
        q79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q79.setText("Nocturna Quartz");

        q80.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q80.setForeground(new java.awt.Color(255, 255, 255));
        q80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q80.setText("Price: 2399.00  Quantity:");

        c39.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c39.setForeground(new java.awt.Color(255, 255, 255));
        c39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c39.setText("0");

        q81.setFont(new java.awt.Font("Rockwell", 3, 12)); // NOI18N
        q81.setForeground(new java.awt.Color(255, 255, 255));
        q81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q81.setText("Price: 2399.00  Quantity:");

        c40.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        c40.setForeground(new java.awt.Color(255, 255, 255));
        c40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c40.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(q32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(q14, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(q3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(q35, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(q37, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(q39, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(q26, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(q27, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q29, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(q30, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q31, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(q28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(q34, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q36, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(q38, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(q12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(q62, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q64, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(q66, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(q24, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(q69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(q77, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(q80, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(q76, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(q78, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(q81, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(212, 212, 212))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(q15, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(191, 191, 191))
                                                    .addComponent(q13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q17, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q16, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(q7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(q20, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(q8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q18, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(q41, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(q9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(q40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q43, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(q42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(q19, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(q25, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(q21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(q68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(q23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(c11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(q63, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(q65, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(q67, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(38, 38, 38))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(11, 11, 11)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(q57, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(c28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(q60, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(q61, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q52, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q51, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(q55, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(q10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(12, 12, 12)))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                            .addComponent(q44, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(q46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(q45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(q47, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q48, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q49, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(q50, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q53, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q54, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(c29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(q11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(q56, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(q58, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(q59, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(q6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(175, 175, 175)
                                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(q73, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(q74, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(q75, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(q79, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(q70, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q71, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(q72, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(q33, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q41, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(q45, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(q44, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(q46, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q47, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q48, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q49, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 164, Short.MAX_VALUE)
                        .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q50, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q53, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q54, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q52, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q51, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q56, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q58, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q59, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q60, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q61, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q62, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q64, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q66, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q63, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q65, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q67, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q70, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q72, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q68, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q74, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q75, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q69, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q76, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q78, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q79, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q80, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q81, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel2);

        delete1.setText("BACK");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // Button Code
        int i = Integer.parseInt(c1.getText());
        ++i;
        c1.setText(String.valueOf(i));
      
        addtable(1, "ArcticPrecision ", i, 1350.00);
        
        cal();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // Button 2 Code
        int i = Integer.valueOf(c2.getText());
        ++i;
        c2.setText(String.valueOf(i));
        addtable(2, "SmartWatch PRO", i, 300.00);
        
        cal();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // Button 3 Code
        int i = Integer.parseInt(c3.getText());
        ++i;
        c3.setText(String.valueOf(i));
        
        addtable(3, "ChestNut Hour", i, 350.00);
        
        cal();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // Button 4 Code
        int i = Integer.parseInt(c4.getText());
        ++i;
        c4.setText(String.valueOf(i));
        
        addtable(4, "Golden Epoch", i, 799.00);
        
        cal();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // Button 6 Code
        int i = Integer.parseInt(c5.getText());
        ++i;
        c5.setText(String.valueOf(i));
        
        addtable(5, "ECO Quartz    ", i, 550.00);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // Button 5 Code
        int i = Integer.parseInt(c6.getText());
        ++i;
        c6.setText(String.valueOf(i));
        addtable(6, "ChronoMaster X", i, 879.00);
        
        cal();
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // Button Code 7
        int i = Integer.parseInt(c7.getText());
        ++i;
        c7.setText(String.valueOf(i));
        
        addtable(7, "Rosé Brillante", i, 2950.00);
        cal();
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // Button Code 8
        int i = Integer.parseInt(c8.getText());
        ++i;
        c8.setText(String.valueOf(i));
        
        addtable(8, "Tiger Chrono Deep", i, 1799.00);
      
        cal();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // Button Code 9
        int i = Integer.parseInt(c9.getText());
        ++i;
        c9.setText(String.valueOf(i));
        
        addtable(9, "Lumière Verde Royale", i, 2300.00);
        
        cal();
        
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // Button Code 10
        int i = Integer.parseInt(c10.getText());
        ++i;
        c10.setText(String.valueOf(i));
        
        addtable(10, "SMARTFit Plus", i, 450.00);
        
        cal();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // Button Code 11
        int i = Integer.parseInt(c11.getText());
        ++i;
        c11.setText(String.valueOf(i));
        
        addtable(11, "Ash & Ember Dive Watch", i, 1999.00);
        
        cal();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Pay button 
        try {
            // Get values from text fields
            String totalText = total.getText();
            String payText = pay.getText();

            // Parse values
            double tot = Double.parseDouble(totalText);
            double paid = Double.parseDouble(payText);

            // Validate input
            if (payText.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter an amount paid.", 
                    "Missing Input", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (paid < tot) {
                JOptionPane.showMessageDialog(this, 
                    "The amount paid is less than the total.\nPlease enter a sufficient payment.", 
                    "Insufficient Payment", 
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Calculate and update balance
            double balance = paid - tot;
            DecimalFormat df = new DecimalFormat("0.00");
            balances.setText(df.format(balance));

            // Optional: Clear payment field after successful transaction
            pay.setText("");

        } catch (NumberFormatException ex) {
            // Handle invalid numbers
            JOptionPane.showMessageDialog(this, 
                "Please enter valid numeric values for payment.", 
                "Invalid Input", 
                JOptionPane.ERROR_MESSAGE);
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // Set up header
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Check if table is empty
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, 
                "Please select at least one item before printing the receipt.", 
                "No Items Selected", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Proceed to print receipt since table has data
        bill.setText("========================================\n");
        bill.setText(bill.getText() + "          CHRONO COVE\n");
        bill.setText(bill.getText() + "           DAVAO CITY\n");
        bill.setText(bill.getText() + "========================================\n");

        // Add items from table
        for (int i = 0; i < model.getRowCount(); i++) {
            String itemName = model.getValueAt(i, 1).toString();
            String quantity = model.getValueAt(i, 2).toString();
            String price = model.getValueAt(i, 3).toString();

            bill.setText(bill.getText() + itemName + "\n");
            bill.setText(bill.getText() + "Qty: " + quantity + " x $" + price + "\n\n");
        }

        bill.setText(bill.getText() + "----------------------------------------\n");

        // Show total, paid, balance
        String totalAmount = total.getText();
        String amountPaid = pay.getText();
        String change = balances.getText();

        bill.setText(bill.getText() + "TOTAL: $" + totalAmount + "\n");
        bill.setText(bill.getText() + "PAID: $" + amountPaid + "\n");
        bill.setText(bill.getText() + "CHANGE: $" + change + "\n");

        bill.setText(bill.getText() + "----------------------------------------\n");
        bill.setText(bill.getText() + "       THANK YOU! COME AGAIN!\n");
        bill.setText(bill.getText() + "========================================\n");
    }//GEN-LAST:event_printActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // Delete items
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        int rw = jTable1.getSelectedRow();
        String r = dt.getValueAt(rw, 0).toString().trim(); // Get ID and trim

        dt.removeRow(rw); // Remove the row
        
//        remove quantity
        
        System.out.println(r);
        switch(r){
            case "1":
                c1.setText("0");
                break;
            case "2":
                c2.setText("0");
                break;
            case "3":
                c3.setText("0");
                break;
            case "4":
                c4.setText("0");
                break;
            case "5":
                c5.setText("0");
                break;
            case "6":
                c6.setText("0");
                break;
            case "7":
                c7.setText("0");
                break;
            case "8":
                c8.setText("0");
                break;
            case "9":
                c9.setText("0");
                break;
            case "10":
                c10.setText("0");
                break;
            case "11":
                c11.setText("0");
                break;
            case "12":
                c12.setText("0");
                break;
            case "13":
                c13.setText("0");
                break;
            case "14":
                c14.setText("0");
                break;
            case "15":
                c15.setText("0");
                break;
            case "16":
                c16.setText("0");
                break;
            case "17":
                c17.setText("0");
                break;    
            case "18":
                c18.setText("0");
                break; 
            case "19":
                c19.setText("0");
                break; 
            case "20":
                c20.setText("0");
                break; 
            case "21":
                c21.setText("0");
                break; 
            case "22":
                c22.setText("0");
                break; 
            case "23":
                c23.setText("0");
                break; 
            case "24":
                c24.setText("0");
                break; 
            case "25":
                c25.setText("0");
                break; 
            case "26":
                c26.setText("0");
                break; 
            case "27":
                c27.setText("0");
                break; 
            case "28":
                c28.setText("0");
                break; 
            case "29":
                c29.setText("0");
                break; 
            case "30":
                c30.setText("0");
                break; 
            case "31":
                c31.setText("0");
                break; 
            case "32":
                c32.setText("0");
                break; 
            case "33":
                c33.setText("0");
                break; 
            case "34":
                c34.setText("0");
                break; 
            case "35":
                c35.setText("0");
                break; 
            case "36":
                c36.setText("0");
                break; 
            case "37":
                c37.setText("0");
                break; 
            case "38":
                c38.setText("0");
                break; 
            case "39":
                c39.setText("0");
                break; 
            case "40":
                c40.setText("0");
                break;                 
            default:
                System.out.println("Over");
        }
        cal();
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // Button Code 12
        int i = Integer.parseInt(c12.getText());
        ++i;
        c12.setText(String.valueOf(i));
        
        addtable(12, "LuxoraDiver      ", i, 1750.00);
        
        cal();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        int i = Integer.parseInt(c13.getText());
        ++i;
        c13.setText(String.valueOf(i));
        
        addtable(13, "Berkley Resolve    ", i, 600.00);
        
        cal();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
         int i = Integer.parseInt(c14.getText());
        ++i;
        c14.setText(String.valueOf(i));
        
        addtable(14, "Langford Analog   ", i, 849.00);
        
        cal();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        int i = Integer.parseInt(c15.getText());
        ++i;
        c15.setText(String.valueOf(i));
        
        addtable(15, "Legacy Dial      ", i, 999.00);
        
        cal();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        int i = Integer.parseInt(c16.getText());
        ++i;
        c16.setText(String.valueOf(i));
        
        addtable(16, "The Saville    ", i, 1399.00);
        
        cal();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        int i = Integer.parseInt(c17.getText());
        ++i;
        c17.setText(String.valueOf(i));
        
        addtable(17, "Belgravia Classic    ", i, 650.00);
        
        cal();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        int i = Integer.parseInt(c18.getText());
        ++i;
        c18.setText(String.valueOf(i));
        
        addtable(18, "Sterling Vale    ", i, 650.00);
        
        cal();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        int i = Integer.parseInt(c19.getText());
        ++i;
        c19.setText(String.valueOf(i));
        
        addtable(19, "Burlington Dial    ", i, 899.00);
        
        cal();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        int i = Integer.parseInt(c20.getText());
        ++i;
        c20.setText(String.valueOf(i));
        
        addtable(20, "Heartbeat Rose    ", i, 2349.00);
        
        cal();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        int i = Integer.parseInt(c21.getText());
        ++i;
        c21.setText(String.valueOf(i));
        
        addtable(21, "Echo Chrome    ", i, 2199.00);
        
        cal();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        int i = Integer.parseInt(c22.getText());
        ++i;
        c22.setText(String.valueOf(i));
        
        addtable(22, "Aurelia Smart    ", i, 399.00);
        
        cal();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        int i = Integer.parseInt(c23.getText());
        ++i;
        c23.setText(String.valueOf(i));
        
        addtable(23, "Chronix S2    ", i, 399.00);
        
        cal();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        int i = Integer.parseInt(c24.getText());
        ++i;
        c24.setText(String.valueOf(i));
        
        addtable(24, "SynchoraFit Plus   ", i, 549.00);
        
        cal();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        int i = Integer.parseInt(c25.getText());
        ++i;
        c25.setText(String.valueOf(i));
        
        addtable(25, "Chronix S1    ", i, 199.00);
        
        cal();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        int i = Integer.parseInt(c26.getText());
        ++i;
        c26.setText(String.valueOf(i));
        
        addtable(26, "Sychora PRO    ", i, 449.00);
        
        cal();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        int i = Integer.parseInt(c27.getText());
        ++i;
        c27.setText(String.valueOf(i));
        
        addtable(27, "Saint Lore    ", i, 999.00);
        
        cal();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        int i = Integer.parseInt(c28.getText());
        ++i;
        c28.setText(String.valueOf(i));
        
        addtable(28, "MachDive Reactor    ", i, 2199.00);
        
        cal();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        int i = Integer.parseInt(c29.getText());
        ++i;
        c29.setText(String.valueOf(i));
        
        addtable(29, "Green Hollow Dive    ", i, 2399.00);
        
        cal();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        int i = Integer.parseInt(c30.getText());
        ++i;
        c30.setText(String.valueOf(i));
        
        addtable(30, "The Mariner Elite - Navy Signiture", i, 1999.00);
        
        cal();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        int i = Integer.parseInt(c31.getText());
        ++i;
        c31.setText(String.valueOf(i));
        
        addtable(31, "Obsidian Dive - Carbon Reinforced", i, 2659.00);
        
        cal();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        int i = Integer.parseInt(c32.getText());
        ++i;
        c32.setText(String.valueOf(i));
        
        addtable(32, "TideBorne    ", i, 4999.00);
        
        cal();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        int i = Integer.parseInt(c33.getText());
        ++i;
        c33.setText(String.valueOf(i));
        
        addtable(33, "Seabound Diver    ", i, 5999.00);
        
        cal();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        int i = Integer.parseInt(c34.getText());
        ++i;
        c34.setText(String.valueOf(i));
        
        addtable(34, "Helios Quartz    ", i, 1599.00);
        
        cal();
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        int i = Integer.parseInt(c35.getText());
        ++i;
        c35.setText(String.valueOf(i));
        
        addtable(35, "Celestia Quartz    ", i, 1899.00);
        
        cal();
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        int i = Integer.parseInt(c36.getText());
        ++i;
        c36.setText(String.valueOf(i));
        
        addtable(36, "The Sovereign Dial    ", i, 1699.00);
        
        cal();
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        int i = Integer.parseInt(c37.getText());
        ++i;
        c37.setText(String.valueOf(i));
        
        addtable(37, "The Earthmark Dial    ", i, 1349.00);
        
        cal();
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        int i = Integer.parseInt(c38.getText());
        ++i;
        c38.setText(String.valueOf(i));
        
        addtable(38, "Volcan Dial    ", i, 2199.00);
        
        cal();
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        int i = Integer.parseInt(c39.getText());
        ++i;
        c39.setText(String.valueOf(i));
        
        addtable(39, "Lumina Sanctus Quartz    ", i, 2399.00);
        
        cal();
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        int i = Integer.parseInt(c40.getText());
        ++i;
        c40.setText(String.valueOf(i));
        
        addtable(40, "Nocturna Quartz    ", i, 2399.00);
        
        cal();
    }//GEN-LAST:event_jButton57ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_delete1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MAIN().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balances;
    private javax.swing.JTextPane bill;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c13;
    private javax.swing.JLabel c14;
    private javax.swing.JLabel c15;
    private javax.swing.JLabel c16;
    private javax.swing.JLabel c17;
    private javax.swing.JLabel c18;
    private javax.swing.JLabel c19;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c20;
    private javax.swing.JLabel c21;
    private javax.swing.JLabel c22;
    private javax.swing.JLabel c23;
    private javax.swing.JLabel c24;
    private javax.swing.JLabel c25;
    private javax.swing.JLabel c26;
    private javax.swing.JLabel c27;
    private javax.swing.JLabel c28;
    private javax.swing.JLabel c29;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c30;
    private javax.swing.JLabel c31;
    private javax.swing.JLabel c32;
    private javax.swing.JLabel c33;
    private javax.swing.JLabel c34;
    private javax.swing.JLabel c35;
    private javax.swing.JLabel c36;
    private javax.swing.JLabel c37;
    private javax.swing.JLabel c38;
    private javax.swing.JLabel c39;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c40;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane pay;
    private javax.swing.JButton print;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q12;
    private javax.swing.JLabel q13;
    private javax.swing.JLabel q14;
    private javax.swing.JLabel q15;
    private javax.swing.JLabel q16;
    private javax.swing.JLabel q17;
    private javax.swing.JLabel q18;
    private javax.swing.JLabel q19;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q20;
    private javax.swing.JLabel q21;
    private javax.swing.JLabel q23;
    private javax.swing.JLabel q24;
    private javax.swing.JLabel q25;
    private javax.swing.JLabel q26;
    private javax.swing.JLabel q27;
    private javax.swing.JLabel q28;
    private javax.swing.JLabel q29;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q30;
    private javax.swing.JLabel q31;
    private javax.swing.JLabel q32;
    private javax.swing.JLabel q33;
    private javax.swing.JLabel q34;
    private javax.swing.JLabel q35;
    private javax.swing.JLabel q36;
    private javax.swing.JLabel q37;
    private javax.swing.JLabel q38;
    private javax.swing.JLabel q39;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q40;
    private javax.swing.JLabel q41;
    private javax.swing.JLabel q42;
    private javax.swing.JLabel q43;
    private javax.swing.JLabel q44;
    private javax.swing.JLabel q45;
    private javax.swing.JLabel q46;
    private javax.swing.JLabel q47;
    private javax.swing.JLabel q48;
    private javax.swing.JLabel q49;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q50;
    private javax.swing.JLabel q51;
    private javax.swing.JLabel q52;
    private javax.swing.JLabel q53;
    private javax.swing.JLabel q54;
    private javax.swing.JLabel q55;
    private javax.swing.JLabel q56;
    private javax.swing.JLabel q57;
    private javax.swing.JLabel q58;
    private javax.swing.JLabel q59;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q60;
    private javax.swing.JLabel q61;
    private javax.swing.JLabel q62;
    private javax.swing.JLabel q63;
    private javax.swing.JLabel q64;
    private javax.swing.JLabel q65;
    private javax.swing.JLabel q66;
    private javax.swing.JLabel q67;
    private javax.swing.JLabel q68;
    private javax.swing.JLabel q69;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q70;
    private javax.swing.JLabel q71;
    private javax.swing.JLabel q72;
    private javax.swing.JLabel q73;
    private javax.swing.JLabel q74;
    private javax.swing.JLabel q75;
    private javax.swing.JLabel q76;
    private javax.swing.JLabel q77;
    private javax.swing.JLabel q78;
    private javax.swing.JLabel q79;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q80;
    private javax.swing.JLabel q81;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
