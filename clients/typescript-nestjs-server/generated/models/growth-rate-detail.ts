import { Experience } from './experience';
import { GrowthRateDescription } from './growth-rate-description';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface GrowthRateDetail { 
  readonly id: number;
  name: string;
  formula: string;
  readonly descriptions: Array<GrowthRateDescription>;
  readonly levels: Array<Experience>;
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

