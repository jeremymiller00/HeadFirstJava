public class SimpleDotComTest {

    public static void main (String[] args) {

        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};

        dot.setLocationCells(locations);

        // test 2 as a guess
        String guess2 = "2";
        String result2 = dot.checkYourself(guess2);
        String testResult2 = "failed";
        if (result2.equals("hit")) {
            testResult2 = "passed";
        }
        System.out.println(testResult2);

        // test 1 as a guess
        String guess1 = "1";
        String result1 = dot.checkYourself(guess1);
        String testResult1 = "failed";
        if (result1.equals("miss")) {
            testResult1 = "passed";
        }
        System.out.println(testResult1);

    }
}