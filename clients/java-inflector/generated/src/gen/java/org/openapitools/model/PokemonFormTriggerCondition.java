package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.model.PokemonFormSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormTriggerCondition   {
  @JsonProperty("trigger")
  private String trigger;

  @JsonProperty("name")
  private String name;

  @JsonProperty("url")
  private URI url;

  @JsonProperty("base_form")
  private PokemonFormSummary baseForm;

  /**
   * The trigger for this form change.
   **/
  public PokemonFormTriggerCondition trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The trigger for this form change.")
  @JsonProperty("trigger")
  public String getTrigger() {
    return trigger;
  }
  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  /**
   * The name of the required item, ability, or move. Only present for a resource-based trigger.
   **/
  public PokemonFormTriggerCondition name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the required item, ability, or move. Only present for a resource-based trigger.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The URL of the required item, ability, or move. Only present for a resource-based trigger.
   **/
  public PokemonFormTriggerCondition url(URI url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The URL of the required item, ability, or move. Only present for a resource-based trigger.")
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }
  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * The required base form. Only present when the trigger specifies one.
   **/
  public PokemonFormTriggerCondition baseForm(PokemonFormSummary baseForm) {
    this.baseForm = baseForm;
    return this;
  }

  
  @ApiModelProperty(value = "The required base form. Only present when the trigger specifies one.")
  @JsonProperty("base_form")
  public PokemonFormSummary getBaseForm() {
    return baseForm;
  }
  public void setBaseForm(PokemonFormSummary baseForm) {
    this.baseForm = baseForm;
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
    return Objects.equals(trigger, pokemonFormTriggerCondition.trigger) &&
        Objects.equals(name, pokemonFormTriggerCondition.name) &&
        Objects.equals(url, pokemonFormTriggerCondition.url) &&
        Objects.equals(baseForm, pokemonFormTriggerCondition.baseForm);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

