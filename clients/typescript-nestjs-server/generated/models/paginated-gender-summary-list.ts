import { GenderSummary } from './gender-summary';


export interface PaginatedGenderSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<GenderSummary>;
}

