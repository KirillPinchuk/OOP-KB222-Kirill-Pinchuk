package lab_03;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {
        Sprint sprint = new Sprint(100, 5);

        UserStory userStory1 = new UserStory(1, "User 1", 20, new ArrayList<>());
        UserStory userStory2 = new UserStory(2, "User 2", 30, Arrays.asList(userStory1));

        Bug bug = Bug.createBug(1, "Bug 1", 10, userStory1);

        sprint.addUserStory(userStory1);
        sprint.addUserStory(userStory2);
        sprint.addBug(bug);

        int totalEstimate = sprint.getTotalEstimate();
        List<Ticket> tickets = sprint.getTickets();

        System.out.println("Total Estimate: " + totalEstimate);
        System.out.println("Tickets:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}