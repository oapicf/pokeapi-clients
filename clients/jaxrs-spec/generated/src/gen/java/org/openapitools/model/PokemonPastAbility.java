package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.PokemonAbilityPast;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonPastAbility")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonPastAbility   {
  private List<@Valid PokemonAbilityPast> abilities = new ArrayList<>();
  private GenerationSummary generation;

  public PokemonPastAbility() {
  }

  @JsonCreator
  public PokemonPastAbility(
    @JsonProperty(required = true, value = "abilities") List<@Valid PokemonAbilityPast> abilities,
    @JsonProperty(required = true, value = "generation") GenerationSummary generation
  ) {
    this.abilities = abilities;
    this.generation = generation;
  }

  /**
   * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
   **/
  public PokemonPastAbility abilities(List<@Valid PokemonAbilityPast> abilities) {
    this.abilities = abilities;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.")
  @JsonProperty(required = true, value = "abilities")
  @NotNull public List<@Valid PokemonAbilityPast> getAbilities() {
    return abilities;
  }

  @JsonProperty(required = true, value = "abilities")
  public void setAbilities(List<@Valid PokemonAbilityPast> abilities) {
    this.abilities = abilities;
  }

  public PokemonPastAbility addAbilitiesItem(PokemonAbilityPast abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }

    this.abilities.add(abilitiesItem);
    return this;
  }

  public PokemonPastAbility removeAbilitiesItem(PokemonAbilityPast abilitiesItem) {
    if (abilitiesItem != null && this.abilities != null) {
      this.abilities.remove(abilitiesItem);
    }

    return this;
  }
  /**
   * The last generation in which the referenced pokémon had the listed abilities.
   **/
  public PokemonPastAbility generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The last generation in which the referenced pokémon had the listed abilities.")
  @JsonProperty(required = true, value = "generation")
  @NotNull @Valid public GenerationSummary getGeneration() {
    return generation;
  }

  @JsonProperty(required = true, value = "generation")
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonPastAbility pokemonPastAbility = (PokemonPastAbility) o;
    return Objects.equals(this.abilities, pokemonPastAbility.abilities) &&
        Objects.equals(this.generation, pokemonPastAbility.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilities, generation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonPastAbility {\n");
    
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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
