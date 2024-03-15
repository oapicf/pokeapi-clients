<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for contest-effect_read
 */
class ContestEffectReadParameterData
{
    /**
     * @DTA\Data(subset="path", field="id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $id = null;

}
