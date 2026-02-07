package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemDetailHeldByPokemonInnerVersionDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ItemDetailHeldByPokemonInnerVersionDetailsInner   {
  @JsonProperty("rarity")
  @NotNull

  private Integer rarity;

  @JsonProperty("version")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon version;

  public ItemDetailHeldByPokemonInnerVersionDetailsInner rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

   /**
   * Get rarity
   * @return rarity
  **/
  public Integer getRarity() {
    return rarity;
  }

  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

  public ItemDetailHeldByPokemonInnerVersionDetailsInner version(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  public AbilityDetailPokemonInnerPokemon getVersion() {
    return version;
  }

  public void setVersion(AbilityDetailPokemonInnerPokemon version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetailHeldByPokemonInnerVersionDetailsInner itemDetailHeldByPokemonInnerVersionDetailsInner = (ItemDetailHeldByPokemonInnerVersionDetailsInner) o;
    return Objects.equals(rarity, itemDetailHeldByPokemonInnerVersionDetailsInner.rarity) &&
        Objects.equals(version, itemDetailHeldByPokemonInnerVersionDetailsInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rarity, version);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailHeldByPokemonInnerVersionDetailsInner {\n");
    
    sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

