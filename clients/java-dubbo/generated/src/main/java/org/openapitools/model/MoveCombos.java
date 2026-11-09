package org.openapitools.model;

import org.openapitools.model.MoveComboUsage;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class MoveCombos implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in contests.
   */
  @JsonProperty("normal")
  private MoveComboUsage normal;

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
   */
  @JsonProperty("super")
  private MoveComboUsage _super;

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in contests.
   * @return normal
   */
  public MoveComboUsage getNormal() {
    return normal;
  }

  public void setNormal(MoveComboUsage normal) {
    this.normal = normal;
  }

  /**
   * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
   * @return _super
   */
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
    return Objects.equals(this.normal, moveCombos.normal) &&
        Objects.equals(this._super, moveCombos._super);
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
