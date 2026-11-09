package apimodels;

import apimodels.GenerationSummary;
import apimodels.PokemonAbilityPast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonPastAbility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonPastAbility   {
  @JsonProperty("abilities")
  @NotNull
@Valid

  private List<@Valid PokemonAbilityPast> abilities = new ArrayList<>();

  @JsonProperty("generation")
  @NotNull
@Valid

  private GenerationSummary generation;

  public PokemonPastAbility abilities(List<@Valid PokemonAbilityPast> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokemonPastAbility addAbilitiesItem(PokemonAbilityPast abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

   /**
   * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
   * @return abilities
  **/
  public List<@Valid PokemonAbilityPast> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<@Valid PokemonAbilityPast> abilities) {
    this.abilities = abilities;
  }

  public PokemonPastAbility generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

   /**
   * The last generation in which the referenced pokémon had the listed abilities.
   * @return generation
  **/
  public GenerationSummary getGeneration() {
    return generation;
  }

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
    return Objects.equals(abilities, pokemonPastAbility.abilities) &&
        Objects.equals(generation, pokemonPastAbility.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abilities, generation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

