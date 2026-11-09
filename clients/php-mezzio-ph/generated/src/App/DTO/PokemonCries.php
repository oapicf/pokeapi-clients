<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonCries
{
    /**
     * The latest depiction of this Pokémon&#39;s cry.
     * @DTA\Data(field="latest")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $latest;

    /**
     * The legacy depiction of this Pokémon&#39;s cry.
     * @DTA\Data(field="legacy")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $legacy;

}
