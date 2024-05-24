package products;
import usability.AparelhoTelefonico;
import usability.NavegadorInternet;
import usability.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    @Override
    public void tocar(){
        System.out.println("Tocando música");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Tocando a música: " + musica);
    }

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo página da URL " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }
}
