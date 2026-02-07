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
 * BerryFlavorDetailBerriesInnerBerry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BerryFlavorDetailBerriesInnerBerry   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("url")
  @Valid

  private URI url;

  public BerryFlavorDetailBerriesInnerBerry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the berry
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BerryFlavorDetailBerriesInnerBerry url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * The URL to get more information about the berry
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
    BerryFlavorDetailBerriesInnerBerry berryFlavorDetailBerriesInnerBerry = (BerryFlavorDetailBerriesInnerBerry) o;
    return Objects.equals(name, berryFlavorDetailBerriesInnerBerry.name) &&
        Objects.equals(url, berryFlavorDetailBerriesInnerBerry.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetailBerriesInnerBerry {\n");
    
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

