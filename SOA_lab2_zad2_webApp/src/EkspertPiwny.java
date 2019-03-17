import java.util.ArrayList;
import java.util.List;

public class EkspertPiwny {

    public ArrayList<String> list(String color){
        ArrayList<String> beerList = new ArrayList<String>();
        if(color.equals("jasne")){
            beerList.add("Tyskie");
            beerList.add("Lubuskie");
        }else if(color.equals("ciemne")){
            beerList.add("ksiązęce");
            beerList.add("O wilku mowa");
        }else {
            beerList.add("nie mamy takiego rodzaju(do wyboru: jasne, ciemne)");
        }
        return beerList;
    }
}
