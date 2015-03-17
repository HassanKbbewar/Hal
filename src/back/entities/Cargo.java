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
@Table(name = "CARGO")
@NamedQueries({
    @NamedQuery(name = "Cargo.findAll", query = "SELECT c FROM Cargo c"),
    @NamedQuery(name = "Cargo.findByCargoId", query = "SELECT c FROM Cargo c WHERE c.cargoId = :cargoId"),
    @NamedQuery(name = "Cargo.findByCargoCommision", query = "SELECT c FROM Cargo c WHERE c.cargoCommision = :cargoCommision"),
    @NamedQuery(name = "Cargo.findByCargoPaid", query = "SELECT c FROM Cargo c WHERE c.cargoPaid = :cargoPaid"),
    @NamedQuery(name = "Cargo.findByCargoMashal", query = "SELECT c FROM Cargo c WHERE c.cargoMashal = :cargoMashal"),
    @NamedQuery(name = "Cargo.findByCargoDeposit", query = "SELECT c FROM Cargo c WHERE c.cargoDeposit = :cargoDeposit"),
    @NamedQuery(name = "Cargo.findByCargoDate", query = "SELECT c FROM Cargo c WHERE c.cargoDate = :cargoDate"),
    @NamedQuery(name = "Cargo.findByCargoStatus", query = "SELECT c FROM Cargo c WHERE c.cargoStatus = :cargoStatus"),
    @NamedQuery(name = "Cargo.findByCargoNote", query = "SELECT c FROM Cargo c WHERE c.cargoNote = :cargoNote"),
    @NamedQuery(name = "Cargo.findByCargoReturnValue", query = "SELECT c FROM Cargo c WHERE c.cargoReturnValue = :cargoReturnValue"),
    @NamedQuery(name = "Cargo.findByCargoReturnDate", query = "SELECT c FROM Cargo c WHERE c.cargoReturnDate = :cargoReturnDate")})
public class Cargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CARGO_ID")
    private Integer cargoId;
    @Column(name = "CARGO_COMMISION")
    private Integer cargoCommision;
    @Column(name = "CARGO_PAID")
    private Integer cargoPaid;
    @Column(name = "CARGO_MASHAL")
    private Integer cargoMashal;
    @Column(name = "CARGO_DEPOSIT")
    private Integer cargoDeposit;
    @Column(name = "CARGO_DATE")
    @Temporal(TemporalType.DATE)
    private Date cargoDate;
    @Column(name = "CARGO_STATUS")
    private Boolean cargoStatus;
    @Column(name = "CARGO_NOTE")
    private String cargoNote;
    @Column(name = "CARGO_RETURN_VALUE")
    private Integer cargoReturnValue;
    @Column(name = "CARGO_RETURN_DATE")
    @Temporal(TemporalType.DATE)
    private Date cargoReturnDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cargoId", fetch = FetchType.LAZY)
    private List<CargoDetails> cargoDetailsList;
    @JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Account accountId;
    @JoinColumn(name = "DAILY_ID", referencedColumnName = "DAILY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Daily dailyId;

    public Cargo() {
    }

    public Cargo(Integer cargoId) {
        this.cargoId = cargoId;
    }

    public Integer getCargoId() {
        return cargoId;
    }

    public void setCargoId(Integer cargoId) {
        this.cargoId = cargoId;
    }

    public Integer getCargoCommision() {
        return cargoCommision;
    }

    public void setCargoCommision(Integer cargoCommision) {
        this.cargoCommision = cargoCommision;
    }

    public Integer getCargoPaid() {
        return cargoPaid;
    }

    public void setCargoPaid(Integer cargoPaid) {
        this.cargoPaid = cargoPaid;
    }

    public Integer getCargoMashal() {
        return cargoMashal;
    }

    public void setCargoMashal(Integer cargoMashal) {
        this.cargoMashal = cargoMashal;
    }

    public Integer getCargoDeposit() {
        return cargoDeposit;
    }

    public void setCargoDeposit(Integer cargoDeposit) {
        this.cargoDeposit = cargoDeposit;
    }

    public Date getCargoDate() {
        return cargoDate;
    }

    public void setCargoDate(Date cargoDate) {
        this.cargoDate = cargoDate;
    }

    public Boolean getCargoStatus() {
        return cargoStatus;
    }

    public void setCargoStatus(Boolean cargoStatus) {
        this.cargoStatus = cargoStatus;
    }

    public String getCargoNote() {
        return cargoNote;
    }

    public void setCargoNote(String cargoNote) {
        this.cargoNote = cargoNote;
    }

    public Integer getCargoReturnValue() {
        return cargoReturnValue;
    }

    public void setCargoReturnValue(Integer cargoReturnValue) {
        this.cargoReturnValue = cargoReturnValue;
    }

    public Date getCargoReturnDate() {
        return cargoReturnDate;
    }

    public void setCargoReturnDate(Date cargoReturnDate) {
        this.cargoReturnDate = cargoReturnDate;
    }

    public List<CargoDetails> getCargoDetailsList() {
        return cargoDetailsList;
    }

    public void setCargoDetailsList(List<CargoDetails> cargoDetailsList) {
        this.cargoDetailsList = cargoDetailsList;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Daily getDailyId() {
        return dailyId;
    }

    public void setDailyId(Daily dailyId) {
        this.dailyId = dailyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargoId != null ? cargoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        if ((this.cargoId == null && other.cargoId != null) || (this.cargoId != null && !this.cargoId.equals(other.cargoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.Cargo[ cargoId=" + cargoId + " ]";
    }
    
}
