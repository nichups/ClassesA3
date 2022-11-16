/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dev;

import javax.swing.JTextField;

/**
 *
 * @author Victor
 */
public class ColaboradoresFormulario extends javax.swing.JFrame {

    /**
     * Creates new form ColaboradoresFormulario
     */
    public ColaboradoresFormulario() {
        setOper('C');
        initComponents();
    }

    /**
     * # Atributo de validação de ação no formulário
     * - C = criar usuário;
     * - A = alterar usuário;
     */
    private char oper = 'C';

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_funcao_group = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        user_nome = new javax.swing.JTextField();
        user_nome_label = new javax.swing.JLabel();
        user_email = new javax.swing.JTextField();
        user_email_label = new javax.swing.JLabel();
        user_funcao_label = new javax.swing.JLabel();
        user_funcao_colaborador = new javax.swing.JRadioButton();
        user_funcao_gestor = new javax.swing.JRadioButton();
        user_funcao_adm = new javax.swing.JRadioButton();
        user_fone = new javax.swing.JTextField();
        user_fone_label = new javax.swing.JLabel();
        user_cpf = new javax.swing.JTextField();
        user_cpf_label = new javax.swing.JLabel();
        user_endereco = new javax.swing.JTextField();
        user_endereco_label = new javax.swing.JLabel();
        user_numHoras = new javax.swing.JTextField();
        user_numHoras_label = new javax.swing.JLabel();
        user_salario = new javax.swing.JTextField();
        user_salario_label = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        if (this.oper == 'C') {
            title.setText("Cadastro de Usuários");
        } else if (this.oper == 'A') {
            title.setText("Atualização de Cadastro");
        }

