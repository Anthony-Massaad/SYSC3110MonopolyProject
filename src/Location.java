/**
 * @author Max Curkovic
 * Abstract class Location that generally describes a location on the board.
 * Note that some of these abstract methods are blank in specific elements, as they are not "real" properties that can be owned or bought.
 */
public abstract class Location {
    private final int cost;
    private final String name;

    /**
     * Constructor for Location
     * @param cost An integer cost
     * @param name A String name.
     */
    public Location(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    /**
     * Getter method for a name.
     * @return A String name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method for cost.
     * @return An Integer cost.
     */
    public int getCost() {
        return this.cost;
    }


    /**
     * Abstract boolean method for any functionality of a location on the board.
     * @param p A Player p.
     * @param totalDiceRoll An Integer sum of the dice.
     * @return A boolean, value depends on the subclass.
     */
    public abstract boolean locationElementFunctionality(Player p, int totalDiceRoll);

    /**
     * Overriden Java method for converting to a String.
     * @param p A Player object p.
     * @return A string.
     */
    public abstract String toString(Player p);

    /**
     * Abstract boolean method for purchasing an element.
     * @param p A Player object p.
     * @return True if bought, false otherwise.
     */
    public abstract boolean buy(Player p);

    /**
     * Abstract void method for resetting the owner of an element.
     */
    public abstract void resetOwner();

    /**
     * Abstract method for getting the result of a board event on an element.
     * @param p A Player object p.
     * @param event A BoardEvent event.
     */
    public abstract void getResult(Player p, BoardEvent event);

    /**
     * Abstract method for adding a view to a listener ArrayList.
     * @param view A BoardView view.
     */
    public abstract void addListener(BoardView view);
}
