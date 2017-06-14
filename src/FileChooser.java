import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author conno
 */
public class FileChooser extends javax.swing.JFrame {

    String[] fileArray;
    int count;
    
    /**
     * Creates new form FileChooser
     */
    public FileChooser() {
        initComponents();

        fileArray = new String[10];
        count = Integer.parseInt(CV_count.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CV_count = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        cvPaste = new javax.swing.JScrollPane();
        infoCv = new javax.swing.JTextArea();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        JobForm = new javax.swing.JMenuItem();
        Add_CV = new javax.swing.JMenuItem();
        Remove_CV = new javax.swing.JMenuItem();
        Remove_ALL = new javax.swing.JMenuItem();
        Results = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("This is my open dialog.");
        fileChooser.setFileFilter(new MyCustomFilter());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CV_count.setText("0");

        jLabel1.setText("CVs Loaded:");

        jSplitPane1.setDividerLocation(50);
        jSplitPane1.setDividerSize(30);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        infoText.setEditable(false);
        infoText.setColumns(20);
        infoText.setRows(5);
        infoText.setText("Add CV's to compare to the Job Requirements.\nMaximum 10 at a time.");
        infoText.setWrapStyleWord(true);
        infoText.setName("infoText"); // NOI18N
        jScrollPane1.setViewportView(infoText);
        infoText.getAccessibleContext().setAccessibleName("");

        jSplitPane1.setTopComponent(jScrollPane1);

        jScrollPane2.setName(""); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("cvPaste"); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        jSplitPane1.setRightComponent(jScrollPane2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Language Comparison", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        cvPaste.setName("cvPaste"); // NOI18N

        infoCv.setColumns(20);
        infoCv.setRows(5);
        infoCv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        infoCv.setName("infoCv"); // NOI18N
        cvPaste.setViewportView(infoCv);
        infoCv.getAccessibleContext().setAccessibleDescription("");
        infoCv.getAccessibleContext().setAccessibleParent(jScrollPane2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cvPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cvPaste, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel3);

        FileMenu.setMnemonic('F');
        FileMenu.setText("File");

        JobForm.setMnemonic('J');
        JobForm.setText("Job Form");
        JobForm.setEnabled(false);
        JobForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobFormActionPerformed(evt);
            }
        });
        FileMenu.add(JobForm);

        Add_CV.setMnemonic('A');
        Add_CV.setText("Add CV");
        Add_CV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_CVActionPerformed(evt);
            }
        });
        FileMenu.add(Add_CV);

        Remove_CV.setMnemonic('R');
        Remove_CV.setText("Remove CV");
        Remove_CV.setEnabled(false);
        Remove_CV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_CVActionPerformed(evt);
            }
        });
        FileMenu.add(Remove_CV);

        Remove_ALL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Remove_ALL.setText("Remove All");
        Remove_ALL.setEnabled(false);
        Remove_ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_ALLActionPerformed(evt);
            }
        });
        FileMenu.add(Remove_ALL);

        Results.setMnemonic('R');
        Results.setText("Results");
        Results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultsActionPerformed(evt);
            }
        });
        FileMenu.add(Results);

        Exit.setMnemonic('E');
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        FileMenu.add(Exit);

        MenuBar.add(FileMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CV_count, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSplitPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CV_count)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void JobFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobFormActionPerformed
        // TODO add your handling code here:
        //UNUSED AT THE MOMENT
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            Converter.start(file.getAbsolutePath());

            try {
                // What to do with the file, e.g. display it in a TextArea
                infoText.read(new FileReader(file.getAbsolutePath() + ".txt"), null);
            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_JobFormActionPerformed

    private void Add_CVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_CVActionPerformed
        // TODO add your handling code here:

        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //get File
            File file = fileChooser.getSelectedFile();
            //add file path to file path array
            fileArray[count] = file.getAbsolutePath();
            //increase count
            count++;
            if (count == 10) {
                Add_CV.setEnabled(false);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
        //set components
        CV_count.setText("" + count + "");
        Remove_CV.setEnabled(true);
        Remove_ALL.setEnabled(true);

    }//GEN-LAST:event_Add_CVActionPerformed

    private void ResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultsActionPerformed
        // TODO add your handling code here:
        //send File path array through the converter
        for (int i = 0; i < count; i++) {
            getInfoCv().append(fileArray[i]);
            Converter.start(fileArray[i]);
        }
    }//GEN-LAST:event_ResultsActionPerformed

    private void Remove_CVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_CVActionPerformed
        // TODO add your handling code here:
        //set last file path array component to blank
        fileArray[count] = "";
        //reduce count
        count = count - 1;
        if (count == 0) {
            Remove_CV.setEnabled(false);
            infoText.setText("Add CV's to compare to the Job Requirements.\nMaximum 10 at a time.");
        }
        //set components
        CV_count.setText("" + count + "");
    }//GEN-LAST:event_Remove_CVActionPerformed

    private void Remove_ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_ALLActionPerformed
        // TODO add your handling code here:
        //remove all file path array components
        for (int i = 0; i < count; i++) {
            fileArray[i] = "";
        }
        //set components
        Remove_CV.setEnabled(false);
        Remove_ALL.setEnabled(false);
        count = 0;
        //reset writing on screen
        CV_count.setText("" + count + "");
        infoText.setText("Add CV's to compare to the Job Requirements.\nMaximum 10 at a time.");
    }//GEN-LAST:event_Remove_ALLActionPerformed

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
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_CV;
    private javax.swing.JLabel CV_count;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem JobForm;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem Remove_ALL;
    private javax.swing.JMenuItem Remove_CV;
    private javax.swing.JMenuItem Results;
    private javax.swing.JScrollPane cvPaste;
    private javax.swing.JFileChooser fileChooser;
    private static javax.swing.JTextArea infoCv;
    private static javax.swing.JTextArea infoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public static JTextArea getInfoCv()
    {
        return infoCv;
    }
    
    public static void setInfoCv(JTextArea infoCv)
    {
        FileChooser.infoCv = infoCv;
    }
    
    class MyCustomFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".pdf") || file.getAbsolutePath().endsWith(".doc") || file.getAbsolutePath().endsWith(".docx");
        }

        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.PDF)(*.Docx)(*.Doc)(*.txt)";
        }
    }
}
