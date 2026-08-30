import { EncounterConditionSummary } from './encounter-condition-summary';
import { EncounterConditionValueName } from './encounter-condition-value-name';


export interface EncounterConditionValueDetail { 
  readonly id: number;
  name: string;
  condition: EncounterConditionSummary;
  readonly names: Array<EncounterConditionValueName>;
}

