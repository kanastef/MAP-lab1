import java.util.ArrayList;
public class Grades {

    public static int[] failingGrades(int[] grades) {
        ArrayList<Integer> failingGrades = new ArrayList<>();
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 40)
                failingGrades.add(grades[i]);
        }
        int[] newFailingGrades = new int[failingGrades.size()];
        for (int i = 0; i < failingGrades.size(); i++) {
            newFailingGrades[i] = failingGrades.get(i);
        }
        return newFailingGrades;
    }

    public static double average(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return Math.round((double) sum / grades.length * 100.0) / 100.0;
    }

    public static int[] round(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        int count = 0;
        for (int grade : grades) {
            if (grade >= 38 && 5 - (grade % 5) < 3) {
                roundedGrades[count] = grade + (5 - grade % 5);
                count++;
            } else {
                roundedGrades[count] = grade;
                count++;
            }
        }
        return roundedGrades;
    }

    public static int maxRounded(int[] grades) {
        grades = round(grades);
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
}
