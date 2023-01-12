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
public class ContaDto implements Serializable {

    @Schema(description = "Código da agência.")
    @NotNull(message = "Informar o código da agência.")
    private Long codigoAgencia;

    @Schema(description = "Código da conta.")
    @NotNull(message = "Informar o código da conta.")
    private Long codigoConta;


}