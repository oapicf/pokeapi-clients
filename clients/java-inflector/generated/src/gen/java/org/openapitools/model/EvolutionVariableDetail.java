package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EvolutionVariableDescription;
import org.openapitools.model.EvolutionVariableName;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionVariableDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("data_type")
  private String dataType;

  @JsonProperty("source")
  private String source;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("names")
  private List<EvolutionVariableName> names = new ArrayList<>();

  @JsonProperty("descriptions")
  private List<EvolutionVariableDescription> descriptions = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  public EvolutionVariableDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public EvolutionVariableDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The symbol used for this variable in evolution condition expressions.
   **/
  public EvolutionVariableDetail symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The symbol used for this variable in evolution condition expressions.")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * The data type of this variable.
   **/
  public EvolutionVariableDetail dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  
  @ApiModelProperty(value = "The data type of this variable.")
  @JsonProperty("data_type")
  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  /**
   * The source of the variable value.
   **/
  public EvolutionVariableDetail source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "The source of the variable value.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The version group in which this variable was introduced.
   **/
  public EvolutionVariableDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group in which this variable was introduced.")
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public EvolutionVariableDetail names(List<EvolutionVariableName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  public List<EvolutionVariableName> getNames() {
    return names;
  }
  public void setNames(List<EvolutionVariableName> names) {
    this.names = names;
  }

  /**
   * The description of this resource listed in different languages.
   **/
  public EvolutionVariableDetail descriptions(List<EvolutionVariableDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")
  @JsonProperty("descriptions")
  public List<EvolutionVariableDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<EvolutionVariableDescription> descriptions) {
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

