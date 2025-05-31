public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

Book(int bookId, String title, String author){
    this.bookId = bookId;
    this.title = title;
    this.author = author;
    this.isAvailable = true;

}

public int getBookId(){
    return bookId;
}

public String getTitle(){
    return title;
}

public String getAuthor(){
    return author;
}
public boolean isAvailable(){
    return isAvailable;
}

public boolean borrowBook(){
    if(isAvailable == false){
        System.out.println("Book is already borrowed");
        return isAvailable;
    }
    else{
    isAvailable = false;
    return isAvailable;
    }
}

public boolean returnBook(){
    if(isAvailable == true){
        System.out.println("Book has already been returned");
        return isAvailable;
    }
    else{
    isAvailable = true;
    return isAvailable;
    }
}

public void displayDetails(){
    System.out.println("ID: "+bookId+" Title: "+title+" Author: "+author+" Available: "+isAvailable());
}



}