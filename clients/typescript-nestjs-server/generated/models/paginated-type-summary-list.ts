import { TypeSummary } from './type-summary';


export interface PaginatedTypeSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<TypeSummary>;
}

