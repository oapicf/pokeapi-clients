<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SuperContestEffectDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The level of appeal this super contest effect has.
     * @DTA\Data(field="appeal")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $appeal;

    /**
     * The flavor text of this super contest effect listed in different languages.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection190::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection190::class})
     * @var \App\DTO\Collection190|null
     */
    public $flavor_text_entries;

    /**
     * A list of moves that have the effect when used in super contests.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection191::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection191::class})
     * @var \App\DTO\Collection191|null
     */
    public $moves;

}
