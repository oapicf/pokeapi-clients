import { GrowthRateSummary } from './growth-rate-summary';


export interface PaginatedGrowthRateSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<GrowthRateSummary>;
}

