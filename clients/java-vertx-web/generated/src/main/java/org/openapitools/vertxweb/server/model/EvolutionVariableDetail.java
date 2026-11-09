package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EvolutionVariableDescription;
import org.openapitools.vertxweb.server.model.EvolutionVariableName;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionVariableDetail   {
  
  private Integer id;
  private String name;
  private String symbol;
  private String dataType;
  private String source;
  private VersionGroupSummary versionGroup;
  private List<EvolutionVariableName> names = new ArrayList<>();
  private List<EvolutionVariableDescription> descriptions = new ArrayList<>();

  public EvolutionVariableDetail () {

  }

  public EvolutionVariableDetail (Integer id, String name, String symbol, String dataType, String source, VersionGroupSummary versionGroup, List<EvolutionVariableName> names, List<EvolutionVariableDescription> descriptions) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
    this.dataType = dataType;
    this.source = source;
    this.versionGroup = versionGroup;
    this.names = names;
    this.descriptions = descriptions;
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

    
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

    
  @JsonProperty("data_type")
  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

    
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

    
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("names")
  public List<EvolutionVariableName> getNames() {
    return names;
  }
  public void setNames(List<EvolutionVariableName> names) {
    this.names = names;
  }

    
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
