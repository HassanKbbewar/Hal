/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "BUYING_GOODS")
@NamedQueries({
    @NamedQuery(name = "BuyingGoods.findAll", query = "SELECT b FROM BuyingGoods b"),
    @NamedQuery(name = "BuyingGoods.findByBuyingId", query = "SELECT b FROM BuyingGoods b WHERE b.buyingId = :buyingId"),
    @NamedQuery(name = "BuyingGoods.findByBuyingDate", query = "SELECT b FROM BuyingGoods b WHERE b.buyingDate = :buyingDate"),
    @NamedQuery(name = "BuyingGoods.findByBuyingStatus", query = "SELECT b FROM BuyingGoods b WHERE b.buyingStatus = :buyingStatus")})
public class BuyingGoods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUYING_ID")
    private Integer buyingId;
    @Column(name = "BUYING_DATE")
    @Temporal(TemporalType.DATE)
    private Date buyingDate;
    @Column(name = "BUYING_STATUS")
    private Boolean buyingStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buyingId", fetch = FetchType.LAZY)
    private List<BuyingDetails> buyingDetailsList;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "DAILY_ID", referencedColumnName = "DAILY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Daily dailyId;

    public BuyingGoods() {
    }

    public BuyingGoods(Integer buyingId) {
        this.buyingId = buyingId;
    }

    public Integer getBuyingId() {
        return buyingId;
    }

    public void setBuyingId(Integer buyingId) {
        this.buyingId = buyingId;
    }

    public Date getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(Date buyingDate) {
        this.buyingDate = buyingDate;
    }

    public Boolean getBuyingStatus() {
        return buyingStatus;
    }

    public void setBuyingStatus(Boolean buyingStatus) {
        this.buyingStatus = buyingStatus;
    }

    public List<BuyingDetails> getBuyingDetailsList() {
        return buyingDetailsList;
    }

    public void setBuyingDetailsList(List<BuyingDetails> buyingDetailsList) {
        this.buyingDetailsList = buyingDetailsList;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Daily getDailyId() {
        return dailyId;
    }

    public void setDailyId(Daily dailyId) {
        this.dailyId = dailyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buyingId != null ? buyingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuyingGoods)) {
            return false;
        }
        BuyingGoods other = (BuyingGoods) object;
        if ((this.buyingId == null && other.buyingId != null) || (this.buyingId != null && !this.buyingId.equals(other.buyingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.BuyingGoods[ buyingId=" + buyingId + " ]";
    }
    
}
