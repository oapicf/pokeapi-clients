import { VersionGroupSummary } from './version-group-summary';
import { EvolutionVariableDescription } from './evolution-variable-description';
import { EvolutionVariableName } from './evolution-variable-name';


export interface EvolutionVariableDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The symbol used for this variable in evolution condition expressions.
   */
  symbol: string;
  /**
   * The data type of this variable.
   */
  data_type?: string;
  /**
   * The source of the variable value.
   */
  source?: string;
  /**
   * The version group in which this variable was introduced.
   */
  version_group: VersionGroupSummary;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<EvolutionVariableName>;
  /**
   * The description of this resource listed in different languages.
   */
  readonly descriptions: Array<EvolutionVariableDescription>;
}

