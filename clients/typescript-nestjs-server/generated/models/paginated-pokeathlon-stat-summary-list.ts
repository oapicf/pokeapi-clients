import { PokeathlonStatSummary } from './pokeathlon-stat-summary';


export interface PaginatedPokeathlonStatSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokeathlonStatSummary>;
}

