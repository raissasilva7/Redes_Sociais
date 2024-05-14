package exceptions;

// Exceção Unchecked (UncheckedException)
// Essa parte trata de exceções, que são situações de erro no código.

public class RedeSocialException extends RuntimeException {
    public RedeSocialException(String mensagem) {
        super(mensagem);
    }
}