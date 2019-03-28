class BooksTestDrive {
    
    public static void main(String[] args) {

        // declare array of Books objects of length 3
        Books[] myBooks = new Books[3]; 
        // counter
        int x = 0;

        // create book objects
        Books book1 = new Books();
        myBooks[0] = book1;
        Books book2 = new Books();
        myBooks[1] = book2;
        Books book3 = new Books();
        myBooks[2] = book3;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "Katelyn";
        myBooks[1].author = "Binh";
        myBooks[2].author = "Derek";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}