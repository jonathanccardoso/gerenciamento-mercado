/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinhojj.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import mercadinhojj.DAO.ConexaoDAO;
import mercadinhojj.model.ClienteModel;
import static mercadinhojj.view.MercadoView.clientes;

/**
 *
 * @author kadu
 */
public class ClienteInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClienteInternalFrame
     */
    
    private ConexaoDAO con = new ConexaoDAO();
    
    public ClienteInternalFrame() {
        ArrayList<ClienteModel>clientes;
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

        jLabel1 = new javax.swing.JLabel();
        nometxt = new javax.swing.JTextField();
        enderecotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dividatxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaclientes = new javax.swing.JTable();
        Salvar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        cpftxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        atualizar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nome");

        nometxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nometxtActionPerformed(evt);
            }
        });

        enderecotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecotxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço");

        dividatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividatxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Divida");

        jLabel4.setText("Clientes");

        clientes=MercadoView.clientes;
        arrayClientes=new Object[clientes.size()][4];

        for (int i=0;i<clientes.size();i++){
            arrayClientes[i][0]=clientes.get(i).getNome();
            arrayClientes[i][1]=clientes.get(i).getCPF();
            arrayClientes[i][2]=clientes.get(i).getEndereco();
            arrayClientes[i][3]=clientes.get(i).getDivida();

        }
        tabelaclientes.setModel(new javax.swing.table.DefaultTableModel(
            arrayClientes,
            new String [] {
                "Cliente", "CPF", "Endereço", "Divida"
            }
        ));
        tabelaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaclientes);

        Salvar.setText("Cadastrar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        jLabel5.setText("CPF");

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enderecotxt)
                                    .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dividatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nometxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dividatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atualizar)
                    .addComponent(Salvar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nometxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nometxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nometxtActionPerformed

    private void enderecotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecotxtActionPerformed

    private void dividatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dividatxtActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        String nome=nometxt.getText();
        String endereco=enderecotxt.getText();
        double divida=Double.parseDouble(dividatxt.getText());
        String cpf= cpftxt.getText();
        ClienteModel novoCliente= new ClienteModel(cpf,nome,endereco,divida);
        clientes.add(novoCliente);
        con.setClient(novoCliente);        
        
        DefaultTableModel dtmprodutos= (DefaultTableModel)tabelaclientes.getModel();
        Object[] dados={nometxt.getText(),cpftxt.getText(),enderecotxt.getText(),dividatxt.getText()};
        dtmprodutos.addRow(dados);
        
        //esvaziar os textfields
        nometxt.setText("");
        cpftxt.setText("");
        dividatxt.setText("");
        enderecotxt.setText("");
        
    }//GEN-LAST:event_SalvarActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        // TODO add your handling code here:
       
        int s = tabelaclientes.getSelectedRow();        

        if(tabelaclientes.getSelectedRow()!=-1){
            clientes.remove(s);
            DefaultTableModel dtmprodutos = (DefaultTableModel)tabelaclientes.getModel();
            dtmprodutos.removeRow(tabelaclientes.getSelectedRow());
            
            String nome=nometxt.getText();
            String endereco=enderecotxt.getText();
            double divida=Double.parseDouble(dividatxt.getText());
            String cpf= cpftxt.getText();
            ClienteModel delCliente= new ClienteModel(cpf,nome,endereco,divida);
            con.delCliente(delCliente);
            
        }else{
            JOptionPane.showMessageDialog(null,"Selecione algum cliente para completar a açao!");
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void tabelaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaclientesMouseClicked
        // TODO add your handling code here:
          //esvaziar os textfields
        int linha=tabelaclientes.getSelectedRow();
        nometxt.setText(clientes.get(linha).getNome());
        cpftxt.setText(clientes.get(linha).getCPF());
        dividatxt.setText(Double.toString(clientes.get(linha).getDivida()));
        enderecotxt.setText(clientes.get(linha).getEndereco());
        
    }//GEN-LAST:event_tabelaclientesMouseClicked

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        String nome=nometxt.getText();
        String endereco=enderecotxt.getText();
        double divida=Double.parseDouble(dividatxt.getText());
        String cpf= cpftxt.getText();
        ClienteModel novoCliente= new ClienteModel(cpf,nome,endereco,divida);
        con.updateCliente(novoCliente);
        
        int linha = tabelaclientes.getSelectedRow();
        clientes.remove(tabelaclientes.getSelectedRow());
        clientes.add(tabelaclientes.getSelectedRow(),novoCliente);
        
        tabelaclientes.setValueAt(nometxt.getText(), tabelaclientes.getSelectedRow(),0);
        tabelaclientes.setValueAt(cpftxt.getText(), tabelaclientes.getSelectedRow(),1);
        tabelaclientes.setValueAt(enderecotxt.getText(), tabelaclientes.getSelectedRow(),2);
        tabelaclientes.setValueAt(dividatxt.getText(), tabelaclientes.getSelectedRow(),3);
        
    }//GEN-LAST:event_atualizarActionPerformed
    
    
    public static ArrayList <ClienteModel> clientes=MercadoView.clientes;
    public  Object[][] arrayClientes;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JButton atualizar;
    private javax.swing.JTextField cpftxt;
    private javax.swing.JButton deletar;
    private javax.swing.JTextField dividatxt;
    private javax.swing.JTextField enderecotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nometxt;
    private javax.swing.JTable tabelaclientes;
    // End of variables declaration//GEN-END:variables
}
