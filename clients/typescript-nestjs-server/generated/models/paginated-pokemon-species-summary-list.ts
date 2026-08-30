import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PaginatedPokemonSpeciesSummaryList { 
  count?: number;
  next?: string;
  previous?: string;
  results?: Array<PokemonSpeciesSummary>;
}

