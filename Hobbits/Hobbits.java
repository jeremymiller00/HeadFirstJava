class Hobbits {

    String name;

    public static void main(String[] args) {

        // create list of 3 hobbits
        Hobbits[] h = new Hobbits[3];

        // counter
        int z = 0;

        while (z < 3) {
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name.");
            z = z + 1;

        }
    }
}