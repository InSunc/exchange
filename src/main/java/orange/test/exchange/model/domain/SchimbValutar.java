package orange.test.exchange.model.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


import java.time.LocalDate;

@Data
@Table
public class SchimbValutar {
    @Id
    Long id;

    float suma;

    Integer valutaId;
    @Transient
    Valuta valuta;
    Operator operator;

    @Column
    @CreatedDate
    LocalDate data;
}
