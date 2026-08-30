import { LocationSummary } from './location-summary';


export interface PaginatedLocationSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<LocationSummary>;
}

