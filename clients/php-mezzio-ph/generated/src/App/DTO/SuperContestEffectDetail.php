<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SuperContestEffectDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="appeal")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $appeal;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection190::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection190::class})
     * @var \App\DTO\Collection190|null
     */
    public $flavor_text_entries;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection191::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection191::class})
     * @var \App\DTO\Collection191|null
     */
    public $moves;

}
