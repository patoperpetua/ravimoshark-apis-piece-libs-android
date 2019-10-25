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
 * Pieces information.
 */
@Schema(description = "Pieces information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-25T16:01:41.420+02:00[Europe/Paris]")
public class Pieces implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("refArticle")
  private String refArticle = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("priceSale")
  private Float priceSale = null;

  @SerializedName("saleUnit")
  private Float saleUnit = null;

  @SerializedName("family")
  private String family = null;

  @SerializedName("priceLastPurchase")
  private Float priceLastPurchase = null;

  @SerializedName("packaging")
  private String packaging = null;

  @SerializedName("detergentType")
  private String detergentType = null;

  @SerializedName("weight")
  private Float weight = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public Pieces refArticle(String refArticle) {
    this.refArticle = refArticle;
    return this;
  }

   /**
   * Get refArticle
   * @return refArticle
  **/
  @Schema(description = "")
  public String getRefArticle() {
    return refArticle;
  }

  public void setRefArticle(String refArticle) {
    this.refArticle = refArticle;
  }

  public Pieces name(String name) {
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

  public Pieces state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Pieces priceSale(Float priceSale) {
    this.priceSale = priceSale;
    return this;
  }

   /**
   * Get priceSale
   * @return priceSale
  **/
  @Schema(description = "")
  public Float getPriceSale() {
    return priceSale;
  }

  public void setPriceSale(Float priceSale) {
    this.priceSale = priceSale;
  }

  public Pieces saleUnit(Float saleUnit) {
    this.saleUnit = saleUnit;
    return this;
  }

   /**
   * Get saleUnit
   * @return saleUnit
  **/
  @Schema(description = "")
  public Float getSaleUnit() {
    return saleUnit;
  }

  public void setSaleUnit(Float saleUnit) {
    this.saleUnit = saleUnit;
  }

  public Pieces family(String family) {
    this.family = family;
    return this;
  }

   /**
   * Get family
   * @return family
  **/
  @Schema(description = "")
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public Pieces priceLastPurchase(Float priceLastPurchase) {
    this.priceLastPurchase = priceLastPurchase;
    return this;
  }

   /**
   * Get priceLastPurchase
   * @return priceLastPurchase
  **/
  @Schema(description = "")
  public Float getPriceLastPurchase() {
    return priceLastPurchase;
  }

  public void setPriceLastPurchase(Float priceLastPurchase) {
    this.priceLastPurchase = priceLastPurchase;
  }

  public Pieces packaging(String packaging) {
    this.packaging = packaging;
    return this;
  }

   /**
   * Get packaging
   * @return packaging
  **/
  @Schema(description = "")
  public String getPackaging() {
    return packaging;
  }

  public void setPackaging(String packaging) {
    this.packaging = packaging;
  }

  public Pieces detergentType(String detergentType) {
    this.detergentType = detergentType;
    return this;
  }

   /**
   * Get detergentType
   * @return detergentType
  **/
  @Schema(description = "")
  public String getDetergentType() {
    return detergentType;
  }

  public void setDetergentType(String detergentType) {
    this.detergentType = detergentType;
  }

  public Pieces weight(Float weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public Pieces createdAt(Date createdAt) {
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

  public Pieces updatedAt(Date updatedAt) {
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

  public Pieces deleted(Boolean deleted) {
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
    Pieces pieces = (Pieces) o;
    return Objects.equals(this.refArticle, pieces.refArticle) &&
        Objects.equals(this.name, pieces.name) &&
        Objects.equals(this.state, pieces.state) &&
        Objects.equals(this.priceSale, pieces.priceSale) &&
        Objects.equals(this.saleUnit, pieces.saleUnit) &&
        Objects.equals(this.family, pieces.family) &&
        Objects.equals(this.priceLastPurchase, pieces.priceLastPurchase) &&
        Objects.equals(this.packaging, pieces.packaging) &&
        Objects.equals(this.detergentType, pieces.detergentType) &&
        Objects.equals(this.weight, pieces.weight) &&
        Objects.equals(this.createdAt, pieces.createdAt) &&
        Objects.equals(this.updatedAt, pieces.updatedAt) &&
        Objects.equals(this.deleted, pieces.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refArticle, name, state, priceSale, saleUnit, family, priceLastPurchase, packaging, detergentType, weight, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pieces {\n");
    
    sb.append("    refArticle: ").append(toIndentedString(refArticle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priceSale: ").append(toIndentedString(priceSale)).append("\n");
    sb.append("    saleUnit: ").append(toIndentedString(saleUnit)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    priceLastPurchase: ").append(toIndentedString(priceLastPurchase)).append("\n");
    sb.append("    packaging: ").append(toIndentedString(packaging)).append("\n");
    sb.append("    detergentType: ").append(toIndentedString(detergentType)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
