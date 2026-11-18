import java.util.ArrayList;
import java.util.List;
public class Cadastro<T>{
    private ArrayList<T> lista;
    
    public Cadastro(){
        this.lista = new ArrayList<>();
    }
    
    public void adicionar(T elemento){
        lista.add(elemento);
    }
    
    public List<T> getElementos(){
        return lista;
    }
}