package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T15:22:50.575598517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CharacteristicDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("gene_modulo")
  private Integer geneModulo;

  @JsonProperty("possible_values")
  private List<Integer> possibleValues = new ArrayList<>();

  @JsonProperty("highest_stat")
  private StatSummary highestStat;

  @JsonProperty("descriptions")
  private List<CharacteristicDescription> descriptions = new ArrayList<>();

  /**
   **/
  public CharacteristicDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public CharacteristicDetail geneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("gene_modulo")
  public Integer getGeneModulo() {
    return geneModulo;
  }
  public void setGeneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
  }

  /**
   **/
  public CharacteristicDetail possibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("possible_values")
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }
  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  /**
   **/
  public CharacteristicDetail highestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("highest_stat")
  public StatSummary getHighestStat() {
    return highestStat;
  }
  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  /**
   **/
  public CharacteristicDetail descriptions(List<CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("descriptions")
  public List<CharacteristicDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<CharacteristicDescription> descriptions) {
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
    CharacteristicDetail characteristicDetail = (CharacteristicDetail) o;
    return Objects.equals(id, characteristicDetail.id) &&
        Objects.equals(geneModulo, characteristicDetail.geneModulo) &&
        Objects.equals(possibleValues, characteristicDetail.possibleValues) &&
        Objects.equals(highestStat, characteristicDetail.highestStat) &&
        Objects.equals(descriptions, characteristicDetail.descriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, geneModulo, possibleValues, highestStat, descriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    geneModulo: ").append(toIndentedString(geneModulo)).append("\n");
    sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
    sb.append("    highestStat: ").append(toIndentedString(highestStat)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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

