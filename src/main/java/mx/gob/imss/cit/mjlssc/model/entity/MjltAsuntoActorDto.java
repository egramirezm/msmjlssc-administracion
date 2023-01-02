package mx.gob.imss.cit.mjlssc.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.mjlssc.persistence.entity.MjltAsuntoActor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A DTO for the {@link MjltAsuntoActor} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MjltAsuntoActorDto implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4588858515387702055L;
	private Integer id;
    @NotNull
    private MjltAsuntoDto cveAsunto;
    @Size(max = 200)
    private String refNombre;
    @Size(max = 200)
    private String refPaterno;
    @Size(max = 200)
    private String refMaterno;
    @Size(max = 20)
    private String refMatricula;
    @Size(max = 20)
    private String refNss;
    @Size(max = 20)
    private String refCurp;
    @Size(max = 20)
    private String refRfc;
    @NotNull
    private SsccSexoDto cveSexo;
    private BigDecimal canSalarioBase;
    @NotNull
    private SsccUmfDto cveUmf;
    private Boolean indActorPrincipal;
    private Boolean indFinado;
    private Boolean indConsumoInterfases;
    private Boolean indConvenio;
    private String refConvenioMotivonoacuerdo;
    private Date fecConvenio;
    private Date fecRatificacionConv;
    private Date fecSancionConv;
    private Date fecCumplimientoConv;
    private String refComentarioConv;
    private Boolean indDesistimiento;
    private Date fecDesistimiento;
    private Date fecRatificacionDes;
    private String refComentarioDes;
    @Size(max = 200)
    private String refWseClaveDepto;
    @Size(max = 200)
    private String refWseDesDepto;
    @Size(max = 200)
    private String refWseClavePuesto;
    @Size(max = 200)
    private String refWseDesPuesto;
    @Size(max = 200)
    private String refWseClaveArea;
    @Size(max = 200)
    private String refWseDesArea;
    @Size(max = 200)
    private String refWseCuantiaBasica;
    @Size(max = 200)
    private String refWseEstatus;
    @Size(max = 200)
    private String refWseTc;
    @Size(max = 200)
    private String refWseDesTc;
    @Size(max = 200)
    private String refWseTipoEmpleado;
    @Size(max = 200)
    private String refWseDelegacion;
    @Size(max = 200)
    private String refWseDesDelegacion;
    @Size(max = 200)
    private String refWseLocalidad;
    @Size(max = 200)
    private String refWseDesLocalidad;
    @Size(max = 200)
    private String refWseQuincenaMes;
    @Size(max = 200)
    private String refWseFechaJubPen;
    @Size(max = 200)
    private String refWseTipoJubilacion;
    @Size(max = 200)
    private String refWsePorcentajePension;
    @Size(max = 200)
    private String refWseFechaIngreso;
    @Size(max = 200)
    private String refWseFechaBaja;
    @Size(max = 200)
    private String refWseAntAnios;
    @Size(max = 200)
    private String refWseAntQnas;
    @Size(max = 200)
    private String refWseAntDias;
    @Size(max = 200)
    private String refWseClaveBaja;
    @Size(max = 200)
    private String refWseDesBaja;
    @Size(max = 200)
    private String refWseFechaModificacion;
    @Size(max = 200)
    private String refWseFmodorden;
    @Size(max = 10)
    private String refSdaIdSexo;
    @Size(max = 10)
    private String refSdaMesNacimiento;
    @Size(max = 10)
    private String refSdaCveEntidadNacimiento;
    @Size(max = 100)
    private String refSdaDscSexo;
    @Size(max = 100)
    private String refSdaDscNacimiento;
    @Size(max = 300)
    private String refSdaDscEntidadNacimiento;
    @Size(max = 20)
    private String refSdaCveTipoPension;
    @Size(max = 20)
    private String refWspCveDelegacion;
    @Size(max = 20)
    private String refWspCveSubDelegacion;
    @Size(max = 400)
    private String refWspDesDelegacion;
    @Size(max = 400)
    private String refWspDesSubDelegacion;
    @NotNull
    private Date fecAlta;
    private Date fecBaja;
    private Date fecModifica;
    @Size(max = 60)
    @NotNull
    private String cveUsuarioAlta;
    @Size(max = 60)
    private String cveUsuarioBaja;
    @Size(max = 60)
    private String cveUsuarioModifica;
}