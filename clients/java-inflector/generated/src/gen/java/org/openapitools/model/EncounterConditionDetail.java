package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionName;
import org.openapitools.model.EncounterConditionValueSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T15:22:50.575598517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EncounterConditionDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("values")
  private List<EncounterConditionValueSummary> values = new ArrayList<>();

  @JsonProperty("names")
  private List<EncounterConditionName> names = new ArrayList<>();

  /**
   **/
  public EncounterConditionDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public EncounterConditionDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public EncounterConditionDetail values(List<EncounterConditionValueSummary> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("values")
  public List<EncounterConditionValueSummary> getValues() {
    return values;
  }
  public void setValues(List<EncounterConditionValueSummary> values) {
    this.values = values;
  }

  /**
   **/
  public EncounterConditionDetail names(List<EncounterConditionName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<EncounterConditionName> getNames() {
    return names;
  }
  public void setNames(List<EncounterConditionName> names) {
    this.names = names;
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
    return Objects.equals(id, encounterConditionDetail.id) &&
        Objects.equals(name, encounterConditionDetail.name) &&
        Objects.equals(values, encounterConditionDetail.values) &&
        Objects.equals(names, encounterConditionDetail.names);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

