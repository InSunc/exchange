package orange.test.exchange.repository;

import orange.test.exchange.model.domain.CursValutar;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface CursValutarRepository extends ReactiveCrudRepository<CursValutar, Long> {
    Mono<CursValutar> findByValutaIdAndData(int valutaId, LocalDate data);
}
