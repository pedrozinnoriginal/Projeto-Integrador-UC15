package Telas;

import Model.Tutor;
import Service.TutorService;
import javax.swing.JOptionPane;


/* @author Pedro
 */
public class CadastroTutor extends javax.swing.JDialog {

    private int tutorIdGerado = -1;

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

    public CadastroTutor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
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
        txtConsultarDados = new javax.swing.JButton();
        Pesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnLimparDados = new javax.swing.JButton();

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

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        txtConsultarDados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtConsultarDados.setText("Consultar Dados");
        txtConsultarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarDadosActionPerformed(evt);
            }
        });

        Pesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pesquisar.setText("Pesquisar Tutor");

        txtPesquisar.setPreferredSize(new java.awt.Dimension(26, 26));

        btnLimparDados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimparDados.setText("Limpar Dados");
        btnLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TutorLayout = new javax.swing.GroupLayout(Tutor);
        Tutor.setLayout(TutorLayout);
        TutorLayout.setHorizontalGroup(
            TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addContainerGap(448, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConsultarDados)
                                .addGap(72, 72, 72)
                                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtobservacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimparDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(CadastroTutor)
                                    .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(TxtCPF)
                                    .addComponent(NomeDoPet)
                                    .addComponent(txtEndereco)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(txtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnLimparDados, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Observacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtobservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed

        // ---------- 1) Leitura dos campos
        String nome = Nome.getText().trim();
        String cpf = TxtCPF.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String estado = txtEstado.getText().trim();
        String nomePet = NomeDoPet.getText().trim();
        String endereco = txtEndereco.getText().trim();
        String email = txtEmail.getText().trim();
        String cidade = txtCidade.getText().trim();
        String cep = txtCEP.getText().trim();
        String bairro = txtBairro.getText().trim();
        String observacao = txtobservacao.getText().trim();

        // ---------- 2) Validação mínima
        if (nome.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha os campos obrigatórios (Nome e CPF).",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // ---------- 3) Montagem do objeto Tutor
        Tutor tutor = new Tutor();
        tutor.setNomeTutor(nome);
        tutor.setCpf(cpf);
        tutor.setTelefone(telefone);
        tutor.setEstado(estado);
        tutor.setNomePet(nomePet);
        tutor.setEndereco(endereco);
        tutor.setEmail(email);
        tutor.setCidade(cidade);
        tutor.setCep(cep);
        tutor.setBairro(bairro);
        tutor.setObservacao(observacao);

        // ---------- 4) Chamada do Service
        TutorService service = new TutorService();
        int idGerado = service.cadastrarTutor(tutor);

        // ---------- 5) Verificação e armazenamento do ID
        if (idGerado > 0) {
            this.tutorIdGerado = idGerado; // 🔑 GUARDA O ID NA TELA

            JOptionPane.showMessageDialog(this,
                    "Tutor cadastrado com sucesso!\nID: " + idGerado,
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

            LimparCampos();

        } else {
            JOptionPane.showMessageDialog(this,
                    "Erro ao cadastrar tutor. Verifique o console.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        // Fim do fluxo do botão Enter

    }//GEN-LAST:event_EnterActionPerformed
    /**
     * Fecha a janela (voltar).
     */
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void txtConsultarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultarDadosActionPerformed
        String nomePesquisa = txtPesquisar.getText().trim();

        if (nomePesquisa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite o nome do tutor no campo de pesquisa.");
            txtPesquisar.requestFocus();
            return;
        }

        try {
            TutorService service = new TutorService();
            Tutor tutorEncontrado = service.buscarTutorPorNome(nomePesquisa);

            if (tutorEncontrado != null) {
                // Preenchendo os campos da tela com os dados do banco
                Nome.setText(tutorEncontrado.getNomeTutor());
                TxtCPF.setText(tutorEncontrado.getCpf());
                txtTelefone.setText(tutorEncontrado.getTelefone());
                txtEndereco.setText(tutorEncontrado.getEndereco());
                txtBairro.setText(tutorEncontrado.getBairro());
                txtCidade.setText(tutorEncontrado.getCidade());
                txtEstado.setText(tutorEncontrado.getEstado());
                txtCEP.setText(tutorEncontrado.getCep());
                txtEmail.setText(tutorEncontrado.getEmail());
                txtobservacao.setText(tutorEncontrado.getObservacao());

                // Guardamos o ID caso precise editar depois
                this.tutorIdGerado = tutorEncontrado.getId();

                JOptionPane.showMessageDialog(this, "Tutor encontrado!");

            } else {
                JOptionPane.showMessageDialog(this, "Nenhum tutor encontrado com esse nome.");
                LimparCampos(); // Limpa se não achar nada para evitar confusão
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar: " + e.getMessage());
        }
    }//GEN-LAST:event_txtConsultarDadosActionPerformed

    private void btnLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosActionPerformed
        LimparCampos();
        JOptionPane.showMessageDialog(this, "Campos limpos com sucesso!");
    }//GEN-LAST:event_btnLimparDadosActionPerformed

    public int getTutorIdGerado() {
        return tutorIdGerado;
    }

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
    private javax.swing.JLabel Pesquisar;
    private javax.swing.JLabel Telefone;
    private javax.swing.JPanel Tutor;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JButton btnLimparDados;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JButton txtConsultarDados;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtobservacao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
