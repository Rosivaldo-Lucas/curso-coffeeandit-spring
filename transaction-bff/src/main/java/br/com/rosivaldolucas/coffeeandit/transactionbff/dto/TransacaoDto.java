package br.com.rosivaldolucas.coffeeandit.transactionbff.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class TransacaoDto {

    @Schema(description = "Código de identificação da transação.")
    private UUID uuid;

    @Schema(description = "Valor da transação.")
    @NotNull
    private BigDecimal valor;

    @Schema(description = "Data/hora/minuto e segundo da transação.")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime data;

    @Schema(description = "Conta de origem da transação.")
    @Valid
    @NotNull
    private ContaDto conta;

    @Schema(description = "Beneficiário da transação.")
    @Valid
    @NotNull
    private BeneficiarioDto beneficiario;

    @Schema(description = "Tipo de transação.")
    @NotNull
    private TipoTransacao tipoTransacao;

    @Schema(description = "Situação da transação.")
    @NotNull
    private SituacaoTransacao situacaoTransacao;

}
