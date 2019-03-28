public class Mix4 {
    int counter = 0;
    
    /**
     * 
     * @param args
     */
    public static void main(String [] args) {
        int count = 0;

        Mix4 [] m4a = new Mix4[20]; // create a list for 20 objects
        int x = 0;
        while (x < 20) {
            m4a[x] = new Mix4(); // create an object
            m4a[x].counter = m4a[x].counter + 1; // increment instance variable
            count = count + 1; // increment local variable
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        } // end while loop
        System.out.println(count + " " + m4a[1].counter);

    } // end main method

    /**
     * 
     * @param index
     * @return 1 if index < 5, 0 otherwise
     */
    public int maybeNew(int index) {
        if (index < 5) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        } // end if block
        return 0;
    }



} // end class definition

