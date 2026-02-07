<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BerryDetailFlavorsInner
{
    /**
     * @DTA\Data(field="potency")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $potency = null;

    /**
     * @DTA\Data(field="flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryDetailFlavorsInnerFlavor::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryDetailFlavorsInnerFlavor::class})
     */
    public ?\App\DTO\BerryDetailFlavorsInnerFlavor $flavor = null;

}
