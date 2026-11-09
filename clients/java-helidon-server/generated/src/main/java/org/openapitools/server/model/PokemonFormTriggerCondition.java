package org.openapitools.server.model;

import java.net.URI;
import org.openapitools.server.model.PokemonFormSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PokemonFormTriggerCondition   {

    private String trigger;
    private String name;
    private URI url;
    private PokemonFormSummary baseForm;

    /**
     * Default constructor.
     */
    public PokemonFormTriggerCondition() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonFormTriggerCondition.
     *
     * @param trigger The trigger for this form change.
     * @param name The name of the required item, ability, or move. Only present for a resource-based trigger.
     * @param url The URL of the required item, ability, or move. Only present for a resource-based trigger.
     * @param baseForm The required base form. Only present when the trigger specifies one.
     */
    public PokemonFormTriggerCondition(
        String trigger, 
        String name, 
        URI url, 
        PokemonFormSummary baseForm
    ) {
        this.trigger = trigger;
        this.name = name;
        this.url = url;
        this.baseForm = baseForm;
    }



    /**
     * The trigger for this form change.
     * @return trigger
     */
    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    /**
     * The name of the required item, ability, or move. Only present for a resource-based trigger.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The URL of the required item, ability, or move. Only present for a resource-based trigger.
     * @return url
     */
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * The required base form. Only present when the trigger specifies one.
     * @return baseForm
     */
    public PokemonFormSummary getBaseForm() {
        return baseForm;
    }

    public void setBaseForm(PokemonFormSummary baseForm) {
        this.baseForm = baseForm;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonFormTriggerCondition {\n");
        
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    baseForm: ").append(toIndentedString(baseForm)).append("\n");
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

