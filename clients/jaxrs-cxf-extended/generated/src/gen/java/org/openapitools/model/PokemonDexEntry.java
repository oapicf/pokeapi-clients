package org.openapitools.model;

import org.openapitools.model.PokedexSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDexEntry  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer entryNumber;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokedexSummary pokedex;
 /**
  * Get entryNumber
  * @return entryNumber
  */
  @JsonProperty("entry_number")
  @NotNull
  public Integer getEntryNumber() {
    return entryNumber;
  }

  /**
   * Sets the <code>entryNumber</code> property.
   */
 public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  /**
   * Sets the <code>entryNumber</code> property.
   */
  public PokemonDexEntry entryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

 /**
  * Get pokedex
  * @return pokedex
  */
  @JsonProperty("pokedex")
  @NotNull
  public PokedexSummary getPokedex() {
    return pokedex;
  }

  /**
   * Sets the <code>pokedex</code> property.
   */
 public void setPokedex(PokedexSummary pokedex) {
    this.pokedex = pokedex;
  }

  /**
   * Sets the <code>pokedex</code> property.
   */
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

