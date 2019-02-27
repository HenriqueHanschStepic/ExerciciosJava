public class Retangulo{
    private Double comp = 1.0;
    private Double larg = 1.0;
    private Double area;
    private Double peri;

    public Retangulo(Double comp,Double larg){
        this.comp = Double.valueOf(comp);
        this.larg = Double.valueOf(larg);
    }

    public void Area(){
        area = comp * larg;
        System.out.println("Area:"+ area);
    }

    public void Perimetro(){
        peri = larg + larg + comp + comp;
        System.out.println("Perimetro: " + peri);
    }

    public Double getComp()
	{
		return this.comp;
	}

	public void setComp(Double comp)
	{
        if(comp > 0.0){
            this.comp = comp;
        }else{
		System.out.println("Lado menor ou igual a zero!");
        System.exit(0);
        }
	}

	public Double getLarg()
	{
		return this.larg;
	}

	public void setLarg(Double larg)
	{
        if(larg > 0.0){
            this.larg = larg;
        }else{
            System.out.println("Lado menor ou igual a zero!");
            System.exit(0);
        }   
	}

}