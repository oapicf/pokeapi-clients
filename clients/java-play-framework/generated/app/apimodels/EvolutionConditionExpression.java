package apimodels;

import apimodels.EvolutionVariableSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EvolutionConditionExpression
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EvolutionConditionExpression   {
  @JsonProperty("expression")
  @NotNull

  private String expression;

  @JsonProperty("percentage_chance")
  @NotNull

  private Double percentageChance;

  @JsonProperty("variables")
  @NotNull
@Valid

  private List<@Valid EvolutionVariableSummary> variables = new ArrayList<>();

  public EvolutionConditionExpression expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
   * @return expression
  **/
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
  **/
  public Double getPercentageChance() {
    return percentageChance;
  }

  public void setPercentageChance(Double percentageChance) {
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
  **/
  public List<@Valid EvolutionVariableSummary> getVariables() {
    return variables;
  }

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
    return Objects.equals(expression, evolutionConditionExpression.expression) &&
        Objects.equals(percentageChance, evolutionConditionExpression.percentageChance) &&
        Objects.equals(variables, evolutionConditionExpression.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, percentageChance, variables);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

