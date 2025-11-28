import java.util.Scanner;

class Question {
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    public Question(String q, String a, String b, String c, String d, char correct) {
        question = q;
        optionA = a;
        optionB = b;
        optionC = c;
        optionD = d;
        correctAnswer = correct;
    }

    public boolean askQuestion(Scanner sc) {
        System.out.println(question);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
        System.out.print("Your answer (A/B/C/D): ");
        char answer = Character.toUpperCase(sc.next().charAt(0));
        return answer == correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question[] questions = new Question[10];

        questions[0] = new Question("1. What is the capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", 'B');
        questions[1] = new Question("2. Who wrote 'Romeo and Juliet'?", "William Wordsworth", "Charles Dickens", "William Shakespeare", "Leo Tolstoy", 'C');
        questions[2] = new Question("3. What is 7 * 6?", "42", "36", "48", "54", 'A');
        questions[3] = new Question("4. Which planet is known as the Red Planet?", "Earth", "Venus", "Mars", "Jupiter", 'C');
        questions[4] = new Question("5. Who is the founder of Microsoft?", "Steve Jobs", "Mark Zuckerberg", "Bill Gates", "Jeff Bezos", 'C');
        questions[5] = new Question("6. What is the chemical symbol for water?", "O2", "H2O", "CO2", "NaCl", 'B');
        questions[6] = new Question("7. In which year did India get independence?", "1945", "1947", "1950", "1952", 'B');
        questions[7] = new Question("8. What is the largest ocean on Earth?", "Atlantic", "Indian", "Arctic", "Pacific", 'D');
        questions[8] = new Question("9. Who invented the light bulb?", "Newton", "Edison", "Tesla", "Einstein", 'B');
        questions[9] = new Question("10. What is the square root of 64?", "6", "7", "8", "9", 'C');

        int score = 0;

        for (Question q : questions) {
            if (q.askQuestion(sc)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong!\n");
            }
        }

        System.out.println(" Your Score: " + score + "/10");
        sc.close();
    }
}
