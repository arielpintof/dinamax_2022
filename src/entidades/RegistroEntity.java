package entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "registro", schema = "dinamax", catalog = "dinamax_db")
public class RegistroEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "obra_id")
    private int obraId;
    @Basic
    @Column(name = "ingreso_egreso")
    private int ingresoEgreso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObraId() {
        return obraId;
    }

    public void setObraId(int obraId) {
        this.obraId = obraId;
    }

    public int getIngresoEgreso() {
        return ingresoEgreso;
    }

    public void setIngresoEgreso(int ingresoEgreso) {
        this.ingresoEgreso = ingresoEgreso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroEntity that = (RegistroEntity) o;
        return id == that.id && obraId == that.obraId && ingresoEgreso == that.ingresoEgreso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, obraId, ingresoEgreso);
    }
}
