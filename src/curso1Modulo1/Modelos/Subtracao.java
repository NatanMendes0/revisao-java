package Modelos;

public class Subtracao implements Conta {
    private int var10=10, var5=5;

    @Override
    public int conta() {
        return var10-var5;
    }
}
