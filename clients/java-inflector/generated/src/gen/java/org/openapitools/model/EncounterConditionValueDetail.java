package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionSummary;
import org.openapitools.model.EncounterConditionValueName;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EncounterConditionValueDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("condition")
  private EncounterConditionSummary condition;

  @JsonProperty("names")
  private List<EncounterConditionValueName> names = new ArrayList<>();

  /**
   **/
  public EncounterConditionValueDetail id(Integer id) {
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
  public EncounterConditionValueDetail name(String name) {
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
  public EncounterConditionValueDetail condition(EncounterConditionSummary condition) {
    this.condition = condition;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("condition")
  public EncounterConditionSummary getCondition() {
    return condition;
  }
  public void setCondition(EncounterConditionSummary condition) {
    this.condition = condition;
  }

  /**
   **/
  public EncounterConditionValueDetail names(List<EncounterConditionValueName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<EncounterConditionValueName> getNames() {
    return names;
  }
  public void setNames(List<EncounterConditionValueName> names) {
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
    EncounterConditionValueDetail encounterConditionValueDetail = (EncounterConditionValueDetail) o;
    return Objects.equals(id, encounterConditionValueDetail.id) &&
        Objects.equals(name, encounterConditionValueDetail.name) &&
        Objects.equals(condition, encounterConditionValueDetail.condition) &&
        Objects.equals(names, encounterConditionValueDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, condition, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterConditionValueDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

