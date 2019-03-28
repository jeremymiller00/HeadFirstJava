class BooksTestDrive {
    
    public static void main(String[] args) {

        // declare array of Books objects of length 3
        Books[] myBooks = new Books[3]; 

        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[3].title = "The Java Cookbook";
        myBooks[0].author = "Katelyn";
        myBooks[1].author = "Binh";
        myBooks[1].author = "Derek";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}