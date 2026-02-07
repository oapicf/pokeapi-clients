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
 * BerryDetailFlavorsInnerFlavor
 */

@JsonTypeName("BerryDetail_flavors_inner_flavor")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryDetailFlavorsInnerFlavor {

  private @Nullable String name;

  private @Nullable URI url;

  public BerryDetailFlavorsInnerFlavor name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the flavor
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the flavor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BerryDetailFlavorsInnerFlavor url(@Nullable URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to get more information about the flavor
   * @return url
   */
  @Valid 
  @Schema(name = "url", description = "The URL to get more information about the flavor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor = (BerryDetailFlavorsInnerFlavor) o;
    return Objects.equals(this.name, berryDetailFlavorsInnerFlavor.name) &&
        Objects.equals(this.url, berryDetailFlavorsInnerFlavor.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryDetailFlavorsInnerFlavor {\n");
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

