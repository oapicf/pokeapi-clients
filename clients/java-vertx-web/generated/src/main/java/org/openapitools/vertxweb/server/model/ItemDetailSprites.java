package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDetailSprites   {
  
  private URI _default;

  public ItemDetailSprites () {

  }

  public ItemDetailSprites (URI _default) {
    this._default = _default;
  }

    
  @JsonProperty("default")
  public URI getDefault() {
    return _default;
  }
  public void setDefault(URI _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDetailSprites itemDetailSprites = (ItemDetailSprites) o;
    return Objects.equals(_default, itemDetailSprites._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailSprites {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
