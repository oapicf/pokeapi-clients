import { ItemFlingEffectSummary } from './item-fling-effect-summary';


export interface PaginatedItemFlingEffectSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<ItemFlingEffectSummary>;
}

