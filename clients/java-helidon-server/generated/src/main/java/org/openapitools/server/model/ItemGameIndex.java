package org.openapitools.server.model;

import org.openapitools.server.model.GenerationSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemGameIndex   {

    private Integer gameIndex;
    private GenerationSummary generation;

    /**
     * Default constructor.
     */
    public ItemGameIndex() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemGameIndex.
     *
     * @param gameIndex gameIndex
     * @param generation generation
     */
    public ItemGameIndex(
        Integer gameIndex, 
        GenerationSummary generation
    ) {
        this.gameIndex = gameIndex;
        this.generation = generation;
    }



    /**
     * Get gameIndex
     * @return gameIndex
     */
    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    /**
     * Get generation
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemGameIndex {\n");
        
        sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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

