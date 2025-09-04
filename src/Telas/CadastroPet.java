package Telas;

import DAO.PetDAO; // DAO responsável por inserir/listar Pets no banco
import Model.Pet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // modelo de dados da JTable

/**
 * Tela para cadastro de Pets Integração com PetDAO para salvar no banco de
 * dados.
 *
 * @author Pedro
 */
public class CadastroPet extends javax.swing.JDialog {

    /**
     * Configura textos de ajuda (tooltips) dos campos. Chamado no construtor
     * para melhorar usabilidade.
     */
    private void ConfigurarTooltips() {
        peso.setToolTipText("Por favor, digite o peso do pet ");
        raca.setToolTipText("Por favor, digite o raça do pet ");
        vacina.setToolTipText("Por favor, digite o nome da vacina ");
        vencimento.setToolTipText("Por favor, digite o vencimento da vacina ");
        vencimentovermifugo.setToolTipText("Digite o vencimento do vermifugo ");
        vermifugo.setToolTipText("Por favor, digite o nome do vermifugo ");
        txtobservacao.setToolTipText("Digite sua observação ");
        CPraga.setToolTipText("Digite o nome do controle de praga ");
        Nome.setToolTipText("Por favor, informe o nome do pet ");
    }

    /**
     * Limpa os campos do formulário e posiciona foco no campo peso. Usado após
     * cadastro bem sucedido.
     */
    private void LimparCampos() {
        peso.setText("");
        raca.setText("");
        vacina.setText("");
        vencimento.setText("");
        vencimentovermifugo.setText("");
        vermifugo.setText("");
        txtobservacao.setText("");
        CPraga.setText("");
        Nome.setText("");
        peso.requestFocus();
    }

