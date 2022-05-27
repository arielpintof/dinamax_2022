package entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "beneficiario", schema = "dinamax", catalog = "dinamax_db")
public class BeneficiarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rut")
    private String rut;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "apellido_p")
    private String apellidoP;
    @Basic
    @Column(name = "apellido_m")
    private String apellidoM;
    @Basic
    @Column(name = "calle")
    private String calle;
    @Basic
    @Column(name = "n_casa")
    private Integer nCasa;
    @Basic
    @Column(name = "comuna_id")
    private int comunaId;
    @Basic
    @Column(name = "proyecto_id")
    private int proyectoId;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getnCasa() {
        return nCasa;
    }

    public void setnCasa(Integer nCasa) {
        this.nCasa = nCasa;
    }

    public int getComunaId() {
        return comunaId;
    }

    public void setComunaId(int comunaId) {
        this.comunaId = comunaId;
    }

    public int getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(int proyectoId) {
        this.proyectoId = proyectoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeneficiarioEntity that = (BeneficiarioEntity) o;
        return comunaId == that.comunaId && proyectoId == that.proyectoId && Objects.equals(rut, that.rut) && Objects.equals(nombre, that.nombre) && Objects.equals(apellidoP, that.apellidoP) && Objects.equals(apellidoM, that.apellidoM) && Objects.equals(calle, that.calle) && Objects.equals(nCasa, that.nCasa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rut, nombre, apellidoP, apellidoM, calle, nCasa, comunaId, proyectoId);
    }
}
