public class Triangulos{
    public static void main (String[] args){

        Integer numero = Integer.valueOf(args[0]);
        String letra = String.valueOf(args[1]);


    switch(letra){
        case "a":
            for (Integer i = 0; i < numero; i++) {

            for (Integer j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
            break;

        case "b":
            for (Integer i = 1; numero >= i; numero--) {

            for (Integer j = 1; j <= numero; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }    
            break;

        case "c":
            for (Integer i = 0; i < numero; i++) {
            
            for (Integer e = 1; e <= i+1; e++) {
                System.out.print(" ");
            }
                for (Integer x = numero; x >= i+1; x--) {
                    
                    System.out.print("*");
                }
            
            System.out.println();
        }

        case "d":
            for (Integer i = 0; i < numero; i++) {

            for (Integer e = 1; e <= i+1; e++) {
                System.out.print(" ");
            }
                for (Integer x = numero; x >= i+1; x--) {
                    
                    System.out.print("*");
                }
            
            System.out.println();
        }
        default:
            System.out.println("Erro");
        }
    }
}