package com.mach.commerce.webhook.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mach.commerce.webhook.model.Price;
import com.mach.commerce.webhook.model.ProductDataResourceValuesName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDataResourceValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T13:38:02.584968171+05:30[Asia/Kolkata]")

public class ProductDataResourceValues   {
  @JsonProperty("price")
  private Price price;

  @JsonProperty("image_1")
  @Valid
  private List<Object> image1 = null;

  @JsonProperty("name")
  @Valid
  private List<ProductDataResourceValuesName> name = null;

  @JsonProperty("description")
  @Valid
  private List<ProductDataResourceValuesName> description = null;

  @JsonProperty("display_srgb")
  @Valid
  private List<ProductDataResourceValuesName> displaySrgb = null;

  @JsonProperty("display_color")
  @Valid
  private List<ProductDataResourceValuesName> displayColor = null;

  @JsonProperty("response_time")
  @Valid
  private List<ProductDataResourceValuesName> responseTime = null;

  @JsonProperty("display_diagonal")
  @Valid
  private List<ProductDataResourceValuesName> displayDiagonal = null;

  public ProductDataResourceValues price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public ProductDataResourceValues image1(List<Object> image1) {
    this.image1 = image1;
    return this;
  }

  public ProductDataResourceValues addImage1Item(Object image1Item) {
    if (this.image1 == null) {
      this.image1 = new ArrayList<>();
    }
    this.image1.add(image1Item);
    return this;
  }

  /**
   * Get image1
   * @return image1
  */
  @ApiModelProperty(value = "")


  public List<Object> getImage1() {
    return image1;
  }

  public void setImage1(List<Object> image1) {
    this.image1 = image1;
  }

  public ProductDataResourceValues name(List<ProductDataResourceValuesName> name) {
    this.name = name;
    return this;
  }

  public ProductDataResourceValues addNameItem(ProductDataResourceValuesName nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductDataResourceValuesName> getName() {
    return name;
  }

  public void setName(List<ProductDataResourceValuesName> name) {
    this.name = name;
  }

  public ProductDataResourceValues description(List<ProductDataResourceValuesName> description) {
    this.description = description;
    return this;
  }

  public ProductDataResourceValues addDescriptionItem(ProductDataResourceValuesName descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<>();
    }
    this.description.add(descriptionItem);
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductDataResourceValuesName> getDescription() {
    return description;
  }

  public void setDescription(List<ProductDataResourceValuesName> description) {
    this.description = description;
  }

  public ProductDataResourceValues displaySrgb(List<ProductDataResourceValuesName> displaySrgb) {
    this.displaySrgb = displaySrgb;
    return this;
  }

  public ProductDataResourceValues addDisplaySrgbItem(ProductDataResourceValuesName displaySrgbItem) {
    if (this.displaySrgb == null) {
      this.displaySrgb = new ArrayList<>();
    }
    this.displaySrgb.add(displaySrgbItem);
    return this;
  }

  /**
   * Get displaySrgb
   * @return displaySrgb
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductDataResourceValuesName> getDisplaySrgb() {
    return displaySrgb;
  }

  public void setDisplaySrgb(List<ProductDataResourceValuesName> displaySrgb) {
    this.displaySrgb = displaySrgb;
  }

  public ProductDataResourceValues displayColor(List<ProductDataResourceValuesName> displayColor) {
    this.displayColor = displayColor;
    return this;
  }

  public ProductDataResourceValues addDisplayColorItem(ProductDataResourceValuesName displayColorItem) {
    if (this.displayColor == null) {
      this.displayColor = new ArrayList<>();
    }
    this.displayColor.add(displayColorItem);
    return this;
  }

  /**
   * Get displayColor
   * @return displayColor
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductDataResourceValuesName> getDisplayColor() {
    return displayColor;
  }

  public void setDisplayColor(List<ProductDataResourceValuesName> displayColor) {
    this.displayColor = displayColor;
  }

  public ProductDataResourceValues responseTime(List<ProductDataResourceValuesName> responseTime) {
    this.responseTime = responseTime;
    return this;
  }

  public ProductDataResourceValues addResponseTimeItem(ProductDataResourceValuesName responseTimeItem) {
    if (this.responseTime == null) {
      this.responseTime = new ArrayList<>();
    }
    this.responseTime.add(responseTimeItem);
    return this;
  }

  /**
   * Get responseTime
   * @return responseTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductDataResourceValuesName> getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(List<ProductDataResourceValuesName> responseTime) {
    this.responseTime = responseTime;
  }

  public ProductDataResourceValues displayDiagonal(List<ProductDataResourceValuesName> displayDiagonal) {
    this.displayDiagonal = displayDiagonal;
    return this;
  }

  public ProductDataResourceValues addDisplayDiagonalItem(ProductDataResourceValuesName displayDiagonalItem) {
    if (this.displayDiagonal == null) {
      this.displayDiagonal = new ArrayList<>();
    }
    this.displayDiagonal.add(displayDiagonalItem);
    return this;
  }

  /**
   * Get displayDiagonal
   * @return displayDiagonal
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductDataResourceValuesName> getDisplayDiagonal() {
    return displayDiagonal;
  }

  public void setDisplayDiagonal(List<ProductDataResourceValuesName> displayDiagonal) {
    this.displayDiagonal = displayDiagonal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDataResourceValues productDataResourceValues = (ProductDataResourceValues) o;
    return Objects.equals(this.price, productDataResourceValues.price) &&
        Objects.equals(this.image1, productDataResourceValues.image1) &&
        Objects.equals(this.name, productDataResourceValues.name) &&
        Objects.equals(this.description, productDataResourceValues.description) &&
        Objects.equals(this.displaySrgb, productDataResourceValues.displaySrgb) &&
        Objects.equals(this.displayColor, productDataResourceValues.displayColor) &&
        Objects.equals(this.responseTime, productDataResourceValues.responseTime) &&
        Objects.equals(this.displayDiagonal, productDataResourceValues.displayDiagonal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, image1, name, description, displaySrgb, displayColor, responseTime, displayDiagonal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataResourceValues {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    image1: ").append(toIndentedString(image1)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displaySrgb: ").append(toIndentedString(displaySrgb)).append("\n");
    sb.append("    displayColor: ").append(toIndentedString(displayColor)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    displayDiagonal: ").append(toIndentedString(displayDiagonal)).append("\n");
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

