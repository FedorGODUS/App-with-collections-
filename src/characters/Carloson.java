package characters;
import Staff.Propeller;
public class Carloson extends Human implements HowIFeel,HearFromDownstair {
    public Carloson(String aName, Gender gender,aMood mood) {
        super(aName, gender,mood);
    }

    private void PodnimatPlechiKogdaPloho() {
        System.out.println("SORRY, я " + getName() + " пожимаю плечами");
    }

    public void KrutitPropom(Propeller p) {
        System.out.println("Я ЕСТЬ " + getName() + "и я умею крутить моим " + p.getNameOfPropeller() + " у пропеллера " + p.getBlades() + " лопастей и их длина равна " + p.getLenght() + " сантиметров");
    }

    @Override
    public void HowIFeelWith(Human human, Human aHuman) {
        if (human.getMyMood() == Human.aMood.UNHAPPY) {
            System.out.println("Oй ой ой, натворили мы делов с " + aHuman.getName() + ", чёто я себя чувстую как-то " + human.getMyMood());
            PodnimatPlechiKogdaPloho();
        } else {
            System.out.println("У нас с " + aHuman.getName() + " чики-пуки");
        }
    }

    @Override
    public String toString() {
        return " настроение "+getMyMood() +" имя " +getName();


    }


}