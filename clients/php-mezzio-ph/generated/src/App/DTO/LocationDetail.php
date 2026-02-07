<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationDetail
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
     * @DTA\Data(field="region")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionSummary::class})
     * @var \App\DTO\RegionSummary|null
     */
    public $region;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection79::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection79::class})
     * @var \App\DTO\Collection79|null
     */
    public $names;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection80::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection80::class})
     * @var \App\DTO\Collection80|null
     */
    public $game_indices;

    /**
     * @DTA\Data(field="areas")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection81::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection81::class})
     * @var \App\DTO\Collection81|null
     */
    public $areas;

}
