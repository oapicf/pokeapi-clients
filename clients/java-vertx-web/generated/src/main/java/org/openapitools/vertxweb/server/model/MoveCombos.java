package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.MoveComboUsage;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveCombos   {
  
  private MoveComboUsage normal;
  private MoveComboUsage _super;

  public MoveCombos () {

  }

  public MoveCombos (MoveComboUsage normal, MoveComboUsage _super) {
    this.normal = normal;
    this._super = _super;
  }

    
  @JsonProperty("normal")
  public MoveComboUsage getNormal() {
    return normal;
  }
  public void setNormal(MoveComboUsage normal) {
    this.normal = normal;
  }

    
  @JsonProperty("super")
  public MoveComboUsage getSuper() {
    return _super;
  }
  public void setSuper(MoveComboUsage _super) {
    this._super = _super;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveCombos moveCombos = (MoveCombos) o;
    return Objects.equals(normal, moveCombos.normal) &&
        Objects.equals(_super, moveCombos._super);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normal, _super);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveCombos {\n");
    
    sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
    sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
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
