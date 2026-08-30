import { VersionSummary } from './version-summary';


export interface PaginatedVersionSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<VersionSummary>;
}

