package com.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ArgumentHasTagEntityPK implements Serializable {
    private int argumentAid;
    private int tagTid;

    @Column(name = "argument_aid")
    @Id
    public int getArgumentAid() {
        return argumentAid;
    }

    public void setArgumentAid(int argumentAid) {
        this.argumentAid = argumentAid;
    }

    @Column(name = "tag_tid")
    @Id
    public int getTagTid() {
        return tagTid;
    }

    public void setTagTid(int tagTid) {
        this.tagTid = tagTid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArgumentHasTagEntityPK that = (ArgumentHasTagEntityPK) o;

        if (argumentAid != that.argumentAid) return false;
        if (tagTid != that.tagTid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = argumentAid;
        result = 31 * result + tagTid;
        return result;
    }
}
