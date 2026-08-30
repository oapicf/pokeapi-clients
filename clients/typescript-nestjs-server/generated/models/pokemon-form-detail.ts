import { VersionGroupSummary } from './version-group-summary';
import { PokemonFormDetailFormNamesInner } from './pokemon-form-detail-form-names-inner';
import { PokemonSummary } from './pokemon-summary';
import { PokemonFormDetailSprites } from './pokemon-form-detail-sprites';
import { PokemonDetailTypesInner } from './pokemon-detail-types-inner';


export interface PokemonFormDetail { 
  readonly id: number;
  name: string;
  order?: number | null;
  form_order?: number | null;
  is_default?: boolean;
  is_battle_only?: boolean;
  is_mega?: boolean;
  form_name: string;
  pokemon: PokemonSummary;
  sprites: PokemonFormDetailSprites;
  version_group: VersionGroupSummary;
  readonly form_names: Array<PokemonFormDetailFormNamesInner>;
  readonly names: Array<PokemonFormDetailFormNamesInner>;
  readonly types: Array<PokemonDetailTypesInner>;
}

