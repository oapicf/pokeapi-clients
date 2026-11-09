import { EvolutionTriggerName } from './evolution-trigger-name';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface EvolutionTriggerDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<EvolutionTriggerName>;
  /**
   * A list of pokemon species that result from this evolution trigger.
   */
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

