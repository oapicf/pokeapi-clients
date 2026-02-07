<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MachineDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSummary::class})
     */
    public ?\App\DTO\ItemSummary $item = null;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionGroupSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionGroupSummary::class})
     */
    public ?\App\DTO\VersionGroupSummary $version_group = null;

    /**
     * @DTA\Data(field="move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveSummary::class})
     */
    public ?\App\DTO\MoveSummary $move = null;

}
