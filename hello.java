
import java.util.Scanner;

public class ThreatDetectionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   API THREAT DETECTION SYSTEM");
        System.out.println("================================");

        System.out.print("Enter API request: ");
        String request = sc.nextLine().toLowerCase();

        if (request.contains("drop table")
                || request.contains("<script>")
                || request.contains("union select")
                || request.contains("../")) {

            System.out.println("\n[ALERT] Malicious request detected!");
            System.out.println("Action: Request blocked.");
        } else {
            System.out.println("\n[SAFE] No known threat pattern detected.");
            System.out.println("Action: Request allowed.");
        }

        sc.close();
    }
}
