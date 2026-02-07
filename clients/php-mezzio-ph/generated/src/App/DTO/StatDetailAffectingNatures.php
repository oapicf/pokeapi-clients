<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class StatDetailAffectingNatures
{
    /**
     * @DTA\Data(field="increase")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection185::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection185::class})
     * @var \App\DTO\Collection185|null
     */
    public $increase;

    /**
     * @DTA\Data(field="decrease")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection186::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection186::class})
     * @var \App\DTO\Collection186|null
     */
    public $decrease;

}
