package org.openapitools.model;

import org.openapitools.model.EvolutionVariableSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class EvolutionConditionExpression implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)
   */
  @JsonProperty("expression")
  private String expression;

  /**
   * Percentage chance of evolution under this condition (0-100)
   */
  @JsonProperty("percentage_chance")
  private Double percentageChance;

  /**
   * Evolution variables referenced in the expression
   */
  @JsonProperty("variables")
  private List<EvolutionVariableSummary> variables = new ArrayList<>();

  /**
   * Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)
   * @return expression
   */
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  /**
   * Percentage chance of evolution under this condition (0-100)
   * @return percentageChance
   */
  public Double getPercentageChance() {
    return percentageChance;
  }

  public void setPercentageChance(Double percentageChance) {
    this.percentageChance = percentageChance;
  }

  /**
   * Evolution variables referenced in the expression
   * @return variables
   */
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
