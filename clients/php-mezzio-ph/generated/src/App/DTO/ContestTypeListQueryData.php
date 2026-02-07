<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for contestTypeList
 */
class ContestTypeListQueryData
{
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.
     * @DTA\Data(field="q", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $q;

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
