<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MachineSummary
{
    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

}
