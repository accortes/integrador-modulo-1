
import java.util.LinkedList;

public class ServiciosComputadora implements ICRUD {
    LinkedList<Computadora> ListaDeCompus = new LinkedList();

    ServiciosComputadora(){}
    
    //Metodos 
    @Override
    public boolean create(Computadora compu) {
        return ListaDeCompus.add(compu); 
    }
    @Override
    public LinkedList leer(){
        return ListaDeCompus;
    }
    
    @Override
    public LinkedList delete() {
        ListaDeCompus.remove();
        return ListaDeCompus;
    }
}  
  
    
    

