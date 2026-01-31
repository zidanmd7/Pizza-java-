package edu.uno.csci2830;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private final PizzaCrust crust;
    private final PizzaSauce sauce;
    private final ArrayList<PizzaTopping> toppings = new ArrayList<>();

    public Pizza(PizzaCrust crust, PizzaSauce sauce) {
        this.crust = crust;
        this.sauce = sauce;
    }

    public PizzaCrust getCrust() {
        return crust;
    }

    public PizzaSauce getSauce() {
        return sauce;
    }

    // Must return an unmodifiable view (or a copy)
    public List<PizzaTopping> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    // returns true if added, false if not
    // must reject toppings if there are already 4
    public boolean addTopping(PizzaTopping t) {
        if (toppings.size() >= 4) {
            return false;
        }
        toppings.add(t);
        return true;
    }
}
