package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EncounterMethodName;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EncounterMethodDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(value = "")

  private Integer order;

  @ApiModelProperty(required = true, value = "")

  private List<EncounterMethodName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EncounterMethodDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get order
   * @return order
  **/
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public EncounterMethodDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<EncounterMethodName> getNames() {
    return names;
  }

  public void setNames(List<EncounterMethodName> names) {
    this.names = names;
  }

  public EncounterMethodDetail names(List<EncounterMethodName> names) {
    this.names = names;
    return this;
  }

  public EncounterMethodDetail addNamesItem(EncounterMethodName namesItem) {
    this.names.add(namesItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncounterMethodDetail encounterMethodDetail = (EncounterMethodDetail) o;
    return Objects.equals(this.id, encounterMethodDetail.id) &&
        Objects.equals(this.name, encounterMethodDetail.name) &&
        Objects.equals(this.order, encounterMethodDetail.order) &&
        Objects.equals(this.names, encounterMethodDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterMethodDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

