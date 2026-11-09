<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveMetaAilmentDetail
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
     * A list of moves that cause this ailment.
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection106::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection106::class})
     * @var \App\DTO\Collection106|null
     */
    public $moves;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection107::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection107::class})
     * @var \App\DTO\Collection107|null
     */
    public $names;

}
