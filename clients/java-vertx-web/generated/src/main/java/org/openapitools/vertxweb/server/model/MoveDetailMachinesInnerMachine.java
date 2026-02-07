package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDetailMachinesInnerMachine   {
  
  private URI url;

  public MoveDetailMachinesInnerMachine () {

  }

  public MoveDetailMachinesInnerMachine (URI url) {
    this.url = url;
  }

    
  @JsonProperty("url")
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
    MoveDetailMachinesInnerMachine moveDetailMachinesInnerMachine = (MoveDetailMachinesInnerMachine) o;
    return Objects.equals(url, moveDetailMachinesInnerMachine.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailMachinesInnerMachine {\n");
    
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
