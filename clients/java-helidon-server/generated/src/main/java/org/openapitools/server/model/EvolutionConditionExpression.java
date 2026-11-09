package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EvolutionVariableSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class EvolutionConditionExpression   {

    private String expression;
    private Double percentageChance;
    private List<@Valid EvolutionVariableSummary> variables = new ArrayList<>();

    /**
     * Default constructor.
     */
    public EvolutionConditionExpression() {
    // JSON-B / Jackson
    }

    /**
     * Create EvolutionConditionExpression.
     *
     * @param expression Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)
     * @param percentageChance Percentage chance of evolution under this condition (0-100)
     * @param variables Evolution variables referenced in the expression
     */
    public EvolutionConditionExpression(
        String expression, 
        Double percentageChance, 
        List<@Valid EvolutionVariableSummary> variables
    ) {
        this.expression = expression;
        this.percentageChance = percentageChance;
        this.variables = variables;
    }



    /**
     * Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
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
    public List<@Valid EvolutionVariableSummary> getVariables() {
        return variables;
    }

    public void setVariables(List<@Valid EvolutionVariableSummary> variables) {
        this.variables = variables;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

