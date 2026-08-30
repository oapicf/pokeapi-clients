import { EncounterMethodSummary } from './encounter-method-summary';


export interface PaginatedEncounterMethodSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<EncounterMethodSummary>;
}

