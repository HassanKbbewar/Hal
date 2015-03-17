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
@Table(name = "CASH_DAILY")
@NamedQueries({
    @NamedQuery(name = "CashDaily.findAll", query = "SELECT c FROM CashDaily c"),
    @NamedQuery(name = "CashDaily.findByCashDailyId", query = "SELECT c FROM CashDaily c WHERE c.cashDailyId = :cashDailyId"),
    @NamedQuery(name = "CashDaily.findByCashDailyDate", query = "SELECT c FROM CashDaily c WHERE c.cashDailyDate = :cashDailyDate"),
    @NamedQuery(name = "CashDaily.findByCashDailyTarhelStatus", query = "SELECT c FROM CashDaily c WHERE c.cashDailyTarhelStatus = :cashDailyTarhelStatus")})
public class CashDaily implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CASH_DAILY_ID")
    private Integer cashDailyId;
    @Column(name = "CASH_DAILY_DATE")
    @Temporal(TemporalType.DATE)
    private Date cashDailyDate;
    @Column(name = "CASH_DAILY_TARHEL_STATUS")
    private Boolean cashDailyTarhelStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cashDailyId", fetch = FetchType.LAZY)
    private List<CashDailySub> cashDailySubList;
    @JoinColumn(name = "DAILY_ID", referencedColumnName = "DAILY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Daily dailyId;

    public CashDaily() {
    }

    public CashDaily(Integer cashDailyId) {
        this.cashDailyId = cashDailyId;
    }

    public Integer getCashDailyId() {
        return cashDailyId;
    }

    public void setCashDailyId(Integer cashDailyId) {
        this.cashDailyId = cashDailyId;
    }

    public Date getCashDailyDate() {
        return cashDailyDate;
    }

    public void setCashDailyDate(Date cashDailyDate) {
        this.cashDailyDate = cashDailyDate;
    }

    public Boolean getCashDailyTarhelStatus() {
        return cashDailyTarhelStatus;
    }

    public void setCashDailyTarhelStatus(Boolean cashDailyTarhelStatus) {
        this.cashDailyTarhelStatus = cashDailyTarhelStatus;
    }

    public List<CashDailySub> getCashDailySubList() {
        return cashDailySubList;
    }

    public void setCashDailySubList(List<CashDailySub> cashDailySubList) {
        this.cashDailySubList = cashDailySubList;
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
        hash += (cashDailyId != null ? cashDailyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CashDaily)) {
            return false;
        }
        CashDaily other = (CashDaily) object;
        if ((this.cashDailyId == null && other.cashDailyId != null) || (this.cashDailyId != null && !this.cashDailyId.equals(other.cashDailyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.CashDaily[ cashDailyId=" + cashDailyId + " ]";
    }
    
}
