package Telas;

import DAO.UsuarioDAO;
import Model.Usuario;
import Telas.EscolhaOpcoes;
import javax.swing.JOptionPane;

/**
 * Tela de Login do sistema.
 *
 * Responsabilidades desta classe: - Exibir campos para nome, senha e cargo
 * (visuais) - Ler as credenciais digitadas pelo usuário - Gerar o hash SHA-256
 * da senha - Autenticar o usuário via UsuarioDAO - Abrir a tela de opções
 * (EscolhaOpcoes) quando o login for bem-sucedido
 *
 * Observações: - Os componentes são montados pelo método initComponents(),
 * gerado pelo NetBeans.
 *
 * @author Pedro
 */
public class TelaLogin extends javax.swing.JFrame {

    //Inicio
    // ===================== MÉTODOS DE APOIO DA TELA (UI) =====================
    // Configura dicas (tooltips) para orientar o usuário ao passar o mouse sobre os campos.
    private void ConfigurarTooltips() {
        txtnome.setToolTipText("Por favor, digite seu Nome ");
        S_Senha.setToolTipText("Digite sua senha");
        txtcargo.setToolTipText("Digite seu Cargo");

    }
// Limpa os campos e coloca o foco no campo de nome.

    private void LimparCampos() {
        txtnome.setText("");
        S_Senha.setText("");
        txtcargo.setText("");
        txtnome.requestFocus();
    }

    //Fim
// ============================ CONSTRUTOR ============================
    public TelaLogin() {
        initComponents();  // Cria e posiciona todos os componentes (gerado pelo NetBeans)
        ConfigurarTooltips(); // Aplica tooltips nos campos
        setLocationRelativeTo(null); // Centraliza a janela na tela

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaLogin = new javax.swing.JPanel();
        txtPatasVida = new javax.swing.JLabel();
        txtTelaLogin = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        E_Entrar = new javax.swing.JButton();
        S_Sair = new javax.swing.JButton();
        txtnome = new javax.swing.JTextField();
        S_Senha = new javax.swing.JTextField();
        txtCargo = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaLogin.setBackground(new java.awt.Color(255, 255, 204));
        TelaLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        TelaLogin.setForeground(new java.awt.Color(204, 255, 255));

        txtPatasVida.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPatasVida.setText("Patas & Vida");

        txtTelaLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTelaLogin.setText("Tela de Login");

        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setLabelFor(txtnome);
        txtNome.setText("Nome");

        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.setLabelFor(S_Senha);
        txtSenha.setText("Senha");

        E_Entrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        E_Entrar.setText("Entrar");
        E_Entrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        E_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_EntrarActionPerformed(evt);
            }
        });

        S_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        S_Sair.setText("Sair");
        S_Sair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        S_Sair.setBorderPainted(false);
        S_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_SairActionPerformed(evt);
            }
        });

        txtCargo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCargo.setText("Cargo");

        javax.swing.GroupLayout TelaLoginLayout = new javax.swing.GroupLayout(TelaLogin);
        TelaLogin.setLayout(TelaLoginLayout);
        TelaLoginLayout.setHorizontalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaLoginLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelaLogin)
                            .addComponent(txtPatasVida)))
                    .addGroup(TelaLoginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtSenha)
                            .addComponent(txtCargo))
                        .addGap(33, 33, 33)
                        .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(E_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(S_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        TelaLoginLayout.setVerticalGroup(
            TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPatasVida)
                .addGap(18, 18, 18)
                .addComponent(txtTelaLogin)
                .addGap(27, 27, 27)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome))
                .addGap(18, 18, 18)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha)
                    .addComponent(S_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo))
                .addGap(18, 18, 18)
                .addGroup(TelaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void E_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_EntrarActionPerformed
        //Inicio

        String nome = txtnome.getText();
        String senha = S_Senha.getText();

        // Criptografar senha com SHA-256
        String senhaCriptografada = Seguranca.Criptografia.getSHA256(senha);

        // Criar DAO e tentar autenticar
        DAO.UsuarioDAO dao = new DAO.UsuarioDAO();
        Usuario usuarioLogado = dao.autenticar(nome, senhaCriptografada);

        if (usuarioLogado != null) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");

            // Abrir a tela de opções já passando o usuário
            EscolhaOpcoes tela = new EscolhaOpcoes(null, true, usuarioLogado);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);

            dispose(); // Fecha a tela de login
        } else {
            JOptionPane.showMessageDialog(this, "Nome ou senha inválidos.");
        }

// Fim
    }//GEN-LAST:event_E_EntrarActionPerformed

    private void S_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_S_SairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton E_Entrar;
    private javax.swing.JButton S_Sair;
    private javax.swing.JTextField S_Senha;
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JLabel txtCargo;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtPatasVida;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtTelaLogin;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
