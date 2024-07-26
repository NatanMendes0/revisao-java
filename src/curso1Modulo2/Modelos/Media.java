package curso1Modulo2.Modelos;

public class Media {
    private Double nota1,nota2;

    public Media(Double nota1, Double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double pegaMedia(){
        return (nota1+nota2) / 2;
    }
}
