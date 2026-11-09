package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ItemSummary;
import com.prokarma.pkmst.model.PokemonHeldItemVersion;
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
 * PokemonHeldItemSummary
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonHeldItemSummary   {
  @JsonProperty("item")
  private ItemSummary item;

  @JsonProperty("version_details")
  
  private List<PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  public PokemonHeldItemSummary item(ItemSummary item) {
    this.item = item;
    return this;
  }

  /**
   * The item the referenced Pokémon holds.
   * @return item
   */
  @ApiModelProperty(required = true, value = "The item the referenced Pokémon holds.")
  public ItemSummary getItem() {
    return item;
  }

  public void setItem(ItemSummary item) {
    this.item = item;
  }

  public PokemonHeldItemSummary versionDetails(List<PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonHeldItemSummary addVersionDetailsItem(PokemonHeldItemVersion versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * The details of the different versions in which the item is held.
   * @return versionDetails
   */
  @ApiModelProperty(required = true, value = "The details of the different versions in which the item is held.")
  public List<PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
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
    PokemonHeldItemSummary pokemonHeldItemSummary = (PokemonHeldItemSummary) o;
    return Objects.equals(this.item, pokemonHeldItemSummary.item) &&
        Objects.equals(this.versionDetails, pokemonHeldItemSummary.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonHeldItemSummary {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

