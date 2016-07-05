package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "scheme_statement", schema = "", catalog = "argupedia")
public class SchemeStatementEntity {
    private int ssid;
    private String label;
    private String content;

    @Id
    @Column(name = "ssid")
    public int getSsid() {
        return ssid;
    }

    public void setSsid(int ssid) {
        this.ssid = ssid;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchemeStatementEntity that = (SchemeStatementEntity) o;

        if (ssid != that.ssid) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ssid;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
