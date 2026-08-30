package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Experience   {

    private Integer level;
    private Integer experience;

    /**
     * Default constructor.
     */
    public Experience() {
    // JSON-B / Jackson
    }

    /**
     * Create Experience.
     *
     * @param level level
     * @param experience experience
     */
    public Experience(
        Integer level, 
        Integer experience
    ) {
        this.level = level;
        this.experience = experience;
    }



    /**
     * Get level
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * Get experience
     * @return experience
     */
    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

