package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "tag", schema = "", catalog = "argupedia")
public class TagEntity {
    private int tid;
    private String content;

    @Id
    @Column(name = "tid")
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
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

        TagEntity tagEntity = (TagEntity) o;

        if (tid != tagEntity.tid) return false;
        if (content != null ? !content.equals(tagEntity.content) : tagEntity.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
