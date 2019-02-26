public class PopulacaoMundial{
    public static void main (String[] args){
        Integer anos = Integer.valueOf(args[0]);
        Long populacao = 7000000000L;
        Double porc = 0.012;

        

        Double total = populacao.doubleValue();
        for (int i = 0; i < anos; i++){
            total = total + (total * porc); 
        }

        System.out.println(Math.round(total) + " pessoas"); 
    }

}
