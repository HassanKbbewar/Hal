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
@Table(name = "COMMISSION_SALES_DETAILS")
@NamedQueries({
    @NamedQuery(name = "CommissionSalesDetails.findAll", query = "SELECT c FROM CommissionSalesDetails c"),
    @NamedQuery(name = "CommissionSalesDetails.findBySalesDetailId", query = "SELECT c FROM CommissionSalesDetails c WHERE c.salesDetailId = :salesDetailId"),
    @NamedQuery(name = "CommissionSalesDetails.findByPeiceCount", query = "SELECT c FROM CommissionSalesDetails c WHERE c.peiceCount = :peiceCount"),
    @NamedQuery(name = "CommissionSalesDetails.findByKindName", query = "SELECT c FROM CommissionSalesDetails c WHERE c.kindName = :kindName"),
    @NamedQuery(name = "CommissionSalesDetails.findByBoxNumber", query = "SELECT c FROM CommissionSalesDetails c WHERE c.boxNumber = :boxNumber"),
    @NamedQuery(name = "CommissionSalesDetails.findByWeight", query = "SELECT c FROM CommissionSalesDetails c WHERE c.weight = :weight"),
    @NamedQuery(name = "CommissionSalesDetails.findByPrice", query = "SELECT c FROM CommissionSalesDetails c WHERE c.price = :price"),
    @NamedQuery(name = "CommissionSalesDetails.findBySaleType", query = "SELECT c FROM CommissionSalesDetails c WHERE c.saleType = :saleType"),
    @NamedQuery(name = "CommissionSalesDetails.findByDebitSale", query = "SELECT c FROM CommissionSalesDetails c WHERE c.debitSale = :debitSale"),
    @NamedQuery(name = "CommissionSalesDetails.findByMasrof", query = "SELECT c FROM CommissionSalesDetails c WHERE c.masrof = :masrof"),
    @NamedQuery(name = "CommissionSalesDetails.findByCasheirName", query = "SELECT c FROM CommissionSalesDetails c WHERE c.casheirName = :casheirName"),
    @NamedQuery(name = "CommissionSalesDetails.findByMasrofByKilo", query = "SELECT c FROM CommissionSalesDetails c WHERE c.masrofByKilo = :masrofByKilo"),
    @NamedQuery(name = "CommissionSalesDetails.findByMasrofByBox", query = "SELECT c FROM CommissionSalesDetails c WHERE c.masrofByBox = :masrofByBox")})
public class CommissionSalesDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SALES_DETAIL_ID")
    private Integer salesDetailId;
    @Column(name = "PEICE_COUNT")
    private Integer peiceCount;
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
    @Column(name = "DEBIT_SALE")
    private Boolean debitSale;
    @Column(name = "MASROF")
    private Integer masrof;
    @Column(name = "CASHEIR_NAME")
    private String casheirName;
    @Column(name = "MASROF_BY_KILO")
    private Integer masrofByKilo;
    @Column(name = "MASROF_BY_BOX")
    private Integer masrofByBox;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "BUYERS_CUSTOMERS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private BuyersCustomers clientId;
    @JoinColumn(name = "COMMISSION_SALES_ID", referencedColumnName = "COMMISSION_SALES_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CommissionSales commissionSalesId;

    public CommissionSalesDetails() {
    }

    public CommissionSalesDetails(Integer salesDetailId) {
        this.salesDetailId = salesDetailId;
    }

    public CommissionSalesDetails(Integer salesDetailId, String kindName) {
        this.salesDetailId = salesDetailId;
        this.kindName = kindName;
    }

    public Integer getSalesDetailId() {
        return salesDetailId;
    }

    public void setSalesDetailId(Integer salesDetailId) {
        this.salesDetailId = salesDetailId;
    }

    public Integer getPeiceCount() {
        return peiceCount;
    }

    public void setPeiceCount(Integer peiceCount) {
        this.peiceCount = peiceCount;
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

    public Boolean getDebitSale() {
        return debitSale;
    }

    public void setDebitSale(Boolean debitSale) {
        this.debitSale = debitSale;
    }

    public Integer getMasrof() {
        return masrof;
    }

    public void setMasrof(Integer masrof) {
        this.masrof = masrof;
    }

    public String getCasheirName() {
        return casheirName;
    }

    public void setCasheirName(String casheirName) {
        this.casheirName = casheirName;
    }

    public Integer getMasrofByKilo() {
        return masrofByKilo;
    }

    public void setMasrofByKilo(Integer masrofByKilo) {
        this.masrofByKilo = masrofByKilo;
    }

    public Integer getMasrofByBox() {
        return masrofByBox;
    }

    public void setMasrofByBox(Integer masrofByBox) {
        this.masrofByBox = masrofByBox;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
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
        hash += (salesDetailId != null ? salesDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommissionSalesDetails)) {
            return false;
        }
        CommissionSalesDetails other = (CommissionSalesDetails) object;
        if ((this.salesDetailId == null && other.salesDetailId != null) || (this.salesDetailId != null && !this.salesDetailId.equals(other.salesDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.CommissionSalesDetails[ salesDetailId=" + salesDetailId + " ]";
    }
    
}
