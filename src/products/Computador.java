package products;

import usability.NavegadorInternet;

public class Computador implements NavegadorInternet{
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
