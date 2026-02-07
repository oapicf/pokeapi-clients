<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokeathlonStatDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="affecting_natures")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokeathlonStatDetailAffectingNatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokeathlonStatDetailAffectingNatures::class})
     * @var \App\DTO\PokeathlonStatDetailAffectingNatures|null
     */
    public $affecting_natures;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection176::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection176::class})
     * @var \App\DTO\Collection176|null
     */
    public $names;

}
