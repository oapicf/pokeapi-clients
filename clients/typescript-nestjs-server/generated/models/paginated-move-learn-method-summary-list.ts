import { MoveLearnMethodSummary } from './move-learn-method-summary';


export interface PaginatedMoveLearnMethodSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MoveLearnMethodSummary>;
}

