package exceptions;

// Exceção Checked (CheckedException)
// Essa parte trata de exceções, que são situações de erro no código.

public class RedeSocialCheckedException extends Exception {
    public RedeSocialCheckedException(String mensagem) {
        super(mensagem);
    }
}