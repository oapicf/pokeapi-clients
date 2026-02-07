<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EggGroupDetailPokemonSpeciesInner
{
    /**
     * Pokemon species name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The URL to get more information about the species
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

}
