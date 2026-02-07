package org.openapitools.model;

import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MachineSummary  {
  
  @ApiModelProperty(required = true, value = "")
  private URI url;
 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public URI getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   * <br><em>N.B. <code>url</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MachineSummary url(URI url) {
    this.url = url;
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
    MachineSummary machineSummary = (MachineSummary) o;
    return Objects.equals(this.url, machineSummary.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineSummary {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

