package characters;

public interface HowIFeel {
    default void HowIFeelWith(Human human, Human aHuman){
        if (human.getMyMood() == Human.aMood.UNHAPPY) {
            aHuman.SetMyMood(Human.aMood.UNHAPPY);
            System.out.println("Oй ой ой, натворили мы делов с "+aHuman.getName()+", чёто я себя чувстую как-то"+human.getMyMood());

        }
        else  {
            System.out.println("У нас с "+aHuman.getName()+" чики-пуки");
        }
    }

}
