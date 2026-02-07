package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CharacteristicDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private Integer geneModulo;

  @ApiModelProperty(required = true, value = "")

  private List<Integer> possibleValues = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private StatSummary highestStat;

  @ApiModelProperty(required = true, value = "")

  private List<CharacteristicDescription> descriptions = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get geneModulo
   * @return geneModulo
  **/
  @JsonProperty("gene_modulo")
  public Integer getGeneModulo() {
    return geneModulo;
  }

  public void setGeneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
  }

  public CharacteristicDetail geneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
    return this;
  }

 /**
   * Get possibleValues
   * @return possibleValues
  **/
  @JsonProperty("possible_values")
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }

  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  public CharacteristicDetail possibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
    return this;
  }

  public CharacteristicDetail addPossibleValuesItem(Integer possibleValuesItem) {
    this.possibleValues.add(possibleValuesItem);
    return this;
  }

 /**
   * Get highestStat
   * @return highestStat
  **/
  @JsonProperty("highest_stat")
  public StatSummary getHighestStat() {
    return highestStat;
  }

  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  public CharacteristicDetail highestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
    return this;
  }

 /**
   * Get descriptions
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<CharacteristicDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public CharacteristicDetail descriptions(List<CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public CharacteristicDetail addDescriptionsItem(CharacteristicDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

