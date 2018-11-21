public class Computadora extends Tecnologia {
    
    //Atributos 
    private String Procesador;
    private int Ram;
    
    //Constructos
    Computadora(){}
    Computadora(String NuSerie, String Anio, String Modelo, String Procesador, int Ram){
        super(NuSerie, Anio, Modelo);
        this.Procesador = Procesador;
        this.Ram = Ram;
    }
    
    //Get y Set
    public String getProcesador(){
        return Procesador;
    }
    
    public void setProcesador (String Procesador){
        this.Procesador = Procesador;
    }
    
   public int getRam(){
       return Ram;
   }
   
   public void setRam (int Ram){
       this.Ram = Ram;
   }
   
   @Override
   public String toString(){
       return super.toString() + "El procesaro es: " + this.Procesador + "La Ram es: " + this.Ram;
   }
   
}
