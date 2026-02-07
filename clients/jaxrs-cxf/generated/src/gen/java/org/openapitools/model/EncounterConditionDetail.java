package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionName;
import org.openapitools.model.EncounterConditionValueSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EncounterConditionDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid EncounterConditionValueSummary> values = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid EncounterConditionName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EncounterConditionDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get values
   * @return values
  **/
  @JsonProperty("values")
  @NotNull
  public List<@Valid EncounterConditionValueSummary> getValues() {
    return values;
  }

  public void setValues(List<@Valid EncounterConditionValueSummary> values) {
    this.values = values;
  }

  public EncounterConditionDetail values(List<@Valid EncounterConditionValueSummary> values) {
    this.values = values;
    return this;
  }

  public EncounterConditionDetail addValuesItem(EncounterConditionValueSummary valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid EncounterConditionName> getNames() {
    return names;
  }

  public void setNames(List<@Valid EncounterConditionName> names) {
    this.names = names;
  }

  public EncounterConditionDetail names(List<@Valid EncounterConditionName> names) {
    this.names = names;
    return this;
  }

  public EncounterConditionDetail addNamesItem(EncounterConditionName namesItem) {
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
    EncounterConditionDetail encounterConditionDetail = (EncounterConditionDetail) o;
    return Objects.equals(this.id, encounterConditionDetail.id) &&
        Objects.equals(this.name, encounterConditionDetail.name) &&
        Objects.equals(this.values, encounterConditionDetail.values) &&
        Objects.equals(this.names, encounterConditionDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, values, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterConditionDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

