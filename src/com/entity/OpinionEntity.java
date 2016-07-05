package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "opinion", schema = "", catalog = "argupedia")
public class OpinionEntity {
    private int oid;
    private Byte agree;
    private String hyperlink;

    @Id
    @Column(name = "oid")
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "agree")
    public Byte getAgree() {
        return agree;
    }

    public void setAgree(Byte agree) {
        this.agree = agree;
    }

    @Basic
    @Column(name = "hyperlink")
    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OpinionEntity that = (OpinionEntity) o;

        if (oid != that.oid) return false;
        if (agree != null ? !agree.equals(that.agree) : that.agree != null) return false;
        if (hyperlink != null ? !hyperlink.equals(that.hyperlink) : that.hyperlink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + (agree != null ? agree.hashCode() : 0);
        result = 31 * result + (hyperlink != null ? hyperlink.hashCode() : 0);
        return result;
    }
}
