<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonShapeDetailNamesInner
{
    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

}
