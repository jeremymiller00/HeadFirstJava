public class TestFormats {
    public static void main(String[]  args) {
        //Number formatting
        String s = String.format("%, d", 100000000); // instructions, argument
        System.out.println(s);
        String t = String.format("I have %,.2f bugs to fix", 45323236.67176787);
        System.out.println(t);
        String x = String.format("%,6.1f", 42.75);
        System.out.println(x);
        String y = String.format("The rank is %,d out of %,.2f", 2343, 454545.777);
        System.out.println(y);

        // Date formatting


    }
}

/* 
% arg number, flags, width, .precision, type
"d" = format as decimal integer and use commas
"%" = variable, reference to argument (insert arguement here)
"<" = use the previous arguement again (i.e. "%tA, %<tB, %<td", today)
                                        vs. "%tA, %tB, %td", today, today, today

number types:
d = decimal (must be compatible with int)
f = float
x = hexadecimal
c = character

date type:
%tc = complete date and time
%tr = just the time
%tA = day of the week (i.e. "Monday")
%tB = Month
%td = day of the month (i.e. "21")


*/
