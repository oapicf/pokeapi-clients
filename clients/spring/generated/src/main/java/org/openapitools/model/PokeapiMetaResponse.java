package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokeapiMetaResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeapiMetaResponse {

  private JsonNullable<String> deployDate = JsonNullable.<String>undefined();

  private JsonNullable<String> hash = JsonNullable.<String>undefined();

  private JsonNullable<String> tag = JsonNullable.<String>undefined();

  public PokeapiMetaResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokeapiMetaResponse(String deployDate, String hash, String tag) {
    this.deployDate = JsonNullable.of(deployDate);
    this.hash = JsonNullable.of(hash);
    this.tag = JsonNullable.of(tag);
  }

  public PokeapiMetaResponse deployDate(String deployDate) {
    this.deployDate = JsonNullable.of(deployDate);
    return this;
  }

  /**
   * The deployment time as a Unix timestamp string.
   * @return deployDate
   */
  /* @Present */ 
  @Schema(name = "deploy_date", description = "The deployment time as a Unix timestamp string.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("deploy_date")
  public JsonNullable<String> getDeployDate() {
    return deployDate;
  }

  @JsonProperty("deploy_date")
  public void setDeployDate(JsonNullable<String> deployDate) {
    this.deployDate = deployDate;
  }

  public PokeapiMetaResponse hash(String hash) {
    this.hash = JsonNullable.of(hash);
    return this;
  }

  /**
   * The source commit hash used for this deployment.
   * @return hash
   */
  /* @Present */ 
  @Schema(name = "hash", description = "The source commit hash used for this deployment.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("hash")
  public JsonNullable<String> getHash() {
    return hash;
  }

  @JsonProperty("hash")
  public void setHash(JsonNullable<String> hash) {
    this.hash = hash;
  }

  public PokeapiMetaResponse tag(String tag) {
    this.tag = JsonNullable.of(tag);
    return this;
  }

  /**
   * The deployment tag, or null if the deployment has no tag.
   * @return tag
   */
  /* @Present */ 
  @Schema(name = "tag", description = "The deployment tag, or null if the deployment has no tag.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("tag")
  public JsonNullable<String> getTag() {
    return tag;
  }

  @JsonProperty("tag")
  public void setTag(JsonNullable<String> tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeapiMetaResponse pokeapiMetaResponse = (PokeapiMetaResponse) o;
    return Objects.equals(this.deployDate, pokeapiMetaResponse.deployDate) &&
        Objects.equals(this.hash, pokeapiMetaResponse.hash) &&
        Objects.equals(this.tag, pokeapiMetaResponse.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployDate, hash, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeapiMetaResponse {\n");
    sb.append("    deployDate: ").append(toIndentedString(deployDate)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

