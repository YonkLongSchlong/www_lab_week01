package dev.yonk.week01_lab.entities;

public class Role {
    private String roleId;
    private String roleName;
    private String description;
    private int status;

    public Role(String roleId, String roleName, String description, int status) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.description = description;
        this.status = status;
    }

    public Role() {
    }

    public String getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }

    public int getStatus() {
        return status;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
