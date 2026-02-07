package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonFormDetailSprites extends HashMap<String, URI>  {
  
  private URI _default;

  /**
   **/
  public PokemonFormDetailSprites _default(URI _default) {
    this._default = _default;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

