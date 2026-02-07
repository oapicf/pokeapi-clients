<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $game_index = null;

    /**
     * @DTA\Data(field="encounter_method_rates")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection84::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection84::class})
     */
    public ?\App\DTO\Collection84 $encounter_method_rates = null;

    /**
     * @DTA\Data(field="location")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationSummary::class})
     */
    public ?\App\DTO\LocationSummary $location = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection85::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection85::class})
     */
    public ?\App\DTO\Collection85 $names = null;

    /**
     * @DTA\Data(field="pokemon_encounters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection87::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection87::class})
     */
    public ?\App\DTO\Collection87 $pokemon_encounters = null;

}
