package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Experience   {
  
  private Integer level;
  private Integer experience;

  public Experience () {

  }

  public Experience (Integer level, Integer experience) {
    this.level = level;
    this.experience = experience;
  }

    
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

    
  @JsonProperty("experience")
  public Integer getExperience() {
    return experience;
  }
  public void setExperience(Integer experience) {
    this.experience = experience;
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
    return Objects.equals(level, experience.level) &&
        Objects.equals(experience, experience.experience);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
