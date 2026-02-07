<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BerryFlavorDetailBerriesInner
{
    /**
     * @DTA\Data(field="potency")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $potency = null;

    /**
     * @DTA\Data(field="berry")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorDetailBerriesInnerBerry::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorDetailBerriesInnerBerry::class})
     */
    public ?\App\DTO\BerryFlavorDetailBerriesInnerBerry $berry = null;

}
