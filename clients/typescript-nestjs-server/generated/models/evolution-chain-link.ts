import { PokemonEvolution } from './pokemon-evolution';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface EvolutionChainLink { 
  /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   */
  is_baby: boolean;
  /**
   * The Pokémon species at this point in the evolution chain.
   */
  species: PokemonSpeciesSummary;
  /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   */
  evolution_details: Array<PokemonEvolution>;
  /**
   * A List of chain objects.
   */
  readonly evolves_to: Array<EvolutionChainLink>;
}

