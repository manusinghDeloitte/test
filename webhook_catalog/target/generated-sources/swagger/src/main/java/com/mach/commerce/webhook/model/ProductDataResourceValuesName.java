package com.mach.commerce.webhook.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDataResourceValuesName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T13:38:02.584968171+05:30[Asia/Kolkata]")

public class ProductDataResourceValuesName   {
  @JsonProperty("locale")
  private String locale;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("data")
  private String data;

  public ProductDataResourceValuesName locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  @ApiModelProperty(value = "")


  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ProductDataResourceValuesName scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @ApiModelProperty(value = "")


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public ProductDataResourceValuesName data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")


  public String getData() {
    return data;
  }

  public void setData(String data) {
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
    ProductDataResourceValuesName productDataResourceValuesName = (ProductDataResourceValuesName) o;
    return Objects.equals(this.locale, productDataResourceValuesName.locale) &&
        Objects.equals(this.scope, productDataResourceValuesName.scope) &&
        Objects.equals(this.data, productDataResourceValuesName.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, scope, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataResourceValuesName {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

