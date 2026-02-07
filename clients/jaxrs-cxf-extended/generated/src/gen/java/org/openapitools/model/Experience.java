package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Experience  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer level;

  @ApiModelProperty(required = true, value = "")
  private Integer experience;
 /**
  * Get level
  * @return level
  */
  @JsonProperty("level")
  @NotNull
  public Integer getLevel() {
    return level;
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(Integer level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public Experience level(Integer level) {
    this.level = level;
    return this;
  }

 /**
  * Get experience
  * @return experience
  */
  @JsonProperty("experience")
  @NotNull
  public Integer getExperience() {
    return experience;
  }

  /**
   * Sets the <code>experience</code> property.
   */
 public void setExperience(Integer experience) {
    this.experience = experience;
  }

  /**
   * Sets the <code>experience</code> property.
   */
  public Experience experience(Integer experience) {
    this.experience = experience;
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
    Experience experience = (Experience) o;
    return Objects.equals(this.level, experience.level) &&
        Objects.equals(this.experience, experience.experience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, experience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Experience {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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

