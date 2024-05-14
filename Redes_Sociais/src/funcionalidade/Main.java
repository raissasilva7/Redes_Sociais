package funcionalidade;

// Classe Main para testar o modelo
public class Main {
    public static void main(String[] args) {
        // Criando um usuário com nome e email
        Usuario usuario = new Usuario("Raíssa", "raissa.silva@get.inatel.br");

        // Adicionando uma rede social Instagram ao usuário
        usuario.adicionarRedeSocial(new Instagram("Ray", "ray@gmail.com"));

        // Adicionando uma rede social GooglePlus ao usuário
        usuario.adicionarRedeSocial(new GooglePlus());

        // Utilizando as redes sociais do usuário
        usuario.usarRedesSociais();
    }
}
