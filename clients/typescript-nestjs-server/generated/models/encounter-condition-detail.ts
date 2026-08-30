import { EncounterConditionValueSummary } from './encounter-condition-value-summary';
import { EncounterConditionName } from './encounter-condition-name';


export interface EncounterConditionDetail { 
  readonly id: number;
  name: string;
  readonly values: Array<EncounterConditionValueSummary>;
  readonly names: Array<EncounterConditionName>;
}

