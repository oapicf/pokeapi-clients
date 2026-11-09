package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ItemSprites   {
  
  private String _default;

  /**
   * The default depiction of this item.
   **/
  public ItemSprites _default(String _default) {
    this._default = _default;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The default depiction of this item.")
  @JsonProperty("default")
  @NotNull
  public String getDefault() {
    return _default;
  }
  public void setDefault(String _default) {
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
    ItemSprites itemSprites = (ItemSprites) o;
    return Objects.equals(this._default, itemSprites._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSprites {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

