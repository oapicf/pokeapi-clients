<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
{
    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

}
