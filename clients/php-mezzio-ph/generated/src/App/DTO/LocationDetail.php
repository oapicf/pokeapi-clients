<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * The region this location can be found in.
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     * @var \App\DTO\RegionSummary|null
     */
    public $region;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection82::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection82::class})
     * @var \App\DTO\Collection82|null
     */
    public $names;

    /**
     * A list of game indices relevent to this location by generation.
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection83::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection83::class})
     * @var \App\DTO\Collection83|null
     */
    public $game_indices;

    /**
     * Areas that can be found within this location.
     * @DTA\Data(field="areas")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection84::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection84::class})
     * @var \App\DTO\Collection84|null
     */
    public $areas;

}
