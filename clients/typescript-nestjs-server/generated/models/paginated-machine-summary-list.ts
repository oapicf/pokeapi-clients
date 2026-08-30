import { MachineSummary } from './machine-summary';


export interface PaginatedMachineSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MachineSummary>;
}

