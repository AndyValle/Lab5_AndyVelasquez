package lab5_felixvelasquez;

public class Partido {
    private String equipoRival;
    private int[] numeros = new int[11];

    public Partido(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public String getEquipoRival() {
        return equipoRival;
    }

    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
}