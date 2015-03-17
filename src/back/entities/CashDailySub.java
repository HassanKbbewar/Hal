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
@Table(name = "CASH_DAILY_SUB")
@NamedQueries({
    @NamedQuery(name = "CashDailySub.findAll", query = "SELECT c FROM CashDailySub c"),
    @NamedQuery(name = "CashDailySub.findByCashSubId", query = "SELECT c FROM CashDailySub c WHERE c.cashSubId = :cashSubId"),
    @NamedQuery(name = "CashDailySub.findByBoxCredit", query = "SELECT c FROM CashDailySub c WHERE c.boxCredit = :boxCredit"),
    @NamedQuery(name = "CashDailySub.findByBoxDebit", query = "SELECT c FROM CashDailySub c WHERE c.boxDebit = :boxDebit"),
    @NamedQuery(name = "CashDailySub.findByNote", query = "SELECT c FROM CashDailySub c WHERE c.note = :note")})
public class CashDailySub implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CASH_SUB_ID")
    private Integer cashSubId;
    @Column(name = "BOX_CREDIT")
    private Integer boxCredit;
    @Column(name = "BOX_DEBIT")
    private Integer boxDebit;
    @Column(name = "NOTE")
    private String note;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "CASH_DAILY_ID", referencedColumnName = "CASH_DAILY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CashDaily cashDailyId;

    public CashDailySub() {
    }

    public CashDailySub(Integer cashSubId) {
        this.cashSubId = cashSubId;
    }

    public Integer getCashSubId() {
        return cashSubId;
    }

    public void setCashSubId(Integer cashSubId) {
        this.cashSubId = cashSubId;
    }

    public Integer getBoxCredit() {
        return boxCredit;
    }

    public void setBoxCredit(Integer boxCredit) {
        this.boxCredit = boxCredit;
    }

    public Integer getBoxDebit() {
        return boxDebit;
    }

    public void setBoxDebit(Integer boxDebit) {
        this.boxDebit = boxDebit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public CashDaily getCashDailyId() {
        return cashDailyId;
    }

    public void setCashDailyId(CashDaily cashDailyId) {
        this.cashDailyId = cashDailyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cashSubId != null ? cashSubId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CashDailySub)) {
            return false;
        }
        CashDailySub other = (CashDailySub) object;
        if ((this.cashSubId == null && other.cashSubId != null) || (this.cashSubId != null && !this.cashSubId.equals(other.cashSubId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.CashDailySub[ cashSubId=" + cashSubId + " ]";
    }
    
}
