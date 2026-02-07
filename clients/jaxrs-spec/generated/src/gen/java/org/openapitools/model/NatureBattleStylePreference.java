package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveBattleStyleSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("NatureBattleStylePreference")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NatureBattleStylePreference   {
  private Integer lowHpPreference;
  private Integer highHpPreference;
  private MoveBattleStyleSummary moveBattleStyle;

  public NatureBattleStylePreference() {
  }

  @JsonCreator
  public NatureBattleStylePreference(
    @JsonProperty(required = true, value = "low_hp_preference") Integer lowHpPreference,
    @JsonProperty(required = true, value = "high_hp_preference") Integer highHpPreference,
    @JsonProperty(required = true, value = "move_battle_style") MoveBattleStyleSummary moveBattleStyle
  ) {
    this.lowHpPreference = lowHpPreference;
    this.highHpPreference = highHpPreference;
    this.moveBattleStyle = moveBattleStyle;
  }

  /**
   **/
  public NatureBattleStylePreference lowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "low_hp_preference")
  @NotNull public Integer getLowHpPreference() {
    return lowHpPreference;
  }

  @JsonProperty(required = true, value = "low_hp_preference")
  public void setLowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
  }

  /**
   **/
  public NatureBattleStylePreference highHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "high_hp_preference")
  @NotNull public Integer getHighHpPreference() {
    return highHpPreference;
  }

  @JsonProperty(required = true, value = "high_hp_preference")
  public void setHighHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
  }

  /**
   **/
  public NatureBattleStylePreference moveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "move_battle_style")
  @NotNull @Valid public MoveBattleStyleSummary getMoveBattleStyle() {
    return moveBattleStyle;
  }

  @JsonProperty(required = true, value = "move_battle_style")
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

