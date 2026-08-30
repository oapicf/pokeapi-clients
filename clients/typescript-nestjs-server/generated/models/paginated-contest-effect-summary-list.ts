import { ContestEffectSummary } from './contest-effect-summary';


export interface PaginatedContestEffectSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<ContestEffectSummary>;
}

