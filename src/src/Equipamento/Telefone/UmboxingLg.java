package src.Equipamento.Telefone;

public class UmboxingLg implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
}