        user_nome.setText("Insira o nome do usuário");
        user_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nomeActionPerformed(evt);
            }
        });

        user_nome_label.setText("Nome");

        user_email.setText("Insira o email do usuário");
        user_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_emailActionPerformed(evt);
            }
        });

        user_email_label.setText("Email");

        user_funcao_label.setText("Tipo de Usuário");

        user_funcao_group.add(user_funcao_colaborador);
        user_funcao_colaborador.setText("Colaborador");
        user_funcao_colaborador.setToolTipText("");
        user_funcao_colaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_funcao_colaboradorActionPerformed(evt);
            }
        });

        user_funcao_group.add(user_funcao_gestor);
        user_funcao_gestor.setText("Gestor");
        user_funcao_gestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_funcao_gestorActionPerformed(evt);
            }
        });

        user_funcao_group.add(user_funcao_adm);
        user_funcao_adm.setText("Administrador");
        user_funcao_adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_funcao_admActionPerformed(evt);
            }
        });

        user_fone.setText("Insira o telefone do usuário");
        user_fone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_foneActionPerformed(evt);
            }
        });

        user_fone_label.setText("Telefone");

        user_cpf.setText("Insira o cpf do usuário");
        user_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_cpfActionPerformed(evt);
            }
        });

        user_cpf_label.setText("CPF");

        user_endereco.setText("Insira o endereço do usuário");
        user_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_enderecoActionPerformed(evt);
            }
        });

        user_endereco_label.setText("Endereço");

        user_numHoras.setText("Insira o tempo disponível");
        user_numHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_numHorasActionPerformed(evt);
            }
        });

        user_numHoras_label.setText("Número de Horas");

        user_salario.setText("Pretensão");
        user_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_salarioActionPerformed(evt);
            }
        });

        user_salario_label.setText("Salário");

        btn_cancelar.setText("CANCELAR");

        if (this.oper == 'A') {
            btn_cadastrar.setText("ATUALIZAR");
            btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_cadastrarAtualizarActionPerformed(evt);
                }
            });
        } else if (this.oper == 'C') {
            btn_cadastrar.setText("CADASTRAR");
            btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn_cadastrarActionPerformed(evt);
                }
            });
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title)
                                .addGap(100, 100, 100))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_nome_label)
                                                                        .addComponent(user_nome,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_email_label)
                                                                        .addComponent(user_email,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_funcao_label)
                                                                        .addComponent(user_funcao_colaborador)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_fone_label)
                                                                        .addComponent(user_fone,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_cpf,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(user_cpf_label))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_funcao_gestor)
                                                                        .addComponent(user_funcao_adm)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_endereco_label)
                                                                        .addComponent(user_endereco,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_numHoras,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(user_numHoras_label))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user_salario_label)
                                                                        .addComponent(user_salario))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(user_funcao_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(user_funcao_colaborador))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(user_nome_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(user_nome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(user_email_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(user_email, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(user_fone_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(user_fone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(user_cpf_label)
                                                        .addComponent(user_funcao_gestor))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(user_cpf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(user_funcao_adm))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(user_endereco_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(user_endereco, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(user_numHoras_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(user_numHoras, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(user_salario_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(user_salario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(16, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_nomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_nomeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_nomeActionPerformed

    private void user_emailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_emailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_emailActionPerformed

    private void user_funcao_colaboradorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_funcao_colaboradorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_funcao_colaboradorActionPerformed

    private void user_funcao_gestorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_funcao_gestorActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_funcao_gestorActionPerformed

    private void user_funcao_admActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_funcao_admActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_funcao_admActionPerformed

    private void user_foneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_foneActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_foneActionPerformed

    private void user_cpfActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_cpfActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_cpfActionPerformed

    private void user_numHorasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_numHorasActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_numHorasActionPerformed

    private void user_salarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_salarioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_salarioActionPerformed

    private void user_enderecoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_user_salarioActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_user_salarioActionPerformed

    /**
     * Método de Definição de Operação do Formulário
     * 
     * @param $info
     */
    private void setOper(char $info) {
        this.oper = $info;
    }

    /**
     * Botão de Cadastro de Novos Usuários
     * 
     * @param evt
     */
    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        /**
         * Registro do Nome do Colaborador
         */
        String nome = user_nome.getText();

        /**
         * Registro de Email do Colaborador
         */
        String email = user_email.getText();

        /**
         * Registro de Telefone do Colaborador
         */
        String fone = user_fone.getText();

        /**
         * Registro de CPF do Colaborador
         */
        String cpf = user_cpf.getText();

        /**
         * Registro de Endereço do Colaborador
         */
        String endereco = user_endereco.getText();

        /**
         * Registro do Número de Horas do Colaborador
         */
        String numHoras = user_numHoras.getText();

        /**
         * Registro de Salário do Colaborador
         */
        String salario = user_salario.getText();

        // String funcao_group = user_funcao_group.getText();
        // String funcao_adm = user_funcao_adm.getText();
        // String funcao_colaborador = user_funcao_colaborador.getText();
        // String funcao_gestor = user_funcao_gestor.getText();

        System.out.println("CRIAR");
        System.out.println("new nome: " + nome);
        System.out.println("new salario: " + salario);
    }// GEN-LAST:event_btn_cadastrarActionPerformed

    /**
     * Botão de Cadastro de Novos Usuários
     * 
     * @param evt
     */
    private void btn_cadastrarAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        /**
         * Registro do Nome do Colaborador
         */
        String nome = user_nome.getText();

        /**
         * Registro de Email do Colaborador
         */
        String email = user_email.getText();

        /**
         * Registro de Telefone do Colaborador
         */
        String fone = user_fone.getText();

        /**
         * Registro de CPF do Colaborador
         */
        String cpf = user_cpf.getText();

        /**
         * Registro de Endereço do Colaborador
         */
        String endereco = user_endereco.getText();

        /**
         * Registro do Número de Horas do Colaborador
         */
        String numHoras = user_numHoras.getText();

        /**
         * Registro de Salário do Colaborador
         */
        String salario = user_salario.getText();

        // String funcao_group = user_funcao_group.getText();
        // String funcao_adm = user_funcao_adm.getText();
        // String funcao_colaborador = user_funcao_colaborador.getText();
        // String funcao_gestor = user_funcao_gestor.getText();

        System.out.println("ATUALIZAR");
        System.out.println("new nome: " + nome);
        System.out.println("new salario: " + salario);
    }// GEN-LAST:event_btn_cadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ColaboradoresFormulario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColaboradoresFormulario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColaboradoresFormulario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColaboradoresFormulario.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaboradoresFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel title;
    private javax.swing.JTextField user_cpf;
    private javax.swing.JTextField user_salario;
    private javax.swing.JLabel user_cpf_label;
    private javax.swing.JLabel user_salario_label;
    private javax.swing.JTextField user_email;
    private javax.swing.JLabel user_email_label;
    private javax.swing.JTextField user_endereco;
    private javax.swing.JLabel user_endereco_label;
    private javax.swing.JTextField user_fone;
    private javax.swing.JLabel user_fone_label;
    private javax.swing.JRadioButton user_funcao_adm;
    private javax.swing.JRadioButton user_funcao_colaborador;
    private javax.swing.JRadioButton user_funcao_gestor;
    private javax.swing.ButtonGroup user_funcao_group;
    private javax.swing.JLabel user_funcao_label;
    private javax.swing.JTextField user_nome;
    private javax.swing.JLabel user_nome_label;
    private javax.swing.JTextField user_numHoras;
    private javax.swing.JLabel user_numHoras_label;
    // End of variables declaration//GEN-END:variables
}
