package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * VersionGroupSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VersionGroupSummary {

  private String name;

  private URI url;

  public VersionGroupSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VersionGroupSummary(String name, URI url) {
    this.name = name;
    this.url = url;
  }

  public VersionGroupSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VersionGroupSummary url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @Valid 
  @Schema(name = "url", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
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
    VersionGroupSummary versionGroupSummary = (VersionGroupSummary) o;
    return Objects.equals(this.name, versionGroupSummary.name) &&
        Objects.equals(this.url, versionGroupSummary.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionGroupSummary {\n");
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

