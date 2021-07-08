import jdk.nashorn.internal.objects.NativeJSON;

import java.util.Scanner;

public class Book {

    private int bookCode;
    private String name;
    private double price;
    private String author;

    public Book() {

    }

    public Book(int bookCode, String name, double price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input length of array book");
        int number = input.nextInt();
        Book arr[] = setArrBook(number);
        input.nextLine();
        System.out.println("Input name of book are you want to search");
        String name = input.nextLine();
        int index = searchNameBook(name, arr);
        extracted(arr, index);
        Double price = input.nextDouble();
        index = searchPriceBook(price, arr);
        extracted(arr, index);
    }

    private static void extracted(Book[] arr, int index) {
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(convertObjectToString(index, arr));
        }
        System.out.println("Input price of book are you want to search");
    }

    public static Book setNewBook(Book book) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input bookCode");
        book.setBookCode(input.nextInt());
        System.out.println("Input price");
        book.setPrice(input.nextDouble());
        input.nextLine();
        System.out.println("Input bookName");
        book.setName(input.nextLine());
        System.out.println("Input author");
        book.setAuthor(input.nextLine());
        return book;
    }

    public static Book[] setArrBook(int n) {
        Book arr[] = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Creat a book of index\t " + i);
            Book book = new Book();
            arr[i] = setNewBook(book);
        }
        return arr;
    }

    public static int searchNameBook(String name, Book arr[]) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].name)) {
                index = i;
            }
        }
        return index;
    }

    public static int searchPriceBook(Double price, Book arr[]) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (price == arr[i].price) {
                index = i;
            }
        }
        return index;
    }

    public static String convertObjectToString(int index, Book arr[]) {
        return "Name:\t" + arr[index].name + "\tPrice:\t" + arr[index].price +
                "\tBookCode:\t" + arr[index].bookCode + "\tAuthor:\t" + arr[index].author;
    }
}
