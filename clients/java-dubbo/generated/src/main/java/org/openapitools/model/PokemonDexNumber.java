package org.openapitools.model;

import org.openapitools.model.PokemonSpeciesSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonDexNumber implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The index of this Pokémon species entry within the Pokédex.
   */
  @JsonProperty("entry_number")
  private Integer entryNumber;

  /**
   * The Pokémon species being encountered.
   */
  @JsonProperty("pokemon_species")
  private PokemonSpeciesSummary pokemonSpecies;

  /**
   * The index of this Pokémon species entry within the Pokédex.
   * @return entryNumber
   */
  public Integer getEntryNumber() {
    return entryNumber;
  }

  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  /**
   * The Pokémon species being encountered.
   * @return pokemonSpecies
   */
  public PokemonSpeciesSummary getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(PokemonSpeciesSummary pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDexNumber pokemonDexNumber = (PokemonDexNumber) o;
    return Objects.equals(this.entryNumber, pokemonDexNumber.entryNumber) &&
        Objects.equals(this.pokemonSpecies, pokemonDexNumber.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryNumber, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDexNumber {\n");
    
    sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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
