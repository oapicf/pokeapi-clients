<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetailCries
{
    /**
     * @DTA\Data(field="latest")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $latest = null;

    /**
     * @DTA\Data(field="legacy")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $legacy = null;

}
