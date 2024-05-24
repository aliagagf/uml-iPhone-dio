import products.Computador;
import products.Iphone;
import products.Ipod;
import products.Telefone;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        Ipod ipod = new Ipod();
        Computador computador = new Computador();
        Telefone telefone = new Telefone();

        iphone.exibirPagina("1111");
        ipod.selecionarMusica("Beatles - Yellow Submarine");
        computador.adicionarNovaAba();
        telefone.atender();
    }
}
