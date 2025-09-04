package Telas;

import Model.Usuario;
import javax.swing.JOptionPane;

/**
 * JDialog que apresenta as opções principais do sistema para o usuário logado.
 *
 * Responsabilidades: - Receber o objeto Usuario que acabou de logar - Exibir
 * quem está logado (nome e cargo) no título da janela - Oferecer botões para
 * abrir cada tela de cadastro (Tutor, Pet, Agenda) - Encerrar a aplicação com
 * confirmação ao clicar em "Sair"
 *
 * Observações: - Esta tela é modal (bloqueia a janela pai enquanto estiver
 * aberta) porque o construtor recebe "modal = true". - Os botões abrem outras
 * janelas como diálogos independentes.
 *
 * @author Pedro
 */
public class EscolhaOpcoes extends javax.swing.JDialog {
// Mantém referência ao usuário logado para exibir informações e,
    // se desejado, controlar permissões (ex.: habilitar/desabilitar opções).

    private Usuario usuarioLogado;

    /**
     * Construtor principal.
     *
     * @param parent janela pai (pode ser o JFrame do sistema)
     * @param modal define se este diálogo é modal (bloqueia a janela pai)
     * @param usuarioLogado objeto vindo do processo de login, contendo
     * nome/cargo
     */
    public EscolhaOpcoes(java.awt.Frame parent, boolean modal, Usuario usuarioLogado) {
        super(parent, modal); // chama construtor de JDialog para montar a base da janela
        initComponents();  // método gerado pelo NetBeans que cria e posiciona os componentes
        this.usuarioLogado = usuarioLogado; // guarda o usuário para uso na tela

        // Personaliza o título da janela mostrando quem está logado e qual o cargo.
        // Ex.: "Opções - Logado como: Maria [admin]"
        setTitle("Opções - Logado como: " + usuarioLogado.getNome() + " [" + usuarioLogado.getCargo() + "]");
    }

    /**
     * private void verificarPermissao() { if (!"admin".equals(ControleLogin)) {
     * CadastroColaborador.setEnabled(false); } }
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEscolhaOpcao = new javax.swing.JPanel();
        txtOpcao = new javax.swing.JLabel();
        CadastroTutor = new javax.swing.JButton();
        CadastroPet = new javax.swing.JButton();
        CadastroAgenda = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelEscolhaOpcao.setBackground(new java.awt.Color(255, 255, 204));

        txtOpcao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtOpcao.setText("Escolha uma das opções");

        CadastroTutor.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CadastroTutor.setText("Cadastro Tutor");
        CadastroTutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        CadastroTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroTutorActionPerformed(evt);
            }
        });

        CadastroPet.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CadastroPet.setText("Cadastro Pet");
        CadastroPet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        CadastroPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroPetActionPerformed(evt);
            }
        });

        CadastroAgenda.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CadastroAgenda.setText("Cadastro Agenda");
        CadastroAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        CadastroAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroAgendaActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sair.setText("Sair");
        Sair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEscolhaOpcaoLayout = new javax.swing.GroupLayout(jPanelEscolhaOpcao);
        jPanelEscolhaOpcao.setLayout(jPanelEscolhaOpcaoLayout);
        jPanelEscolhaOpcaoLayout.setHorizontalGroup(
            jPanelEscolhaOpcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEscolhaOpcaoLayout.createSequentialGroup()
                .addGroup(jPanelEscolhaOpcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEscolhaOpcaoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtOpcao))
                    .addGroup(jPanelEscolhaOpcaoLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanelEscolhaOpcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CadastroPet, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastroTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastroAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEscolhaOpcaoLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanelEscolhaOpcaoLayout.setVerticalGroup(
            jPanelEscolhaOpcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEscolhaOpcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOpcao)
                .addGap(18, 18, 18)
                .addComponent(CadastroTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CadastroPet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CadastroAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEscolhaOpcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEscolhaOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handler do botão "Cadastro Tutor". Abre a tela de cadastro de tutor como
     * um JDialog modal. setLocationRelativeTo(this) centraliza a nova janela em
     * relação a ESTA.
     */
    private void CadastroTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroTutorActionPerformed
        // parent = null cria o diálogo sem dono; como logo abaixo usamos
        // setLocationRelativeTo(this), a tela abrirá centralizada em relação a esta janela.

        CadastroTutor telaTutor = new CadastroTutor(null, true);
        telaTutor.setLocationRelativeTo(this);
        telaTutor.setVisible(true);
    }//GEN-LAST:event_CadastroTutorActionPerformed
    /**
     * Handler do botão "Cadastro Pet". Abre a tela de cadastro de pet como
     * JDialog modal.
     */
    private void CadastroPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroPetActionPerformed
        CadastroPet telaPet = new CadastroPet(null, true);
        telaPet.setLocationRelativeTo(this);
        telaPet.setVisible(true);
    }//GEN-LAST:event_CadastroPetActionPerformed
    /**
     * Handler do botão "Cadastro Agenda". Abre a tela de cadastro de
     * agenda/consultas como JDialog modal.
     */
    private void CadastroAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroAgendaActionPerformed
        CadastroAgenda telaAgenda = new CadastroAgenda(null, true);
        telaAgenda.setLocationRelativeTo(this);
        telaAgenda.setVisible(true);
    }//GEN-LAST:event_CadastroAgendaActionPerformed
    /**
     * Handler do botão "Sair". Mostra diálogo de confirmação. Se "Sim", encerra
     * a aplicação com System.exit(0).
     *
     */
    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            System.exit(0); // Encerra toda a aplicação
        }


    }//GEN-LAST:event_SairActionPerformed
    /*
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
            // --- INÍCIO: criar um Usuario "fake" só para TESTAR esta tela isoladamente ---
            Usuario fake = new Usuario();
            fake.setNome("Admin");
            fake.setCargo("admin");
            // --- FIM ---
            
            EscolhaOpcoes dialog = new EscolhaOpcoes(new javax.swing.JFrame(), true, fake);
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
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroAgenda;
    private javax.swing.JButton CadastroPet;
    private javax.swing.JButton CadastroTutor;
    private javax.swing.JButton Sair;
    private javax.swing.JPanel jPanelEscolhaOpcao;
    private javax.swing.JLabel txtOpcao;
    // End of variables declaration//GEN-END:variables
}
