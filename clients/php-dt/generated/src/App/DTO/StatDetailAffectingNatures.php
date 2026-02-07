<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class StatDetailAffectingNatures
{
    /**
     * @DTA\Data(field="increase")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection185::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection185::class})
     */
    public ?\App\DTO\Collection185 $increase = null;

    /**
     * @DTA\Data(field="decrease")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection186::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection186::class})
     */
    public ?\App\DTO\Collection186 $decrease = null;

}
