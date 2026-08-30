import { LocationAreaSummary } from './location-area-summary';


export interface PaginatedLocationAreaSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<LocationAreaSummary>;
}

