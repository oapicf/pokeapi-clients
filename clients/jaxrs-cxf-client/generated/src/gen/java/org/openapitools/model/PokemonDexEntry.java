package org.openapitools.model;

import org.openapitools.model.PokedexSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDexEntry  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer entryNumber;

  @ApiModelProperty(required = true, value = "")

  private PokedexSummary pokedex;
 /**
   * Get entryNumber
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
   * Get pokedex
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

