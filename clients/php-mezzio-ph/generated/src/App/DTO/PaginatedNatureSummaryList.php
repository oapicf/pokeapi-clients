<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PaginatedNatureSummaryList
{
    /**
     * @DTA\Data(field="count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $count;

    /**
     * @DTA\Data(field="next", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $next;

    /**
     * @DTA\Data(field="previous", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $previous;

    /**
     * @DTA\Data(field="results", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection122::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection122::class})
     * @var \App\DTO\Collection122|null
     */
    public $results;

}
