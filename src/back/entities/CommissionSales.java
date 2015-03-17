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
@Table(name = "COMMISSION_SALES")
@NamedQueries({
    @NamedQuery(name = "CommissionSales.findAll", query = "SELECT c FROM CommissionSales c"),
    @NamedQuery(name = "CommissionSales.findByCommissionSalesId", query = "SELECT c FROM CommissionSales c WHERE c.commissionSalesId = :commissionSalesId"),
    @NamedQuery(name = "CommissionSales.findByCommissionSalesDate", query = "SELECT c FROM CommissionSales c WHERE c.commissionSalesDate = :commissionSalesDate"),
    @NamedQuery(name = "CommissionSales.findByTarhelStatus", query = "SELECT c FROM CommissionSales c WHERE c.tarhelStatus = :tarhelStatus")})
public class CommissionSales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMMISSION_SALES_ID")
    private Integer commissionSalesId;
    @Basic(optional = false)
    @Column(name = "COMMISSION_SALES_DATE")
    @Temporal(TemporalType.DATE)
    private Date commissionSalesDate;
    @Column(name = "TARHEL_STATUS")
    private Boolean tarhelStatus;
    @JoinColumn(name = "DAILY_ID", referencedColumnName = "DAILY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Daily dailyId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commissionSalesId", fetch = FetchType.LAZY)
    private List<DebitCollect> debitCollectList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commissionSalesId", fetch = FetchType.LAZY)
    private List<CommissionSalesDetails> commissionSalesDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commissionSalesId", fetch = FetchType.LAZY)
    private List<Invoices> invoicesList;

    public CommissionSales() {
    }

    public CommissionSales(Integer commissionSalesId) {
        this.commissionSalesId = commissionSalesId;
    }

    public CommissionSales(Integer commissionSalesId, Date commissionSalesDate) {
        this.commissionSalesId = commissionSalesId;
        this.commissionSalesDate = commissionSalesDate;
    }

    public Integer getCommissionSalesId() {
        return commissionSalesId;
    }

    public void setCommissionSalesId(Integer commissionSalesId) {
        this.commissionSalesId = commissionSalesId;
    }

    public Date getCommissionSalesDate() {
        return commissionSalesDate;
    }

    public void setCommissionSalesDate(Date commissionSalesDate) {
        this.commissionSalesDate = commissionSalesDate;
    }

    public Boolean getTarhelStatus() {
        return tarhelStatus;
    }

    public void setTarhelStatus(Boolean tarhelStatus) {
        this.tarhelStatus = tarhelStatus;
    }

    public Daily getDailyId() {
        return dailyId;
    }

    public void setDailyId(Daily dailyId) {
        this.dailyId = dailyId;
    }

    public List<DebitCollect> getDebitCollectList() {
        return debitCollectList;
    }

    public void setDebitCollectList(List<DebitCollect> debitCollectList) {
        this.debitCollectList = debitCollectList;
    }

    public List<CommissionSalesDetails> getCommissionSalesDetailsList() {
        return commissionSalesDetailsList;
    }

    public void setCommissionSalesDetailsList(List<CommissionSalesDetails> commissionSalesDetailsList) {
        this.commissionSalesDetailsList = commissionSalesDetailsList;
    }

    public List<Invoices> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(List<Invoices> invoicesList) {
        this.invoicesList = invoicesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commissionSalesId != null ? commissionSalesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommissionSales)) {
            return false;
        }
        CommissionSales other = (CommissionSales) object;
        if ((this.commissionSalesId == null && other.commissionSalesId != null) || (this.commissionSalesId != null && !this.commissionSalesId.equals(other.commissionSalesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.CommissionSales[ commissionSalesId=" + commissionSalesId + " ]";
    }
    
}
