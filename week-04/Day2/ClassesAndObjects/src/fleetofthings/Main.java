package fleetofthings;

public class Main {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing mythings = new Thing("Get milk");
        Thing mythings1 = new Thing("Remove the obstacles");
        Thing mythings2 = new Thing("Stand up");
        Thing mythings3 = new Thing("Eat lunch");
        fleet.add(mythings);
        fleet.add(mythings1);
        fleet.add(mythings2);
        fleet.add(mythings3);
        mythings2.complete();
        mythings3.complete();

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}