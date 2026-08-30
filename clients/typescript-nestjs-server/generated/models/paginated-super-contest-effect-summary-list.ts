import { SuperContestEffectSummary } from './super-contest-effect-summary';


export interface PaginatedSuperContestEffectSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<SuperContestEffectSummary>;
}

