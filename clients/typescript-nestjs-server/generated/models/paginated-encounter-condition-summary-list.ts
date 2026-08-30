import { EncounterConditionSummary } from './encounter-condition-summary';


export interface PaginatedEncounterConditionSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<EncounterConditionSummary>;
}

