package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokeapiMetaResponse   {

    private String deployDate;
    private String hash;
    private String tag;

    /**
     * Default constructor.
     */
    public PokeapiMetaResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create PokeapiMetaResponse.
     *
     * @param deployDate The deployment time as a Unix timestamp string.
     * @param hash The source commit hash used for this deployment.
     * @param tag The deployment tag, or null if the deployment has no tag.
     */
    public PokeapiMetaResponse(
        String deployDate, 
        String hash, 
        String tag
    ) {
        this.deployDate = deployDate;
        this.hash = hash;
        this.tag = tag;
    }



    /**
     * The deployment time as a Unix timestamp string.
     * @return deployDate
     */
    public String getDeployDate() {
        return deployDate;
    }

    public void setDeployDate(String deployDate) {
        this.deployDate = deployDate;
    }

    /**
     * The source commit hash used for this deployment.
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * The deployment tag, or null if the deployment has no tag.
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeapiMetaResponse {\n");
        
        sb.append("    deployDate: ").append(toIndentedString(deployDate)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

