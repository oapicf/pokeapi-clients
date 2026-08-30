import { ItemSummary } from './item-summary';


export interface PaginatedItemSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<ItemSummary>;
}

