package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokeapiMetaResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeapiMetaResponse   {
  private String deployDate;
  private String hash;
  private String tag;

  public PokeapiMetaResponse() {
  }

  @JsonCreator
  public PokeapiMetaResponse(
    @JsonProperty(required = true, value = "deploy_date") String deployDate,
    @JsonProperty(required = true, value = "hash") String hash,
    @JsonProperty(required = true, value = "tag") String tag
  ) {
    this.deployDate = deployDate;
    this.hash = hash;
    this.tag = tag;
  }

  /**
   * The deployment time as a Unix timestamp string.
   **/
  public PokeapiMetaResponse deployDate(String deployDate) {
    this.deployDate = deployDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The deployment time as a Unix timestamp string.")
  @JsonProperty(required = true, value = "deploy_date")
  @NotNull public String getDeployDate() {
    return deployDate;
  }

  @JsonProperty(required = true, value = "deploy_date")
  public void setDeployDate(String deployDate) {
    this.deployDate = deployDate;
  }

  /**
   * The source commit hash used for this deployment.
   **/
  public PokeapiMetaResponse hash(String hash) {
    this.hash = hash;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The source commit hash used for this deployment.")
  @JsonProperty(required = true, value = "hash")
  @NotNull public String getHash() {
    return hash;
  }

  @JsonProperty(required = true, value = "hash")
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * The deployment tag, or null if the deployment has no tag.
   **/
  public PokeapiMetaResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The deployment tag, or null if the deployment has no tag.")
  @JsonProperty(required = true, value = "tag")
  @NotNull public String getTag() {
    return tag;
  }

  @JsonProperty(required = true, value = "tag")
  public void setTag(String tag) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
