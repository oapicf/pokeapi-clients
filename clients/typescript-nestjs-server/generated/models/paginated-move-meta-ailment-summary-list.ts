import { MoveMetaAilmentSummary } from './move-meta-ailment-summary';


export interface PaginatedMoveMetaAilmentSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<MoveMetaAilmentSummary>;
}

