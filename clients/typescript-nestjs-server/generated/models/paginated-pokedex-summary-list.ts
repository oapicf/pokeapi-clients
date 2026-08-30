import { PokedexSummary } from './pokedex-summary';


export interface PaginatedPokedexSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokedexSummary>;
}

