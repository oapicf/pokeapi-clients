package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EncounterConditionSummary;
import org.openapitools.vertxweb.server.model.EncounterConditionValueName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EncounterConditionValueDetail   {
  
  private Integer id;
  private String name;
  private EncounterConditionSummary condition;
  private List<EncounterConditionValueName> names = new ArrayList<>();

  public EncounterConditionValueDetail () {

  }

  public EncounterConditionValueDetail (Integer id, String name, EncounterConditionSummary condition, List<EncounterConditionValueName> names) {
    this.id = id;
    this.name = name;
    this.condition = condition;
    this.names = names;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("condition")
  public EncounterConditionSummary getCondition() {
    return condition;
  }
  public void setCondition(EncounterConditionSummary condition) {
    this.condition = condition;
  }

    
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
