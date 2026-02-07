<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokeathlonStatDetailAffectingNatures
{
    /**
     * @DTA\Data(field="decrease")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection174::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection174::class})
     * @var \App\DTO\Collection174|null
     */
    public $decrease;

    /**
     * @DTA\Data(field="increase")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection175::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection175::class})
     * @var \App\DTO\Collection175|null
     */
    public $increase;

}
