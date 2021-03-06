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
import com.ravimoshark.apis.piece.model.Metadata;
import com.ravimoshark.apis.piece.model.Products;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * InlineResponse2002
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-25T15:45:54.964081+11:00[Australia/Sydney]")
public class InlineResponse2002 implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("metadata")
  private Metadata metadata = null;

  @SerializedName("items")
  private List<Products> items = null;

  public InlineResponse2002 metadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public InlineResponse2002 items(List<Products> items) {
    this.items = items;
    return this;
  }

  public InlineResponse2002 addItemsItem(Products itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Products>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<Products> getItems() {
    return items;
  }

  public void setItems(List<Products> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.metadata, inlineResponse2002.metadata) &&
        Objects.equals(this.items, inlineResponse2002.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
