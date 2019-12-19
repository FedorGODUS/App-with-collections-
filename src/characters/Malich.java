package characters;

public class Malich extends Human implements HowIFeel,HearFromDownstair {
    public Malich(String aName, Gender gender,aMood mood) {
        super(aName, gender,mood);
    }

    @Override
    public void HowIFeelWith(Human M, Human C) {
        if (M.getMyMood() == aMood.UNHAPPY) {
            System.out.println("ой ой ой, натворили мы с тобой делов, чёто я себя чувстую как-то " + getMyMood());
        } else {
            System.out.println("У нас всё чики-пуки");
        }


    }



    @Override
    public String toString() {
        return " настроение "+getMyMood() +" имя " +getName();
    }



    }


