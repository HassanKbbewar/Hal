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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "CARGO_DETAILS")
@NamedQueries({
    @NamedQuery(name = "CargoDetails.findAll", query = "SELECT c FROM CargoDetails c"),
    @NamedQuery(name = "CargoDetails.findByDetailId", query = "SELECT c FROM CargoDetails c WHERE c.detailId = :detailId"),
    @NamedQuery(name = "CargoDetails.findByKindName", query = "SELECT c FROM CargoDetails c WHERE c.kindName = :kindName"),
    @NamedQuery(name = "CargoDetails.findByBoxNumber", query = "SELECT c FROM CargoDetails c WHERE c.boxNumber = :boxNumber"),
    @NamedQuery(name = "CargoDetails.findByWeight", query = "SELECT c FROM CargoDetails c WHERE c.weight = :weight"),
    @NamedQuery(name = "CargoDetails.findByPrice", query = "SELECT c FROM CargoDetails c WHERE c.price = :price"),
    @NamedQuery(name = "CargoDetails.findByMasrof", query = "SELECT c FROM CargoDetails c WHERE c.masrof = :masrof"),
    @NamedQuery(name = "CargoDetails.findByMasrofCash", query = "SELECT c FROM CargoDetails c WHERE c.masrofCash = :masrofCash"),
    @NamedQuery(name = "CargoDetails.findBySaleType", query = "SELECT c FROM CargoDetails c WHERE c.saleType = :saleType")})
public class CargoDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DETAIL_ID")
    private Integer detailId;
    @Basic(optional = false)
    @Column(name = "KIND_NAME")
    private String kindName;
    @Column(name = "BOX_NUMBER")
    private Integer boxNumber;
    @Column(name = "WEIGHT")
    private Integer weight;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "MASROF")
    private Integer masrof;
    @Column(name = "MASROF_CASH")
    private Integer masrofCash;
    @Column(name = "SALE_TYPE")
    private String saleType;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "CARGO_ID", referencedColumnName = "CARGO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cargo cargoId;

    public CargoDetails() {
    }

    public CargoDetails(Integer detailId) {
        this.detailId = detailId;
    }

    public CargoDetails(Integer detailId, String kindName) {
        this.detailId = detailId;
        this.kindName = kindName;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMasrof() {
        return masrof;
    }

    public void setMasrof(Integer masrof) {
        this.masrof = masrof;
    }

    public Integer getMasrofCash() {
        return masrofCash;
    }

    public void setMasrofCash(Integer masrofCash) {
        this.masrofCash = masrofCash;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Cargo getCargoId() {
        return cargoId;
    }

    public void setCargoId(Cargo cargoId) {
        this.cargoId = cargoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detailId != null ? detailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargoDetails)) {
            return false;
        }
        CargoDetails other = (CargoDetails) object;
        if ((this.detailId == null && other.detailId != null) || (this.detailId != null && !this.detailId.equals(other.detailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.CargoDetails[ detailId=" + detailId + " ]";
    }
    
}
