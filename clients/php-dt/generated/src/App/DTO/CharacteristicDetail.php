<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CharacteristicDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="gene_modulo")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $gene_modulo = null;

    /**
     * @DTA\Data(field="possible_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection16::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection16::class})
     */
    public ?\App\DTO\Collection16 $possible_values = null;

    /**
     * @DTA\Data(field="highest_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     */
    public ?\App\DTO\StatSummary $highest_stat = null;

    /**
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     */
    public ?\App\DTO\Collection17 $descriptions = null;

}
