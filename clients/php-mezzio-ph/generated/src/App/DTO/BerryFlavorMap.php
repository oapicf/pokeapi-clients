<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BerryFlavorMap
{
    /**
     * How powerful the referenced flavor is for this berry.
     * @DTA\Data(field="potency")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $potency;

    /**
     * The referenced berry flavor.
     * @DTA\Data(field="flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @var \App\DTO\BerryFlavorSummary|null
     */
    public $flavor;

}
