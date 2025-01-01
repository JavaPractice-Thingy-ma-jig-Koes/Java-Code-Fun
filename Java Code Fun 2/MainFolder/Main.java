package MainFolder;

import java.io.File;

import Art.GeneralGUI;
import characters.playerStats.Player;
import combat.Combat;
import misc_tools.ColorPrint;

/**
 * The Main class serves as the entry point of the application,
 * handling initialization and orchestrating the primary flow
 * of gameplay.
 */
public class Main {

    // Current event index or ID
    private static int currentEvent;

    // Main player reference
    private static final Player player = new Player(10, 5);
    // Main GUI handler for user interface
    private static final GeneralGUI gui = new GeneralGUI();
    // Combat system handler
    private static final Combat combat = new Combat();

    /**
     * Gets the player object.
     *
     * @return player reference
     */
    public static Player getPlayer() {
        return player;
    }

    /**
     * Gets the main GUI reference.
     *
     * @return GUI reference
     */
    public static GeneralGUI getGui() {
        return gui;
    }

    /**
     * The main entry point of the program.
     * Displays startup messages, prints working directory, and prompts the user
     * to choose a character class.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        ColorPrint.print("Application Started", 46);
        ColorPrint.print("Working Directory: " + new File("").getAbsolutePath(), 43);

        gui.print("Please Choose a Class");
        gui.chooseClass();
    }

    /**
     * Proceeds to the next event or scenario.
     *
     * @param eventId the ID representing the next event
     */
    public static void onwards(int eventId) {
        gui.clear();
        ColorPrint.print("Event " + eventId + " triggered", 31);

        switch (eventId) {
            case 1:
                // Future events or branching logic can go here
                break;

            default:
                // Fallback event triggers a fight
                ColorPrint.print("Default event triggered", 31);
                combat.fight();
                break;
        }
    }

    /**
     * Overloaded onwards method which uses the currently stored event ID.
     */
    public static void onwards() {
        onwards(currentEvent);
    }

    /**
     * Called once the player has selected a character class
     * for their adventure. Equips the player accordingly,
     * enables the GUI, and proceeds to the next event.
     *
     * @param classNum the chosen class identifier
     */
    public static void commenceAdventure(int classNum) {
        player.issueEquipment(classNum);
        currentEvent = 0;

        gui.setPvis(true);  // Possibly making the player's visuals visible?
        onwards();
    }
}
