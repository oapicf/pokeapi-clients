<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BerryDetail
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
     * @DTA\Data(field="growth_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $growth_time;

    /**
     * @DTA\Data(field="max_harvest")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_harvest;

    /**
     * @DTA\Data(field="natural_gift_power")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $natural_gift_power;

    /**
     * @DTA\Data(field="size")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $size;

    /**
     * @DTA\Data(field="smoothness")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $smoothness;

    /**
     * @DTA\Data(field="soil_dryness")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $soil_dryness;

    /**
     * @DTA\Data(field="firmness")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFirmnessSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFirmnessSummary::class})
     * @var \App\DTO\BerryFirmnessSummary|null
     */
    public $firmness;

    /**
     * @DTA\Data(field="flavors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection8::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection8::class})
     * @var \App\DTO\Collection8|null
     */
    public $flavors;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     * @var \App\DTO\ItemSummary|null
     */
    public $item;

    /**
     * @DTA\Data(field="natural_gift_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     * @var \App\DTO\TypeSummary|null
     */
    public $natural_gift_type;

}
