public class RetanguloTeste{

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(Double.valueOf(args[0]),Double.valueOf(args[1]));

        Double comp = Double.valueOf( args[0] );
        Double larg = Double.valueOf( args[1] );
        
       

        retangulo.setComp(comp);
        retangulo.setLarg(larg);
        retangulo.Area(); 
        retangulo.Perimetro();
    }
}