package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EvolutionVariableSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionConditionExpression  {
  
 /**
  * Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
  */
  @ApiModelProperty(required = true, value = "Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')")

  private String expression;

 /**
  * Percentage chance of evolution under this condition (0-100)
  */
  @ApiModelProperty(required = true, value = "Percentage chance of evolution under this condition (0-100)")

  private Double percentageChance;

 /**
  * Evolution variables referenced in the expression
  */
  @ApiModelProperty(required = true, value = "Evolution variables referenced in the expression")

  private List<EvolutionVariableSummary> variables = new ArrayList<>();
 /**
   * Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)
   * @return expression
  **/
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public EvolutionConditionExpression expression(String expression) {
    this.expression = expression;
    return this;
  }

 /**
   * Percentage chance of evolution under this condition (0-100)
   * @return percentageChance
  **/
  @JsonProperty("percentage_chance")
  public Double getPercentageChance() {
    return percentageChance;
  }

  public void setPercentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
  }

  public EvolutionConditionExpression percentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
    return this;
  }

 /**
   * Evolution variables referenced in the expression
   * @return variables
  **/
  @JsonProperty("variables")
  public List<EvolutionVariableSummary> getVariables() {
    return variables;
  }

  public void setVariables(List<EvolutionVariableSummary> variables) {
    this.variables = variables;
  }

  public EvolutionConditionExpression variables(List<EvolutionVariableSummary> variables) {
    this.variables = variables;
    return this;
  }

  public EvolutionConditionExpression addVariablesItem(EvolutionVariableSummary variablesItem) {
    this.variables.add(variablesItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

