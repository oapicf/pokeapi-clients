package org.openapitools.model;

import java.net.URI;
import org.openapitools.model.PokemonFormSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonFormTriggerCondition  {
  
 /**
  * The trigger for this form change.
  */
  @ApiModelProperty(required = true, value = "The trigger for this form change.")

  private String trigger;

 /**
  * The name of the required item, ability, or move. Only present for a resource-based trigger.
  */
  @ApiModelProperty(value = "The name of the required item, ability, or move. Only present for a resource-based trigger.")

  private String name;

 /**
  * The URL of the required item, ability, or move. Only present for a resource-based trigger.
  */
  @ApiModelProperty(value = "The URL of the required item, ability, or move. Only present for a resource-based trigger.")

  private URI url;

 /**
  * The required base form. Only present when the trigger specifies one.
  */
  @ApiModelProperty(value = "The required base form. Only present when the trigger specifies one.")

  @Valid

  private PokemonFormSummary baseForm;
 /**
   * The trigger for this form change.
   * @return trigger
  **/
  @JsonProperty("trigger")
  @NotNull
  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public PokemonFormTriggerCondition trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

 /**
   * The name of the required item, ability, or move. Only present for a resource-based trigger.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonFormTriggerCondition name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The URL of the required item, ability, or move. Only present for a resource-based trigger.
   * @return url
  **/
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public PokemonFormTriggerCondition url(URI url) {
    this.url = url;
    return this;
  }

 /**
   * The required base form. Only present when the trigger specifies one.
   * @return baseForm
  **/
  @JsonProperty("base_form")
  public PokemonFormSummary getBaseForm() {
    return baseForm;
  }

  public void setBaseForm(PokemonFormSummary baseForm) {
    this.baseForm = baseForm;
  }

  public PokemonFormTriggerCondition baseForm(PokemonFormSummary baseForm) {
    this.baseForm = baseForm;
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
    PokemonFormTriggerCondition pokemonFormTriggerCondition = (PokemonFormTriggerCondition) o;
    return Objects.equals(this.trigger, pokemonFormTriggerCondition.trigger) &&
        Objects.equals(this.name, pokemonFormTriggerCondition.name) &&
        Objects.equals(this.url, pokemonFormTriggerCondition.url) &&
        Objects.equals(this.baseForm, pokemonFormTriggerCondition.baseForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trigger, name, url, baseForm);
  }

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

