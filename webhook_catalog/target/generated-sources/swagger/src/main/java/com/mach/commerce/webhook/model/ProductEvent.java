package com.mach.commerce.webhook.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mach.commerce.webhook.model.ProductData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T13:38:02.584968171+05:30[Asia/Kolkata]")

public class ProductEvent   {
  @JsonProperty("action")
  private String action;

  @JsonProperty("event_id")
  private String eventId;

  @JsonProperty("event_datetime")
  private String eventDatetime;

  @JsonProperty("author")
  private String author;

  @JsonProperty("author_type")
  private String authorType;

  @JsonProperty("pim_source")
  private String pimSource;

  @JsonProperty("data")
  private ProductData data;

  public ProductEvent action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ProductEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  */
  @ApiModelProperty(value = "")


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ProductEvent eventDatetime(String eventDatetime) {
    this.eventDatetime = eventDatetime;
    return this;
  }

  /**
   * Get eventDatetime
   * @return eventDatetime
  */
  @ApiModelProperty(value = "")


  public String getEventDatetime() {
    return eventDatetime;
  }

  public void setEventDatetime(String eventDatetime) {
    this.eventDatetime = eventDatetime;
  }

  public ProductEvent author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @ApiModelProperty(value = "")


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public ProductEvent authorType(String authorType) {
    this.authorType = authorType;
    return this;
  }

  /**
   * Get authorType
   * @return authorType
  */
  @ApiModelProperty(value = "")


  public String getAuthorType() {
    return authorType;
  }

  public void setAuthorType(String authorType) {
    this.authorType = authorType;
  }

  public ProductEvent pimSource(String pimSource) {
    this.pimSource = pimSource;
    return this;
  }

  /**
   * Get pimSource
   * @return pimSource
  */
  @ApiModelProperty(value = "")


  public String getPimSource() {
    return pimSource;
  }

  public void setPimSource(String pimSource) {
    this.pimSource = pimSource;
  }

  public ProductEvent data(ProductData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductData getData() {
    return data;
  }

  public void setData(ProductData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductEvent productEvent = (ProductEvent) o;
    return Objects.equals(this.action, productEvent.action) &&
        Objects.equals(this.eventId, productEvent.eventId) &&
        Objects.equals(this.eventDatetime, productEvent.eventDatetime) &&
        Objects.equals(this.author, productEvent.author) &&
        Objects.equals(this.authorType, productEvent.authorType) &&
        Objects.equals(this.pimSource, productEvent.pimSource) &&
        Objects.equals(this.data, productEvent.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, eventId, eventDatetime, author, authorType, pimSource, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductEvent {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDatetime: ").append(toIndentedString(eventDatetime)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorType: ").append(toIndentedString(authorType)).append("\n");
    sb.append("    pimSource: ").append(toIndentedString(pimSource)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

