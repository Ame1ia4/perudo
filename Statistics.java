public class Statistics {

    public static int JamesStats(int JamesDice){
        int faces = 6;
        int outcomeJames = 0;

        for (int i = 0; i < JamesDice; i++) {
            outcomeJames += (int) (Math.random() * faces) + 1;
        }
        return outcomeJames;
    }

    public static int SarahStats(int SarahDice) {
        int faces = 6;
        int outcomeSarah = 0;

        for (int i = 0; i < SarahDice; i++) {
            outcomeSarah += (int) (Math.random() * faces) + 1;
        }
        return outcomeSarah;// use for loop instead
    }

    public static int CianStats(int CianDice){
        int faces = 6;
        int outcomeCian = 0;

        for (int i = 0; i < CianDice; i++) {
            outcomeCian += (int) (Math.random() * faces) + 1;
        }
        return outcomeCian;
    }

}
