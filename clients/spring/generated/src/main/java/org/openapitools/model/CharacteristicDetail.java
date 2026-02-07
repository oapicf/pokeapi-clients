package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CharacteristicDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CharacteristicDetail {

  private Integer id;

  private Integer geneModulo;

  @Valid
  private List<Integer> possibleValues = new ArrayList<>();

  private StatSummary highestStat;

  @Valid
  private List<@Valid CharacteristicDescription> descriptions = new ArrayList<>();

  public CharacteristicDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicDetail(Integer id, Integer geneModulo, List<Integer> possibleValues, StatSummary highestStat, List<@Valid CharacteristicDescription> descriptions) {
    this.id = id;
    this.geneModulo = geneModulo;
    this.possibleValues = possibleValues;
    this.highestStat = highestStat;
    this.descriptions = descriptions;
  }

  public CharacteristicDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  @NotNull 
  @Schema(name = "gene_modulo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gene_modulo")
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
  @NotNull 
  @Schema(name = "possible_values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("possible_values")
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
  @NotNull @Valid 
  @Schema(name = "highest_stat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("highest_stat")
  public StatSummary getHighestStat() {
    return highestStat;
  }

  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  public CharacteristicDetail descriptions(List<@Valid CharacteristicDescription> descriptions) {
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
  @NotNull @Valid 
  @Schema(name = "descriptions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
  public List<@Valid CharacteristicDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid CharacteristicDescription> descriptions) {
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

