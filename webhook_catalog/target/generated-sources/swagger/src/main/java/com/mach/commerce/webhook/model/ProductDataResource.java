package com.mach.commerce.webhook.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mach.commerce.webhook.model.ProductDataResourceAssociations;
import com.mach.commerce.webhook.model.ProductDataResourceValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDataResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-09T13:38:02.584968171+05:30[Asia/Kolkata]")

public class ProductDataResource   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("identifier")
  private String identifier;

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("family")
  private String family;

  @JsonProperty("categories")
  @Valid
  private List<String> categories = null;

  @JsonProperty("groups")
  @Valid
  private List<String> groups = null;

  @JsonProperty("parent")
  @Valid
  private List<String> parent = null;

  @JsonProperty("values")
  private ProductDataResourceValues values;

  @JsonProperty("created")
  private String created;

  @JsonProperty("updated")
  private String updated;

  @JsonProperty("associations")
  private ProductDataResourceAssociations associations;

  @JsonProperty("quantified_associations")
  @Valid
  private List<String> quantifiedAssociations = null;

  public ProductDataResource uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @ApiModelProperty(value = "")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ProductDataResource identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  */
  @ApiModelProperty(value = "")


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ProductDataResource enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  @ApiModelProperty(value = "")


  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ProductDataResource family(String family) {
    this.family = family;
    return this;
  }

  /**
   * Get family
   * @return family
  */
  @ApiModelProperty(value = "")


  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public ProductDataResource categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public ProductDataResource addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @ApiModelProperty(value = "")


  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public ProductDataResource groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ProductDataResource addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @ApiModelProperty(value = "")


  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ProductDataResource parent(List<String> parent) {
    this.parent = parent;
    return this;
  }

  public ProductDataResource addParentItem(String parentItem) {
    if (this.parent == null) {
      this.parent = new ArrayList<>();
    }
    this.parent.add(parentItem);
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @ApiModelProperty(value = "")


  public List<String> getParent() {
    return parent;
  }

  public void setParent(List<String> parent) {
    this.parent = parent;
  }

  public ProductDataResource values(ProductDataResourceValues values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDataResourceValues getValues() {
    return values;
  }

  public void setValues(ProductDataResourceValues values) {
    this.values = values;
  }

  public ProductDataResource created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @ApiModelProperty(value = "")


  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ProductDataResource updated(String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  @ApiModelProperty(value = "")


  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public ProductDataResource associations(ProductDataResourceAssociations associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDataResourceAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(ProductDataResourceAssociations associations) {
    this.associations = associations;
  }

  public ProductDataResource quantifiedAssociations(List<String> quantifiedAssociations) {
    this.quantifiedAssociations = quantifiedAssociations;
    return this;
  }

  public ProductDataResource addQuantifiedAssociationsItem(String quantifiedAssociationsItem) {
    if (this.quantifiedAssociations == null) {
      this.quantifiedAssociations = new ArrayList<>();
    }
    this.quantifiedAssociations.add(quantifiedAssociationsItem);
    return this;
  }

  /**
   * Get quantifiedAssociations
   * @return quantifiedAssociations
  */
  @ApiModelProperty(value = "")


  public List<String> getQuantifiedAssociations() {
    return quantifiedAssociations;
  }

  public void setQuantifiedAssociations(List<String> quantifiedAssociations) {
    this.quantifiedAssociations = quantifiedAssociations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDataResource productDataResource = (ProductDataResource) o;
    return Objects.equals(this.uuid, productDataResource.uuid) &&
        Objects.equals(this.identifier, productDataResource.identifier) &&
        Objects.equals(this.enabled, productDataResource.enabled) &&
        Objects.equals(this.family, productDataResource.family) &&
        Objects.equals(this.categories, productDataResource.categories) &&
        Objects.equals(this.groups, productDataResource.groups) &&
        Objects.equals(this.parent, productDataResource.parent) &&
        Objects.equals(this.values, productDataResource.values) &&
        Objects.equals(this.created, productDataResource.created) &&
        Objects.equals(this.updated, productDataResource.updated) &&
        Objects.equals(this.associations, productDataResource.associations) &&
        Objects.equals(this.quantifiedAssociations, productDataResource.quantifiedAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, identifier, enabled, family, categories, groups, parent, values, created, updated, associations, quantifiedAssociations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataResource {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    quantifiedAssociations: ").append(toIndentedString(quantifiedAssociations)).append("\n");
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

