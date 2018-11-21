public abstract class Tecnologia {
    
    //Atributos
    private String NuSerie;
    private String Anio;
    private String Modelo;
    
    //Constructor
    Tecnologia(){}
    Tecnologia(String NuSerie, String Anio, String Modelo){
        this.Modelo = NuSerie;
        this.Anio = Anio;
        this.Modelo = Modelo;
    }
    
    //get y set
    public String getNuSerie(){
        return NuSerie;
    }
    public void setNuSerie(String NuSerie){
        this.NuSerie = NuSerie;
    }
    
    public String getAnio(){
        return Anio;
    }
    public void setAnio(String Anio){
        this.Anio = Anio;
    }
    
     public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    
    @Override
    public String toString(){
        return "El modelo es " + this.Modelo + "El año es " +this.Anio + "Numero de serie: " + this.NuSerie;
    }
    
}