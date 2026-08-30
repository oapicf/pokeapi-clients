import { BerrySummary } from './berry-summary';


export interface PaginatedBerrySummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<BerrySummary>;
}

