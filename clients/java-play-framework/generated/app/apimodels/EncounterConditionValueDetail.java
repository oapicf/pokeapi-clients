package apimodels;

import apimodels.EncounterConditionSummary;
import apimodels.EncounterConditionValueName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EncounterConditionValueDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EncounterConditionValueDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("condition")
  @NotNull
@Valid

  private EncounterConditionSummary condition;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid EncounterConditionValueName> names = new ArrayList<>();

  public EncounterConditionValueDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EncounterConditionValueDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EncounterConditionValueDetail condition(EncounterConditionSummary condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  public EncounterConditionSummary getCondition() {
    return condition;
  }

  public void setCondition(EncounterConditionSummary condition) {
    this.condition = condition;
  }

  public EncounterConditionValueDetail names(List<@Valid EncounterConditionValueName> names) {
    this.names = names;
    return this;
  }

  public EncounterConditionValueDetail addNamesItem(EncounterConditionValueName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  public List<@Valid EncounterConditionValueName> getNames() {
    return names;
  }

  public void setNames(List<@Valid EncounterConditionValueName> names) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

