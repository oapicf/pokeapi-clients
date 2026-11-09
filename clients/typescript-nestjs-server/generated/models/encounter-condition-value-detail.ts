import { EncounterConditionSummary } from './encounter-condition-summary';
import { EncounterConditionValueName } from './encounter-condition-value-name';


export interface EncounterConditionValueDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The condition this encounter condition value pertains to.
   */
  condition: EncounterConditionSummary;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<EncounterConditionValueName>;
}

