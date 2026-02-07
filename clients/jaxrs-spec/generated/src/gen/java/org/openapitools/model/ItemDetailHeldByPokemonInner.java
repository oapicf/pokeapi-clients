package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemDetailHeldByPokemonInnerVersionDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ItemDetail_held_by_pokemon_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetailHeldByPokemonInner   {
  private AbilityDetailPokemonInnerPokemon pokemon;
  private @Valid List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public ItemDetailHeldByPokemonInner() {
  }

  @JsonCreator
  public ItemDetailHeldByPokemonInner(
    @JsonProperty(required = true, value = "pokemon") AbilityDetailPokemonInnerPokemon pokemon,
    @JsonProperty(required = true, value = "version-details") List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails
  ) {
    this.pokemon = pokemon;
    this.versionDetails = versionDetails;
  }

  /**
   **/
  public ItemDetailHeldByPokemonInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokemon")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  @JsonProperty(required = true, value = "pokemon")
  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  /**
   **/
  public ItemDetailHeldByPokemonInner versionDetails(List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version-details")
  @NotNull @Valid public List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  @JsonProperty(required = true, value = "version-details")
  public void setVersionDetails(List<@Valid ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public ItemDetailHeldByPokemonInner addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }

    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  public ItemDetailHeldByPokemonInner removeVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
    if (versionDetailsItem != null && this.versionDetails != null) {
      this.versionDetails.remove(versionDetailsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

