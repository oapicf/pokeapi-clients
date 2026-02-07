package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CharacteristicDescription;
import org.openapitools.vertxweb.server.model.StatSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CharacteristicDetail   {
  
  private Integer id;
  private Integer geneModulo;
  private List<Integer> possibleValues = new ArrayList<>();
  private StatSummary highestStat;
  private List<CharacteristicDescription> descriptions = new ArrayList<>();

  public CharacteristicDetail () {

  }

  public CharacteristicDetail (Integer id, Integer geneModulo, List<Integer> possibleValues, StatSummary highestStat, List<CharacteristicDescription> descriptions) {
    this.id = id;
    this.geneModulo = geneModulo;
    this.possibleValues = possibleValues;
    this.highestStat = highestStat;
    this.descriptions = descriptions;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("gene_modulo")
  public Integer getGeneModulo() {
    return geneModulo;
  }
  public void setGeneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
  }

    
  @JsonProperty("possible_values")
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }
  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

    
  @JsonProperty("highest_stat")
  public StatSummary getHighestStat() {
    return highestStat;
  }
  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

    
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
