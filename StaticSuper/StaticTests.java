public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        // the two static block get called here, before anything else
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}

class StaticSuper {
    static { // this gets called only when the Class is initialized (the first instance is created)
        System.out.println("super static block");
        }
    
    StaticSuper() {
        System.out.println("super constructor");
    }
}