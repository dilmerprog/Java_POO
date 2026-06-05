public class jogadorFutebol implements Contrato, Contrato2{
    @Override
    public void Regra1() {
        System.out.print("Não andar de moto");

    }

    @Override
    public void Regra2() {
        System.out.print("Ir dormit cedo na vespera do jogo");
    }

    @Override
    public void Regra3() {
        System.out.print("Não chutar a bandeirinha do adversário");
    }
}
