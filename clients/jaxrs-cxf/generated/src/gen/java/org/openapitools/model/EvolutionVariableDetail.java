package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EvolutionVariableDescription;
import org.openapitools.model.EvolutionVariableName;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionVariableDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The symbol used for this variable in evolution condition expressions.
  */
  @ApiModelProperty(required = true, value = "The symbol used for this variable in evolution condition expressions.")

  private String symbol;

 /**
  * The data type of this variable.
  */
  @ApiModelProperty(value = "The data type of this variable.")

  private String dataType;

 /**
  * The source of the variable value.
  */
  @ApiModelProperty(value = "The source of the variable value.")

  private String source;

 /**
  * The version group in which this variable was introduced.
  */
  @ApiModelProperty(required = true, value = "The version group in which this variable was introduced.")

  @Valid

  private VersionGroupSummary versionGroup;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<@Valid EvolutionVariableName> names = new ArrayList<>();

 /**
  * The description of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")

  private List<@Valid EvolutionVariableDescription> descriptions = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EvolutionVariableDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The symbol used for this variable in evolution condition expressions.
   * @return symbol
  **/
  @JsonProperty("symbol")
  @NotNull
 @Size(max=10)  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public EvolutionVariableDetail symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

 /**
   * The data type of this variable.
   * @return dataType
  **/
  @JsonProperty("data_type")
 @Size(max=20)  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public EvolutionVariableDetail dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

 /**
   * The source of the variable value.
   * @return source
  **/
  @JsonProperty("source")
 @Size(max=20)  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public EvolutionVariableDetail source(String source) {
    this.source = source;
    return this;
  }

 /**
   * The version group in which this variable was introduced.
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public EvolutionVariableDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid EvolutionVariableName> getNames() {
    return names;
  }


 /**
   * The description of this resource listed in different languages.
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid EvolutionVariableDescription> getDescriptions() {
    return descriptions;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

