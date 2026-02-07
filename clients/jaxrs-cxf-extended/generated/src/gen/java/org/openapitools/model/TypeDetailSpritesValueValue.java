package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeDetailSpritesValueValue  {
  
  @ApiModelProperty(value = "")
  private URI nameIcon;
 /**
  * Get nameIcon
  * @return nameIcon
  */
  @JsonProperty("name-icon")
  public URI getNameIcon() {
    return nameIcon;
  }

  /**
   * Sets the <code>nameIcon</code> property.
   */
 public void setNameIcon(URI nameIcon) {
    this.nameIcon = nameIcon;
  }

  /**
   * Sets the <code>nameIcon</code> property.
   */
  public TypeDetailSpritesValueValue nameIcon(URI nameIcon) {
    this.nameIcon = nameIcon;
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
    TypeDetailSpritesValueValue typeDetailSpritesValueValue = (TypeDetailSpritesValueValue) o;
    return Objects.equals(this.nameIcon, typeDetailSpritesValueValue.nameIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetailSpritesValueValue {\n");
    
    sb.append("    nameIcon: ").append(toIndentedString(nameIcon)).append("\n");
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

