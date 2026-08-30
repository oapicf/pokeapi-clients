import { MoveTargetSummary } from './move-target-summary';


export interface PaginatedMoveTargetSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MoveTargetSummary>;
}

