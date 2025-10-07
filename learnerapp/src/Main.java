public class Main {
    private String[] learnername = new String[5];  // Array size 5

    public void assign() {
        // Assign 5 fixed names in a loop
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};

        for (int i = 0; i < learnername.length; i++) {
            learnername[i] = names[i];
        }
    }

    public void printNames() {
        for (int i = 0; i < learnername.length; i++) {
            System.out.println("learnername[" + i + "] = " + learnername[i]);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.assign();
        obj.printNames();
    }
}