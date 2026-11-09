<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpritesOther
{
    /**
     * Pokémon Dream World artwork URLs.
     * @DTA\Data(field="dream_world", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherDreamWorld::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherDreamWorld::class})
     * @var \App\DTO\PokemonSpritesOtherDreamWorld|null
     */
    public $dream_world;

    /**
     * Pokémon HOME sprite URLs.
     * @DTA\Data(field="home", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherHome::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherHome::class})
     * @var \App\DTO\PokemonSpritesOtherHome|null
     */
    public $home;

    /**
     * Pokémon Showdown sprite URLs.
     * @DTA\Data(field="showdown", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherShowdown::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherShowdown::class})
     * @var \App\DTO\PokemonSpritesOtherShowdown|null
     */
    public $showdown;

    /**
     * Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
     * @DTA\Data(field="official-artwork", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpritesOtherOfficialArtwork::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpritesOtherOfficialArtwork::class})
     * @var \App\DTO\PokemonSpritesOtherOfficialArtwork|null
     */
    public $official_artwork;

}
