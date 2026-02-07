<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CharacteristicDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="gene_modulo")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gene_modulo;

    /**
     * @DTA\Data(field="possible_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection16::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection16::class})
     * @var \App\DTO\Collection16|null
     */
    public $possible_values;

    /**
     * @DTA\Data(field="highest_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     * @var \App\DTO\StatSummary|null
     */
    public $highest_stat;

    /**
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     * @var \App\DTO\Collection17|null
     */
    public $descriptions;

}
