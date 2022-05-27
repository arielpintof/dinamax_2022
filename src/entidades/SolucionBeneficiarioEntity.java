package entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "solucion_beneficiario", schema = "dinamax", catalog = "dinamax_db")
public class SolucionBeneficiarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_sb")
    private int idSb;
    @Basic
    @Column(name = "run")
    private String run;
    @Basic
    @Column(name = "id_solucion")
    private int idSolucion;

    public int getIdSb() {
        return idSb;
    }

    public void setIdSb(int idSb) {
        this.idSb = idSb;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int getIdSolucion() {
        return idSolucion;
    }

    public void setIdSolucion(int idSolucion) {
        this.idSolucion = idSolucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolucionBeneficiarioEntity that = (SolucionBeneficiarioEntity) o;
        return idSb == that.idSb && idSolucion == that.idSolucion && Objects.equals(run, that.run);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSb, run, idSolucion);
    }
}
