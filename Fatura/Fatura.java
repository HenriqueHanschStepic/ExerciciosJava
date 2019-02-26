public class Fatura{

    public String  codigo;
    public String  descricao;
    private Integer quantidade;
    private Double  preco;  
     
    public Fatura(String codigo, String descricao, String quantidade, String preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = Integer.valueOf(quantidade);
        this.preco = Double.valueOf(preco);
    }

    public void totalFaturado(){
        System.out.println("Descricao: " + descricao);
        System.out.println("Total: R$ "+ (preco * quantidade));
        
    }
}