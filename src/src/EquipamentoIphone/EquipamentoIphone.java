package src.EquipamentoIphone;

import src.Equipamento.Musica.ReproduzirMusica;
import src.Equipamento.Navegador.NavegadorInternet;
import src.Equipamento.Telefone.AparelhoTelefonico;

public class EquipamentoIphone implements ReproduzirMusica, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo  Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Parado na musica no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo musica no Iphone");
    }

    public void pagina() {
        System.out.println("Abrindo internet no Iphone");
    }

    @Override
    public void adicionandoNovaPagina() {
        System.out.println("Adicionando pagina pelo Iphone");
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Atualizando a pagina pelo Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligar Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atender Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz Iphone");
    }
}
