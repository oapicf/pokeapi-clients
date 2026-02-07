#tag Class
Protected Class ItemDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		cost As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		fling_power As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		fling_effect As OpenAPIClient.Models.ItemFlingEffectSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedattributes() As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
	#tag EndProperty


	#tag Property, Flags = &h0
		category As OpenAPIClient.Models.ItemCategorySummary
	#tag EndProperty


	#tag Property, Flags = &h0
		effect_entries() As OpenAPIClient.Models.ItemEffectText
	#tag EndProperty


	#tag Property, Flags = &h0
		flavor_text_entries() As OpenAPIClient.Models.ItemFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		game_indices() As OpenAPIClient.Models.ItemGameIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.ItemName
	#tag EndProperty


	#tag Property, Flags = &h0
		held_by_pokemon() As OpenAPIClient.Models.ItemDetailHeldByPokemonInner
	#tag EndProperty


	#tag Property, Flags = &h0
		sprites As OpenAPIClient.Models.ItemDetailSprites
	#tag EndProperty


	#tag Property, Flags = &h0
		baby_trigger_for As OpenAPIClient.Models.ItemDetailBabyTriggerFor
	#tag EndProperty


	#tag Property, Flags = &h0
		machines() As OpenAPIClient.Models.ItemDetailMachinesInner
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
			Name="cost"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Type="AbilityDetailPokemonInnerPokemon"
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
			Type="ItemDetailHeldByPokemonInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sprites"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemDetailSprites"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="baby_trigger_for"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemDetailBabyTriggerFor"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="machines"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemDetailMachinesInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


