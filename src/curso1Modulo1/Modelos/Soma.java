package curso1Modulo1.Modelos;

public class Soma implements Conta{
    private int var10=10, var5=5;

    @Override
    public int conta() {
        return var10 + var5;
    }
}
