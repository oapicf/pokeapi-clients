<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TypeGameSprite
{
    /**
     * The URL of the icon displaying the type name in this game, or null if unavailable.
     * @DTA\Data(field="name_icon", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name_icon = null;

    /**
     * The URL of the type symbol icon in this game, or null if unavailable.
     * @DTA\Data(field="symbol_icon", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $symbol_icon = null;

}
