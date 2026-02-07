<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetailSprites
{
    /**
     * @DTA\Data(field="front_default", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $front_default = null;

}
