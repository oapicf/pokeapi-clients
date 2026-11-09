<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BerryDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
     * @DTA\Data(field="growth_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $growth_time = null;

    /**
     * The maximum number of these berries that can grow on one tree in Generation IV.
     * @DTA\Data(field="max_harvest", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $max_harvest = null;

    /**
     * The power of the move \&quot;Natural Gift\&quot; when used with this Berry.
     * @DTA\Data(field="natural_gift_power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $natural_gift_power = null;

    /**
     * The size of this Berry, in millimeters.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $size = null;

    /**
     * The smoothness of this Berry, used in making Pokéblocks or Poffins.
     * @DTA\Data(field="smoothness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $smoothness = null;

    /**
     * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
     * @DTA\Data(field="soil_dryness", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $soil_dryness = null;

    /**
     * The firmness of this berry, used in making Pokéblocks or Poffins.
     * @DTA\Data(field="firmness")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFirmnessSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFirmnessSummary::class})
     */
    public ?\App\DTO\BerryFirmnessSummary $firmness = null;

    /**
     * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
     * @DTA\Data(field="flavors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection8::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection8::class})
     */
    public ?\App\DTO\Collection8 $flavors = null;

    /**
     * Berries are actually items. This is a reference to the item specific data for this berry.
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $item = null;

    /**
     * The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.
     * @DTA\Data(field="natural_gift_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     */
    public ?\App\DTO\TypeSummary $natural_gift_type = null;

}
