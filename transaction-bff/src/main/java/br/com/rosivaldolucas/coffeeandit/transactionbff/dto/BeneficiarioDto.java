package br.com.rosivaldolucas.coffeeandit.transactionbff.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class BeneficiarioDto implements Serializable {

    @Schema(description = "CPF do beneficiário.")
    @NotNull(message = "Informar o CPF.")
    private Long cpf;

    @Schema(description = "Código do banco de destino.")
    @NotNull(message = "Informar o código do banco de destino.")
    private Long codigoBanco;

    @Schema(description = "Agência de destino.")
    @NotNull(message = "Informar a agência de destino.")
    private String agencia;

    @Schema(description = "Conta de destino.")
    @NotNull(message = "Informar a conta de destino.")
    private String conta;

    @Schema(description = "Nome favorecido.")
    @NotNull(message = "Informar o nome do favorecido.")
    private String nomeFavorecido;

}
