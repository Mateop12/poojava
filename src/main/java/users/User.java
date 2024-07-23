package users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    //Atributos encapsulados con el modificador private
    private int id;
    private String name;

    private String surname;

    private String phone;

    private String email;

    private  String password;


    // Constructor de la clase
    public  User(){

    }

    public User(int id, String name, String surname, String phone, String email, String password){

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    // Getter and Setter

    public int getId(){
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //metodo propio

    //List<ArrayList<Object>> usuarios = new ArrayList<>();

    ArrayList<Object> usuario = new ArrayList<Object>();
    public void crearUsuario(){
        System.out.println("Id:");
        id = sc.nextInt();
        sc.nextLine();
        usuario.add(id);

        System.out.println("Nombre");
        name = sc.nextLine();
        usuario.add(name);

        System.out.println("Apellido");
        surname = sc.nextLine();
        usuario.add(surname);

        System.out.println("Telefono");
        phone = sc.nextLine();
        usuario.add(phone);

        System.out.println("Correo");
        email = sc.nextLine();
        usuario.add(email);

        System.out.println("Contraseña");
        password = sc.nextLine();
        usuario.add(password);

        //usuarios.add(usuario);

    }

    public void printUser(){
        for (Object item : usuario){
            System.out.println(item);
        }
    }

    /*public void printUsers(){
        for (Object item : usuarios){
            System.out.println(item);
        }
    }*/
}
