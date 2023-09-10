package dev.yonk.week01_lab.entities;

import java.math.BigInteger;
import java.util.Date;

public class Log {
    private BigInteger id;
    private String accountId;
    private Date loginTime;
    private Date logoutTime;
    private String note;

    public Log(BigInteger id, String accountId, Date loginTime, Date logoutTime, String note) {
        this.id = id;
        this.accountId = accountId;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.note = note;
    }

    public Log() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", accountId='" + accountId + '\'' +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", note='" + note + '\'' +
                '}';
    }
}
