/**
 * Alumno: Bueno Rosas Brayan Omar
 * Grupo: 5IM8.
 * Fecha: 31/08/2017
 */
package elementos;

public class Modelo {
    private int NumeroUno;
    private int NumeroDos;

    public int getNumeroUno() {
        return NumeroUno;
    }

    public void setNumeroUno(int NumeroUno) {
        this.NumeroUno = NumeroUno;
    }

    public int getNumeroDos() {
        return NumeroDos;
    }

    public void setNumeroDos(int NumeroDos) {
        this.NumeroDos = NumeroDos;
    }

    public int SumaNumeros(){
        return NumeroUno + NumeroDos;
    }
    
}
