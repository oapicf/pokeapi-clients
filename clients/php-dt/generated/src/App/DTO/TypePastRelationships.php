<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TypePastRelationships
{
    /**
     * The last generation in which the referenced type had the listed damage relations
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * The damage relations the referenced type had up to and including the listed generation
     * @DTA\Data(field="damage_relations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeRelationships::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeRelationships::class})
     */
    public ?\App\DTO\TypeRelationships $damage_relations = null;

}
