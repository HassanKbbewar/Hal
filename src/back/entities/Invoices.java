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
@Table(name = "INVOICES")
@NamedQueries({
    @NamedQuery(name = "Invoices.findAll", query = "SELECT i FROM Invoices i"),
    @NamedQuery(name = "Invoices.findByInvoiceId", query = "SELECT i FROM Invoices i WHERE i.invoiceId = :invoiceId"),
    @NamedQuery(name = "Invoices.findByWholePeiceCount", query = "SELECT i FROM Invoices i WHERE i.wholePeiceCount = :wholePeiceCount"),
    @NamedQuery(name = "Invoices.findBySaledPeiceCount", query = "SELECT i FROM Invoices i WHERE i.saledPeiceCount = :saledPeiceCount"),
    @NamedQuery(name = "Invoices.findByCommissionPercentage", query = "SELECT i FROM Invoices i WHERE i.commissionPercentage = :commissionPercentage"),
    @NamedQuery(name = "Invoices.findByPaidInHand", query = "SELECT i FROM Invoices i WHERE i.paidInHand = :paidInHand"),
    @NamedQuery(name = "Invoices.findByCarTransit", query = "SELECT i FROM Invoices i WHERE i.carTransit = :carTransit"),
    @NamedQuery(name = "Invoices.findByTabrizPercentage", query = "SELECT i FROM Invoices i WHERE i.tabrizPercentage = :tabrizPercentage"),
    @NamedQuery(name = "Invoices.findByOtherPaid", query = "SELECT i FROM Invoices i WHERE i.otherPaid = :otherPaid"),
    @NamedQuery(name = "Invoices.findByNote", query = "SELECT i FROM Invoices i WHERE i.note = :note"),
    @NamedQuery(name = "Invoices.findByInterchangePersonStatus", query = "SELECT i FROM Invoices i WHERE i.interchangePersonStatus = :interchangePersonStatus"),
    @NamedQuery(name = "Invoices.findByInterchangePercentage", query = "SELECT i FROM Invoices i WHERE i.interchangePercentage = :interchangePercentage"),
    @NamedQuery(name = "Invoices.findByCommession", query = "SELECT i FROM Invoices i WHERE i.commession = :commession"),
    @NamedQuery(name = "Invoices.findByTabriz", query = "SELECT i FROM Invoices i WHERE i.tabriz = :tabriz"),
    @NamedQuery(name = "Invoices.findByInvoiceValue", query = "SELECT i FROM Invoices i WHERE i.invoiceValue = :invoiceValue"),
    @NamedQuery(name = "Invoices.findByInvoiceFinalValue", query = "SELECT i FROM Invoices i WHERE i.invoiceFinalValue = :invoiceFinalValue"),
    @NamedQuery(name = "Invoices.findByInvoiceCashStatus", query = "SELECT i FROM Invoices i WHERE i.invoiceCashStatus = :invoiceCashStatus"),
    @NamedQuery(name = "Invoices.findByInvoicePrintStatus", query = "SELECT i FROM Invoices i WHERE i.invoicePrintStatus = :invoicePrintStatus"),
    @NamedQuery(name = "Invoices.findByInvoicePrintDate", query = "SELECT i FROM Invoices i WHERE i.invoicePrintDate = :invoicePrintDate")})
