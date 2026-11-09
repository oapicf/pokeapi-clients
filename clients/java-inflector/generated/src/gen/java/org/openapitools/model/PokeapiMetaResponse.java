package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeapiMetaResponse   {
  @JsonProperty("deploy_date")
  private String deployDate;

  @JsonProperty("hash")
  private String hash;

  @JsonProperty("tag")
  private String tag;

  /**
   * The deployment time as a Unix timestamp string.
   **/
  public PokeapiMetaResponse deployDate(String deployDate) {
    this.deployDate = deployDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The deployment time as a Unix timestamp string.")
  @JsonProperty("deploy_date")
  public String getDeployDate() {
    return deployDate;
  }
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
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }
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
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
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
    return Objects.equals(deployDate, pokeapiMetaResponse.deployDate) &&
        Objects.equals(hash, pokeapiMetaResponse.hash) &&
        Objects.equals(tag, pokeapiMetaResponse.tag);
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

