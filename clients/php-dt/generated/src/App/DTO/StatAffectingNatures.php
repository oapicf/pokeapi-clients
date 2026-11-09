<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class StatAffectingNatures
{
    /**
     * A list of natures and how they change the referenced stat.
     * @DTA\Data(field="increase")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $increase = null;

    /**
     * A list of nature sand how they change the referenced stat.
     * @DTA\Data(field="decrease")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $decrease = null;

}
