import { EncounterConditionValueSummary } from './encounter-condition-value-summary';


export interface PaginatedEncounterConditionValueSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<EncounterConditionValueSummary>;
}

