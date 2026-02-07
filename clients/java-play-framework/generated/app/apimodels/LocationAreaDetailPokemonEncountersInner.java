package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * LocationAreaDetailPokemonEncountersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocationAreaDetailPokemonEncountersInner   {
  @JsonProperty("pokemon")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon pokemon;

  @JsonProperty("version_details")
  @NotNull
@Valid

  private List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails = new ArrayList<>();

  public LocationAreaDetailPokemonEncountersInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

   /**
   * Get pokemon
   * @return pokemon
  **/
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  public LocationAreaDetailPokemonEncountersInner versionDetails(List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public LocationAreaDetailPokemonEncountersInner addVersionDetailsItem(LocationAreaDetailPokemonEncountersInnerVersionDetailsInner versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

   /**
   * Get versionDetails
   * @return versionDetails
  **/
  public List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<@Valid LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> versionDetails) {
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
    LocationAreaDetailPokemonEncountersInner locationAreaDetailPokemonEncountersInner = (LocationAreaDetailPokemonEncountersInner) o;
    return Objects.equals(pokemon, locationAreaDetailPokemonEncountersInner.pokemon) &&
        Objects.equals(versionDetails, locationAreaDetailPokemonEncountersInner.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pokemon, versionDetails);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAreaDetailPokemonEncountersInner {\n");
    
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

