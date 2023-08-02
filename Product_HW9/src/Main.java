import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> liberaryBooks = new ArrayList<>();
        liberaryBooks.add(new Book("Java book" , 250,"Dr.Maher"));
        liberaryBooks.add(new Book("Python book" , 100,"Dr.Mustafa"));
        liberaryBooks.add(new Book("javascript book" , 250,"Dr.Mohammed"));
        liberaryBooks.add(new Book("System analysis & design book" , 350,"Dr.Abeer"));
        try{
        do{
                System.out.println("The liberary contains list of books : ");
                System.out.println("from 1-4, choose the number of book or 0 to quit");

                for (int i = 0; i < liberaryBooks.size(); i++) {
                    System.out.println(i+1 +". "+liberaryBooks.get(i).getName());
                }
                int numBook = input.nextInt();
                checkNumber(numBook);
                if(numBook == 0) break;

                switch (numBook){
                    case 1:
                        System.out.println("Congraust! .. you get a discount \n the information of your book:  ");
                        System.out.println(liberaryBooks.get(0).toString());
                        break;
                    case 2:
                        System.out.println("Congraust! .. you get a discount \n the information of your book:  ");
                        System.out.println(liberaryBooks.get(1).toString());
                        break;

                     case 3:
                         System.out.println("Congraust! .. you get a discount \nThe information of your book:  ");
                         System.out.println(liberaryBooks.get(2).toString());
                        break;

                     case 4:
                         System.out.println("Congraust! .. you get a discount \n the information of your book:  ");
                         System.out.println(liberaryBooks.get(3).toString());
                        break;

                }

            }while (true);

            System.out.println("_________");
            ArrayList<Movie> movieList = new ArrayList<>();

            movieList.add(new Movie("Artificial intellgence movie" ,100,"Mohammed" ));
            movieList.add(new Movie("Drama movie" ,100,"Mohammed" ));
            movieList.add(new Movie("Action movie" ,100,"Mohammed" ));
            movieList.add(new Movie("Romantic movie" ,100,"Mohammed" ));

            do{
                System.out.println("from 1-4, choose the number of movie or 0 to quit");

                for (int i = 0; i < movieList.size(); i++) {
                    System.out.println(i+1 +". "+movieList.get(i).getName());
                }
                int numBook = input.nextInt();
                checkNumber(numBook);
                if(numBook == 0) break;

                switch (numBook){
                    case 1:
                        System.out.println("Congraust! .. you get a discount\nThe information of your movie:  ");
                        System.out.println(movieList.get(0).toString());
                        break;
                    case 2:
                        System.out.println("Congraust! .. you get a discount \n the information of your movie:  ");
                        System.out.println(movieList.get(1).toString());
                        break;

                    case 3:
                        System.out.println("Congraust! .. you get a discount \nThe information of your movie:  ");
                        System.out.println(movieList.get(2).toString());
                        break;

                    case 4:
                        System.out.println("Congraust! .. you get a discount \n the information of your movie:  ");
                        System.out.println(movieList.get(3).toString());
                        break;

                }

            }while (true);
        }catch (InputMismatchException e){
            System.out.println("Invalied, you must enter numbers");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkNumber(int num)throws Exception{
        if(!(num >= 0 && num < 5)){
            throw  new Exception("Your input exceeds the avalibele numbers");
        }

    }
}