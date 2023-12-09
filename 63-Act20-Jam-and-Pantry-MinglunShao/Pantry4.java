import java.util.ArrayList;
import java.util.Arrays;

public class Pantry4 {
    // Instance Variables
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    // Constructors
    Pantry4(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    Pantry4(Jam jar1, Jam jar2) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = null;
    }

    Pantry4(Jam jar1) {
        this.jar1 = jar1;
        this.jar2 = null;
        this.jar3 = null;
        selected = null;
    }

    // Methods
    public String toString() {
        String str = "";
        if (jar1 != null)
            str += "\n1: " + jar1.toString() + "\n";
        if (jar2 != null)
            str += "\n2: " + jar2.toString() + "\n";
        if (jar3 != null)
            str += "\n3: " + jar3.toString() + "\n";
        return str;
    }

    // assume that the user entered a correct selection, 1, 2, or 3
    public boolean select(int jarNumber) {
        if (jarNumber == 1) {
            if (jar1 == null)
                return false;
            selected = jar1;
        }

        if (jarNumber == 2) {
            if (jar2 == null)
                return false;
            selected = jar2;
        }

        if (jarNumber == 3) {
            if (jar3 == null)
                return false;
            selected = jar3;
        }

        return true;
    }

    // spread the selected jam
    public void spread(int ml) {
        if (selected != null)
            selected.spread(ml);
    }

    public void replace(Jam j, int slot) {
        if (slot == 1) {
            jar1 = j;
        }

        else if (slot == 2) {
            jar2 = j;
        }

        else {
            jar3 = j;
        }
    }

    public void mixedFruit() {

        if (jar2 == null && jar3 == null)
            System.out.println("Cannot Mix 1 Jam");
        else if (jar3 == null) {
            if (jar1.getCapacity() <= 20 && jar2.getCapacity() <= 20) {
                jar1.contents = "Mixed Fruit";
                jar1.capacity = jar1.getCapacity() + jar2.getCapacity();

                int date1 = jar1.date.day + jar1.date.month * 40 + jar1.date.year * 800;
                int date2 = jar2.date.day + jar2.date.month * 40 + jar2.date.year * 800;

                if (date1 >= date2)
                    jar1.date = jar1.date;
                else if (date2 >= date1)
                    jar1.date = jar2.date;

                jar2 = null;
                jar3 = null;
            }
        } else if (jar2 == null) {
            if (jar1.getCapacity() <= 20 && jar3.getCapacity() <= 20) {
                jar1.contents = "Mixed Fruit";
                jar1.capacity = jar1.getCapacity() + jar3.getCapacity();

                int date1 = jar1.date.day + jar1.date.month * 40 + jar1.date.year * 800;
                int date3 = jar3.date.day + jar3.date.month * 40 + jar3.date.year * 800;

                if (date1 >= date3)
                    jar1.date = jar1.date;
                else if (date3 >= date1)
                    jar1.date = jar3.date;

                jar2 = null;
                jar3 = null;
            }
        } else {
            if (jar1.getCapacity() <= 20 && jar2.getCapacity() <= 20 && jar3.getCapacity() <= 20) {
                jar1.contents = "Mixed Fruit";
                jar1.capacity = jar1.getCapacity() + jar2.getCapacity() + jar3.getCapacity();

                int date1 = jar1.date.day + jar1.date.month * 40 + jar1.date.year * 800;
                int date2 = jar2.date.day + jar2.date.month * 40 + jar2.date.year * 800;
                int date3 = jar3.date.day + jar3.date.month * 40 + jar3.date.year * 800;

                if (date1 >= date2 && date1 >= date3)
                    jar1.date = jar1.date;
                else if (date2 >= date1 && date2 >= date3)
                    jar1.date = jar2.date;
                else if (date3 >= date1 && date3 >= date2)
                    jar1.date = jar2.date;

                jar2 = null;
                jar3 = null;
            }
        }

    }
}