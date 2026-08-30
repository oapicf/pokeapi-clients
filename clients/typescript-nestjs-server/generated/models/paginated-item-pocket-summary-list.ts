import { ItemPocketSummary } from './item-pocket-summary';


export interface PaginatedItemPocketSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<ItemPocketSummary>;
}

