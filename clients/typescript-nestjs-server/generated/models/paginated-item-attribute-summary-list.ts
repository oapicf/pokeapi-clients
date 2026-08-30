import { ItemAttributeSummary } from './item-attribute-summary';


export interface PaginatedItemAttributeSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<ItemAttributeSummary>;
}

