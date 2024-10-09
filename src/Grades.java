public class Grades {

    public static int[] failingGrades(int[] grades) {
        int[] failingGrades = new int[grades.length];
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40) {
                failingGrades[count] = grades[i];
                count++;
            }
        }
        return failingGrades;
    }

    public static double average(int[] grades) {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

    public static int[] round(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38 && 5 - (grades[i] % 5) < 3){
                roundedGrades[count] = grades[i] + (5 - grades[i] % 5);
                count++;
            }
            else {
                roundedGrades[count] = grades[i];
                count++;
            }
        }
        return roundedGrades;
    }
}
