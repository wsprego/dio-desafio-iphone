/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone;

/**
 *
 * @author junto
 */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando muica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica);
    }
    
    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }
}

