<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonSpritesOther
{
    /**
     * Pokémon Dream World artwork URLs.
     * @DTA\Data(field="dream_world", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherDreamWorld::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherDreamWorld::class})
     */
    public ?\App\DTO\PokemonSpritesOtherDreamWorld $dream_world = null;

    /**
     * Pokémon HOME sprite URLs.
     * @DTA\Data(field="home", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherHome::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherHome::class})
     */
    public ?\App\DTO\PokemonSpritesOtherHome $home = null;

    /**
     * Pokémon Showdown sprite URLs.
     * @DTA\Data(field="showdown", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherShowdown::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherShowdown::class})
     */
    public ?\App\DTO\PokemonSpritesOtherShowdown $showdown = null;

    /**
     * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
     * @DTA\Data(field="official-artwork", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherOfficialArtwork::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherOfficialArtwork::class})
     */
    public ?\App\DTO\PokemonSpritesOtherOfficialArtwork $official_artwork = null;

}
