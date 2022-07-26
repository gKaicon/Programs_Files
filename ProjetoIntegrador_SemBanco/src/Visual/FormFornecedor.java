package Visual;

import MODELO.*;
import DAO.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */
public class FormFornecedor extends javax.swing.JDialog {

    private DAOFornecedor dao = new DAOFornecedor();

    public void atualizaTrabela() {
        listFornecedor.clear();
        listFornecedor.addAll(dao.getLista());
        int linha = listFornecedor.size() - 1;
        if (linha >= 0) {
            tableFornecedor.setRowSelectionInterval(linha, linha);
            tableFornecedor.scrollRectToVisible(tableFornecedor.getCellRect(linha, linha, true));
        }
    }

    public void trataEdicao(boolean editando) {
        btnCancelar.setEnabled(editando);
        btnSalvar.setEnabled(editando);
        btnEditar.setEnabled(!editando);
        btnExcluir.setEnabled(!editando);
        btnNovo.setEnabled(!editando);
        tabGuias.setEnabled(!editando);

        btnFechar.setEnabled(!editando);
        btnPrimeiro.setEnabled(!editando);
        btnProximo.setEnabled(!editando);
        btnAnterior.setEnabled(!editando);
        btnUltimo.setEnabled(!editando);

        txtNome.setEnabled(editando);
        txtEndereco.setEnabled(editando);
        txtTelefone.setEnabled(editando);

        tableFornecedor.setEnabled(!editando);

    }

    public boolean validaCampos() {
        if (!(txtNome.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o nome do Fornecedor");
            txtNome.requestFocus();
            return false;
        }
        if (!(txtEndereco.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o endereço do Fornecedor");
            txtEndereco.requestFocus();
            return false;
        }
        if (!(txtTelefone.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o Telefone do Fornecedor");
            txtTelefone.requestFocus();
            return false;
        }
        return true;
    }

    public FormFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTrabela();
        trataEdicao(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listFornecedor = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList <Fornecedor>())
        ;
        panelNavegacao = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        panelOrganizacao = new javax.swing.JPanel();
        tabGuias = new javax.swing.JTabbedPane();
        panelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFornecedor = new javax.swing.JTable();
        panelDados = new javax.swing.JPanel();
        panelAcoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblId_Fornecedor = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblInformacaoEndereco = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtId_Fornecedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Fornecedor");

        panelNavegacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        panelNavegacao.setLayout(new java.awt.GridLayout(1, 0));

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnAnterior);

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnPrimeiro);

        btnUltimo.setText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnUltimo);

        btnProximo.setText("Proximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnProximo);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnFechar);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listFornecedor, tableFornecedor);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id_Fornecedor}"));
        columnBinding.setColumnName("Id_ Fornecedor");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${endereco}"));
        columnBinding.setColumnName("Endereço");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tableFornecedor);

        javax.swing.GroupLayout panelListagemLayout = new javax.swing.GroupLayout(panelListagem);
        panelListagem.setLayout(panelListagemLayout);
        panelListagemLayout.setHorizontalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListagemLayout.setVerticalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabGuias.addTab("Listagem", panelListagem);

        panelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        panelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panelAcoes.add(btnNovo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnEditar);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnSalvar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnCancelar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panelAcoes.add(btnExcluir);

        lblId_Fornecedor.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblId_Fornecedor.setText("Id_Fornecedor");

        lblNome.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblNome.setText("Nome");

        lblEndereco.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblEndereco.setText("Endereço");

        lblTelefone.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblTelefone.setText("Telefone");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtEndereco.setToolTipText("Rua, nº , Bairro, Cidade");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.endereco}"), txtEndereco, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblInformacaoEndereco.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblInformacaoEndereco.setText("Rua, nº , Bairro, Cidade");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefone}"), txtTelefone, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        txtId_Fornecedor.setEditable(false);
        txtId_Fornecedor.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFornecedor, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id_Fornecedor}"), txtId_Fornecedor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId_Fornecedor)
                    .addComponent(lblNome)
                    .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTelefone)
                        .addComponent(lblEndereco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInformacaoEndereco)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId_Fornecedor)
                    .addComponent(txtId_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblInformacaoEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabGuias.addTab("Dados", panelDados);

        javax.swing.GroupLayout panelOrganizacaoLayout = new javax.swing.GroupLayout(panelOrganizacao);
        panelOrganizacao.setLayout(panelOrganizacaoLayout);
        panelOrganizacaoLayout.setHorizontalGroup(
            panelOrganizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrganizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabGuias)
                .addContainerGap())
        );
        panelOrganizacaoLayout.setVerticalGroup(
            panelOrganizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrganizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabGuias)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOrganizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOrganizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int linha = tableFornecedor.getSelectedRow();
        if ((linha - 1) >= 0) {
            linha--;
        }
        tableFornecedor.setRowSelectionInterval(linha, linha);
        tableFornecedor.scrollRectToVisible(tableFornecedor.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorActionPerformed
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        int linha = tableFornecedor.getSelectedRow();
        if ((linha + 1) <= tableFornecedor.getRowCount() - 1) {
            linha++;
        }
        tableFornecedor.setRowSelectionInterval(linha, linha);
        tableFornecedor.scrollRectToVisible(tableFornecedor.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoActionPerformed
    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        tableFornecedor.setRowSelectionInterval(0, 0);
        tableFornecedor.scrollRectToVisible(tableFornecedor.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroActionPerformed
    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        int linha = tableFornecedor.getRowCount() - 1;
        tableFornecedor.setRowSelectionInterval(linha, linha);
        tableFornecedor.scrollRectToVisible(tableFornecedor.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoActionPerformed
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        listFornecedor.add(new Fornecedor());
        int linha = listFornecedor.size() - 1;
        tableFornecedor.setRowSelectionInterval(linha, linha);
        txtNome.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnNovoActionPerformed
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNome.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (validaCampos()) {
            int linhaSelecionada = tableFornecedor.getSelectedRow();
            Fornecedor obj = listFornecedor.get(linhaSelecionada);
            dao.salvar(obj);
            this.atualizaTrabela();
            trataEdicao(false);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        atualizaTrabela();
        trataEdicao(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            Integer linhaSelecionada = tableFornecedor.getSelectedRow();
            Fornecedor obj = listFornecedor.get(linhaSelecionada);
            dao.delete(obj);
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Não há Compra para excluisão");
        }
        atualizaTrabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblId_Fornecedor;
    private javax.swing.JLabel lblInformacaoEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private java.util.List<Fornecedor> listFornecedor;
    private javax.swing.JPanel panelAcoes;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelListagem;
    private javax.swing.JPanel panelNavegacao;
    private javax.swing.JPanel panelOrganizacao;
    private javax.swing.JTabbedPane tabGuias;
    private javax.swing.JTable tableFornecedor;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId_Fornecedor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
