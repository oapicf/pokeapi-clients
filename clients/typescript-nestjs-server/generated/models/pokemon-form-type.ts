import { TypeSummary } from './type-summary';


export interface PokemonFormType { 
  /**
   * The order the Pokémon\'s types are listed in.
   */
  slot: number;
  /**
   * The type the referenced Form has.
   */
  type: TypeSummary;
}

