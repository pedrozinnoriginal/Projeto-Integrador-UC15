package Telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Agenda;
import Service.AgendaService;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Pedro
 */
public class CadastroAgenda extends javax.swing.JDialog {

    private void ConfigurarTooltips() {
        txtdiaConsulta.setToolTipText("Digite o dia da consulta - Ex: 07/01/2026");
        txthorarioConsulta.setToolTipText("Digite o horário  da consulta - Ex: 14:30");
        txtnomePet.setToolTipText("Digite o nome do Pet ");
    }

    private void LimparCampos() {
        txtdiaConsulta.setText("");
        txthorarioConsulta.setText("");
        txtnomePet.setText("");
        txtdiaConsulta.requestFocus();
    }

    public CadastroAgenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        ConfigurarTooltips();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelCadastroAgenda = new javax.swing.JLabel();
        txtnomePet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAgenda = new javax.swing.JTable();
        nomePet = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        horarioConsulta = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        diaConsulta = new javax.swing.JLabel();
        txtdiaConsulta = new javax.swing.JTextField();
        txthorarioConsulta = new javax.swing.JTextField();
        txtPesquisa = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnPesquisaPet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabelCadastroAgenda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelCadastroAgenda.setText("Cadastro Agenda");

        TabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome do Pet", "Dia da Consulta", "Horário da consulta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaAgenda);

        nomePet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomePet.setText("Nome do Pet");
        nomePet.setToolTipText("");

        voltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        horarioConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        horarioConsulta.setText("Horário da consulta");

        enter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enter.setText("Entre");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        diaConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        diaConsulta.setText("Dia da Consulta");

        txtPesquisa.setPreferredSize(new java.awt.Dimension(26, 26));

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnPesquisaPet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPesquisaPet.setText("Pesquisa Pet");
        btnPesquisaPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaPetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomePet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(horarioConsulta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthorarioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabelCadastroAgenda))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(diaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPesquisaPet)
                                .addGap(28, 28, 28)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCadastroAgenda)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePet))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthorarioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horarioConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaPet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        try {
            String nomePetInformado = txtnomePet.getText().trim();

            if (nomePetInformado.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, informe o nome do pet.");
                return;
            }

            Agenda agenda = new Agenda();
            DateTimeFormatter dataFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter horaFmt = DateTimeFormatter.ofPattern("HH:mm");

            // Captura data e hora
            agenda.setDiaConsulta(LocalDate.parse(txtdiaConsulta.getText().trim(), dataFmt));
            agenda.setHorarioConsulta(LocalTime.parse(txthorarioConsulta.getText().trim(), horaFmt));

            AgendaService service = new AgendaService();
            // Chama o novo método que busca o ID pelo nome antes de salvar
            int idAgenda = service.cadastrarAgendaPorNome(nomePetInformado, agenda);

            // Atualiza a tabela na tela
            DefaultTableModel model = (DefaultTableModel) TabelaAgenda.getModel();
            model.addRow(new Object[]{
                nomePetInformado.toUpperCase(),
                txtdiaConsulta.getText(),
                txthorarioConsulta.getText()
            });

            JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso para " + nomePetInformado);
            LimparCampos();

        } catch (java.time.format.DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data (dd/mm/aaaa) ou hora (hh:mm) inválido.");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_enterActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
        JOptionPane.showMessageDialog(this, "Campos resetados!");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisaPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaPetActionPerformed
        String nomePesquisa = txtPesquisa.getText().trim();

        if (nomePesquisa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o nome do pet.");
            return;
        }

        try {
            AgendaService service = new AgendaService();
            java.util.List<Agenda> lista = service.listarAgendasPorNomePet(nomePesquisa);

            DefaultTableModel model = (DefaultTableModel) TabelaAgenda.getModel();
            model.setNumRows(0); // Limpa as linhas antigas da JTable

            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhum agendamento para o pet: " + nomePesquisa);
            } else {
                DateTimeFormatter dataFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter horaFmt = DateTimeFormatter.ofPattern("HH:mm");

                for (Agenda a : lista) {
                    model.addRow(new Object[]{
                        nomePesquisa, // Exibe o nome que você buscou
                        a.getDiaConsulta().format(dataFmt),
                        a.getHorarioConsulta().format(horaFmt)
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_btnPesquisaPetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroAgenda dialog = new CadastroAgenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaAgenda;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisaPet;
    private javax.swing.JLabel diaConsulta;
    private javax.swing.JButton enter;
    private javax.swing.JLabel horarioConsulta;
    private javax.swing.JLabel jLabelCadastroAgenda;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomePet;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtdiaConsulta;
    private javax.swing.JTextField txthorarioConsulta;
    private javax.swing.JTextField txtnomePet;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
