<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MachineDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     * @var \App\DTO\ItemSummary|null
     */
    public $item;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     * @var \App\DTO\VersionGroupSummary|null
     */
    public $version_group;

    /**
     * @DTA\Data(field="move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveSummary::class})
     * @var \App\DTO\MoveSummary|null
     */
    public $move;

}
