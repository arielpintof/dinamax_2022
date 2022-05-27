package entidades;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "partida", schema = "dinamax", catalog = "dinamax_db")
public class PartidaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "tipo")
    private String tipo;
    @Basic
    @Column(name = "n_materiales")
    private int nMateriales;
    @Basic
    @Column(name = "costo")
    private BigDecimal costo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnMateriales() {
        return nMateriales;
    }

    public void setnMateriales(int nMateriales) {
        this.nMateriales = nMateriales;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartidaEntity that = (PartidaEntity) o;
        return id == that.id && nMateriales == that.nMateriales && Objects.equals(tipo, that.tipo) && Objects.equals(costo, that.costo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, nMateriales, costo);
    }
}
