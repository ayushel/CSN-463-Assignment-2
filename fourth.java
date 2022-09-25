public class fourth {
    public static void main(String[] args) {
        int population = 80000, numberOfYears = 0;

        while (population <= 150000) {
            int populationIncrement = (int) (Math.ceil(0.05 * population)); // Rounding up and casting the increment to
                                                                            // integer as number of people born can't be
                                                                            // fractional
            population += populationIncrement;
            numberOfYears++;
        }

        System.out.println("Number of years for population to exceed 150,000: " + numberOfYears);
    }
}
