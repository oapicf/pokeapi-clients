package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import com.prokarma.pkmst.model.ItemDetailHeldByPokemonInnerVersionDetailsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ItemDetailHeldByPokemonInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetailHeldByPokemonInner   {
  @JsonProperty("pokemon")
  private AbilityDetailPokemonInnerPokemon pokemon;

  @JsonProperty("version-details")
  
  private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public ItemDetailHeldByPokemonInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * Get pokemon
   * @return pokemon
   */
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  public ItemDetailHeldByPokemonInner versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public ItemDetailHeldByPokemonInner addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * Get versionDetails
   * @return versionDetails
   */
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

