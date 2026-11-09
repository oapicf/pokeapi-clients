package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TypeGameSprite
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeGameSprite {

  private JsonNullable<String> nameIcon = JsonNullable.<String>undefined();

  private JsonNullable<String> symbolIcon = JsonNullable.<String>undefined();

  public TypeGameSprite nameIcon(String nameIcon) {
    this.nameIcon = JsonNullable.of(nameIcon);
    return this;
  }

  /**
   * The URL of the icon displaying the type name in this game, or null if unavailable.
   * @return nameIcon
   */
  
  @Schema(name = "name_icon", description = "The URL of the icon displaying the type name in this game, or null if unavailable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name_icon")
  public JsonNullable<String> getNameIcon() {
    return nameIcon;
  }

  public void setNameIcon(JsonNullable<String> nameIcon) {
    this.nameIcon = nameIcon;
  }

  public TypeGameSprite symbolIcon(String symbolIcon) {
    this.symbolIcon = JsonNullable.of(symbolIcon);
    return this;
  }

  /**
   * The URL of the type symbol icon in this game, or null if unavailable.
   * @return symbolIcon
   */
  
  @Schema(name = "symbol_icon", description = "The URL of the type symbol icon in this game, or null if unavailable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("symbol_icon")
  public JsonNullable<String> getSymbolIcon() {
    return symbolIcon;
  }

  public void setSymbolIcon(JsonNullable<String> symbolIcon) {
    this.symbolIcon = symbolIcon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeGameSprite typeGameSprite = (TypeGameSprite) o;
    return equalsNullable(this.nameIcon, typeGameSprite.nameIcon) &&
        equalsNullable(this.symbolIcon, typeGameSprite.symbolIcon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(nameIcon), hashCodeNullable(symbolIcon));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeGameSprite {\n");
    sb.append("    nameIcon: ").append(toIndentedString(nameIcon)).append("\n");
    sb.append("    symbolIcon: ").append(toIndentedString(symbolIcon)).append("\n");
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

