package funcionalidade;

import java.util.HashSet;

// Classe Main para testar o modelo
public class Main {
    public static void main(String[] args) {
        // Criando um conjunto de redes sociais
        HashSet<RedeSocial> redesSociais = new HashSet<>();
        redesSociais.add(new Instagram("Ray", "ray@gmail.com"));
        redesSociais.add(new GooglePlus());

        // Criando um usuário com nome, email e o conjunto de redes sociais
        Usuario usuario = new Usuario("Raíssa", "raissa.silva@get.inatel.br", redesSociais);

        // Utilizando as redes sociais do usuário
        usuario.usarRedesSociais();
    }
}
