<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonDetailCries
{
    /**
     * @DTA\Data(field="latest")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $latest;

    /**
     * @DTA\Data(field="legacy")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $legacy;

}
