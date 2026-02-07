package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveBattleStyleSummary;

/**
 * NatureBattleStylePreference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NatureBattleStylePreference   {
  @JsonProperty("low_hp_preference")
  private Integer lowHpPreference;

  @JsonProperty("high_hp_preference")
  private Integer highHpPreference;

  @JsonProperty("move_battle_style")
  private MoveBattleStyleSummary moveBattleStyle;

  public NatureBattleStylePreference lowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
    return this;
  }

   /**
   * Get lowHpPreference
   * @return lowHpPreference
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.lowHpPreference, natureBattleStylePreference.lowHpPreference) &&
        Objects.equals(this.highHpPreference, natureBattleStylePreference.highHpPreference) &&
        Objects.equals(this.moveBattleStyle, natureBattleStylePreference.moveBattleStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowHpPreference, highHpPreference, moveBattleStyle);
  }

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

