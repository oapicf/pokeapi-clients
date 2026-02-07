package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EncounterConditionName;
import org.openapitools.vertxweb.server.model.EncounterConditionValueSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EncounterConditionDetail   {
  
  private Integer id;
  private String name;
  private List<EncounterConditionValueSummary> values = new ArrayList<>();
  private List<EncounterConditionName> names = new ArrayList<>();

  public EncounterConditionDetail () {

  }

  public EncounterConditionDetail (Integer id, String name, List<EncounterConditionValueSummary> values, List<EncounterConditionName> names) {
    this.id = id;
    this.name = name;
    this.values = values;
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

    
  @JsonProperty("values")
  public List<EncounterConditionValueSummary> getValues() {
    return values;
  }
  public void setValues(List<EncounterConditionValueSummary> values) {
    this.values = values;
  }

    
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
