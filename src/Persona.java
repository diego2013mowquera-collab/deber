class Persona {
    protected String nombre;
    protected int edad;
    protected float estatura;

    public Persona() {
    }

    public Persona(String nombre, int edad, float estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(float estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    // Metodo personalizado
    public String descripcion() {
        return " Persona: " + nombre;
    }

    public void imprimirdatos() {
        System.out.println("=======");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }

    public Persona copiar() {
        return new Persona(nombre);
    }
}