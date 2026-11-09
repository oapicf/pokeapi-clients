package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EvolutionVariableSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class EvolutionConditionExpression   {
  
  private String expression;

  private Double percentageChance;

  private List<@Valid EvolutionVariableSummary> variables = new ArrayList<>();

  /**
   * Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)
   **/
  public EvolutionConditionExpression expression(String expression) {
    this.expression = expression;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')")
  @JsonProperty("expression")
  @NotNull
  public String getExpression() {
    return expression;
  }
  public void setExpression(String expression) {
    this.expression = expression;
  }


  /**
   * Percentage chance of evolution under this condition (0-100)
   **/
  public EvolutionConditionExpression percentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Percentage chance of evolution under this condition (0-100)")
  @JsonProperty("percentage_chance")
  @NotNull
  public Double getPercentageChance() {
    return percentageChance;
  }
  public void setPercentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
  }


  /**
   * Evolution variables referenced in the expression
   **/
  public EvolutionConditionExpression variables(List<@Valid EvolutionVariableSummary> variables) {
    this.variables = variables;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Evolution variables referenced in the expression")
  @JsonProperty("variables")
  @NotNull
  public List<@Valid EvolutionVariableSummary> getVariables() {
    return variables;
  }
  public void setVariables(List<@Valid EvolutionVariableSummary> variables) {
    this.variables = variables;
  }

  public EvolutionConditionExpression addVariablesItem(EvolutionVariableSummary variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

