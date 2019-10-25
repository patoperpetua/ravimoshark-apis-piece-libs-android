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
import com.ravimoshark.apis.piece.model.Pieces;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.io.Serializable;
/**
 * Pieces Key Point information.
 */
@Schema(description = "Pieces Key Point information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-25T11:52:49.360+02:00[Europe/Paris]")
public class PieceKeyPoints implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("id")
  private Long id = null;

  @SerializedName("piece")
  private Pieces piece = null;

  @SerializedName("refArticle")
  private String refArticle = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("line")
  private Long line = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public PieceKeyPoints id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PieceKeyPoints piece(Pieces piece) {
    this.piece = piece;
    return this;
  }

   /**
   * Get piece
   * @return piece
  **/
  @Schema(description = "")
  public Pieces getPiece() {
    return piece;
  }

  public void setPiece(Pieces piece) {
    this.piece = piece;
  }

  public PieceKeyPoints refArticle(String refArticle) {
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

  public PieceKeyPoints content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PieceKeyPoints line(Long line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @Schema(description = "")
  public Long getLine() {
    return line;
  }

  public void setLine(Long line) {
    this.line = line;
  }

  public PieceKeyPoints createdAt(Date createdAt) {
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

  public PieceKeyPoints updatedAt(Date updatedAt) {
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

  public PieceKeyPoints deleted(Boolean deleted) {
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
    PieceKeyPoints pieceKeyPoints = (PieceKeyPoints) o;
    return Objects.equals(this.id, pieceKeyPoints.id) &&
        Objects.equals(this.piece, pieceKeyPoints.piece) &&
        Objects.equals(this.refArticle, pieceKeyPoints.refArticle) &&
        Objects.equals(this.content, pieceKeyPoints.content) &&
        Objects.equals(this.line, pieceKeyPoints.line) &&
        Objects.equals(this.createdAt, pieceKeyPoints.createdAt) &&
        Objects.equals(this.updatedAt, pieceKeyPoints.updatedAt) &&
        Objects.equals(this.deleted, pieceKeyPoints.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, piece, refArticle, content, line, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PieceKeyPoints {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    piece: ").append(toIndentedString(piece)).append("\n");
    sb.append("    refArticle: ").append(toIndentedString(refArticle)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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
