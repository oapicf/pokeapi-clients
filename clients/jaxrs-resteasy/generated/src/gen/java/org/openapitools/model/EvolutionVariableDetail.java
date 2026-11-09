package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionVariableDetail   {
  
  private Integer id;
  private String name;
  private String symbol;
  private String dataType;
  private String source;
  private VersionGroupSummary versionGroup;
  private List<@Valid EvolutionVariableName> names = new ArrayList<>();
  private List<@Valid EvolutionVariableDescription> descriptions = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The symbol used for this variable in evolution condition expressions.
   **/
  
  @ApiModelProperty(required = true, value = "The symbol used for this variable in evolution condition expressions.")
  @JsonProperty("symbol")
  @NotNull
 @Size(max=10)  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * The data type of this variable.
   **/
  
  @ApiModelProperty(value = "The data type of this variable.")
  @JsonProperty("data_type")
 @Size(max=20)  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  /**
   * The source of the variable value.
   **/
  
  @ApiModelProperty(value = "The source of the variable value.")
  @JsonProperty("source")
 @Size(max=20)  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The version group in which this variable was introduced.
   **/
  
  @ApiModelProperty(required = true, value = "The version group in which this variable was introduced.")
  @JsonProperty("version_group")
  @NotNull
  @Valid
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  @NotNull
  public List<@Valid EvolutionVariableName> getNames() {
    return names;
  }
  public void setNames(List<@Valid EvolutionVariableName> names) {
    this.names = names;
  }

  /**
   * The description of this resource listed in different languages.
   **/
  
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")
  @JsonProperty("descriptions")
  @NotNull
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

