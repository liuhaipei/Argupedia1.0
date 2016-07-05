package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "", catalog = "argupedia")
public class UserEntity {
    private int uid;
    private String uname;
    private String password;
    private String roal;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "roal")
    public String getRoal() {
        return roal;
    }

    public void setRoal(String roal) {
        this.roal = roal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (uid != that.uid) return false;
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (roal != null ? !roal.equals(that.roal) : that.roal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (roal != null ? roal.hashCode() : 0);
        return result;
    }
}
