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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "CUSTOMERS")
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findByCustomerId", query = "SELECT c FROM Customers c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customers.findByCustomerResponseble", query = "SELECT c FROM Customers c WHERE c.customerResponseble = :customerResponseble"),
    @NamedQuery(name = "Customers.findByCustomerCity", query = "SELECT c FROM Customers c WHERE c.customerCity = :customerCity"),
    @NamedQuery(name = "Customers.findByCustomerAdress", query = "SELECT c FROM Customers c WHERE c.customerAdress = :customerAdress"),
    @NamedQuery(name = "Customers.findByCustomerPhonenumber", query = "SELECT c FROM Customers c WHERE c.customerPhonenumber = :customerPhonenumber"),
    @NamedQuery(name = "Customers.findByCustomerPhonenumber2", query = "SELECT c FROM Customers c WHERE c.customerPhonenumber2 = :customerPhonenumber2"),
    @NamedQuery(name = "Customers.findByCustomerEmail", query = "SELECT c FROM Customers c WHERE c.customerEmail = :customerEmail"),
    @NamedQuery(name = "Customers.findByCustomerCommision", query = "SELECT c FROM Customers c WHERE c.customerCommision = :customerCommision"),
    @NamedQuery(name = "Customers.findByCustomerPiceReturn", query = "SELECT c FROM Customers c WHERE c.customerPiceReturn = :customerPiceReturn"),
    @NamedQuery(name = "Customers.findByCustomerSpecialCommisionReturn", query = "SELECT c FROM Customers c WHERE c.customerSpecialCommisionReturn = :customerSpecialCommisionReturn"),
    @NamedQuery(name = "Customers.findByCustomerBillSize", query = "SELECT c FROM Customers c WHERE c.customerBillSize = :customerBillSize"),
    @NamedQuery(name = "Customers.findByCustomerMashalType", query = "SELECT c FROM Customers c WHERE c.customerMashalType = :customerMashalType"),
    @NamedQuery(name = "Customers.findByCustomerMashalPrice", query = "SELECT c FROM Customers c WHERE c.customerMashalPrice = :customerMashalPrice"),
    @NamedQuery(name = "Customers.findByCustomerMashalTypeTo", query = "SELECT c FROM Customers c WHERE c.customerMashalTypeTo = :customerMashalTypeTo"),
    @NamedQuery(name = "Customers.findByCustomerOpeningBalance", query = "SELECT c FROM Customers c WHERE c.customerOpeningBalance = :customerOpeningBalance"),
    @NamedQuery(name = "Customers.findByCustomerCurrentBalance", query = "SELECT c FROM Customers c WHERE c.customerCurrentBalance = :customerCurrentBalance"),
    @NamedQuery(name = "Customers.findByCustomerNote", query = "SELECT c FROM Customers c WHERE c.customerNote = :customerNote")})
