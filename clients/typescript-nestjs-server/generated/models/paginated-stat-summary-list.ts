import { StatSummary } from './stat-summary';


export interface PaginatedStatSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<StatSummary>;
}

