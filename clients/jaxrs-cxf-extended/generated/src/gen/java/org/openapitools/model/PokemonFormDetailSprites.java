package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonFormDetailSprites extends HashMap<String, URI> {
  
  @ApiModelProperty(value = "")
  private URI _default;
 /**
  * Get _default
  * @return _default
  */
  @JsonProperty("default")
  public URI getDefault() {
    return _default;
  }

  /**
   * Sets the <code>_default</code> property.
   */
 public void setDefault(URI _default) {
    this._default = _default;
  }

  /**
   * Sets the <code>_default</code> property.
   */
  public PokemonFormDetailSprites _default(URI _default) {
    this._default = _default;
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
    PokemonFormDetailSprites pokemonFormDetailSprites = (PokemonFormDetailSprites) o;
    return super.equals(o) && Objects.equals(this._default, pokemonFormDetailSprites._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), _default);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

