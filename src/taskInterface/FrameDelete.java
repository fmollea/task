/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskInterface;

import com.sun.glass.events.KeyEvent;
import gestorDeTarea.TaskController;
import gestorDeTarea.TaskModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fmollea
 */


public class FrameDelete extends javax.swing.JFrame {
private static TaskController taskController;
    /**
     * Creates new form FrameDelete
     */
    public FrameDelete() {
        taskController = TaskController.getInstance();
        initComponents();
        showList();
    }
    
    public void showList(){
        ArrayList<TaskModel> myTask = new ArrayList<TaskModel>();
        myTask = taskController.listOfTask();
        
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        model.addColumn("Titulo");
        model.addColumn("Descripcion");
        model.addColumn("Estado");
        model.setRowCount(myTask.size());
        
        
        for (int i = 0; i < myTask.size(); i++) {
            model.setValueAt(myTask.get(i).getTittle(), i, 0);
            model.setValueAt(myTask.get(i).getDescription(), i, 1);
            if (myTask.get(i).getComplete() == 1){
                model.setValueAt("Completa", i, 2);
            } else {
                model.setValueAt("sin Completar", i, 2);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tittleField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestor de Tareas");

        jLabel2.setText("Ingrese titulo de la tarea");

        deleteButton.setText("Eliminar");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteButtonMouseReleased(evt);
            }
        });
        deleteButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deleteButtonKeyReleased(evt);
            }
        });

        menuButton.setText("Volver Menu");
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuButtonMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
        });
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        menuButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                menuButtonKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                menuButtonKeyReleased(evt);
            }
        });

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tittleField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(menuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseReleased
        taskController.deleteTask(tittleField.getText());
        tittleField.setText("");
       
    }//GEN-LAST:event_deleteButtonMouseReleased

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuButtonActionPerformed

    private void deleteButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteButtonKeyReleased
       
    }//GEN-LAST:event_deleteButtonKeyReleased

    private void menuButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMousePressed
        dispose();
    }//GEN-LAST:event_menuButtonMousePressed

    private void menuButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuButtonKeyReleased
        
    }//GEN-LAST:event_menuButtonKeyReleased

    private void menuButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuButtonKeyTyped
        
    }//GEN-LAST:event_menuButtonKeyTyped

    private void menuButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dispose();
        }
    }//GEN-LAST:event_menuButtonKeyPressed

    private void deleteButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteButtonKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            taskController.deleteTask(tittleField.getText());
            tittleField.setText("");
            
        }
    }//GEN-LAST:event_deleteButtonKeyPressed

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        
    }//GEN-LAST:event_menuButtonMouseClicked

    private void menuButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseReleased
        dispose();
    }//GEN-LAST:event_menuButtonMouseReleased

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTable;
    private javax.swing.JButton menuButton;
    private javax.swing.JTextField tittleField;
    // End of variables declaration//GEN-END:variables
}
