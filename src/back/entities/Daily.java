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
@Table(name = "DAILY")
@NamedQueries({
    @NamedQuery(name = "Daily.findAll", query = "SELECT d FROM Daily d"),
    @NamedQuery(name = "Daily.findByDailyId", query = "SELECT d FROM Daily d WHERE d.dailyId = :dailyId"),
    @NamedQuery(name = "Daily.findByDailyDate", query = "SELECT d FROM Daily d WHERE d.dailyDate = :dailyDate"),
    @NamedQuery(name = "Daily.findByDailyNote", query = "SELECT d FROM Daily d WHERE d.dailyNote = :dailyNote"),
    @NamedQuery(name = "Daily.findByDailyType", query = "SELECT d FROM Daily d WHERE d.dailyType = :dailyType"),
    @NamedQuery(name = "Daily.findByDailyInvoiceNumber", query = "SELECT d FROM Daily d WHERE d.dailyInvoiceNumber = :dailyInvoiceNumber")})
public class Daily implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DAILY_ID")
    private Integer dailyId;
    @Column(name = "DAILY_DATE")
    @Temporal(TemporalType.DATE)
    private Date dailyDate;
    @Column(name = "DAILY_NOTE")
    private String dailyNote;
    @Column(name = "DAILY_TYPE")
    private Integer dailyType;
    @Column(name = "DAILY_INVOICE_NUMBER")
    private Integer dailyInvoiceNumber;
    @OneToMany(mappedBy = "dailyId", fetch = FetchType.LAZY)
    private List<CommissionSales> commissionSalesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dailyId", fetch = FetchType.LAZY)
    private List<DailyDetails> dailyDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dailyId", fetch = FetchType.LAZY)
    private List<Cargo> cargoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dailyId", fetch = FetchType.LAZY)
    private List<CashDaily> cashDailyList;
    @OneToMany(mappedBy = "dailyId", fetch = FetchType.LAZY)
    private List<BuyingGoods> buyingGoodsList;

    public Daily() {
    }

    public Daily(Integer dailyId) {
        this.dailyId = dailyId;
    }

    public Integer getDailyId() {
        return dailyId;
    }

    public void setDailyId(Integer dailyId) {
        this.dailyId = dailyId;
    }

    public Date getDailyDate() {
        return dailyDate;
    }

    public void setDailyDate(Date dailyDate) {
        this.dailyDate = dailyDate;
    }

    public String getDailyNote() {
        return dailyNote;
    }

    public void setDailyNote(String dailyNote) {
        this.dailyNote = dailyNote;
    }

    public Integer getDailyType() {
        return dailyType;
    }

    public void setDailyType(Integer dailyType) {
        this.dailyType = dailyType;
    }

    public Integer getDailyInvoiceNumber() {
        return dailyInvoiceNumber;
    }

    public void setDailyInvoiceNumber(Integer dailyInvoiceNumber) {
        this.dailyInvoiceNumber = dailyInvoiceNumber;
    }

    public List<CommissionSales> getCommissionSalesList() {
        return commissionSalesList;
    }

    public void setCommissionSalesList(List<CommissionSales> commissionSalesList) {
        this.commissionSalesList = commissionSalesList;
    }

    public List<DailyDetails> getDailyDetailsList() {
        return dailyDetailsList;
    }

    public void setDailyDetailsList(List<DailyDetails> dailyDetailsList) {
        this.dailyDetailsList = dailyDetailsList;
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }

    public List<CashDaily> getCashDailyList() {
        return cashDailyList;
    }

    public void setCashDailyList(List<CashDaily> cashDailyList) {
        this.cashDailyList = cashDailyList;
    }

    public List<BuyingGoods> getBuyingGoodsList() {
        return buyingGoodsList;
    }

    public void setBuyingGoodsList(List<BuyingGoods> buyingGoodsList) {
        this.buyingGoodsList = buyingGoodsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dailyId != null ? dailyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Daily)) {
            return false;
        }
        Daily other = (Daily) object;
        if ((this.dailyId == null && other.dailyId != null) || (this.dailyId != null && !this.dailyId.equals(other.dailyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.Daily[ dailyId=" + dailyId + " ]";
    }
    
}
