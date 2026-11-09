package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.EvolutionVariableSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * EvolutionConditionExpression
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionConditionExpression   {
  @JsonProperty("expression")
  private String expression;

  @JsonProperty("percentage_chance")
  private Double percentageChance;

  @JsonProperty("variables")
  
  private List<EvolutionVariableSummary> variables = new ArrayList<>();

  public EvolutionConditionExpression expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
   * @return expression
   */
  @ApiModelProperty(required = true, value = "Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public EvolutionConditionExpression percentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
    return this;
  }

  /**
   * Percentage chance of evolution under this condition (0-100)
   * @return percentageChance
   */
  @ApiModelProperty(required = true, value = "Percentage chance of evolution under this condition (0-100)")
  public Double getPercentageChance() {
    return percentageChance;
  }

  public void setPercentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
  }

  public EvolutionConditionExpression variables(List<EvolutionVariableSummary> variables) {
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
  @ApiModelProperty(required = true, value = "Evolution variables referenced in the expression")
  public List<EvolutionVariableSummary> getVariables() {
    return variables;
  }

  public void setVariables(List<EvolutionVariableSummary> variables) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

