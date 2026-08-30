import { CharacteristicSummary } from './characteristic-summary';


export interface PaginatedCharacteristicSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<CharacteristicSummary>;
}

