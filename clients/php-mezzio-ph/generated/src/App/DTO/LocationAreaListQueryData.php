<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for locationAreaList
 */
class LocationAreaListQueryData
{
    /**
     * The initial index from which to return the results.
     * @DTA\Data(field="offset", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $offset;

    /**
     * Number of results to return per page.
     * @DTA\Data(field="limit", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $limit;

}
