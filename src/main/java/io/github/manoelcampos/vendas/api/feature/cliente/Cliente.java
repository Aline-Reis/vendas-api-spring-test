package io.github.manoelcampos.vendas.api.feature.cliente;

import io.github.manoelcampos.vendas.api.config.ConstraintKeys;
import io.github.manoelcampos.vendas.api.feature.cidade.Cidade;
import io.github.manoelcampos.vendas.api.model.AbstractBaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Cliente extends AbstractBaseModel {
    private String nome;
    @CPF
    private String cpf;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = ConstraintKeys.FK_CLIENTE_CIDADE))
    private Cidade cidade;
}
