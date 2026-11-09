package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.EvolutionVariableDescription;
import com.prokarma.pkmst.model.EvolutionVariableName;
import com.prokarma.pkmst.model.VersionGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * EvolutionVariableDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  public EvolutionVariableDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
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
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
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
   */
  @ApiModelProperty(required = true, value = "The symbol used for this variable in evolution condition expressions.")
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
   */
  @ApiModelProperty(value = "The data type of this variable.")
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
   */
  @ApiModelProperty(value = "The source of the variable value.")
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
   */
  @ApiModelProperty(required = true, value = "The version group in which this variable was introduced.")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public EvolutionVariableDetail names(List<EvolutionVariableName> names) {
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<EvolutionVariableName> getNames() {
    return names;
  }

  public void setNames(List<EvolutionVariableName> names) {
    this.names = names;
  }

  public EvolutionVariableDetail descriptions(List<EvolutionVariableDescription> descriptions) {
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The description of this resource listed in different languages.")
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
    return Objects.equals(this.id, evolutionVariableDetail.id) &&
        Objects.equals(this.name, evolutionVariableDetail.name) &&
        Objects.equals(this.symbol, evolutionVariableDetail.symbol) &&
        Objects.equals(this.dataType, evolutionVariableDetail.dataType) &&
        Objects.equals(this.source, evolutionVariableDetail.source) &&
        Objects.equals(this.versionGroup, evolutionVariableDetail.versionGroup) &&
        Objects.equals(this.names, evolutionVariableDetail.names) &&
        Objects.equals(this.descriptions, evolutionVariableDetail.descriptions);
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

