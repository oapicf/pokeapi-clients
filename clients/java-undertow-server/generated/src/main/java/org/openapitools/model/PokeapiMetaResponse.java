/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeapiMetaResponse   {
  
  private String deployDate;
  private String hash;
  private String tag;

  /**
   * The deployment time as a Unix timestamp string.
   */
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
   */
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
   */
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

