package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonSpeciesDetail_pal_park_encounters_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonSpeciesDetailPalParkEncountersInner   {
  private AbilityDetailPokemonInnerPokemon area;
  private Integer baseScore;
  private Integer rate;

  public PokemonSpeciesDetailPalParkEncountersInner() {
  }

  @JsonCreator
  public PokemonSpeciesDetailPalParkEncountersInner(
    @JsonProperty(required = true, value = "area") AbilityDetailPokemonInnerPokemon area,
    @JsonProperty(required = true, value = "base_score") Integer baseScore,
    @JsonProperty(required = true, value = "rate") Integer rate
  ) {
    this.area = area;
    this.baseScore = baseScore;
    this.rate = rate;
  }

  /**
   **/
  public PokemonSpeciesDetailPalParkEncountersInner area(AbilityDetailPokemonInnerPokemon area) {
    this.area = area;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "area")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getArea() {
    return area;
  }

  @JsonProperty(required = true, value = "area")
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
  @JsonProperty(required = true, value = "base_score")
  @NotNull public Integer getBaseScore() {
    return baseScore;
  }

  @JsonProperty(required = true, value = "base_score")
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
  @JsonProperty(required = true, value = "rate")
  @NotNull public Integer getRate() {
    return rate;
  }

  @JsonProperty(required = true, value = "rate")
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
    return Objects.equals(this.area, pokemonSpeciesDetailPalParkEncountersInner.area) &&
        Objects.equals(this.baseScore, pokemonSpeciesDetailPalParkEncountersInner.baseScore) &&
        Objects.equals(this.rate, pokemonSpeciesDetailPalParkEncountersInner.rate);
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

