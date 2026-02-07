package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetailPalParkEncountersInner   {
  @JsonProperty("area")
  private AbilityDetailPokemonInnerPokemon area;

  @JsonProperty("base_score")
  private Integer baseScore;

  @JsonProperty("rate")
  private Integer rate;

  /**
   **/
  public PokemonSpeciesDetailPalParkEncountersInner area(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("area")
  public AbilityDetailPokemonInnerPokemon getArea() {
    return area;
  }
  public void setArea(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
  }

  /**
   **/
  public PokemonSpeciesDetailPalParkEncountersInner baseScore(Integer baseScore) {
    this.baseScore = baseScore;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("base_score")
  public Integer getBaseScore() {
    return baseScore;
  }
  public void setBaseScore(Integer baseScore) {
    this.baseScore = baseScore;
  }

  /**
   **/
  public PokemonSpeciesDetailPalParkEncountersInner rate(Integer rate) {
    this.rate = rate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rate")
  public Integer getRate() {
    return rate;
  }
  public void setRate(Integer rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesDetailPalParkEncountersInner pokemonSpeciesDetailPalParkEncountersInner = (PokemonSpeciesDetailPalParkEncountersInner) o;
    return Objects.equals(area, pokemonSpeciesDetailPalParkEncountersInner.area) &&
        Objects.equals(baseScore, pokemonSpeciesDetailPalParkEncountersInner.baseScore) &&
        Objects.equals(rate, pokemonSpeciesDetailPalParkEncountersInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, baseScore, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailPalParkEncountersInner {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

