package funcionalidade;

// Classe mãe abstrata RedeSocial
public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public abstract void curtirPublicacao();
}
