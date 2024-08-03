
package ifsc.com.designpatterns.lojaapp;


public class LojaApp {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("sinara", "111112151");
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras(cliente1);
        Produto produto1 = new Produto(1, 5.0);
        carrinho1.adicionarProduto(produto1, 5, 0.3);
        
       Produto produto2 = new Produto(1, 5.0);
        carrinho1.adicionarProduto(produto2, 5, 0.3);
        
        
       Produto produto3 = new Produto(1, 5.0);
        carrinho1.adicionarProduto(produto3, 5, 0.3);
        
        carrinho1.toString();
        System.out.println("valor total do pedido "+ carrinho1.obterValorTotal());
        
    }
    
}
