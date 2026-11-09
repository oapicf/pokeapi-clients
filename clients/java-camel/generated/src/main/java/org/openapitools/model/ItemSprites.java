package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ItemSprites
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemSprites {

  private JsonNullable<String> _default = JsonNullable.<String>undefined();

  public ItemSprites() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemSprites(String _default) {
    this._default = JsonNullable.of(_default);
  }

  public ItemSprites _default(String _default) {
    this._default = JsonNullable.of(_default);
    return this;
  }

  /**
   * The default depiction of this item.
   * @return _default
   */
  /* @Present */ 
  @Schema(name = "default", description = "The default depiction of this item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("default")
  public JsonNullable<String> getDefault() {
    return _default;
  }

  public void setDefault(JsonNullable<String> _default) {
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
    ItemSprites itemSprites = (ItemSprites) o;
    return Objects.equals(this._default, itemSprites._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSprites {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

