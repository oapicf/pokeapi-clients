import { MoveDamageClassSummary } from './move-damage-class-summary';


export interface PaginatedMoveDamageClassSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MoveDamageClassSummary>;
}

