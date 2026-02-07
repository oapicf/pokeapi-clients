<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LanguageDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="official", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $official = null;

    /**
     * @DTA\Data(field="iso639")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":10})
     */
    public ?string $iso639 = null;

    /**
     * @DTA\Data(field="iso3166")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2})
     */
    public ?string $iso3166 = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection77::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection77::class})
     */
    public ?\App\DTO\Collection77 $names = null;

}
