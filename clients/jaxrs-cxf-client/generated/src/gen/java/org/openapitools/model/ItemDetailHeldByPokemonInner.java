package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemDetailHeldByPokemonInnerVersionDetailsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemDetailHeldByPokemonInner  {
  
  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon pokemon;

  @ApiModelProperty(required = true, value = "")

  private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();
 /**
   * Get pokemon
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  public ItemDetailHeldByPokemonInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

 /**
   * Get versionDetails
   * @return versionDetails
  **/
  @JsonProperty("version-details")
  public List<ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public ItemDetailHeldByPokemonInner versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public ItemDetailHeldByPokemonInner addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
    this.versionDetails.add(versionDetailsItem);
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
    ItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner = (ItemDetailHeldByPokemonInner) o;
    return Objects.equals(this.pokemon, itemDetailHeldByPokemonInner.pokemon) &&
        Objects.equals(this.versionDetails, itemDetailHeldByPokemonInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokemon, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailHeldByPokemonInner {\n");
    
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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

