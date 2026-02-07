<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class GenerationDetail
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
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection41::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection41::class})
     * @var \App\DTO\Collection41|null
     */
    public $abilities;

    /**
     * @DTA\Data(field="main_region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     * @var \App\DTO\RegionSummary|null
     */
    public $main_region;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection42::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection42::class})
     * @var \App\DTO\Collection42|null
     */
    public $moves;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection43::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection43::class})
     * @var \App\DTO\Collection43|null
     */
    public $names;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection44::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection44::class})
     * @var \App\DTO\Collection44|null
     */
    public $pokemon_species;

    /**
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection45::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection45::class})
     * @var \App\DTO\Collection45|null
     */
    public $types;

    /**
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection46::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection46::class})
     * @var \App\DTO\Collection46|null
     */
    public $version_groups;

}
