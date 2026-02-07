package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpeciesDetailVarietiesInner   {
  
  private Boolean isDefault;
  private AbilityDetailPokemonInnerPokemon pokemon;

  public PokemonSpeciesDetailVarietiesInner () {

  }

  public PokemonSpeciesDetailVarietiesInner (Boolean isDefault, AbilityDetailPokemonInnerPokemon pokemon) {
    this.isDefault = isDefault;
    this.pokemon = pokemon;
  }

    
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

    
  @JsonProperty("pokemon")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }
  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesDetailVarietiesInner pokemonSpeciesDetailVarietiesInner = (PokemonSpeciesDetailVarietiesInner) o;
    return Objects.equals(isDefault, pokemonSpeciesDetailVarietiesInner.isDefault) &&
        Objects.equals(pokemon, pokemonSpeciesDetailVarietiesInner.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailVarietiesInner {\n");
    
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
