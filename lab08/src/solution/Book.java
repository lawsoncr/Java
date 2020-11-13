package solution;

/**
 * @author Connor Lawson
 * @version 5.202324
 */
public class Book implements Comparable<Book>
{
    private String author;
    private String title;
    private int numberOfPages;
    
    /**
     * 
     * @param author is the author.
     * @param title is the title.
     * @param numberOfPages is number of pages.
     */ 
    public Book(String author, String title, int numberOfPages)
    {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }
    /**
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    /**
     * @param author sets the author.
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }
    /**
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * @param title sets the title.
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
    /**
     * @return numberOfPages
     */
    public int getNumberOfPages()
    {
        return numberOfPages;
    }
    /**
     * The.
     * @param numberOfPages the number of pages.
     */
    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }
    /**
     * The.
     * @param book to see if equal.
     * @return boolean books equal.
     */
    public boolean equals(Book book)
    {
        if (this.author.equals(book.getAuthor()) 
            && this.title.equals(book.getTitle()))
        {
            return true;
        }
        return false;
    }
    /**
     * @param book compares book.
     * @return the book comparison.
     */
    public int compareTo(Book book)
    {
        
        int result = this.author.compareTo(book.getAuthor());
        
        if (result == 0)
        {
            return this.title.compareTo(book.getTitle());
        }
        return result;
    }
    /**
     * @return string the parts of the book.
     */
    public String toString()
    {
        return this.author + ", " + this.title + ", " + this.numberOfPages;
    }
}
