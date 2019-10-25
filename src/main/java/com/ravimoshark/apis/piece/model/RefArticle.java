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
import java.io.Serializable;
/**
 * Piece&#x27;s reference.
 */
@Schema(description = "Piece's reference.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-25T11:52:49.360+02:00[Europe/Paris]")
public class RefArticle implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("refContract")
  private String refContract = null;

  public RefArticle refContract(String refContract) {
    this.refContract = refContract;
    return this;
  }

   /**
   * Get refContract
   * @return refContract
  **/
  @Schema(description = "")
  public String getRefContract() {
    return refContract;
  }

  public void setRefContract(String refContract) {
    this.refContract = refContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefArticle refArticle = (RefArticle) o;
    return Objects.equals(this.refContract, refArticle.refContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refContract);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefArticle {\n");
    
    sb.append("    refContract: ").append(toIndentedString(refContract)).append("\n");
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