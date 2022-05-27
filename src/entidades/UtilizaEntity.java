package entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "utiliza", schema = "dinamax", catalog = "dinamax_db")
public class UtilizaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "obra_id")
    private int obraId;
    @Basic
    @Column(name = "material_id")
    private int materialId;
    @Basic
    @Column(name = "cantidad")
    private int cantidad;

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

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtilizaEntity that = (UtilizaEntity) o;
        return id == that.id && obraId == that.obraId && materialId == that.materialId && cantidad == that.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, obraId, materialId, cantidad);
    }
}
