package cn.edu.tongji.plusone.springbootcrashcourse.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_phone", schema = "springbootdemo", catalog = "")
@IdClass(UserPhoneEntityPK.class)
public class UserPhoneEntity {
    private int id;
    private String phone;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPhoneEntity that = (UserPhoneEntity) o;
        return id == that.id && Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phone);
    }
}
