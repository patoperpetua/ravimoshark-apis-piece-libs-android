/*
 * Ravimoshark Piece API
 * This is an API to interact with Ravimoshark piece database. # Introduction This API allow to create, modify and delete pieces and products (cards, details and key points). # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.piece.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.io.Serializable;
/**
 * Pieces categories information.
 */
@Schema(description = "Pieces categories information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-25T11:52:49.360+02:00[Europe/Paris]")
public class PieceCategories implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("name")
  private String name = null;

  @SerializedName("imagePath")
  private String imagePath = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public PieceCategories name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PieceCategories imagePath(String imagePath) {
    this.imagePath = imagePath;
    return this;
  }

   /**
   * Get imagePath
   * @return imagePath
  **/
  @Schema(description = "")
  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public PieceCategories createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public PieceCategories updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PieceCategories deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PieceCategories pieceCategories = (PieceCategories) o;
    return Objects.equals(this.name, pieceCategories.name) &&
        Objects.equals(this.imagePath, pieceCategories.imagePath) &&
        Objects.equals(this.createdAt, pieceCategories.createdAt) &&
        Objects.equals(this.updatedAt, pieceCategories.updatedAt) &&
        Objects.equals(this.deleted, pieceCategories.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imagePath, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PieceCategories {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}