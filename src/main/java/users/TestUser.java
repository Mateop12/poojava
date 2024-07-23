package users;

public class TestUser {

    public static void main(String[] args) {
        User user1 = new User();

        //user1.setId(1);
        //System.out.println(user1.getId());

        //user1.crearUsuario();
        //user1.crearUsuario();

       // user1.printUser();

        //user1.printUsers();

        User userInicio = new User("pepe@mail.com","1234");
        System.out.println(userInicio.getEmail());
        System.out.println(userInicio.getPassword());

    }

}
