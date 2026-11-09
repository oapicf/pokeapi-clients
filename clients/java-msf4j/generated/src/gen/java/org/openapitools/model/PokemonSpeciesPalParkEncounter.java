package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PalParkAreaSummary;

/**
 * PokemonSpeciesPalParkEncounter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpeciesPalParkEncounter   {
  @JsonProperty("base_score")
  private Integer baseScore;

  @JsonProperty("rate")
  private Integer rate;

  @JsonProperty("area")
  private PalParkAreaSummary area;

  public PokemonSpeciesPalParkEncounter baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

   /**
   * The base score given to the player when the referenced Pokémon is caught during a pal park run.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return baseScore
  **/
  @ApiModelProperty(value = "The base score given to the player when the referenced Pokémon is caught during a pal park run.")
  public Integer getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  public PokemonSpeciesPalParkEncounter rate(Integer rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The base rate for encountering the referenced Pokémon in this pal park area.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "The base rate for encountering the referenced Pokémon in this pal park area.")
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public PokemonSpeciesPalParkEncounter area(PalParkAreaSummary area) {
    this.area = area;
    return this;
  }

   /**
   * The pal park area where this encounter happens.
   * @return area
  **/
  @ApiModelProperty(required = true, value = "The pal park area where this encounter happens.")
  public PalParkAreaSummary getArea() {
    return area;
  }

  public void setArea(PalParkAreaSummary area) {
    this.area = area;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

