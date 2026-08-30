package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * PokemonDetailSprites
 */

@JsonTypeName("PokemonDetail_sprites")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PokemonDetailSprites {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable URI frontDefault;

  public PokemonDetailSprites frontDefault(@Nullable URI frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  /**
   * Get frontDefault
   * @return frontDefault
   */
  @Valid 
  @Schema(name = "front_default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("front_default")
  public @Nullable URI getFrontDefault() {
    return frontDefault;
  }

  @JsonProperty("front_default")
  public void setFrontDefault(@Nullable URI frontDefault) {
    this.frontDefault = frontDefault;
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
    public PokemonDetailSprites putAdditionalProperty(String key, URI value) {
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
    PokemonDetailSprites pokemonDetailSprites = (PokemonDetailSprites) o;
    return Objects.equals(this.frontDefault, pokemonDetailSprites.frontDefault) &&
    Objects.equals(this.additionalProperties, pokemonDetailSprites.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailSprites {\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

