import java.util.ArrayList;
import java.util.List;

public class RailRoad extends Location{
    private List<Integer> payments;
    private Player owner;


    public RailRoad(String name, int cost){
        super(cost, name);
        this.payments = new ArrayList<>(){{
           add(25);
           add(50);
           add(100);
           add(200);
        }};
        this.owner = null;
    }

    @Override
    public void locationElementFunctionality(Player p) {
        if (this.owner == null){
            // give p an option to either buy or pass
        }
        else {
            if (!this.owner.equals(p)) {
                // check if player landed is not the player owner
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "RailRoad: " + this.getName() + " {Current Price: " + this.payments.get(this.owner.getNumberOfRailroads()) + "}";
    }
}
