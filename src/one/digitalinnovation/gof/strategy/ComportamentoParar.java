package one.digitalinnovation.gof.strategy;

public class ComportamentoParar implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Reduzindo velocidade parando os movimentos...");
    }
}
