public class Athlete {
    // Fields to store athlete details
    public String athleteName;
    public double athleteSpeed;
    public int athleteAge;

    // Constructor to initialize athlete details
    public Athlete(String name, double speed, int age) {
        this.athleteName = name;
        this.athleteSpeed = speed;
        this.athleteAge = age;
    }

    // Method to simulate athlete running
    public void athleteRun() {
        System.out.println("Athlete " + athleteName + " runs at " + athleteSpeed + " km/hr.");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an Athlete object
        Athlete athlete = new Athlete("Usain Bolt", 44.72, 36);
        
        // Call the athleteRun method
        athlete.athleteRun();
    }
}
