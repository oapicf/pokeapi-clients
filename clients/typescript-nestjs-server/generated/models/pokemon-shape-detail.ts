import { PokemonShapeAwesomeName } from './pokemon-shape-awesome-name';
import { PokemonShapeName } from './pokemon-shape-name';
import { PokemonSpeciesSummary } from './pokemon-species-summary';


export interface PokemonShapeDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The \"scientific\" name of this Pokémon shape listed in different languages.
   */
  readonly awesome_names: Array<PokemonShapeAwesomeName>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<PokemonShapeName>;
  /**
   * A list of the Pokémon species that have this shape.
   */
  readonly pokemon_species: Array<PokemonSpeciesSummary>;
}

