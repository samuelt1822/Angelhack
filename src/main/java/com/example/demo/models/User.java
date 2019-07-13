package com.example.demo.models;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

  @Document(collection = "user")
  @JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)

  public class User {

    @Id
    private String id;

    @Indexed
    private Boolean isProfileCreated;
    private String name;
    private int age;
    private String religion;
    private String sexualOrientation;
    private int height;
    private String genderIdentification;

    private Date createdAt = new Date();

    public User(String id, Boolean isProfileCreated, String name, int age, String religion,
        String sexualOrientation, int height, String genderIdentification, Date createdAt) {
      this.id = id;
      this.isProfileCreated = isProfileCreated;
      this.name = name;
      this.age = age;
      this.religion = religion;
      this.sexualOrientation = sexualOrientation;
      this.height = height;
      this.genderIdentification = genderIdentification;
      this.createdAt = createdAt;
    }

    public boolean isProfileCreated() {
      return isProfileCreated;
    }

    public void setProfileCreated(boolean profileCreated) {
      isProfileCreated = profileCreated;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getReligion() {
      return religion;
    }

    public void setReligion(String religion) {
      this.religion = religion;
    }

    public String getSexualOrientation() {
      return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
      this.sexualOrientation = sexualOrientation;
    }

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
    }

    public String getGenderIdentification() {
      return genderIdentification;
    }

    public void setGenderIdentification(String genderIdentification) {
      this.genderIdentification = genderIdentification;
    }

    public Date getCreatedAt() {
      return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
    }
}
