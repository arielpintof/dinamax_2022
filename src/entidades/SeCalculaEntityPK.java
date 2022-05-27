package entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SeCalculaEntityPK implements Serializable {
    @Column(name = "partida_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int partidaId;
    @Column(name = "proyecto_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int proyectoId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeCalculaEntityPK that = (SeCalculaEntityPK) o;
        return partidaId == that.partidaId && proyectoId == that.proyectoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(partidaId, proyectoId);
    }
}
