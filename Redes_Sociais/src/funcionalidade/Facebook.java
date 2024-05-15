package funcionalidade;

// Classe filha Facebook
public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma videoconferência no Facebook!");
    }

    @Override
    public void compartilha() {
        System.out.println("Compartilhou no Facebook!");
    }
}
