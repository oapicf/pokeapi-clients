package apimodels;

import apimodels.MoveComboUsage;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveCombos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveCombos   {
  @JsonProperty("normal")
  @NotNull
@Valid

  private MoveComboUsage normal;

  @JsonProperty("super")
  @NotNull
@Valid

  private MoveComboUsage _super;

  public MoveCombos normal(MoveComboUsage normal) {
    this.normal = normal;
    return this;
  }

   /**
   * A detail of moves this move can be used before or after, granting additional appeal points in contests.
   * @return normal
  **/
  public MoveComboUsage getNormal() {
    return normal;
  }

  public void setNormal(MoveComboUsage normal) {
    this.normal = normal;
  }

  public MoveCombos _super(MoveComboUsage _super) {
    this._super = _super;
    return this;
  }

   /**
   * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
   * @return _super
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

