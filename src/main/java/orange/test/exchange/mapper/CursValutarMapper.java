package orange.test.exchange.mapper;

import lombok.RequiredArgsConstructor;
import orange.test.exchange.model.domain.CursValutar;
import orange.test.exchange.model.domain.Valuta;
import orange.test.exchange.model.dto.CursValutarDTO;
import orange.test.exchange.model.dto.NewCursValutarDTO;
import orange.test.exchange.repository.CursValutarRepository;
import orange.test.exchange.repository.ValutaRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class CursValutarMapper {

    private final ValutaRepository valutaRepository;
    private final CursValutarRepository cursValutarRepository;


    public CursValutar toEntity(NewCursValutarDTO cursValutarDTO) {
        CursValutar cursValutar = new CursValutar();
        cursValutar.setCurs(cursValutarDTO.getCurs());
        cursValutar.setRata(cursValutarDTO.getRata());

        return cursValutar;
    }

    public CursValutarDTO toDto(CursValutar cursValutar) {
        return CursValutarDTO.builder()
                .curs(cursValutar.getCurs())
                .rata(cursValutar.getRata())
                .codValuta(cursValutar.getValuta().getCod())
                .data(cursValutar.getData())
                .build();
    }
}
