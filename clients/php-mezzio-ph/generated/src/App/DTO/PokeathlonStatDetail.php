<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokeathlonStatDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * A detail of natures which affect this Pokéathlon stat positively or negatively.
     * @DTA\Data(field="affecting_natures")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokeathlonStatAffectingNatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokeathlonStatAffectingNatures::class})
     * @var \App\DTO\PokeathlonStatAffectingNatures|null
     */
    public $affecting_natures;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection179::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection179::class})
     * @var \App\DTO\Collection179|null
     */
    public $names;

}
