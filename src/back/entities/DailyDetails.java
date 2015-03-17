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
@Table(name = "DAILY_DETAILS")
@NamedQueries({
    @NamedQuery(name = "DailyDetails.findAll", query = "SELECT d FROM DailyDetails d"),
    @NamedQuery(name = "DailyDetails.findByDailyDetailId", query = "SELECT d FROM DailyDetails d WHERE d.dailyDetailId = :dailyDetailId"),
    @NamedQuery(name = "DailyDetails.findByDailyDebit", query = "SELECT d FROM DailyDetails d WHERE d.dailyDebit = :dailyDebit"),
    @NamedQuery(name = "DailyDetails.findByDailyCredit", query = "SELECT d FROM DailyDetails d WHERE d.dailyCredit = :dailyCredit"),
    @NamedQuery(name = "DailyDetails.findByDailyDetails", query = "SELECT d FROM DailyDetails d WHERE d.dailyDetails = :dailyDetails")})
public class DailyDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DAILY_DETAIL_ID")
    private Integer dailyDetailId;
    @Column(name = "DAILY_DEBIT")
    private Integer dailyDebit;
    @Column(name = "DAILY_CREDIT")
    private Integer dailyCredit;
    @Column(name = "DAILY_DETAILS")
    private String dailyDetails;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "DAILY_ID", referencedColumnName = "DAILY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Daily dailyId;

    public DailyDetails() {
    }

    public DailyDetails(Integer dailyDetailId) {
        this.dailyDetailId = dailyDetailId;
    }

    public Integer getDailyDetailId() {
        return dailyDetailId;
    }

    public void setDailyDetailId(Integer dailyDetailId) {
        this.dailyDetailId = dailyDetailId;
    }

    public Integer getDailyDebit() {
        return dailyDebit;
    }

    public void setDailyDebit(Integer dailyDebit) {
        this.dailyDebit = dailyDebit;
    }

    public Integer getDailyCredit() {
        return dailyCredit;
    }

    public void setDailyCredit(Integer dailyCredit) {
        this.dailyCredit = dailyCredit;
    }

    public String getDailyDetails() {
        return dailyDetails;
    }

    public void setDailyDetails(String dailyDetails) {
        this.dailyDetails = dailyDetails;
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
        hash += (dailyDetailId != null ? dailyDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DailyDetails)) {
            return false;
        }
        DailyDetails other = (DailyDetails) object;
        if ((this.dailyDetailId == null && other.dailyDetailId != null) || (this.dailyDetailId != null && !this.dailyDetailId.equals(other.dailyDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.DailyDetails[ dailyDetailId=" + dailyDetailId + " ]";
    }
    
}
