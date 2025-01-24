public class Statistics {

    public static int P1Stats(int P1Dice){
        int faces = 6;
        int outcomeP1 = 0;

        for (int i = 0; i < P1Dice; i++) {
            outcomeP1 += (int) (Math.random() * faces) + 1;
        }
        return outcomeP1;
    }

    public static int P2Stats(int P2Dice) {
        int faces = 6;
        int outcomeP2 = 0;

        for (int i = 0; i < P2Dice; i++) {
            outcomeP2 += (int) (Math.random() * faces) + 1;
        }
        return outcomeP2;// use for loop instead
    }

    public static int P3Stats(int P3Dice){
        int faces = 6;
        int outcomeP3 = 0;

        for (int i = 0; i < P3Dice; i++) {
            outcomeP3 += (int) (Math.random() * faces) + 1;
        }
        return outcomeP3;
    }
}
