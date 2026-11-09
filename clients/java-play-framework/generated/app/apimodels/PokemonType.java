package apimodels;

import apimodels.TypeSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonType   {
  @JsonProperty("slot")
  @NotNull
@Min(-2147483648)
@Max(2147483647)

  private Integer slot;

  @JsonProperty("type")
  @NotNull
@Valid

  private TypeSummary type;

  public PokemonType slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * The order the Pokémon's types are listed in.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
  **/
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public PokemonType type(TypeSummary type) {
    this.type = type;
    return this;
  }

   /**
   * The type the referenced Pokémon has.
   * @return type
  **/
  public TypeSummary getType() {
    return type;
  }

  public void setType(TypeSummary type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonType pokemonType = (PokemonType) o;
    return Objects.equals(slot, pokemonType.slot) &&
        Objects.equals(type, pokemonType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonType {\n");
    
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

