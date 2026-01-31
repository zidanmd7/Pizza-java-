# Pizza-java-
 small class hierarchy for pizza components and a Pizza class that assembles them.

# Pizza Lab(part 1) — Class Hierarchy + Builder

This project implements a small Java class hierarchy for pizza components (crust, sauce, toppings) and a `Pizza` class that assembles them. It also includes a simple `PizzaMain` program that lets a user choose a crust, sauce, and up to 4 toppings, then prints the final pizza using `toString()`.


Requirements Implemented

- **Exact class names** as required:
  - Toppings: `PizzaTopping`, `MeatTopping`, `VeggieTopping`, `CheeseTopping`
  - Concrete toppings:
    - Meat: `Sausage`, `Pepperoni`, `Bacon`, `Ham`
    - Veggie: `Olives`, `Onions`, `GreenPeppers`, `Mushrooms`
    - Cheese: `Mozzarella`, `Parmesan`, `Cheddar`, `Provolone`
  - Sauce: `PizzaSauce`, `TomatoSauce`, `AlfredoSauce`
  - Crust: `PizzaCrust`, `ThinCrust`, `ThickCrust`
  - Main: `Pizza`, `PizzaMain`

- Every class overrides `toString()` and returns the required exact string.
- `Pizza` includes:
  - `PizzaCrust crust`
  - `PizzaSauce sauce`
  - A list of up to **4** `PizzaTopping` objects
- `addTopping(PizzaTopping t)`:
  - returns **true** if added
  - returns **false** if already 4 toppings
- `getToppings()` returns an **unmodifiable** list view.

---

Project Structure

All files are in the same package:

```txt
src/
└── edu/
    └── uno/
        └── csci2830/
            ├── PizzaMain.java
            ├── Pizza.java
            ├── PizzaTopping.java
            ├── MeatTopping.java
            ├── VeggieTopping.java
            ├── CheeseTopping.java
            ├── PizzaSauce.java
            ├── TomatoSauce.java
            ├── AlfredoSauce.java
            ├── PizzaCrust.java
            ├── ThinCrust.java
            ├── ThickCrust.java
            ├── Sausage.java
            ├── Pepperoni.java
            ├── Bacon.java
            ├── Ham.java
            ├── Olives.java
            ├── Onions.java
            ├── GreenPeppers.java
            ├── Mushrooms.java
            ├── Mozzarella.java
            ├── Parmesan.java
            ├── Cheddar.java
            └── Provolone.java
