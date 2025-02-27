public class Estudiantes {
    int id;
    String carrera;
    String nombre;
    double promedio;

    public Estudiantes(int id, String carrera, String nombre, double promedio) {
        this.id = id;
        this.carrera = carrera;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public Estudiantes() {}

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "id=" + id +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                '}';
    }

}