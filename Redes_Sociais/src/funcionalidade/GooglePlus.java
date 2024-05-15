package funcionalidade;

// Classe filha GooglePlus
public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma videoconferência no GooglePlus!");
    }

    @Override
    public void compartilha() {
        System.out.println("Compartilhou no GooglePlus!");
    }
}

