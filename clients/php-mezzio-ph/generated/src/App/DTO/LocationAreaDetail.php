<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationAreaDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $game_index;

    /**
     * @DTA\Data(field="encounter_method_rates")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection84::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection84::class})
     * @var \App\DTO\Collection84|null
     */
    public $encounter_method_rates;

    /**
     * @DTA\Data(field="location")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationSummary::class})
     * @var \App\DTO\LocationSummary|null
     */
    public $location;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection85::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection85::class})
     * @var \App\DTO\Collection85|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection87::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection87::class})
     * @var \App\DTO\Collection87|null
     */
    public $pokemon_encounters;

}
