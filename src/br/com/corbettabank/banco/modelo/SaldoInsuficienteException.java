package br.com.corbettabank.banco.modelo;

/**
 * Exce��o para quando n�o der para sacar
 * @author bruno
 *
 */

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}