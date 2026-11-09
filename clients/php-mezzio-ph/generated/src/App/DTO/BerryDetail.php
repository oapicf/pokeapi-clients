<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BerryDetail
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
     * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
     * @DTA\Data(field="growth_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $growth_time;

    /**
     * The maximum number of these berries that can grow on one tree in Generation IV.
     * @DTA\Data(field="max_harvest", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $max_harvest;

    /**
     * The power of the move \&quot;Natural Gift\&quot; when used with this Berry.
     * @DTA\Data(field="natural_gift_power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $natural_gift_power;

    /**
     * The size of this Berry, in millimeters.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $size;

    /**
     * The smoothness of this Berry, used in making Pokéblocks or Poffins.
     * @DTA\Data(field="smoothness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $smoothness;

    /**
     * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
     * @DTA\Data(field="soil_dryness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $soil_dryness;

    /**
     * The firmness of this berry, used in making Pokéblocks or Poffins.
     * @DTA\Data(field="firmness")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFirmnessSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFirmnessSummary::class})
     * @var \App\DTO\BerryFirmnessSummary|null
     */
    public $firmness;

    /**
     * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
     * @DTA\Data(field="flavors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection8::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection8::class})
     * @var \App\DTO\Collection8|null
     */
    public $flavors;

    /**
     * Berries are actually items. This is a reference to the item specific data for this berry.
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     * @var \App\DTO\ItemSummary|null
     */
    public $item;

    /**
     * The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.
     * @DTA\Data(field="natural_gift_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     * @var \App\DTO\TypeSummary|null
     */
    public $natural_gift_type;

}
