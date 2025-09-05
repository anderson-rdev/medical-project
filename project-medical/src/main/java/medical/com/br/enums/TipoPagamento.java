package medical.com.br.enums;

public enum TipoPagamento {
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    BOLETO,
    PIX,
    DINHEIRO;

    public static boolean isValid(String value) {
        for (TipoPagamento tipo : values()) {
            if (tipo.name().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
