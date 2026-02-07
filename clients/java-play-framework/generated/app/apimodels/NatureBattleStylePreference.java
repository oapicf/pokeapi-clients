package apimodels;

import apimodels.MoveBattleStyleSummary;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NatureBattleStylePreference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class NatureBattleStylePreference   {
  @JsonProperty("low_hp_preference")
  @NotNull

  private Integer lowHpPreference;

  @JsonProperty("high_hp_preference")
  @NotNull

  private Integer highHpPreference;

  @JsonProperty("move_battle_style")
  @NotNull
@Valid

  private MoveBattleStyleSummary moveBattleStyle;

  public NatureBattleStylePreference lowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
    return this;
  }

   /**
   * Get lowHpPreference
   * @return lowHpPreference
  **/
  public Integer getLowHpPreference() {
    return lowHpPreference;
  }

  public void setLowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
  }

  public NatureBattleStylePreference highHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
    return this;
  }

   /**
   * Get highHpPreference
   * @return highHpPreference
  **/
  public Integer getHighHpPreference() {
    return highHpPreference;
  }

  public void setHighHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
  }

  public NatureBattleStylePreference moveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
    return this;
  }

   /**
   * Get moveBattleStyle
   * @return moveBattleStyle
  **/
  public MoveBattleStyleSummary getMoveBattleStyle() {
    return moveBattleStyle;
  }

  public void setMoveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatureBattleStylePreference natureBattleStylePreference = (NatureBattleStylePreference) o;
    return Objects.equals(lowHpPreference, natureBattleStylePreference.lowHpPreference) &&
        Objects.equals(highHpPreference, natureBattleStylePreference.highHpPreference) &&
        Objects.equals(moveBattleStyle, natureBattleStylePreference.moveBattleStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowHpPreference, highHpPreference, moveBattleStyle);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatureBattleStylePreference {\n");
    
    sb.append("    lowHpPreference: ").append(toIndentedString(lowHpPreference)).append("\n");
    sb.append("    highHpPreference: ").append(toIndentedString(highHpPreference)).append("\n");
    sb.append("    moveBattleStyle: ").append(toIndentedString(moveBattleStyle)).append("\n");
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

