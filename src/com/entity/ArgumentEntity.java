package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "argument", schema = "", catalog = "argupedia")
public class ArgumentEntity {
    private int aid;
    private String topic;
    private String conclusion;
    private Integer agreeNum;
    private Integer disagreeNum;

    @Id
    @Column(name = "aid")
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "topic")
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Basic
    @Column(name = "conclusion")
    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
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

        ArgumentEntity that = (ArgumentEntity) o;

        if (aid != that.aid) return false;
        if (topic != null ? !topic.equals(that.topic) : that.topic != null) return false;
        if (conclusion != null ? !conclusion.equals(that.conclusion) : that.conclusion != null) return false;
        if (agreeNum != null ? !agreeNum.equals(that.agreeNum) : that.agreeNum != null) return false;
        if (disagreeNum != null ? !disagreeNum.equals(that.disagreeNum) : that.disagreeNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid;
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        result = 31 * result + (conclusion != null ? conclusion.hashCode() : 0);
        result = 31 * result + (agreeNum != null ? agreeNum.hashCode() : 0);
        result = 31 * result + (disagreeNum != null ? disagreeNum.hashCode() : 0);
        return result;
    }
}
