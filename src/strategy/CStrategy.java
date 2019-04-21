package strategy;

public class CStrategy implements Strategy {

    @Override
    public void operator() {
        System.out.println("策略C");
    }
}
