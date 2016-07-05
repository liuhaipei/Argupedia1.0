package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "argument_has_tag", schema = "", catalog = "argupedia")
@IdClass(ArgumentHasTagEntityPK.class)
public class ArgumentHasTagEntity {
    private int argumentAid;
    private int tagTid;

    @Id
    @Column(name = "argument_aid")
    public int getArgumentAid() {
        return argumentAid;
    }

    public void setArgumentAid(int argumentAid) {
        this.argumentAid = argumentAid;
    }

    @Id
    @Column(name = "tag_tid")
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

        ArgumentHasTagEntity that = (ArgumentHasTagEntity) o;

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
