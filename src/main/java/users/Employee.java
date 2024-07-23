package users;

import java.util.Scanner;

public class Employee extends User{

    //codigo en whatsap
    public Employee(){
        super();
    }

    public Employee(int id, String name, String surname, String phone, String email, String password) {
        super(id, name, surname, phone, email, password);
    }



    public String seleccionarTipoEmpleado(int opc) {
        switch (opc) {
            case 1:
                return TipoCliente.CAJERO.toString();
            case 2:
                return TipoCliente.ASESOR.toString();
            case 3:
                return TipoCliente.SUPERVISOR.toString();
            default:
                return "Tipo de cliente no válido";
        }
    }

    public void Validacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de tipo de cliente (1 - cajero, 2 - asesor, 3 - supervisor): ");
        int opcion = sc.nextInt();

        String tipoClienteSeleccionado = seleccionarTipoEmpleado(opcion);
        System.out.println("Tipo de cliente seleccionado: " + tipoClienteSeleccionado);

        sc.close();
    }
}
