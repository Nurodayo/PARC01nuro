public class Reserva{
    private String fechaDeInicio;
    private String fechaDeTermino;
    private int cantPersonas;
    private Habitacion habitacionSeleccionada

    public Reserva(String fechaDeInicio, String fechaDeTermino, int cantPersonas, Habitacion habitacionSeleccionada){
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeTermino = fechaDeTermino;
        this.cantPersonas = cantPersonas;
        this.habitacionSeleccionada = habitacionSeleccionada;
    }

    public int getCantPersonas(){
        return this.cantPersonas;
    }
    public int setCantPersonas(int newCant){
        this.cantPersonas = newCant;
    }
}