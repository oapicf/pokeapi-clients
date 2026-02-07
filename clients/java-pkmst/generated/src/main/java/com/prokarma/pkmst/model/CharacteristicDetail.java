package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CharacteristicDescription;
import com.prokarma.pkmst.model.StatSummary;
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
 * CharacteristicDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  public CharacteristicDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CharacteristicDetail geneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
    return this;
  }

  /**
   * Get geneModulo
   * @return geneModulo
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getGeneModulo() {
    return geneModulo;
  }

  public void setGeneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
  }

  public CharacteristicDetail possibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
    return this;
  }

  public CharacteristicDetail addPossibleValuesItem(Integer possibleValuesItem) {
    if (this.possibleValues == null) {
      this.possibleValues = new ArrayList<>();
    }
    this.possibleValues.add(possibleValuesItem);
    return this;
  }

  /**
   * Get possibleValues
   * @return possibleValues
   */
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }

  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  public CharacteristicDetail highestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
    return this;
  }

  /**
   * Get highestStat
   * @return highestStat
   */
  @ApiModelProperty(required = true, value = "")
  public StatSummary getHighestStat() {
    return highestStat;
  }

  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  public CharacteristicDetail descriptions(List<CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public CharacteristicDetail addDescriptionsItem(CharacteristicDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

  /**
   * Get descriptions
   * @return descriptions
   */
  @ApiModelProperty(required = true, value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

