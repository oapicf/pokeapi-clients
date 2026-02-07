package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * PokemonFormDetailSprites
 */

@JsonTypeName("PokemonFormDetail_sprites")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonFormDetailSprites {

  private @Nullable URI _default;

  public PokemonFormDetailSprites _default(@Nullable URI _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   */
  @Valid 
  @Schema(name = "default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default")
  public @Nullable URI getDefault() {
    return _default;
  }

  public void setDefault(@Nullable URI _default) {
    this._default = _default;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, URI> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public PokemonFormDetailSprites putAdditionalProperty(String key, URI value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, URI>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, URI> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public URI getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
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
    return Objects.equals(this._default, pokemonFormDetailSprites._default) &&
    Objects.equals(this.additionalProperties, pokemonFormDetailSprites.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormDetailSprites {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

