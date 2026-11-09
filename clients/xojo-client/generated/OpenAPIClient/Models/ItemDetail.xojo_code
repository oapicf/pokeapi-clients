#tag Class
Protected Class ItemDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The power of the move Fling when used with this item.
		#tag EndNote
		fling_power As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The effect of the move Fling when used with this item.
		#tag EndNote
		fling_effect As OpenAPIClient.Models.ItemFlingEffectSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of attributes this item has.
		#tag EndNote
		Escapedattributes() As OpenAPIClient.Models.ItemAttributeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The category of items this item falls into.
		#tag EndNote
		category As OpenAPIClient.Models.ItemCategorySummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The effect of this ability listed in different languages.
		#tag EndNote
		effect_entries() As OpenAPIClient.Models.ItemEffectText
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The flavor text of this ability listed in different languages.
		#tag EndNote
		flavor_text_entries() As OpenAPIClient.Models.ItemFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of game indices relevent to this item by generation.
		#tag EndNote
		game_indices() As OpenAPIClient.Models.ItemGameIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
		#tag EndNote
		prices() As OpenAPIClient.Models.ItemPrice
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this item listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.ItemName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokémon that might be found in the wild holding this item.
		#tag EndNote
		held_by_pokemon() As OpenAPIClient.Models.PokemonHeldItem
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A set of sprites used to depict this item in the game.
		#tag EndNote
		sprites As OpenAPIClient.Models.ItemSprites
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An evolution chain this item requires to produce a bay during mating.
		#tag EndNote
		baby_trigger_for As OpenAPIClient.Models.EvolutionChainSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of the machines related to this item.
		#tag EndNote
		machines() As OpenAPIClient.Models.ItemMachine
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fling_power"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fling_effect"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemFlingEffectSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedattributes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemAttributeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="category"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemCategorySummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="effect_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemEffectText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemFlavorText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="game_indices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemGameIndex"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemPrice"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="held_by_pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonHeldItem"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sprites"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSprites"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="baby_trigger_for"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionChainSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="machines"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemMachine"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