    /**
     * Construtor da Dialog. Chama initComponents() (código gerado) e configura
     * tooltips.
     */
    public CadastroPet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); // cria componentes (gerado pelo NetBeans)
        ConfigurarTooltips(); // adiciona dicas aos campos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CadastroPet = new javax.swing.JLabel();
        NomePet = new javax.swing.JLabel();
        Peso = new javax.swing.JLabel();
        Raca = new javax.swing.JLabel();
        Vacinas = new javax.swing.JLabel();
        Vencimento = new javax.swing.JLabel();
        Vermifugo = new javax.swing.JLabel();
        VermifugoVencimento = new javax.swing.JLabel();
        ControlePraga = new javax.swing.JLabel();
        Obervacao = new javax.swing.JLabel();
        TabelaInformacao = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Enter = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Nome = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        raca = new javax.swing.JTextField();
        vacina = new javax.swing.JTextField();
        vencimento = new javax.swing.JTextField();
        vermifugo = new javax.swing.JTextField();
        vencimentovermifugo = new javax.swing.JTextField();
        txtobservacao = new javax.swing.JTextField();
        CPraga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        CadastroPet.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        CadastroPet.setText("Cadastro Pet");

        NomePet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NomePet.setText("Nome Pet");

        Peso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Peso.setText("Peso");

        Raca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Raca.setText("Raça");

        Vacinas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Vacinas.setText("Vacina");

        Vencimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Vencimento.setText("Vencimento");

        Vermifugo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Vermifugo.setText("Vermifugo");

        VermifugoVencimento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        VermifugoVencimento.setText("Vencimento");

        ControlePraga.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ControlePraga.setText("Controle de Praga");

        Obervacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Obervacao.setText("Observação");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Vacina", "Peso", "Controle de Praga", "Vermifugo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaInformacao.setViewportView(Tabela);

        Enter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Enter.setText("Enter");
        Enter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Voltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Peso)
                                .addComponent(NomePet)
                                .addComponent(Raca)
                                .addComponent(Vacinas)
                                .addComponent(Vencimento)
                                .addComponent(Vermifugo)
                                .addComponent(VermifugoVencimento)
                                .addComponent(ControlePraga)
                                .addComponent(Obervacao)
                                .addComponent(TabelaInformacao, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                                .addComponent(txtobservacao)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addComponent(CadastroPet)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(raca, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(vacina, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(vencimento, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(vermifugo, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(vencimentovermifugo, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addComponent(CPraga)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastroPet)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomePet)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Peso)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Raca)
                    .addComponent(raca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vacinas)
                    .addComponent(vacina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vencimento)
                    .addComponent(vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vermifugo)
                    .addComponent(vermifugo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VermifugoVencimento)
                    .addComponent(vencimentovermifugo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ControlePraga)
                    .addComponent(CPraga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Obervacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtobservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TabelaInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        /**
         * Método acionado quando o botão "Enter" é pressionado. Realiza: 1)
         * leitura dos campos 2) validação mínima (nome obrigatório) 3) montagem
         * do objeto Pet 4) chamada ao DAO para persistência 5) atualização da
         * JTable em memória (addRow) e feedback ao usuário
         */

        // ---------- 1) Lê campos do formulário (trim remove espaços em branco nas extremidades)
        String nomeStr = Nome.getText().trim();
        String pesoStr = peso.getText().trim();
        String racaStr = raca.getText().trim();
        String vacinaStr = vacina.getText().trim();
        String vencVacinaStr = vencimento.getText().trim();
        String vermifugoStr = vermifugo.getText().trim();
        String vencVermifugoStr = vencimentovermifugo.getText().trim();
        String controlePragaStr = CPraga.getText().trim();
        String observacaoStr = txtobservacao.getText().trim();

        // ---------- 2) Validação mínima
        // Aqui checamos apenas se o nome foi informado.
        if (nomeStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O nome do pet é obrigatório.");
            Nome.requestFocus();
            return;
        }
        // ---------- 3) Monta o objeto de domínio (modelo) com os valores coletados
        // Usamos setters do POJO Model.Pet para preencher os dados que serão persistidos.
        Pet pet = new Pet();

        pet.setNomePet(nomeStr);
        pet.setPeso(pesoStr);
        pet.setRaca(racaStr);
        pet.setVacina(vacinaStr);
        pet.setVencimento(vencVacinaStr);
        pet.setVermifugo(vermifugoStr);
        pet.setVencimentoVermifugo(vencVermifugoStr);
        pet.setControlePraga(controlePragaStr);
        pet.setObservacao(observacaoStr);

        // ---------- 4) Persiste usando PetDAO (chamada ao banco)
        // PetDAO.insert retorna o id gerado (se configurado no DAO) ou -1 em erro.
        int idGerado;
        try {
            PetDAO dao = new PetDAO();
            idGerado = dao.insert(pet);
        } catch (Exception ex) {
            // Se ocorrer exceção (ex.: SQLSyntaxErrorException por tabela ausente),
            // mostramos a mensagem para facilitar debug.
            JOptionPane.showMessageDialog(this, "Erro ao salvar no banco: " + ex.getMessage());
            return;
        }

        // ---------- 5) Atualiza a tabela da UI e informa o usuário
        // Observação: aqui usamos addRow para inserir apenas a linha recém-cadastrada.
        if (idGerado > 0) {

            DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
            model.addRow(new Object[]{vacinaStr, pesoStr, controlePragaStr, vermifugoStr}); // usar as Strings, não os componentes
            JOptionPane.showMessageDialog(this, "Pet cadastrado com sucesso! ID = " + idGerado);
            LimparCampos(); // limpa campos após sucesso
        } else {
            // idGerado <= 0 indica falha no insert (DAO usa -1 em caso de erro)
            JOptionPane.showMessageDialog(this, "Não foi possível salvar o pet.");
        }

        //Fim

    }//GEN-LAST:event_EnterActionPerformed
    /**
     * Fecha a janela atual (volta à tela anterior).
     */
    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed

        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroPet dialog = new CadastroPet(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField CPraga;
    private javax.swing.JLabel CadastroPet;
    private javax.swing.JLabel ControlePraga;
    private javax.swing.JButton Enter;
    private javax.swing.JTextField Nome;
    private javax.swing.JLabel NomePet;
    private javax.swing.JLabel Obervacao;
    private javax.swing.JLabel Peso;
    private javax.swing.JLabel Raca;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane TabelaInformacao;
    private javax.swing.JLabel Vacinas;
    private javax.swing.JLabel Vencimento;
    private javax.swing.JLabel Vermifugo;
    private javax.swing.JLabel VermifugoVencimento;
    private javax.swing.JButton Voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField raca;
    private javax.swing.JTextField txtobservacao;
    private javax.swing.JTextField vacina;
    private javax.swing.JTextField vencimento;
    private javax.swing.JTextField vencimentovermifugo;
    private javax.swing.JTextField vermifugo;
    // End of variables declaration//GEN-END:variables
}
