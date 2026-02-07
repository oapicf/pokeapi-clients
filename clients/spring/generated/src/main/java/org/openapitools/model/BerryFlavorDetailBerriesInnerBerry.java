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

/**
 * BerryFlavorDetailBerriesInnerBerry
 */

@JsonTypeName("BerryFlavorDetail_berries_inner_berry")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryFlavorDetailBerriesInnerBerry {

  private @Nullable String name;

  private @Nullable URI url;

  public BerryFlavorDetailBerriesInnerBerry name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the berry
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the berry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BerryFlavorDetailBerriesInnerBerry url(@Nullable URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to get more information about the berry
   * @return url
   */
  @Valid 
  @Schema(name = "url", description = "The URL to get more information about the berry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable URI getUrl() {
    return url;
  }

  public void setUrl(@Nullable URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BerryFlavorDetailBerriesInnerBerry berryFlavorDetailBerriesInnerBerry = (BerryFlavorDetailBerriesInnerBerry) o;
    return Objects.equals(this.name, berryFlavorDetailBerriesInnerBerry.name) &&
        Objects.equals(this.url, berryFlavorDetailBerriesInnerBerry.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetailBerriesInnerBerry {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

