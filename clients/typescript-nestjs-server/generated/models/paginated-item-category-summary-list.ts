import { ItemCategorySummary } from './item-category-summary';


export interface PaginatedItemCategorySummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<ItemCategorySummary>;
}

