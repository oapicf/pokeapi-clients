package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.EvolutionVariableSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionConditionExpression   {
  
  private String expression;
  private Double percentageChance;
  private List<EvolutionVariableSummary> variables = new ArrayList<>();

  public EvolutionConditionExpression () {

  }

  public EvolutionConditionExpression (String expression, Double percentageChance, List<EvolutionVariableSummary> variables) {
    this.expression = expression;
    this.percentageChance = percentageChance;
    this.variables = variables;
  }

    
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }
  public void setExpression(String expression) {
    this.expression = expression;
  }

    
  @JsonProperty("percentage_chance")
  public Double getPercentageChance() {
    return percentageChance;
  }
  public void setPercentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
  }

    
  @JsonProperty("variables")
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
    return Objects.equals(expression, evolutionConditionExpression.expression) &&
        Objects.equals(percentageChance, evolutionConditionExpression.percentageChance) &&
        Objects.equals(variables, evolutionConditionExpression.variables);
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
