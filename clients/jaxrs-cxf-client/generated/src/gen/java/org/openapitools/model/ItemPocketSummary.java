package org.openapitools.model;

import java.net.URI;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemPocketSummary  {
  
 /**
  * The name of the referenced resource.
  */
  @ApiModelProperty(required = true, value = "The name of the referenced resource.")

  private String name;

 /**
  * The URL of the referenced resource.
  */
  @ApiModelProperty(required = true, value = "The URL of the referenced resource.")

  private URI url;
 /**
   * The name of the referenced resource.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemPocketSummary name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The URL of the referenced resource.
   * @return url
  **/
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPocketSummary itemPocketSummary = (ItemPocketSummary) o;
    return Objects.equals(this.name, itemPocketSummary.name) &&
        Objects.equals(this.url, itemPocketSummary.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPocketSummary {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

