import { EggGroupSummary } from './egg-group-summary';


export interface PaginatedEggGroupSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<EggGroupSummary>;
}

