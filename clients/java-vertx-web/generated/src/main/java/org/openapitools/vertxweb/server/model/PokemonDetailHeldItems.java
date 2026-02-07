package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.ItemDetailHeldByPokemonInnerVersionDetailsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonDetailHeldItems   {
  
  private AbilityDetailPokemonInnerPokemon item;
  private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public PokemonDetailHeldItems () {

  }

  public PokemonDetailHeldItems (AbilityDetailPokemonInnerPokemon item, List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.item = item;
    this.versionDetails = versionDetails;
  }

    
  @JsonProperty("item")
  public AbilityDetailPokemonInnerPokemon getItem() {
    return item;
  }
  public void setItem(AbilityDetailPokemonInnerPokemon item) {
    this.item = item;
  }

    
  @JsonProperty("version_details")
  public List<ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }
  public void setVersionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDetailHeldItems pokemonDetailHeldItems = (PokemonDetailHeldItems) o;
    return Objects.equals(item, pokemonDetailHeldItems.item) &&
        Objects.equals(versionDetails, pokemonDetailHeldItems.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailHeldItems {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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
