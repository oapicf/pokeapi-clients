
# MoveTargetDetail


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`descriptions` | [Array&lt;MoveTargetDescription&gt;](MoveTargetDescription.md)
`moves` | [Array&lt;MoveSummary&gt;](MoveSummary.md)
`names` | [Array&lt;MoveTargetName&gt;](MoveTargetName.md)

## Example

```typescript
import type { MoveTargetDetail } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "descriptions": null,
  "moves": null,
  "names": null,
} satisfies MoveTargetDetail

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MoveTargetDetail
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


