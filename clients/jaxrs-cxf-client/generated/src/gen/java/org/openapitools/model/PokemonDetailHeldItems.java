package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemDetailHeldByPokemonInnerVersionDetailsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonDetailHeldItems  {
  
  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon item;

  @ApiModelProperty(required = true, value = "")

  private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();
 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  public AbilityDetailPokemonInnerPokemon getItem() {
    return item;
  }

  public void setItem(AbilityDetailPokemonInnerPokemon item) {
    this.item = item;
  }

  public PokemonDetailHeldItems item(AbilityDetailPokemonInnerPokemon item) {
    this.item = item;
    return this;
  }

 /**
   * Get versionDetails
   * @return versionDetails
  **/
  @JsonProperty("version_details")
  public List<ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonDetailHeldItems versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonDetailHeldItems addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
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
    PokemonDetailHeldItems pokemonDetailHeldItems = (PokemonDetailHeldItems) o;
    return Objects.equals(this.item, pokemonDetailHeldItems.item) &&
        Objects.equals(this.versionDetails, pokemonDetailHeldItems.versionDetails);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

