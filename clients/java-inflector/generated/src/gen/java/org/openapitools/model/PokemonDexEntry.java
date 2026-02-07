package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokedexSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDexEntry   {
  @JsonProperty("entry_number")
  private Integer entryNumber;

  @JsonProperty("pokedex")
  private PokedexSummary pokedex;

  /**
   **/
  public PokemonDexEntry entryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("entry_number")
  public Integer getEntryNumber() {
    return entryNumber;
  }
  public void setEntryNumber(Integer entryNumber) {
    this.entryNumber = entryNumber;
  }

  /**
   **/
  public PokemonDexEntry pokedex(PokedexSummary pokedex) {
    this.pokedex = pokedex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

