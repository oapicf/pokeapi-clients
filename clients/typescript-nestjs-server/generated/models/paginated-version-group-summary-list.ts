import { VersionGroupSummary } from './version-group-summary';


export interface PaginatedVersionGroupSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<VersionGroupSummary>;
}

