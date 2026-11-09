package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PalParkAreaSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSpeciesPalParkEncounter implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The base score given to the player when the referenced Pokémon is caught during a pal park run.
   */
  @JsonProperty("base_score")
  private Integer baseScore;

  /**
   * The base rate for encountering the referenced Pokémon in this pal park area.
   */
  @JsonProperty("rate")
  private Integer rate;

  /**
   * The pal park area where this encounter happens.
   */
  @JsonProperty("area")
  private PalParkAreaSummary area;

  /**
   * The base score given to the player when the referenced Pokémon is caught during a pal park run.
   * @return baseScore
   */
  public Integer getBaseScore() {
    return baseScore;
  }

  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  /**
   * The base rate for encountering the referenced Pokémon in this pal park area.
   * @return rate
   */
  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  /**
   * The pal park area where this encounter happens.
   * @return area
   */
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
