
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "Losowanie")
@RequestScoped
public class Losowanie {

    static int losuj = (int)(Math.random()*5+1);
    static int counter = 0;

    public String sprawdz(int page){
        inc();
        if(page == losuj){
            return "trafiony";
        }
        else{
            return Integer.toString(page);
        }
    }

    public void rollnew(){
        losuj = (int)(Math.random()*5+1);
    }
    public void inc(){
        counter+=1;
    }

    public int getCounter() {
        return counter;
    }
}

