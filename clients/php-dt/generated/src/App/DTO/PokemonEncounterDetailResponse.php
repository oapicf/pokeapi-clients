<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonEncounterDetailResponse
{
    /**
     * Percent chance that this encounter will occur.
     * @DTA\Data(field="chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $chance = null;

    /**
     * A list of condition values that must be in effect for this encounter to occur.
     * @DTA\Data(field="condition_values")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $condition_values = null;

    /**
     * The highest level the Pokémon could be encountered at.
     * @DTA\Data(field="max_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_level = null;

    /**
     * The method by which this encounter happens.
     * @DTA\Data(field="method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EncounterMethodSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EncounterMethodSummary::class})
     */
    public ?\App\DTO\EncounterMethodSummary $method = null;

    /**
     * The lowest level the Pokémon could be encountered at.
     * @DTA\Data(field="min_level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_level = null;

}
