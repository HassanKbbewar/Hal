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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Hassa_000
 */
@Entity
@Table(name = "USER_INFORMATION")
@NamedQueries({
    @NamedQuery(name = "UserInformation.findAll", query = "SELECT u FROM UserInformation u"),
    @NamedQuery(name = "UserInformation.findByUserDetails1", query = "SELECT u FROM UserInformation u WHERE u.userDetails1 = :userDetails1"),
    @NamedQuery(name = "UserInformation.findByUserDetails2", query = "SELECT u FROM UserInformation u WHERE u.userDetails2 = :userDetails2"),
    @NamedQuery(name = "UserInformation.findByUserDetails3", query = "SELECT u FROM UserInformation u WHERE u.userDetails3 = :userDetails3"),
    @NamedQuery(name = "UserInformation.findByUserDetails4", query = "SELECT u FROM UserInformation u WHERE u.userDetails4 = :userDetails4"),
    @NamedQuery(name = "UserInformation.findByUserPhoneNumber1", query = "SELECT u FROM UserInformation u WHERE u.userPhoneNumber1 = :userPhoneNumber1"),
    @NamedQuery(name = "UserInformation.findByUserPhoneNumber2", query = "SELECT u FROM UserInformation u WHERE u.userPhoneNumber2 = :userPhoneNumber2"),
    @NamedQuery(name = "UserInformation.findByUserPhoneNumber3", query = "SELECT u FROM UserInformation u WHERE u.userPhoneNumber3 = :userPhoneNumber3"),
    @NamedQuery(name = "UserInformation.findByUserDefaultCommsion", query = "SELECT u FROM UserInformation u WHERE u.userDefaultCommsion = :userDefaultCommsion"),
    @NamedQuery(name = "UserInformation.findByUserPercentageCount", query = "SELECT u FROM UserInformation u WHERE u.userPercentageCount = :userPercentageCount"),
    @NamedQuery(name = "UserInformation.findByUserDefaultMasrof", query = "SELECT u FROM UserInformation u WHERE u.userDefaultMasrof = :userDefaultMasrof"),
    @NamedQuery(name = "UserInformation.findByUserMasrofPercentage", query = "SELECT u FROM UserInformation u WHERE u.userMasrofPercentage = :userMasrofPercentage"),
    @NamedQuery(name = "UserInformation.findByUserTabrizPercentage", query = "SELECT u FROM UserInformation u WHERE u.userTabrizPercentage = :userTabrizPercentage"),
    @NamedQuery(name = "UserInformation.findByUserTabrizDailyPay", query = "SELECT u FROM UserInformation u WHERE u.userTabrizDailyPay = :userTabrizDailyPay"),
    @NamedQuery(name = "UserInformation.findByUserTabrizDefaultValue", query = "SELECT u FROM UserInformation u WHERE u.userTabrizDefaultValue = :userTabrizDefaultValue"),
    @NamedQuery(name = "UserInformation.findByUserCommissionCountToFivePound", query = "SELECT u FROM UserInformation u WHERE u.userCommissionCountToFivePound = :userCommissionCountToFivePound"),
    @NamedQuery(name = "UserInformation.findByUserInvoiceSize", query = "SELECT u FROM UserInformation u WHERE u.userInvoiceSize = :userInvoiceSize"),
    @NamedQuery(name = "UserInformation.findByCashierUserName1", query = "SELECT u FROM UserInformation u WHERE u.cashierUserName1 = :cashierUserName1"),
    @NamedQuery(name = "UserInformation.findByCashierUserName2", query = "SELECT u FROM UserInformation u WHERE u.cashierUserName2 = :cashierUserName2"),
    @NamedQuery(name = "UserInformation.findByCashierUserName3", query = "SELECT u FROM UserInformation u WHERE u.cashierUserName3 = :cashierUserName3"),
    @NamedQuery(name = "UserInformation.findByAddSubjectsStatus", query = "SELECT u FROM UserInformation u WHERE u.addSubjectsStatus = :addSubjectsStatus"),
    @NamedQuery(name = "UserInformation.findByUserDefaultPaidInvoice", query = "SELECT u FROM UserInformation u WHERE u.userDefaultPaidInvoice = :userDefaultPaidInvoice"),
    @NamedQuery(name = "UserInformation.findByUserCountWatching", query = "SELECT u FROM UserInformation u WHERE u.userCountWatching = :userCountWatching")})
