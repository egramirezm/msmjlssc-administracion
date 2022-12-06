package mx.gob.imss.cit.mjlssc.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.imss.cit.mjlssc.persistence.entity.SsccDelegacion;

@Repository
public interface SsccDelegacionRepository extends JpaRepository<SsccDelegacion, Integer> {

	<T> T findByRefAbreviacion(String refAbreviacion, Class<T> type);

}
