//****incomplete*****
public class Pantry2 {
    // Instance Variables
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    // Constructors
    Pantry2(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    Pantry2(Jam jar1, Jam jar2) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = null;
        selected = null;
    }

    Pantry2(Jam jar1) {
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
}