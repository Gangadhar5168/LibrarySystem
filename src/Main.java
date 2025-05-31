import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--- Library Menu ---");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                
                System.out.println("Please enter Book ID");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Please enter the Title of the Book: ");
                String title = sc.nextLine();
                System.out.println("Please enter the Author name");
                String author = sc.nextLine();
                Book b = new Book(id,title,author);
                bookArray.add(b);
                    
                    break;
                case 2:
                if(bookArray.isEmpty()){
                    System.out.println("There no Books avaialble in the library");
                }
                else{
                for (Book i:bookArray){
                    i.displayDetails();
                }
            }
            break;
                case 3:
                if(bookArray.isEmpty()){
                    System.out.println("There no Books avaialble in the library");
                }else{
                    System.out.println("Enter the Book ID to borrow:");
                int borrowId = sc.nextInt();
                    for (Book i:bookArray){
                        if(i.getBookId() == borrowId){
                            i.borrowBook();
                            break;
                        }

                    }
                }
                break;
                case 4:
                System.out.println("Enter the Book ID to Return:");
                int returnid = sc.nextInt();
                    for (Book i:bookArray){
                        if(i.getBookId() == returnid){
                            i.returnBook();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Hope you have borrowed/returned books! enjoy reading");
                   sc.close();
                    System.exit(0);
                    
                    break;

            
                default:
                    System.out.println("You have entered a wrong choice in Menu");
                break;
                    
            }
        }
    }
}
