package one.digitalinnovation.gof.strategy;

public class ComportamentoCorrer implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movimento de corrida ganhando maior velocidade...");
    }
}
