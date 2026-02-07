<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
{
    /**
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_level = null;

    /**
     * @DTA\Data(field="max_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_level = null;

    /**
     * @DTA\Data(field="condition_values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $condition_values = null;

    /**
     * @DTA\Data(field="chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $chance = null;

    /**
     * @DTA\Data(field="method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $method = null;

}
