import { EvolutionTriggerSummary } from './evolution-trigger-summary';


export interface PaginatedEvolutionTriggerSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<EvolutionTriggerSummary>;
}

