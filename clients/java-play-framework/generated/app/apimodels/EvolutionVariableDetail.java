package apimodels;

import apimodels.EvolutionVariableDescription;
import apimodels.EvolutionVariableName;
import apimodels.VersionGroupSummary;
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
 * EvolutionVariableDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EvolutionVariableDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("symbol")
  @NotNull
@Size(max=10)

  private String symbol;

  @JsonProperty("data_type")
  @Size(max=20)

  private String dataType;

  @JsonProperty("source")
  @Size(max=20)

  private String source;

  @JsonProperty("version_group")
  @NotNull
@Valid

  private VersionGroupSummary versionGroup;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid EvolutionVariableName> names = new ArrayList<>();

  @JsonProperty("descriptions")
  @NotNull
@Valid

  private List<@Valid EvolutionVariableDescription> descriptions = new ArrayList<>();

  public EvolutionVariableDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EvolutionVariableDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EvolutionVariableDetail symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol used for this variable in evolution condition expressions.
   * @return symbol
  **/
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public EvolutionVariableDetail dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The data type of this variable.
   * @return dataType
  **/
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public EvolutionVariableDetail source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the variable value.
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public EvolutionVariableDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * The version group in which this variable was introduced.
   * @return versionGroup
  **/
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public EvolutionVariableDetail names(List<@Valid EvolutionVariableName> names) {
    this.names = names;
    return this;
  }

  public EvolutionVariableDetail addNamesItem(EvolutionVariableName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  public List<@Valid EvolutionVariableName> getNames() {
    return names;
  }

  public void setNames(List<@Valid EvolutionVariableName> names) {
    this.names = names;
  }

  public EvolutionVariableDetail descriptions(List<@Valid EvolutionVariableDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public EvolutionVariableDetail addDescriptionsItem(EvolutionVariableDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * The description of this resource listed in different languages.
   * @return descriptions
  **/
  public List<@Valid EvolutionVariableDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid EvolutionVariableDescription> descriptions) {
    this.descriptions = descriptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionVariableDetail evolutionVariableDetail = (EvolutionVariableDetail) o;
    return Objects.equals(id, evolutionVariableDetail.id) &&
        Objects.equals(name, evolutionVariableDetail.name) &&
        Objects.equals(symbol, evolutionVariableDetail.symbol) &&
        Objects.equals(dataType, evolutionVariableDetail.dataType) &&
        Objects.equals(source, evolutionVariableDetail.source) &&
        Objects.equals(versionGroup, evolutionVariableDetail.versionGroup) &&
        Objects.equals(names, evolutionVariableDetail.names) &&
        Objects.equals(descriptions, evolutionVariableDetail.descriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, symbol, dataType, source, versionGroup, names, descriptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionVariableDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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

