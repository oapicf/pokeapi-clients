

export interface PokemonSpritesOtherOfficialArtwork { 
  /**
   * The URL of the default front official artwork, or null if unavailable.
   */
  front_default: string | null;
  /**
   * The URL of the shiny front official artwork, or null if unavailable.
   */
  front_shiny: string | null;
  /**
   * Additional official artwork grouped by version. Available keys vary by resource.
   */
  versions?: { [key: string]: { [key: string]: any | null; }; };
}

