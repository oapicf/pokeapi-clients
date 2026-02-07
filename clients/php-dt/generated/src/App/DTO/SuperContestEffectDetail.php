<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SuperContestEffectDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="appeal")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $appeal = null;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection190::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection190::class})
     */
    public ?\App\DTO\Collection190 $flavor_text_entries = null;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection191::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection191::class})
     */
    public ?\App\DTO\Collection191 $moves = null;

}
