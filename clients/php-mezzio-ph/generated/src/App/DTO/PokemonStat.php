<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonStat
{
    /**
     * @DTA\Data(field="base_stat")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $base_stat;

    /**
     * @DTA\Data(field="effort")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $effort;

    /**
     * @DTA\Data(field="stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     * @var \App\DTO\StatSummary|null
     */
    public $stat;

}
