<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
 */
class VersionDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection213::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection213::class})
     * @var \App\DTO\Collection213|null
     */
    public $names;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

}