public class Invoices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_ID")
    private Integer invoiceId;
    @Column(name = "WHOLE_PEICE_COUNT")
    private Integer wholePeiceCount;
    @Column(name = "SALED_PEICE_COUNT")
    private Integer saledPeiceCount;
    @Column(name = "COMMISSION_PERCENTAGE")
    private Short commissionPercentage;
    @Column(name = "PAID_IN_HAND")
    private Integer paidInHand;
    @Column(name = "CAR_TRANSIT")
    private Integer carTransit;
    @Column(name = "TABRIZ_PERCENTAGE")
    private Integer tabrizPercentage;
    @Column(name = "OTHER_PAID")
    private Integer otherPaid;
    @Column(name = "NOTE")
    private String note;
    @Column(name = "INTERCHANGE_PERSON_STATUS")
    private Boolean interchangePersonStatus;
    @Column(name = "INTERCHANGE_PERCENTAGE")
    private Short interchangePercentage;
    @Column(name = "COMMESSION")
    private Integer commession;
    @Column(name = "TABRIZ")
    private Integer tabriz;
    @Column(name = "INVOICE_VALUE")
    private Integer invoiceValue;
    @Column(name = "INVOICE_FINAL_VALUE")
    private Integer invoiceFinalValue;
    @Column(name = "INVOICE_CASH_STATUS")
    private Boolean invoiceCashStatus;
    @Column(name = "INVOICE_PRINT_STATUS")
    private Boolean invoicePrintStatus;
    @Column(name = "INVOICE_PRINT_DATE")
    @Temporal(TemporalType.DATE)
    private Date invoicePrintDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceId", fetch = FetchType.LAZY)
    private List<InvoiceDetails> invoiceDetailsList;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "INTERCHANGE_ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account interchangeAccountId;
    @JoinColumn(name = "PRIVATE_COMMISSION_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account privateCommissionId;
    @JoinColumn(name = "PRIVATE_MASHAL_ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account privateMashalAccountId;
    @JoinColumn(name = "COMMISSION_SALES_ID", referencedColumnName = "COMMISSION_SALES_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CommissionSales commissionSalesId;
    @JoinColumn(name = "MERGE_ID", referencedColumnName = "MERGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MergedInvoices mergeId;

    public Invoices() {
    }

    public Invoices(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getWholePeiceCount() {
        return wholePeiceCount;
    }

    public void setWholePeiceCount(Integer wholePeiceCount) {
        this.wholePeiceCount = wholePeiceCount;
    }

    public Integer getSaledPeiceCount() {
        return saledPeiceCount;
    }

    public void setSaledPeiceCount(Integer saledPeiceCount) {
        this.saledPeiceCount = saledPeiceCount;
    }

    public Short getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(Short commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public Integer getPaidInHand() {
        return paidInHand;
    }

    public void setPaidInHand(Integer paidInHand) {
        this.paidInHand = paidInHand;
    }

    public Integer getCarTransit() {
        return carTransit;
    }

    public void setCarTransit(Integer carTransit) {
        this.carTransit = carTransit;
    }

    public Integer getTabrizPercentage() {
        return tabrizPercentage;
    }

    public void setTabrizPercentage(Integer tabrizPercentage) {
        this.tabrizPercentage = tabrizPercentage;
    }

    public Integer getOtherPaid() {
        return otherPaid;
    }

    public void setOtherPaid(Integer otherPaid) {
        this.otherPaid = otherPaid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getInterchangePersonStatus() {
        return interchangePersonStatus;
    }

    public void setInterchangePersonStatus(Boolean interchangePersonStatus) {
        this.interchangePersonStatus = interchangePersonStatus;
    }

    public Short getInterchangePercentage() {
        return interchangePercentage;
    }

    public void setInterchangePercentage(Short interchangePercentage) {
        this.interchangePercentage = interchangePercentage;
    }

    public Integer getCommession() {
        return commession;
    }

    public void setCommession(Integer commession) {
        this.commession = commession;
    }

    public Integer getTabriz() {
        return tabriz;
    }

    public void setTabriz(Integer tabriz) {
        this.tabriz = tabriz;
    }

    public Integer getInvoiceValue() {
        return invoiceValue;
    }

    public void setInvoiceValue(Integer invoiceValue) {
        this.invoiceValue = invoiceValue;
    }

    public Integer getInvoiceFinalValue() {
        return invoiceFinalValue;
    }

    public void setInvoiceFinalValue(Integer invoiceFinalValue) {
        this.invoiceFinalValue = invoiceFinalValue;
    }

    public Boolean getInvoiceCashStatus() {
        return invoiceCashStatus;
    }

    public void setInvoiceCashStatus(Boolean invoiceCashStatus) {
        this.invoiceCashStatus = invoiceCashStatus;
    }

    public Boolean getInvoicePrintStatus() {
        return invoicePrintStatus;
    }

    public void setInvoicePrintStatus(Boolean invoicePrintStatus) {
        this.invoicePrintStatus = invoicePrintStatus;
    }

    public Date getInvoicePrintDate() {
        return invoicePrintDate;
    }

    public void setInvoicePrintDate(Date invoicePrintDate) {
        this.invoicePrintDate = invoicePrintDate;
    }

    public List<InvoiceDetails> getInvoiceDetailsList() {
        return invoiceDetailsList;
    }

    public void setInvoiceDetailsList(List<InvoiceDetails> invoiceDetailsList) {
        this.invoiceDetailsList = invoiceDetailsList;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Account getInterchangeAccountId() {
        return interchangeAccountId;
    }

    public void setInterchangeAccountId(Account interchangeAccountId) {
        this.interchangeAccountId = interchangeAccountId;
    }

    public Account getPrivateCommissionId() {
        return privateCommissionId;
    }

    public void setPrivateCommissionId(Account privateCommissionId) {
        this.privateCommissionId = privateCommissionId;
    }

    public Account getPrivateMashalAccountId() {
        return privateMashalAccountId;
    }

    public void setPrivateMashalAccountId(Account privateMashalAccountId) {
        this.privateMashalAccountId = privateMashalAccountId;
    }

    public CommissionSales getCommissionSalesId() {
        return commissionSalesId;
    }

    public void setCommissionSalesId(CommissionSales commissionSalesId) {
        this.commissionSalesId = commissionSalesId;
    }

    public MergedInvoices getMergeId() {
        return mergeId;
    }

    public void setMergeId(MergedInvoices mergeId) {
        this.mergeId = mergeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceId != null ? invoiceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.invoiceId == null && other.invoiceId != null) || (this.invoiceId != null && !this.invoiceId.equals(other.invoiceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.Invoices[ invoiceId=" + invoiceId + " ]";
    }
    
}
