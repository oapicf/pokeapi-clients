package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CharacteristicDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CharacteristicDetail   {
  private Integer id;
  private Integer geneModulo;
  private @Valid List<Integer> possibleValues = new ArrayList<>();
  private StatSummary highestStat;
  private @Valid List<@Valid CharacteristicDescription> descriptions = new ArrayList<>();

  public CharacteristicDetail() {
  }

  @JsonCreator
  public CharacteristicDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "gene_modulo") Integer geneModulo,
    @JsonProperty(required = true, value = "possible_values") List<Integer> possibleValues,
    @JsonProperty(required = true, value = "highest_stat") StatSummary highestStat,
    @JsonProperty(required = true, value = "descriptions") List<@Valid CharacteristicDescription> descriptions
  ) {
    this.id = id;
    this.geneModulo = geneModulo;
    this.possibleValues = possibleValues;
    this.highestStat = highestStat;
    this.descriptions = descriptions;
  }

  /**
   **/
  public CharacteristicDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "gene_modulo")
  @NotNull public Integer getGeneModulo() {
    return geneModulo;
  }

  @JsonProperty(required = true, value = "gene_modulo")
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
  @JsonProperty(required = true, value = "possible_values")
  @NotNull public List<Integer> getPossibleValues() {
    return possibleValues;
  }

  @JsonProperty(required = true, value = "possible_values")
  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  public CharacteristicDetail addPossibleValuesItem(Integer possibleValuesItem) {
    if (this.possibleValues == null) {
      this.possibleValues = new ArrayList<>();
    }

    this.possibleValues.add(possibleValuesItem);
    return this;
  }

  public CharacteristicDetail removePossibleValuesItem(Integer possibleValuesItem) {
    if (possibleValuesItem != null && this.possibleValues != null) {
      this.possibleValues.remove(possibleValuesItem);
    }

    return this;
  }
  /**
   **/
  public CharacteristicDetail highestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "highest_stat")
  @NotNull @Valid public StatSummary getHighestStat() {
    return highestStat;
  }

  @JsonProperty(required = true, value = "highest_stat")
  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  /**
   **/
  public CharacteristicDetail descriptions(List<@Valid CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "descriptions")
  @NotNull @Valid public List<@Valid CharacteristicDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty(required = true, value = "descriptions")
  public void setDescriptions(List<@Valid CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public CharacteristicDetail addDescriptionsItem(CharacteristicDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }

    this.descriptions.add(descriptionsItem);
    return this;
  }

  public CharacteristicDetail removeDescriptionsItem(CharacteristicDescription descriptionsItem) {
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

