package funcionalidade;

import exceptions.RedeSocialCheckedException;
import exceptions.RedeSocialException;

import java.util.HashSet;

// Classe Usuário
public class Usuario {
    private String nome; // Nome do usuário
    private String email;
    private HashSet<RedeSocial> redesSociais; // Usando HashSet para garantir redes sociais únicas

    // Construtor que recebe nome e email do usuário.
    public Usuario(String nome, String email) {
        this.nome = nome; // Define o nome do usuário
        this.email = email;
        this.redesSociais = new HashSet<>(); // Inicializa o conjunto de redes sociais.
    }

    // Método para adicionar uma rede social ao conjunto.
    public void adicionarRedeSocial(RedeSocial redeSocial) {
        redesSociais.add(redeSocial);
    }

    // Método para remover uma rede social do conjunto.
    public void removerRedeSocial(RedeSocial redeSocial) {
        redesSociais.remove(redeSocial);
    }

    // Método para usar as redes sociais do usuário.
    public void usarRedesSociais() {
        for (RedeSocial redeSocial : redesSociais) {
            System.out.println("O usuário " + nome + " está usando a rede social " + redeSocial.getClass().getSimpleName() + ":");
            try {
                if (redeSocial instanceof GooglePlus) {
                    VideoConferencia vc = (VideoConferencia) redeSocial;
                    Compartilhamento cp = (Compartilhamento) redeSocial;
                    vc.fazStreaming();
                    cp.compartilha();
                    redeSocial.postarVideo();
                } else if (redeSocial instanceof Instagram) {
                    redeSocial.postarFoto();
                    redeSocial.postarComentario();
                    redeSocial.curtirPublicacao();
                    // Lançamento de RedeSocialCheckedException para teste
                    throw new RedeSocialCheckedException("Erro ao usar Instagram");
                }
                System.out.println("---------------------");
            } catch (RedeSocialException e) {
                System.out.println("Erro não verificado: " + e.getMessage());
            } catch (RedeSocialCheckedException e) {
                System.out.println("Erro verificado: " + e.getMessage());
            }
            System.out.println("============================================");
        }
    }
}
