<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationAreaPokemonEncounter
{
    /**
     * The Pokémon being encountered.
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSummary::class})
     * @var \App\DTO\PokemonSummary|null
     */
    public $pokemon;

    /**
     * A list of versions and encounters with Pokémon that might happen in the referenced location area.
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection91::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection91::class})
     * @var \App\DTO\Collection91|null
     */
    public $version_details;

}
