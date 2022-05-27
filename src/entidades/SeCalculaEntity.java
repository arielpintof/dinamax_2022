package entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "se_calcula", schema = "dinamax", catalog = "dinamax_db")
@IdClass(SeCalculaEntityPK.class)
public class SeCalculaEntity {
    @Basic
    @Column(name = "id")
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "partida_id")
    private int partidaId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "proyecto_id")
    private int proyectoId;
    @Basic
    @Column(name = "cantidad")
    private int cantidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }

    public int getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(int proyectoId) {
        this.proyectoId = proyectoId;
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
        SeCalculaEntity that = (SeCalculaEntity) o;
        return id == that.id && partidaId == that.partidaId && proyectoId == that.proyectoId && cantidad == that.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, partidaId, proyectoId, cantidad);
    }
}
