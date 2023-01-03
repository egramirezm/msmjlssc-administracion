/**
 * 
 */
package mx.gob.imss.cit.mjlssc.service;

import java.util.List;

import mx.gob.imss.cit.mjlssc.model.entity.SsccUmfDto;

/**
 * @author
 *
 */
public interface UmfService {

	/**
	 * @return
	 */
	List<SsccUmfDto> getSUmfList();
	/**
	 * @param desUmf
	 * @return
	 */
	public List<SsccUmfDto> findByDesUmfconContainingIgnoreCase(String desUmf);

}
