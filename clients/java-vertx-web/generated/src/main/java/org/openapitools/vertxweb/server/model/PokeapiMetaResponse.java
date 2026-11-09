package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokeapiMetaResponse   {
  
  private String deployDate;
  private String hash;
  private String tag;

  public PokeapiMetaResponse () {

  }

  public PokeapiMetaResponse (String deployDate, String hash, String tag) {
    this.deployDate = deployDate;
    this.hash = hash;
    this.tag = tag;
  }

    
  @JsonProperty("deploy_date")
  public String getDeployDate() {
    return deployDate;
  }
  public void setDeployDate(String deployDate) {
    this.deployDate = deployDate;
  }

    
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

    
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
