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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CharacteristicDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CharacteristicDetail {

  private Integer id;

  private Integer geneModulo;

  private List<Integer> possibleValues = new ArrayList<>();

  private StatSummary highestStat;

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

  public CharacteristicDetail geneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
    return this;
  }

  /**
   * The remainder of the highest stat/IV divided by 5.
   * @return geneModulo
   */
  @NotNull 
  @Schema(name = "gene_modulo", description = "The remainder of the highest stat/IV divided by 5.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gene_modulo")
  public Integer getGeneModulo() {
    return geneModulo;
  }

  @JsonProperty("gene_modulo")
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
   * The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
   * @return possibleValues
   */
  
  @Schema(name = "possible_values", accessMode = Schema.AccessMode.READ_ONLY, description = "The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("possible_values")
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }

  @JsonProperty("possible_values")
  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  public CharacteristicDetail highestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
    return this;
  }

  /**
   * The stat which results in this characteristic.
   * @return highestStat
   */
  @NotNull @Valid 
  @Schema(name = "highest_stat", description = "The stat which results in this characteristic.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("highest_stat")
  public StatSummary getHighestStat() {
    return highestStat;
  }

  @JsonProperty("highest_stat")
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
   * The descriptions of this characteristic listed in different languages.
   * @return descriptions
   */
  
  @Schema(name = "descriptions", accessMode = Schema.AccessMode.READ_ONLY, description = "The descriptions of this characteristic listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
  public List<@Valid CharacteristicDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty("descriptions")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

