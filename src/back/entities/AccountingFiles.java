package back.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author Hassan
 */
@Entity
@Table(name = "ACCOUNTING_FILES")
@NamedQueries({
    @NamedQuery(name = "AccountingFiles.findAll", query = "SELECT a FROM AccountingFiles a"),
    @NamedQuery(name = "AccountingFiles.findByAccountingFilesId", query = "SELECT a FROM AccountingFiles a WHERE a.accountingFilesId = :accountingFilesId"),
    @NamedQuery(name = "AccountingFiles.findByAccountingFilesName", query = "SELECT a FROM AccountingFiles a WHERE a.accountingFilesName = :accountingFilesName"),
    @NamedQuery(name = "AccountingFiles.findByAccountingFilesActiveStatus", query = "SELECT a FROM AccountingFiles a WHERE a.accountingFilesActiveStatus = :accountingFilesActiveStatus")})
public class AccountingFiles implements Serializable {
    
    private Integer accountingFilesId;
    private String accountingFilesName;
    private Boolean accountingFilesActiveStatus;
    private String accountingFilesPassword;
    private List<AccountingFilesDetails> accountingFilesDetailsList;

    public AccountingFiles() {
    }

    public AccountingFiles(Integer accountingFilesId) {
        this.accountingFilesId = accountingFilesId;
    }

    @TableGenerator(name = "AccountingFilesGen", table = "MAIN_SEQUENCE",
            pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT",
            pkColumnValue = "ACCOUNTING_FILES_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "AccountingFilesGen")
    @Id
    @Column(name = "ACCOUNTING_FILES_ID")
    public Integer getAccountingFilesId() {
        return accountingFilesId;
    }

    public void setAccountingFilesId(Integer accountingFilesId) {
        this.accountingFilesId = accountingFilesId;
    }

    @Column(name = "ACCOUNTING_FILES_NAME")
    public String getAccountingFilesName() {
        return accountingFilesName;
    }

    public void setAccountingFilesName(String accountingFilesName) {
        this.accountingFilesName = accountingFilesName;
    }

    @Column(name = "ACCOUNTING_FILES_ACTIVE_STATUS")
    public Boolean getAccountingFilesActiveStatus() {
        return accountingFilesActiveStatus;
    }

    public void setAccountingFilesActiveStatus(Boolean accountingFilesActiveStatus) {
        this.accountingFilesActiveStatus = accountingFilesActiveStatus;
    }

    @Column(name = "ACCOUNTING_FILES_PASSWORD")
    public String getAccountingFilesPassword() {
        return accountingFilesPassword;
    }

    public void setAccountingFilesPassword(String accountingFilesPassword) {
        this.accountingFilesPassword = accountingFilesPassword;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountingId")
    public List<AccountingFilesDetails> getAccountingFilesDetailsList() {
        return accountingFilesDetailsList;
    }

    public void setAccountingFilesDetailsList(List<AccountingFilesDetails> accountingFilesDetailsList) {
        this.accountingFilesDetailsList = accountingFilesDetailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountingFilesId != null ? accountingFilesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountingFiles)) {
            return false;
        }
        AccountingFiles other = (AccountingFiles) object;
        if ((this.accountingFilesId == null && other.accountingFilesId != null) || (this.accountingFilesId != null && !this.accountingFilesId.equals(other.accountingFilesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.AccountingFiles[ accountingFilesId=" + accountingFilesId + " ]";
    }
    
}
