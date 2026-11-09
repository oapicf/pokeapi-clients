package org.openapitools.model;

import org.openapitools.model.PokedexSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDexEntry  {
  
 /**
  * The index number within the Pokédex.
  */
  @ApiModelProperty(required = true, value = "The index number within the Pokédex.")

  private Integer entryNumber;

 /**
  * The Pokédex the referenced Pokémon species can be found in.
  */
  @ApiModelProperty(required = true, value = "The Pokédex the referenced Pokémon species can be found in.")

  private PokedexSummary pokedex;
 /**
   * The index number within the Pokédex.
   * @return entryNumber
  **/
  @JsonProperty("entry_number")
  public Integer getEntryNumber() {
    return entryNumber;
  }

  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  public PokemonDexEntry entryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

 /**
   * The Pokédex the referenced Pokémon species can be found in.
   * @return pokedex
  **/
  @JsonProperty("pokedex")
  public PokedexSummary getPokedex() {
    return pokedex;
  }

  public void setPokedex(PokedexSummary pokedex) {
    this.pokedex = pokedex;
  }

  public PokemonDexEntry pokedex(PokedexSummary pokedex) {
    this.pokedex = pokedex;
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
    PokemonDexEntry pokemonDexEntry = (PokemonDexEntry) o;
    return Objects.equals(this.entryNumber, pokemonDexEntry.entryNumber) &&
        Objects.equals(this.pokedex, pokemonDexEntry.pokedex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryNumber, pokedex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDexEntry {\n");
    
    sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
    sb.append("    pokedex: ").append(toIndentedString(pokedex)).append("\n");
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

