<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
{
    /**
     * @DTA\Data(field="chance")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $chance;

    /**
     * @DTA\Data(field="condition_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection219::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection219::class})
     * @var \App\DTO\Collection219|null
     */
    public $condition_values;

    /**
     * @DTA\Data(field="max_level")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $max_level;

    /**
     * @DTA\Data(field="method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod::class})
     * @var \App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod|null
     */
    public $method;

    /**
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $min_level;

}
