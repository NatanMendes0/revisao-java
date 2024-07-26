package curso1Modulo2.Modelos;

public class TestaCasting {
    private double numDouble;
    private int numInteiro;

    public TestaCasting(Double numDouble, int numInteiro) {
        this.numDouble = numDouble;
        this.numInteiro = numInteiro;
    }

    public int fazCasting (){
        return (int) numDouble;
    }
}