public class Customers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    @Column(name = "CUSTOMER_RESPONSEBLE")
    private String customerResponseble;
    @Column(name = "CUSTOMER_CITY")
    private String customerCity;
    @Column(name = "CUSTOMER_ADRESS")
    private String customerAdress;
    @Column(name = "CUSTOMER_PHONENUMBER")
    private Integer customerPhonenumber;
    @Column(name = "CUSTOMER_PHONENUMBER2")
    private Integer customerPhonenumber2;
    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;
    @Column(name = "CUSTOMER_COMMISION")
    private Integer customerCommision;
    @Column(name = "CUSTOMER_PICE_RETURN")
    private Integer customerPiceReturn;
    @Column(name = "CUSTOMER_SPECIAL_COMMISION_RETURN")
    private Integer customerSpecialCommisionReturn;
    @Column(name = "CUSTOMER_BILL_SIZE")
    private Integer customerBillSize;
    @Column(name = "CUSTOMER_MASHAL_TYPE")
    private Short customerMashalType;
    @Column(name = "CUSTOMER_MASHAL_PRICE")
    private Integer customerMashalPrice;
    @Column(name = "CUSTOMER_MASHAL_TYPE_TO")
    private Integer customerMashalTypeTo;
    @Column(name = "CUSTOMER_OPENING_BALANCE")
    private Integer customerOpeningBalance;
    @Column(name = "CUSTOMER_CURRENT_BALANCE")
    private Integer customerCurrentBalance;
    @Column(name = "CUSTOMER_NOTE")
    private String customerNote;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ACCOUNT_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Account account;
    @JoinColumn(name = "CUSTOMER_COMMISION_RETURN_TO", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account customerCommisionReturnTo;
    @JoinColumn(name = "CUSTOMER_PICE_RETURN_TO", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account customerPiceReturnTo;
    @JoinColumn(name = "CUSTOMER_SPECIAL_COMMISION_RETURN_TO", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Account customerSpecialCommisionReturnTo;

    public Customers() {
    }

    public Customers(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerResponseble() {
        return customerResponseble;
    }

    public void setCustomerResponseble(String customerResponseble) {
        this.customerResponseble = customerResponseble;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public Integer getCustomerPhonenumber() {
        return customerPhonenumber;
    }

    public void setCustomerPhonenumber(Integer customerPhonenumber) {
        this.customerPhonenumber = customerPhonenumber;
    }

    public Integer getCustomerPhonenumber2() {
        return customerPhonenumber2;
    }

    public void setCustomerPhonenumber2(Integer customerPhonenumber2) {
        this.customerPhonenumber2 = customerPhonenumber2;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Integer getCustomerCommision() {
        return customerCommision;
    }

    public void setCustomerCommision(Integer customerCommision) {
        this.customerCommision = customerCommision;
    }

    public Integer getCustomerPiceReturn() {
        return customerPiceReturn;
    }

    public void setCustomerPiceReturn(Integer customerPiceReturn) {
        this.customerPiceReturn = customerPiceReturn;
    }

    public Integer getCustomerSpecialCommisionReturn() {
        return customerSpecialCommisionReturn;
    }

    public void setCustomerSpecialCommisionReturn(Integer customerSpecialCommisionReturn) {
        this.customerSpecialCommisionReturn = customerSpecialCommisionReturn;
    }

    public Integer getCustomerBillSize() {
        return customerBillSize;
    }

    public void setCustomerBillSize(Integer customerBillSize) {
        this.customerBillSize = customerBillSize;
    }

    public Short getCustomerMashalType() {
        return customerMashalType;
    }

    public void setCustomerMashalType(Short customerMashalType) {
        this.customerMashalType = customerMashalType;
    }

    public Integer getCustomerMashalPrice() {
        return customerMashalPrice;
    }

    public void setCustomerMashalPrice(Integer customerMashalPrice) {
        this.customerMashalPrice = customerMashalPrice;
    }

    public Integer getCustomerMashalTypeTo() {
        return customerMashalTypeTo;
    }

    public void setCustomerMashalTypeTo(Integer customerMashalTypeTo) {
        this.customerMashalTypeTo = customerMashalTypeTo;
    }

    public Integer getCustomerOpeningBalance() {
        return customerOpeningBalance;
    }

    public void setCustomerOpeningBalance(Integer customerOpeningBalance) {
        this.customerOpeningBalance = customerOpeningBalance;
    }

    public Integer getCustomerCurrentBalance() {
        return customerCurrentBalance;
    }

    public void setCustomerCurrentBalance(Integer customerCurrentBalance) {
        this.customerCurrentBalance = customerCurrentBalance;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getCustomerCommisionReturnTo() {
        return customerCommisionReturnTo;
    }

    public void setCustomerCommisionReturnTo(Account customerCommisionReturnTo) {
        this.customerCommisionReturnTo = customerCommisionReturnTo;
    }

    public Account getCustomerPiceReturnTo() {
        return customerPiceReturnTo;
    }

    public void setCustomerPiceReturnTo(Account customerPiceReturnTo) {
        this.customerPiceReturnTo = customerPiceReturnTo;
    }

    public Account getCustomerSpecialCommisionReturnTo() {
        return customerSpecialCommisionReturnTo;
    }

    public void setCustomerSpecialCommisionReturnTo(Account customerSpecialCommisionReturnTo) {
        this.customerSpecialCommisionReturnTo = customerSpecialCommisionReturnTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.Customers[ customerId=" + customerId + " ]";
    }
    
}
