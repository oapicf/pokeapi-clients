import { PokemonSpritesOtherOfficialArtwork } from './pokemon-sprites-other-official-artwork';
import { PokemonSpritesOtherDreamWorld } from './pokemon-sprites-other-dream-world';
import { PokemonSpritesOtherHome } from './pokemon-sprites-other-home';
import { PokemonSpritesOtherShowdown } from './pokemon-sprites-other-showdown';


export interface PokemonSpritesOther { 
  /**
   * Pokémon Dream World artwork URLs.
   */
  dream_world?: PokemonSpritesOtherDreamWorld;
  /**
   * Pokémon HOME sprite URLs.
   */
  home?: PokemonSpritesOtherHome;
  /**
   * Pokémon Showdown sprite URLs.
   */
  showdown?: PokemonSpritesOtherShowdown;
  /**
   * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
   */
  'official-artwork'?: PokemonSpritesOtherOfficialArtwork;
}

