import { NatureSummary } from './nature-summary';


export interface PaginatedNatureSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<NatureSummary>;
}

