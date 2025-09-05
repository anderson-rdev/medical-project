package medical.com.br.enums;

public enum StatusPedido {
    // Status principais
    PENDENTE("Aguardando pagamento"),
    PROCESSANDO("Processando pedido"),
    APROVADO("Pagamento aprovado"),
    PREPARANDO("Preparando para envio"),
    ENVIADO("Enviado para transporte"),
    EM_TRANSITO("Em trânsito"),
    ENTREGUE("Entregue"),

    // Status de problema
    AGUARDANDO_RETIRADA("Aguardando retirada"),
    DEVOLVIDO("Devolvido"),
    TROCA_AUTORIZADA("Troca autorizada"),
    REEMBOLSADO("Reembolsado"),

    // Status finais
    CANCELADO("Cancelado"),
    ESTORNADO("Estornado"),
    FRAUDE_SUSPEITA("Suspeita de fraude");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatusFinal() {
        return this == ENTREGUE ||
                this == CANCELADO ||
                this == ESTORNADO ||
                this == REEMBOLSADO ||
                this == FRAUDE_SUSPEITA;
    }

    public boolean permiteAlteracao() {
        return !isStatusFinal();
    }
}
