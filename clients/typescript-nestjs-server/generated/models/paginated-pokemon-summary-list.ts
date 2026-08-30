import { PokemonSummary } from './pokemon-summary';


export interface PaginatedPokemonSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokemonSummary>;
}

