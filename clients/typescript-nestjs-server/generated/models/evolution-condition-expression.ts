import { EvolutionVariableSummary } from './evolution-variable-summary';


export interface EvolutionConditionExpression { 
  /**
   * Evaluatable RPN condition expression using evolution variables (e.g. \'EC 100 % 0 ==\')
   */
  expression: string;
  /**
   * Percentage chance of evolution under this condition (0-100)
   */
  percentage_chance: number | null;
  /**
   * Evolution variables referenced in the expression
   */
  variables: Array<EvolutionVariableSummary>;
}

