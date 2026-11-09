package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TypeGameSprite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TypeGameSprite   {
  @JsonProperty("name_icon")
  
  private String nameIcon;

  @JsonProperty("symbol_icon")
  
  private String symbolIcon;

  public TypeGameSprite nameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
    return this;
  }

   /**
   * The URL of the icon displaying the type name in this game, or null if unavailable.
   * @return nameIcon
  **/
  public String getNameIcon() {
    return nameIcon;
  }

  public void setNameIcon(String nameIcon) {
    this.nameIcon = nameIcon;
  }

  public TypeGameSprite symbolIcon(String symbolIcon) {
    this.symbolIcon = symbolIcon;
    return this;
  }

   /**
   * The URL of the type symbol icon in this game, or null if unavailable.
   * @return symbolIcon
  **/
  public String getSymbolIcon() {
    return symbolIcon;
  }

  public void setSymbolIcon(String symbolIcon) {
    this.symbolIcon = symbolIcon;
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
    return Objects.equals(nameIcon, typeGameSprite.nameIcon) &&
        Objects.equals(symbolIcon, typeGameSprite.symbolIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameIcon, symbolIcon);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

