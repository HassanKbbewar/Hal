/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.entities;

import java.io.Serializable;
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

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "BUYERS_CUSTOMERS")
@NamedQueries({
    @NamedQuery(name = "BuyersCustomers.findAll", query = "SELECT b FROM BuyersCustomers b"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersId", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersId = :buyersCustomersId"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersName", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersName = :buyersCustomersName"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersResponsebleName", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersResponsebleName = :buyersCustomersResponsebleName"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersPhone1", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersPhone1 = :buyersCustomersPhone1"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersPhone2", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersPhone2 = :buyersCustomersPhone2"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersFax", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersFax = :buyersCustomersFax"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersEmail", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersEmail = :buyersCustomersEmail"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersLimit", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersLimit = :buyersCustomersLimit"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersCity", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersCity = :buyersCustomersCity"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersAddress", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersAddress = :buyersCustomersAddress"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersNote", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersNote = :buyersCustomersNote"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersType", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersType = :buyersCustomersType"),
    @NamedQuery(name = "BuyersCustomers.findByBuyersCustomersFreezStatus", query = "SELECT b FROM BuyersCustomers b WHERE b.buyersCustomersFreezStatus = :buyersCustomersFreezStatus")})
public class BuyersCustomers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BUYERS_CUSTOMERS_ID")
    private Integer buyersCustomersId;
    @Column(name = "BUYERS_CUSTOMERS_NAME")
    private String buyersCustomersName;
    @Column(name = "BUYERS_CUSTOMERS_RESPONSEBLE_NAME")
    private String buyersCustomersResponsebleName;
    @Column(name = "BUYERS_CUSTOMERS_PHONE1")
    private String buyersCustomersPhone1;
    @Column(name = "BUYERS_CUSTOMERS_PHONE2")
    private String buyersCustomersPhone2;
    @Column(name = "BUYERS_CUSTOMERS_FAX")
    private String buyersCustomersFax;
    @Column(name = "BUYERS_CUSTOMERS_EMAIL")
    private String buyersCustomersEmail;
    @Column(name = "BUYERS_CUSTOMERS_LIMIT")
    private Integer buyersCustomersLimit;
    @Column(name = "BUYERS_CUSTOMERS_CITY")
    private String buyersCustomersCity;
    @Column(name = "BUYERS_CUSTOMERS_ADDRESS")
    private String buyersCustomersAddress;
    @Column(name = "BUYERS_CUSTOMERS_NOTE")
    private String buyersCustomersNote;
    @Column(name = "BUYERS_CUSTOMERS_TYPE")
    private String buyersCustomersType;
    @Column(name = "BUYERS_CUSTOMERS_FREEZ_STATUS")
    private Boolean buyersCustomersFreezStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientId", fetch = FetchType.LAZY)
    private List<DebitCollect> debitCollectList;
    @OneToMany(mappedBy = "clientId", fetch = FetchType.LAZY)
    private List<CommissionSalesDetails> commissionSalesDetailsList;

    public BuyersCustomers() {
    }

    public BuyersCustomers(Integer buyersCustomersId) {
        this.buyersCustomersId = buyersCustomersId;
    }

    public Integer getBuyersCustomersId() {
        return buyersCustomersId;
    }

    public void setBuyersCustomersId(Integer buyersCustomersId) {
        this.buyersCustomersId = buyersCustomersId;
    }

    public String getBuyersCustomersName() {
        return buyersCustomersName;
    }

    public void setBuyersCustomersName(String buyersCustomersName) {
        this.buyersCustomersName = buyersCustomersName;
    }

    public String getBuyersCustomersResponsebleName() {
        return buyersCustomersResponsebleName;
    }

    public void setBuyersCustomersResponsebleName(String buyersCustomersResponsebleName) {
        this.buyersCustomersResponsebleName = buyersCustomersResponsebleName;
    }

    public String getBuyersCustomersPhone1() {
        return buyersCustomersPhone1;
    }

    public void setBuyersCustomersPhone1(String buyersCustomersPhone1) {
        this.buyersCustomersPhone1 = buyersCustomersPhone1;
    }

    public String getBuyersCustomersPhone2() {
        return buyersCustomersPhone2;
    }

    public void setBuyersCustomersPhone2(String buyersCustomersPhone2) {
        this.buyersCustomersPhone2 = buyersCustomersPhone2;
    }

    public String getBuyersCustomersFax() {
        return buyersCustomersFax;
    }

    public void setBuyersCustomersFax(String buyersCustomersFax) {
        this.buyersCustomersFax = buyersCustomersFax;
    }

    public String getBuyersCustomersEmail() {
        return buyersCustomersEmail;
    }

    public void setBuyersCustomersEmail(String buyersCustomersEmail) {
        this.buyersCustomersEmail = buyersCustomersEmail;
    }

    public Integer getBuyersCustomersLimit() {
        return buyersCustomersLimit;
    }

    public void setBuyersCustomersLimit(Integer buyersCustomersLimit) {
        this.buyersCustomersLimit = buyersCustomersLimit;
    }

    public String getBuyersCustomersCity() {
        return buyersCustomersCity;
    }

    public void setBuyersCustomersCity(String buyersCustomersCity) {
        this.buyersCustomersCity = buyersCustomersCity;
    }

    public String getBuyersCustomersAddress() {
        return buyersCustomersAddress;
    }

    public void setBuyersCustomersAddress(String buyersCustomersAddress) {
        this.buyersCustomersAddress = buyersCustomersAddress;
    }

    public String getBuyersCustomersNote() {
        return buyersCustomersNote;
    }

    public void setBuyersCustomersNote(String buyersCustomersNote) {
        this.buyersCustomersNote = buyersCustomersNote;
    }

    public String getBuyersCustomersType() {
        return buyersCustomersType;
    }

    public void setBuyersCustomersType(String buyersCustomersType) {
        this.buyersCustomersType = buyersCustomersType;
    }

    public Boolean getBuyersCustomersFreezStatus() {
        return buyersCustomersFreezStatus;
    }

    public void setBuyersCustomersFreezStatus(Boolean buyersCustomersFreezStatus) {
        this.buyersCustomersFreezStatus = buyersCustomersFreezStatus;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buyersCustomersId != null ? buyersCustomersId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuyersCustomers)) {
            return false;
        }
        BuyersCustomers other = (BuyersCustomers) object;
        if ((this.buyersCustomersId == null && other.buyersCustomersId != null) || (this.buyersCustomersId != null && !this.buyersCustomersId.equals(other.buyersCustomersId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.BuyersCustomers[ buyersCustomersId=" + buyersCustomersId + " ]";
    }
    
}
