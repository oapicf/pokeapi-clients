import { MoveBattleStyleSummary } from './move-battle-style-summary';


export interface PaginatedMoveBattleStyleSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MoveBattleStyleSummary>;
}

