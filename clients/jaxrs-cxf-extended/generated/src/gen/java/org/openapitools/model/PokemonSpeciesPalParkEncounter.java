package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PalParkAreaSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesPalParkEncounter  {
  
 /**
  * The base score given to the player when the referenced Pokémon is caught during a pal park run.
  */
  @ApiModelProperty(value = "The base score given to the player when the referenced Pokémon is caught during a pal park run.")
  private Integer baseScore;

 /**
  * The base rate for encountering the referenced Pokémon in this pal park area.
  */
  @ApiModelProperty(required = true, value = "The base rate for encountering the referenced Pokémon in this pal park area.")
  private Integer rate;

 /**
  * The pal park area where this encounter happens.
  */
  @ApiModelProperty(required = true, value = "The pal park area where this encounter happens.")
  @Valid
  private PalParkAreaSummary area;
 /**
  * The base score given to the player when the referenced Pokémon is caught during a pal park run.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return baseScore
  */
  @JsonProperty("base_score")
 @Min(-2147483648) @Max(2147483647)  public Integer getBaseScore() {
    return baseScore;
  }

  /**
   * Sets the <code>baseScore</code> property.
   */
 public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  /**
   * Sets the <code>baseScore</code> property.
   */
  public PokemonSpeciesPalParkEncounter baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

 /**
  * The base rate for encountering the referenced Pokémon in this pal park area.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return rate
  */
  @JsonProperty("rate")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getRate() {
    return rate;
  }

  /**
   * Sets the <code>rate</code> property.
   */
 public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * Sets the <code>rate</code> property.
   */
  public PokemonSpeciesPalParkEncounter rate(Integer rate) {
    this.rate = rate;
    return this;
  }

 /**
  * The pal park area where this encounter happens.
  * @return area
  */
  @JsonProperty("area")
  @NotNull
  public PalParkAreaSummary getArea() {
    return area;
  }

  /**
   * Sets the <code>area</code> property.
   */
 public void setArea(PalParkAreaSummary area) {
    this.area = area;
  }

  /**
   * Sets the <code>area</code> property.
   */
  public PokemonSpeciesPalParkEncounter area(PalParkAreaSummary area) {
    this.area = area;
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
    PokemonSpeciesPalParkEncounter pokemonSpeciesPalParkEncounter = (PokemonSpeciesPalParkEncounter) o;
    return Objects.equals(this.baseScore, pokemonSpeciesPalParkEncounter.baseScore) &&
        Objects.equals(this.rate, pokemonSpeciesPalParkEncounter.rate) &&
        Objects.equals(this.area, pokemonSpeciesPalParkEncounter.area);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseScore, rate, area);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesPalParkEncounter {\n");
    
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
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

