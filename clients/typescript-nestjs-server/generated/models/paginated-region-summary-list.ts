import { RegionSummary } from './region-summary';


export interface PaginatedRegionSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<RegionSummary>;
}

