<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BerryFlavorDetailBerriesInnerBerry
{
    /**
     * The name of the berry
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The URL to get more information about the berry
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

}
