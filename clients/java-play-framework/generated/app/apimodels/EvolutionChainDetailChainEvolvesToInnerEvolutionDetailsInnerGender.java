package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("url")
  @NotNull
@Valid

  private URI url;

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
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
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender = (EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender) o;
    return Objects.equals(name, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.name) &&
        Objects.equals(url, evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender {\n");
    
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

