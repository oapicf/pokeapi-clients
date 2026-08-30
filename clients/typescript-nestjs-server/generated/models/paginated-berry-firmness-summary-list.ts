import { BerryFirmnessSummary } from './berry-firmness-summary';


export interface PaginatedBerryFirmnessSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<BerryFirmnessSummary>;
}

