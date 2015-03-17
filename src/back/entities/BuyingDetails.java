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
@Table(name = "BUYING_DETAILS")
@NamedQueries({
    @NamedQuery(name = "BuyingDetails.findAll", query = "SELECT b FROM BuyingDetails b"),
    @NamedQuery(name = "BuyingDetails.findByDetailId", query = "SELECT b FROM BuyingDetails b WHERE b.detailId = :detailId"),
    @NamedQuery(name = "BuyingDetails.findByKindName", query = "SELECT b FROM BuyingDetails b WHERE b.kindName = :kindName"),
    @NamedQuery(name = "BuyingDetails.findByBoxNumber", query = "SELECT b FROM BuyingDetails b WHERE b.boxNumber = :boxNumber"),
    @NamedQuery(name = "BuyingDetails.findByWeight", query = "SELECT b FROM BuyingDetails b WHERE b.weight = :weight"),
    @NamedQuery(name = "BuyingDetails.findByPrice", query = "SELECT b FROM BuyingDetails b WHERE b.price = :price"),
    @NamedQuery(name = "BuyingDetails.findBySaleType", query = "SELECT b FROM BuyingDetails b WHERE b.saleType = :saleType"),
    @NamedQuery(name = "BuyingDetails.findByMasrof", query = "SELECT b FROM BuyingDetails b WHERE b.masrof = :masrof"),
    @NamedQuery(name = "BuyingDetails.findByMasrofCash", query = "SELECT b FROM BuyingDetails b WHERE b.masrofCash = :masrofCash")})
public class BuyingDetails implements Serializable {
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
    @Column(name = "SALE_TYPE")
    private String saleType;
    @Column(name = "MASROF")
    private Integer masrof;
    @Column(name = "MASROF_CASH")
    private Integer masrofCash;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "BUYING_ID", referencedColumnName = "BUYING_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BuyingGoods buyingId;

    public BuyingDetails() {
    }

    public BuyingDetails(Integer detailId) {
        this.detailId = detailId;
    }

    public BuyingDetails(Integer detailId, String kindName) {
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

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
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

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public BuyingGoods getBuyingId() {
        return buyingId;
    }

    public void setBuyingId(BuyingGoods buyingId) {
        this.buyingId = buyingId;
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
        if (!(object instanceof BuyingDetails)) {
            return false;
        }
        BuyingDetails other = (BuyingDetails) object;
        if ((this.detailId == null && other.detailId != null) || (this.detailId != null && !this.detailId.equals(other.detailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.BuyingDetails[ detailId=" + detailId + " ]";
    }
    
}
