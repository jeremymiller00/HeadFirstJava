public class TestExceptions {
    public static void main(String[] args) {
        String test = "yes";

        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (InterruptedException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }

    static void doRisky(String test) throws InterruptedException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new InterruptedException();
        }
        System.out.println("end risky");
        return;
    }
}