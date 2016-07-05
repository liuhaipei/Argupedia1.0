package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "argument_criticalQuestion", schema = "", catalog = "argupedia")
public class ArgumentCriticalQuestionEntity {
    private int acqid;
    private Integer agreeNum;
    private Integer disagreeNum;

    @Id
    @Column(name = "acqid")
    public int getAcqid() {
        return acqid;
    }

    public void setAcqid(int acqid) {
        this.acqid = acqid;
    }

    @Basic
    @Column(name = "agreeNum")
    public Integer getAgreeNum() {
        return agreeNum;
    }

    public void setAgreeNum(Integer agreeNum) {
        this.agreeNum = agreeNum;
    }

    @Basic
    @Column(name = "disagreeNum")
    public Integer getDisagreeNum() {
        return disagreeNum;
    }

    public void setDisagreeNum(Integer disagreeNum) {
        this.disagreeNum = disagreeNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArgumentCriticalQuestionEntity that = (ArgumentCriticalQuestionEntity) o;

        if (acqid != that.acqid) return false;
        if (agreeNum != null ? !agreeNum.equals(that.agreeNum) : that.agreeNum != null) return false;
        if (disagreeNum != null ? !disagreeNum.equals(that.disagreeNum) : that.disagreeNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = acqid;
        result = 31 * result + (agreeNum != null ? agreeNum.hashCode() : 0);
        result = 31 * result + (disagreeNum != null ? disagreeNum.hashCode() : 0);
        return result;
    }
}
