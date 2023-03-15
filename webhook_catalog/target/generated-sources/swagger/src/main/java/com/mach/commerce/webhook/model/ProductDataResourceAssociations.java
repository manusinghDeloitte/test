package com.mach.commerce.webhook.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDataResourceAssociations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T13:38:02.584968171+05:30[Asia/Kolkata]")

public class ProductDataResourceAssociations   {
  @JsonProperty("PACK")
  @Valid
  private List<Object> PACK = null;

  @JsonProperty("X_SELL")
  @Valid
  private List<Object> X_SELL = null;

  @JsonProperty("SUBSTITUTION")
  @Valid
  private List<Object> SUBSTITUTION = null;

  public ProductDataResourceAssociations PACK(List<Object> PACK) {
    this.PACK = PACK;
    return this;
  }

  public ProductDataResourceAssociations addPACKItem(Object PACKItem) {
    if (this.PACK == null) {
      this.PACK = new ArrayList<>();
    }
    this.PACK.add(PACKItem);
    return this;
  }

  /**
   * Get PACK
   * @return PACK
  */
  @ApiModelProperty(value = "")


  public List<Object> getPACK() {
    return PACK;
  }

  public void setPACK(List<Object> PACK) {
    this.PACK = PACK;
  }

  public ProductDataResourceAssociations X_SELL(List<Object> X_SELL) {
    this.X_SELL = X_SELL;
    return this;
  }

  public ProductDataResourceAssociations addXSELLItem(Object X_SELLItem) {
    if (this.X_SELL == null) {
      this.X_SELL = new ArrayList<>();
    }
    this.X_SELL.add(X_SELLItem);
    return this;
  }

  /**
   * Get X_SELL
   * @return X_SELL
  */
  @ApiModelProperty(value = "")


  public List<Object> getXSELL() {
    return X_SELL;
  }

  public void setXSELL(List<Object> X_SELL) {
    this.X_SELL = X_SELL;
  }

  public ProductDataResourceAssociations SUBSTITUTION(List<Object> SUBSTITUTION) {
    this.SUBSTITUTION = SUBSTITUTION;
    return this;
  }

  public ProductDataResourceAssociations addSUBSTITUTIONItem(Object SUBSTITUTIONItem) {
    if (this.SUBSTITUTION == null) {
      this.SUBSTITUTION = new ArrayList<>();
    }
    this.SUBSTITUTION.add(SUBSTITUTIONItem);
    return this;
  }

  /**
   * Get SUBSTITUTION
   * @return SUBSTITUTION
  */
  @ApiModelProperty(value = "")


  public List<Object> getSUBSTITUTION() {
    return SUBSTITUTION;
  }

  public void setSUBSTITUTION(List<Object> SUBSTITUTION) {
    this.SUBSTITUTION = SUBSTITUTION;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDataResourceAssociations productDataResourceAssociations = (ProductDataResourceAssociations) o;
    return Objects.equals(this.PACK, productDataResourceAssociations.PACK) &&
        Objects.equals(this.X_SELL, productDataResourceAssociations.X_SELL) &&
        Objects.equals(this.SUBSTITUTION, productDataResourceAssociations.SUBSTITUTION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PACK, X_SELL, SUBSTITUTION);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataResourceAssociations {\n");
    
    sb.append("    PACK: ").append(toIndentedString(PACK)).append("\n");
    sb.append("    X_SELL: ").append(toIndentedString(X_SELL)).append("\n");
    sb.append("    SUBSTITUTION: ").append(toIndentedString(SUBSTITUTION)).append("\n");
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

