import java.util.Scanner;
    public class ExamReport {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your first exam score: ");
        double score1 = scanner.nextDouble();
        System.out.println("Enter your second exam score: ");
        double score2 = scanner.nextDouble();
        System.out.println("Enter your third exam score: ");
        double score3 = scanner.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        double highscore = Math.max(Math.max(score1, score2), score3);
        double lowscore = Math.min(Math.min(score1, score2), score3);
        double spread = (highscore - lowscore);

        System.out.println(name.toUpperCase());

        System.out.println("Here is your report) ");
        System.out.println("AVERAGE: " + average);
        System.out.println("HIGHEST SCORE: " + highscore);
        System.out.println("LOWEST SCORE: " + lowscore);
        System.out.println("SPREAD: " + spread);        

    }
}
