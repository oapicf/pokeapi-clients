<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LanguageDetail
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
     * @DTA\Data(field="official", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $official;

    /**
     * @DTA\Data(field="iso639")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":10})
     * @var string|null
     */
    public $iso639;

    /**
     * @DTA\Data(field="iso3166")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2})
     * @var string|null
     */
    public $iso3166;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection77::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection77::class})
     * @var \App\DTO\Collection77|null
     */
    public $names;

}
