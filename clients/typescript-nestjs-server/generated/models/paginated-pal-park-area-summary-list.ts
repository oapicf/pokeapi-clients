import { PalParkAreaSummary } from './pal-park-area-summary';


export interface PaginatedPalParkAreaSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PalParkAreaSummary>;
}

