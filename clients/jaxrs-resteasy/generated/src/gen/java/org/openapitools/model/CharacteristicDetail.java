package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CharacteristicDetail   {
  
  private Integer id;
  private Integer geneModulo;
  private List<Integer> possibleValues = new ArrayList<>();
  private StatSummary highestStat;
  private List<@Valid CharacteristicDescription> descriptions = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The remainder of the highest stat/IV divided by 5.
   **/
  
  @ApiModelProperty(required = true, value = "The remainder of the highest stat/IV divided by 5.")
  @JsonProperty("gene_modulo")
  @NotNull
  public Integer getGeneModulo() {
    return geneModulo;
  }
  public void setGeneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
  }

  /**
   * The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
   **/
  
  @ApiModelProperty(required = true, value = "The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.")
  @JsonProperty("possible_values")
  @NotNull
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }
  public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  /**
   * The stat which results in this characteristic.
   **/
  
  @ApiModelProperty(required = true, value = "The stat which results in this characteristic.")
  @JsonProperty("highest_stat")
  @NotNull
  @Valid
  public StatSummary getHighestStat() {
    return highestStat;
  }
  public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  /**
   * The descriptions of this characteristic listed in different languages.
   **/
  
  @ApiModelProperty(required = true, value = "The descriptions of this characteristic listed in different languages.")
  @JsonProperty("descriptions")
  @NotNull
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

