public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Experiment experiment = new Experiment();
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\n=== РАЗМЕР МАССИВА: " + size + " ===");

            int[] randomArray = sorter.generateRandomArray(size);
            int[] arrayForMerge = randomArray.clone();

            System.out.println("--- Случайные данные ---");
            System.out.println("Bubble Sort: " + experiment.measureSortTime(randomArray, "basic") + " ns");
            System.out.println("Merge Sort:  " + experiment.measureSortTime(arrayForMerge, "advanced") + " ns");

            System.out.println("--- Отсортированные данные ---");
            System.out.println("Bubble Sort: " + experiment.measureSortTime(randomArray, "basic") + " ns");
            System.out.println("Merge Sort:  " + experiment.measureSortTime(arrayForMerge, "advanced") + " ns");

            System.out.println("Linear Search: " + experiment.measureSearchTime(randomArray, -1) + " ns");
        }
    }
}