package users;

public class Customer extends User{         //user seria la clase padre, hereda los atributos (HERENCIA)

    private int codCliente;
    private String tipoCliente;

    public Customer(){
        super();                                //llamamos al constructor de la clase padre
    }

    public Customer(int id, String name, String surname, String phone, String email, String password, int codCliente, String tipoCliente) {
        super(id, name, surname, phone, email, password);
        this.codCliente = codCliente;
        this.tipoCliente = tipoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public void crearUsuario() {                            //POLIMORFISMO SOBRESCRITURA
        super.crearUsuario();
        System.out.println("Codigo cliente");
        codCliente = sc.nextInt();
        System.out.println("Tipo cliente");
        System.out.println("Selecciones 1. persona natural 2. persona juridica");
        int opc = sc.nextInt();
        tipoCliente = seleccionarTipoCliente(opc);

    }

    public String seleccionarTipoCliente(int opc){

        if (opc == 1){
            String personaNatural = String.valueOf(TipoCliente.PERSONA_NATURAL);
            return personaNatural;
        } else if (opc == 2) {
            String personaJuridica = String.valueOf(TipoCliente.PERSONA_JURIDICA);
            return personaJuridica;
        } else {
            String mensaje = "Seleccione un valor valido";
            return mensaje;
        }
    }
}
