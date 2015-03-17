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
@Table(name = "USERS_PERMISSION")
@NamedQueries({
    @NamedQuery(name = "UsersPermission.findAll", query = "SELECT u FROM UsersPermission u"),
    @NamedQuery(name = "UsersPermission.findByPermissionId", query = "SELECT u FROM UsersPermission u WHERE u.permissionId = :permissionId"),
    @NamedQuery(name = "UsersPermission.findByFormEntryStatus", query = "SELECT u FROM UsersPermission u WHERE u.formEntryStatus = :formEntryStatus"),
    @NamedQuery(name = "UsersPermission.findByFormPrintStatus", query = "SELECT u FROM UsersPermission u WHERE u.formPrintStatus = :formPrintStatus"),
    @NamedQuery(name = "UsersPermission.findByFormMovmentStatus", query = "SELECT u FROM UsersPermission u WHERE u.formMovmentStatus = :formMovmentStatus"),
    @NamedQuery(name = "UsersPermission.findByFormUpdateStatus", query = "SELECT u FROM UsersPermission u WHERE u.formUpdateStatus = :formUpdateStatus")})
public class UsersPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PERMISSION_ID")
    private Integer permissionId;
    @Column(name = "FORM_ENTRY_STATUS")
    private Boolean formEntryStatus;
    @Column(name = "FORM_PRINT_STATUS")
    private Boolean formPrintStatus;
    @Column(name = "FORM_MOVMENT_STATUS")
    private Boolean formMovmentStatus;
    @Column(name = "FORM_UPDATE_STATUS")
    private Boolean formUpdateStatus;
    @JoinColumn(name = "FORM_ID", referencedColumnName = "FORM_ID")
    @ManyToOne(optional = false)
    private Forms formId;
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    @ManyToOne(optional = false)
    private Users userId;

    public UsersPermission() {
    }

    public UsersPermission(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Boolean getFormEntryStatus() {
        return formEntryStatus;
    }

    public void setFormEntryStatus(Boolean formEntryStatus) {
        this.formEntryStatus = formEntryStatus;
    }

    public Boolean getFormPrintStatus() {
        return formPrintStatus;
    }

    public void setFormPrintStatus(Boolean formPrintStatus) {
        this.formPrintStatus = formPrintStatus;
    }

    public Boolean getFormMovmentStatus() {
        return formMovmentStatus;
    }

    public void setFormMovmentStatus(Boolean formMovmentStatus) {
        this.formMovmentStatus = formMovmentStatus;
    }

    public Boolean getFormUpdateStatus() {
        return formUpdateStatus;
    }

    public void setFormUpdateStatus(Boolean formUpdateStatus) {
        this.formUpdateStatus = formUpdateStatus;
    }

    public Forms getFormId() {
        return formId;
    }

    public void setFormId(Forms formId) {
        this.formId = formId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissionId != null ? permissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersPermission)) {
            return false;
        }
        UsersPermission other = (UsersPermission) object;
        if ((this.permissionId == null && other.permissionId != null) || (this.permissionId != null && !this.permissionId.equals(other.permissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "back.entities.UsersPermission[ permissionId=" + permissionId + " ]";
    }
    
}
