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
@Table(name = "INVOICE_DETAILS")
@NamedQueries({
    @NamedQuery(name = "InvoiceDetails.findAll", query = "SELECT i FROM InvoiceDetails i"),
    @NamedQuery(name = "InvoiceDetails.findByInvoiceDetailsId", query = "SELECT i FROM InvoiceDetails i WHERE i.invoiceDetailsId = :invoiceDetailsId"),
    @NamedQuery(name = "InvoiceDetails.findByKind", query = "SELECT i FROM InvoiceDetails i WHERE i.kind = :kind"),
    @NamedQuery(name = "InvoiceDetails.findByBoxNumber", query = "SELECT i FROM InvoiceDetails i WHERE i.boxNumber = :boxNumber"),
    @NamedQuery(name = "InvoiceDetails.findByWeight", query = "SELECT i FROM InvoiceDetails i WHERE i.weight = :weight"),
    @NamedQuery(name = "InvoiceDetails.findByPrice", query = "SELECT i FROM InvoiceDetails i WHERE i.price = :price"),
    @NamedQuery(name = "InvoiceDetails.findBySaleType", query = "SELECT i FROM InvoiceDetails i WHERE i.saleType = :saleType")})
public class InvoiceDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVOICE_DETAILS_ID")
    private Integer invoiceDetailsId;
    @Column(name = "KIND")
    private String kind;
    @Column(name = "BOX_NUMBER")
    private Integer boxNumber;
    @Column(name = "WEIGHT")
    private Integer weight;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "SALE_TYPE")
    private String saleType;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Invoices invoiceId;

    public InvoiceDetails() {
    }

    public InvoiceDetails(Integer invoiceDetailsId) {
        this.invoiceDetailsId = invoiceDetailsId;
    }

    public Integer getInvoiceDetailsId() {
        return invoiceDetailsId;
    }

    public void setInvoiceDetailsId(Integer invoiceDetailsId) {
        this.invoiceDetailsId = invoiceDetailsId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public Invoices getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoices invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceDetailsId != null ? invoiceDetailsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceDetails)) {
            return false;
        }
        InvoiceDetails other = (InvoiceDetails) object;
        if ((this.invoiceDetailsId == null && other.invoiceDetailsId != null) || (this.invoiceDetailsId != null && !this.invoiceDetailsId.equals(other.invoiceDetailsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.InvoiceDetails[ invoiceDetailsId=" + invoiceDetailsId + " ]";
    }
    
}
