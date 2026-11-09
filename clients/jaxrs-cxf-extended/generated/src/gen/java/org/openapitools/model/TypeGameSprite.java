package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeGameSprite  {
  
 /**
  * The URL of the icon displaying the type name in this game, or null if unavailable.
  */
  @ApiModelProperty(value = "The URL of the icon displaying the type name in this game, or null if unavailable.")
  private String nameIcon;

 /**
  * The URL of the type symbol icon in this game, or null if unavailable.
  */
  @ApiModelProperty(value = "The URL of the type symbol icon in this game, or null if unavailable.")
  private String symbolIcon;
 /**
  * The URL of the icon displaying the type name in this game, or null if unavailable.
  * @return nameIcon
  */
  @JsonProperty("name_icon")
  public String getNameIcon() {
    return nameIcon;
  }

  /**
   * Sets the <code>nameIcon</code> property.
   */
 public void setNameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
  }

  /**
   * Sets the <code>nameIcon</code> property.
   */
  public TypeGameSprite nameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
    return this;
  }

 /**
  * The URL of the type symbol icon in this game, or null if unavailable.
  * @return symbolIcon
  */
  @JsonProperty("symbol_icon")
  public String getSymbolIcon() {
    return symbolIcon;
  }

  /**
   * Sets the <code>symbolIcon</code> property.
   */
 public void setSymbolIcon(String symbolIcon) {
    this.symbolIcon = symbolIcon;
  }

  /**
   * Sets the <code>symbolIcon</code> property.
   */
  public TypeGameSprite symbolIcon(String symbolIcon) {
    this.symbolIcon = symbolIcon;
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
    TypeGameSprite typeGameSprite = (TypeGameSprite) o;
    return Objects.equals(this.nameIcon, typeGameSprite.nameIcon) &&
        Objects.equals(this.symbolIcon, typeGameSprite.symbolIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameIcon, symbolIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeGameSprite {\n");
    
    sb.append("    nameIcon: ").append(toIndentedString(nameIcon)).append("\n");
    sb.append("    symbolIcon: ").append(toIndentedString(symbolIcon)).append("\n");
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

