<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BerryFlavorBerryMap
{
    /**
     * How powerful the referenced flavor is for this berry.
     * @DTA\Data(field="potency")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $potency = null;

    /**
     * The berry with the referenced flavor.
     * @DTA\Data(field="berry")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerrySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerrySummary::class})
     */
    public ?\App\DTO\BerrySummary $berry = null;

}
