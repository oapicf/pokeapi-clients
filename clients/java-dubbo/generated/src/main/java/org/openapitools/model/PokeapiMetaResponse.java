package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokeapiMetaResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The deployment time as a Unix timestamp string.
   */
  @JsonProperty("deploy_date")
  private String deployDate;

  /**
   * The source commit hash used for this deployment.
   */
  @JsonProperty("hash")
  private String hash;

  /**
   * The deployment tag, or null if the deployment has no tag.
   */
  @JsonProperty("tag")
  private String tag;

  /**
   * The deployment time as a Unix timestamp string.
   * @return deployDate
   */
  public String getDeployDate() {
    return deployDate;
  }

  public void setDeployDate(String deployDate) {
    this.deployDate = deployDate;
  }

  /**
   * The source commit hash used for this deployment.
   * @return hash
   */
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * The deployment tag, or null if the deployment has no tag.
   * @return tag
   */
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
