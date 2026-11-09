

export interface EncounterPokemonDetail { 
  /**
   * The minimum number of perfect IVs, or null if unspecified.
   */
  min_perfect_ivs?: number | null;
  /**
   * Whether the encountered Pokémon is always shiny.
   */
  always_shiny?: boolean;
  /**
   * Whether the encountered Pokémon can never be shiny.
   */
  never_shiny?: boolean;
  /**
   * Whether the encountered Pokémon is an alpha Pokémon.
   */
  is_alpha?: boolean;
}

