package orange.test.exchange.controller;

import lombok.RequiredArgsConstructor;
import orange.test.exchange.mapper.CursValutarMapper;
import orange.test.exchange.model.domain.CursValutar;
import orange.test.exchange.model.dto.CursValutarDTO;
import orange.test.exchange.model.dto.NewCursValutarDTO;
import orange.test.exchange.service.CursValutarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@CrossOrigin("*")
@RestController("/curs")
@RequiredArgsConstructor
public class CursValutarController {

    private final CursValutarMapper cursValutarMapper;
    private final CursValutarService cursValutarService;


    @PostMapping
    public Mono<ResponseEntity<Void>> create(@RequestBody final NewCursValutarDTO curs) {
        CursValutar cursValutar = cursValutarMapper.toEntity(curs);
        return cursValutarService.create(cursValutar, curs.getCodValuta()).map(c -> ResponseEntity.ok().build());
    }

    @GetMapping("{codValuta}")
    public Mono<CursValutarDTO> getAll(@PathVariable String codValuta) {
        return cursValutarService.getByValuta(codValuta.toUpperCase()).map(cursValutarMapper::toDto);
    }

}
