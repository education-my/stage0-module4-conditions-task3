package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month == 12 || month <= 2 && month >= 1) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 7) {
            System.out.println("Summer");
        } else if (month >= 8 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("wrong number!");
        }
    }
}
