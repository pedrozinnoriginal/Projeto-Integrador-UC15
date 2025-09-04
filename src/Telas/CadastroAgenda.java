package Telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DAO.AgendaDAO;
import Model.Agenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

/**
 * Tela de cadastro de Agenda (consultas). Integração pronta com AgendaDAO.
 *
 * @author Pedro
 */
public class CadastroAgenda extends javax.swing.JDialog {

    /**
     * // Formatos que vamos aceitar: dd/MM/yyyy e HH:mm private static final
     * DateTimeFormatter FORMATTER_DATE =
     * DateTimeFormatter.ofPattern("dd/MM/yyyy"); private static final
     * DateTimeFormatter FORMATTER_TIME = DateTimeFormatter.ofPattern("HH:mm");
     */
    /**
     * Configura dicas (tooltips) para os campos: ajuda o usuário informando o
     * que cada campo espera.
     */
    private void ConfigurarTooltips() {
        txtDiaConsulta.setToolTipText("Digite o dia da consulta ");
        txtHorarioConsulta.setToolTipText("Digite o horário  da consulta ");
        txtNomePet.setToolTipText("Digite o nome do Pet ");
    }

    /*
    private void ConfigurarTooltips() {
        txtDiaConsulta.setToolTipText("Digite o dia da consulta no formato dd/MM/yyyy");
        txtHorarioConsulta.setToolTipText("Digite o horário no formato HH:mm (24h)");
        txtNomePet.setToolTipText("Digite o nome do Pet");
    }
     */
    /**
     * Limpa os campos do formulário e posiciona o foco no campo Dia (bom para
     * inserir várias consultas).
     */
    private void LimparCampos() {
        txtDiaConsulta.setText("");
        txtHorarioConsulta.setText("");
        txtNomePet.setText("");
        txtDiaConsulta.requestFocus();
    }

    /**
     * Construtor do diálogo: chama initComponents (gerado pelo NetBeans) e faz
     * configurações iniciais.
     */
    public CadastroAgenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); // cria e posiciona todos os componentes Swing
        ConfigurarTooltips();  // configura as dicas dos campos
        //loadAgendaTable(); // Ao abrir a tela, carregamos a tabela com os dados já salvos no BD.

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelCadastroAgenda = new javax.swing.JLabel();
        txtNomePet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaAgenda = new javax.swing.JTable();
        NomePet = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        HorarioConsulta = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();
        DiaConsulta = new javax.swing.JLabel();
        txtDiaConsulta = new javax.swing.JTextField();
        txtHorarioConsulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabelCadastroAgenda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelCadastroAgenda.setText("Cadastro Agenda");

        TabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        NomePet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomePet.setText("Nome do Pet");
        NomePet.setToolTipText("");

        Voltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        HorarioConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HorarioConsulta.setText("Horário da consulta");

        Enter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enter.setText("Entre");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        DiaConsulta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DiaConsulta.setText("Dia da Consulta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomePet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(HorarioConsulta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHorarioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabelCadastroAgenda))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCadastroAgenda)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomePet))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiaConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorarioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorarioConsulta))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
 /**
     * Método acionado quando usuário clica no botão "Enter" — faz validação,
     * cria objeto Agenda, grava no BD via AgendaDAO e atualiza a JTable.
     */
    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
// Lê e trim() para remover espaços antes/depois — bom para validação
        String nomePet = txtNomePet.getText().trim();
        String diaConsulta = txtDiaConsulta.getText().trim();
        String horarioConsulta = txtHorarioConsulta.getText().trim();
        // Validação simples: todos os campos obrigatórios
        if (nomePet.isEmpty() || diaConsulta.isEmpty() || horarioConsulta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        // Monta objeto Agenda (model) com os dados do formulário
        Agenda agenda = new Agenda();
        agenda.setNomePet(nomePet);
        agenda.setDiaConsulta(diaConsulta);
        agenda.setHorarioConsulta(horarioConsulta);

        // Salva no banco -  Cria o DAO responsável por persistir Agenda no banco
        AgendaDAO dao = new AgendaDAO();

        // 2) Insere no banco — o método retorna o id gerado (>0) ou -1 em erro
        int idGerado = dao.insert(agenda);
// 3) Se inseriu com sucesso (idGerado > 0), atualiza a tabela da tela e limpa o formulário

        if (idGerado > 0) {
            // Atualiza tabela da interface: pega o model e adiciona nova linha
            DefaultTableModel model = (DefaultTableModel) TabelaAgenda.getModel();
            model.addRow(new Object[]{nomePet, diaConsulta, horarioConsulta});

            JOptionPane.showMessageDialog(this, "Consulta cadastrada com sucesso! ID = " + idGerado);
            LimparCampos();  // limpa os campos para próximo registro
        } else {
            // Em caso de erro na persistência, avisa o usuário
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar consulta.");
        }

    }//GEN-LAST:event_EnterActionPerformed
    /**
     * Fecha o diálogo quando usuário pressiona Voltar.
     */
    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

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
    private javax.swing.JLabel DiaConsulta;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel HorarioConsulta;
    private javax.swing.JLabel NomePet;
    private javax.swing.JTable TabelaAgenda;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabelCadastroAgenda;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiaConsulta;
    private javax.swing.JTextField txtHorarioConsulta;
    private javax.swing.JTextField txtNomePet;
    // End of variables declaration//GEN-END:variables
}
