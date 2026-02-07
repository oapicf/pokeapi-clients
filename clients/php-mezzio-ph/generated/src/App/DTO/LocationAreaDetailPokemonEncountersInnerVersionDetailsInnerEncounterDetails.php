<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
{
    /**
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_level;

    /**
     * @DTA\Data(field="max_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_level;

    /**
     * @DTA\Data(field="condition_values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $condition_values;

    /**
     * @DTA\Data(field="chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $chance;

    /**
     * @DTA\Data(field="method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $method;

}
