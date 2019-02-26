public class Calculadora{
    public static void main (String[] args){
        Integer n1 = Integer.valueOf(args[0]);
        Integer n2 = Integer.valueOf(args[1]);        

        int soma;
        int prod; 
        int dife; 
        double divi; 

        soma = n1 + n2; 
        prod = n1 * n2; 
        dife = n1 - n2;
        divi = n1 / n2; 

        if (n1 == n2){
            System.out.println("Números iguais!");
        }
        if (n1 > n2){
            System.out.println(n1 + " é maior!");
        }else{
            System.out.println(n2 + " é maior!");
        }

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + prod);
        System.out.println("Diferença: " + dife);
        System.out.println("Divisão: " + divi);
    }
}
