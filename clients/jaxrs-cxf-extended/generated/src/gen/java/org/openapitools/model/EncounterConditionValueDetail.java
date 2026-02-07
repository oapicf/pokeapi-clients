package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionSummary;
import org.openapitools.model.EncounterConditionValueName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EncounterConditionValueDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private EncounterConditionSummary condition;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid EncounterConditionValueName> names = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public EncounterConditionValueDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public EncounterConditionValueDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get condition
  * @return condition
  */
  @JsonProperty("condition")
  @NotNull
  public EncounterConditionSummary getCondition() {
    return condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
 public void setCondition(EncounterConditionSummary condition) {
    this.condition = condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
  public EncounterConditionValueDetail condition(EncounterConditionSummary condition) {
    this.condition = condition;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid EncounterConditionValueName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid EncounterConditionValueName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public EncounterConditionValueDetail names(List<@Valid EncounterConditionValueName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public EncounterConditionValueDetail addNamesItem(EncounterConditionValueName namesItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

