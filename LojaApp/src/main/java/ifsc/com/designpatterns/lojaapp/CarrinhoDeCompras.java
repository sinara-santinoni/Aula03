
package ifsc.com.designpatterns.lojaapp;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    
    private List<ItemCarrinho> itens;
    private Cliente cliente;

    public CarrinhoDeCompras( Cliente cliente) {
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

 public boolean adicionarProduto(Produto p, int q, double d){
     ItemCarrinho item = new ItemCarrinho(p, q, d);
     return this.itens.add(item);
                
 }
   public double obterValorTotal (){
       double total = 0.0;
       for (ItemCarrinho item : itens) {
           total+= item.obterCusto();
       }
           return total;
       }

    @Override
    public String toString() {
        String pedido = this.cliente.getNome() + '\n';
        for (ItemCarrinho item : itens) {
            pedido += item.getProduto().getCodigo() + '\n';
        }
        return pedido;
    }
   
       
   }
   

