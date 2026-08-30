import { BerryFlavorSummary } from './berry-flavor-summary';


export interface PaginatedBerryFlavorSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<BerryFlavorSummary>;
}

