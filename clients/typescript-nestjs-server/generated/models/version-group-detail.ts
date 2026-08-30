import { GenerationSummary } from './generation-summary';
import { VersionSummary } from './version-summary';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface VersionGroupDetail { 
  readonly id: number;
  name: string;
  order?: number | null;
  generation: GenerationSummary;
  readonly move_learn_methods: Array<AbilityDetailPokemonInnerPokemon>;
  readonly pokedexes: Array<AbilityDetailPokemonInnerPokemon>;
  readonly regions: Array<AbilityDetailPokemonInnerPokemon>;
  readonly versions: Array<VersionSummary>;
}

