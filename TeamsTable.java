/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubquiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;


public class TeamsTable extends javax.swing.JFrame {

    /**
     * Creates new form TeamsTable
     */
    public TeamsTable() {
        initComponents();
        addRowToJTable();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
   public void addRowToJTable(){
        if(BazaDruzyn.druzyny.isEmpty())
             JOptionPane.showMessageDialog(null,"Obecnie w bazie brak druzyn!");
        else
        {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object rowData[] = new Object[3];
      
            for(Team team : BazaDruzyn.druzyny)
            {
                rowData[0] = team.getNazwa();
                rowData[1] = team.getIlosc();
                rowData[2] = team.getPunkty();
                model.addRow(rowData);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nazwa", "Ilosc osob", "Punkty"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Plik");

        jMenuItem1.setText("Zapisz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Wyślij do bazy danych");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fs = new JFileChooser(new File("c:\\"));
        fs.setDialogTitle("Zapisz plik");
        fs.setFileFilter(new FileTypeFilter(".txt", "Plik tekstowy"));
        int result = fs.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION ){
            String content;
            File fi = fs.getSelectedFile();
            try {
                    FileWriter fw = new FileWriter(fi.getPath());
                    for(Team team : BazaDruzyn.druzyny){
                        content = team.getNazwa()+" "+team.getIlosc()+" "+team.getPunkty()+"\n";
                        fw.write(content);
                        fw.write(System.getProperty("line.separator"));
                        fw.flush();
                    }
                    fw.close();
            } catch (IOException ex) {
                Logger.getLogger(TeamsTable.class.getName()).log(Level.SEVERE, null, ex); 
            }
        }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        DbManager manager = new DbManager();
        manager.Connect();
        //Team team = new Team("Druzyna2",20,true);
        for(Team team : BazaDruzyn.druzyny){
           if(team.isIsRanked())
              manager.Select(team);     
        }
        JOptionPane.showMessageDialog(null,"Operację zakonczono");
              
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
