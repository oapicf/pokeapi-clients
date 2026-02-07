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
 * PokemonDetailHeldItems
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailHeldItems   {
  @JsonProperty("item")
  private AbilityDetailPokemonInnerPokemon item;

  @JsonProperty("version_details")
  
  private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public PokemonDetailHeldItems item(AbilityDetailPokemonInnerPokemon item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   */
  @ApiModelProperty(required = true, value = "")
  public AbilityDetailPokemonInnerPokemon getItem() {
    return item;
  }

  public void setItem(AbilityDetailPokemonInnerPokemon item) {
    this.item = item;
  }

  public PokemonDetailHeldItems versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonDetailHeldItems addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

