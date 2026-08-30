import { MoveLearnMethodName } from './move-learn-method-name';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { MoveLearnMethodDescription } from './move-learn-method-description';


export interface MoveLearnMethodDetail { 
  readonly id: number;
  name: string;
  readonly names: Array<MoveLearnMethodName>;
  readonly descriptions: Array<MoveLearnMethodDescription>;
  readonly version_groups: Array<AbilityDetailPokemonInnerPokemon>;
}

