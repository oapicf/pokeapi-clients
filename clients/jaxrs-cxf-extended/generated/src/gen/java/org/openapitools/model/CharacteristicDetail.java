package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CharacteristicDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  private Integer id;

 /**
  * The remainder of the highest stat/IV divided by 5.
  */
  @ApiModelProperty(required = true, value = "The remainder of the highest stat/IV divided by 5.")
  private Integer geneModulo;

 /**
  * The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
  */
  @ApiModelProperty(required = true, value = "The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.")
  private List<Integer> possibleValues = new ArrayList<>();

 /**
  * The stat which results in this characteristic.
  */
  @ApiModelProperty(required = true, value = "The stat which results in this characteristic.")
  @Valid
  private StatSummary highestStat;

 /**
  * The descriptions of this characteristic listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The descriptions of this characteristic listed in different languages.")
  private List<@Valid CharacteristicDescription> descriptions = new ArrayList<>();
 /**
  * The identifier for this resource.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CharacteristicDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * The remainder of the highest stat/IV divided by 5.
  * @return geneModulo
  */
  @JsonProperty("gene_modulo")
  @NotNull
  public Integer getGeneModulo() {
    return geneModulo;
  }

  /**
   * Sets the <code>geneModulo</code> property.
   */
 public void setGeneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
  }

  /**
   * Sets the <code>geneModulo</code> property.
   */
  public CharacteristicDetail geneModulo(Integer geneModulo) {
    this.geneModulo = geneModulo;
    return this;
  }

 /**
  * The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
  * @return possibleValues
  */
  @JsonProperty("possible_values")
  @NotNull
  public List<Integer> getPossibleValues() {
    return possibleValues;
  }

  /**
   * Sets the <code>possibleValues</code> property.
   * <br><em>N.B. <code>possibleValues</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPossibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
  }

  /**
   * Sets the <code>possibleValues</code> property.
   * <br><em>N.B. <code>possibleValues</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CharacteristicDetail possibleValues(List<Integer> possibleValues) {
    this.possibleValues = possibleValues;
    return this;
  }

  /**
   * Adds a new item to the <code>possibleValues</code> list.
   * <br><em>N.B. <code>possibleValues</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CharacteristicDetail addPossibleValuesItem(Integer possibleValuesItem) {
    this.possibleValues.add(possibleValuesItem);
    return this;
  }

 /**
  * The stat which results in this characteristic.
  * @return highestStat
  */
  @JsonProperty("highest_stat")
  @NotNull
  public StatSummary getHighestStat() {
    return highestStat;
  }

  /**
   * Sets the <code>highestStat</code> property.
   */
 public void setHighestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
  }

  /**
   * Sets the <code>highestStat</code> property.
   */
  public CharacteristicDetail highestStat(StatSummary highestStat) {
    this.highestStat = highestStat;
    return this;
  }

 /**
  * The descriptions of this characteristic listed in different languages.
  * @return descriptions
  */
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid CharacteristicDescription> getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   * <br><em>N.B. <code>descriptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setDescriptions(List<@Valid CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   * <br><em>N.B. <code>descriptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CharacteristicDetail descriptions(List<@Valid CharacteristicDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Adds a new item to the <code>descriptions</code> list.
   * <br><em>N.B. <code>descriptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

