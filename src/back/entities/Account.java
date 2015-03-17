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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "ACCOUNT")
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findByAccountId", query = "SELECT a FROM Account a WHERE a.accountId = :accountId"),
    @NamedQuery(name = "Account.findByAccountName", query = "SELECT a FROM Account a WHERE a.accountName = :accountName"),
    @NamedQuery(name = "Account.findByAccountReturn", query = "SELECT a FROM Account a WHERE a.accountReturn = :accountReturn"),
    @NamedQuery(name = "Account.findByAccountType", query = "SELECT a FROM Account a WHERE a.accountType = :accountType"),
    @NamedQuery(name = "Account.findByAccountPosition", query = "SELECT a FROM Account a WHERE a.accountPosition = :accountPosition"),
    @NamedQuery(name = "Account.findByDebitFlag", query = "SELECT a FROM Account a WHERE a.debitFlag = :debitFlag")})
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCOUNT_ID")
    private Integer accountId;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "ACCOUNT_RETURN")
    private Integer accountReturn;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "ACCOUNT_POSITION")
    private String accountPosition;
    @Column(name = "DEBIT_FLAG")
    private Boolean debitFlag;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<BuyingDetails> buyingDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<CargoDetails> cargoDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<DailyDetails> dailyDetailsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<CashDailySub> cashDailySubList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<Cargo> cargoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<CommissionSalesDetails> commissionSalesDetailsList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account", fetch = FetchType.LAZY)
    private Customers customers;
    @OneToMany(mappedBy = "customerCommisionReturnTo", fetch = FetchType.LAZY)
    private List<Customers> customersList;
    @OneToMany(mappedBy = "customerPiceReturnTo", fetch = FetchType.LAZY)
    private List<Customers> customersList1;
    @OneToMany(mappedBy = "customerSpecialCommisionReturnTo", fetch = FetchType.LAZY)
    private List<Customers> customersList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<BuyingGoods> buyingGoodsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountId", fetch = FetchType.LAZY)
    private List<Invoices> invoicesList;
    @OneToMany(mappedBy = "interchangeAccountId", fetch = FetchType.LAZY)
    private List<Invoices> invoicesList1;
    @OneToMany(mappedBy = "privateCommissionId", fetch = FetchType.LAZY)
    private List<Invoices> invoicesList2;
    @OneToMany(mappedBy = "privateMashalAccountId", fetch = FetchType.LAZY)
    private List<Invoices> invoicesList3;

    public Account() {
    }

    public Account(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountReturn() {
        return accountReturn;
    }

    public void setAccountReturn(Integer accountReturn) {
        this.accountReturn = accountReturn;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountPosition() {
        return accountPosition;
    }

    public void setAccountPosition(String accountPosition) {
        this.accountPosition = accountPosition;
    }

    public Boolean getDebitFlag() {
        return debitFlag;
    }

    public void setDebitFlag(Boolean debitFlag) {
        this.debitFlag = debitFlag;
    }

    public List<BuyingDetails> getBuyingDetailsList() {
        return buyingDetailsList;
    }

    public void setBuyingDetailsList(List<BuyingDetails> buyingDetailsList) {
        this.buyingDetailsList = buyingDetailsList;
    }

    public List<CargoDetails> getCargoDetailsList() {
        return cargoDetailsList;
    }

    public void setCargoDetailsList(List<CargoDetails> cargoDetailsList) {
        this.cargoDetailsList = cargoDetailsList;
    }

    public List<DailyDetails> getDailyDetailsList() {
        return dailyDetailsList;
    }

    public void setDailyDetailsList(List<DailyDetails> dailyDetailsList) {
        this.dailyDetailsList = dailyDetailsList;
    }

    public List<CashDailySub> getCashDailySubList() {
        return cashDailySubList;
    }

    public void setCashDailySubList(List<CashDailySub> cashDailySubList) {
        this.cashDailySubList = cashDailySubList;
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }

    public List<CommissionSalesDetails> getCommissionSalesDetailsList() {
        return commissionSalesDetailsList;
    }

    public void setCommissionSalesDetailsList(List<CommissionSalesDetails> commissionSalesDetailsList) {
        this.commissionSalesDetailsList = commissionSalesDetailsList;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public List<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customers> customersList) {
        this.customersList = customersList;
    }

    public List<Customers> getCustomersList1() {
        return customersList1;
    }

    public void setCustomersList1(List<Customers> customersList1) {
        this.customersList1 = customersList1;
    }

    public List<Customers> getCustomersList2() {
        return customersList2;
    }

    public void setCustomersList2(List<Customers> customersList2) {
        this.customersList2 = customersList2;
    }

    public List<BuyingGoods> getBuyingGoodsList() {
        return buyingGoodsList;
    }

    public void setBuyingGoodsList(List<BuyingGoods> buyingGoodsList) {
        this.buyingGoodsList = buyingGoodsList;
    }

    public List<Invoices> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(List<Invoices> invoicesList) {
        this.invoicesList = invoicesList;
    }

    public List<Invoices> getInvoicesList1() {
        return invoicesList1;
    }

    public void setInvoicesList1(List<Invoices> invoicesList1) {
        this.invoicesList1 = invoicesList1;
    }

    public List<Invoices> getInvoicesList2() {
        return invoicesList2;
    }

    public void setInvoicesList2(List<Invoices> invoicesList2) {
        this.invoicesList2 = invoicesList2;
    }

    public List<Invoices> getInvoicesList3() {
        return invoicesList3;
    }

    public void setInvoicesList3(List<Invoices> invoicesList3) {
        this.invoicesList3 = invoicesList3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountId != null ? accountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.accountId == null && other.accountId != null) || (this.accountId != null && !this.accountId.equals(other.accountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.Account[ accountId=" + accountId + " ]";
    }
    
}
