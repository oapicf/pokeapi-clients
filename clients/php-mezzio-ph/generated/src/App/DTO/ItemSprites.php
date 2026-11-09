<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemSprites
{
    /**
     * The default depiction of this item.
     * @DTA\Data(field="default")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $default;

}
