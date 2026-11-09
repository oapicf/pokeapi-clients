package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonFormTriggerCondition
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormTriggerCondition {

  private String trigger;

  private String name;

  private URI url;

  private PokemonFormSummary baseForm;

  public PokemonFormTriggerCondition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonFormTriggerCondition(String trigger) {
    this.trigger = trigger;
  }

  public PokemonFormTriggerCondition trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * The trigger for this form change.
   * @return trigger
   */
  @NotNull 
  @Schema(name = "trigger", description = "The trigger for this form change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trigger")
  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public PokemonFormTriggerCondition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the required item, ability, or move. Only present for a resource-based trigger.
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the required item, ability, or move. Only present for a resource-based trigger.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonFormTriggerCondition url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the required item, ability, or move. Only present for a resource-based trigger.
   * @return url
   */
  @Valid 
  @Schema(name = "url", description = "The URL of the required item, ability, or move. Only present for a resource-based trigger.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public PokemonFormTriggerCondition baseForm(PokemonFormSummary baseForm) {
    this.baseForm = baseForm;
    return this;
  }

  /**
   * The required base form. Only present when the trigger specifies one.
   * @return baseForm
   */
  @Valid 
  @Schema(name = "base_form", description = "The required base form. Only present when the trigger specifies one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

