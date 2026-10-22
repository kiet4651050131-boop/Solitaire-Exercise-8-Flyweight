
package ca.mcgill.solitaire.cards;

public class Exercise08 {

    public static void main(String[] args) throws Exception {
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();

        // Cach 1: Lay du 52 la bai voi Card tao san
        long startEager = System.currentTimeMillis();

        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                Card.get(rank, suit);
            }
        }

        long endEager = System.currentTimeMillis();
        long eagerTime = endEager - startEager;

        // Cach 2: Lay du 52 la bai voi CardLazy
        long startLazy = System.currentTimeMillis();

        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                CardLazy.get(rank, suit);
            }
        }

        long endLazy = System.currentTimeMillis();
        long lazyTime = endLazy - startLazy;

        System.out.println("So la bai: "
                + (ranks.length * suits.length));

        System.out.println("Eager time: "
                + eagerTime + " ms");

        System.out.println("Lazy time: "
                + lazyTime + " ms");
    }
}
