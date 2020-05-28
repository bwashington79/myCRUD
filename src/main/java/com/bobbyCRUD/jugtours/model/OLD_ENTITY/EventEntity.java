//package com.bobbyCRUD.jugtours.model.OLD_ENTITY;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.time.Instant;
//
//@Entity
//@Table(name = "event", schema = "public", catalog = "postgres")
//public class EventEntity {
//    private long id;
//    private Instant date;
//    private String title;
//    private String description;
//    private Integer userId;
//
//    @Id
//    @Column(name = "id")
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "date")
//    public Instant getDate() {
//        return date;
//    }
//
//    public void setDate(Instant date) {
//        this.date = date;
//    }
//
//    @Basic
//    @Column(name = "title")
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    @Basic
//    @Column(name = "description")
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Basic
//    @Column(name = "user_id")
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        EventEntity that = (EventEntity) o;
//
//        if (id != that.id) return false;
//        if (date != null ? !date.equals(that.date) : that.date != null) return false;
//        if (title != null ? !title.equals(that.title) : that.title != null) return false;
//        if (description != null ? !description.equals(that.description) : that.description != null) return false;
//        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (date != null ? date.hashCode() : 0);
//        result = 31 * result + (title != null ? title.hashCode() : 0);
//        result = 31 * result + (description != null ? description.hashCode() : 0);
//        result = 31 * result + (userId != null ? userId.hashCode() : 0);
//        return result;
//    }
//}
