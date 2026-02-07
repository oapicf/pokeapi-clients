package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.PokedexSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDexEntry   {
  
  private Integer entryNumber;
  private PokedexSummary pokedex;

  public PokemonDexEntry () {

  }

  public PokemonDexEntry (Integer entryNumber, PokedexSummary pokedex) {
    this.entryNumber = entryNumber;
    this.pokedex = pokedex;
  }

    
  @JsonProperty("entry_number")
  public Integer getEntryNumber() {
    return entryNumber;
  }
  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

    
  @JsonProperty("pokedex")
  public PokedexSummary getPokedex() {
    return pokedex;
  }
  public void setPokedex(PokedexSummary pokedex) {
    this.pokedex = pokedex;
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
    return Objects.equals(entryNumber, pokemonDexEntry.entryNumber) &&
        Objects.equals(pokedex, pokemonDexEntry.pokedex);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
