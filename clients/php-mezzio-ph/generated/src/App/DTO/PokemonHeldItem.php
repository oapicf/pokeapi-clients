<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonHeldItem
{
    /**
     * The Pokémon that holds this item.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     * @var \App\DTO\PokemonSummary|null
     */
    public $pokemon;

    /**
     * The details for the version that this item is held in by the Pokémon.
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     * @var \App\DTO\Collection61|null
     */
    public $version_details;

}
