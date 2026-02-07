<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveDamageClassDetail
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
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection111::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection111::class})
     * @var \App\DTO\Collection111|null
     */
    public $descriptions;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection112::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection112::class})
     * @var \App\DTO\Collection112|null
     */
    public $moves;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection113::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection113::class})
     * @var \App\DTO\Collection113|null
     */
    public $names;

}
