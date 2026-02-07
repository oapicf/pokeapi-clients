package apimodels;

import apimodels.MoveDetailContestCombosNormal;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveDetailContestCombos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveDetailContestCombos   {
  @JsonProperty("normal")
  @NotNull
@Valid

  private MoveDetailContestCombosNormal normal;

  @JsonProperty("super")
  @NotNull
@Valid

  private MoveDetailContestCombosNormal _super;

  public MoveDetailContestCombos normal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
    return this;
  }

   /**
   * Get normal
   * @return normal
  **/
  public MoveDetailContestCombosNormal getNormal() {
    return normal;
  }

  public void setNormal(MoveDetailContestCombosNormal normal) {
    this.normal = normal;
  }

  public MoveDetailContestCombos _super(MoveDetailContestCombosNormal _super) {
    this._super = _super;
    return this;
  }

   /**
   * Get _super
   * @return _super
  **/
  public MoveDetailContestCombosNormal getSuper() {
    return _super;
  }

  public void setSuper(MoveDetailContestCombosNormal _super) {
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
    MoveDetailContestCombos moveDetailContestCombos = (MoveDetailContestCombos) o;
    return Objects.equals(normal, moveDetailContestCombos.normal) &&
        Objects.equals(_super, moveDetailContestCombos._super);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normal, _super);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailContestCombos {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

