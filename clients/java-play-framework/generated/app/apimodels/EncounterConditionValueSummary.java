package apimodels;

import java.net.URI;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EncounterConditionValueSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EncounterConditionValueSummary   {
  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("url")
  @NotNull
@Valid

  private URI url;

  public EncounterConditionValueSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the referenced resource.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EncounterConditionValueSummary url(URI url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the referenced resource.
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
    EncounterConditionValueSummary encounterConditionValueSummary = (EncounterConditionValueSummary) o;
    return Objects.equals(name, encounterConditionValueSummary.name) &&
        Objects.equals(url, encounterConditionValueSummary.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterConditionValueSummary {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

