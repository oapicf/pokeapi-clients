<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokeathlonStatAffectingNatures
{
    /**
     * A list of natures and how they change the referenced Pokéathlon stat.
     * @DTA\Data(field="increase")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $increase = null;

    /**
     * A list of natures and how they change the referenced Pokéathlon stat.
     * @DTA\Data(field="decrease")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $decrease = null;

}
