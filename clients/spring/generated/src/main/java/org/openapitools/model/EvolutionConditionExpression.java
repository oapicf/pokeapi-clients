package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EvolutionVariableSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EvolutionConditionExpression
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionConditionExpression {

  private String expression;

  private JsonNullable<Double> percentageChance = JsonNullable.<Double>undefined();

  private List<@Valid EvolutionVariableSummary> variables = new ArrayList<>();

  public EvolutionConditionExpression() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionConditionExpression(String expression, Double percentageChance, List<@Valid EvolutionVariableSummary> variables) {
    this.expression = expression;
    this.percentageChance = JsonNullable.of(percentageChance);
    this.variables = variables;
  }

  public EvolutionConditionExpression expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
   * @return expression
   */
  @NotNull 
  @Schema(name = "expression", description = "Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  @JsonProperty("expression")
  public void setExpression(String expression) {
    this.expression = expression;
  }

  public EvolutionConditionExpression percentageChance(Double percentageChance) {
    this.percentageChance = JsonNullable.of(percentageChance);
    return this;
  }

  /**
   * Percentage chance of evolution under this condition (0-100)
   * @return percentageChance
   */
  /* @Present */ 
  @Schema(name = "percentage_chance", description = "Percentage chance of evolution under this condition (0-100)", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("percentage_chance")
  public JsonNullable<Double> getPercentageChance() {
    return percentageChance;
  }

  @JsonProperty("percentage_chance")
  public void setPercentageChance(JsonNullable<Double> percentageChance) {
    this.percentageChance = percentageChance;
  }

  public EvolutionConditionExpression variables(List<@Valid EvolutionVariableSummary> variables) {
    this.variables = variables;
    return this;
  }

  public EvolutionConditionExpression addVariablesItem(EvolutionVariableSummary variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Evolution variables referenced in the expression
   * @return variables
   */
  @NotNull 
  @Schema(name = "variables", description = "Evolution variables referenced in the expression", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("variables")
  public List<@Valid EvolutionVariableSummary> getVariables() {
    return variables;
  }

  @JsonProperty("variables")
  public void setVariables(List<@Valid EvolutionVariableSummary> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionConditionExpression evolutionConditionExpression = (EvolutionConditionExpression) o;
    return Objects.equals(this.expression, evolutionConditionExpression.expression) &&
        Objects.equals(this.percentageChance, evolutionConditionExpression.percentageChance) &&
        Objects.equals(this.variables, evolutionConditionExpression.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, percentageChance, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionConditionExpression {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    percentageChance: ").append(toIndentedString(percentageChance)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

