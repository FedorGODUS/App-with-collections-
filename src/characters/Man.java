package characters;
import Places.Yard;
import Staff.*;

public class Man extends Human {

    private TheStateOfClothing aTheStateOfClothing = TheStateOfClothing.CLEAN;


    public Man(String aName, Gender gender,aMood mood) {
        super(aName, gender,mood);
    }

    public void Smoking(Sigara s) {
        System.out.println("Я ЕСТЬ " + getName() + " и я курю только сигары " + s.getName() + " длиной " + s.getLenght() + " см. и стоимостью " + s.getPrice() + "$");
    }

    public void SetTheStateOfClothing(TheStateOfClothing theStateOfClothing) {
        this.aTheStateOfClothing = theStateOfClothing;
        Otrichivat();
    }


    public TheStateOfClothing GetTheStateOfClothing() {
        return aTheStateOfClothing;
    }

    private void Otrichivat() {
        if (GetTheStateOfClothing() == TheStateOfClothing.DIRTY) {
            System.out.println("Я, " + getName() + " и моё пальто грязное и я тщательно отряхиваюсь");
            SetMyMood(aMood.UNHAPPY);
            System.out.println(getName() + " чувстует сейчас себя как-то " + getMyMood());
            SetTheStateOfClothing(TheStateOfClothing.CLEAN);


        } else {
            System.out.println("Я " + getName() + " и моё пальто чистое");
        }


    }


    @Override
    public String toString() {
       return " настроение " + getMyMood() + " имя " + getName() + " пальто " + GetTheStateOfClothing();
    }

    public void Zvat(Policeman p, Yard yard) {
        System.out.println("я " + getName() + " зову копа " + p.getName());
        yard.AddYardVisitor(p);

        SetMyMood(aMood.NORMAL);
    }


}

