package mx.gob.imss.cit.mjlssc.persistence.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoActor;

@Repository
public interface MjltAsuntoActorRepository extends JpaRepository<MjltAsuntoActor, Integer> {


	/**
     * Elimina todos los actores por idAsunto
     *
     * @param nombreArrendatario
     * @param pageable
     * @return
     */
	@Modifying
	@Transactional
    @Query(value = "delete from MjltAsuntoActor asuntoAct " +
            "where " +
                  "asuntoAct.cveAsunto.id = ?1 ")
	 public void deleteAllActoresByIdAsunto(Integer idAsunto);
}