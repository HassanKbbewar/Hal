/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "GOODS_KIND")
@NamedQueries({
    @NamedQuery(name = "GoodsKind.findAll", query = "SELECT g FROM GoodsKind g"),
    @NamedQuery(name = "GoodsKind.findByKindId", query = "SELECT g FROM GoodsKind g WHERE g.kindId = :kindId"),
    @NamedQuery(name = "GoodsKind.findByKindName", query = "SELECT g FROM GoodsKind g WHERE g.kindName = :kindName"),
    @NamedQuery(name = "GoodsKind.findByKindMasrofByKilo", query = "SELECT g FROM GoodsKind g WHERE g.kindMasrofByKilo = :kindMasrofByKilo"),
    @NamedQuery(name = "GoodsKind.findByKindMasrofByPiece", query = "SELECT g FROM GoodsKind g WHERE g.kindMasrofByPiece = :kindMasrofByPiece"),
    @NamedQuery(name = "GoodsKind.findByKindCommissionByKind", query = "SELECT g FROM GoodsKind g WHERE g.kindCommissionByKind = :kindCommissionByKind"),
    @NamedQuery(name = "GoodsKind.findByKindCommissionByPiecce", query = "SELECT g FROM GoodsKind g WHERE g.kindCommissionByPiecce = :kindCommissionByPiecce"),
    @NamedQuery(name = "GoodsKind.findByKindCommissionByKilo", query = "SELECT g FROM GoodsKind g WHERE g.kindCommissionByKilo = :kindCommissionByKilo"),
    @NamedQuery(name = "GoodsKind.findByKindTamwenValue", query = "SELECT g FROM GoodsKind g WHERE g.kindTamwenValue = :kindTamwenValue"),
    @NamedQuery(name = "GoodsKind.findByKindLowestValue", query = "SELECT g FROM GoodsKind g WHERE g.kindLowestValue = :kindLowestValue"),
    @NamedQuery(name = "GoodsKind.findByKindHeighstValue", query = "SELECT g FROM GoodsKind g WHERE g.kindHeighstValue = :kindHeighstValue"),
    @NamedQuery(name = "GoodsKind.findByKindTabrizValue", query = "SELECT g FROM GoodsKind g WHERE g.kindTabrizValue = :kindTabrizValue")})
public class GoodsKind implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KIND_ID")
    private Integer kindId;
    @Column(name = "KIND_NAME")
    private String kindName;
    @Column(name = "KIND_MASROF_BY_KILO")
    private Integer kindMasrofByKilo;
    @Column(name = "KIND_MASROF_BY_PIECE")
    private Integer kindMasrofByPiece;
    @Column(name = "KIND_COMMISSION_BY_KIND")
    private Integer kindCommissionByKind;
    @Column(name = "KIND_COMMISSION_BY_PIECCE")
    private Integer kindCommissionByPiecce;
    @Column(name = "KIND_COMMISSION_BY_KILO")
    private Integer kindCommissionByKilo;
    @Column(name = "KIND_TAMWEN_VALUE")
    private Integer kindTamwenValue;
    @Column(name = "KIND_LOWEST_VALUE")
    private Integer kindLowestValue;
    @Column(name = "KIND_HEIGHST_VALUE")
    private Integer kindHeighstValue;
    @Column(name = "KIND_TABRIZ_VALUE")
    private Integer kindTabrizValue;

    public GoodsKind() {
    }

    public GoodsKind(Integer kindId) {
        this.kindId = kindId;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public Integer getKindMasrofByKilo() {
        return kindMasrofByKilo;
    }

    public void setKindMasrofByKilo(Integer kindMasrofByKilo) {
        this.kindMasrofByKilo = kindMasrofByKilo;
    }

    public Integer getKindMasrofByPiece() {
        return kindMasrofByPiece;
    }

    public void setKindMasrofByPiece(Integer kindMasrofByPiece) {
        this.kindMasrofByPiece = kindMasrofByPiece;
    }

    public Integer getKindCommissionByKind() {
        return kindCommissionByKind;
    }

    public void setKindCommissionByKind(Integer kindCommissionByKind) {
        this.kindCommissionByKind = kindCommissionByKind;
    }

    public Integer getKindCommissionByPiecce() {
        return kindCommissionByPiecce;
    }

    public void setKindCommissionByPiecce(Integer kindCommissionByPiecce) {
        this.kindCommissionByPiecce = kindCommissionByPiecce;
    }

    public Integer getKindCommissionByKilo() {
        return kindCommissionByKilo;
    }

    public void setKindCommissionByKilo(Integer kindCommissionByKilo) {
        this.kindCommissionByKilo = kindCommissionByKilo;
    }

    public Integer getKindTamwenValue() {
        return kindTamwenValue;
    }

    public void setKindTamwenValue(Integer kindTamwenValue) {
        this.kindTamwenValue = kindTamwenValue;
    }

    public Integer getKindLowestValue() {
        return kindLowestValue;
    }

    public void setKindLowestValue(Integer kindLowestValue) {
        this.kindLowestValue = kindLowestValue;
    }

    public Integer getKindHeighstValue() {
        return kindHeighstValue;
    }

    public void setKindHeighstValue(Integer kindHeighstValue) {
        this.kindHeighstValue = kindHeighstValue;
    }

    public Integer getKindTabrizValue() {
        return kindTabrizValue;
    }

    public void setKindTabrizValue(Integer kindTabrizValue) {
        this.kindTabrizValue = kindTabrizValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kindId != null ? kindId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GoodsKind)) {
            return false;
        }
        GoodsKind other = (GoodsKind) object;
        if ((this.kindId == null && other.kindId != null) || (this.kindId != null && !this.kindId.equals(other.kindId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.GoodsKind[ kindId=" + kindId + " ]";
    }
    
}
