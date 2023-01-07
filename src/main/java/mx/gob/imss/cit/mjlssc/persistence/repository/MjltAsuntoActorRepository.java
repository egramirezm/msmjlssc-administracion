package mx.gob.imss.cit.mjlssc.persistence.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
	
	List<MjltAsuntoActor> findByIndActorPrincipalAndCveAsuntoId(boolean estatus, Integer cveAsunto);

	@Modifying
	@Transactional
    @Query(value = "update "
    		+ "MjltAsuntoActor a "
    		+ "set "
    		+ "a.cveUsuarioBaja = :cveUsuario,"
    		+ "a.fecBaja = :fechaBaja "
    		+ "where "
    		+ "a.id = :idAsuntoActor")
	public int deleteActor(Integer idAsuntoActor, String cveUsuario, Date fechaBaja);

	public MjltAsuntoActor findByIndActorPrincipal(Boolean ind);

	@Modifying
	@Transactional
    @Query(value = "update "
    		+ "MjltAsuntoActor a "
    		+ "set "
    		+ "a.indActorPrincipal = :ind, "
    		+ "a.cveUsuarioModifica = :cveUsuarioMod "
    		+ "where "
    		+ "a.id = :cveAsuntoActor "
    		+ "and "
    		+ "a.cveAsunto.id = :idAsunto ")
	public int updatePrincipal(Integer cveAsuntoActor, Integer idAsunto, Boolean ind, String cveUsuarioMod);


	
}