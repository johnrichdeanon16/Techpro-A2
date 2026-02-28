class HellsingCharacter { // Renamed from Seatwork6 to match your main method
    String name;
    String role;
    String ability;

    void displayInfo() {
        System.out.println("--- Character Info ---");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Ability: " + ability);
        System.out.println("----------------------");
    }
}

public class Seatwork6 {
    public static void main(String[] args) {

        // 1. Initialize as null to demonstrate the exception
        HellsingCharacter character1 = null;

        try {
            // This will fail because character1 has no memory allocated yet
            character1.displayInfo();
        } catch (NullPointerException e) {
            System.out.println("Error: Hellsing character object is not created yet.");
        }

        // 2. Now we actually instantiate the object
        character1 = new HellsingCharacter();

        // Assigning values to Alucard
        character1.name = "Alucard";
        character1.role = "Hellsing Organization's Ultimate Weapon";
        character1.ability = "Vampiric Powers (Shapeshifting, Regeneration, Reality Warping)";

        // 3. This will now work perfectly
        character1.displayInfo();
    }
}