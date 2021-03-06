/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school_management_system;


import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;
/**
 *
 * @author arya_veer
 */
public class UpdateTeacherNew extends javax.swing.JFrame {
    HashMap<String,ArrayList<String>> courseMap = Course.getCourseList();
    ArrayList<String> courselist = new ArrayList<String>(courseMap.keySet());
    /**
     * Creates new form UpdateTeacherNew
     */
    public UpdateTeacherNew() {
        initComponents();
        jButton3.setVisible(false);
        
        String str = " ";
        
        for(int j = 0; j<courselist.size();j++){
            str = str.concat(courselist.get(j));
            str = str.concat(",");
        }
        
        String[] CourseIDs = str.split(",");
        C3.setModel(new javax.swing.DefaultComboBoxModel<>(CourseIDs));
        
        L1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        U1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        P1 = new javax.swing.JPasswordField();
        T2 = new javax.swing.JTextField();
        C1 = new javax.swing.JComboBox<>();
        C2 = new javax.swing.JComboBox<>();
        C3 = new javax.swing.JComboBox<>();
        T4 = new javax.swing.JTextField();
        R1 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        R3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        A1 = new javax.swing.JTextArea();
        T3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        L1 = new javax.swing.JList<>();
        T5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("UUID");

        jLabel2.setText("TEACHER NAME");

        jLabel3.setText("PASSWORD");

        jLabel4.setText("DOB");

        jLabel5.setText("COURSE");

        jLabel6.setText("SALARY");

        jLabel7.setText("SEX");

        jLabel8.setText("ADDRESS");

        jLabel9.setText("EMAIL");

        jLabel10.setText("CLASSES");

        jLabel11.setText("ATTENDENCE");

        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        R1.setText("MALE");

        R2.setText("FEMALE");

        R3.setText("OTHERS");

        A1.setColumns(20);
        A1.setRows(5);
        jScrollPane1.setViewportView(A1);

        jScrollPane2.setViewportView(L1);

        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });

        jButton2.setText("GET DETAILS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(U1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(T2))
                                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(T4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addComponent(R2)
                                .addGap(18, 18, 18)
                                .addComponent(R3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(U1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R2)
                            .addComponent(R1)
                            .addComponent(R3))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(113, 113, 113)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TeacherDetails().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int x = 0;

        boolean b = new Teacher(UUID.fromString(U1.getText()),null,null,null,
                                ' ',null,null,null,null,0.0,0).inTeacherList();

        ArrayList<Integer> stdlist = new ArrayList<>();
        

        int std = 0;

        if(!b){
            JOptionPane.showMessageDialog(this,"Invalid UUID");
            U1.setText("");
            T1.setText(" ");
            T2.setText(" ");
            T3.setText(" ");
            T4.setText(" ");
            T5.setText(" ");
            P1.setText("");
            A1.setText(" ");
            L1.clearSelection();
            C1.setSelectedIndex(0);
            C2.setSelectedIndex(0);
            C3.setSelectedIndex(0);
            R1.setSelected(true);
       }

       else{

        char sex = 'M';
        int month = 1;

        UUID uuid = UUID.fromString(U1.getText());

        String courseID = (String) C3.getSelectedItem();
        
        if(R1.isSelected()){
            sex ='M';
        }
        else if(R2.isSelected()){
            sex = 'F';
        }
        else if(R3.isSelected()){
            sex = 'O';
        }
        else{
            x = 1;
            JOptionPane.showMessageDialog(this,"Invalid Sex");
        }

        int[] stdint = L1.getSelectedIndices();
        for(int k = 0;k< stdint.length;k++)stdint[k]++;

        stdlist.addAll(Arrays.stream(stdint).boxed().collect(Collectors.toList()));

        switch((String)C2.getSelectedItem()){

            case "January"  :month = 1; break;
            case "February" :month = 2; break;
            case "March"    :month = 3; break;
            case "April"    :month = 4; break;
            case "May"      :month = 5; break;
            case "June"     :month = 6; break;
            case "July"     :month = 7; break;
            case "August"   :month = 8; break;
            case "September":month = 9; break;
            case "October"  :month = 10;break;
            case "November" :month = 11;break;
            case "December" :month = 12;break;
            default:
            x = 1;
            JOptionPane.showMessageDialog(this,"Incorrect Month");
        }

        String datestr = T2.getText() + "-" +
        month + "-" +
        (String)C1.getSelectedItem();

        Date date = Date.valueOf(datestr);
        
        double salary = Double.parseDouble(T4.getText());

        Teacher upteacher = new Teacher(uuid,T1.getText().trim(),P1.getText().trim(),
                                      date,sex,A1.getText().trim(),T3.getText().trim(),
                                      courseID,stdlist,salary,Integer.parseInt(T5.getText()));

        //Get the concerned teacher

        boolean c = upteacher.inTeacherList();

        if(!c){
            int ans = JOptionPane.showConfirmDialog(this,"Teacher doesn't exist. Add Teacher?");

            if(ans == 0){

                int radio  = 0;

                if(R1.isSelected()){
                    radio = 1;
                }
                else if(R2.isSelected()){
                    radio = 2;
                }
                else if(R3.isSelected()){
                    radio = 3;
                }

                new AddTeacher(T1.getText(),P1.getText(),C1.getSelectedIndex(),
                    C2.getSelectedIndex(),T2.getText(),courseID,radio,T4.getText(),
                    A1.getText(),T3.getText(),L1.getSelectedIndices()).setVisible(true);
                this.dispose();
            }
            else if(ans == 2) {
                this.dispose();
            }
            else if(ans == 1){
                U1.setText(" ");
                T1.setText(" ");
                T2.setText(" ");
                T3.setText(" ");
                T4.setText(" ");
                T5.setText(" ");
                P1.setText("");
                A1.setText(" ");
                L1.clearSelection();
                C1.setSelectedIndex(0);
                C2.setSelectedIndex(0);
                C3.setSelectedIndex(0);
                R1.setSelected(true);
            }
        }
        //Write it to file
        else if(x == 0){
            upteacher.replaceTeacher(uuid.toString());
            JOptionPane.showMessageDialog(this,"Data Successfully Updated");
            U1.setText(" ");
            T1.setText(" ");
            T2.setText(" ");
            T3.setText(" ");
            T4.setText(" ");
            T5.setText(" ");
            P1.setText("");
            A1.setText(" ");
            L1.clearSelection();
            C1.setSelectedIndex(0);
            C2.setSelectedIndex(0);
            C3.setSelectedIndex(0);
            R1.setSelected(true);
        }
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 boolean d = new Teacher(UUID.fromString(U1.getText()),null,null,null,
                                ' ',null,null,null,null,0.0,0).inTeacherList();


            if(d){
                Teacher teacher = new Teacher(UUID.fromString(U1.getText()));

                T1.setText(teacher.getUsername());
                P1.setText(teacher.getPass());

                String strdate = String.valueOf(teacher.getBDay());
                String[] date = strdate.split("-");
                C1.setSelectedIndex(Integer.parseInt(date[2])-1);
                C2.setSelectedIndex(Integer.parseInt(date[1])-1);
                T2.setText(date[0]);

                C3.setSelectedItem(teacher.getCourseID());

                switch(teacher.getSex()){
                    case 'M' :R1.setSelected(true); break;
                    case 'F' :R2.setSelected(true); break;
                    case 'O' :R3.setSelected(true); break;
                    default: System.out.print("error");
                }

                A1.setText(teacher.getAddress());
                T3.setText(teacher.getEmail());

                int[] indices = teacher.getStdList().stream().mapToInt(i->i).toArray();
                
                for(int k = 0;k< indices.length;k++)indices[k]--;
                
                L1.setSelectedIndices(indices);

                T4.setText(Double.toString(teacher.getSalary()));   
                T5.setText(Integer.toString(teacher.getAttendence()));
            }
        

        else{
            int ans = JOptionPane.showConfirmDialog(this,"Teacher doesn't exist. Add Teacher?");

            if(ans == 0){

                int radio  = 0;

                if(R1.isSelected()){
                    radio = 1;
                }
                else if(R2.isSelected()){
                    radio = 2;
                }
                else if(R3.isSelected()){
                    radio = 3;
                }

                new AddTeacher(T1.getText(),P1.getText(),C1.getSelectedIndex(),
                    C2.getSelectedIndex(),T2.getText(),(String)C3.getSelectedItem(),radio,T4.getText(),
                    A1.getText(),T3.getText(),L1.getSelectedIndices()).setVisible(true);
                this.dispose();
            }
            else if(ans == 2) {
                this.dispose();
            }
            else if(ans == 1){
                U1.setText(" ");
                T1.setText(" ");
                T2.setText(" ");
                T3.setText(" ");
                T4.setText(" ");
                T5.setText(" ");
                P1.setText("");
                A1.setText(" ");
                L1.clearSelection();
                C1.setSelectedIndex(0);
                C2.setSelectedIndex(0);
                C3.setSelectedIndex(0);
                R1.setSelected(true);
            }
        }
        jButton3.setVisible(true);
        jButton2.setVisible(false);
          
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        Teacher.closeTeacherFile();
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
            java.util.logging.Logger.getLogger(UpdateTeacherNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTeacherNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTeacherNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTeacherNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTeacherNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea A1;
    private javax.swing.JComboBox<String> C1;
    private javax.swing.JComboBox<String> C2;
    private javax.swing.JComboBox<String> C3;
    private javax.swing.JList<String> L1;
    private javax.swing.JPasswordField P1;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField U1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
