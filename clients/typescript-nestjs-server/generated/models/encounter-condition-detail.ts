import { EncounterConditionValueSummary } from './encounter-condition-value-summary';
import { EncounterConditionName } from './encounter-condition-name';


export interface EncounterConditionDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of possible values for this encounter condition.
   */
  readonly values: Array<EncounterConditionValueSummary>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<EncounterConditionName>;
}

