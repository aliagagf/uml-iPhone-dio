package products;
import usability.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

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

}
