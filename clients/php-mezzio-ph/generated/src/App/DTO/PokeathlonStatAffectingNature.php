<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokeathlonStatAffectingNature
{
    /**
     * The maximum amount of change to the referenced Pokéathlon stat.
     * @DTA\Data(field="max_change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $max_change;

    /**
     * The nature causing the change.
     * @DTA\Data(field="nature")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NatureSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NatureSummary::class})
     * @var \App\DTO\NatureSummary|null
     */
    public $nature;

}
