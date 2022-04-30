package proyectoUno;

import java.util.Scanner;

public class WelcomeMessage {

    private String name;
    private Long phoneNumber;
    private Integer age;

    public String  askName(){
        Scanner enter = new Scanner(System.in);
        this.name = enter.nextLine();
        return this.name;
    }

    public Long askNumber(){
        Scanner enter = new Scanner(System.in);
        this.phoneNumber = enter.nextLong();
        return this.phoneNumber;
    }

    public Integer askAge(){
        Scanner enter = new Scanner(System.in);
        this.age = enter.nextInt();
        return this.age;
    }
    public static void main(String[] args) {

        WelcomeMessage welcome = new WelcomeMessage();
        System.out.println("Type your name");
        String username = welcome.askName();
        System.out.println("Type your phone number");
        Long userNumber = welcome.askNumber();
        System.out.println("Type you age");
        Integer userAge = welcome.askAge();

        System.out.println("Bienvenido señor "+ username + ", ");
        System.out.println("es un placer para nosotros contar con una persona de "+userAge+ " anios.");
        System.out.println("Proximamente nos comunicaremos con usted al numero "+ userNumber + ".");
        System.out.println("Feliz dia");
    }
}
