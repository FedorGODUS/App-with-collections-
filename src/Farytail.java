import Places.*;
import characters.*;
import Staff.*;

public class Farytail{
    public static void main(String[] args) {
        Carloson Carl = new Carloson("Carl", Human.Gender.MALE, Human.aMood.NORMAL);
        Propeller Prop = new Propeller("Prop",3,69);
        Sigara Siga = new Sigara(22,228,"Cammel");
        Malich Malichhhhh = new Malich("Malichhhhh", Human.Gender.MALE, Human.aMood.NORMAL);
        Yard Dvor = new Yard();
        Roof Kricha = new Roof();

        Man Mujic = new Man("Mujic", Human.Gender.MALE, Human.aMood.NORMAL);
        Policeman Ment =new Policeman("Ment", Human.Gender.FEMALE,"Policemen", Human.aMood.NORMAL);


        Kricha.AddRoofVisiter(Carl);
        Kricha.AddRoofVisiter(Malichhhhh);
        Carl.Zdorovat(Malichhhhh);
        Malichhhhh.Zdorovat(Carl);
        Carl.KrutitPropom(Prop);

        Dvor.AddYardVisitor(Mujic);
        Mujic.Smoking(Siga);


        Mujic.SetTheStateOfClothing(TheStateOfClothing.DIRTY);
        Carl.SetMyMood(Human.aMood.UNHAPPY);
        Carl.HowIFeelWith(Carl,Malichhhhh);
        Malichhhhh.SetMyMood(Human.aMood.UNHAPPY);
        Malichhhhh.HowIFeelWith(Malichhhhh,Carl);


        Dvor.Isee(Carl,Malichhhhh,Dvor);


        Mujic.Zvat(Ment,Dvor);
        Mujic.Zdorovat(Ment);
        Ment.Zdorovat(Mujic);
        Malichhhhh.IHear(Carl,Malichhhhh,Mujic,Ment);










        System.out.println(Carl.toString());
        System.out.println(Malichhhhh.toString());
        System.out.println(Ment.toString());
        System.out.println(Mujic.toString());


    }
}
