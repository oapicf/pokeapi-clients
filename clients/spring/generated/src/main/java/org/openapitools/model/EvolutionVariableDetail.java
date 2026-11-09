package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EvolutionVariableDescription;
import org.openapitools.model.EvolutionVariableName;
import org.openapitools.model.VersionGroupSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EvolutionVariableDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionVariableDetail {

  private Integer id;

  private String name;

  private String symbol;

  private @Nullable String dataType;

  private @Nullable String source;

  private VersionGroupSummary versionGroup;

  private List<@Valid EvolutionVariableName> names = new ArrayList<>();

  private List<@Valid EvolutionVariableDescription> descriptions = new ArrayList<>();

  public EvolutionVariableDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionVariableDetail(Integer id, String name, String symbol, VersionGroupSummary versionGroup, List<@Valid EvolutionVariableName> names, List<@Valid EvolutionVariableDescription> descriptions) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
    this.versionGroup = versionGroup;
    this.names = names;
    this.descriptions = descriptions;
  }

  public EvolutionVariableDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
  @NotNull @Size(max = 10) 
  @Schema(name = "symbol", description = "The symbol used for this variable in evolution condition expressions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }

  @JsonProperty("symbol")
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public EvolutionVariableDetail dataType(@Nullable String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The data type of this variable.
   * @return dataType
   */
  @Size(max = 20) 
  @Schema(name = "data_type", description = "The data type of this variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_type")
  public @Nullable String getDataType() {
    return dataType;
  }

  @JsonProperty("data_type")
  public void setDataType(@Nullable String dataType) {
    this.dataType = dataType;
  }

  public EvolutionVariableDetail source(@Nullable String source) {
    this.source = source;
    return this;
  }

  /**
   * The source of the variable value.
   * @return source
   */
  @Size(max = 20) 
  @Schema(name = "source", description = "The source of the variable value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public @Nullable String getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(@Nullable String source) {
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
  @NotNull @Valid 
  @Schema(name = "version_group", description = "The version group in which this variable was introduced.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty("version_group")
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
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid EvolutionVariableName> getNames() {
    return names;
  }

  @JsonProperty("names")
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
   */
  
  @Schema(name = "descriptions", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
  public List<@Valid EvolutionVariableDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty("descriptions")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

