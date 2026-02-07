<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveLearnMethodDetail
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
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection115::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection115::class})
     * @var \App\DTO\Collection115|null
     */
    public $names;

    /**
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection116::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection116::class})
     * @var \App\DTO\Collection116|null
     */
    public $descriptions;

    /**
     * @DTA\Data(field="version_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection117::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection117::class})
     * @var \App\DTO\Collection117|null
     */
    public $version_groups;

}
