import one.digitalinnovation.gof.facede.Facede;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton:
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento parar = new ComportamentoParar();
        Comportamento correr = new ComportamentoCorrer();

        CarroRobo carroRobo = new CarroRobo();
        carroRobo.setComportamento(normal);
        carroRobo.mover();
        carroRobo.mover();
        carroRobo.setComportamento(parar);
        carroRobo.mover();
        carroRobo.setComportamento(correr);
        carroRobo.mover();
        carroRobo.mover();
        carroRobo.mover();

        //Facede

        Facede facede = new Facede();
        facede.migrarCliente("Maria", "12345678");

    }
}
