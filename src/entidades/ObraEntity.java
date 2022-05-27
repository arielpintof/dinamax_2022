package entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "obra", schema = "dinamax", catalog = "dinamax_db")
public class ObraEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "dia_inicio")
    private int diaInicio;
    @Basic
    @Column(name = "mes_inicio")
    private int mesInicio;
    @Basic
    @Column(name = "año_inicio")
    private int añoInicio;
    @Basic
    @Column(name = "dia_termino")
    private int diaTermino;
    @Basic
    @Column(name = "mes_termino")
    private int mesTermino;
    @Basic
    @Column(name = "año_termino")
    private int añoTermino;
    @Basic
    @Column(name = "estado_id")
    private int estadoId;
    @Basic
    @Column(name = "proyecto_id")
    private int proyectoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }

    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    public int getDiaTermino() {
        return diaTermino;
    }

    public void setDiaTermino(int diaTermino) {
        this.diaTermino = diaTermino;
    }

    public int getMesTermino() {
        return mesTermino;
    }

    public void setMesTermino(int mesTermino) {
        this.mesTermino = mesTermino;
    }

    public int getAñoTermino() {
        return añoTermino;
    }

    public void setAñoTermino(int añoTermino) {
        this.añoTermino = añoTermino;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
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
        ObraEntity that = (ObraEntity) o;
        return id == that.id && diaInicio == that.diaInicio && mesInicio == that.mesInicio && añoInicio == that.añoInicio && diaTermino == that.diaTermino && mesTermino == that.mesTermino && añoTermino == that.añoTermino && estadoId == that.estadoId && proyectoId == that.proyectoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diaInicio, mesInicio, añoInicio, diaTermino, mesTermino, añoTermino, estadoId, proyectoId);
    }
}
