<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationAreaEncounterDetail
{
    /**
     * The lowest level the Pokémon could be encountered at.
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_level;

    /**
     * The highest level the Pokémon could be encountered at.
     * @DTA\Data(field="max_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_level;

    /**
     * Percent chance that this encounter will occur.
     * @DTA\Data(field="chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $chance;

    /**
     * The method by which this encounter happens.
     * @DTA\Data(field="method", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EncounterMethodSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EncounterMethodSummary::class})
     * @var \App\DTO\EncounterMethodSummary|null
     */
    public $method;

    /**
     * A list of condition values that must be in effect for this encounter to occur.
     * @DTA\Data(field="condition_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection89::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection89::class})
     * @var \App\DTO\Collection89|null
     */
    public $condition_values;

    /**
     * Additional properties of the encountered Pokémon, or null if unspecified.
     * @DTA\Data(field="pokemon_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EncounterPokemonDetail::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EncounterPokemonDetail::class})
     * @var \App\DTO\EncounterPokemonDetail|null
     */
    public $pokemon_details;

}
