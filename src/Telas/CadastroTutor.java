package Telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Diálogo para cadastro de Tutor.
 *
 * Observações gerais: - A UI (initComponents) foi gerada pelo NetBeans — evite
 * editar manualmente aquela parte se quiser continuar usando o editor visual.
 * Comentários explicam onde colocar lógica. - O fluxo principal acontece no
 * EnterActionPerformed: 1) ler campos da tela 2) validar 3) montar objeto
 * Model.Tutor 4) chamar DAO para persistir 5) feedback ao usuário / limpar
 * campos
 *
 * Melhorias recomendadas (após entender o fluxo): - validar formatos (CPF, CEP,
 * telefone, email) antes de persistir - executar inserção em background
 * (SwingWorker) para não travar a UI - tratar exceções do DAO mostrando
 * mensagem amigável e logando o erro
 *
 * @author Pedro
 */
public class CadastroTutor extends javax.swing.JDialog {

    /**
     * Define textos de ajuda (tooltips) para os campos da tela. Chamado no
     * construtor para melhorar a usabilidade.
     */
    private void ConfigurarTooltips() {
        Nome.setToolTipText("Por favor, digite o nome do tutor ");
        txtTelefone.setToolTipText("Informe o telefone do tutor ");
        txtEstado.setToolTipText("Qual o Estado ");
        NomeDoPet.setToolTipText("Por favor, digite o nome do pet do tutor ");
        txtEndereco.setToolTipText("Qual o endereço do tutor ");
        txtEmail.setToolTipText("Qual o e-mail do tutor ");
        txtCidade.setToolTipText("Qual a cidade do tutor ");
        txtCEP.setToolTipText("Por favor, digite o nome do produto ");
        txtBairro.setToolTipText("Qual o CEP do tutor ");
        txtobservacao.setToolTipText("Faça aqui a sua obervação ");
        TxtCPF.setToolTipText("Qual o CPF do tutor ");
    }

    /**
     * Limpa todos os campos do formulário e posiciona o foco no campo Nome.
     * Usado após cadastro bem sucedido ou quando o usuário desejar reiniciar o
     * preenchimento.
     */
    private void LimparCampos() {
        txtTelefone.setText("");
        txtEstado.setText("");
        NomeDoPet.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        txtCidade.setText("");
        txtCEP.setText("");
        txtBairro.setText("");
        Nome.setText("");
        TxtCPF.setText("");
        txtobservacao.setText("");
        Nome.requestFocus();
    }

    /**
     * Construtor do diálogo. Chama initComponents() (gerado) e configura
     * tooltips.
     */
    public CadastroTutor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();  // cria e posiciona componentes (NetBeans)
        ConfigurarTooltips();  // adiciona dicas de uso aos campos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tutor = new javax.swing.JPanel();
        CadastroTutor = new javax.swing.JLabel();
        NomeTutor = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        NomePet = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Observacao = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        Nome = new javax.swing.JTextField();
        TxtCPF = new javax.swing.JTextField();
        NomeDoPet = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtobservacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tutor.setBackground(new java.awt.Color(255, 255, 204));

        CadastroTutor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        CadastroTutor.setText("Cadastro Tutor");

        NomeTutor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomeTutor.setText("Nome do Tutor");

        CPF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CPF.setText("CPF");

        NomePet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomePet.setText("Nome do Pet");

        Endereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Endereco.setText("Endereço");

        Bairro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Bairro.setText("Bairro");

        Cidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Cidade.setText("Cidade");

        Estado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Estado.setText("Estado");

        CEP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CEP.setText("CEP");

        Telefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Telefone.setText("Telefone");

        Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Email.setText("E-mail");

        Observacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Observacao.setText("Observação:");

        Enter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TutorLayout = new javax.swing.GroupLayout(Tutor);
        Tutor.setLayout(TutorLayout);
        TutorLayout.setHorizontalGroup(
            TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Observacao)
                            .addComponent(Email)
                            .addComponent(Telefone)
                            .addComponent(CEP)
                            .addComponent(Estado)
                            .addComponent(Cidade)
                            .addComponent(Bairro)
                            .addComponent(Endereco)
                            .addComponent(NomePet)
                            .addComponent(CPF)
                            .addComponent(NomeTutor))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtobservacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CadastroTutor)
                                        .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                        .addComponent(TxtCPF)
                                        .addComponent(NomeDoPet)
                                        .addComponent(txtEndereco))
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58))))
        );
        TutorLayout.setVerticalGroup(
            TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(CadastroTutor)
                .addGap(18, 18, 18)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeTutor)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomePet)
                    .addComponent(NomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Observacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtobservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Ação acionada quando usuário clica no botão "Enter" para cadastrar.
     * Fluxo: - ler campos - validar (mínimo: nome e CPF) - montar Model.Tutor -
     * chamar DAO para inserir no banco - mostrar mensagem e limpar campos em
     * caso de sucesso
     */
    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed

        //Inicio
        // ---------- 1) Lê campos da tela
        String nome = Nome.getText();
        String CPF = TxtCPF.getText();;
        String Telefone = txtTelefone.getText();
        String Estado = txtEstado.getText();
        String NomePet = NomeDoPet.getText();
        String Endereco = txtEndereco.getText();
        String Email = txtEmail.getText();
        String Cidade = txtCidade.getText();
        String CEP = txtCEP.getText();
        String Bairro = txtBairro.getText();
        String Observacao = txtobservacao.getText();

        // ---------- 2) Validação mínima
        // Aqui checamos se os campos obrigatórios estão preenchidos.
        if (nome.isEmpty() || CPF.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha os campos obrigatórios (Nome, CPF).");
            return;
        }

        // ---------- 3) Monta o objeto Tutor (modelo da aplicação)
        // Usamos o POJO Model.Tutor para representar o registro a ser persistido.
        Model.Tutor t = new Model.Tutor();
        t.setNomeTutor(nome);
        t.setCPF(CPF);
        t.setTelefone(Telefone);
        t.setEstado(txtEstado.getText().trim());
        t.setNomePet(NomeDoPet.getText().trim());
        t.setEndereco(txtEndereco.getText().trim());
        t.setEmail(txtEmail.getText().trim());
        t.setCidade(txtCidade.getText().trim());
        t.setCEP(txtCEP.getText().trim());
        t.setBairro(txtBairro.getText().trim());
        t.setObservacao(txtobservacao.getText());

        // ---------- 4) Chama o DAO para inserir no banco
        // O DAO deve encapsular a lógica de conexão e SQL (PreparedStatement).
        // A chamada abaixo espera que dao.insert(t) retorne o id gerado (>0) ou -1 em caso de erro.
        DAO.TutorDAO dao = new DAO.TutorDAO();
        int idGerado = dao.insert(t);

        // ---------- 5) Feedback ao usuário e limpeza dos campos em caso de sucesso
        if (idGerado > 0) {
            JOptionPane.showMessageDialog(this, "Tutor cadastrado com sucesso! ID = " + idGerado);
            LimparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar tutor. Verifique o console para detalhes.");
        }
        // Fim do fluxo do botão Enter

    }//GEN-LAST:event_EnterActionPerformed
    /**
     * Fecha a janela (voltar).
     */
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroTutor dialog = new CadastroTutor(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel CadastroTutor;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel Estado;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField NomeDoPet;
    private javax.swing.JLabel NomePet;
    private javax.swing.JLabel NomeTutor;
    private javax.swing.JLabel Observacao;
    private javax.swing.JLabel Telefone;
    private javax.swing.JPanel Tutor;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtobservacao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
