package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EvolutionVariableDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionVariableDetail   {
  private Integer id;
  private String name;
  private String symbol;
  private String dataType;
  private String source;
  private VersionGroupSummary versionGroup;
  private List<@Valid EvolutionVariableName> names = new ArrayList<>();
  private List<@Valid EvolutionVariableDescription> descriptions = new ArrayList<>();

  public EvolutionVariableDetail() {
  }

  @JsonCreator
  public EvolutionVariableDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "symbol") String symbol,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup,
    @JsonProperty(required = true, value = "names") List<@Valid EvolutionVariableName> names,
    @JsonProperty(required = true, value = "descriptions") List<@Valid EvolutionVariableDescription> descriptions
  ) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
    this.versionGroup = versionGroup;
    this.names = names;
    this.descriptions = descriptions;
  }

  /**
   * The identifier for this resource.
   **/
  public EvolutionVariableDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "symbol")
  @NotNull  @Size(max=10)public String getSymbol() {
    return symbol;
  }

  @JsonProperty(required = true, value = "symbol")
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
   @Size(max=20)public String getDataType() {
    return dataType;
  }

  @JsonProperty("data_type")
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
   @Size(max=20)public String getSource() {
    return source;
  }

  @JsonProperty("source")
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
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public EvolutionVariableDetail names(List<@Valid EvolutionVariableName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid EvolutionVariableName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid EvolutionVariableName> names) {
    this.names = names;
  }

  public EvolutionVariableDetail addNamesItem(EvolutionVariableName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public EvolutionVariableDetail removeNamesItem(EvolutionVariableName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   * The description of this resource listed in different languages.
   **/
  public EvolutionVariableDetail descriptions(List<@Valid EvolutionVariableDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")
  @JsonProperty(required = true, value = "descriptions")
  public List<@Valid EvolutionVariableDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty(required = true, value = "descriptions")
  public void setDescriptions(List<@Valid EvolutionVariableDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public EvolutionVariableDetail addDescriptionsItem(EvolutionVariableDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }

    this.descriptions.add(descriptionsItem);
    return this;
  }

  public EvolutionVariableDetail removeDescriptionsItem(EvolutionVariableDescription descriptionsItem) {
    if (descriptionsItem != null && this.descriptions != null) {
      this.descriptions.remove(descriptionsItem);
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
