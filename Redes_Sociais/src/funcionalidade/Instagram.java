package funcionalidade;

// Classe filha Instagram
public class Instagram extends RedeSocial {
    private String nome;
    private String email;

    public Instagram(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Instagram!");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Instagram!");
    }
}
