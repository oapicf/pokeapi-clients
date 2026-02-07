package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonFormDetailSprites
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonFormDetailSprites extends HashMap<String, URI>  {
  @JsonProperty("default")
  @Valid

  private URI _default;

  public PokemonFormDetailSprites _default(URI _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  public URI getDefault() {
    return _default;
  }

  public void setDefault(URI _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonFormDetailSprites pokemonFormDetailSprites = (PokemonFormDetailSprites) o;
    return Objects.equals(_default, pokemonFormDetailSprites._default) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormDetailSprites {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

