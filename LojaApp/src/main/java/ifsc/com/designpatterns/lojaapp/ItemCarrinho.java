
package ifsc.com.designpatterns.lojaapp;

public class ItemCarrinho {
    
    private Produto produto;
    private Integer quantidade;
    private Double desconto;

    public ItemCarrinho(Produto produto, Integer quantidade, Double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    
    public double obterCusto (){
      double d = (produto.getValor() * this.quantidade) - this.desconto;
        return (produto.getValor() * this.quantidade) - d;
    } 
    
}
