package lk.ac.ucsc.forexservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    //automatically generate query for data selection
    ExchangeValue findByFromAndTo(String from, String to);
}
