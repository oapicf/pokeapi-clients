package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionSummary;
import org.openapitools.model.EncounterConditionValueName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EncounterConditionValueDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EncounterConditionValueDetail   {
  private Integer id;
  private String name;
  private EncounterConditionSummary condition;
  private @Valid List<@Valid EncounterConditionValueName> names = new ArrayList<>();

  public EncounterConditionValueDetail() {
  }

  @JsonCreator
  public EncounterConditionValueDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "condition") EncounterConditionSummary condition,
    @JsonProperty(required = true, value = "names") List<@Valid EncounterConditionValueName> names
  ) {
    this.id = id;
    this.name = name;
    this.condition = condition;
    this.names = names;
  }

  /**
   **/
  public EncounterConditionValueDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "condition")
  @NotNull @Valid public EncounterConditionSummary getCondition() {
    return condition;
  }

  @JsonProperty(required = true, value = "condition")
  public void setCondition(EncounterConditionSummary condition) {
    this.condition = condition;
  }

  /**
   **/
  public EncounterConditionValueDetail names(List<@Valid EncounterConditionValueName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid EncounterConditionValueName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid EncounterConditionValueName> names) {
    this.names = names;
  }

  public EncounterConditionValueDetail addNamesItem(EncounterConditionValueName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public EncounterConditionValueDetail removeNamesItem(EncounterConditionValueName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

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
    EncounterConditionValueDetail encounterConditionValueDetail = (EncounterConditionValueDetail) o;
    return Objects.equals(this.id, encounterConditionValueDetail.id) &&
        Objects.equals(this.name, encounterConditionValueDetail.name) &&
        Objects.equals(this.condition, encounterConditionValueDetail.condition) &&
        Objects.equals(this.names, encounterConditionValueDetail.names);
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

