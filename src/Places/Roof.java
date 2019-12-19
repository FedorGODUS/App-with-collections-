package Places;
import characters.*;

import java.util.ArrayList;

public class Roof {
    private ArrayList RoofVisiter = new ArrayList();

    public void AddRoofVisiter(Human visiter){
        RoofVisiter.add(visiter);
        System.out.println(visiter.getName()+" находится на крыше");
    }
}
