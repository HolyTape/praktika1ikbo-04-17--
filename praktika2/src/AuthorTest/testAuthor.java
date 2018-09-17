package AuthorTest;
public class testAuthor {
    public static void main(String[] args)
    {
        Author author_1 = new Author("Bill Bob Bobson", "sweethomealabama@gmail.com", 'm');
        System.out.println(author_1.outToString());
        author_1.setEmail("billbob@yahoo.com");
        System.out.println(author_1.outToString());
    }
}
