<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BerryDetail
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
     * @DTA\Data(field="growth_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $growth_time = null;

    /**
     * @DTA\Data(field="max_harvest")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_harvest = null;

    /**
     * @DTA\Data(field="natural_gift_power")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $natural_gift_power = null;

    /**
     * @DTA\Data(field="size")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $size = null;

    /**
     * @DTA\Data(field="smoothness")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $smoothness = null;

    /**
     * @DTA\Data(field="soil_dryness")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $soil_dryness = null;

    /**
     * @DTA\Data(field="firmness")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFirmnessSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFirmnessSummary::class})
     */
    public ?\App\DTO\BerryFirmnessSummary $firmness = null;

    /**
     * @DTA\Data(field="flavors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection8::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection8::class})
     */
    public ?\App\DTO\Collection8 $flavors = null;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $item = null;

    /**
     * @DTA\Data(field="natural_gift_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     */
    public ?\App\DTO\TypeSummary $natural_gift_type = null;

}
