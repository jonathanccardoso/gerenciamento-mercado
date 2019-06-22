package mercadinhojj.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.*;

public class VendaModel {

    private ArrayList<ProdutoModel> produtos; //tem que remover associações, essa associação se tem em item_venda
    private int id;
    private double valorTotal;
    private LocalDate data;
    private boolean debito;
    private ClienteModel cliente; //há venda só pertence a um crientess

    public VendaModel() {
        super();
        this.produtos = new ArrayList<>();
        this.debito=false;
    }

    public VendaModel(ProdutoModel[] produtos, double valorTotal, LocalDate data, boolean debito, ClienteModel cliente) {
        super();
        this.produtos = new ArrayList<>();
        this.valorTotal = valorTotal;
        this.data = data;
        this.debito = debito;
        this.cliente = cliente; // filtra pelo CPF
    }

    public ArrayList<ProdutoModel> getProdutos() {
        return produtos;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }
  
    public void adicionarProduto(ProdutoModel p){
      
        this.produtos.add(p);
    }
    public void removerProduto(ProdutoModel p){
        this.produtos.remove(p);
    } 
            
    public void esvaziar(){
        this.produtos=new ArrayList();
    }
    
    public ArrayList<ProdutoModel> listarProdutos(){
           return this.getProdutos();
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getDebito() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public Double calcularValorTotal(){
        Double valorTotal=0.0;
        
        for(ProdutoModel p :produtos){
            valorTotal+=p.getPreco()*p.getQuantidade();
        }
        return valorTotal;
    }
}
