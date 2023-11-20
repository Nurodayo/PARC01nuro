public class Habitacion{
    private int nHabitacion;
    private int capacidad;

    public Habitacion(int nHabitacion, int capacidad){
        this.nHabitacion = nHabitacion;
        this.capacidad = capacidad;
    }

    public int getCapacidad(){
        return this.capacidad;
    }
    public int setCapacidad(int newCapacidad){
        this.capacidad = newCapacidad
    }
}