package apimodels;

import apimodels.ItemSummary;
import apimodels.PokemonHeldItemVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonHeldItemSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonHeldItemSummary   {
  @JsonProperty("item")
  @NotNull
@Valid

  private ItemSummary item;

  @JsonProperty("version_details")
  @NotNull
@Valid

  private List<@Valid PokemonHeldItemVersion> versionDetails = new ArrayList<>();

  public PokemonHeldItemSummary item(ItemSummary item) {
    this.item = item;
    return this;
  }

   /**
   * The item the referenced Pokémon holds.
   * @return item
  **/
  public ItemSummary getItem() {
    return item;
  }

  public void setItem(ItemSummary item) {
    this.item = item;
  }

  public PokemonHeldItemSummary versionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
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
  **/
  public List<@Valid PokemonHeldItemVersion> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<@Valid PokemonHeldItemVersion> versionDetails) {
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
    return Objects.equals(item, pokemonHeldItemSummary.item) &&
        Objects.equals(versionDetails, pokemonHeldItemSummary.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, versionDetails);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

