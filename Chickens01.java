public class Chickens01 {
    public static void main(String[] args) {
        // First Scenario
        int totalEggs = 0;
        int eggsPerChicken = 5;
        int chickenCount = 4;

        // Monday
        totalEggs = countEggs(eggsPerChicken, chickenCount);

        // Tuesday
        chickenCount++;
        totalEggs += countEggs(eggsPerChicken, chickenCount);

        // Wednesday
        chickenCount /= 2;
        System.out.println(chickenCount);
        totalEggs += countEggs(eggsPerChicken, chickenCount);


        System.out.println(totalEggs);


    }
    // Calculates totalEggs
    public static int countEggs(int eggsPerChicken, int chickenCount) {
        return eggsPerChicken * chickenCount;

    }
}