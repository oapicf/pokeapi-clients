package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokeapiMetaResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokeapiMetaResponse   {
  @JsonProperty("deploy_date")
  @NotNull

  private String deployDate;

  @JsonProperty("hash")
  @NotNull

  private String hash;

  @JsonProperty("tag")
  @NotNull

  private String tag;

  public PokeapiMetaResponse deployDate(String deployDate) {
    this.deployDate = deployDate;
    return this;
  }

   /**
   * The deployment time as a Unix timestamp string.
   * @return deployDate
  **/
  public String getDeployDate() {
    return deployDate;
  }

  public void setDeployDate(String deployDate) {
    this.deployDate = deployDate;
  }

  public PokeapiMetaResponse hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * The source commit hash used for this deployment.
   * @return hash
  **/
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public PokeapiMetaResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The deployment tag, or null if the deployment has no tag.
   * @return tag
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

