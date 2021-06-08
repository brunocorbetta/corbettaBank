package br.com.corbettabank.banco.modelo;

/**
 * Exceção para quando não der para sacar
 * @author bruno
 *
 */

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}