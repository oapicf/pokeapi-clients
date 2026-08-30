import { MoveSummary } from './move-summary';


export interface PaginatedMoveSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MoveSummary>;
}

