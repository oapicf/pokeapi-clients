package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EncounterMethodName;

/**
 * EncounterMethodDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EncounterMethodDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("order")
  private Integer order;

  @JsonProperty("names")
  private List<@Valid EncounterMethodName> names = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public EncounterMethodDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EncounterMethodDetail order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * A good value for sorting.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
  **/
  @ApiModelProperty(value = "A good value for sorting.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  public List<@Valid EncounterMethodName> getNames() {
    return names;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