public class UserInformation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_DETAILS1")
    private String userDetails1;
    @Column(name = "USER_DETAILS2")
    private String userDetails2;
    @Column(name = "USER_DETAILS3")
    private String userDetails3;
    @Column(name = "USER_DETAILS4")
    private String userDetails4;
    @Column(name = "USER_PHONE_NUMBER1")
    private String userPhoneNumber1;
    @Column(name = "USER_PHONE_NUMBER2")
    private String userPhoneNumber2;
    @Column(name = "USER_PHONE_NUMBER3")
    private String userPhoneNumber3;
    @Column(name = "USER_DEFAULT_COMMSION")
    private Short userDefaultCommsion;
    @Column(name = "USER_PERCENTAGE_COUNT")
    private Short userPercentageCount;
    @Column(name = "USER_DEFAULT_MASROF")
    private Short userDefaultMasrof;
    @Column(name = "USER_MASROF_PERCENTAGE")
    private Short userMasrofPercentage;
    @Column(name = "USER_TABRIZ_PERCENTAGE")
    private Short userTabrizPercentage;
    @Column(name = "USER_TABRIZ_DAILY_PAY")
    private Boolean userTabrizDailyPay;
    @Column(name = "USER_TABRIZ_DEFAULT_VALUE")
    private Short userTabrizDefaultValue;
    @Column(name = "USER_COMMISSION_COUNT_TO_FIVE_POUND")
    private Boolean userCommissionCountToFivePound;
    @Column(name = "USER_INVOICE_SIZE")
    private Short userInvoiceSize;
    @Column(name = "CASHIER_USER_NAME1")
    private String cashierUserName1;
    @Column(name = "CASHIER_USER_NAME2")
    private String cashierUserName2;
    @Column(name = "CASHIER_USER_NAME3")
    private String cashierUserName3;
    @Column(name = "ADD_SUBJECTS_STATUS")
    private Boolean addSubjectsStatus;
    @Column(name = "USER_DEFAULT_PAID_INVOICE")
    private Boolean userDefaultPaidInvoice;
    @Column(name = "USER_COUNT_WATCHING")
    private Boolean userCountWatching;

    public UserInformation() {
    }

    public UserInformation(String userDetails1) {
        this.userDetails1 = userDetails1;
    }

    public String getUserDetails1() {
        return userDetails1;
    }

    public void setUserDetails1(String userDetails1) {
        this.userDetails1 = userDetails1;
    }

    public String getUserDetails2() {
        return userDetails2;
    }

    public void setUserDetails2(String userDetails2) {
        this.userDetails2 = userDetails2;
    }

    public String getUserDetails3() {
        return userDetails3;
    }

    public void setUserDetails3(String userDetails3) {
        this.userDetails3 = userDetails3;
    }

    public String getUserDetails4() {
        return userDetails4;
    }

    public void setUserDetails4(String userDetails4) {
        this.userDetails4 = userDetails4;
    }

    public String getUserPhoneNumber1() {
        return userPhoneNumber1;
    }

    public void setUserPhoneNumber1(String userPhoneNumber1) {
        this.userPhoneNumber1 = userPhoneNumber1;
    }

    public String getUserPhoneNumber2() {
        return userPhoneNumber2;
    }

    public void setUserPhoneNumber2(String userPhoneNumber2) {
        this.userPhoneNumber2 = userPhoneNumber2;
    }

    public String getUserPhoneNumber3() {
        return userPhoneNumber3;
    }

    public void setUserPhoneNumber3(String userPhoneNumber3) {
        this.userPhoneNumber3 = userPhoneNumber3;
    }

    public Short getUserDefaultCommsion() {
        return userDefaultCommsion;
    }

    public void setUserDefaultCommsion(Short userDefaultCommsion) {
        this.userDefaultCommsion = userDefaultCommsion;
    }

    public Short getUserPercentageCount() {
        return userPercentageCount;
    }

    public void setUserPercentageCount(Short userPercentageCount) {
        this.userPercentageCount = userPercentageCount;
    }

    public Short getUserDefaultMasrof() {
        return userDefaultMasrof;
    }

    public void setUserDefaultMasrof(Short userDefaultMasrof) {
        this.userDefaultMasrof = userDefaultMasrof;
    }

    public Short getUserMasrofPercentage() {
        return userMasrofPercentage;
    }

    public void setUserMasrofPercentage(Short userMasrofPercentage) {
        this.userMasrofPercentage = userMasrofPercentage;
    }

    public Short getUserTabrizPercentage() {
        return userTabrizPercentage;
    }

    public void setUserTabrizPercentage(Short userTabrizPercentage) {
        this.userTabrizPercentage = userTabrizPercentage;
    }

    public Boolean getUserTabrizDailyPay() {
        return userTabrizDailyPay;
    }

    public void setUserTabrizDailyPay(Boolean userTabrizDailyPay) {
        this.userTabrizDailyPay = userTabrizDailyPay;
    }

    public Short getUserTabrizDefaultValue() {
        return userTabrizDefaultValue;
    }

    public void setUserTabrizDefaultValue(Short userTabrizDefaultValue) {
        this.userTabrizDefaultValue = userTabrizDefaultValue;
    }

    public Boolean getUserCommissionCountToFivePound() {
        return userCommissionCountToFivePound;
    }

    public void setUserCommissionCountToFivePound(Boolean userCommissionCountToFivePound) {
        this.userCommissionCountToFivePound = userCommissionCountToFivePound;
    }

    public Short getUserInvoiceSize() {
        return userInvoiceSize;
    }

    public void setUserInvoiceSize(Short userInvoiceSize) {
        this.userInvoiceSize = userInvoiceSize;
    }

    public String getCashierUserName1() {
        return cashierUserName1;
    }

    public void setCashierUserName1(String cashierUserName1) {
        this.cashierUserName1 = cashierUserName1;
    }

    public String getCashierUserName2() {
        return cashierUserName2;
    }

    public void setCashierUserName2(String cashierUserName2) {
        this.cashierUserName2 = cashierUserName2;
    }

    public String getCashierUserName3() {
        return cashierUserName3;
    }

    public void setCashierUserName3(String cashierUserName3) {
        this.cashierUserName3 = cashierUserName3;
    }

    public Boolean getAddSubjectsStatus() {
        return addSubjectsStatus;
    }

    public void setAddSubjectsStatus(Boolean addSubjectsStatus) {
        this.addSubjectsStatus = addSubjectsStatus;
    }

    public Boolean getUserDefaultPaidInvoice() {
        return userDefaultPaidInvoice;
    }

    public void setUserDefaultPaidInvoice(Boolean userDefaultPaidInvoice) {
        this.userDefaultPaidInvoice = userDefaultPaidInvoice;
    }

    public Boolean getUserCountWatching() {
        return userCountWatching;
    }

    public void setUserCountWatching(Boolean userCountWatching) {
        this.userCountWatching = userCountWatching;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userDetails1 != null ? userDetails1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserInformation)) {
            return false;
        }
        UserInformation other = (UserInformation) object;
        if ((this.userDetails1 == null && other.userDetails1 != null) || (this.userDetails1 != null && !this.userDetails1.equals(other.userDetails1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.UserInformation[ userDetails1=" + userDetails1 + " ]";
    }
    
}
