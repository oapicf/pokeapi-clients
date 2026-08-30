package org.openapitools.model;

import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CharacteristicDetail implements Serializable {
  private static final long serialVersionUID = 1L;

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
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return geneModulo
   */
  public Integer getGeneModulo() {
    return geneModulo;
  }

  public void setGeneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
  }

  /**
   * 
   * @return possibleValues
   */
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }

  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  /**
   * 
   * @return highestStat
   */
  public StatSummary getHighestStat() {
    return highestStat;
  }

  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  /**
   * 
   * @return descriptions
   */
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
    return Objects.equals(this.id, characteristicDetail.id) &&
        Objects.equals(this.geneModulo, characteristicDetail.geneModulo) &&
        Objects.equals(this.possibleValues, characteristicDetail.possibleValues) &&
        Objects.equals(this.highestStat, characteristicDetail.highestStat) &&
        Objects.equals(this.descriptions, characteristicDetail.descriptions);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
