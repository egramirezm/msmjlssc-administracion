package mx.gob.imss.cit.mjlssc.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.imss.cit.mjlssc.persistence.entity.SsccUmf;

@Repository
public interface SsccUmfRepository extends JpaRepository<SsccUmf, Integer> {

     public List<SsccUmf> findByDesUmfContainingIgnoreCase(String desUmf);
}
