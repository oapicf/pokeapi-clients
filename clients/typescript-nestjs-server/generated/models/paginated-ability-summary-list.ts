import { AbilitySummary } from './ability-summary';


export interface PaginatedAbilitySummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<AbilitySummary>;
}

