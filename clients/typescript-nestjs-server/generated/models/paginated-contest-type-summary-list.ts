import { ContestTypeSummary } from './contest-type-summary';


export interface PaginatedContestTypeSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<ContestTypeSummary>;
}

