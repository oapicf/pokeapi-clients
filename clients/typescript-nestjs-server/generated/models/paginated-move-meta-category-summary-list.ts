import { MoveMetaCategorySummary } from './move-meta-category-summary';


export interface PaginatedMoveMetaCategorySummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MoveMetaCategorySummary>;
}

