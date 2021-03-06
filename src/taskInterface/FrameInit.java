package taskInterface;


import com.sun.glass.events.KeyEvent;
import gestorDeTarea.TaskController;
import gestorDeTarea.TaskModel;
import java.awt.BorderLayout;

/**
 *
 * @author fmollea
 */
public class FrameInit extends javax.swing.JFrame {
    
    private static TaskController taskController;
    /**
     * Creates new form FrameInit
     */
    public FrameInit() {
        taskController = TaskController.getInstance();
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

        taskDescriptionArea = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        addTaskButton = new javax.swing.JButton();
        taskTittleField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        taskListButton = new javax.swing.JButton();
        taskEditButton = new javax.swing.JButton();
        taskDeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        taskCompleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addTaskButton.setText("Crear");
        addTaskButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addTaskButtonMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTaskButtonMouseClicked(evt);
            }
        });
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });
        addTaskButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addTaskButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addTaskButtonKeyReleased(evt);
            }
        });

        jLabel1.setText("Gestor de Tareas");

        taskListButton.setText("Listar");
        taskListButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taskListButtonMousePressed(evt);
            }
        });
        taskListButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taskListButtonKeyPressed(evt);
            }
        });

        taskEditButton.setText("Editar");
        taskEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taskEditButtonMousePressed(evt);
            }
        });
        taskEditButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taskEditButtonKeyPressed(evt);
            }
        });

        taskDeleteButton.setText("Eliminar");
        taskDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taskDeleteButtonMousePressed(evt);
            }
        });
        taskDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskDeleteButtonActionPerformed(evt);
            }
        });
        taskDeleteButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taskDeleteButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                taskDeleteButtonKeyReleased(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Titulo de la tarea");

        jLabel3.setText("Descripcion de la tarea");

        taskCompleteButton.setText("Completar");
        taskCompleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taskCompleteButtonMousePressed(evt);
            }
        });
        taskCompleteButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taskCompleteButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taskTittleField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 9, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taskCompleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(addTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taskListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taskEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taskDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTaskButton)
                    .addComponent(taskTittleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(taskListButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskEditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskDeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskCompleteButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTaskButtonActionPerformed

    private void addTaskButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTaskButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addTaskButtonMouseClicked
    
    // create a task when a press with mouse
    private void addTaskButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTaskButtonMousePressed
        if (evt.getSource() == addTaskButton) {
            TaskModel t = new TaskModel(taskTittleField.getText(), jTextArea1.getText());
            taskController.addTask(t);
            taskTittleField.setText("");
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_addTaskButtonMousePressed
    // create a task when a press enter
    private void addTaskButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addTaskButtonKeyReleased
        
    }//GEN-LAST:event_addTaskButtonKeyReleased

    private void taskDeleteButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskDeleteButtonMousePressed
   
            FrameDelete myFrameDelete = new FrameDelete();
            myFrameDelete.setVisible(true);
    
    }//GEN-LAST:event_taskDeleteButtonMousePressed

    private void taskDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskDeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskDeleteButtonActionPerformed

    private void taskDeleteButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taskDeleteButtonKeyReleased
        
    }//GEN-LAST:event_taskDeleteButtonKeyReleased

    private void addTaskButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addTaskButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            TaskModel t = new TaskModel(taskTittleField.getText(), jTextArea1.getText());
            taskController.addTask(t);
            taskTittleField.setText("");
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_addTaskButtonKeyPressed

    private void taskDeleteButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taskDeleteButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            FrameDelete myFrameDelete = new FrameDelete();
            myFrameDelete.setVisible(true);
        }
    }//GEN-LAST:event_taskDeleteButtonKeyPressed

    private void taskEditButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taskEditButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            FrameEditar myFrameEdit = new FrameEditar();
            myFrameEdit.setVisible(true);
        }
    }//GEN-LAST:event_taskEditButtonKeyPressed

    private void taskEditButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskEditButtonMousePressed
        FrameEditar myFrameEdit = new FrameEditar();
        myFrameEdit.setVisible(true);
    }//GEN-LAST:event_taskEditButtonMousePressed

    private void taskListButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taskListButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            FrameListar myFrameList = new FrameListar();
            myFrameList.setVisible(true);
        }
    }//GEN-LAST:event_taskListButtonKeyPressed

    private void taskListButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskListButtonMousePressed
        FrameListar myFrameList = new FrameListar();
        myFrameList.setVisible(true);
    }//GEN-LAST:event_taskListButtonMousePressed

    private void taskCompleteButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taskCompleteButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            FrameComplete myFrameComplete = new FrameComplete();
            myFrameComplete.setVisible(true);
        }
    }//GEN-LAST:event_taskCompleteButtonKeyPressed

    private void taskCompleteButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskCompleteButtonMousePressed
        FrameComplete myFrameComplete = new FrameComplete();
        myFrameComplete.setVisible(true);
    }//GEN-LAST:event_taskCompleteButtonMousePressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        dispose();
    }//GEN-LAST:event_jButton1MousePressed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTaskButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton taskCompleteButton;
    private javax.swing.JButton taskDeleteButton;
    private javax.swing.JTextField taskDescriptionArea;
    private javax.swing.JButton taskEditButton;
    private javax.swing.JButton taskListButton;
    private javax.swing.JTextField taskTittleField;
    // End of variables declaration//GEN-END:variables
}
