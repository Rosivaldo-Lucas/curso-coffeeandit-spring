package br.com.rosivaldolucas.coffeeandit.transactionbff.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class TransacaoDto {

    private UUID uuid;

}
