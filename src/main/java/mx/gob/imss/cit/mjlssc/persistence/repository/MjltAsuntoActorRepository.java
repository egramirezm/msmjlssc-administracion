package mx.gob.imss.cit.mjlssc.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsunto;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoActor;

@Repository
public interface MjltAsuntoActorRepository extends JpaRepository<MjltAsuntoActor, Integer> {

	List<MjltAsuntoActor> findByIndActorPrincipal(Boolean indActorPrincipal);

}