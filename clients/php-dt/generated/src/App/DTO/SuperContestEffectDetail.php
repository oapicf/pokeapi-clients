<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SuperContestEffectDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The level of appeal this super contest effect has.
     * @DTA\Data(field="appeal")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $appeal = null;

    /**
     * The flavor text of this super contest effect listed in different languages.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection190::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection190::class})
     */
    public ?\App\DTO\Collection190 $flavor_text_entries = null;

    /**
     * A list of moves that have the effect when used in super contests.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection191::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection191::class})
     */
    public ?\App\DTO\Collection191 $moves = null;

}
