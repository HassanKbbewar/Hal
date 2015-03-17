/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "DEBIT_COLLECT")
@NamedQueries({
    @NamedQuery(name = "DebitCollect.findAll", query = "SELECT d FROM DebitCollect d"),
    @NamedQuery(name = "DebitCollect.findByDebitCollectId", query = "SELECT d FROM DebitCollect d WHERE d.debitCollectId = :debitCollectId"),
    @NamedQuery(name = "DebitCollect.findByDebitValue", query = "SELECT d FROM DebitCollect d WHERE d.debitValue = :debitValue"),
    @NamedQuery(name = "DebitCollect.findByDebitDate", query = "SELECT d FROM DebitCollect d WHERE d.debitDate = :debitDate"),
    @NamedQuery(name = "DebitCollect.findByDebitNote", query = "SELECT d FROM DebitCollect d WHERE d.debitNote = :debitNote")})
public class DebitCollect implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEBIT_COLLECT_ID")
    private Integer debitCollectId;
    @Column(name = "DEBIT_VALUE")
    private Integer debitValue;
    @Column(name = "DEBIT_DATE")
    @Temporal(TemporalType.DATE)
    private Date debitDate;
    @Column(name = "DEBIT_NOTE")
    private String debitNote;
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "BUYERS_CUSTOMERS_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BuyersCustomers clientId;
    @JoinColumn(name = "COMMISSION_SALES_ID", referencedColumnName = "COMMISSION_SALES_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CommissionSales commissionSalesId;

    public DebitCollect() {
    }

    public DebitCollect(Integer debitCollectId) {
        this.debitCollectId = debitCollectId;
    }

    public Integer getDebitCollectId() {
        return debitCollectId;
    }

    public void setDebitCollectId(Integer debitCollectId) {
        this.debitCollectId = debitCollectId;
    }

    public Integer getDebitValue() {
        return debitValue;
    }

    public void setDebitValue(Integer debitValue) {
        this.debitValue = debitValue;
    }

    public Date getDebitDate() {
        return debitDate;
    }

    public void setDebitDate(Date debitDate) {
        this.debitDate = debitDate;
    }

    public String getDebitNote() {
        return debitNote;
    }

    public void setDebitNote(String debitNote) {
        this.debitNote = debitNote;
    }

    public BuyersCustomers getClientId() {
        return clientId;
    }

    public void setClientId(BuyersCustomers clientId) {
        this.clientId = clientId;
    }

    public CommissionSales getCommissionSalesId() {
        return commissionSalesId;
    }

    public void setCommissionSalesId(CommissionSales commissionSalesId) {
        this.commissionSalesId = commissionSalesId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (debitCollectId != null ? debitCollectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DebitCollect)) {
            return false;
        }
        DebitCollect other = (DebitCollect) object;
        if ((this.debitCollectId == null && other.debitCollectId != null) || (this.debitCollectId != null && !this.debitCollectId.equals(other.debitCollectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.DebitCollect[ debitCollectId=" + debitCollectId + " ]";
    }
    
}
