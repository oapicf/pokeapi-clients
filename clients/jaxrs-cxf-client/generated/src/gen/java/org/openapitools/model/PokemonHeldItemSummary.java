package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.PokemonHeldItemVersion;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonHeldItemSummary  {
  
 /**
  * The item the referenced Pokémon holds.
  */
  @ApiModelProperty(required = true, value = "The item the referenced Pokémon holds.")

  private ItemSummary item;

 /**
  * The details of the different versions in which the item is held.
  */
  @ApiModelProperty(required = true, value = "The details of the different versions in which the item is held.")

  private List<PokemonHeldItemVersion> versionDetails = new ArrayList<>();
 /**
   * The item the referenced Pokémon holds.
   * @return item
  **/
  @JsonProperty("item")
  public ItemSummary getItem() {
    return item;
  }

  public void setItem(ItemSummary item) {
    this.item = item;
  }

  public PokemonHeldItemSummary item(ItemSummary item) {
    this.item = item;
    return this;
  }

 /**
   * The details of the different versions in which the item is held.
   * @return versionDetails
  **/
  @JsonProperty("version_details")
  public List<PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
  }

  public PokemonHeldItemSummary versionDetails(List<PokemonHeldItemVersion> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public PokemonHeldItemSummary addVersionDetailsItem(PokemonHeldItemVersion versionDetailsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

