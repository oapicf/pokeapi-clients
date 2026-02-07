
# MoveDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`accuracy` | number
`effectChance` | number
`pp` | number
`priority` | number
`power` | number
`contestCombos` | [MoveDetailContestCombos](MoveDetailContestCombos.md)
`contestType` | [ContestTypeSummary](ContestTypeSummary.md)
`contestEffect` | [ContestEffectSummary](ContestEffectSummary.md)
`damageClass` | [MoveDamageClassSummary](MoveDamageClassSummary.md)
`effectEntries` | [Array&lt;MoveChangeEffectEntriesInner&gt;](MoveChangeEffectEntriesInner.md)
`effectChanges` | [Array&lt;MoveDetailEffectChangesInner&gt;](MoveDetailEffectChangesInner.md)
`generation` | [GenerationSummary](GenerationSummary.md)
`meta` | [MoveMeta](MoveMeta.md)
`names` | [Array&lt;MoveName&gt;](MoveName.md)
`pastValues` | [Array&lt;MoveChange&gt;](MoveChange.md)
`statChanges` | [Array&lt;MoveDetailStatChangesInner&gt;](MoveDetailStatChangesInner.md)
`superContestEffect` | [SuperContestEffectSummary](SuperContestEffectSummary.md)
`target` | [MoveTargetSummary](MoveTargetSummary.md)
`type` | [TypeSummary](TypeSummary.md)
`machines` | [Array&lt;MoveDetailMachinesInner&gt;](MoveDetailMachinesInner.md)
`flavorTextEntries` | [Array&lt;MoveFlavorText&gt;](MoveFlavorText.md)
`learnedByPokemon` | [Array&lt;AbilityDetailPokemonInnerPokemon&gt;](AbilityDetailPokemonInnerPokemon.md)

## Example

```typescript
import type { MoveDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "accuracy": null,
  "effectChance": null,
  "pp": null,
  "priority": null,
  "power": null,
  "contestCombos": null,
  "contestType": null,
  "contestEffect": null,
  "damageClass": null,
  "effectEntries": null,
  "effectChanges": null,
  "generation": null,
  "meta": null,
  "names": null,
  "pastValues": null,
  "statChanges": null,
  "superContestEffect": null,
  "target": null,
  "type": null,
  "machines": null,
  "flavorTextEntries": null,
  "learnedByPokemon": null,
} satisfies MoveDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MoveDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


