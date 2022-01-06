package br.com.alura.aluraviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static final String IDIOMA = "pt";
    public static final String PAIS = "br";

    public static String formataParaBrasileiro(BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(
                new Locale(IDIOMA, PAIS));
        String moedaBrasileira = formatoBrasileiro
                .format(valor);
        return moedaBrasileira;

    }
}
