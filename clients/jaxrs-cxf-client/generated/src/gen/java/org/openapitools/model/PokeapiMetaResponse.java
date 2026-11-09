package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokeapiMetaResponse  {
  
 /**
  * The deployment time as a Unix timestamp string.
  */
  @ApiModelProperty(required = true, value = "The deployment time as a Unix timestamp string.")

  private String deployDate;

 /**
  * The source commit hash used for this deployment.
  */
  @ApiModelProperty(required = true, value = "The source commit hash used for this deployment.")

  private String hash;

 /**
  * The deployment tag, or null if the deployment has no tag.
  */
  @ApiModelProperty(required = true, value = "The deployment tag, or null if the deployment has no tag.")

  private String tag;
 /**
   * The deployment time as a Unix timestamp string.
   * @return deployDate
  **/
  @JsonProperty("deploy_date")
  public String getDeployDate() {
    return deployDate;
  }

  public void setDeployDate(String deployDate) {
    this.deployDate = deployDate;
  }

  public PokeapiMetaResponse deployDate(String deployDate) {
    this.deployDate = deployDate;
    return this;
  }

 /**
   * The source commit hash used for this deployment.
   * @return hash
  **/
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public PokeapiMetaResponse hash(String hash) {
    this.hash = hash;
    return this;
  }

 /**
   * The deployment tag, or null if the deployment has no tag.
   * @return tag
  **/
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public PokeapiMetaResponse tag(String tag) {
    this.tag = tag;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

