<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
{
    /**
     * @DTA\Data(field="chance")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $chance = null;

    /**
     * @DTA\Data(field="condition_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection219::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection219::class})
     */
    public ?\App\DTO\Collection219 $condition_values = null;

    /**
     * @DTA\Data(field="max_level")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $max_level = null;

    /**
     * @DTA\Data(field="method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod::class})
     */
    public ?\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod $method = null;

    /**
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $min_level = null;

}
